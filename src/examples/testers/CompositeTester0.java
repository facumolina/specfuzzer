package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test001");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-1));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test002");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet3 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet4 = composite1.children_set();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        boolean boolean7 = composite6.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite6.add_child(composite9);
        boolean boolean11 = composite9.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        composite15.add_child(composite18);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite15.children_set();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet23 = composite22.children_set();
        boolean boolean24 = composite9.is_max((int) (short) 1, 1, compositeSet20, composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test003");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        boolean boolean7 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite4.children_set();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        boolean boolean15 = composite13.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        composite19.add_child(composite22);
        DataStructures.eiffel.Composite[] compositeArray24 = new DataStructures.eiffel.Composite[] { composite19 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet25 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet25, compositeArray24);
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite13.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet25, composite28);
        boolean boolean30 = composite28.invariant();
        composite4.add_child(composite28);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite33.add_child(composite35);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite33.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite33.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite28.add_child(composite33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test004");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite4.add_child(composite22);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        composite25.add_child(composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test005");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        boolean boolean5 = composite4.invariant();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite4.add_child(composite7);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test006");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite6.add_child(composite8);
        boolean boolean10 = composite6.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        boolean boolean19 = composite17.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        composite23.add_child(composite26);
        DataStructures.eiffel.Composite[] compositeArray28 = new DataStructures.eiffel.Composite[] { composite23 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet29 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet29, compositeArray28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        boolean boolean33 = composite17.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet29, composite32);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        boolean boolean40 = composite38.invariant();
        boolean boolean41 = composite38.invariant();
        boolean boolean42 = composite6.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet29, composite38);
        // The following exception was thrown during execution in test generation
        try {
            composite3.add_child(composite38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test007");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((-3));
        composite4.add_child(composite7);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test008");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet9 = composite1.children_set();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(0);
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite11.add_child(composite14);
        boolean boolean16 = composite11.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test009");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite1.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite(0);
        boolean boolean9 = composite8.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        boolean boolean12 = composite11.invariant();
        composite8.add_child(composite11);
        boolean boolean14 = composite8.invariant();
        boolean boolean15 = composite8.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        composite19.add_child(composite22);
        boolean boolean24 = composite22.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet33 = composite28.children_set();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet36 = composite35.children_set();
        boolean boolean37 = composite22.is_max((int) (short) 1, 1, compositeSet33, composite35);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite(0);
        boolean boolean40 = composite39.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        composite39.add_child(composite42);
        boolean boolean45 = composite39.invariant();
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        composite39.add_child(composite47);
        boolean boolean49 = composite39.invariant();
        boolean boolean50 = composite8.is_max(2, 0, compositeSet33, composite39);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test010");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((-3));
        boolean boolean4 = composite3.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        composite3.add_child(composite6);
        boolean boolean8 = composite6.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        composite12.add_child(composite15);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet17 = composite12.children_set();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite19.children_set();
        boolean boolean21 = composite6.is_max((int) (short) 1, 1, compositeSet17, composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test011");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite(0);
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        composite9.add_child(composite12);
        boolean boolean15 = composite9.invariant();
        boolean boolean16 = composite9.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        composite20.add_child(composite23);
        boolean boolean25 = composite23.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        composite29.add_child(composite32);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite29.children_set();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite36.children_set();
        boolean boolean38 = composite23.is_max((int) (short) 1, 1, compositeSet34, composite36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite(0);
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        composite40.add_child(composite43);
        boolean boolean46 = composite40.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite48);
        boolean boolean50 = composite40.invariant();
        boolean boolean51 = composite9.is_max(2, 0, compositeSet34, composite40);
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite53.children_set();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite(0);
        composite53.add_child(composite56);
        boolean boolean58 = composite1.is_max((int) '4', (-1), compositeSet34, composite53);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test012");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
// flaky:         composite4.add_child(composite7);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(0);
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        composite10.add_child(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite7.add_child(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test013");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite4.add_child(composite22);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet24 = composite22.children_set();
        DataStructures.eiffel.Composite composite25 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite22.add_child(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test014");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test015");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(100);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((-3));
        composite4.add_child(composite7);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet9 = composite4.children_set();
        boolean boolean10 = composite4.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test016");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        boolean boolean11 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = null;
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite(0);
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        composite16.add_child(composite19);
        boolean boolean22 = composite16.invariant();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = composite1.is_max(8, (int) (byte) 0, compositeSet14, composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test017");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(100);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        boolean boolean5 = composite4.invariant();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite4.add_child(composite7);
        boolean boolean9 = composite4.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite(0);
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite13.add_child(composite16);
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        boolean boolean26 = composite24.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        DataStructures.eiffel.Composite[] compositeArray35 = new DataStructures.eiffel.Composite[] { composite30 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet36 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet36, compositeArray35);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite24.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite39);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-100));
        boolean boolean43 = composite16.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite42);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        boolean boolean48 = composite47.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        composite47.add_child(composite50);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet52 = composite47.children_set();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        boolean boolean55 = composite54.invariant();
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        composite54.add_child(composite57);
        boolean boolean59 = composite57.invariant();
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        boolean boolean64 = composite63.invariant();
        DataStructures.eiffel.Composite composite66 = new DataStructures.eiffel.Composite((-3));
        composite63.add_child(composite66);
        DataStructures.eiffel.Composite[] compositeArray68 = new DataStructures.eiffel.Composite[] { composite63 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet69 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet69, compositeArray68);
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        boolean boolean73 = composite57.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet69, composite72);
        DataStructures.eiffel.Composite composite75 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite57.add_child(composite75);
        boolean boolean77 = composite42.is_max((int) (short) 100, (int) (short) 100, compositeSet52, composite57);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet78 = composite57.children_set();
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite((-3));
        boolean boolean81 = composite80.invariant();
        DataStructures.eiffel.Composite composite83 = new DataStructures.eiffel.Composite((-3));
        composite80.add_child(composite83);
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite((-3));
        boolean boolean89 = composite88.invariant();
        DataStructures.eiffel.Composite composite91 = new DataStructures.eiffel.Composite((-3));
        composite88.add_child(composite91);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet93 = composite88.children_set();
        DataStructures.eiffel.Composite composite94 = null;
        boolean boolean95 = composite80.is_max((int) (short) 10, (int) (byte) 1, compositeSet93, composite94);
        boolean boolean96 = composite4.is_max((int) (byte) -1, 0, compositeSet78, composite94);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test018");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite5.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite8.children_set();
        boolean boolean12 = composite8.invariant();
        boolean boolean13 = composite1.is_max(3, (int) (byte) 10, compositeSet6, composite8);
        boolean boolean14 = composite8.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        composite16.add_child(composite19);
        boolean boolean21 = composite19.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        composite25.add_child(composite28);
        DataStructures.eiffel.Composite[] compositeArray30 = new DataStructures.eiffel.Composite[] { composite25 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet31 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet31, compositeArray30);
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        boolean boolean35 = composite19.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet31, composite34);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite19.add_child(composite37);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet39 = composite37.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite8.add_child(composite37);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test019");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test020");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        boolean boolean21 = composite19.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite(0);
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite23.add_child(composite26);
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        boolean boolean36 = composite34.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        DataStructures.eiffel.Composite[] compositeArray45 = new DataStructures.eiffel.Composite[] { composite40 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet46 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet46, compositeArray45);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite34.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite49);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-100));
        boolean boolean53 = composite26.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite52);
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite55.children_set();
        composite26.add_child(composite55);
        boolean boolean58 = composite26.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet59 = composite26.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite19.add_child(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test021");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test022");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        composite8.add_child(composite11);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        composite16.add_child(composite19);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite16.children_set();
        DataStructures.eiffel.Composite composite22 = null;
        boolean boolean23 = composite8.is_max((int) (short) 10, (int) (byte) 1, compositeSet21, composite22);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        composite25.add_child(composite28);
        boolean boolean30 = composite28.invariant();
        boolean boolean31 = composite28.invariant();
        boolean boolean32 = composite4.is_max(100, (int) (short) 1, compositeSet21, composite28);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test023");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) 'a');
        composite19.add_child(composite22);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite25.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet27 = composite25.children_set();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite(0);
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        boolean boolean35 = composite34.invariant();
        composite31.add_child(composite34);
        boolean boolean37 = composite31.invariant();
        boolean boolean38 = composite31.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite51.children_set();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet59 = composite58.children_set();
        boolean boolean60 = composite45.is_max((int) (short) 1, 1, compositeSet56, composite58);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite(0);
        boolean boolean63 = composite62.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite65.invariant();
        composite62.add_child(composite65);
        boolean boolean68 = composite62.invariant();
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-3));
        composite62.add_child(composite70);
        boolean boolean72 = composite62.invariant();
        boolean boolean73 = composite31.is_max(2, 0, compositeSet56, composite62);
        DataStructures.eiffel.Composite composite75 = new DataStructures.eiffel.Composite(0);
        boolean boolean76 = composite75.invariant();
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-3));
        boolean boolean79 = composite78.invariant();
        composite75.add_child(composite78);
        boolean boolean81 = composite25.is_max(0, (-10), compositeSet56, composite75);
        composite22.add_child(composite25);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test024");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) 'a');
        composite19.add_child(composite22);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet24 = composite19.children_set();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test025");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-4));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite3.add_child(composite5);
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite3.add_child(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test026");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(0);
        boolean boolean4 = composite3.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite3.add_child(composite6);
        boolean boolean8 = composite3.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite(0);
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite12.add_child(composite15);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        composite20.add_child(composite23);
        boolean boolean25 = composite23.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        composite29.add_child(composite32);
        DataStructures.eiffel.Composite[] compositeArray34 = new DataStructures.eiffel.Composite[] { composite29 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet35 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet35, compositeArray34);
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        boolean boolean39 = composite23.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet35, composite38);
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-100));
        boolean boolean42 = composite15.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet35, composite41);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        boolean boolean47 = composite46.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        composite46.add_child(composite49);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite46.children_set();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        boolean boolean54 = composite53.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        composite53.add_child(composite56);
        boolean boolean58 = composite56.invariant();
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite62.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        composite62.add_child(composite65);
        DataStructures.eiffel.Composite[] compositeArray67 = new DataStructures.eiffel.Composite[] { composite62 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet68 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet68, compositeArray67);
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((-3));
        boolean boolean72 = composite56.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet68, composite71);
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite56.add_child(composite74);
        boolean boolean76 = composite41.is_max((int) (short) 100, (int) (short) 100, compositeSet51, composite56);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet77 = composite56.children_set();
        DataStructures.eiffel.Composite composite79 = new DataStructures.eiffel.Composite((-3));
        boolean boolean80 = composite79.invariant();
        DataStructures.eiffel.Composite composite82 = new DataStructures.eiffel.Composite((-3));
        composite79.add_child(composite82);
        DataStructures.eiffel.Composite composite87 = new DataStructures.eiffel.Composite((-3));
        boolean boolean88 = composite87.invariant();
        DataStructures.eiffel.Composite composite90 = new DataStructures.eiffel.Composite((-3));
        composite87.add_child(composite90);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet92 = composite87.children_set();
        DataStructures.eiffel.Composite composite93 = null;
        boolean boolean94 = composite79.is_max((int) (short) 10, (int) (byte) 1, compositeSet92, composite93);
        boolean boolean95 = composite3.is_max((int) (byte) -1, 0, compositeSet77, composite93);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet96 = composite3.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test027");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-9));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test028");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite(0);
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite12.add_child(composite15);
        boolean boolean17 = composite12.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite(1);
        composite12.add_child(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test029");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        composite7.add_child(composite10);
        boolean boolean13 = composite7.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        composite7.add_child(composite15);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite20.children_set();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-100));
        boolean boolean24 = composite7.is_max(10, (-2), compositeSet21, composite23);
        composite1.add_child(composite23);
        boolean boolean26 = composite1.invariant();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test030");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite10.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite17.children_set();
        boolean boolean19 = composite4.is_max((int) (short) 1, 1, compositeSet15, composite17);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite17.children_set();
        boolean boolean21 = composite17.invariant();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test031");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-6));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test032");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite4.children_set();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite40.children_set();
// flaky:         composite4.add_child(composite40);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite4.children_set();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test033");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet3 = composite1.children_set();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        composite7.add_child(composite10);
        boolean boolean13 = composite7.invariant();
        boolean boolean14 = composite7.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        boolean boolean23 = composite21.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet32 = composite27.children_set();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet35 = composite34.children_set();
        boolean boolean36 = composite21.is_max((int) (short) 1, 1, compositeSet32, composite34);
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite(0);
        boolean boolean39 = composite38.invariant();
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        composite38.add_child(composite41);
        boolean boolean44 = composite38.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite38.add_child(composite46);
        boolean boolean48 = composite38.invariant();
        boolean boolean49 = composite7.is_max(2, 0, compositeSet32, composite38);
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite(0);
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        boolean boolean55 = composite54.invariant();
        composite51.add_child(composite54);
        boolean boolean57 = composite1.is_max(0, (-10), compositeSet32, composite51);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite(0);
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        composite61.add_child(composite64);
        boolean boolean67 = composite61.invariant();
        boolean boolean68 = composite61.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet69 = composite61.children_set();
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((-100));
        boolean boolean72 = composite51.is_max(9, (-4), compositeSet69, composite71);
        boolean boolean73 = composite71.invariant();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test034");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(0);
        boolean boolean4 = composite3.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        boolean boolean7 = composite6.invariant();
        composite3.add_child(composite6);
        boolean boolean9 = composite3.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        composite3.add_child(composite11);
        boolean boolean13 = composite3.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test035");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite(0);
        boolean boolean9 = composite8.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        boolean boolean12 = composite11.invariant();
        composite8.add_child(composite11);
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite17.add_child(composite19);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite17.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite17.children_set();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        boolean boolean27 = composite26.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet28 = composite26.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet29 = composite26.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet30 = composite26.children_set();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite(0);
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite32.add_child(composite35);
        boolean boolean37 = composite17.is_max((-5), 0, compositeSet30, composite35);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-7));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite39.children_set();
        boolean boolean41 = composite8.is_max((int) (byte) 1, (-4), compositeSet30, composite39);
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test036");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet32 = composite4.children_set();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test037");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        composite13.add_child(composite16);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite13.children_set();
        DataStructures.eiffel.Composite composite19 = null;
        boolean boolean20 = composite5.is_max((int) (short) 10, (int) (byte) 1, compositeSet18, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        boolean boolean28 = composite25.invariant();
        boolean boolean29 = composite1.is_max(100, (int) (short) 1, compositeSet18, composite25);
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite(0);
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite31.add_child(composite34);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite39.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        composite39.add_child(composite42);
        boolean boolean44 = composite42.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        boolean boolean49 = composite48.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        composite48.add_child(composite51);
        DataStructures.eiffel.Composite[] compositeArray53 = new DataStructures.eiffel.Composite[] { composite48 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet54 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet54, compositeArray53);
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        boolean boolean58 = composite42.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet54, composite57);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-100));
        boolean boolean61 = composite34.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet54, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet64 = composite63.children_set();
        composite34.add_child(composite63);
        boolean boolean66 = composite34.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite34.children_set();
        boolean boolean68 = composite34.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite25.add_child(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test038");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        boolean boolean6 = composite1.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(0);
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        boolean boolean23 = composite21.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        DataStructures.eiffel.Composite[] compositeArray32 = new DataStructures.eiffel.Composite[] { composite27 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet33 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet33, compositeArray32);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        boolean boolean37 = composite21.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet33, composite36);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-100));
        boolean boolean40 = composite13.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet33, composite39);
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        boolean boolean45 = composite44.invariant();
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        composite44.add_child(composite47);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet49 = composite44.children_set();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        boolean boolean56 = composite54.invariant();
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite60.invariant();
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        composite60.add_child(composite63);
        DataStructures.eiffel.Composite[] compositeArray65 = new DataStructures.eiffel.Composite[] { composite60 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet66 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet66, compositeArray65);
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((-3));
        boolean boolean70 = composite54.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet66, composite69);
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite54.add_child(composite72);
        boolean boolean74 = composite39.is_max((int) (short) 100, (int) (short) 100, compositeSet49, composite54);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet75 = composite54.children_set();
        DataStructures.eiffel.Composite composite77 = new DataStructures.eiffel.Composite((-3));
        boolean boolean78 = composite77.invariant();
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite((-3));
        composite77.add_child(composite80);
        DataStructures.eiffel.Composite composite85 = new DataStructures.eiffel.Composite((-3));
        boolean boolean86 = composite85.invariant();
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite((-3));
        composite85.add_child(composite88);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet90 = composite85.children_set();
        DataStructures.eiffel.Composite composite91 = null;
        boolean boolean92 = composite77.is_max((int) (short) 10, (int) (byte) 1, compositeSet90, composite91);
        boolean boolean93 = composite1.is_max((int) (byte) -1, 0, compositeSet75, composite91);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet94 = composite1.children_set();
        boolean boolean95 = composite1.invariant();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test039");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(0);
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite5.add_child(composite8);
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        composite13.add_child(composite16);
        boolean boolean18 = composite16.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        DataStructures.eiffel.Composite[] compositeArray27 = new DataStructures.eiffel.Composite[] { composite22 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet28 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet28, compositeArray27);
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite16.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet28, composite31);
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-100));
        boolean boolean35 = composite8.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet28, composite34);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite39.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        composite39.add_child(composite42);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite39.children_set();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        boolean boolean47 = composite46.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        composite46.add_child(composite49);
        boolean boolean51 = composite49.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        boolean boolean56 = composite55.invariant();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        composite55.add_child(composite58);
        DataStructures.eiffel.Composite[] compositeArray60 = new DataStructures.eiffel.Composite[] { composite55 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet61 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet61, compositeArray60);
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite49.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet61, composite64);
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite49.add_child(composite67);
        boolean boolean69 = composite34.is_max((int) (short) 100, (int) (short) 100, compositeSet44, composite49);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet70 = composite34.children_set();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        boolean boolean73 = composite72.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet74 = composite72.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet75 = composite72.children_set();
        boolean boolean76 = composite72.invariant();
        boolean boolean77 = composite1.is_max((-4), (-4), compositeSet70, composite72);
        DataStructures.eiffel.Composite composite78 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite72.add_child(composite78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test040");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite7.add_child(composite10);
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        composite15.add_child(composite18);
        boolean boolean20 = composite18.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        boolean boolean25 = composite24.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        composite24.add_child(composite27);
        DataStructures.eiffel.Composite[] compositeArray29 = new DataStructures.eiffel.Composite[] { composite24 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet30 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet30, compositeArray29);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite18.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet30, composite33);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-100));
        boolean boolean37 = composite10.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet30, composite36);
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        composite41.add_child(composite44);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet46 = composite41.children_set();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        boolean boolean49 = composite48.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        composite48.add_child(composite51);
        boolean boolean53 = composite51.invariant();
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        boolean boolean58 = composite57.invariant();
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        composite57.add_child(composite60);
        DataStructures.eiffel.Composite[] compositeArray62 = new DataStructures.eiffel.Composite[] { composite57 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet63 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet63, compositeArray62);
        DataStructures.eiffel.Composite composite66 = new DataStructures.eiffel.Composite((-3));
        boolean boolean67 = composite51.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet63, composite66);
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite51.add_child(composite69);
        boolean boolean71 = composite36.is_max((int) (short) 100, (int) (short) 100, compositeSet46, composite51);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet72 = composite51.children_set();
        boolean boolean73 = composite51.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test041");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        composite41.add_child(composite44);
        boolean boolean46 = composite44.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        boolean boolean51 = composite50.invariant();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        composite50.add_child(composite53);
        DataStructures.eiffel.Composite[] compositeArray55 = new DataStructures.eiffel.Composite[] { composite50 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet56 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet56, compositeArray55);
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        boolean boolean60 = composite44.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet56, composite59);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((int) (short) 1);
        boolean boolean63 = composite4.is_max(7, (-3), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet56, composite62);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet64 = composite62.children_set();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test042");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite7.add_child(composite9);
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite7.add_child(composite12);
        boolean boolean14 = composite7.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test043");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(0);
        boolean boolean4 = composite3.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite3.add_child(composite6);
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        composite11.add_child(composite14);
        boolean boolean16 = composite14.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        composite20.add_child(composite23);
        DataStructures.eiffel.Composite[] compositeArray25 = new DataStructures.eiffel.Composite[] { composite20 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet26 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet26, compositeArray25);
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite14.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet26, composite29);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-100));
        boolean boolean33 = composite6.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet26, composite32);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet36 = composite35.children_set();
        composite6.add_child(composite35);
        boolean boolean38 = composite6.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet39 = composite6.children_set();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        DataStructures.eiffel.Composite[] compositeArray57 = new DataStructures.eiffel.Composite[] { composite52 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet58 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet58, compositeArray57);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite46.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite61);
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((int) (short) 1);
        boolean boolean65 = composite6.is_max(7, (-3), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite64);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test044");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-8));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test045");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet7 = composite1.children_set();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test046");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite6.add_child(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite3.add_child(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test047");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test048");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite35.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite35.children_set();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        boolean boolean45 = composite43.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        composite49.add_child(composite52);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite49.children_set();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet57 = composite56.children_set();
        boolean boolean58 = composite43.is_max((int) (short) 1, 1, compositeSet54, composite56);
        boolean boolean59 = composite4.is_max(6, (int) '4', compositeSet38, composite43);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 0);
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        boolean boolean68 = composite67.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet69 = composite67.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet70 = composite67.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet71 = composite67.children_set();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite(0);
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        boolean boolean77 = composite76.invariant();
        composite73.add_child(composite76);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet79 = composite73.children_set();
        boolean boolean80 = composite63.is_max((-4), 1, compositeSet71, composite73);
        DataStructures.eiffel.Composite composite82 = new DataStructures.eiffel.Composite((-3));
        boolean boolean83 = composite82.invariant();
        DataStructures.eiffel.Composite composite85 = new DataStructures.eiffel.Composite((-3));
        composite82.add_child(composite85);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet87 = composite82.children_set();
        boolean boolean88 = composite82.invariant();
        boolean boolean89 = composite43.is_max((-100), (int) (short) 0, compositeSet71, composite82);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test049");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite35.add_child(composite37);
        boolean boolean39 = composite35.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        DataStructures.eiffel.Composite[] compositeArray57 = new DataStructures.eiffel.Composite[] { composite52 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet58 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet58, compositeArray57);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite46.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite61);
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        boolean boolean69 = composite67.invariant();
        boolean boolean70 = composite67.invariant();
        boolean boolean71 = composite35.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite67);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite76);
        boolean boolean78 = composite76.invariant();
        boolean boolean79 = composite76.invariant();
        boolean boolean80 = composite30.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite76);
        boolean boolean81 = composite76.invariant();
        boolean boolean82 = composite76.invariant();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test050");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite14.add_child(composite16);
        boolean boolean18 = composite14.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        DataStructures.eiffel.Composite[] compositeArray36 = new DataStructures.eiffel.Composite[] { composite31 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet37 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet37, compositeArray36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite25.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        boolean boolean49 = composite46.invariant();
        boolean boolean50 = composite14.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite46);
        boolean boolean51 = composite1.is_max((-9), 1, compositeSet12, composite14);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet52 = composite1.children_set();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test051");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(100);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet4 = composite3.children_set();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(0);
        composite3.add_child(composite6);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite6.children_set();
        boolean boolean9 = composite6.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test052");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite4.children_set();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite40.children_set();
// flaky:         composite4.add_child(composite40);
        boolean boolean43 = composite40.invariant();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test053");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(0);
        boolean boolean7 = composite6.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite6.add_child(composite9);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        boolean boolean19 = composite17.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        composite23.add_child(composite26);
        DataStructures.eiffel.Composite[] compositeArray28 = new DataStructures.eiffel.Composite[] { composite23 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet29 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet29, compositeArray28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        boolean boolean33 = composite17.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet29, composite32);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-100));
        boolean boolean36 = composite9.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet29, composite35);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet45 = composite40.children_set();
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        boolean boolean48 = composite47.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        composite47.add_child(composite50);
        boolean boolean52 = composite50.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        boolean boolean57 = composite56.invariant();
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        composite56.add_child(composite59);
        DataStructures.eiffel.Composite[] compositeArray61 = new DataStructures.eiffel.Composite[] { composite56 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet62 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet62, compositeArray61);
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite50.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet62, composite65);
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite50.add_child(composite68);
        boolean boolean70 = composite35.is_max((int) (short) 100, (int) (short) 100, compositeSet45, composite50);
        boolean boolean71 = composite50.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test054");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        boolean boolean3 = composite1.invariant();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test055");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test056");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (byte) 10);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        boolean boolean5 = composite4.invariant();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite4.add_child(composite7);
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        composite12.add_child(composite15);
        boolean boolean17 = composite15.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        DataStructures.eiffel.Composite[] compositeArray26 = new DataStructures.eiffel.Composite[] { composite21 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet27 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet27, compositeArray26);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite15.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet27, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-100));
        boolean boolean34 = composite7.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet27, composite33);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite36.children_set();
        composite7.add_child(composite36);
        boolean boolean39 = composite7.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite7.children_set();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        boolean boolean45 = composite44.invariant();
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        composite44.add_child(composite47);
        boolean boolean49 = composite47.invariant();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        boolean boolean54 = composite53.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        composite53.add_child(composite56);
        DataStructures.eiffel.Composite[] compositeArray58 = new DataStructures.eiffel.Composite[] { composite53 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet59 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet59, compositeArray58);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite47.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet59, composite62);
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((int) (short) 1);
        boolean boolean66 = composite7.is_max(7, (-3), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet59, composite65);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test057");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(100);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((-3));
        boolean boolean4 = composite3.invariant();
        boolean boolean5 = composite3.invariant();
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        composite8.add_child(composite11);
        boolean boolean13 = composite11.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        composite17.add_child(composite20);
        DataStructures.eiffel.Composite[] compositeArray22 = new DataStructures.eiffel.Composite[] { composite17 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet23 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet23, compositeArray22);
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        boolean boolean27 = composite11.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet23, composite26);
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((int) 'a');
        composite26.add_child(composite29);
        // The following exception was thrown during execution in test generation
        try {
            composite3.add_child(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test058");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) ' ');
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((-3));
        composite4.add_child(composite7);
        boolean boolean9 = composite7.invariant();
        boolean boolean10 = composite7.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite7.children_set();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        composite13.add_child(composite16);
        boolean boolean18 = composite16.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        DataStructures.eiffel.Composite[] compositeArray27 = new DataStructures.eiffel.Composite[] { composite22 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet28 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet28, compositeArray27);
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite16.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet28, composite31);
        boolean boolean33 = composite31.invariant();
        composite7.add_child(composite31);
        boolean boolean35 = composite7.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test059");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        boolean boolean2 = composite1.invariant();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test060");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite14.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-100));
        boolean boolean18 = composite1.is_max(10, (-2), compositeSet15, composite17);
        boolean boolean19 = composite17.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite17.children_set();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test061");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        composite12.add_child(composite15);
        boolean boolean17 = composite15.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite21.children_set();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet29 = composite28.children_set();
        boolean boolean30 = composite15.is_max((int) (short) 1, 1, compositeSet26, composite28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite(0);
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        composite32.add_child(composite35);
        boolean boolean38 = composite32.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite32.add_child(composite40);
        boolean boolean42 = composite32.invariant();
        boolean boolean43 = composite1.is_max(2, 0, compositeSet26, composite32);
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        boolean boolean46 = composite45.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        composite45.add_child(composite48);
        boolean boolean50 = composite48.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        boolean boolean55 = composite54.invariant();
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        composite54.add_child(composite57);
        DataStructures.eiffel.Composite[] compositeArray59 = new DataStructures.eiffel.Composite[] { composite54 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet60 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet60, compositeArray59);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        boolean boolean64 = composite48.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet60, composite63);
        boolean boolean65 = composite63.invariant();
        composite32.add_child(composite63);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite63.children_set();
        boolean boolean68 = composite63.invariant();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test062");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite14.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-100));
        boolean boolean18 = composite1.is_max(10, (-2), compositeSet15, composite17);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite(0);
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite20.add_child(composite23);
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        boolean boolean33 = composite31.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite37.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite37.add_child(composite40);
        DataStructures.eiffel.Composite[] compositeArray42 = new DataStructures.eiffel.Composite[] { composite37 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet43 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet43, compositeArray42);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        boolean boolean47 = composite31.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet43, composite46);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-100));
        boolean boolean50 = composite23.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet43, composite49);
        composite1.add_child(composite49);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet52 = composite1.children_set();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test063");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite4.children_set();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite40.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite40.children_set();
        boolean boolean44 = composite40.invariant();
        composite4.add_child(composite40);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet46 = composite4.children_set();
        boolean boolean47 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet50 = null;
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite(0);
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite52.add_child(composite55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = composite4.is_max(100, (-5), compositeSet50, composite52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test064");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) 'a');
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(0);
        boolean boolean7 = composite6.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        composite6.add_child(composite9);
        boolean boolean12 = composite6.invariant();
        boolean boolean13 = composite6.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite6.children_set();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite(0);
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        composite16.add_child(composite19);
        boolean boolean22 = composite16.invariant();
        boolean boolean23 = composite16.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        boolean boolean32 = composite30.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        composite36.add_child(composite39);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite36.children_set();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite43.children_set();
        boolean boolean45 = composite30.is_max((int) (short) 1, 1, compositeSet41, composite43);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite(0);
        boolean boolean48 = composite47.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        boolean boolean51 = composite50.invariant();
        composite47.add_child(composite50);
        boolean boolean53 = composite47.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite47.add_child(composite55);
        boolean boolean57 = composite47.invariant();
        boolean boolean58 = composite16.is_max(2, 0, compositeSet41, composite47);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite60.invariant();
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        composite60.add_child(composite63);
        boolean boolean65 = composite63.invariant();
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((-3));
        boolean boolean70 = composite69.invariant();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        composite69.add_child(composite72);
        DataStructures.eiffel.Composite[] compositeArray74 = new DataStructures.eiffel.Composite[] { composite69 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet75 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet75, compositeArray74);
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-3));
        boolean boolean79 = composite63.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet75, composite78);
        boolean boolean80 = composite78.invariant();
        composite47.add_child(composite78);
        boolean boolean82 = composite1.is_max((-9), (-5), compositeSet14, composite78);
        DataStructures.eiffel.Composite composite84 = new DataStructures.eiffel.Composite((int) ' ');
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite((-3));
        boolean boolean89 = composite88.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet90 = composite88.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet91 = composite88.children_set();
        DataStructures.eiffel.Composite composite93 = new DataStructures.eiffel.Composite((-3));
        boolean boolean94 = composite93.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet95 = composite93.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet96 = composite93.children_set();
        boolean boolean97 = composite84.is_max((int) (byte) 1, (-5), compositeSet91, composite93);
        composite1.add_child(composite93);
        boolean boolean99 = composite1.invariant();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test065");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite9.children_set();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite(0);
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite13.add_child(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite9.add_child(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test066");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        boolean boolean11 = composite1.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite(0);
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite13.add_child(composite16);
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        boolean boolean26 = composite24.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        DataStructures.eiffel.Composite[] compositeArray35 = new DataStructures.eiffel.Composite[] { composite30 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet36 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet36, compositeArray35);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite24.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite39);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-100));
        boolean boolean43 = composite16.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite42);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite47.add_child(composite49);
        boolean boolean51 = composite47.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        boolean boolean56 = composite55.invariant();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        composite55.add_child(composite58);
        boolean boolean60 = composite58.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        DataStructures.eiffel.Composite[] compositeArray69 = new DataStructures.eiffel.Composite[] { composite64 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet70 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet70, compositeArray69);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite58.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite73);
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        boolean boolean77 = composite76.invariant();
        DataStructures.eiffel.Composite composite79 = new DataStructures.eiffel.Composite((-3));
        composite76.add_child(composite79);
        boolean boolean81 = composite79.invariant();
        boolean boolean82 = composite79.invariant();
        boolean boolean83 = composite47.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite79);
        DataStructures.eiffel.Composite composite85 = new DataStructures.eiffel.Composite((-3));
        boolean boolean86 = composite85.invariant();
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite((-3));
        composite85.add_child(composite88);
        boolean boolean90 = composite88.invariant();
        boolean boolean91 = composite88.invariant();
        boolean boolean92 = composite42.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite88);
        composite1.add_child(composite42);
        boolean boolean94 = composite42.invariant();
        boolean boolean95 = composite42.invariant();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test067");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-100));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) ' ');
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite7.add_child(composite9);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite7.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite7.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite14.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite(0);
        composite14.add_child(composite17);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite(0);
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        composite20.add_child(composite23);
        boolean boolean26 = composite20.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        composite20.add_child(composite28);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-100));
        boolean boolean37 = composite20.is_max(10, (-2), compositeSet34, composite36);
        composite14.add_child(composite36);
        boolean boolean39 = composite3.is_max(0, (-100), compositeSet12, composite14);
        composite1.add_child(composite3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test068");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        boolean boolean2 = composite1.invariant();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test069");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((-3));
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        composite7.add_child(composite10);
        boolean boolean12 = composite10.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test070");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(0);
        boolean boolean4 = composite3.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite3.add_child(composite6);
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        composite11.add_child(composite14);
        boolean boolean16 = composite14.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        composite20.add_child(composite23);
        DataStructures.eiffel.Composite[] compositeArray25 = new DataStructures.eiffel.Composite[] { composite20 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet26 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet26, compositeArray25);
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite14.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet26, composite29);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-100));
        boolean boolean33 = composite6.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet26, composite32);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test071");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet3 = composite1.children_set();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test072");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(0);
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite11.add_child(composite14);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        composite19.add_child(composite22);
        boolean boolean24 = composite22.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        DataStructures.eiffel.Composite[] compositeArray33 = new DataStructures.eiffel.Composite[] { composite28 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet34 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet34, compositeArray33);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite22.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet34, composite37);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-100));
        boolean boolean41 = composite14.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet34, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite43.children_set();
        composite14.add_child(composite43);
        boolean boolean46 = composite14.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet47 = composite14.children_set();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite49.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet52 = composite49.children_set();
        boolean boolean53 = composite49.invariant();
        boolean boolean54 = composite49.invariant();
        boolean boolean55 = composite1.is_max((-2), (int) '4', compositeSet47, composite49);
        boolean boolean56 = composite1.invariant();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test073");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite14.add_child(composite16);
        boolean boolean18 = composite14.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        DataStructures.eiffel.Composite[] compositeArray36 = new DataStructures.eiffel.Composite[] { composite31 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet37 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet37, compositeArray36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite25.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        boolean boolean49 = composite46.invariant();
        boolean boolean50 = composite14.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite46);
        boolean boolean51 = composite1.is_max((-9), 1, compositeSet12, composite14);
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite(9);
        composite1.add_child(composite53);
        boolean boolean55 = composite1.invariant();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test074");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite5.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite8.children_set();
        boolean boolean12 = composite8.invariant();
        boolean boolean13 = composite1.is_max(3, (int) (byte) 10, compositeSet6, composite8);
        boolean boolean14 = composite1.invariant();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test075");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        boolean boolean6 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet7 = composite1.children_set();
        boolean boolean8 = composite1.invariant();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test076");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite9.children_set();
        DataStructures.eiffel.Composite composite15 = null;
        boolean boolean16 = composite1.is_max((int) (short) 10, (int) (byte) 1, compositeSet14, composite15);
        boolean boolean17 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite1.children_set();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test077");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite1.children_set();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((-3));
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        composite7.add_child(composite10);
        boolean boolean12 = composite10.invariant();
        boolean boolean13 = composite10.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite10.children_set();
        boolean boolean15 = composite10.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet16 = composite10.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test078");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        boolean boolean19 = composite17.invariant();
        boolean boolean20 = composite17.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite17.children_set();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite23.add_child(composite25);
        boolean boolean27 = composite23.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        boolean boolean36 = composite34.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        DataStructures.eiffel.Composite[] compositeArray45 = new DataStructures.eiffel.Composite[] { composite40 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet46 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet46, compositeArray45);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite34.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite49);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        boolean boolean57 = composite55.invariant();
        boolean boolean58 = composite55.invariant();
        boolean boolean59 = composite23.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite55);
        boolean boolean60 = composite10.is_max((-9), 1, compositeSet21, composite23);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite(100);
        boolean boolean63 = composite4.is_max((int) (short) 0, (int) (byte) 0, compositeSet21, composite62);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet64 = composite62.children_set();
        boolean boolean65 = composite62.invariant();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test079");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet4 = composite3.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite3.children_set();
        composite1.add_child(composite3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test080");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        boolean boolean12 = composite10.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite10.children_set();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        composite15.add_child(composite18);
        boolean boolean20 = composite18.invariant();
        boolean boolean21 = composite18.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite18.children_set();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        boolean boolean25 = composite24.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        composite24.add_child(composite27);
        boolean boolean29 = composite27.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite33.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        composite33.add_child(composite36);
        DataStructures.eiffel.Composite[] compositeArray38 = new DataStructures.eiffel.Composite[] { composite33 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet39 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet39, compositeArray38);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite27.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet39, composite42);
        boolean boolean44 = composite42.invariant();
        composite18.add_child(composite42);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet46 = composite18.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet47 = composite18.children_set();
        boolean boolean48 = composite1.is_max(6, (-1), compositeSet13, composite18);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test081");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(100);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((-3));
        boolean boolean4 = composite3.invariant();
        boolean boolean5 = composite3.invariant();
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(0);
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        composite10.add_child(composite13);
        boolean boolean16 = composite10.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite18);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite18.children_set();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet35 = composite30.children_set();
        DataStructures.eiffel.Composite composite36 = null;
        boolean boolean37 = composite22.is_max((int) (short) 10, (int) (byte) 1, compositeSet35, composite36);
        boolean boolean38 = composite22.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet39 = composite22.children_set();
        boolean boolean40 = composite1.is_max(1, (int) (byte) 1, compositeSet20, composite22);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite1.children_set();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test082");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        boolean boolean7 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite4.children_set();
        boolean boolean9 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite4.children_set();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite(0);
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite12.add_child(composite15);
        boolean boolean17 = composite12.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite12.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test083");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(100);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet4 = composite3.children_set();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(0);
        composite3.add_child(composite6);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite(0);
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        composite9.add_child(composite12);
        boolean boolean15 = composite9.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite17);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet23 = composite22.children_set();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-100));
        boolean boolean26 = composite9.is_max(10, (-2), compositeSet23, composite25);
        composite3.add_child(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test084");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite(0);
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        composite22.add_child(composite25);
        boolean boolean28 = composite22.invariant();
        boolean boolean29 = composite22.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite33.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        composite33.add_child(composite36);
        boolean boolean38 = composite36.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet47 = composite42.children_set();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet50 = composite49.children_set();
        boolean boolean51 = composite36.is_max((int) (short) 1, 1, compositeSet47, composite49);
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite(0);
        boolean boolean54 = composite53.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        boolean boolean57 = composite56.invariant();
        composite53.add_child(composite56);
        boolean boolean59 = composite53.invariant();
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        composite53.add_child(composite61);
        boolean boolean63 = composite53.invariant();
        boolean boolean64 = composite22.is_max(2, 0, compositeSet47, composite53);
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test085");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet3 = composite1.children_set();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        composite7.add_child(composite10);
        boolean boolean13 = composite7.invariant();
        boolean boolean14 = composite7.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        boolean boolean23 = composite21.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet32 = composite27.children_set();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet35 = composite34.children_set();
        boolean boolean36 = composite21.is_max((int) (short) 1, 1, compositeSet32, composite34);
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite(0);
        boolean boolean39 = composite38.invariant();
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        composite38.add_child(composite41);
        boolean boolean44 = composite38.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite38.add_child(composite46);
        boolean boolean48 = composite38.invariant();
        boolean boolean49 = composite7.is_max(2, 0, compositeSet32, composite38);
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite(0);
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        boolean boolean55 = composite54.invariant();
        composite51.add_child(composite54);
        boolean boolean57 = composite1.is_max(0, (-10), compositeSet32, composite51);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite(0);
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        composite61.add_child(composite64);
        boolean boolean67 = composite61.invariant();
        boolean boolean68 = composite61.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet69 = composite61.children_set();
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((-100));
        boolean boolean72 = composite51.is_max(9, (-4), compositeSet69, composite71);
        boolean boolean73 = composite51.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet74 = composite51.children_set();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test086");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        composite41.add_child(composite44);
        boolean boolean46 = composite44.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        boolean boolean51 = composite50.invariant();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        composite50.add_child(composite53);
        DataStructures.eiffel.Composite[] compositeArray55 = new DataStructures.eiffel.Composite[] { composite50 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet56 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet56, compositeArray55);
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        boolean boolean60 = composite44.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet56, composite59);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((int) (short) 1);
        boolean boolean63 = composite4.is_max(7, (-3), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet56, composite62);
        boolean boolean64 = composite62.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet65 = composite62.children_set();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test087");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        composite13.add_child(composite16);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite13.children_set();
        DataStructures.eiffel.Composite composite19 = null;
        boolean boolean20 = composite5.is_max((int) (short) 10, (int) (byte) 1, compositeSet18, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        boolean boolean28 = composite25.invariant();
        boolean boolean29 = composite1.is_max(100, (int) (short) 1, compositeSet18, composite25);
        boolean boolean30 = composite1.invariant();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test088");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        boolean boolean66 = composite45.invariant();
        boolean boolean67 = composite45.invariant();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test089");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite30.children_set();
        boolean boolean67 = composite30.invariant();
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((int) 'a');
        boolean boolean70 = composite69.invariant();
        composite30.add_child(composite69);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite75 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite73.add_child(composite75);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet77 = composite73.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet78 = composite73.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite30.add_child(composite73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test090");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        boolean boolean6 = composite1.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite(1);
        composite1.add_child(composite8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite1.children_set();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test091");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite12.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite(0);
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite17.add_child(composite20);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        composite25.add_child(composite28);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite33.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        composite33.add_child(composite36);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite33.children_set();
        DataStructures.eiffel.Composite composite39 = null;
        boolean boolean40 = composite25.is_max((int) (short) 10, (int) (byte) 1, compositeSet38, composite39);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite(0);
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        boolean boolean46 = composite45.invariant();
        composite42.add_child(composite45);
        boolean boolean48 = composite20.is_max((int) '4', (int) '#', compositeSet38, composite45);
        boolean boolean49 = composite1.is_max((int) (short) 0, (int) (short) 100, compositeSet15, composite20);
        boolean boolean50 = composite20.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite(100);
        boolean boolean53 = composite52.invariant();
// flaky:         composite20.add_child(composite52);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test092");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
// flaky:         composite4.add_child(composite7);
        boolean boolean9 = composite7.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(0);
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite(0);
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite15.add_child(composite18);
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        composite23.add_child(composite26);
        boolean boolean28 = composite26.invariant();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        composite32.add_child(composite35);
        DataStructures.eiffel.Composite[] compositeArray37 = new DataStructures.eiffel.Composite[] { composite32 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet38 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet38, compositeArray37);
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite26.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet38, composite41);
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-100));
        boolean boolean45 = composite18.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet38, composite44);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        composite49.add_child(composite52);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite49.children_set();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        boolean boolean57 = composite56.invariant();
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        composite56.add_child(composite59);
        boolean boolean61 = composite59.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite65.invariant();
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((-3));
        composite65.add_child(composite68);
        DataStructures.eiffel.Composite[] compositeArray70 = new DataStructures.eiffel.Composite[] { composite65 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet71 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet71, compositeArray70);
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((-3));
        boolean boolean75 = composite59.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet71, composite74);
        DataStructures.eiffel.Composite composite77 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite59.add_child(composite77);
        boolean boolean79 = composite44.is_max((int) (short) 100, (int) (short) 100, compositeSet54, composite59);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet80 = composite44.children_set();
        DataStructures.eiffel.Composite composite82 = new DataStructures.eiffel.Composite((-3));
        boolean boolean83 = composite82.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet84 = composite82.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet85 = composite82.children_set();
        boolean boolean86 = composite82.invariant();
        boolean boolean87 = composite11.is_max((-4), (-4), compositeSet80, composite82);
        composite7.add_child(composite11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test093");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        boolean boolean7 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite4.children_set();
        boolean boolean9 = composite4.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite11.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite11.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite(0);
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        composite17.add_child(composite20);
        boolean boolean23 = composite17.invariant();
        boolean boolean24 = composite17.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        boolean boolean33 = composite31.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite37.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite37.add_child(composite40);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite37.children_set();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet45 = composite44.children_set();
        boolean boolean46 = composite31.is_max((int) (short) 1, 1, compositeSet42, composite44);
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite(0);
        boolean boolean49 = composite48.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        composite48.add_child(composite51);
        boolean boolean54 = composite48.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        composite48.add_child(composite56);
        boolean boolean58 = composite48.invariant();
        boolean boolean59 = composite17.is_max(2, 0, compositeSet42, composite48);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite(0);
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        composite61.add_child(composite64);
        boolean boolean67 = composite11.is_max(0, (-10), compositeSet42, composite61);
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite(0);
        boolean boolean72 = composite71.invariant();
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((-3));
        boolean boolean75 = composite74.invariant();
        composite71.add_child(composite74);
        boolean boolean77 = composite71.invariant();
        boolean boolean78 = composite71.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet79 = composite71.children_set();
        DataStructures.eiffel.Composite composite81 = new DataStructures.eiffel.Composite((-100));
        boolean boolean82 = composite61.is_max(9, (-4), compositeSet79, composite81);
        boolean boolean83 = composite61.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test094");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite30.children_set();
        boolean boolean67 = composite30.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet68 = composite30.children_set();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test095");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        boolean boolean11 = composite1.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite(0);
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite13.add_child(composite16);
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        boolean boolean26 = composite24.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        DataStructures.eiffel.Composite[] compositeArray35 = new DataStructures.eiffel.Composite[] { composite30 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet36 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet36, compositeArray35);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite24.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite39);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-100));
        boolean boolean43 = composite16.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite42);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite47.add_child(composite49);
        boolean boolean51 = composite47.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        boolean boolean56 = composite55.invariant();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        composite55.add_child(composite58);
        boolean boolean60 = composite58.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        DataStructures.eiffel.Composite[] compositeArray69 = new DataStructures.eiffel.Composite[] { composite64 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet70 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet70, compositeArray69);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite58.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite73);
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        boolean boolean77 = composite76.invariant();
        DataStructures.eiffel.Composite composite79 = new DataStructures.eiffel.Composite((-3));
        composite76.add_child(composite79);
        boolean boolean81 = composite79.invariant();
        boolean boolean82 = composite79.invariant();
        boolean boolean83 = composite47.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite79);
        DataStructures.eiffel.Composite composite85 = new DataStructures.eiffel.Composite((-3));
        boolean boolean86 = composite85.invariant();
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite((-3));
        composite85.add_child(composite88);
        boolean boolean90 = composite88.invariant();
        boolean boolean91 = composite88.invariant();
        boolean boolean92 = composite42.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite88);
        composite1.add_child(composite42);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet94 = composite1.children_set();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test096");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        boolean boolean6 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet7 = composite1.children_set();
        DataStructures.eiffel.Composite composite8 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test097");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        boolean boolean35 = composite33.invariant();
        boolean boolean36 = composite33.invariant();
        boolean boolean37 = composite1.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite33);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        boolean boolean49 = composite46.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet50 = composite46.children_set();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite52.add_child(composite54);
        boolean boolean56 = composite52.invariant();
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite60.invariant();
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        composite60.add_child(composite63);
        boolean boolean65 = composite63.invariant();
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((-3));
        boolean boolean70 = composite69.invariant();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        composite69.add_child(composite72);
        DataStructures.eiffel.Composite[] compositeArray74 = new DataStructures.eiffel.Composite[] { composite69 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet75 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet75, compositeArray74);
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-3));
        boolean boolean79 = composite63.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet75, composite78);
        DataStructures.eiffel.Composite composite81 = new DataStructures.eiffel.Composite((-3));
        boolean boolean82 = composite81.invariant();
        DataStructures.eiffel.Composite composite84 = new DataStructures.eiffel.Composite((-3));
        composite81.add_child(composite84);
        boolean boolean86 = composite84.invariant();
        boolean boolean87 = composite84.invariant();
        boolean boolean88 = composite52.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet75, composite84);
        boolean boolean89 = composite39.is_max((-9), 1, compositeSet50, composite52);
// flaky:         composite33.add_child(composite39);
        boolean boolean91 = composite33.invariant();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test098");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite10.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite17.children_set();
        boolean boolean19 = composite4.is_max((int) (short) 1, 1, compositeSet15, composite17);
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        composite23.add_child(composite26);
        boolean boolean28 = composite26.invariant();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        composite32.add_child(composite35);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite32.children_set();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite39.children_set();
        boolean boolean41 = composite26.is_max((int) (short) 1, 1, compositeSet37, composite39);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite39.children_set();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite44.add_child(composite46);
        boolean boolean48 = composite44.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        boolean boolean57 = composite55.invariant();
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        composite61.add_child(composite64);
        DataStructures.eiffel.Composite[] compositeArray66 = new DataStructures.eiffel.Composite[] { composite61 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet67 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet67, compositeArray66);
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-3));
        boolean boolean71 = composite55.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet67, composite70);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite76);
        boolean boolean78 = composite76.invariant();
        boolean boolean79 = composite76.invariant();
        boolean boolean80 = composite44.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet67, composite76);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet81 = composite76.children_set();
        boolean boolean82 = composite4.is_max(10, (int) (byte) -1, compositeSet42, composite76);
        DataStructures.eiffel.Composite composite84 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet85 = composite84.children_set();
        DataStructures.eiffel.Composite composite87 = new DataStructures.eiffel.Composite(0);
        composite84.add_child(composite87);
        boolean boolean89 = composite84.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite76.add_child(composite84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test099");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (byte) 10);
        boolean boolean2 = composite1.invariant();
        boolean boolean3 = composite1.invariant();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test100");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite1.children_set();
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test101");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
// flaky:         composite4.add_child(composite7);
        boolean boolean9 = composite7.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite7.children_set();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test102");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(5);
        boolean boolean2 = composite1.invariant();
        boolean boolean3 = composite1.invariant();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test103");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        boolean boolean7 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet9 = composite4.children_set();
        boolean boolean10 = composite4.invariant();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test104");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((-3));
        boolean boolean4 = composite3.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        composite3.add_child(composite6);
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        composite11.add_child(composite14);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet16 = composite11.children_set();
        DataStructures.eiffel.Composite composite17 = null;
        boolean boolean18 = composite3.is_max((int) (short) 10, (int) (byte) 1, compositeSet16, composite17);
        boolean boolean19 = composite3.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test105");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite45.children_set();
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-100));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet71 = composite70.children_set();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        boolean boolean75 = composite73.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet76 = composite73.children_set();
        boolean boolean77 = composite45.is_max((-1), 1, compositeSet71, composite73);
        boolean boolean78 = composite73.invariant();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test106");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        composite12.add_child(composite15);
        boolean boolean17 = composite15.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite21.children_set();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet29 = composite28.children_set();
        boolean boolean30 = composite15.is_max((int) (short) 1, 1, compositeSet26, composite28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite(0);
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        composite32.add_child(composite35);
        boolean boolean38 = composite32.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite32.add_child(composite40);
        boolean boolean42 = composite32.invariant();
        boolean boolean43 = composite1.is_max(2, 0, compositeSet26, composite32);
        boolean boolean44 = composite1.invariant();
        boolean boolean45 = composite1.invariant();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test107");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet3 = composite1.children_set();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        composite7.add_child(composite10);
        boolean boolean13 = composite7.invariant();
        boolean boolean14 = composite7.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        boolean boolean23 = composite21.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet32 = composite27.children_set();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet35 = composite34.children_set();
        boolean boolean36 = composite21.is_max((int) (short) 1, 1, compositeSet32, composite34);
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite(0);
        boolean boolean39 = composite38.invariant();
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        composite38.add_child(composite41);
        boolean boolean44 = composite38.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite38.add_child(composite46);
        boolean boolean48 = composite38.invariant();
        boolean boolean49 = composite7.is_max(2, 0, compositeSet32, composite38);
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite(0);
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        boolean boolean55 = composite54.invariant();
        composite51.add_child(composite54);
        boolean boolean57 = composite1.is_max(0, (-10), compositeSet32, composite51);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet58 = composite1.children_set();
        boolean boolean59 = composite1.invariant();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test108");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) ' ');
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet7 = composite5.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite5.children_set();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite10.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite10.children_set();
        boolean boolean14 = composite1.is_max((int) (byte) 1, (-5), compositeSet8, composite10);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) 'a');
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite(0);
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        boolean boolean25 = composite24.invariant();
        composite21.add_child(composite24);
        boolean boolean27 = composite21.invariant();
        boolean boolean28 = composite21.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet29 = composite21.children_set();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite(0);
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        boolean boolean35 = composite34.invariant();
        composite31.add_child(composite34);
        boolean boolean37 = composite31.invariant();
        boolean boolean38 = composite31.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite51.children_set();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet59 = composite58.children_set();
        boolean boolean60 = composite45.is_max((int) (short) 1, 1, compositeSet56, composite58);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite(0);
        boolean boolean63 = composite62.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite65.invariant();
        composite62.add_child(composite65);
        boolean boolean68 = composite62.invariant();
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-3));
        composite62.add_child(composite70);
        boolean boolean72 = composite62.invariant();
        boolean boolean73 = composite31.is_max(2, 0, compositeSet56, composite62);
        DataStructures.eiffel.Composite composite75 = new DataStructures.eiffel.Composite((-3));
        boolean boolean76 = composite75.invariant();
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-3));
        composite75.add_child(composite78);
        boolean boolean80 = composite78.invariant();
        DataStructures.eiffel.Composite composite84 = new DataStructures.eiffel.Composite((-3));
        boolean boolean85 = composite84.invariant();
        DataStructures.eiffel.Composite composite87 = new DataStructures.eiffel.Composite((-3));
        composite84.add_child(composite87);
        DataStructures.eiffel.Composite[] compositeArray89 = new DataStructures.eiffel.Composite[] { composite84 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet90 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet90, compositeArray89);
        DataStructures.eiffel.Composite composite93 = new DataStructures.eiffel.Composite((-3));
        boolean boolean94 = composite78.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet90, composite93);
        boolean boolean95 = composite93.invariant();
        composite62.add_child(composite93);
        boolean boolean97 = composite16.is_max((-9), (-5), compositeSet29, composite93);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test109");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite14.add_child(composite16);
        boolean boolean18 = composite14.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        DataStructures.eiffel.Composite[] compositeArray36 = new DataStructures.eiffel.Composite[] { composite31 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet37 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet37, compositeArray36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite25.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        boolean boolean49 = composite46.invariant();
        boolean boolean50 = composite14.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite46);
        boolean boolean51 = composite1.is_max((-9), 1, compositeSet12, composite14);
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        boolean boolean54 = composite53.invariant();
        boolean boolean55 = composite53.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite53.children_set();
        composite1.add_child(composite53);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test110");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite4.add_child(composite6);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite4.children_set();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite12.children_set();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        composite15.add_child(composite18);
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        composite23.add_child(composite26);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet28 = composite23.children_set();
        DataStructures.eiffel.Composite composite29 = null;
        boolean boolean30 = composite15.is_max((int) (short) 10, (int) (byte) 1, compositeSet28, composite29);
        boolean boolean31 = composite4.is_max((-4), (-100), compositeSet13, composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test111");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite37.invariant();
        boolean boolean39 = composite37.invariant();
        composite4.add_child(composite37);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test112");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite10.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite17.children_set();
        boolean boolean19 = composite4.is_max((int) (short) 1, 1, compositeSet15, composite17);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite17.children_set();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite(0);
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        composite22.add_child(composite25);
        boolean boolean28 = composite22.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite30);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet32 = composite30.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite17.add_child(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test113");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        boolean boolean32 = composite30.invariant();
        boolean boolean33 = composite30.invariant();
        boolean boolean34 = composite30.invariant();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test114");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        composite17.add_child(composite20);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite17.children_set();
        DataStructures.eiffel.Composite composite23 = null;
        boolean boolean24 = composite9.is_max((int) (short) 10, (int) (byte) 1, compositeSet22, composite23);
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite(0);
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        composite26.add_child(composite29);
        boolean boolean32 = composite4.is_max((int) '4', (int) '#', compositeSet22, composite29);
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite(0);
        boolean boolean35 = composite34.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite34.add_child(composite37);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-100));
        boolean boolean64 = composite37.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite63);
        boolean boolean65 = composite63.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite63.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite63.children_set();
        composite4.add_child(composite63);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test115");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite30.children_set();
        boolean boolean67 = composite30.invariant();
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((int) 'a');
        boolean boolean70 = composite69.invariant();
        composite30.add_child(composite69);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite75 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite73.add_child(composite75);
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite78);
        // The following exception was thrown during execution in test generation
        try {
            composite30.add_child(composite78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test116");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-2));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test117");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(0);
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        composite10.add_child(composite13);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet16 = composite10.children_set();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite(2);
        boolean boolean19 = composite4.is_max((int) (short) 100, 10, compositeSet16, composite18);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite4.children_set();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test118");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite(0);
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        composite9.add_child(composite12);
        boolean boolean15 = composite9.invariant();
        boolean boolean16 = composite9.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        composite20.add_child(composite23);
        boolean boolean25 = composite23.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        composite29.add_child(composite32);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite29.children_set();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite36.children_set();
        boolean boolean38 = composite23.is_max((int) (short) 1, 1, compositeSet34, composite36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite(0);
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        composite40.add_child(composite43);
        boolean boolean46 = composite40.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite48);
        boolean boolean50 = composite40.invariant();
        boolean boolean51 = composite9.is_max(2, 0, compositeSet34, composite40);
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        boolean boolean54 = composite53.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        composite53.add_child(composite56);
        boolean boolean58 = composite56.invariant();
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite62.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        composite62.add_child(composite65);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite62.children_set();
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet70 = composite69.children_set();
        boolean boolean71 = composite56.is_max((int) (short) 1, 1, compositeSet67, composite69);
        boolean boolean72 = composite1.is_max((-1), 6, compositeSet34, composite56);
        boolean boolean73 = composite56.invariant();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test119");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite10.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite17.children_set();
        boolean boolean19 = composite4.is_max((int) (short) 1, 1, compositeSet15, composite17);
        boolean boolean20 = composite17.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite17.children_set();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test120");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite4.children_set();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite40.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite40.children_set();
        boolean boolean44 = composite40.invariant();
        composite4.add_child(composite40);
        boolean boolean46 = composite40.invariant();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test121");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (byte) 0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        boolean boolean3 = composite1.invariant();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test122");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite1.children_set();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite9.children_set();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite(0);
        composite9.add_child(composite12);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite12.children_set();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        boolean boolean17 = composite16.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite16.children_set();
        boolean boolean19 = composite1.is_max((int) (short) 1, 1, compositeSet14, composite16);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite16.children_set();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test123");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite30.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite30.children_set();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test124");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite14.add_child(composite16);
        boolean boolean18 = composite14.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        DataStructures.eiffel.Composite[] compositeArray36 = new DataStructures.eiffel.Composite[] { composite31 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet37 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet37, compositeArray36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite25.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        boolean boolean49 = composite46.invariant();
        boolean boolean50 = composite14.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite46);
        boolean boolean51 = composite1.is_max((-9), 1, compositeSet12, composite14);
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite(9);
        composite1.add_child(composite53);
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite58.add_child(composite60);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet62 = composite58.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet63 = composite58.children_set();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        boolean boolean68 = composite67.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet69 = composite67.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet70 = composite67.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet71 = composite67.children_set();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite(0);
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite73.add_child(composite76);
        boolean boolean78 = composite58.is_max((-5), 0, compositeSet71, composite76);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet79 = composite58.children_set();
        DataStructures.eiffel.Composite composite81 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite85 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet86 = composite85.children_set();
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite((-3));
        boolean boolean89 = composite88.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet90 = composite88.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet91 = composite88.children_set();
        boolean boolean92 = composite88.invariant();
        boolean boolean93 = composite81.is_max(3, (int) (byte) 10, compositeSet86, composite88);
        boolean boolean94 = composite53.is_max(1, 3, compositeSet79, composite81);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test125");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        boolean boolean6 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet7 = composite1.children_set();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite(0);
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        composite9.add_child(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test126");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(9);
        boolean boolean2 = composite1.invariant();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test127");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite30.children_set();
        boolean boolean67 = composite30.invariant();
        boolean boolean68 = composite30.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet69 = composite30.children_set();
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((-100));
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet75 = composite73.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet76 = composite73.children_set();
        boolean boolean77 = composite73.invariant();
        boolean boolean78 = composite73.invariant();
        composite71.add_child(composite73);
        // The following exception was thrown during execution in test generation
        try {
            composite30.add_child(composite71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test128");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        boolean boolean19 = composite17.invariant();
        boolean boolean20 = composite17.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite17.children_set();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite23.add_child(composite25);
        boolean boolean27 = composite23.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        boolean boolean36 = composite34.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        DataStructures.eiffel.Composite[] compositeArray45 = new DataStructures.eiffel.Composite[] { composite40 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet46 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet46, compositeArray45);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite34.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite49);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        boolean boolean57 = composite55.invariant();
        boolean boolean58 = composite55.invariant();
        boolean boolean59 = composite23.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite55);
        boolean boolean60 = composite10.is_max((-9), 1, compositeSet21, composite23);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite(100);
        boolean boolean63 = composite4.is_max((int) (short) 0, (int) (byte) 0, compositeSet21, composite62);
        boolean boolean64 = composite62.invariant();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test129");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        boolean boolean3 = composite1.invariant();
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(100);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((-3));
        boolean boolean8 = composite7.invariant();
        boolean boolean9 = composite7.invariant();
        composite5.add_child(composite7);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(0);
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        boolean boolean18 = composite17.invariant();
        composite14.add_child(composite17);
        boolean boolean20 = composite14.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite22);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet24 = composite22.children_set();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        composite26.add_child(composite29);
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        boolean boolean35 = composite34.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        composite34.add_child(composite37);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet39 = composite34.children_set();
        DataStructures.eiffel.Composite composite40 = null;
        boolean boolean41 = composite26.is_max((int) (short) 10, (int) (byte) 1, compositeSet39, composite40);
        boolean boolean42 = composite26.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite26.children_set();
        boolean boolean44 = composite5.is_max(1, (int) (byte) 1, compositeSet24, composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test130");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet9 = composite1.children_set();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((int) (byte) 1);
        composite1.add_child(composite11);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite1.children_set();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test131");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        boolean boolean35 = composite33.invariant();
        boolean boolean36 = composite33.invariant();
        boolean boolean37 = composite1.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite33);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite(100);
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        boolean boolean43 = composite41.invariant();
        composite39.add_child(composite41);
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite(0);
        boolean boolean49 = composite48.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        composite48.add_child(composite51);
        boolean boolean54 = composite48.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        composite48.add_child(composite56);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet58 = composite56.children_set();
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite60.invariant();
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        composite60.add_child(composite63);
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((-3));
        boolean boolean69 = composite68.invariant();
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((-3));
        composite68.add_child(composite71);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet73 = composite68.children_set();
        DataStructures.eiffel.Composite composite74 = null;
        boolean boolean75 = composite60.is_max((int) (short) 10, (int) (byte) 1, compositeSet73, composite74);
        boolean boolean76 = composite60.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet77 = composite60.children_set();
        boolean boolean78 = composite39.is_max(1, (int) (byte) 1, compositeSet58, composite60);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test132");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test133");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        boolean boolean66 = composite45.invariant();
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((int) (short) 10);
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        boolean boolean73 = composite72.invariant();
        DataStructures.eiffel.Composite composite75 = new DataStructures.eiffel.Composite((-3));
        composite72.add_child(composite75);
        boolean boolean77 = composite75.invariant();
        boolean boolean78 = composite75.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet79 = composite75.children_set();
        boolean boolean80 = composite75.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet81 = composite75.children_set();
        DataStructures.eiffel.Composite composite83 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet84 = composite83.children_set();
        DataStructures.eiffel.Composite composite86 = new DataStructures.eiffel.Composite(0);
        composite83.add_child(composite86);
        boolean boolean88 = composite68.is_max((-7), 1, compositeSet81, composite86);
// flaky:         composite45.add_child(composite68);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test134");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 10);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        boolean boolean13 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite8.children_set();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet17 = composite16.children_set();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite(0);
        composite16.add_child(composite19);
        boolean boolean21 = composite1.is_max((-7), 1, compositeSet14, composite19);
        boolean boolean22 = composite1.invariant();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test135");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite35.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite35.children_set();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        boolean boolean45 = composite43.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        composite49.add_child(composite52);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite49.children_set();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet57 = composite56.children_set();
        boolean boolean58 = composite43.is_max((int) (short) 1, 1, compositeSet54, composite56);
        boolean boolean59 = composite4.is_max(6, (int) '4', compositeSet38, composite43);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        composite61.add_child(composite64);
        boolean boolean66 = composite64.invariant();
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite(0);
        boolean boolean71 = composite70.invariant();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        composite70.add_child(composite73);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet76 = composite70.children_set();
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite(2);
        boolean boolean79 = composite64.is_max((int) (short) 100, 10, compositeSet76, composite78);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet80 = composite64.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test136");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite5.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite8.children_set();
        boolean boolean12 = composite8.invariant();
        boolean boolean13 = composite1.is_max(3, (int) (byte) 10, compositeSet6, composite8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet16 = composite8.children_set();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite18.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite18.children_set();
        composite8.add_child(composite18);
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((int) (short) 10);
// flaky:         composite18.add_child(composite23);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test137");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite35.add_child(composite37);
        boolean boolean39 = composite35.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        DataStructures.eiffel.Composite[] compositeArray57 = new DataStructures.eiffel.Composite[] { composite52 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet58 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet58, compositeArray57);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite46.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite61);
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        boolean boolean69 = composite67.invariant();
        boolean boolean70 = composite67.invariant();
        boolean boolean71 = composite35.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite67);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite76);
        boolean boolean78 = composite76.invariant();
        boolean boolean79 = composite76.invariant();
        boolean boolean80 = composite30.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite76);
        boolean boolean81 = composite76.invariant();
        DataStructures.eiffel.Composite composite83 = new DataStructures.eiffel.Composite((-3));
        boolean boolean84 = composite83.invariant();
        boolean boolean85 = composite83.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet86 = composite83.children_set();
        composite76.add_child(composite83);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet88 = composite83.children_set();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test138");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite9.children_set();
        DataStructures.eiffel.Composite composite15 = null;
        boolean boolean16 = composite1.is_max((int) (short) 10, (int) (byte) 1, compositeSet14, composite15);
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite(0);
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        composite26.add_child(composite29);
        boolean boolean31 = composite29.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        DataStructures.eiffel.Composite[] compositeArray40 = new DataStructures.eiffel.Composite[] { composite35 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet41 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet41, compositeArray40);
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        boolean boolean45 = composite29.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet41, composite44);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-100));
        boolean boolean48 = composite21.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet41, composite47);
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite50.children_set();
        composite21.add_child(composite50);
        boolean boolean53 = composite21.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite21.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet55 = composite21.children_set();
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet60 = composite59.children_set();
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite62.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        composite62.add_child(composite65);
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite(0);
// flaky:         composite65.add_child(composite68);
        boolean boolean70 = composite21.is_max(0, (-10), compositeSet60, composite65);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test139");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet9 = composite1.children_set();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite11.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite11.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite(0);
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        composite17.add_child(composite20);
        boolean boolean23 = composite17.invariant();
        boolean boolean24 = composite17.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        boolean boolean33 = composite31.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite37.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite37.add_child(composite40);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite37.children_set();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet45 = composite44.children_set();
        boolean boolean46 = composite31.is_max((int) (short) 1, 1, compositeSet42, composite44);
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite(0);
        boolean boolean49 = composite48.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        composite48.add_child(composite51);
        boolean boolean54 = composite48.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        composite48.add_child(composite56);
        boolean boolean58 = composite48.invariant();
        boolean boolean59 = composite17.is_max(2, 0, compositeSet42, composite48);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite(0);
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        composite61.add_child(composite64);
        boolean boolean67 = composite11.is_max(0, (-10), compositeSet42, composite61);
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite(0);
        boolean boolean72 = composite71.invariant();
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((-3));
        boolean boolean75 = composite74.invariant();
        composite71.add_child(composite74);
        boolean boolean77 = composite71.invariant();
        boolean boolean78 = composite71.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet79 = composite71.children_set();
        DataStructures.eiffel.Composite composite81 = new DataStructures.eiffel.Composite((-100));
        boolean boolean82 = composite61.is_max(9, (-4), compositeSet79, composite81);
        composite1.add_child(composite81);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test140");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-4));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test141");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite14.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-100));
        boolean boolean18 = composite1.is_max(10, (-2), compositeSet15, composite17);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite20.children_set();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite25.children_set();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite(0);
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite28.add_child(composite31);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        composite36.add_child(composite39);
        boolean boolean41 = composite39.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        boolean boolean46 = composite45.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        composite45.add_child(composite48);
        DataStructures.eiffel.Composite[] compositeArray50 = new DataStructures.eiffel.Composite[] { composite45 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet51 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet51, compositeArray50);
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        boolean boolean55 = composite39.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet51, composite54);
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-100));
        boolean boolean58 = composite31.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet51, composite57);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite62.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        composite62.add_child(composite65);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite62.children_set();
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((-3));
        boolean boolean70 = composite69.invariant();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        composite69.add_child(composite72);
        boolean boolean74 = composite72.invariant();
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-3));
        boolean boolean79 = composite78.invariant();
        DataStructures.eiffel.Composite composite81 = new DataStructures.eiffel.Composite((-3));
        composite78.add_child(composite81);
        DataStructures.eiffel.Composite[] compositeArray83 = new DataStructures.eiffel.Composite[] { composite78 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet84 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet84, compositeArray83);
        DataStructures.eiffel.Composite composite87 = new DataStructures.eiffel.Composite((-3));
        boolean boolean88 = composite72.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet84, composite87);
        DataStructures.eiffel.Composite composite90 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite72.add_child(composite90);
        boolean boolean92 = composite57.is_max((int) (short) 100, (int) (short) 100, compositeSet67, composite72);
        boolean boolean93 = composite20.is_max((-100), 0, compositeSet26, composite57);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet94 = composite20.children_set();
        composite1.add_child(composite20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test142");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 100);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test143");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite4.children_set();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test144");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite4.children_set();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test145");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test146");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) 'a');
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(0);
        boolean boolean7 = composite6.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        composite6.add_child(composite9);
        boolean boolean12 = composite6.invariant();
        boolean boolean13 = composite6.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite6.children_set();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite(0);
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        composite16.add_child(composite19);
        boolean boolean22 = composite16.invariant();
        boolean boolean23 = composite16.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        boolean boolean32 = composite30.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        composite36.add_child(composite39);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite36.children_set();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite43.children_set();
        boolean boolean45 = composite30.is_max((int) (short) 1, 1, compositeSet41, composite43);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite(0);
        boolean boolean48 = composite47.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        boolean boolean51 = composite50.invariant();
        composite47.add_child(composite50);
        boolean boolean53 = composite47.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite47.add_child(composite55);
        boolean boolean57 = composite47.invariant();
        boolean boolean58 = composite16.is_max(2, 0, compositeSet41, composite47);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite60.invariant();
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        composite60.add_child(composite63);
        boolean boolean65 = composite63.invariant();
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((-3));
        boolean boolean70 = composite69.invariant();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        composite69.add_child(composite72);
        DataStructures.eiffel.Composite[] compositeArray74 = new DataStructures.eiffel.Composite[] { composite69 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet75 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet75, compositeArray74);
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-3));
        boolean boolean79 = composite63.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet75, composite78);
        boolean boolean80 = composite78.invariant();
        composite47.add_child(composite78);
        boolean boolean82 = composite1.is_max((-9), (-5), compositeSet14, composite78);
        DataStructures.eiffel.Composite composite83 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test147");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(8);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite7.children_set();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite10.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite10.children_set();
        boolean boolean14 = composite10.invariant();
        boolean boolean15 = composite3.is_max(3, (int) (byte) 10, compositeSet8, composite10);
        composite1.add_child(composite10);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet17 = composite1.children_set();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test148");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        boolean boolean6 = composite1.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite(1);
        composite1.add_child(composite8);
        boolean boolean10 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite1.children_set();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test149");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-10));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test150");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite35.add_child(composite37);
        boolean boolean39 = composite35.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        DataStructures.eiffel.Composite[] compositeArray57 = new DataStructures.eiffel.Composite[] { composite52 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet58 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet58, compositeArray57);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite46.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite61);
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        boolean boolean69 = composite67.invariant();
        boolean boolean70 = composite67.invariant();
        boolean boolean71 = composite35.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite67);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite76);
        boolean boolean78 = composite76.invariant();
        boolean boolean79 = composite76.invariant();
        boolean boolean80 = composite30.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite76);
        boolean boolean81 = composite30.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet82 = composite30.children_set();
        boolean boolean83 = composite30.invariant();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test151");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        boolean boolean35 = composite33.invariant();
        boolean boolean36 = composite33.invariant();
        boolean boolean37 = composite1.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite33);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite39.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite39.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite39.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite39.children_set();
        composite33.add_child(composite39);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet45 = composite39.children_set();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test152");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite(0);
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite12.add_child(composite15);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        composite20.add_child(composite23);
        boolean boolean25 = composite23.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        composite29.add_child(composite32);
        DataStructures.eiffel.Composite[] compositeArray34 = new DataStructures.eiffel.Composite[] { composite29 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet35 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet35, compositeArray34);
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        boolean boolean39 = composite23.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet35, composite38);
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-100));
        boolean boolean42 = composite15.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet35, composite41);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        boolean boolean47 = composite46.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        composite46.add_child(composite49);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite46.children_set();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        boolean boolean54 = composite53.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        composite53.add_child(composite56);
        boolean boolean58 = composite56.invariant();
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite62.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        composite62.add_child(composite65);
        DataStructures.eiffel.Composite[] compositeArray67 = new DataStructures.eiffel.Composite[] { composite62 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet68 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet68, compositeArray67);
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((-3));
        boolean boolean72 = composite56.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet68, composite71);
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite56.add_child(composite74);
        boolean boolean76 = composite41.is_max((int) (short) 100, (int) (short) 100, compositeSet51, composite56);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet77 = composite56.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite9.add_child(composite56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test153");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (byte) 100);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((-3));
        boolean boolean4 = composite3.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        composite3.add_child(composite6);
        boolean boolean8 = composite6.invariant();
        boolean boolean9 = composite6.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite6.children_set();
        boolean boolean11 = composite6.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite6.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test154");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite7.add_child(composite10);
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        composite15.add_child(composite18);
        boolean boolean20 = composite18.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        boolean boolean25 = composite24.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        composite24.add_child(composite27);
        DataStructures.eiffel.Composite[] compositeArray29 = new DataStructures.eiffel.Composite[] { composite24 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet30 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet30, compositeArray29);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite18.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet30, composite33);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-100));
        boolean boolean37 = composite10.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet30, composite36);
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite41.add_child(composite43);
        boolean boolean45 = composite41.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        composite49.add_child(composite52);
        boolean boolean54 = composite52.invariant();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        boolean boolean59 = composite58.invariant();
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        composite58.add_child(composite61);
        DataStructures.eiffel.Composite[] compositeArray63 = new DataStructures.eiffel.Composite[] { composite58 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet64 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet64, compositeArray63);
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        boolean boolean68 = composite52.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet64, composite67);
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-3));
        boolean boolean71 = composite70.invariant();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        composite70.add_child(composite73);
        boolean boolean75 = composite73.invariant();
        boolean boolean76 = composite73.invariant();
        boolean boolean77 = composite41.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet64, composite73);
        DataStructures.eiffel.Composite composite79 = new DataStructures.eiffel.Composite((-3));
        boolean boolean80 = composite79.invariant();
        DataStructures.eiffel.Composite composite82 = new DataStructures.eiffel.Composite((-3));
        composite79.add_child(composite82);
        boolean boolean84 = composite82.invariant();
        boolean boolean85 = composite82.invariant();
        boolean boolean86 = composite36.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet64, composite82);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test155");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite5.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite8.children_set();
        boolean boolean12 = composite8.invariant();
        boolean boolean13 = composite1.is_max(3, (int) (byte) 10, compositeSet6, composite8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet16 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet17 = composite8.children_set();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test156");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        composite12.add_child(composite15);
        boolean boolean17 = composite15.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite21.children_set();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet29 = composite28.children_set();
        boolean boolean30 = composite15.is_max((int) (short) 1, 1, compositeSet26, composite28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite(0);
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        composite32.add_child(composite35);
        boolean boolean38 = composite32.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite32.add_child(composite40);
        boolean boolean42 = composite32.invariant();
        boolean boolean43 = composite1.is_max(2, 0, compositeSet26, composite32);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite32.children_set();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test157");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-5));
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        boolean boolean19 = composite17.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        composite23.add_child(composite26);
        DataStructures.eiffel.Composite[] compositeArray28 = new DataStructures.eiffel.Composite[] { composite23 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet29 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet29, compositeArray28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        boolean boolean33 = composite17.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet29, composite32);
        boolean boolean34 = composite32.invariant();
        composite8.add_child(composite32);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((int) ' ');
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet45 = composite43.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet46 = composite43.children_set();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        boolean boolean49 = composite48.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet50 = composite48.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite48.children_set();
        boolean boolean52 = composite39.is_max((int) (byte) 1, (-5), compositeSet46, composite48);
        DataStructures.eiffel.Composite composite53 = null;
        boolean boolean54 = composite8.is_max((int) (short) 100, (int) (byte) -1, compositeSet46, composite53);
        boolean boolean55 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite8.children_set();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        boolean boolean59 = composite58.invariant();
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        composite58.add_child(composite61);
        boolean boolean63 = composite61.invariant();
        boolean boolean64 = composite61.invariant();
        boolean boolean65 = composite1.is_max(10, 1, compositeSet56, composite61);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test158");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite5.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite8.children_set();
        boolean boolean12 = composite8.invariant();
        boolean boolean13 = composite1.is_max(3, (int) (byte) 10, compositeSet6, composite8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite8.children_set();
        boolean boolean15 = composite8.invariant();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test159");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite6);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite9.add_child(composite11);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite11.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test160");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite4.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite42.children_set();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        boolean boolean46 = composite45.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        composite45.add_child(composite48);
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite(0);
// flaky:         composite48.add_child(composite51);
        boolean boolean53 = composite4.is_max(0, (-10), compositeSet43, composite48);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite48.children_set();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        boolean boolean57 = composite56.invariant();
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        composite56.add_child(composite59);
        boolean boolean61 = composite59.invariant();
        boolean boolean62 = composite59.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet63 = composite59.children_set();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite65.invariant();
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((-3));
        composite65.add_child(composite68);
        boolean boolean70 = composite68.invariant();
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((-3));
        boolean boolean75 = composite74.invariant();
        DataStructures.eiffel.Composite composite77 = new DataStructures.eiffel.Composite((-3));
        composite74.add_child(composite77);
        DataStructures.eiffel.Composite[] compositeArray79 = new DataStructures.eiffel.Composite[] { composite74 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet80 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet80, compositeArray79);
        DataStructures.eiffel.Composite composite83 = new DataStructures.eiffel.Composite((-3));
        boolean boolean84 = composite68.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet80, composite83);
        boolean boolean85 = composite83.invariant();
        composite59.add_child(composite83);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet87 = composite59.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite48.add_child(composite59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test161");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite12.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite(0);
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite17.add_child(composite20);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        composite25.add_child(composite28);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite33.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        composite33.add_child(composite36);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite33.children_set();
        DataStructures.eiffel.Composite composite39 = null;
        boolean boolean40 = composite25.is_max((int) (short) 10, (int) (byte) 1, compositeSet38, composite39);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite(0);
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        boolean boolean46 = composite45.invariant();
        composite42.add_child(composite45);
        boolean boolean48 = composite20.is_max((int) '4', (int) '#', compositeSet38, composite45);
        boolean boolean49 = composite1.is_max((int) (short) 0, (int) (short) 100, compositeSet15, composite20);
        boolean boolean50 = composite20.invariant();
        boolean boolean51 = composite20.invariant();
        boolean boolean52 = composite20.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite(0);
        boolean boolean55 = composite54.invariant();
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite54.add_child(composite57);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite62.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        composite62.add_child(composite65);
        boolean boolean67 = composite65.invariant();
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((-3));
        boolean boolean72 = composite71.invariant();
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((-3));
        composite71.add_child(composite74);
        DataStructures.eiffel.Composite[] compositeArray76 = new DataStructures.eiffel.Composite[] { composite71 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet77 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet77, compositeArray76);
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite((-3));
        boolean boolean81 = composite65.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet77, composite80);
        DataStructures.eiffel.Composite composite83 = new DataStructures.eiffel.Composite((-100));
        boolean boolean84 = composite57.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet77, composite83);
        DataStructures.eiffel.Composite composite86 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet87 = composite86.children_set();
        composite57.add_child(composite86);
        boolean boolean89 = composite57.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet90 = composite57.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet91 = composite57.children_set();
        DataStructures.eiffel.Composite composite93 = new DataStructures.eiffel.Composite((-3));
        boolean boolean94 = composite93.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet95 = composite93.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet96 = composite93.children_set();
        boolean boolean97 = composite93.invariant();
        composite57.add_child(composite93);
        // The following exception was thrown during execution in test generation
        try {
            composite20.add_child(composite93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test162");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) 'a');
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(0);
        boolean boolean7 = composite6.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        composite6.add_child(composite9);
        boolean boolean12 = composite6.invariant();
        boolean boolean13 = composite6.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite6.children_set();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite(0);
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        composite16.add_child(composite19);
        boolean boolean22 = composite16.invariant();
        boolean boolean23 = composite16.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        boolean boolean32 = composite30.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        composite36.add_child(composite39);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite36.children_set();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite43.children_set();
        boolean boolean45 = composite30.is_max((int) (short) 1, 1, compositeSet41, composite43);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite(0);
        boolean boolean48 = composite47.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        boolean boolean51 = composite50.invariant();
        composite47.add_child(composite50);
        boolean boolean53 = composite47.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite47.add_child(composite55);
        boolean boolean57 = composite47.invariant();
        boolean boolean58 = composite16.is_max(2, 0, compositeSet41, composite47);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite60.invariant();
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        composite60.add_child(composite63);
        boolean boolean65 = composite63.invariant();
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((-3));
        boolean boolean70 = composite69.invariant();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        composite69.add_child(composite72);
        DataStructures.eiffel.Composite[] compositeArray74 = new DataStructures.eiffel.Composite[] { composite69 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet75 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet75, compositeArray74);
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-3));
        boolean boolean79 = composite63.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet75, composite78);
        boolean boolean80 = composite78.invariant();
        composite47.add_child(composite78);
        boolean boolean82 = composite1.is_max((-9), (-5), compositeSet14, composite78);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet83 = composite78.children_set();
        boolean boolean84 = composite78.invariant();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test163");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite35.add_child(composite37);
        boolean boolean39 = composite35.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        DataStructures.eiffel.Composite[] compositeArray57 = new DataStructures.eiffel.Composite[] { composite52 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet58 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet58, compositeArray57);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite46.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite61);
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        boolean boolean69 = composite67.invariant();
        boolean boolean70 = composite67.invariant();
        boolean boolean71 = composite35.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite67);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite76);
        boolean boolean78 = composite76.invariant();
        boolean boolean79 = composite76.invariant();
        boolean boolean80 = composite30.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite76);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet81 = composite76.children_set();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test164");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet7 = composite6.children_set();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite(0);
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite9.add_child(composite12);
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        composite17.add_child(composite20);
        boolean boolean22 = composite20.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        composite26.add_child(composite29);
        DataStructures.eiffel.Composite[] compositeArray31 = new DataStructures.eiffel.Composite[] { composite26 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet32 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet32, compositeArray31);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite20.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet32, composite35);
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-100));
        boolean boolean39 = composite12.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet32, composite38);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet48 = composite43.children_set();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        boolean boolean51 = composite50.invariant();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        composite50.add_child(composite53);
        boolean boolean55 = composite53.invariant();
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        boolean boolean60 = composite59.invariant();
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        composite59.add_child(composite62);
        DataStructures.eiffel.Composite[] compositeArray64 = new DataStructures.eiffel.Composite[] { composite59 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet65 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet65, compositeArray64);
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((-3));
        boolean boolean69 = composite53.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet65, composite68);
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite53.add_child(composite71);
        boolean boolean73 = composite38.is_max((int) (short) 100, (int) (short) 100, compositeSet48, composite53);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet74 = composite53.children_set();
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite((-100));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet79 = composite78.children_set();
        DataStructures.eiffel.Composite composite81 = new DataStructures.eiffel.Composite((-3));
        boolean boolean82 = composite81.invariant();
        boolean boolean83 = composite81.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet84 = composite81.children_set();
        boolean boolean85 = composite53.is_max((-1), 1, compositeSet79, composite81);
        boolean boolean86 = composite1.is_max((-8), (int) (short) 1, compositeSet7, composite53);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet87 = composite1.children_set();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test165");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite35.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite35.children_set();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        boolean boolean45 = composite43.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        composite49.add_child(composite52);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite49.children_set();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet57 = composite56.children_set();
        boolean boolean58 = composite43.is_max((int) (short) 1, 1, compositeSet54, composite56);
        boolean boolean59 = composite4.is_max(6, (int) '4', compositeSet38, composite43);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite(0);
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        composite61.add_child(composite64);
        boolean boolean67 = composite61.invariant();
        boolean boolean68 = composite61.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test166");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
// flaky:         composite4.add_child(composite7);
        boolean boolean9 = composite7.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        composite15.add_child(composite18);
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        composite23.add_child(composite26);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet28 = composite23.children_set();
        DataStructures.eiffel.Composite composite29 = null;
        boolean boolean30 = composite15.is_max((int) (short) 10, (int) (byte) 1, compositeSet28, composite29);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        composite32.add_child(composite35);
        boolean boolean37 = composite35.invariant();
        boolean boolean38 = composite35.invariant();
        boolean boolean39 = composite11.is_max(100, (int) (short) 1, compositeSet28, composite35);
        composite7.add_child(composite11);
        boolean boolean41 = composite7.invariant();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test167");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        boolean boolean21 = composite19.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite(0);
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite23.add_child(composite26);
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        boolean boolean36 = composite34.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        DataStructures.eiffel.Composite[] compositeArray45 = new DataStructures.eiffel.Composite[] { composite40 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet46 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet46, compositeArray45);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite34.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite49);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-100));
        boolean boolean53 = composite26.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite52);
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        boolean boolean58 = composite57.invariant();
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        composite57.add_child(composite60);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet62 = composite57.children_set();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        boolean boolean69 = composite67.invariant();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite76);
        DataStructures.eiffel.Composite[] compositeArray78 = new DataStructures.eiffel.Composite[] { composite73 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet79 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet79, compositeArray78);
        DataStructures.eiffel.Composite composite82 = new DataStructures.eiffel.Composite((-3));
        boolean boolean83 = composite67.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet79, composite82);
        DataStructures.eiffel.Composite composite85 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite67.add_child(composite85);
        boolean boolean87 = composite52.is_max((int) (short) 100, (int) (short) 100, compositeSet62, composite67);
        composite19.add_child(composite52);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test168");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        boolean boolean19 = composite17.invariant();
        boolean boolean20 = composite17.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite17.children_set();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite23.add_child(composite25);
        boolean boolean27 = composite23.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        boolean boolean36 = composite34.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        DataStructures.eiffel.Composite[] compositeArray45 = new DataStructures.eiffel.Composite[] { composite40 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet46 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet46, compositeArray45);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite34.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite49);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        boolean boolean57 = composite55.invariant();
        boolean boolean58 = composite55.invariant();
        boolean boolean59 = composite23.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite55);
        boolean boolean60 = composite10.is_max((-9), 1, compositeSet21, composite23);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite(100);
        boolean boolean63 = composite4.is_max((int) (short) 0, (int) (byte) 0, compositeSet21, composite62);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet64 = composite62.children_set();
        DataStructures.eiffel.Composite composite65 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite62.add_child(composite65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test169");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        boolean boolean11 = composite1.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite(0);
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite13.add_child(composite16);
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        boolean boolean26 = composite24.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        DataStructures.eiffel.Composite[] compositeArray35 = new DataStructures.eiffel.Composite[] { composite30 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet36 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet36, compositeArray35);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite24.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite39);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-100));
        boolean boolean43 = composite16.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite42);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite47.add_child(composite49);
        boolean boolean51 = composite47.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        boolean boolean56 = composite55.invariant();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        composite55.add_child(composite58);
        boolean boolean60 = composite58.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        DataStructures.eiffel.Composite[] compositeArray69 = new DataStructures.eiffel.Composite[] { composite64 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet70 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet70, compositeArray69);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite58.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite73);
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        boolean boolean77 = composite76.invariant();
        DataStructures.eiffel.Composite composite79 = new DataStructures.eiffel.Composite((-3));
        composite76.add_child(composite79);
        boolean boolean81 = composite79.invariant();
        boolean boolean82 = composite79.invariant();
        boolean boolean83 = composite47.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite79);
        DataStructures.eiffel.Composite composite85 = new DataStructures.eiffel.Composite((-3));
        boolean boolean86 = composite85.invariant();
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite((-3));
        composite85.add_child(composite88);
        boolean boolean90 = composite88.invariant();
        boolean boolean91 = composite88.invariant();
        boolean boolean92 = composite42.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet70, composite88);
        composite1.add_child(composite42);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet94 = composite42.children_set();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test170");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 10);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite14.children_set();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite21.children_set();
        boolean boolean23 = composite8.is_max((int) (short) 1, 1, compositeSet19, composite21);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        boolean boolean32 = composite30.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        composite36.add_child(composite39);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite36.children_set();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite43.children_set();
        boolean boolean45 = composite30.is_max((int) (short) 1, 1, compositeSet41, composite43);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet46 = composite43.children_set();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite48.add_child(composite50);
        boolean boolean52 = composite48.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        boolean boolean57 = composite56.invariant();
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        composite56.add_child(composite59);
        boolean boolean61 = composite59.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite65.invariant();
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((-3));
        composite65.add_child(composite68);
        DataStructures.eiffel.Composite[] compositeArray70 = new DataStructures.eiffel.Composite[] { composite65 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet71 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet71, compositeArray70);
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((-3));
        boolean boolean75 = composite59.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet71, composite74);
        DataStructures.eiffel.Composite composite77 = new DataStructures.eiffel.Composite((-3));
        boolean boolean78 = composite77.invariant();
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite((-3));
        composite77.add_child(composite80);
        boolean boolean82 = composite80.invariant();
        boolean boolean83 = composite80.invariant();
        boolean boolean84 = composite48.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet71, composite80);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet85 = composite80.children_set();
        boolean boolean86 = composite8.is_max(10, (int) (byte) -1, compositeSet46, composite80);
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite(0);
        boolean boolean89 = composite1.is_max((-3), (int) 'a', compositeSet46, composite88);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet90 = composite1.children_set();
        boolean boolean91 = composite1.invariant();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test171");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) 'a');
        boolean boolean2 = composite1.invariant();
        boolean boolean3 = composite1.invariant();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test172");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) 'a');
        composite19.add_child(composite22);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite25.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet27 = composite25.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet28 = composite25.children_set();
        composite19.add_child(composite25);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet30 = composite25.children_set();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test173");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite4.add_child(composite22);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet24 = composite22.children_set();
        boolean boolean25 = composite22.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite22.children_set();
        boolean boolean27 = composite22.invariant();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test174");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet38 = composite4.children_set();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite40.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite40.children_set();
        boolean boolean44 = composite40.invariant();
        composite4.add_child(composite40);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet46 = composite4.children_set();
        boolean boolean47 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet48 = composite4.children_set();
        boolean boolean49 = composite4.invariant();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test175");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite14.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-100));
        boolean boolean18 = composite1.is_max(10, (-2), compositeSet15, composite17);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite(0);
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite20.add_child(composite23);
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        boolean boolean33 = composite31.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite37.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite37.add_child(composite40);
        DataStructures.eiffel.Composite[] compositeArray42 = new DataStructures.eiffel.Composite[] { composite37 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet43 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet43, compositeArray42);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        boolean boolean47 = composite31.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet43, composite46);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-100));
        boolean boolean50 = composite23.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet43, composite49);
        composite1.add_child(composite49);
        boolean boolean52 = composite49.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet53 = composite49.children_set();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test176");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet9 = composite1.children_set();
        boolean boolean10 = composite1.invariant();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test177");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(100);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite4.add_child(composite6);
        boolean boolean8 = composite4.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        composite12.add_child(composite15);
        boolean boolean17 = composite15.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        DataStructures.eiffel.Composite[] compositeArray26 = new DataStructures.eiffel.Composite[] { composite21 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet27 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet27, compositeArray26);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite15.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet27, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite33.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        composite33.add_child(composite36);
        boolean boolean38 = composite36.invariant();
        boolean boolean39 = composite36.invariant();
        boolean boolean40 = composite4.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet27, composite36);
        boolean boolean41 = composite4.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test178");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(0);
        boolean boolean8 = composite7.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite7.add_child(composite10);
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        composite15.add_child(composite18);
        boolean boolean20 = composite18.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        boolean boolean25 = composite24.invariant();
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        composite24.add_child(composite27);
        DataStructures.eiffel.Composite[] compositeArray29 = new DataStructures.eiffel.Composite[] { composite24 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet30 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet30, compositeArray29);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite18.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet30, composite33);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-100));
        boolean boolean37 = composite10.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet30, composite36);
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        composite41.add_child(composite44);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet46 = composite41.children_set();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        boolean boolean49 = composite48.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        composite48.add_child(composite51);
        boolean boolean53 = composite51.invariant();
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        boolean boolean58 = composite57.invariant();
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        composite57.add_child(composite60);
        DataStructures.eiffel.Composite[] compositeArray62 = new DataStructures.eiffel.Composite[] { composite57 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet63 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet63, compositeArray62);
        DataStructures.eiffel.Composite composite66 = new DataStructures.eiffel.Composite((-3));
        boolean boolean67 = composite51.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet63, composite66);
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite51.add_child(composite69);
        boolean boolean71 = composite36.is_max((int) (short) 100, (int) (short) 100, compositeSet46, composite51);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet72 = composite51.children_set();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-100));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet77 = composite76.children_set();
        DataStructures.eiffel.Composite composite79 = new DataStructures.eiffel.Composite((-3));
        boolean boolean80 = composite79.invariant();
        boolean boolean81 = composite79.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet82 = composite79.children_set();
        boolean boolean83 = composite51.is_max((-1), 1, compositeSet77, composite79);
        DataStructures.eiffel.Composite composite85 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet86 = composite85.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet87 = composite85.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet88 = composite85.children_set();
        composite79.add_child(composite85);
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test179");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        boolean boolean19 = composite17.invariant();
        boolean boolean20 = composite17.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite17.children_set();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite23.add_child(composite25);
        boolean boolean27 = composite23.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        boolean boolean36 = composite34.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        DataStructures.eiffel.Composite[] compositeArray45 = new DataStructures.eiffel.Composite[] { composite40 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet46 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet46, compositeArray45);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite34.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite49);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        boolean boolean57 = composite55.invariant();
        boolean boolean58 = composite55.invariant();
        boolean boolean59 = composite23.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite55);
        boolean boolean60 = composite10.is_max((-9), 1, compositeSet21, composite23);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite(100);
        boolean boolean63 = composite4.is_max((int) (short) 0, (int) (byte) 0, compositeSet21, composite62);
        boolean boolean64 = composite4.invariant();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test180");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) -1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite5.add_child(composite7);
        boolean boolean9 = composite5.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        composite13.add_child(composite16);
        boolean boolean18 = composite16.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        DataStructures.eiffel.Composite[] compositeArray27 = new DataStructures.eiffel.Composite[] { composite22 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet28 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet28, compositeArray27);
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite16.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet28, composite31);
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        boolean boolean35 = composite34.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        composite34.add_child(composite37);
        boolean boolean39 = composite37.invariant();
        boolean boolean40 = composite37.invariant();
        boolean boolean41 = composite5.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet28, composite37);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite5.children_set();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite(0);
        boolean boolean45 = composite44.invariant();
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite44.add_child(composite47);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        boolean boolean57 = composite55.invariant();
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        composite61.add_child(composite64);
        DataStructures.eiffel.Composite[] compositeArray66 = new DataStructures.eiffel.Composite[] { composite61 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet67 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet67, compositeArray66);
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-3));
        boolean boolean71 = composite55.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet67, composite70);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-100));
        boolean boolean74 = composite47.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet67, composite73);
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet77 = composite76.children_set();
        composite47.add_child(composite76);
        boolean boolean79 = composite47.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet80 = composite47.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet81 = composite47.children_set();
        DataStructures.eiffel.Composite composite83 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet84 = composite83.children_set();
// flaky:         composite47.add_child(composite83);
        boolean boolean86 = composite47.invariant();
        boolean boolean87 = composite47.invariant();
        boolean boolean88 = composite1.is_max(6, 0, compositeSet42, composite47);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test181");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        boolean boolean35 = composite33.invariant();
        boolean boolean36 = composite33.invariant();
        boolean boolean37 = composite1.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite33);
        boolean boolean38 = composite1.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite42.children_set();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite(0);
        composite42.add_child(composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet47 = composite45.children_set();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite1.is_max((-100), (int) (short) 10, compositeSet47, composite49);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite1.children_set();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test182");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet34 = composite33.children_set();
        composite4.add_child(composite33);
        boolean boolean36 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite4.children_set();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite(0);
        boolean boolean40 = composite39.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite39.add_child(composite42);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        boolean boolean48 = composite47.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        composite47.add_child(composite50);
        boolean boolean52 = composite50.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        boolean boolean57 = composite56.invariant();
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        composite56.add_child(composite59);
        DataStructures.eiffel.Composite[] compositeArray61 = new DataStructures.eiffel.Composite[] { composite56 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet62 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet62, compositeArray61);
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite50.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet62, composite65);
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((-100));
        boolean boolean69 = composite42.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet62, composite68);
        boolean boolean70 = composite68.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet71 = composite68.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet72 = composite68.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet73 = composite68.children_set();
        composite4.add_child(composite68);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test183");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite5.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite8.children_set();
        boolean boolean12 = composite8.invariant();
        boolean boolean13 = composite1.is_max(3, (int) (byte) 10, compositeSet6, composite8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite8.children_set();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite(0);
        boolean boolean20 = composite19.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite19.add_child(composite22);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite41 = null;
        boolean boolean42 = composite27.is_max((int) (short) 10, (int) (byte) 1, compositeSet40, composite41);
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite(0);
        boolean boolean45 = composite44.invariant();
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        boolean boolean48 = composite47.invariant();
        composite44.add_child(composite47);
        boolean boolean50 = composite22.is_max((int) '4', (int) '#', compositeSet40, composite47);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite52.add_child(composite54);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite52.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet57 = composite52.children_set();
        boolean boolean58 = composite52.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet59 = composite52.children_set();
        boolean boolean60 = composite52.invariant();
        boolean boolean61 = composite8.is_max((-7), (int) (byte) 10, compositeSet40, composite52);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet62 = composite52.children_set();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test184");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite9.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite9.children_set();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite(0);
        boolean boolean16 = composite15.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        composite15.add_child(composite18);
        boolean boolean21 = composite15.invariant();
        boolean boolean22 = composite15.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        composite26.add_child(composite29);
        boolean boolean31 = composite29.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite42.children_set();
        boolean boolean44 = composite29.is_max((int) (short) 1, 1, compositeSet40, composite42);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite(0);
        boolean boolean47 = composite46.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        composite46.add_child(composite49);
        boolean boolean52 = composite46.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite46.add_child(composite54);
        boolean boolean56 = composite46.invariant();
        boolean boolean57 = composite15.is_max(2, 0, compositeSet40, composite46);
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite(0);
        boolean boolean60 = composite59.invariant();
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite62.invariant();
        composite59.add_child(composite62);
        boolean boolean65 = composite9.is_max(0, (-10), compositeSet40, composite59);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite9.children_set();
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite(0);
        boolean boolean69 = composite68.invariant();
        DataStructures.eiffel.Composite composite71 = new DataStructures.eiffel.Composite((-3));
        boolean boolean72 = composite71.invariant();
        composite68.add_child(composite71);
        boolean boolean74 = composite68.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite68.add_child(composite76);
        boolean boolean78 = composite68.invariant();
        boolean boolean79 = composite68.invariant();
        boolean boolean80 = composite1.is_max((-7), (-7), compositeSet66, composite68);
        boolean boolean81 = composite68.invariant();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test185");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(0);
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite11.add_child(composite14);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        composite19.add_child(composite22);
        boolean boolean24 = composite22.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        DataStructures.eiffel.Composite[] compositeArray33 = new DataStructures.eiffel.Composite[] { composite28 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet34 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet34, compositeArray33);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite22.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet34, composite37);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-100));
        boolean boolean41 = composite14.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet34, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite43.children_set();
        composite14.add_child(composite43);
        boolean boolean46 = composite14.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet47 = composite14.children_set();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite49.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet52 = composite49.children_set();
        boolean boolean53 = composite49.invariant();
        boolean boolean54 = composite49.invariant();
        boolean boolean55 = composite1.is_max((-2), (int) '4', compositeSet47, composite49);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite1.children_set();
        boolean boolean57 = composite1.invariant();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test186");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (byte) 1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        composite17.add_child(composite20);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite17.children_set();
        DataStructures.eiffel.Composite composite23 = null;
        boolean boolean24 = composite9.is_max((int) (short) 10, (int) (byte) 1, compositeSet22, composite23);
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        composite26.add_child(composite29);
        boolean boolean31 = composite29.invariant();
        boolean boolean32 = composite29.invariant();
        boolean boolean33 = composite5.is_max(100, (int) (short) 1, compositeSet22, composite29);
        boolean boolean34 = composite29.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((int) (byte) 10);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet39 = composite38.children_set();
        DataStructures.eiffel.Composite composite40 = null;
        boolean boolean41 = composite29.is_max(100, (int) (short) 1, compositeSet39, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite43.add_child(composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet47 = composite45.children_set();
        boolean boolean48 = composite1.is_max((int) (short) -1, (-5), compositeSet39, composite45);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test187");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) 'a');
        composite19.add_child(composite22);
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite(0);
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite25.add_child(composite28);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        boolean boolean34 = composite33.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        composite33.add_child(composite36);
        boolean boolean38 = composite36.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        DataStructures.eiffel.Composite[] compositeArray47 = new DataStructures.eiffel.Composite[] { composite42 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet48 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet48, compositeArray47);
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite36.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet48, composite51);
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-100));
        boolean boolean55 = composite28.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet48, composite54);
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet58 = composite57.children_set();
        composite28.add_child(composite57);
        boolean boolean60 = composite28.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet61 = composite28.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet62 = composite28.children_set();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite64.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite64.children_set();
        boolean boolean68 = composite64.invariant();
        composite28.add_child(composite64);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet70 = composite28.children_set();
        boolean boolean71 = composite28.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet72 = composite28.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite19.add_child(composite28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test188");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        boolean boolean7 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet9 = composite4.children_set();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        composite11.add_child(composite14);
        boolean boolean16 = composite14.invariant();
        boolean boolean17 = composite14.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite14.children_set();
        boolean boolean19 = composite14.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite14.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test189");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        boolean boolean6 = composite1.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite(1);
        composite1.add_child(composite8);
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite11.add_child(composite13);
        boolean boolean15 = composite11.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        composite19.add_child(composite22);
        boolean boolean24 = composite22.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        DataStructures.eiffel.Composite[] compositeArray33 = new DataStructures.eiffel.Composite[] { composite28 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet34 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet34, compositeArray33);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite22.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet34, composite37);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        boolean boolean45 = composite43.invariant();
        boolean boolean46 = composite43.invariant();
        boolean boolean47 = composite11.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet34, composite43);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite49.add_child(composite51);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet53 = composite49.children_set();
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet58 = composite57.children_set();
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite(0);
        composite57.add_child(composite60);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet62 = composite60.children_set();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite64.children_set();
        boolean boolean67 = composite49.is_max((int) (short) 1, 1, compositeSet62, composite64);
        composite11.add_child(composite64);
        // The following exception was thrown during execution in test generation
        try {
            composite8.add_child(composite64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test190");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite45.children_set();
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-100));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet71 = composite70.children_set();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        boolean boolean75 = composite73.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet76 = composite73.children_set();
        boolean boolean77 = composite45.is_max((-1), 1, compositeSet71, composite73);
        boolean boolean78 = composite45.invariant();
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite(0);
// flaky:         composite45.add_child(composite80);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test191");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite4.add_child(composite22);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet24 = composite4.children_set();
        boolean boolean25 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite4.children_set();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test192");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 10);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        boolean boolean15 = composite14.invariant();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        composite14.add_child(composite17);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite14.children_set();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite21.children_set();
        boolean boolean23 = composite8.is_max((int) (short) 1, 1, compositeSet19, composite21);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        boolean boolean32 = composite30.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((-3));
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        composite36.add_child(composite39);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet41 = composite36.children_set();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet44 = composite43.children_set();
        boolean boolean45 = composite30.is_max((int) (short) 1, 1, compositeSet41, composite43);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet46 = composite43.children_set();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite48.add_child(composite50);
        boolean boolean52 = composite48.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        boolean boolean57 = composite56.invariant();
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        composite56.add_child(composite59);
        boolean boolean61 = composite59.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite65.invariant();
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((-3));
        composite65.add_child(composite68);
        DataStructures.eiffel.Composite[] compositeArray70 = new DataStructures.eiffel.Composite[] { composite65 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet71 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet71, compositeArray70);
        DataStructures.eiffel.Composite composite74 = new DataStructures.eiffel.Composite((-3));
        boolean boolean75 = composite59.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet71, composite74);
        DataStructures.eiffel.Composite composite77 = new DataStructures.eiffel.Composite((-3));
        boolean boolean78 = composite77.invariant();
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite((-3));
        composite77.add_child(composite80);
        boolean boolean82 = composite80.invariant();
        boolean boolean83 = composite80.invariant();
        boolean boolean84 = composite48.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet71, composite80);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet85 = composite80.children_set();
        boolean boolean86 = composite8.is_max(10, (int) (byte) -1, compositeSet46, composite80);
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite(0);
        boolean boolean89 = composite1.is_max((-3), (int) 'a', compositeSet46, composite88);
        boolean boolean90 = composite88.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet91 = composite88.children_set();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test193");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        composite13.add_child(composite16);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite13.children_set();
        DataStructures.eiffel.Composite composite19 = null;
        boolean boolean20 = composite5.is_max((int) (short) 10, (int) (byte) 1, compositeSet18, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        boolean boolean28 = composite25.invariant();
        boolean boolean29 = composite1.is_max(100, (int) (short) 1, compositeSet18, composite25);
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite(0);
        boolean boolean34 = composite33.invariant();
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite33.add_child(composite36);
        DataStructures.eiffel.Composite composite41 = new DataStructures.eiffel.Composite((-3));
        boolean boolean42 = composite41.invariant();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        composite41.add_child(composite44);
        boolean boolean46 = composite44.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        boolean boolean51 = composite50.invariant();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        composite50.add_child(composite53);
        DataStructures.eiffel.Composite[] compositeArray55 = new DataStructures.eiffel.Composite[] { composite50 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet56 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet56, compositeArray55);
        DataStructures.eiffel.Composite composite59 = new DataStructures.eiffel.Composite((-3));
        boolean boolean60 = composite44.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet56, composite59);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-100));
        boolean boolean63 = composite36.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet56, composite62);
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        boolean boolean68 = composite67.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet69 = composite67.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet70 = composite67.children_set();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        boolean boolean73 = composite72.invariant();
        DataStructures.eiffel.Composite composite75 = new DataStructures.eiffel.Composite((-3));
        composite72.add_child(composite75);
        boolean boolean77 = composite75.invariant();
        DataStructures.eiffel.Composite composite81 = new DataStructures.eiffel.Composite((-3));
        boolean boolean82 = composite81.invariant();
        DataStructures.eiffel.Composite composite84 = new DataStructures.eiffel.Composite((-3));
        composite81.add_child(composite84);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet86 = composite81.children_set();
        DataStructures.eiffel.Composite composite88 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet89 = composite88.children_set();
        boolean boolean90 = composite75.is_max((int) (short) 1, 1, compositeSet86, composite88);
        boolean boolean91 = composite36.is_max(6, (int) '4', compositeSet70, composite75);
        DataStructures.eiffel.Composite composite93 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet94 = composite93.children_set();
        DataStructures.eiffel.Composite composite96 = new DataStructures.eiffel.Composite(0);
        composite93.add_child(composite96);
        boolean boolean98 = composite25.is_max((int) (short) 0, (int) '4', compositeSet70, composite96);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet99 = composite96.children_set();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test194");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        boolean boolean6 = composite1.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite(1);
        composite1.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet17 = composite16.children_set();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite19.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite19.children_set();
        boolean boolean23 = composite19.invariant();
        boolean boolean24 = composite12.is_max(3, (int) (byte) 10, compositeSet17, composite19);
        boolean boolean25 = composite19.invariant();
        boolean boolean26 = composite19.invariant();
        composite8.add_child(composite19);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test195");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite14.add_child(composite16);
        boolean boolean18 = composite14.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        DataStructures.eiffel.Composite[] compositeArray36 = new DataStructures.eiffel.Composite[] { composite31 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet37 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet37, compositeArray36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite25.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        boolean boolean49 = composite46.invariant();
        boolean boolean50 = composite14.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite46);
        boolean boolean51 = composite1.is_max((-9), 1, compositeSet12, composite14);
        boolean boolean52 = composite1.invariant();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test196");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(8);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite(0);
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite13.add_child(composite16);
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        boolean boolean26 = composite24.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        DataStructures.eiffel.Composite[] compositeArray35 = new DataStructures.eiffel.Composite[] { composite30 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet36 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet36, compositeArray35);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite24.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite39);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-100));
        boolean boolean43 = composite16.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet36, composite42);
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        boolean boolean48 = composite47.invariant();
        DataStructures.eiffel.Composite composite50 = new DataStructures.eiffel.Composite((-3));
        composite47.add_child(composite50);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet52 = composite47.children_set();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        boolean boolean55 = composite54.invariant();
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        composite54.add_child(composite57);
        boolean boolean59 = composite57.invariant();
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        boolean boolean64 = composite63.invariant();
        DataStructures.eiffel.Composite composite66 = new DataStructures.eiffel.Composite((-3));
        composite63.add_child(composite66);
        DataStructures.eiffel.Composite[] compositeArray68 = new DataStructures.eiffel.Composite[] { composite63 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet69 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet69, compositeArray68);
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        boolean boolean73 = composite57.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet69, composite72);
        DataStructures.eiffel.Composite composite75 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite57.add_child(composite75);
        boolean boolean77 = composite42.is_max((int) (short) 100, (int) (short) 100, compositeSet52, composite57);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet78 = composite57.children_set();
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite82 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite80.add_child(composite82);
        boolean boolean84 = composite9.is_max((int) (short) 0, 10, compositeSet78, composite82);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet85 = composite9.children_set();
        DataStructures.eiffel.Composite composite86 = null;
        boolean boolean87 = composite1.is_max((int) (short) 100, 8, compositeSet85, composite86);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test197");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet7 = composite6.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite6.children_set();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite14.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        boolean boolean18 = composite17.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite17.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite17.children_set();
        boolean boolean21 = composite17.invariant();
        boolean boolean22 = composite10.is_max(3, (int) (byte) 10, compositeSet15, composite17);
        boolean boolean23 = composite17.invariant();
        boolean boolean24 = composite17.invariant();
        boolean boolean25 = composite1.is_max(100, 0, compositeSet8, composite17);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite1.children_set();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test198");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        boolean boolean8 = composite1.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        boolean boolean13 = composite12.invariant();
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        composite12.add_child(composite15);
        boolean boolean17 = composite15.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((-3));
        composite21.add_child(composite24);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet26 = composite21.children_set();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet29 = composite28.children_set();
        boolean boolean30 = composite15.is_max((int) (short) 1, 1, compositeSet26, composite28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite(0);
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        composite32.add_child(composite35);
        boolean boolean38 = composite32.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite32.add_child(composite40);
        boolean boolean42 = composite32.invariant();
        boolean boolean43 = composite1.is_max(2, 0, compositeSet26, composite32);
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        boolean boolean46 = composite45.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        composite45.add_child(composite48);
        boolean boolean50 = composite48.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        boolean boolean55 = composite54.invariant();
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite((-3));
        composite54.add_child(composite57);
        DataStructures.eiffel.Composite[] compositeArray59 = new DataStructures.eiffel.Composite[] { composite54 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet60 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet60, compositeArray59);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-3));
        boolean boolean64 = composite48.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet60, composite63);
        boolean boolean65 = composite63.invariant();
        composite32.add_child(composite63);
        boolean boolean67 = composite63.invariant();
        DataStructures.eiffel.Composite composite68 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite63.add_child(composite68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test199");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite45.children_set();
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-100));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet71 = composite70.children_set();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        boolean boolean75 = composite73.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet76 = composite73.children_set();
        boolean boolean77 = composite45.is_max((-1), 1, compositeSet71, composite73);
        boolean boolean78 = composite45.invariant();
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite((int) '#');
        java.util.Set<DataStructures.eiffel.Composite> compositeSet81 = composite80.children_set();
// flaky:         composite45.add_child(composite80);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet83 = composite45.children_set();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test200");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        DataStructures.eiffel.Composite[] compositeArray15 = new DataStructures.eiffel.Composite[] { composite10 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet16 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet16, compositeArray15);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite4.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet16, composite19);
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite4.add_child(composite22);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet24 = composite4.children_set();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite(0);
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite26.add_child(composite29);
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        boolean boolean35 = composite34.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        composite34.add_child(composite37);
        boolean boolean39 = composite37.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        DataStructures.eiffel.Composite[] compositeArray48 = new DataStructures.eiffel.Composite[] { composite43 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet49 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet49, compositeArray48);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite37.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet49, composite52);
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-100));
        boolean boolean56 = composite29.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet49, composite55);
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet59 = composite58.children_set();
        composite29.add_child(composite58);
        boolean boolean61 = composite29.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet62 = composite29.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet63 = composite29.children_set();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        boolean boolean66 = composite65.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite65.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet68 = composite65.children_set();
        boolean boolean69 = composite65.invariant();
        composite29.add_child(composite65);
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test201");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite14.add_child(composite16);
        boolean boolean18 = composite14.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        DataStructures.eiffel.Composite[] compositeArray36 = new DataStructures.eiffel.Composite[] { composite31 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet37 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet37, compositeArray36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite25.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        boolean boolean49 = composite46.invariant();
        boolean boolean50 = composite14.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite46);
        boolean boolean51 = composite1.is_max((-9), 1, compositeSet12, composite14);
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite(9);
        composite1.add_child(composite53);
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        boolean boolean59 = composite58.invariant();
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        composite58.add_child(composite61);
        boolean boolean63 = composite61.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        boolean boolean68 = composite67.invariant();
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-3));
        composite67.add_child(composite70);
        DataStructures.eiffel.Composite[] compositeArray72 = new DataStructures.eiffel.Composite[] { composite67 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet73 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet73, compositeArray72);
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        boolean boolean77 = composite61.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet73, composite76);
        DataStructures.eiffel.Composite composite79 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite61.add_child(composite79);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet81 = composite61.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet82 = composite61.children_set();
        DataStructures.eiffel.Composite composite84 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet85 = composite84.children_set();
        boolean boolean86 = composite53.is_max(6, (int) (byte) 10, compositeSet82, composite84);
        boolean boolean87 = composite84.invariant();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test202");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) ' ');
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite4.children_set();
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(4);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite10.children_set();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite13.children_set();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite18.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite18.children_set();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet27 = composite26.children_set();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet31 = composite29.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet32 = composite29.children_set();
        boolean boolean33 = composite29.invariant();
        boolean boolean34 = composite22.is_max(3, (int) (byte) 10, compositeSet27, composite29);
        boolean boolean35 = composite29.invariant();
        boolean boolean36 = composite29.invariant();
        boolean boolean37 = composite13.is_max(100, 0, compositeSet20, composite29);
        boolean boolean38 = composite1.is_max((-10), (int) (byte) 10, compositeSet11, composite13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test203");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite1.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite1.children_set();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite10.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite10.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite10.children_set();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite(0);
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite16.add_child(composite19);
        boolean boolean21 = composite1.is_max((-5), 0, compositeSet14, composite19);
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite(0);
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite23.add_child(composite26);
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        boolean boolean36 = composite34.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        DataStructures.eiffel.Composite[] compositeArray45 = new DataStructures.eiffel.Composite[] { composite40 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet46 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet46, compositeArray45);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite34.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite49);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-100));
        boolean boolean53 = composite26.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite52);
        boolean boolean54 = composite52.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet55 = composite52.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite52.children_set();
        composite19.add_child(composite52);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test204");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) '4');
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(0);
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        composite5.add_child(composite8);
        boolean boolean11 = composite5.invariant();
        boolean boolean12 = composite5.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        composite16.add_child(composite19);
        boolean boolean21 = composite19.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        composite25.add_child(composite28);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet30 = composite25.children_set();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet33 = composite32.children_set();
        boolean boolean34 = composite19.is_max((int) (short) 1, 1, compositeSet30, composite32);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite(0);
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite39.invariant();
        composite36.add_child(composite39);
        boolean boolean42 = composite36.invariant();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        composite36.add_child(composite44);
        boolean boolean46 = composite36.invariant();
        boolean boolean47 = composite5.is_max(2, 0, compositeSet30, composite36);
        boolean boolean48 = composite5.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet49 = composite5.children_set();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet53 = composite51.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite51.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet55 = composite51.children_set();
        boolean boolean56 = composite1.is_max((int) (short) 10, 8, compositeSet49, composite51);
        boolean boolean57 = composite1.invariant();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test205");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite10.add_child(composite12);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite10.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite10.children_set();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite19.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite19.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet23 = composite19.children_set();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite(0);
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite25.add_child(composite28);
        boolean boolean30 = composite10.is_max((-5), 0, compositeSet23, composite28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-7));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet33 = composite32.children_set();
        boolean boolean34 = composite1.is_max((int) (byte) 1, (-4), compositeSet23, composite32);
        boolean boolean35 = composite32.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite37.add_child(composite39);
        boolean boolean41 = composite37.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        boolean boolean46 = composite45.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        composite45.add_child(composite48);
        boolean boolean50 = composite48.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite48.children_set();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite(0);
        boolean boolean54 = composite53.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite53.add_child(composite56);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        composite61.add_child(composite64);
        DataStructures.eiffel.Composite composite69 = new DataStructures.eiffel.Composite((-3));
        boolean boolean70 = composite69.invariant();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite((-3));
        composite69.add_child(composite72);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet74 = composite69.children_set();
        DataStructures.eiffel.Composite composite75 = null;
        boolean boolean76 = composite61.is_max((int) (short) 10, (int) (byte) 1, compositeSet74, composite75);
        DataStructures.eiffel.Composite composite78 = new DataStructures.eiffel.Composite(0);
        boolean boolean79 = composite78.invariant();
        DataStructures.eiffel.Composite composite81 = new DataStructures.eiffel.Composite((-3));
        boolean boolean82 = composite81.invariant();
        composite78.add_child(composite81);
        boolean boolean84 = composite56.is_max((int) '4', (int) '#', compositeSet74, composite81);
        boolean boolean85 = composite37.is_max((int) (short) 0, (int) (short) 100, compositeSet51, composite56);
        // The following exception was thrown during execution in test generation
        try {
            composite32.add_child(composite37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test206");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite((-3));
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        composite5.add_child(composite8);
        boolean boolean10 = composite8.invariant();
        boolean boolean11 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite8.children_set();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite14.add_child(composite16);
        boolean boolean18 = composite14.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        boolean boolean23 = composite22.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        composite22.add_child(composite25);
        boolean boolean27 = composite25.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        DataStructures.eiffel.Composite[] compositeArray36 = new DataStructures.eiffel.Composite[] { composite31 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet37 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet37, compositeArray36);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite25.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite40);
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        boolean boolean49 = composite46.invariant();
        boolean boolean50 = composite14.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet37, composite46);
        boolean boolean51 = composite1.is_max((-9), 1, compositeSet12, composite14);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet52 = composite14.children_set();
        boolean boolean53 = composite14.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite14.children_set();
        boolean boolean55 = composite14.invariant();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test207");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite6);
        boolean boolean8 = composite1.invariant();
        boolean boolean9 = composite1.invariant();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test208");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite14.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-100));
        boolean boolean18 = composite1.is_max(10, (-2), compositeSet15, composite17);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite20.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite20.children_set();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite(0);
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        composite26.add_child(composite29);
        boolean boolean32 = composite26.invariant();
        boolean boolean33 = composite26.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite37.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite37.add_child(composite40);
        boolean boolean42 = composite40.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        boolean boolean47 = composite46.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        composite46.add_child(composite49);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet51 = composite46.children_set();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite53.children_set();
        boolean boolean55 = composite40.is_max((int) (short) 1, 1, compositeSet51, composite53);
        DataStructures.eiffel.Composite composite57 = new DataStructures.eiffel.Composite(0);
        boolean boolean58 = composite57.invariant();
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite60.invariant();
        composite57.add_child(composite60);
        boolean boolean63 = composite57.invariant();
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-3));
        composite57.add_child(composite65);
        boolean boolean67 = composite57.invariant();
        boolean boolean68 = composite26.is_max(2, 0, compositeSet51, composite57);
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite(0);
        boolean boolean71 = composite70.invariant();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        composite70.add_child(composite73);
        boolean boolean76 = composite20.is_max(0, (-10), compositeSet51, composite70);
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite(0);
        boolean boolean81 = composite80.invariant();
        DataStructures.eiffel.Composite composite83 = new DataStructures.eiffel.Composite((-3));
        boolean boolean84 = composite83.invariant();
        composite80.add_child(composite83);
        boolean boolean86 = composite80.invariant();
        boolean boolean87 = composite80.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet88 = composite80.children_set();
        DataStructures.eiffel.Composite composite90 = new DataStructures.eiffel.Composite((-100));
        boolean boolean91 = composite70.is_max(9, (-4), compositeSet88, composite90);
        composite1.add_child(composite90);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet93 = composite1.children_set();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test209");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite1.children_set();
        boolean boolean6 = composite1.invariant();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test210");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        boolean boolean11 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite1.children_set();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test211");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        boolean boolean6 = composite1.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((int) ' ');
        boolean boolean9 = composite8.invariant();
        composite1.add_child(composite8);
        boolean boolean11 = composite1.invariant();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test212");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        boolean boolean18 = composite17.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        composite17.add_child(composite20);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite17.children_set();
        DataStructures.eiffel.Composite composite23 = null;
        boolean boolean24 = composite9.is_max((int) (short) 10, (int) (byte) 1, compositeSet22, composite23);
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite(0);
        boolean boolean27 = composite26.invariant();
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        composite26.add_child(composite29);
        boolean boolean32 = composite4.is_max((int) '4', (int) '#', compositeSet22, composite29);
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite(0);
        boolean boolean35 = composite34.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite34.add_child(composite37);
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((-100));
        boolean boolean64 = composite37.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite63);
        DataStructures.eiffel.Composite composite66 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet67 = composite66.children_set();
        composite37.add_child(composite66);
        boolean boolean69 = composite37.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet70 = composite37.children_set();
        boolean boolean71 = composite37.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite4.add_child(composite37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test213");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        boolean boolean7 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite4.children_set();
        boolean boolean9 = composite4.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite4.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = null;
        DataStructures.eiffel.Composite composite15 = new DataStructures.eiffel.Composite((-3));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = composite4.is_max(9, 100, compositeSet13, composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test214");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite10.add_child(composite12);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite10.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite10.children_set();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite19.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite19.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet23 = composite19.children_set();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite(0);
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite25.add_child(composite28);
        boolean boolean30 = composite10.is_max((-5), 0, compositeSet23, composite28);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-7));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet33 = composite32.children_set();
        boolean boolean34 = composite1.is_max((int) (byte) 1, (-4), compositeSet23, composite32);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite(0);
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite36.add_child(composite39);
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        boolean boolean45 = composite44.invariant();
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        composite44.add_child(composite47);
        boolean boolean49 = composite47.invariant();
        DataStructures.eiffel.Composite composite53 = new DataStructures.eiffel.Composite((-3));
        boolean boolean54 = composite53.invariant();
        DataStructures.eiffel.Composite composite56 = new DataStructures.eiffel.Composite((-3));
        composite53.add_child(composite56);
        DataStructures.eiffel.Composite[] compositeArray58 = new DataStructures.eiffel.Composite[] { composite53 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet59 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet59, compositeArray58);
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite((-3));
        boolean boolean63 = composite47.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet59, composite62);
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite((-100));
        boolean boolean66 = composite39.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet59, composite65);
        boolean boolean67 = composite65.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet68 = composite65.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet69 = composite65.children_set();
        composite1.add_child(composite65);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test215");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite9.children_set();
        DataStructures.eiffel.Composite composite15 = null;
        boolean boolean16 = composite1.is_max((int) (short) 10, (int) (byte) 1, compositeSet14, composite15);
        boolean boolean17 = composite1.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        boolean boolean21 = composite19.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet22 = composite19.children_set();
        composite1.add_child(composite19);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test216");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-100));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((-3));
        boolean boolean4 = composite3.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet5 = composite3.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite3.children_set();
        boolean boolean7 = composite3.invariant();
        boolean boolean8 = composite3.invariant();
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite11.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite11.children_set();
        boolean boolean14 = composite11.invariant();
// flaky:         composite3.add_child(composite11);
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite17.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite17.children_set();
// flaky:         composite3.add_child(composite17);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test217");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) -1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(0);
        boolean boolean4 = composite3.invariant();
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite3.add_child(composite6);
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((-3));
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((-3));
        composite11.add_child(composite14);
        boolean boolean16 = composite14.invariant();
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-3));
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        composite20.add_child(composite23);
        DataStructures.eiffel.Composite[] compositeArray25 = new DataStructures.eiffel.Composite[] { composite20 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet26 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet26, compositeArray25);
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite14.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet26, composite29);
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-100));
        boolean boolean33 = composite6.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet26, composite32);
        boolean boolean34 = composite6.invariant();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test218");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(100);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet2 = composite1.children_set();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite(0);
        boolean boolean5 = composite4.invariant();
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite4.add_child(composite7);
        boolean boolean9 = composite4.invariant();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite((int) ' ');
        boolean boolean12 = composite11.invariant();
        composite4.add_child(composite11);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test219");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) (short) 1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(8);
        composite1.add_child(composite3);
        DataStructures.eiffel.Composite composite6 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite10.children_set();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite13.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet16 = composite13.children_set();
        boolean boolean17 = composite13.invariant();
        boolean boolean18 = composite6.is_max(3, (int) (byte) 10, compositeSet11, composite13);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite13.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet20 = composite13.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite13.children_set();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet24 = composite23.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet25 = composite23.children_set();
        composite13.add_child(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test220");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(10);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite5.add_child(composite7);
        boolean boolean9 = composite5.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        boolean boolean14 = composite13.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        composite13.add_child(composite16);
        boolean boolean18 = composite16.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet19 = composite16.children_set();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite(0);
        boolean boolean22 = composite21.invariant();
        DataStructures.eiffel.Composite composite24 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite21.add_child(composite24);
        DataStructures.eiffel.Composite composite29 = new DataStructures.eiffel.Composite((-3));
        boolean boolean30 = composite29.invariant();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        composite29.add_child(composite32);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite37.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite37.add_child(composite40);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite37.children_set();
        DataStructures.eiffel.Composite composite43 = null;
        boolean boolean44 = composite29.is_max((int) (short) 10, (int) (byte) 1, compositeSet42, composite43);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite(0);
        boolean boolean47 = composite46.invariant();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite49.invariant();
        composite46.add_child(composite49);
        boolean boolean52 = composite24.is_max((int) '4', (int) '#', compositeSet42, composite49);
        boolean boolean53 = composite5.is_max((int) (short) 0, (int) (short) 100, compositeSet19, composite24);
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        boolean boolean56 = composite55.invariant();
        DataStructures.eiffel.Composite composite58 = new DataStructures.eiffel.Composite((-3));
        composite55.add_child(composite58);
        boolean boolean60 = composite58.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite(0);
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        boolean boolean68 = composite67.invariant();
        composite64.add_child(composite67);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet70 = composite64.children_set();
        DataStructures.eiffel.Composite composite72 = new DataStructures.eiffel.Composite(2);
        boolean boolean73 = composite58.is_max((int) (short) 100, 10, compositeSet70, composite72);
        boolean boolean74 = composite1.is_max((-5), 7, compositeSet19, composite58);
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        boolean boolean77 = composite76.invariant();
        DataStructures.eiffel.Composite composite79 = new DataStructures.eiffel.Composite((-3));
        composite76.add_child(composite79);
        DataStructures.eiffel.Composite composite82 = new DataStructures.eiffel.Composite(0);
// flaky:         composite79.add_child(composite82);
        boolean boolean84 = composite82.invariant();
        boolean boolean85 = composite82.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet86 = composite82.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet87 = composite82.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite82);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test221");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        boolean boolean35 = composite33.invariant();
        boolean boolean36 = composite33.invariant();
        boolean boolean37 = composite1.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite33);
        boolean boolean38 = composite1.invariant();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet43 = composite42.children_set();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite(0);
        composite42.add_child(composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet47 = composite45.children_set();
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite1.is_max((-100), (int) (short) 10, compositeSet47, composite49);
        boolean boolean51 = composite1.invariant();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test222");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite1.invariant();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test223");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-7));
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(0);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet4 = composite3.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet9 = composite8.children_set();
        DataStructures.eiffel.Composite composite11 = new DataStructures.eiffel.Composite(0);
        boolean boolean12 = composite11.invariant();
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite11.add_child(composite14);
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        boolean boolean20 = composite19.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((-3));
        composite19.add_child(composite22);
        boolean boolean24 = composite22.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        DataStructures.eiffel.Composite[] compositeArray33 = new DataStructures.eiffel.Composite[] { composite28 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet34 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet34, compositeArray33);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite22.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet34, composite37);
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-100));
        boolean boolean41 = composite14.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet34, composite40);
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        boolean boolean46 = composite45.invariant();
        DataStructures.eiffel.Composite composite48 = new DataStructures.eiffel.Composite((-3));
        composite45.add_child(composite48);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet50 = composite45.children_set();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        boolean boolean57 = composite55.invariant();
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        composite61.add_child(composite64);
        DataStructures.eiffel.Composite[] compositeArray66 = new DataStructures.eiffel.Composite[] { composite61 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet67 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet67, compositeArray66);
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-3));
        boolean boolean71 = composite55.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet67, composite70);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite55.add_child(composite73);
        boolean boolean75 = composite40.is_max((int) (short) 100, (int) (short) 100, compositeSet50, composite55);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet76 = composite55.children_set();
        DataStructures.eiffel.Composite composite80 = new DataStructures.eiffel.Composite((-100));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet81 = composite80.children_set();
        DataStructures.eiffel.Composite composite83 = new DataStructures.eiffel.Composite((-3));
        boolean boolean84 = composite83.invariant();
        boolean boolean85 = composite83.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet86 = composite83.children_set();
        boolean boolean87 = composite55.is_max((-1), 1, compositeSet81, composite83);
        boolean boolean88 = composite3.is_max((-8), (int) (short) 1, compositeSet9, composite55);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet89 = composite55.children_set();
        // The following exception was thrown during execution in test generation
        try {
            composite1.add_child(composite55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test224");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((int) '4');
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(0);
        boolean boolean6 = composite5.invariant();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        composite5.add_child(composite8);
        boolean boolean11 = composite5.invariant();
        boolean boolean12 = composite5.invariant();
        DataStructures.eiffel.Composite composite16 = new DataStructures.eiffel.Composite((-3));
        boolean boolean17 = composite16.invariant();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite((-3));
        composite16.add_child(composite19);
        boolean boolean21 = composite19.invariant();
        DataStructures.eiffel.Composite composite25 = new DataStructures.eiffel.Composite((-3));
        boolean boolean26 = composite25.invariant();
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        composite25.add_child(composite28);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet30 = composite25.children_set();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet33 = composite32.children_set();
        boolean boolean34 = composite19.is_max((int) (short) 1, 1, compositeSet30, composite32);
        DataStructures.eiffel.Composite composite36 = new DataStructures.eiffel.Composite(0);
        boolean boolean37 = composite36.invariant();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        boolean boolean40 = composite39.invariant();
        composite36.add_child(composite39);
        boolean boolean42 = composite36.invariant();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite((-3));
        composite36.add_child(composite44);
        boolean boolean46 = composite36.invariant();
        boolean boolean47 = composite5.is_max(2, 0, compositeSet30, composite36);
        boolean boolean48 = composite5.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet49 = composite5.children_set();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet53 = composite51.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet54 = composite51.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet55 = composite51.children_set();
        boolean boolean56 = composite1.is_max((int) (short) 10, 8, compositeSet49, composite51);
        boolean boolean57 = composite51.invariant();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test225");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite42 = new DataStructures.eiffel.Composite((-3));
        boolean boolean43 = composite42.invariant();
        DataStructures.eiffel.Composite composite45 = new DataStructures.eiffel.Composite((-3));
        composite42.add_child(composite45);
        boolean boolean47 = composite45.invariant();
        DataStructures.eiffel.Composite composite51 = new DataStructures.eiffel.Composite((-3));
        boolean boolean52 = composite51.invariant();
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((-3));
        composite51.add_child(composite54);
        DataStructures.eiffel.Composite[] compositeArray56 = new DataStructures.eiffel.Composite[] { composite51 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet57 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet57, compositeArray56);
        DataStructures.eiffel.Composite composite60 = new DataStructures.eiffel.Composite((-3));
        boolean boolean61 = composite45.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet57, composite60);
        DataStructures.eiffel.Composite composite63 = new DataStructures.eiffel.Composite((int) (short) 1);
// flaky:         composite45.add_child(composite63);
        boolean boolean65 = composite30.is_max((int) (short) 100, (int) (short) 100, compositeSet40, composite45);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet66 = composite30.children_set();
        boolean boolean67 = composite30.invariant();
        boolean boolean68 = composite30.invariant();
        boolean boolean69 = composite30.invariant();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test226");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(8);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite7 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet8 = composite7.children_set();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet12 = composite10.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet13 = composite10.children_set();
        boolean boolean14 = composite10.invariant();
        boolean boolean15 = composite3.is_max(3, (int) (byte) 10, compositeSet8, composite10);
        composite1.add_child(composite10);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite((-100));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet21 = composite20.children_set();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite(0);
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite23.add_child(composite26);
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        boolean boolean32 = composite31.invariant();
        DataStructures.eiffel.Composite composite34 = new DataStructures.eiffel.Composite((-3));
        composite31.add_child(composite34);
        boolean boolean36 = composite34.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        boolean boolean41 = composite40.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        composite40.add_child(composite43);
        DataStructures.eiffel.Composite[] compositeArray45 = new DataStructures.eiffel.Composite[] { composite40 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet46 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet46, compositeArray45);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-3));
        boolean boolean50 = composite34.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite49);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-100));
        boolean boolean53 = composite26.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet46, composite52);
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite55.children_set();
        composite26.add_child(composite55);
        boolean boolean58 = composite26.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet59 = composite26.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet60 = composite26.children_set();
        DataStructures.eiffel.Composite composite62 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet63 = composite62.children_set();
// flaky:         composite26.add_child(composite62);
        boolean boolean65 = composite26.invariant();
        boolean boolean66 = composite26.invariant();
        boolean boolean67 = composite10.is_max(0, 1, compositeSet21, composite26);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test227");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        boolean boolean5 = composite4.invariant();
        composite1.add_child(composite4);
        boolean boolean7 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite9);
        DataStructures.eiffel.Composite composite14 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite14.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-100));
        boolean boolean18 = composite1.is_max(10, (-2), compositeSet15, composite17);
        DataStructures.eiffel.Composite composite20 = new DataStructures.eiffel.Composite(0);
        boolean boolean21 = composite20.invariant();
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite20.add_child(composite23);
        DataStructures.eiffel.Composite composite28 = new DataStructures.eiffel.Composite((-3));
        boolean boolean29 = composite28.invariant();
        DataStructures.eiffel.Composite composite31 = new DataStructures.eiffel.Composite((-3));
        composite28.add_child(composite31);
        boolean boolean33 = composite31.invariant();
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((-3));
        boolean boolean38 = composite37.invariant();
        DataStructures.eiffel.Composite composite40 = new DataStructures.eiffel.Composite((-3));
        composite37.add_child(composite40);
        DataStructures.eiffel.Composite[] compositeArray42 = new DataStructures.eiffel.Composite[] { composite37 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet43 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet43, compositeArray42);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        boolean boolean47 = composite31.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet43, composite46);
        DataStructures.eiffel.Composite composite49 = new DataStructures.eiffel.Composite((-100));
        boolean boolean50 = composite23.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet43, composite49);
        composite1.add_child(composite49);
        boolean boolean52 = composite49.invariant();
        boolean boolean53 = composite49.invariant();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test228");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite((-3));
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((-3));
        composite1.add_child(composite4);
        boolean boolean6 = composite4.invariant();
        DataStructures.eiffel.Composite composite10 = new DataStructures.eiffel.Composite((-3));
        boolean boolean11 = composite10.invariant();
        DataStructures.eiffel.Composite composite13 = new DataStructures.eiffel.Composite((-3));
        composite10.add_child(composite13);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite10.children_set();
        DataStructures.eiffel.Composite composite17 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet18 = composite17.children_set();
        boolean boolean19 = composite4.is_max((int) (short) 1, 1, compositeSet15, composite17);
        DataStructures.eiffel.Composite composite23 = new DataStructures.eiffel.Composite((-3));
        boolean boolean24 = composite23.invariant();
        DataStructures.eiffel.Composite composite26 = new DataStructures.eiffel.Composite((-3));
        composite23.add_child(composite26);
        boolean boolean28 = composite26.invariant();
        DataStructures.eiffel.Composite composite32 = new DataStructures.eiffel.Composite((-3));
        boolean boolean33 = composite32.invariant();
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        composite32.add_child(composite35);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet37 = composite32.children_set();
        DataStructures.eiffel.Composite composite39 = new DataStructures.eiffel.Composite((-3));
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite39.children_set();
        boolean boolean41 = composite26.is_max((int) (short) 1, 1, compositeSet37, composite39);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet42 = composite39.children_set();
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite44.add_child(composite46);
        boolean boolean48 = composite44.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        boolean boolean57 = composite55.invariant();
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite61.invariant();
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        composite61.add_child(composite64);
        DataStructures.eiffel.Composite[] compositeArray66 = new DataStructures.eiffel.Composite[] { composite61 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet67 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet67, compositeArray66);
        DataStructures.eiffel.Composite composite70 = new DataStructures.eiffel.Composite((-3));
        boolean boolean71 = composite55.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet67, composite70);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite76);
        boolean boolean78 = composite76.invariant();
        boolean boolean79 = composite76.invariant();
        boolean boolean80 = composite44.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet67, composite76);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet81 = composite76.children_set();
        boolean boolean82 = composite4.is_max(10, (int) (byte) -1, compositeSet42, composite76);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet83 = composite76.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet84 = composite76.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet85 = composite76.children_set();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test229");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite3 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite3);
        boolean boolean5 = composite1.invariant();
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        boolean boolean31 = composite30.invariant();
        DataStructures.eiffel.Composite composite33 = new DataStructures.eiffel.Composite((-3));
        composite30.add_child(composite33);
        boolean boolean35 = composite33.invariant();
        boolean boolean36 = composite33.invariant();
        boolean boolean37 = composite1.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite33);
        boolean boolean38 = composite1.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet39 = composite1.children_set();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test230");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite5 = new DataStructures.eiffel.Composite(8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet6 = composite5.children_set();
        DataStructures.eiffel.Composite composite8 = new DataStructures.eiffel.Composite((-3));
        boolean boolean9 = composite8.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet10 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet11 = composite8.children_set();
        boolean boolean12 = composite8.invariant();
        boolean boolean13 = composite1.is_max(3, (int) (byte) 10, compositeSet6, composite8);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet14 = composite8.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet15 = composite8.children_set();
        DataStructures.eiffel.Composite composite19 = new DataStructures.eiffel.Composite(0);
        boolean boolean20 = composite19.invariant();
        DataStructures.eiffel.Composite composite22 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite19.add_child(composite22);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite27.invariant();
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-3));
        composite27.add_child(composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite((-3));
        boolean boolean36 = composite35.invariant();
        DataStructures.eiffel.Composite composite38 = new DataStructures.eiffel.Composite((-3));
        composite35.add_child(composite38);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet40 = composite35.children_set();
        DataStructures.eiffel.Composite composite41 = null;
        boolean boolean42 = composite27.is_max((int) (short) 10, (int) (byte) 1, compositeSet40, composite41);
        DataStructures.eiffel.Composite composite44 = new DataStructures.eiffel.Composite(0);
        boolean boolean45 = composite44.invariant();
        DataStructures.eiffel.Composite composite47 = new DataStructures.eiffel.Composite((-3));
        boolean boolean48 = composite47.invariant();
        composite44.add_child(composite47);
        boolean boolean50 = composite22.is_max((int) '4', (int) '#', compositeSet40, composite47);
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite54 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite52.add_child(composite54);
        java.util.Set<DataStructures.eiffel.Composite> compositeSet56 = composite52.children_set();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet57 = composite52.children_set();
        boolean boolean58 = composite52.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet59 = composite52.children_set();
        boolean boolean60 = composite52.invariant();
        boolean boolean61 = composite8.is_max((-7), (int) (byte) 10, compositeSet40, composite52);
        DataStructures.eiffel.Composite composite65 = new DataStructures.eiffel.Composite(0);
        boolean boolean66 = composite65.invariant();
        DataStructures.eiffel.Composite composite68 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite65.add_child(composite68);
        boolean boolean70 = composite65.invariant();
        java.util.Set<DataStructures.eiffel.Composite> compositeSet71 = composite65.children_set();
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((int) (byte) -1);
        boolean boolean74 = composite52.is_max((int) '4', (-7), compositeSet71, composite73);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test231");
        DataStructures.eiffel.Composite composite1 = new DataStructures.eiffel.Composite(0);
        boolean boolean2 = composite1.invariant();
        DataStructures.eiffel.Composite composite4 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite1.add_child(composite4);
        DataStructures.eiffel.Composite composite9 = new DataStructures.eiffel.Composite((-3));
        boolean boolean10 = composite9.invariant();
        DataStructures.eiffel.Composite composite12 = new DataStructures.eiffel.Composite((-3));
        composite9.add_child(composite12);
        boolean boolean14 = composite12.invariant();
        DataStructures.eiffel.Composite composite18 = new DataStructures.eiffel.Composite((-3));
        boolean boolean19 = composite18.invariant();
        DataStructures.eiffel.Composite composite21 = new DataStructures.eiffel.Composite((-3));
        composite18.add_child(composite21);
        DataStructures.eiffel.Composite[] compositeArray23 = new DataStructures.eiffel.Composite[] { composite18 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet24 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet24, compositeArray23);
        DataStructures.eiffel.Composite composite27 = new DataStructures.eiffel.Composite((-3));
        boolean boolean28 = composite12.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite27);
        DataStructures.eiffel.Composite composite30 = new DataStructures.eiffel.Composite((-100));
        boolean boolean31 = composite4.is_max((int) (byte) 100, (-8), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet24, composite30);
        DataStructures.eiffel.Composite composite35 = new DataStructures.eiffel.Composite(1);
        DataStructures.eiffel.Composite composite37 = new DataStructures.eiffel.Composite((int) (short) 1);
        composite35.add_child(composite37);
        boolean boolean39 = composite35.invariant();
        DataStructures.eiffel.Composite composite43 = new DataStructures.eiffel.Composite((-3));
        boolean boolean44 = composite43.invariant();
        DataStructures.eiffel.Composite composite46 = new DataStructures.eiffel.Composite((-3));
        composite43.add_child(composite46);
        boolean boolean48 = composite46.invariant();
        DataStructures.eiffel.Composite composite52 = new DataStructures.eiffel.Composite((-3));
        boolean boolean53 = composite52.invariant();
        DataStructures.eiffel.Composite composite55 = new DataStructures.eiffel.Composite((-3));
        composite52.add_child(composite55);
        DataStructures.eiffel.Composite[] compositeArray57 = new DataStructures.eiffel.Composite[] { composite52 };
        java.util.LinkedHashSet<DataStructures.eiffel.Composite> compositeSet58 = new java.util.LinkedHashSet<DataStructures.eiffel.Composite>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<DataStructures.eiffel.Composite>) compositeSet58, compositeArray57);
        DataStructures.eiffel.Composite composite61 = new DataStructures.eiffel.Composite((-3));
        boolean boolean62 = composite46.is_max(100, (int) '#', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite61);
        DataStructures.eiffel.Composite composite64 = new DataStructures.eiffel.Composite((-3));
        boolean boolean65 = composite64.invariant();
        DataStructures.eiffel.Composite composite67 = new DataStructures.eiffel.Composite((-3));
        composite64.add_child(composite67);
        boolean boolean69 = composite67.invariant();
        boolean boolean70 = composite67.invariant();
        boolean boolean71 = composite35.is_max(6, (-4), (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite67);
        DataStructures.eiffel.Composite composite73 = new DataStructures.eiffel.Composite((-3));
        boolean boolean74 = composite73.invariant();
        DataStructures.eiffel.Composite composite76 = new DataStructures.eiffel.Composite((-3));
        composite73.add_child(composite76);
        boolean boolean78 = composite76.invariant();
        boolean boolean79 = composite76.invariant();
        boolean boolean80 = composite30.is_max((-100), (int) 'a', (java.util.Set<DataStructures.eiffel.Composite>) compositeSet58, composite76);
        boolean boolean81 = composite30.invariant();
        boolean boolean82 = composite30.invariant();
        boolean boolean83 = composite30.invariant();
    }
}
