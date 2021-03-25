package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StackArTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test001");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow2.addSuppressed(throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test002");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test003");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test004");
        DataStructures.daikon.StackAr stackAr0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr.Underflow underflow1 = stackAr0.new Underflow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to DataStructures.daikon.StackAr$Underflow with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test005");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test006");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test007");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow4.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test008");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray3 = overflow2.getSuppressed();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test009");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test010");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test011");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        boolean boolean7 = stackAr1.isEmpty();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test012");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test013");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test014");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test015");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test016");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr9.new Underflow();
        overflow5.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Throwable[] throwableArray17 = overflow5.getSuppressed();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test017");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test018");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        java.lang.Throwable[] throwableArray15 = overflow12.getSuppressed();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test019");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test020");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray7 = underflow6.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr9.new Overflow();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr12.new Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        java.lang.Throwable[] throwableArray15 = overflow13.getSuppressed();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj18 = stackAr17.top();
        java.lang.Object obj19 = stackAr17.top();
        boolean boolean20 = stackAr17.isFull();
        java.lang.Object obj21 = stackAr17.topAndPop();
        boolean boolean22 = stackAr17.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow23 = stackAr17.new Underflow();
        overflow13.addSuppressed((java.lang.Throwable) underflow23);
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow27 = stackAr26.new Overflow();
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow30 = stackAr29.new Overflow();
        overflow27.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray32 = overflow30.getSuppressed();
        underflow23.addSuppressed((java.lang.Throwable) overflow30);
        underflow6.addSuppressed((java.lang.Throwable) overflow30);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test021");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test022");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow8 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test023");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        java.lang.Object obj2 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test024");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        // The following exception was thrown during execution in test generation
        try {
            stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test025");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test026");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test027");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test028");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.topAndPop();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test029");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test030");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test031");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test032");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test033");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.top();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test034");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test035");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test036");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        underflow6.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray11 = overflow9.getSuppressed();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test037");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test038");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test039");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test040");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test041");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(100);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test042");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test043");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        boolean boolean9 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow10 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr15.new Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow23 = stackAr22.new Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow13.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr27.new Overflow();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr30.new Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray35 = overflow28.getSuppressed();
        underflow10.addSuppressed((java.lang.Throwable) overflow28);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test044");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        stackAr23.makeEmpty();
        boolean boolean28 = stackAr23.isFull();
        boolean boolean29 = stackAr23.isFull();
        DataStructures.daikon.StackAr.Overflow overflow30 = stackAr23.new Overflow();
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj33 = stackAr32.top();
        java.lang.Object obj34 = stackAr32.top();
        boolean boolean35 = stackAr32.isFull();
        boolean boolean36 = stackAr32.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow37 = stackAr32.new Underflow();
        overflow30.addSuppressed((java.lang.Throwable) underflow37);
        overflow20.addSuppressed((java.lang.Throwable) underflow37);
        java.lang.Throwable[] throwableArray40 = overflow20.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow20);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test045");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test046");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj5 = stackAr4.top();
        java.lang.Object obj6 = stackAr4.top();
        boolean boolean7 = stackAr4.isFull();
        boolean boolean8 = stackAr4.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr4.new Underflow();
        boolean boolean10 = stackAr4.isFull();
        stackAr4.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr4);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test047");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test048");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test049");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test050");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        stackAr12.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr12.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test051");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        boolean boolean11 = stackAr1.isFull();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test052");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test053");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow7 = stackAr1.new Overflow();
        java.lang.Object obj8 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test054");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(6);
        boolean boolean2 = stackAr1.isFull();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test055");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        boolean boolean26 = stackAr21.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr21.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test056");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr9.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        stackAr1.push((java.lang.Object) underflow14);
        stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test057");
        DataStructures.daikon.StackAr stackAr0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr.Overflow overflow1 = stackAr0.new Overflow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to DataStructures.daikon.StackAr$Overflow with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test058");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) 100L);
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test059");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj9 = stackAr8.top();
        java.lang.Object obj10 = stackAr8.top();
        boolean boolean11 = stackAr8.isFull();
        stackAr8.makeEmpty();
        boolean boolean13 = stackAr8.isFull();
        boolean boolean14 = stackAr8.isFull();
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj18 = stackAr17.top();
        java.lang.Object obj19 = stackAr17.top();
        boolean boolean20 = stackAr17.isFull();
        boolean boolean21 = stackAr17.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow22 = stackAr17.new Underflow();
        overflow15.addSuppressed((java.lang.Throwable) underflow22);
        overflow5.addSuppressed((java.lang.Throwable) underflow22);
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj27 = stackAr26.top();
        boolean boolean28 = stackAr26.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow29 = stackAr26.new Underflow();
        java.lang.Throwable[] throwableArray30 = underflow29.getSuppressed();
        underflow22.addSuppressed((java.lang.Throwable) underflow29);
        java.lang.Throwable[] throwableArray32 = underflow29.getSuppressed();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test060");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test061");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr15.new Overflow();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray21 = overflow19.getSuppressed();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        java.lang.Object obj27 = stackAr23.topAndPop();
        boolean boolean28 = stackAr23.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow29 = stackAr23.new Underflow();
        overflow19.addSuppressed((java.lang.Throwable) underflow29);
        overflow12.addSuppressed((java.lang.Throwable) underflow29);
        overflow5.addSuppressed((java.lang.Throwable) underflow29);
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj35 = stackAr34.top();
        java.lang.Object obj36 = stackAr34.top();
        boolean boolean37 = stackAr34.isFull();
        stackAr34.makeEmpty();
        boolean boolean39 = stackAr34.isFull();
        boolean boolean40 = stackAr34.isFull();
        boolean boolean41 = stackAr34.isFull();
        boolean boolean42 = stackAr34.isFull();
        DataStructures.daikon.StackAr.Overflow overflow43 = stackAr34.new Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow43);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test062");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isEmpty();
        boolean boolean21 = stackAr1.isEmpty();
        java.lang.Object obj22 = stackAr1.top();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test063");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr9.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        stackAr1.push((java.lang.Object) underflow14);
        java.lang.Object obj20 = stackAr1.top();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test064");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        boolean boolean26 = stackAr21.isFull();
        boolean boolean27 = stackAr21.isFull();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test065");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow5 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray6 = underflow5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = underflow5.getSuppressed();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test066");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr1.new Overflow();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test067");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        java.lang.Object obj28 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr30.new Overflow();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr33.new Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow38 = stackAr37.new Overflow();
        DataStructures.daikon.StackAr stackAr40 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow41 = stackAr40.new Overflow();
        overflow38.addSuppressed((java.lang.Throwable) overflow41);
        overflow31.addSuppressed((java.lang.Throwable) overflow38);
        java.lang.Throwable[] throwableArray44 = overflow38.getSuppressed();
        stackAr1.push((java.lang.Object) overflow38);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test068");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test069");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test070");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test071");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        stackAr1.push((java.lang.Object) (-1.0d));
        boolean boolean11 = stackAr1.isEmpty();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test072");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isEmpty();
        boolean boolean21 = stackAr1.isEmpty();
        boolean boolean22 = stackAr1.isEmpty();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test073");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test074");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test075");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test076");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        stackAr21.makeEmpty();
        boolean boolean26 = stackAr21.isFull();
        stackAr21.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj31 = stackAr30.top();
        java.lang.Object obj32 = stackAr30.top();
        java.lang.Object obj33 = stackAr30.topAndPop();
        stackAr21.push(obj33);
        boolean boolean35 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow36 = stackAr21.new Underflow();
        stackAr1.push((java.lang.Object) stackAr21);
        boolean boolean38 = stackAr21.isFull();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test077");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test078");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = underflow9.getSuppressed();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test079");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        boolean boolean10 = stackAr1.isFull();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test080");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        boolean boolean13 = stackAr10.isFull();
        boolean boolean14 = stackAr10.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr10.new Underflow();
        overflow8.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Throwable[] throwableArray17 = overflow8.getSuppressed();
        java.lang.Throwable[] throwableArray18 = overflow8.getSuppressed();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test081");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow5 = stackAr1.new Underflow();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test082");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        boolean boolean26 = stackAr21.isFull();
        stackAr21.makeEmpty();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test083");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow17.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj26 = stackAr25.top();
        java.lang.Object obj27 = stackAr25.top();
        boolean boolean28 = stackAr25.isFull();
        stackAr25.makeEmpty();
        boolean boolean30 = stackAr25.isFull();
        boolean boolean31 = stackAr25.isFull();
        DataStructures.daikon.StackAr.Overflow overflow32 = stackAr25.new Overflow();
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj35 = stackAr34.top();
        java.lang.Object obj36 = stackAr34.top();
        boolean boolean37 = stackAr34.isFull();
        boolean boolean38 = stackAr34.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow39 = stackAr34.new Underflow();
        overflow32.addSuppressed((java.lang.Throwable) underflow39);
        overflow17.addSuppressed((java.lang.Throwable) underflow39);
        DataStructures.daikon.StackAr stackAr43 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj44 = stackAr43.top();
        java.lang.Object obj45 = stackAr43.top();
        boolean boolean46 = stackAr43.isFull();
        stackAr43.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow48 = stackAr43.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.daikon.StackAr stackAr51 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj52 = stackAr51.top();
        java.lang.Object obj53 = stackAr51.top();
        boolean boolean54 = stackAr51.isFull();
        boolean boolean55 = stackAr51.isEmpty();
        stackAr51.makeEmpty();
        boolean boolean57 = stackAr51.isEmpty();
        DataStructures.daikon.StackAr stackAr59 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj60 = stackAr59.top();
        java.lang.Object obj61 = stackAr59.top();
        boolean boolean62 = stackAr59.isFull();
        boolean boolean63 = stackAr59.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow64 = stackAr59.new Underflow();
        DataStructures.daikon.StackAr stackAr66 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow67 = stackAr66.new Overflow();
        underflow64.addSuppressed((java.lang.Throwable) overflow67);
        stackAr51.push((java.lang.Object) underflow64);
        overflow48.addSuppressed((java.lang.Throwable) underflow64);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test084");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray14 = overflow13.getSuppressed();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test085");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test086");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj8 = stackAr7.top();
        java.lang.Object obj9 = stackAr7.top();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr7.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr7.new Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray12);
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test087");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        stackAr21.makeEmpty();
        boolean boolean27 = stackAr21.isEmpty();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test088");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow16 = stackAr1.new Underflow();
        boolean boolean17 = stackAr1.isEmpty();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test089");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        stackAr12.makeEmpty();
        boolean boolean27 = stackAr12.isEmpty();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test090");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr11.new Overflow();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) (byte) 10);
        stackAr1.push((java.lang.Object) stackAr32);
        java.lang.Object obj34 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test091");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr1.new Underflow();
        java.lang.Object obj29 = stackAr1.top();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test092");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj9 = stackAr8.top();
        java.lang.Object obj10 = stackAr8.top();
        boolean boolean11 = stackAr8.isFull();
        boolean boolean12 = stackAr8.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow13 = stackAr8.new Underflow();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr15.new Overflow();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        stackAr8.push((java.lang.Object) overflow19);
        overflow6.addSuppressed((java.lang.Throwable) overflow19);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj25 = stackAr24.top();
        java.lang.Object obj26 = stackAr24.top();
        boolean boolean27 = stackAr24.isFull();
        stackAr24.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr24.new Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow29);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test093");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr9.new Underflow();
        overflow5.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        underflow15.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        boolean boolean33 = stackAr27.isFull();
        java.lang.Object obj34 = stackAr27.top();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr27.new Underflow();
        underflow15.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow39 = stackAr38.new Overflow();
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow42 = stackAr41.new Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj46 = stackAr45.top();
        java.lang.Object obj47 = stackAr45.top();
        boolean boolean48 = stackAr45.isFull();
        stackAr45.makeEmpty();
        boolean boolean50 = stackAr45.isFull();
        boolean boolean51 = stackAr45.isFull();
        DataStructures.daikon.StackAr.Overflow overflow52 = stackAr45.new Overflow();
        DataStructures.daikon.StackAr stackAr54 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj55 = stackAr54.top();
        java.lang.Object obj56 = stackAr54.top();
        boolean boolean57 = stackAr54.isFull();
        boolean boolean58 = stackAr54.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow59 = stackAr54.new Underflow();
        overflow52.addSuppressed((java.lang.Throwable) underflow59);
        overflow42.addSuppressed((java.lang.Throwable) underflow59);
        DataStructures.daikon.StackAr stackAr63 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj64 = stackAr63.top();
        boolean boolean65 = stackAr63.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow66 = stackAr63.new Underflow();
        java.lang.Throwable[] throwableArray67 = underflow66.getSuppressed();
        underflow59.addSuppressed((java.lang.Throwable) underflow66);
        underflow15.addSuppressed((java.lang.Throwable) underflow66);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test094");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.top();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test095");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(6);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test096");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr11.new Overflow();
        java.lang.Object obj15 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow16 = stackAr11.new Underflow();
        stackAr1.push((java.lang.Object) stackAr11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test097");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr.Underflow underflow26 = stackAr12.new Underflow();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test098");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isEmpty();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test099");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.topAndPop();
        java.lang.Object obj24 = stackAr19.topAndPop();
        boolean boolean25 = stackAr19.isFull();
        stackAr1.push((java.lang.Object) boolean25);
        java.lang.Object obj27 = stackAr1.top();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test100");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 0);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj5 = stackAr4.top();
        java.lang.Object obj6 = stackAr4.top();
        boolean boolean7 = stackAr4.isFull();
        stackAr4.makeEmpty();
        boolean boolean9 = stackAr4.isFull();
        boolean boolean10 = stackAr4.isFull();
        java.lang.Object obj11 = stackAr4.top();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr4.new Underflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj15 = stackAr14.top();
        java.lang.Object obj16 = stackAr14.top();
        boolean boolean17 = stackAr14.isFull();
        stackAr14.makeEmpty();
        boolean boolean19 = stackAr14.isFull();
        boolean boolean20 = stackAr14.isFull();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr14.new Overflow();
        java.lang.Object obj22 = stackAr14.top();
        stackAr14.makeEmpty();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj26 = stackAr25.top();
        java.lang.Object obj27 = stackAr25.top();
        boolean boolean28 = stackAr25.isFull();
        stackAr25.makeEmpty();
        stackAr25.makeEmpty();
        stackAr14.push((java.lang.Object) stackAr25);
        DataStructures.daikon.StackAr.Overflow overflow32 = stackAr14.new Overflow();
        stackAr4.push((java.lang.Object) stackAr14);
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) (byte) 10);
        stackAr4.push((java.lang.Object) stackAr35);
        java.lang.Object obj37 = stackAr4.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj37);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test101");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow3 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test102");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.topAndPop();
        java.lang.Object obj24 = stackAr19.topAndPop();
        boolean boolean25 = stackAr19.isFull();
        stackAr1.push((java.lang.Object) boolean25);
        boolean boolean27 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr1.new Overflow();
        stackAr1.pop();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test103");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test104");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test105");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj8 = stackAr7.top();
        java.lang.Object obj9 = stackAr7.top();
        boolean boolean10 = stackAr7.isFull();
        java.lang.Object obj11 = stackAr7.topAndPop();
        boolean boolean12 = stackAr7.isEmpty();
        java.lang.Object obj13 = stackAr7.topAndPop();
        stackAr1.push(obj13);
        java.lang.Object obj15 = stackAr1.topAndPop();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test106");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj11 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test107");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test108");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj13 = stackAr1.top();
        java.lang.Object obj14 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test109");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr9.new Underflow();
        overflow5.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        underflow15.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray26 = underflow15.getSuppressed();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test110");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.top();
        boolean boolean9 = stackAr6.isFull();
        stackAr6.makeEmpty();
        boolean boolean11 = stackAr6.isFull();
        boolean boolean12 = stackAr6.isFull();
        boolean boolean13 = stackAr6.isFull();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr6.new Underflow();
        underflow4.addSuppressed((java.lang.Throwable) underflow14);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test111");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = null;
        stackAr1.push(obj10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test112");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr9.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        stackAr1.push((java.lang.Object) underflow14);
        stackAr1.pop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test113");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isEmpty();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test114");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr11.new Overflow();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) (byte) 10);
        stackAr1.push((java.lang.Object) stackAr32);
        stackAr32.makeEmpty();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test115");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test116");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        stackAr1.makeEmpty();
        boolean boolean16 = stackAr1.isFull();
        java.lang.Object obj17 = stackAr1.top();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test117");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow7 = stackAr1.new Overflow();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test118");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        DataStructures.daikon.StackAr.Underflow underflow2 = stackAr1.new Underflow();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test119");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow17.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj26 = stackAr25.top();
        java.lang.Object obj27 = stackAr25.top();
        boolean boolean28 = stackAr25.isFull();
        stackAr25.makeEmpty();
        boolean boolean30 = stackAr25.isFull();
        boolean boolean31 = stackAr25.isFull();
        DataStructures.daikon.StackAr.Overflow overflow32 = stackAr25.new Overflow();
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj35 = stackAr34.top();
        java.lang.Object obj36 = stackAr34.top();
        boolean boolean37 = stackAr34.isFull();
        boolean boolean38 = stackAr34.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow39 = stackAr34.new Underflow();
        overflow32.addSuppressed((java.lang.Throwable) underflow39);
        overflow17.addSuppressed((java.lang.Throwable) underflow39);
        java.lang.Throwable[] throwableArray42 = underflow39.getSuppressed();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test120");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow17.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj26 = stackAr25.top();
        java.lang.Object obj27 = stackAr25.top();
        boolean boolean28 = stackAr25.isFull();
        boolean boolean29 = stackAr25.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow30 = stackAr25.new Underflow();
        boolean boolean31 = stackAr25.isFull();
        DataStructures.daikon.StackAr.Overflow overflow32 = stackAr25.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow32);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test121");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test122");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr9.new Underflow();
        overflow5.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        underflow15.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        boolean boolean33 = stackAr27.isFull();
        java.lang.Object obj34 = stackAr27.top();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr27.new Underflow();
        underflow15.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow39 = stackAr38.new Overflow();
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow42 = stackAr41.new Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj46 = stackAr45.top();
        java.lang.Object obj47 = stackAr45.top();
        boolean boolean48 = stackAr45.isFull();
        stackAr45.makeEmpty();
        boolean boolean50 = stackAr45.isFull();
        boolean boolean51 = stackAr45.isFull();
        DataStructures.daikon.StackAr.Overflow overflow52 = stackAr45.new Overflow();
        DataStructures.daikon.StackAr stackAr54 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj55 = stackAr54.top();
        java.lang.Object obj56 = stackAr54.top();
        boolean boolean57 = stackAr54.isFull();
        boolean boolean58 = stackAr54.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow59 = stackAr54.new Underflow();
        overflow52.addSuppressed((java.lang.Throwable) underflow59);
        overflow42.addSuppressed((java.lang.Throwable) underflow59);
        DataStructures.daikon.StackAr stackAr63 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj64 = stackAr63.top();
        boolean boolean65 = stackAr63.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow66 = stackAr63.new Underflow();
        java.lang.Throwable[] throwableArray67 = underflow66.getSuppressed();
        underflow59.addSuppressed((java.lang.Throwable) underflow66);
        underflow15.addSuppressed((java.lang.Throwable) underflow59);
        java.lang.Throwable[] throwableArray70 = underflow15.getSuppressed();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test123");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.topAndPop();
        java.lang.Object obj24 = stackAr19.topAndPop();
        boolean boolean25 = stackAr19.isFull();
        stackAr1.push((java.lang.Object) boolean25);
        stackAr1.pop();
        boolean boolean28 = stackAr1.isEmpty();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test124");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow18 = stackAr16.new Underflow();
        underflow14.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr24.new Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        underflow14.addSuppressed((java.lang.Throwable) overflow25);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test125");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        underflow6.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray11 = underflow6.getSuppressed();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj14 = stackAr13.top();
        java.lang.Object obj15 = stackAr13.top();
        boolean boolean16 = stackAr13.isFull();
        stackAr13.makeEmpty();
        boolean boolean18 = stackAr13.isFull();
        stackAr13.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        java.lang.Object obj25 = stackAr22.topAndPop();
        stackAr13.push(obj25);
        boolean boolean27 = stackAr13.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr13.new Underflow();
        underflow6.addSuppressed((java.lang.Throwable) underflow28);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test126");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
        java.lang.Object obj8 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test127");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isFull();
        boolean boolean21 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test128");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test129");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        stackAr1.pop();
        stackAr1.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test130");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test131");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isFull();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test132");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr11.new Overflow();
        stackAr1.push((java.lang.Object) stackAr11);
        java.lang.Object obj31 = stackAr1.top();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test133");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        boolean boolean28 = stackAr21.isEmpty();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test134");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr21.new Overflow();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test135");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isEmpty();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test136");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr9.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        stackAr1.push((java.lang.Object) underflow14);
        java.lang.Object obj20 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr1.new Underflow();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test137");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test138");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        boolean boolean2 = stackAr1.isFull();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test139");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr1.new Overflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test140");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow22 = stackAr1.new Underflow();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test141");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Object obj4 = stackAr1.top();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test142");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        java.lang.Object obj19 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test143");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        java.lang.Object obj28 = stackAr1.top();
        boolean boolean29 = stackAr1.isFull();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test144");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test145");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr9.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        stackAr1.push((java.lang.Object) underflow14);
        stackAr1.pop();
        boolean boolean21 = stackAr1.isFull();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test146");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        boolean boolean17 = stackAr12.isFull();
        boolean boolean18 = stackAr12.isFull();
        boolean boolean19 = stackAr12.isFull();
        boolean boolean20 = stackAr12.isFull();
        stackAr1.push((java.lang.Object) boolean20);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test147");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test148");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test149");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        java.lang.Object obj13 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test150");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr1.new Overflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test151");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray15 = overflow9.getSuppressed();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        stackAr27.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj37 = stackAr36.top();
        java.lang.Object obj38 = stackAr36.top();
        java.lang.Object obj39 = stackAr36.topAndPop();
        stackAr27.push(obj39);
        stackAr27.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow42 = stackAr27.new Underflow();
        overflow21.addSuppressed((java.lang.Throwable) underflow42);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test152");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr1.new Overflow();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test153");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        java.lang.Object obj27 = stackAr23.topAndPop();
        boolean boolean28 = stackAr23.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr23.new Overflow();
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow32 = stackAr31.new Overflow();
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow35 = stackAr34.new Overflow();
        overflow32.addSuppressed((java.lang.Throwable) overflow35);
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow39 = stackAr38.new Overflow();
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow42 = stackAr41.new Overflow();
        overflow39.addSuppressed((java.lang.Throwable) overflow42);
        overflow32.addSuppressed((java.lang.Throwable) overflow39);
        DataStructures.daikon.StackAr stackAr46 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow47 = stackAr46.new Overflow();
        DataStructures.daikon.StackAr stackAr49 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow50 = stackAr49.new Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow50);
        java.lang.Throwable[] throwableArray52 = overflow47.getSuppressed();
        overflow32.addSuppressed((java.lang.Throwable) overflow47);
        DataStructures.daikon.StackAr stackAr55 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj56 = stackAr55.top();
        java.lang.Object obj57 = stackAr55.top();
        boolean boolean58 = stackAr55.isFull();
        stackAr55.makeEmpty();
        boolean boolean60 = stackAr55.isFull();
        boolean boolean61 = stackAr55.isFull();
        DataStructures.daikon.StackAr.Overflow overflow62 = stackAr55.new Overflow();
        DataStructures.daikon.StackAr stackAr64 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj65 = stackAr64.top();
        java.lang.Object obj66 = stackAr64.top();
        boolean boolean67 = stackAr64.isFull();
        boolean boolean68 = stackAr64.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow69 = stackAr64.new Underflow();
        overflow62.addSuppressed((java.lang.Throwable) underflow69);
        overflow47.addSuppressed((java.lang.Throwable) underflow69);
        DataStructures.daikon.StackAr stackAr73 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj74 = stackAr73.top();
        java.lang.Object obj75 = stackAr73.top();
        boolean boolean76 = stackAr73.isFull();
        stackAr73.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow78 = stackAr73.new Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow78);
        overflow29.addSuppressed((java.lang.Throwable) overflow78);
        stackAr1.push((java.lang.Object) overflow29);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test154");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test155");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isEmpty();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test156");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        boolean boolean13 = stackAr1.isFull();
        boolean boolean14 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        boolean boolean19 = stackAr16.isFull();
        boolean boolean20 = stackAr16.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr16.new Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = underflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray23);
        boolean boolean25 = stackAr1.isFull();
        stackAr1.makeEmpty();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test157");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray15 = overflow9.getSuppressed();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        java.lang.Throwable[] throwableArray26 = overflow21.getSuppressed();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test158");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj13 = stackAr1.top();
        java.lang.Object obj14 = stackAr1.top();
        java.lang.Object obj15 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr24.new Overflow();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr27.new Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        overflow18.addSuppressed((java.lang.Throwable) overflow25);
        java.lang.Throwable[] throwableArray31 = overflow25.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray31);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test159");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test160");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test161");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        java.lang.Object obj10 = stackAr1.top();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test162");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow17.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj26 = stackAr25.top();
        java.lang.Object obj27 = stackAr25.top();
        boolean boolean28 = stackAr25.isFull();
        stackAr25.makeEmpty();
        boolean boolean30 = stackAr25.isFull();
        boolean boolean31 = stackAr25.isFull();
        DataStructures.daikon.StackAr.Overflow overflow32 = stackAr25.new Overflow();
        java.lang.Object obj33 = stackAr25.top();
        stackAr25.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr25.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow36 = stackAr25.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow36);
        java.lang.Throwable[] throwableArray38 = overflow36.getSuppressed();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test163");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr.Underflow underflow2 = stackAr1.new Underflow();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test164");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr1.new Underflow();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test165");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        stackAr1.pop();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test166");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        java.lang.Object obj21 = stackAr1.topAndPop();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test167");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test168");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        java.lang.Object obj15 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj17 = stackAr1.top();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test169");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test170");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow7 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.top();
        boolean boolean14 = stackAr9.isFull();
        java.lang.Object obj15 = stackAr9.top();
        stackAr9.push((java.lang.Object) (-1));
        stackAr1.push((java.lang.Object) (-1));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test171");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr12.isEmpty();
        boolean boolean20 = stackAr12.isEmpty();
        java.lang.Object obj21 = stackAr12.top();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test172");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test173");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean9 = stackAr8.isFull();
        stackAr8.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr8.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr8.new Underflow();
        underflow6.addSuppressed((java.lang.Throwable) underflow12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test174");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr12.isEmpty();
        java.lang.Object obj20 = null;
        stackAr12.push(obj20);
        java.lang.Object obj22 = stackAr12.topAndPop();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test175");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow17.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray24 = overflow2.getSuppressed();
        java.lang.Throwable[] throwableArray25 = overflow2.getSuppressed();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test176");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 3);
        stackAr1.pop();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test177");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        stackAr1.pop();
        java.lang.Object obj16 = stackAr1.topAndPop();
        boolean boolean17 = stackAr1.isFull();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test178");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr7.new Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        boolean boolean15 = stackAr11.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow16 = stackAr11.new Underflow();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        stackAr11.push((java.lang.Object) overflow22);
        overflow8.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        boolean boolean33 = stackAr27.isFull();
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr27.new Overflow();
        java.lang.Object obj35 = stackAr27.top();
        stackAr27.makeEmpty();
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj39 = stackAr38.top();
        java.lang.Object obj40 = stackAr38.top();
        boolean boolean41 = stackAr38.isFull();
        stackAr38.makeEmpty();
        stackAr38.makeEmpty();
        stackAr27.push((java.lang.Object) stackAr38);
        DataStructures.daikon.StackAr.Overflow overflow45 = stackAr27.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow46 = stackAr27.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow47 = stackAr27.new Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray49 = overflow47.getSuppressed();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test179");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr23.new Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray27 = overflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray27);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr1.new Overflow();
        java.lang.Object obj30 = stackAr1.topAndPop();
        boolean boolean31 = stackAr1.isEmpty();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test180");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test181");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr9.new Underflow();
        overflow5.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        underflow15.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable throwable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            underflow15.addSuppressed(throwable26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test182");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test183");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        java.lang.Object obj12 = stackAr1.topAndPop();
        java.lang.Object obj13 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test184");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        boolean boolean13 = stackAr10.isFull();
        boolean boolean14 = stackAr10.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr10.new Underflow();
        overflow8.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj19 = stackAr18.top();
        java.lang.Object obj20 = stackAr18.top();
        boolean boolean21 = stackAr18.isFull();
        stackAr18.makeEmpty();
        boolean boolean23 = stackAr18.isFull();
        boolean boolean24 = stackAr18.isFull();
        java.lang.Object obj25 = stackAr18.top();
        DataStructures.daikon.StackAr.Underflow underflow26 = stackAr18.new Underflow();
        underflow15.addSuppressed((java.lang.Throwable) underflow26);
        java.lang.Throwable[] throwableArray28 = underflow26.getSuppressed();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj31 = stackAr30.top();
        java.lang.Object obj32 = stackAr30.top();
        boolean boolean33 = stackAr30.isFull();
        java.lang.Object obj34 = stackAr30.top();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr30.new Underflow();
        underflow26.addSuppressed((java.lang.Throwable) underflow35);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test185");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        boolean boolean13 = stackAr1.isFull();
        boolean boolean14 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        boolean boolean19 = stackAr16.isFull();
        boolean boolean20 = stackAr16.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr16.new Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = underflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray23);
        boolean boolean25 = stackAr1.isEmpty();
        java.lang.Object obj26 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test186");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
        boolean boolean11 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test187");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        java.lang.Object obj15 = stackAr1.topAndPop();
        boolean boolean16 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow17 = stackAr1.new Underflow();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test188");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test189");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr7.new Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow8);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr22.new Overflow();
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj32 = stackAr31.top();
        stackAr31.makeEmpty();
        boolean boolean34 = stackAr31.isFull();
        stackAr22.push((java.lang.Object) stackAr31);
        DataStructures.daikon.StackAr.Overflow overflow36 = stackAr31.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow37 = stackAr31.new Overflow();
        overflow4.addSuppressed((java.lang.Throwable) overflow37);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test190");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow8.addSuppressed(throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test191");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isFull();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test192");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '4');
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test193");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isFull();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test194");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr22.new Overflow();
        java.lang.Object obj26 = stackAr22.topAndPop();
        stackAr1.push(obj26);
        boolean boolean28 = stackAr1.isFull();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test195");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        stackAr21.makeEmpty();
        boolean boolean26 = stackAr21.isFull();
        stackAr21.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj31 = stackAr30.top();
        java.lang.Object obj32 = stackAr30.top();
        java.lang.Object obj33 = stackAr30.topAndPop();
        stackAr21.push(obj33);
        boolean boolean35 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow36 = stackAr21.new Underflow();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr.Overflow overflow38 = stackAr21.new Overflow();
        DataStructures.daikon.StackAr stackAr40 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow41 = stackAr40.new Overflow();
        DataStructures.daikon.StackAr stackAr43 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow44 = stackAr43.new Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow44);
        DataStructures.daikon.StackAr stackAr47 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow48 = stackAr47.new Overflow();
        DataStructures.daikon.StackAr stackAr50 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow51 = stackAr50.new Overflow();
        overflow48.addSuppressed((java.lang.Throwable) overflow51);
        overflow41.addSuppressed((java.lang.Throwable) overflow48);
        DataStructures.daikon.StackAr stackAr55 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow56 = stackAr55.new Overflow();
        DataStructures.daikon.StackAr stackAr58 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow59 = stackAr58.new Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow59);
        java.lang.Throwable[] throwableArray61 = overflow56.getSuppressed();
        overflow41.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.daikon.StackAr stackAr64 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj65 = stackAr64.top();
        java.lang.Object obj66 = stackAr64.top();
        boolean boolean67 = stackAr64.isFull();
        stackAr64.makeEmpty();
        boolean boolean69 = stackAr64.isFull();
        boolean boolean70 = stackAr64.isFull();
        DataStructures.daikon.StackAr.Overflow overflow71 = stackAr64.new Overflow();
        java.lang.Object obj72 = stackAr64.top();
        stackAr64.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow74 = stackAr64.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow75 = stackAr64.new Overflow();
        overflow41.addSuppressed((java.lang.Throwable) overflow75);
        overflow38.addSuppressed((java.lang.Throwable) overflow75);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test196");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr1.new Overflow();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test197");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        boolean boolean13 = stackAr10.isFull();
        stackAr10.makeEmpty();
        boolean boolean15 = stackAr10.isFull();
        boolean boolean16 = stackAr10.isFull();
        java.lang.Object obj17 = stackAr10.top();
        DataStructures.daikon.StackAr.Underflow underflow18 = stackAr10.new Underflow();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj21 = stackAr20.top();
        java.lang.Object obj22 = stackAr20.top();
        boolean boolean23 = stackAr20.isFull();
        stackAr20.makeEmpty();
        boolean boolean25 = stackAr20.isFull();
        boolean boolean26 = stackAr20.isFull();
        DataStructures.daikon.StackAr.Overflow overflow27 = stackAr20.new Overflow();
        java.lang.Object obj28 = stackAr20.top();
        stackAr20.makeEmpty();
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj32 = stackAr31.top();
        java.lang.Object obj33 = stackAr31.top();
        boolean boolean34 = stackAr31.isFull();
        stackAr31.makeEmpty();
        stackAr31.makeEmpty();
        stackAr20.push((java.lang.Object) stackAr31);
        DataStructures.daikon.StackAr.Overflow overflow38 = stackAr20.new Overflow();
        stackAr10.push((java.lang.Object) stackAr20);
        java.lang.Object obj40 = stackAr20.topAndPop();
        stackAr1.push(obj40);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test198");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr1.new Overflow();
        boolean boolean10 = stackAr1.isFull();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test199");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isEmpty();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test200");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test201");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr12.isEmpty();
        stackAr12.makeEmpty();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test202");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr5.top();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr5.new Underflow();
        java.lang.Object obj13 = stackAr5.topAndPop();
        java.lang.Object obj14 = stackAr5.topAndPop();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test203");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isFull();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test204");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr11.new Overflow();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) (byte) 10);
        stackAr1.push((java.lang.Object) stackAr32);
        // The following exception was thrown during execution in test generation
        try {
            stackAr32.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test205");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow3 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test206");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (byte) 0);
        boolean boolean9 = stackAr8.isEmpty();
        stackAr1.push((java.lang.Object) boolean9);
        stackAr1.pop();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test207");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow8 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        boolean boolean13 = stackAr10.isFull();
        stackAr10.makeEmpty();
        boolean boolean15 = stackAr10.isFull();
        boolean boolean16 = stackAr10.isFull();
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr10.new Overflow();
        stackAr10.push((java.lang.Object) (-1.0d));
        stackAr10.pop();
        stackAr1.push((java.lang.Object) stackAr10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test208");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test209");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj19 = stackAr1.topAndPop();
        java.lang.Object obj20 = stackAr1.topAndPop();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test210");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        boolean boolean13 = stackAr10.isFull();
        boolean boolean14 = stackAr10.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr10.new Underflow();
        overflow8.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Throwable[] throwableArray17 = overflow8.getSuppressed();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.topAndPop();
        boolean boolean24 = stackAr19.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr19.new Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj29 = stackAr28.top();
        java.lang.Object obj30 = stackAr28.top();
        boolean boolean31 = stackAr28.isFull();
        java.lang.Object obj32 = stackAr28.top();
        DataStructures.daikon.StackAr.Overflow overflow33 = stackAr28.new Overflow();
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj36 = stackAr35.top();
        java.lang.Object obj37 = stackAr35.top();
        boolean boolean38 = stackAr35.isFull();
        boolean boolean39 = stackAr35.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow40 = stackAr35.new Underflow();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow43 = stackAr42.new Overflow();
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow46 = stackAr45.new Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow46);
        stackAr35.push((java.lang.Object) overflow46);
        overflow33.addSuppressed((java.lang.Throwable) overflow46);
        overflow25.addSuppressed((java.lang.Throwable) overflow46);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test211");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test212");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray10 = overflow9.getSuppressed();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test213");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isFull();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test214");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray21 = overflow20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = overflow20.getSuppressed();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test215");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr1.new Overflow();
        boolean boolean11 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj13 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr1.new Overflow();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test216");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-3));
        stackAr1.makeEmpty();
        java.lang.Object obj14 = stackAr1.top();
        boolean boolean15 = stackAr1.isFull();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test217");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj14 = stackAr13.top();
        java.lang.Object obj15 = stackAr13.top();
        boolean boolean16 = stackAr13.isFull();
        stackAr13.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr13.new Overflow();
        java.lang.Object obj19 = stackAr13.top();
        stackAr13.makeEmpty();
        boolean boolean21 = stackAr13.isFull();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        stackAr23.makeEmpty();
        boolean boolean28 = stackAr23.isFull();
        boolean boolean29 = stackAr23.isFull();
        DataStructures.daikon.StackAr.Overflow overflow30 = stackAr23.new Overflow();
        java.lang.Object obj31 = stackAr23.top();
        stackAr23.makeEmpty();
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj35 = stackAr34.top();
        java.lang.Object obj36 = stackAr34.top();
        boolean boolean37 = stackAr34.isFull();
        stackAr34.makeEmpty();
        stackAr34.makeEmpty();
        stackAr23.push((java.lang.Object) stackAr34);
        DataStructures.daikon.StackAr.Overflow overflow41 = stackAr34.new Overflow();
        stackAr13.push((java.lang.Object) overflow41);
        DataStructures.daikon.StackAr.Overflow overflow43 = stackAr13.new Overflow();
        underflow11.addSuppressed((java.lang.Throwable) overflow43);
        DataStructures.daikon.StackAr stackAr46 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj47 = stackAr46.top();
        java.lang.Object obj48 = stackAr46.top();
        DataStructures.daikon.StackAr.Overflow overflow49 = stackAr46.new Overflow();
        java.lang.Throwable[] throwableArray50 = overflow49.getSuppressed();
        DataStructures.daikon.StackAr stackAr52 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow53 = stackAr52.new Overflow();
        DataStructures.daikon.StackAr stackAr55 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow56 = stackAr55.new Overflow();
        overflow53.addSuppressed((java.lang.Throwable) overflow56);
        java.lang.Throwable[] throwableArray58 = overflow56.getSuppressed();
        DataStructures.daikon.StackAr stackAr60 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj61 = stackAr60.top();
        java.lang.Object obj62 = stackAr60.top();
        boolean boolean63 = stackAr60.isFull();
        boolean boolean64 = stackAr60.isEmpty();
        stackAr60.makeEmpty();
        java.lang.Object obj66 = stackAr60.topAndPop();
        java.lang.Object obj67 = stackAr60.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow68 = stackAr60.new Underflow();
        boolean boolean69 = stackAr60.isFull();
        DataStructures.daikon.StackAr.Overflow overflow70 = stackAr60.new Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow70);
        overflow49.addSuppressed((java.lang.Throwable) overflow70);
        underflow11.addSuppressed((java.lang.Throwable) overflow49);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test218");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr7.new Overflow();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr10.new Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow11.getSuppressed();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj16 = stackAr15.top();
        java.lang.Object obj17 = stackAr15.top();
        boolean boolean18 = stackAr15.isFull();
        java.lang.Object obj19 = stackAr15.topAndPop();
        boolean boolean20 = stackAr15.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr15.new Underflow();
        overflow11.addSuppressed((java.lang.Throwable) underflow21);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr24.new Overflow();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr27.new Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow28.getSuppressed();
        underflow21.addSuppressed((java.lang.Throwable) overflow28);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj34 = stackAr33.top();
        java.lang.Object obj35 = stackAr33.top();
        boolean boolean36 = stackAr33.isFull();
        stackAr33.makeEmpty();
        boolean boolean38 = stackAr33.isFull();
        boolean boolean39 = stackAr33.isFull();
        DataStructures.daikon.StackAr.Overflow overflow40 = stackAr33.new Overflow();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj43 = stackAr42.top();
        java.lang.Object obj44 = stackAr42.top();
        boolean boolean45 = stackAr42.isFull();
        boolean boolean46 = stackAr42.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow47 = stackAr42.new Underflow();
        overflow40.addSuppressed((java.lang.Throwable) underflow47);
        java.lang.Throwable[] throwableArray49 = overflow40.getSuppressed();
        underflow21.addSuppressed((java.lang.Throwable) overflow40);
        overflow5.addSuppressed((java.lang.Throwable) overflow40);
        DataStructures.daikon.StackAr stackAr53 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj54 = stackAr53.top();
        stackAr53.makeEmpty();
        DataStructures.daikon.StackAr stackAr57 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj58 = stackAr57.top();
        java.lang.Object obj59 = stackAr57.top();
        boolean boolean60 = stackAr57.isFull();
        boolean boolean61 = stackAr57.isEmpty();
        stackAr53.push((java.lang.Object) stackAr57);
        java.lang.Object obj63 = stackAr53.topAndPop();
        boolean boolean64 = stackAr53.isFull();
        DataStructures.daikon.StackAr.Underflow underflow65 = stackAr53.new Underflow();
        overflow40.addSuppressed((java.lang.Throwable) underflow65);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test219");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test220");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 0);
        java.lang.Object obj2 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test221");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        java.lang.Object obj13 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean15 = stackAr1.isEmpty();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test222");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        boolean boolean13 = stackAr10.isFull();
        boolean boolean14 = stackAr10.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr10.new Underflow();
        overflow8.addSuppressed((java.lang.Throwable) underflow15);
        java.lang.Throwable[] throwableArray17 = overflow8.getSuppressed();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.topAndPop();
        boolean boolean24 = stackAr19.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr19.new Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj29 = stackAr28.top();
        java.lang.Object obj30 = stackAr28.top();
        boolean boolean31 = stackAr28.isFull();
        stackAr28.makeEmpty();
        boolean boolean33 = stackAr28.isFull();
        boolean boolean34 = stackAr28.isFull();
        DataStructures.daikon.StackAr.Overflow overflow35 = stackAr28.new Overflow();
        java.lang.Object obj36 = stackAr28.top();
        stackAr28.makeEmpty();
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj40 = stackAr39.top();
        java.lang.Object obj41 = stackAr39.top();
        boolean boolean42 = stackAr39.isFull();
        stackAr39.makeEmpty();
        stackAr39.makeEmpty();
        stackAr28.push((java.lang.Object) stackAr39);
        DataStructures.daikon.StackAr.Overflow overflow46 = stackAr39.new Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow46);
        DataStructures.daikon.StackAr stackAr49 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj50 = stackAr49.top();
        java.lang.Object obj51 = stackAr49.top();
        DataStructures.daikon.StackAr.Overflow overflow52 = stackAr49.new Overflow();
        java.lang.Object obj53 = stackAr49.top();
        DataStructures.daikon.StackAr.Underflow underflow54 = stackAr49.new Underflow();
        overflow46.addSuppressed((java.lang.Throwable) underflow54);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test223");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean13 = stackAr1.isFull();
        boolean boolean14 = stackAr1.isEmpty();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test224");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr1.new Overflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test225");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        boolean boolean13 = stackAr1.isFull();
        java.lang.Object obj14 = stackAr1.topAndPop();
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.Object obj16 = stackAr1.topAndPop();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test226");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr14.new Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        overflow12.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray25 = overflow19.getSuppressed();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        stackAr27.makeEmpty();
        boolean boolean30 = stackAr27.isFull();
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr27.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow19.getSuppressed();
        underflow9.addSuppressed((java.lang.Throwable) overflow19);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test227");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
        boolean boolean15 = stackAr1.isFull();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test228");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr1.new Overflow();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test229");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr1.new Underflow();
        boolean boolean13 = stackAr1.isFull();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test230");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr23.new Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray27 = overflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray27);
        java.lang.Object obj29 = stackAr1.topAndPop();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test231");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        stackAr1.push((java.lang.Object) (-1.0d));
        boolean boolean11 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test232");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test233");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr14.new Overflow();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr24.new Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        overflow15.addSuppressed((java.lang.Throwable) overflow22);
        overflow12.addSuppressed((java.lang.Throwable) overflow22);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test234");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test235");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        java.lang.Object obj14 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr11.new Overflow();
        stackAr1.push((java.lang.Object) overflow15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test236");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test237");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr1.new Overflow();
        boolean boolean11 = stackAr1.isEmpty();
        boolean boolean12 = stackAr1.isFull();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test238");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test239");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj19 = stackAr12.top();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        stackAr21.makeEmpty();
        boolean boolean26 = stackAr21.isFull();
        boolean boolean27 = stackAr21.isFull();
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr21.new Overflow();
        java.lang.Object obj29 = stackAr21.top();
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj32 = stackAr31.top();
        java.lang.Object obj33 = stackAr31.top();
        boolean boolean34 = stackAr31.isFull();
        java.lang.Object obj35 = stackAr31.top();
        boolean boolean36 = stackAr31.isEmpty();
        stackAr21.push((java.lang.Object) boolean36);
        stackAr21.pop();
        stackAr21.makeEmpty();
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj42 = stackAr41.top();
        java.lang.Object obj43 = stackAr41.top();
        boolean boolean44 = stackAr41.isFull();
        boolean boolean45 = stackAr41.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow46 = stackAr41.new Underflow();
        boolean boolean47 = stackAr41.isFull();
        stackAr41.makeEmpty();
        stackAr41.makeEmpty();
        java.lang.Object obj50 = stackAr41.topAndPop();
        stackAr21.push((java.lang.Object) stackAr41);
        boolean boolean52 = stackAr41.isFull();
        stackAr12.push((java.lang.Object) stackAr41);
        stackAr12.makeEmpty();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test240");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.top();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test241");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-3));
        stackAr1.makeEmpty();
        java.lang.Object obj14 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test242");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test243");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test244");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isFull();
        boolean boolean13 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray15 = underflow14.getSuppressed();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test245");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test246");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test247");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(5);
        boolean boolean2 = stackAr1.isFull();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test248");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 10);
        DataStructures.daikon.StackAr.Underflow underflow2 = stackAr1.new Underflow();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test249");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray15 = overflow9.getSuppressed();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray25 = overflow21.getSuppressed();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        boolean boolean33 = stackAr27.isFull();
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr27.new Overflow();
        java.lang.Object obj35 = stackAr27.top();
        stackAr27.makeEmpty();
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj39 = stackAr38.top();
        java.lang.Object obj40 = stackAr38.top();
        boolean boolean41 = stackAr38.isFull();
        stackAr38.makeEmpty();
        stackAr38.makeEmpty();
        stackAr27.push((java.lang.Object) stackAr38);
        stackAr27.makeEmpty();
        boolean boolean46 = stackAr27.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow47 = stackAr27.new Underflow();
        overflow21.addSuppressed((java.lang.Throwable) underflow47);
        DataStructures.daikon.StackAr stackAr50 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow51 = stackAr50.new Overflow();
        DataStructures.daikon.StackAr stackAr53 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow54 = stackAr53.new Overflow();
        overflow51.addSuppressed((java.lang.Throwable) overflow54);
        java.lang.Throwable[] throwableArray56 = overflow51.getSuppressed();
        underflow47.addSuppressed((java.lang.Throwable) overflow51);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test250");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(6);
        stackAr1.push((java.lang.Object) (-4));
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test251");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr9.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow13 = stackAr9.new Underflow();
        boolean boolean14 = stackAr9.isFull();
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.Object obj16 = stackAr1.top();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test252");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr12.isEmpty();
        java.lang.Object obj20 = null;
        stackAr12.push(obj20);
        boolean boolean22 = stackAr12.isFull();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test253");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-3));
        boolean boolean13 = stackAr1.isEmpty();
        boolean boolean14 = stackAr1.isEmpty();
        stackAr1.pop();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test254");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow8 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test255");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(5);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj4 = stackAr3.top();
        java.lang.Object obj5 = stackAr3.top();
        boolean boolean6 = stackAr3.isFull();
        boolean boolean7 = stackAr3.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow8 = stackAr3.new Underflow();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr10.new Overflow();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow14);
        stackAr3.push((java.lang.Object) overflow14);
        java.lang.Object obj17 = stackAr3.topAndPop();
        boolean boolean18 = stackAr3.isFull();
        java.lang.Object obj19 = stackAr3.topAndPop();
        stackAr1.push(obj19);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr1.new Overflow();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test256");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        boolean boolean26 = stackAr12.isEmpty();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test257");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj11 = stackAr1.top();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test258");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test259");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(0);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj4 = stackAr3.top();
        stackAr3.makeEmpty();
        boolean boolean6 = stackAr3.isFull();
        DataStructures.daikon.StackAr.Overflow overflow7 = stackAr3.new Overflow();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        java.lang.Object obj15 = stackAr9.topAndPop();
        stackAr3.push(obj15);
        java.lang.Object obj17 = stackAr3.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr3);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test260");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj14 = stackAr13.top();
        java.lang.Object obj15 = stackAr13.top();
        boolean boolean16 = stackAr13.isFull();
        stackAr13.makeEmpty();
        boolean boolean18 = stackAr13.isFull();
        boolean boolean19 = stackAr13.isFull();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr13.new Overflow();
        java.lang.Object obj21 = stackAr13.top();
        stackAr13.makeEmpty();
        boolean boolean23 = stackAr13.isFull();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow26 = stackAr25.new Overflow();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr28.new Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow29);
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow33 = stackAr32.new Overflow();
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow36 = stackAr35.new Overflow();
        overflow33.addSuppressed((java.lang.Throwable) overflow36);
        overflow26.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray39 = overflow33.getSuppressed();
        stackAr13.push((java.lang.Object) throwableArray39);
        DataStructures.daikon.StackAr.Overflow overflow41 = stackAr13.new Overflow();
        stackAr1.push((java.lang.Object) overflow41);
        stackAr1.makeEmpty();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test261");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test262");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        stackAr1.pop();
        java.lang.Object obj16 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj19 = stackAr18.top();
        java.lang.Object obj20 = stackAr18.top();
        boolean boolean21 = stackAr18.isFull();
        stackAr18.makeEmpty();
        boolean boolean23 = stackAr18.isFull();
        boolean boolean24 = stackAr18.isFull();
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        boolean boolean31 = stackAr27.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow32 = stackAr27.new Underflow();
        overflow25.addSuppressed((java.lang.Throwable) underflow32);
        java.lang.Throwable[] throwableArray34 = overflow25.getSuppressed();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj37 = stackAr36.top();
        java.lang.Object obj38 = stackAr36.top();
        boolean boolean39 = stackAr36.isFull();
        java.lang.Object obj40 = stackAr36.topAndPop();
        boolean boolean41 = stackAr36.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow42 = stackAr36.new Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow42);
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj46 = stackAr45.top();
        java.lang.Object obj47 = stackAr45.top();
        boolean boolean48 = stackAr45.isFull();
        stackAr45.makeEmpty();
        boolean boolean50 = stackAr45.isFull();
        boolean boolean51 = stackAr45.isFull();
        DataStructures.daikon.StackAr.Overflow overflow52 = stackAr45.new Overflow();
        java.lang.Object obj53 = stackAr45.top();
        stackAr45.makeEmpty();
        DataStructures.daikon.StackAr stackAr56 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj57 = stackAr56.top();
        java.lang.Object obj58 = stackAr56.top();
        boolean boolean59 = stackAr56.isFull();
        stackAr56.makeEmpty();
        stackAr56.makeEmpty();
        stackAr45.push((java.lang.Object) stackAr56);
        DataStructures.daikon.StackAr.Overflow overflow63 = stackAr56.new Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow63);
        stackAr1.push((java.lang.Object) overflow63);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test263");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr1.new Underflow();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test264");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr1.new Overflow();
        stackAr1.pop();
        java.lang.Object obj24 = stackAr1.top();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test265");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray13 = overflow12.getSuppressed();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test266");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr1.new Overflow();
        boolean boolean11 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr1.new Underflow();
        boolean boolean13 = stackAr1.isEmpty();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test267");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray7 = overflow6.getSuppressed();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test268");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        java.lang.Object obj21 = stackAr1.top();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test269");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow5 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test270");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
        boolean boolean11 = stackAr1.isFull();
        stackAr1.makeEmpty();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test271");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        boolean boolean3 = stackAr1.isFull();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test272");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj5 = stackAr4.top();
        java.lang.Object obj6 = stackAr4.top();
        boolean boolean7 = stackAr4.isFull();
        boolean boolean8 = stackAr4.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr4.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr14.new Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow15);
        stackAr4.push((java.lang.Object) overflow15);
        java.lang.Object obj18 = stackAr4.topAndPop();
        boolean boolean19 = stackAr4.isFull();
        java.lang.Object obj20 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test273");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        boolean boolean10 = stackAr1.isEmpty();
        boolean boolean11 = stackAr1.isEmpty();
        boolean boolean12 = stackAr1.isFull();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test274");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr23.new Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray27 = overflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray27);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow30 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray31 = underflow30.getSuppressed();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test275");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test276");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        java.lang.Object obj15 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean17 = stackAr1.isEmpty();
        java.lang.Object obj18 = stackAr1.top();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test277");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test278");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr1.new Overflow();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test279");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean8 = stackAr1.isEmpty();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test280");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test281");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow5 = stackAr1.new Underflow();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test282");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        boolean boolean9 = stackAr1.isFull();
        java.lang.Object obj10 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test283");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr1.new Underflow();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test284");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        stackAr1.push((java.lang.Object) (-1.0d));
        boolean boolean11 = stackAr1.isFull();
        stackAr1.pop();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test285");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        stackAr21.makeEmpty();
        boolean boolean24 = stackAr21.isFull();
        stackAr12.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        stackAr27.push((java.lang.Object) (-10));
        boolean boolean35 = stackAr27.isFull();
        java.lang.Object obj36 = stackAr27.topAndPop();
        stackAr27.makeEmpty();
        stackAr12.push((java.lang.Object) stackAr27);
        // The following exception was thrown during execution in test generation
        try {
            stackAr27.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test286");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow16 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test287");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr5.top();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr5.new Underflow();
        java.lang.Object obj13 = stackAr5.top();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test288");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        boolean boolean6 = stackAr1.isEmpty();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test289");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test290");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow16 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj19 = stackAr18.top();
        java.lang.Object obj20 = stackAr18.top();
        boolean boolean21 = stackAr18.isFull();
        stackAr18.makeEmpty();
        boolean boolean23 = stackAr18.isFull();
        boolean boolean24 = stackAr18.isFull();
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr18.new Overflow();
        boolean boolean26 = stackAr18.isFull();
        stackAr18.makeEmpty();
        stackAr18.push((java.lang.Object) (-100));
        java.lang.Object obj30 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow31 = stackAr18.new Underflow();
        underflow16.addSuppressed((java.lang.Throwable) underflow31);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test291");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow29 = stackAr1.new Underflow();
        stackAr1.makeEmpty();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test292");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        boolean boolean10 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        java.lang.Throwable[] throwableArray19 = overflow17.getSuppressed();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        java.lang.Object obj25 = stackAr21.topAndPop();
        boolean boolean26 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow27 = stackAr21.new Underflow();
        overflow17.addSuppressed((java.lang.Throwable) underflow27);
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr30.new Overflow();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr33.new Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        java.lang.Throwable[] throwableArray36 = overflow34.getSuppressed();
        underflow27.addSuppressed((java.lang.Throwable) overflow34);
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj40 = stackAr39.top();
        java.lang.Object obj41 = stackAr39.top();
        boolean boolean42 = stackAr39.isFull();
        stackAr39.makeEmpty();
        boolean boolean44 = stackAr39.isFull();
        boolean boolean45 = stackAr39.isFull();
        DataStructures.daikon.StackAr.Overflow overflow46 = stackAr39.new Overflow();
        DataStructures.daikon.StackAr stackAr48 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj49 = stackAr48.top();
        java.lang.Object obj50 = stackAr48.top();
        boolean boolean51 = stackAr48.isFull();
        boolean boolean52 = stackAr48.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow53 = stackAr48.new Underflow();
        overflow46.addSuppressed((java.lang.Throwable) underflow53);
        java.lang.Throwable[] throwableArray55 = overflow46.getSuppressed();
        underflow27.addSuppressed((java.lang.Throwable) overflow46);
        overflow11.addSuppressed((java.lang.Throwable) overflow46);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test293");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow10 = stackAr1.new Underflow();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj14 = stackAr13.top();
        java.lang.Object obj15 = stackAr13.top();
        boolean boolean16 = stackAr13.isFull();
        stackAr13.makeEmpty();
        boolean boolean18 = stackAr13.isFull();
        boolean boolean19 = stackAr13.isFull();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr13.new Overflow();
        boolean boolean21 = stackAr13.isFull();
        stackAr13.makeEmpty();
        stackAr13.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr13.new Overflow();
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr1.pop();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test294");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(6);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test295");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow7 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr9.new Overflow();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr12.new Overflow();
        overflow10.addSuppressed((java.lang.Throwable) overflow13);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        overflow10.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr24.new Overflow();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr27.new Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow28);
        java.lang.Throwable[] throwableArray30 = overflow25.getSuppressed();
        overflow10.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj34 = stackAr33.top();
        java.lang.Object obj35 = stackAr33.top();
        boolean boolean36 = stackAr33.isFull();
        stackAr33.makeEmpty();
        boolean boolean38 = stackAr33.isFull();
        boolean boolean39 = stackAr33.isFull();
        DataStructures.daikon.StackAr.Overflow overflow40 = stackAr33.new Overflow();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj43 = stackAr42.top();
        java.lang.Object obj44 = stackAr42.top();
        boolean boolean45 = stackAr42.isFull();
        boolean boolean46 = stackAr42.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow47 = stackAr42.new Underflow();
        overflow40.addSuppressed((java.lang.Throwable) underflow47);
        overflow25.addSuppressed((java.lang.Throwable) underflow47);
        DataStructures.daikon.StackAr stackAr51 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj52 = stackAr51.top();
        java.lang.Object obj53 = stackAr51.top();
        boolean boolean54 = stackAr51.isFull();
        stackAr51.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow56 = stackAr51.new Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow56);
        overflow7.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.daikon.StackAr stackAr60 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj61 = stackAr60.top();
        java.lang.Object obj62 = stackAr60.top();
        boolean boolean63 = stackAr60.isFull();
        stackAr60.makeEmpty();
        boolean boolean65 = stackAr60.isFull();
        boolean boolean66 = stackAr60.isFull();
        boolean boolean67 = stackAr60.isFull();
        boolean boolean68 = stackAr60.isFull();
        DataStructures.daikon.StackAr.Overflow overflow69 = stackAr60.new Overflow();
        overflow7.addSuppressed((java.lang.Throwable) overflow69);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test296");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr1.isFull();
        stackAr1.makeEmpty();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test297");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr15.new Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow23 = stackAr22.new Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow13.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr27.new Overflow();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr30.new Overflow();
        overflow28.addSuppressed((java.lang.Throwable) overflow31);
        java.lang.Throwable[] throwableArray33 = overflow28.getSuppressed();
        overflow13.addSuppressed((java.lang.Throwable) overflow28);
        stackAr1.push((java.lang.Object) overflow28);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test298");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow10 = stackAr1.new Underflow();
        stackAr1.makeEmpty();
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        boolean boolean19 = stackAr16.isFull();
        java.lang.Object obj20 = stackAr16.top();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        boolean boolean27 = stackAr23.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr23.new Underflow();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr30.new Overflow();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr33.new Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        stackAr23.push((java.lang.Object) overflow34);
        overflow21.addSuppressed((java.lang.Throwable) overflow34);
        stackAr1.push((java.lang.Object) overflow21);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test299");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        java.lang.Object obj10 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr12.new Overflow();
        java.lang.Object obj16 = stackAr12.top();
        DataStructures.daikon.StackAr.Underflow underflow17 = stackAr12.new Underflow();
        java.lang.Object obj18 = stackAr12.top();
        boolean boolean19 = stackAr12.isFull();
        stackAr1.push((java.lang.Object) boolean19);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test300");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        java.lang.Object obj15 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        boolean boolean17 = stackAr1.isEmpty();
        boolean boolean18 = stackAr1.isFull();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test301");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow3 = stackAr1.new Underflow();
        boolean boolean4 = stackAr1.isEmpty();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test302");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        overflow17.addSuppressed((java.lang.Throwable) overflow20);
        java.lang.Throwable[] throwableArray22 = overflow17.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow26 = stackAr25.new Overflow();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr28.new Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow29.getSuppressed();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj34 = stackAr33.top();
        java.lang.Object obj35 = stackAr33.top();
        boolean boolean36 = stackAr33.isFull();
        java.lang.Object obj37 = stackAr33.topAndPop();
        boolean boolean38 = stackAr33.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow39 = stackAr33.new Underflow();
        overflow29.addSuppressed((java.lang.Throwable) underflow39);
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow43 = stackAr42.new Overflow();
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow46 = stackAr45.new Overflow();
        overflow43.addSuppressed((java.lang.Throwable) overflow46);
        java.lang.Throwable[] throwableArray48 = overflow46.getSuppressed();
        underflow39.addSuppressed((java.lang.Throwable) overflow46);
        overflow17.addSuppressed((java.lang.Throwable) overflow46);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test303");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow7 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow8 = stackAr1.new Underflow();
        stackAr1.makeEmpty();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test304");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr1.new Overflow();
        java.lang.Object obj12 = stackAr1.top();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test305");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        stackAr5.makeEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isEmpty();
        stackAr5.push((java.lang.Object) stackAr9);
        java.lang.Object obj15 = stackAr5.topAndPop();
        boolean boolean16 = stackAr5.isFull();
        boolean boolean17 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) boolean17);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        boolean boolean23 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow24 = stackAr21.new Underflow();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj27 = stackAr26.top();
        java.lang.Object obj28 = stackAr26.top();
        boolean boolean29 = stackAr26.isFull();
        boolean boolean30 = stackAr26.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow31 = stackAr26.new Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
        underflow24.addSuppressed((java.lang.Throwable) underflow31);
        overflow19.addSuppressed((java.lang.Throwable) underflow24);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test306");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test307");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test308");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        java.lang.Object obj12 = stackAr1.topAndPop();
        boolean boolean13 = stackAr1.isFull();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test309");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test310");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isFull();
        java.lang.Object obj13 = stackAr1.top();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test311");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.pop();
        DataStructures.daikon.StackAr.Underflow underflow20 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr22.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow26 = stackAr22.new Underflow();
        stackAr1.push((java.lang.Object) stackAr22);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test312");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr11.new Overflow();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr.Underflow underflow31 = stackAr11.new Underflow();
        java.lang.Throwable[] throwableArray32 = underflow31.getSuppressed();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test313");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isEmpty();
        stackAr9.makeEmpty();
        boolean boolean15 = stackAr9.isEmpty();
        java.lang.Object obj16 = stackAr9.topAndPop();
        stackAr1.push(obj16);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test314");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.push((java.lang.Object) (-1));
        boolean boolean10 = stackAr1.isFull();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test315");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 3);
        boolean boolean11 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj13 = stackAr1.top();
        boolean boolean14 = stackAr1.isFull();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test316");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        boolean boolean13 = stackAr1.isFull();
        java.lang.Object obj14 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test317");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test318");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj19 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test319");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 3);
        boolean boolean11 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        java.lang.Object obj13 = stackAr1.topAndPop();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test320");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        boolean boolean9 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow10 = stackAr1.new Underflow();
        boolean boolean11 = stackAr1.isEmpty();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test321");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isEmpty();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test322");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow5 = stackAr1.new Underflow();
        java.lang.Object obj6 = stackAr1.topAndPop();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test323");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr14.new Overflow();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        stackAr21.makeEmpty();
        boolean boolean26 = stackAr21.isFull();
        boolean boolean27 = stackAr21.isFull();
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr21.new Overflow();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj31 = stackAr30.top();
        java.lang.Object obj32 = stackAr30.top();
        boolean boolean33 = stackAr30.isFull();
        boolean boolean34 = stackAr30.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr30.new Underflow();
        overflow28.addSuppressed((java.lang.Throwable) underflow35);
        overflow18.addSuppressed((java.lang.Throwable) underflow35);
        stackAr1.push((java.lang.Object) underflow35);
        boolean boolean39 = stackAr1.isFull();
        java.lang.Object obj40 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test324");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr1.new Overflow();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test325");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow10 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test326");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test327");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        boolean boolean13 = stackAr1.isFull();
        boolean boolean14 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        boolean boolean19 = stackAr16.isFull();
        boolean boolean20 = stackAr16.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr16.new Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = underflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray23);
        boolean boolean25 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow26 = stackAr1.new Overflow();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test328");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        java.lang.Throwable[] throwableArray15 = overflow9.getSuppressed();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray23 = overflow21.getSuppressed();
        overflow9.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable throwable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            overflow9.addSuppressed(throwable25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test329");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test330");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.topAndPop();
        boolean boolean4 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.top();
        boolean boolean9 = stackAr6.isFull();
        java.lang.Object obj10 = stackAr6.top();
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr6.new Overflow();
        stackAr1.push((java.lang.Object) overflow11);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test331");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test332");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Object obj6 = stackAr1.top();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test333");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        overflow2.addSuppressed((java.lang.Throwable) overflow9);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        boolean boolean19 = stackAr16.isFull();
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr16.new Overflow();
        java.lang.Object obj22 = stackAr16.top();
        java.lang.Object obj23 = stackAr16.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow24 = stackAr16.new Underflow();
        overflow9.addSuppressed((java.lang.Throwable) underflow24);
        java.lang.Throwable[] throwableArray26 = underflow24.getSuppressed();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test334");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        stackAr21.makeEmpty();
        boolean boolean26 = stackAr21.isFull();
        stackAr21.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj31 = stackAr30.top();
        java.lang.Object obj32 = stackAr30.top();
        java.lang.Object obj33 = stackAr30.topAndPop();
        stackAr21.push(obj33);
        boolean boolean35 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow36 = stackAr21.new Underflow();
        stackAr1.push((java.lang.Object) stackAr21);
        boolean boolean38 = stackAr1.isFull();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test335");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr12.new Overflow();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr15.new Overflow();
        overflow13.addSuppressed((java.lang.Throwable) overflow16);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow23 = stackAr22.new Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        overflow13.addSuppressed((java.lang.Throwable) overflow20);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow32 = stackAr27.new Overflow();
        java.lang.Object obj33 = stackAr27.top();
        java.lang.Object obj34 = stackAr27.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr27.new Underflow();
        overflow20.addSuppressed((java.lang.Throwable) underflow35);
        underflow9.addSuppressed((java.lang.Throwable) underflow35);
        java.lang.Throwable[] throwableArray38 = underflow9.getSuppressed();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test336");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        stackAr1.pop();
        boolean boolean22 = stackAr1.isFull();
        java.lang.Object obj23 = stackAr1.topAndPop();
        boolean boolean24 = stackAr1.isFull();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test337");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.topAndPop();
        java.lang.Object obj24 = stackAr19.topAndPop();
        boolean boolean25 = stackAr19.isFull();
        stackAr1.push((java.lang.Object) boolean25);
        boolean boolean27 = stackAr1.isFull();
        boolean boolean28 = stackAr1.isFull();
        java.lang.Object obj29 = stackAr1.topAndPop();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test338");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test339");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj15 = stackAr14.top();
        java.lang.Object obj16 = stackAr14.top();
        boolean boolean17 = stackAr14.isFull();
        boolean boolean18 = stackAr14.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow19 = stackAr14.new Underflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        underflow19.addSuppressed((java.lang.Throwable) overflow22);
        overflow12.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray25 = underflow19.getSuppressed();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test340");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test341");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow3 = stackAr1.new Overflow();
        java.lang.Object obj4 = stackAr1.topAndPop();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test342");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr9.new Underflow();
        overflow5.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        underflow15.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        boolean boolean33 = stackAr27.isFull();
        java.lang.Object obj34 = stackAr27.top();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr27.new Underflow();
        underflow15.addSuppressed((java.lang.Throwable) underflow35);
        java.lang.Throwable[] throwableArray37 = underflow35.getSuppressed();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test343");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr11.new Overflow();
        stackAr1.push((java.lang.Object) stackAr11);
        java.lang.Object obj31 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj34 = stackAr33.top();
        java.lang.Object obj35 = stackAr33.top();
        boolean boolean36 = stackAr33.isFull();
        stackAr33.makeEmpty();
        boolean boolean38 = stackAr33.isFull();
        boolean boolean39 = stackAr33.isFull();
        DataStructures.daikon.StackAr.Overflow overflow40 = stackAr33.new Overflow();
        java.lang.Object obj41 = stackAr33.top();
        stackAr33.makeEmpty();
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj45 = stackAr44.top();
        java.lang.Object obj46 = stackAr44.top();
        boolean boolean47 = stackAr44.isFull();
        stackAr44.makeEmpty();
        stackAr44.makeEmpty();
        stackAr33.push((java.lang.Object) stackAr44);
        stackAr33.makeEmpty();
        DataStructures.daikon.StackAr stackAr53 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj54 = stackAr53.top();
        java.lang.Object obj55 = stackAr53.top();
        DataStructures.daikon.StackAr.Overflow overflow56 = stackAr53.new Overflow();
        boolean boolean57 = stackAr53.isFull();
        java.lang.Object obj58 = stackAr53.topAndPop();
        stackAr33.push((java.lang.Object) stackAr53);
        DataStructures.daikon.StackAr.Underflow underflow60 = stackAr33.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow61 = stackAr33.new Underflow();
        java.lang.Throwable[] throwableArray62 = underflow61.getSuppressed();
        stackAr11.push((java.lang.Object) throwableArray62);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test344");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) 3);
        boolean boolean11 = stackAr1.isEmpty();
        stackAr1.pop();
        java.lang.Object obj13 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test345");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow29 = stackAr1.new Underflow();
        boolean boolean30 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr1.new Overflow();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test346");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test347");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test348");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isEmpty();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test349");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj8 = stackAr7.top();
        stackAr7.makeEmpty();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        boolean boolean15 = stackAr11.isEmpty();
        stackAr7.push((java.lang.Object) stackAr11);
        java.lang.Object obj17 = stackAr11.top();
        DataStructures.daikon.StackAr.Underflow underflow18 = stackAr11.new Underflow();
        boolean boolean19 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr11.new Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow20);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test350");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        java.lang.Object obj10 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test351");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow3 = stackAr1.new Underflow();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test352");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.topAndPop();
        java.lang.Object obj24 = stackAr19.topAndPop();
        boolean boolean25 = stackAr19.isFull();
        stackAr1.push((java.lang.Object) boolean25);
        stackAr1.pop();
        stackAr1.pop();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test353");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test354");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        boolean boolean19 = stackAr16.isFull();
        stackAr16.makeEmpty();
        boolean boolean21 = stackAr16.isFull();
        boolean boolean22 = stackAr16.isFull();
        DataStructures.daikon.StackAr.Overflow overflow23 = stackAr16.new Overflow();
        java.lang.Object obj24 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj27 = stackAr26.top();
        java.lang.Object obj28 = stackAr26.top();
        boolean boolean29 = stackAr26.isFull();
        java.lang.Object obj30 = stackAr26.top();
        boolean boolean31 = stackAr26.isEmpty();
        stackAr16.push((java.lang.Object) boolean31);
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj35 = stackAr34.top();
        java.lang.Object obj36 = stackAr34.top();
        boolean boolean37 = stackAr34.isFull();
        java.lang.Object obj38 = stackAr34.topAndPop();
        java.lang.Object obj39 = stackAr34.topAndPop();
        boolean boolean40 = stackAr34.isFull();
        stackAr16.push((java.lang.Object) boolean40);
        boolean boolean42 = stackAr16.isFull();
        DataStructures.daikon.StackAr.Overflow overflow43 = stackAr16.new Overflow();
        stackAr1.push((java.lang.Object) overflow43);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test355");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow3 = stackAr1.new Underflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test356");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        java.lang.Object obj13 = stackAr1.topAndPop();
        boolean boolean14 = stackAr1.isFull();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test357");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr14.new Overflow();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray20 = overflow18.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        stackAr23.makeEmpty();
        boolean boolean28 = stackAr23.isFull();
        boolean boolean29 = stackAr23.isFull();
        DataStructures.daikon.StackAr.Overflow overflow30 = stackAr23.new Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow30);
        java.lang.Throwable[] throwableArray32 = overflow12.getSuppressed();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test358");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr9.new Underflow();
        overflow5.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow22);
        java.lang.Throwable[] throwableArray24 = overflow22.getSuppressed();
        underflow15.addSuppressed((java.lang.Throwable) overflow22);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        boolean boolean33 = stackAr27.isFull();
        java.lang.Object obj34 = stackAr27.top();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr27.new Underflow();
        underflow15.addSuppressed((java.lang.Throwable) underflow35);
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr((int) (short) 10);
        boolean boolean39 = stackAr38.isFull();
        stackAr38.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow41 = stackAr38.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow42 = stackAr38.new Overflow();
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow45 = stackAr44.new Overflow();
        DataStructures.daikon.StackAr stackAr47 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow48 = stackAr47.new Overflow();
        overflow45.addSuppressed((java.lang.Throwable) overflow48);
        java.lang.Throwable[] throwableArray50 = overflow48.getSuppressed();
        DataStructures.daikon.StackAr stackAr52 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj53 = stackAr52.top();
        java.lang.Object obj54 = stackAr52.top();
        boolean boolean55 = stackAr52.isFull();
        java.lang.Object obj56 = stackAr52.topAndPop();
        boolean boolean57 = stackAr52.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow58 = stackAr52.new Underflow();
        overflow48.addSuppressed((java.lang.Throwable) underflow58);
        DataStructures.daikon.StackAr stackAr61 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow62 = stackAr61.new Overflow();
        DataStructures.daikon.StackAr stackAr64 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow65 = stackAr64.new Overflow();
        overflow62.addSuppressed((java.lang.Throwable) overflow65);
        java.lang.Throwable[] throwableArray67 = overflow65.getSuppressed();
        underflow58.addSuppressed((java.lang.Throwable) overflow65);
        DataStructures.daikon.StackAr stackAr70 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj71 = stackAr70.top();
        java.lang.Object obj72 = stackAr70.top();
        boolean boolean73 = stackAr70.isFull();
        stackAr70.makeEmpty();
        boolean boolean75 = stackAr70.isFull();
        boolean boolean76 = stackAr70.isFull();
        DataStructures.daikon.StackAr.Overflow overflow77 = stackAr70.new Overflow();
        DataStructures.daikon.StackAr stackAr79 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj80 = stackAr79.top();
        java.lang.Object obj81 = stackAr79.top();
        boolean boolean82 = stackAr79.isFull();
        boolean boolean83 = stackAr79.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow84 = stackAr79.new Underflow();
        overflow77.addSuppressed((java.lang.Throwable) underflow84);
        java.lang.Throwable[] throwableArray86 = overflow77.getSuppressed();
        underflow58.addSuppressed((java.lang.Throwable) overflow77);
        overflow42.addSuppressed((java.lang.Throwable) overflow77);
        underflow15.addSuppressed((java.lang.Throwable) overflow77);
        java.lang.Throwable[] throwableArray90 = underflow15.getSuppressed();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test359");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isEmpty();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test360");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow2.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        stackAr9.makeEmpty();
        boolean boolean14 = stackAr9.isFull();
        boolean boolean15 = stackAr9.isFull();
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr9.new Overflow();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj19 = stackAr18.top();
        java.lang.Object obj20 = stackAr18.top();
        boolean boolean21 = stackAr18.isFull();
        boolean boolean22 = stackAr18.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow23 = stackAr18.new Underflow();
        overflow16.addSuppressed((java.lang.Throwable) underflow23);
        java.lang.Throwable[] throwableArray25 = overflow16.getSuppressed();
        overflow2.addSuppressed((java.lang.Throwable) overflow16);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test361");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(6);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test362");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.Object obj19 = stackAr12.top();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr12.new Overflow();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test363");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        stackAr23.makeEmpty();
        boolean boolean28 = stackAr23.isFull();
        boolean boolean29 = stackAr23.isFull();
        DataStructures.daikon.StackAr.Overflow overflow30 = stackAr23.new Overflow();
        java.lang.Object obj31 = stackAr23.top();
        stackAr23.makeEmpty();
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj35 = stackAr34.top();
        java.lang.Object obj36 = stackAr34.top();
        boolean boolean37 = stackAr34.isFull();
        stackAr34.makeEmpty();
        stackAr34.makeEmpty();
        stackAr23.push((java.lang.Object) stackAr34);
        DataStructures.daikon.StackAr.Overflow overflow41 = stackAr34.new Overflow();
        DataStructures.daikon.StackAr stackAr43 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj44 = stackAr43.top();
        stackAr43.makeEmpty();
        boolean boolean46 = stackAr43.isFull();
        stackAr34.push((java.lang.Object) stackAr43);
        stackAr1.push((java.lang.Object) stackAr34);
        DataStructures.daikon.StackAr.Overflow overflow49 = stackAr1.new Overflow();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test364");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj9 = stackAr8.top();
        java.lang.Object obj10 = stackAr8.top();
        boolean boolean11 = stackAr8.isFull();
        stackAr8.makeEmpty();
        boolean boolean13 = stackAr8.isFull();
        boolean boolean14 = stackAr8.isFull();
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr8.new Overflow();
        java.lang.Object obj16 = stackAr8.top();
        stackAr8.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr8.new Overflow();
        stackAr1.push((java.lang.Object) overflow18);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test365");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test366");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(5);
        DataStructures.daikon.StackAr.Underflow underflow2 = stackAr1.new Underflow();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test367");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr1.new Overflow();
        java.lang.Object obj22 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow23 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj26 = stackAr25.top();
        java.lang.Object obj27 = stackAr25.top();
        boolean boolean28 = stackAr25.isFull();
        boolean boolean29 = stackAr25.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow30 = stackAr25.new Underflow();
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow33 = stackAr32.new Overflow();
        underflow30.addSuppressed((java.lang.Throwable) overflow33);
        overflow23.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj38 = stackAr37.top();
        java.lang.Object obj39 = stackAr37.top();
        DataStructures.daikon.StackAr.Overflow overflow40 = stackAr37.new Overflow();
        java.lang.Throwable[] throwableArray41 = overflow40.getSuppressed();
        DataStructures.daikon.StackAr stackAr43 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow44 = stackAr43.new Overflow();
        DataStructures.daikon.StackAr stackAr46 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow47 = stackAr46.new Overflow();
        overflow44.addSuppressed((java.lang.Throwable) overflow47);
        java.lang.Throwable[] throwableArray49 = overflow47.getSuppressed();
        DataStructures.daikon.StackAr stackAr51 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj52 = stackAr51.top();
        java.lang.Object obj53 = stackAr51.top();
        boolean boolean54 = stackAr51.isFull();
        boolean boolean55 = stackAr51.isEmpty();
        stackAr51.makeEmpty();
        java.lang.Object obj57 = stackAr51.topAndPop();
        java.lang.Object obj58 = stackAr51.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow59 = stackAr51.new Underflow();
        boolean boolean60 = stackAr51.isFull();
        DataStructures.daikon.StackAr.Overflow overflow61 = stackAr51.new Overflow();
        overflow47.addSuppressed((java.lang.Throwable) overflow61);
        overflow40.addSuppressed((java.lang.Throwable) overflow61);
        overflow33.addSuppressed((java.lang.Throwable) overflow61);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test368");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        stackAr1.makeEmpty();
        boolean boolean20 = stackAr1.isFull();
        boolean boolean21 = stackAr1.isFull();
        stackAr1.makeEmpty();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test369");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-3));
        boolean boolean13 = stackAr1.isEmpty();
        java.lang.Object obj14 = stackAr1.topAndPop();
        java.lang.Object obj15 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj18 = stackAr17.top();
        java.lang.Object obj19 = stackAr17.top();
        boolean boolean20 = stackAr17.isFull();
        stackAr17.makeEmpty();
        boolean boolean22 = stackAr17.isFull();
        boolean boolean23 = stackAr17.isFull();
        java.lang.Object obj24 = stackAr17.top();
        DataStructures.daikon.StackAr.Underflow underflow25 = stackAr17.new Underflow();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj28 = stackAr27.top();
        java.lang.Object obj29 = stackAr27.top();
        boolean boolean30 = stackAr27.isFull();
        stackAr27.makeEmpty();
        boolean boolean32 = stackAr27.isFull();
        boolean boolean33 = stackAr27.isFull();
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr27.new Overflow();
        java.lang.Object obj35 = stackAr27.top();
        stackAr27.makeEmpty();
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj39 = stackAr38.top();
        java.lang.Object obj40 = stackAr38.top();
        boolean boolean41 = stackAr38.isFull();
        stackAr38.makeEmpty();
        stackAr38.makeEmpty();
        stackAr27.push((java.lang.Object) stackAr38);
        DataStructures.daikon.StackAr.Overflow overflow45 = stackAr27.new Overflow();
        stackAr17.push((java.lang.Object) stackAr27);
        DataStructures.daikon.StackAr.Underflow underflow47 = stackAr27.new Underflow();
        stackAr1.push((java.lang.Object) underflow47);
        java.lang.Object obj49 = stackAr1.top();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test370");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj8 = stackAr7.top();
        java.lang.Object obj9 = stackAr7.top();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr7.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr7.new Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray12);
        stackAr1.pop();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr1.new Underflow();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test371");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isFull();
        boolean boolean11 = stackAr1.isFull();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test372");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(6);
        stackAr1.push((java.lang.Object) (-4));
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        stackAr5.makeEmpty();
        boolean boolean10 = stackAr5.isFull();
        boolean boolean11 = stackAr5.isFull();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr5.new Overflow();
        java.lang.Object obj13 = stackAr5.top();
        stackAr5.makeEmpty();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        boolean boolean19 = stackAr16.isFull();
        stackAr16.makeEmpty();
        stackAr16.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr16);
        boolean boolean23 = stackAr16.isEmpty();
        java.lang.Object obj24 = null;
        stackAr16.push(obj24);
        stackAr1.push(obj24);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test373");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isEmpty();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test374");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow13 = stackAr1.new Underflow();
        boolean boolean14 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow16 = stackAr1.new Underflow();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test375");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = stackAr1.topAndPop();
        boolean boolean8 = stackAr1.isFull();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test376");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        stackAr9.makeEmpty();
        boolean boolean14 = stackAr9.isFull();
        boolean boolean15 = stackAr9.isFull();
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr9.new Overflow();
        java.lang.Object obj17 = stackAr9.top();
        stackAr9.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow19 = stackAr9.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr9.new Overflow();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        boolean boolean26 = stackAr22.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow27 = stackAr22.new Underflow();
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow30 = stackAr29.new Overflow();
        underflow27.addSuppressed((java.lang.Throwable) overflow30);
        overflow20.addSuppressed((java.lang.Throwable) underflow27);
        stackAr1.push((java.lang.Object) underflow27);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test377");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        boolean boolean11 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr9.new Underflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj15 = stackAr14.top();
        java.lang.Object obj16 = stackAr14.top();
        boolean boolean17 = stackAr14.isFull();
        boolean boolean18 = stackAr14.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow19 = stackAr14.new Underflow();
        java.lang.Throwable[] throwableArray20 = underflow19.getSuppressed();
        underflow12.addSuppressed((java.lang.Throwable) underflow19);
        java.lang.Throwable[] throwableArray22 = underflow12.getSuppressed();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj25 = stackAr24.top();
        java.lang.Object obj26 = stackAr24.top();
        boolean boolean27 = stackAr24.isFull();
        stackAr24.makeEmpty();
        boolean boolean29 = stackAr24.isFull();
        boolean boolean30 = stackAr24.isFull();
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr24.new Overflow();
        java.lang.Object obj32 = stackAr24.top();
        stackAr24.makeEmpty();
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj36 = stackAr35.top();
        java.lang.Object obj37 = stackAr35.top();
        boolean boolean38 = stackAr35.isFull();
        stackAr35.makeEmpty();
        stackAr35.makeEmpty();
        stackAr24.push((java.lang.Object) stackAr35);
        DataStructures.daikon.StackAr.Overflow overflow42 = stackAr24.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow43 = stackAr24.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow44 = stackAr24.new Overflow();
        java.lang.Throwable[] throwableArray45 = overflow44.getSuppressed();
        underflow12.addSuppressed((java.lang.Throwable) overflow44);
        java.lang.Throwable[] throwableArray47 = underflow12.getSuppressed();
        stackAr1.push((java.lang.Object) underflow12);
        java.lang.Object obj49 = stackAr1.topAndPop();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test378");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        boolean boolean9 = stackAr1.isFull();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test379");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        stackAr5.makeEmpty();
        boolean boolean10 = stackAr5.isFull();
        boolean boolean11 = stackAr5.isFull();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr5.new Overflow();
        java.lang.Object obj13 = stackAr5.top();
        stackAr5.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr5.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr5.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr5.new Overflow();
        stackAr1.push((java.lang.Object) overflow17);
        stackAr1.pop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test380");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test381");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr7.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr7.new Underflow();
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.Object obj11 = stackAr7.topAndPop();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test382");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(5);
        java.lang.Object obj2 = stackAr1.topAndPop();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test383");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-3));
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test384");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean13 = stackAr1.isEmpty();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test385");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr14.new Overflow();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        stackAr21.makeEmpty();
        boolean boolean26 = stackAr21.isFull();
        boolean boolean27 = stackAr21.isFull();
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr21.new Overflow();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj31 = stackAr30.top();
        java.lang.Object obj32 = stackAr30.top();
        boolean boolean33 = stackAr30.isFull();
        boolean boolean34 = stackAr30.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow35 = stackAr30.new Underflow();
        overflow28.addSuppressed((java.lang.Throwable) underflow35);
        overflow18.addSuppressed((java.lang.Throwable) underflow35);
        stackAr1.push((java.lang.Object) underflow35);
        java.lang.Object obj39 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test386");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        java.lang.Object obj26 = stackAr22.top();
        boolean boolean27 = stackAr22.isEmpty();
        stackAr22.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr22.new Overflow();
        java.lang.Throwable[] throwableArray30 = overflow29.getSuppressed();
        overflow20.addSuppressed((java.lang.Throwable) overflow29);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test387");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow29 = stackAr1.new Underflow();
        boolean boolean30 = stackAr1.isFull();
        java.lang.Object obj31 = stackAr1.topAndPop();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test388");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj9 = stackAr8.top();
        java.lang.Object obj10 = stackAr8.top();
        boolean boolean11 = stackAr8.isFull();
        stackAr8.makeEmpty();
        boolean boolean13 = stackAr8.isFull();
        boolean boolean14 = stackAr8.isFull();
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr8.new Overflow();
        java.lang.Object obj16 = stackAr8.top();
        stackAr8.makeEmpty();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        stackAr19.makeEmpty();
        stackAr19.makeEmpty();
        stackAr8.push((java.lang.Object) stackAr19);
        DataStructures.daikon.StackAr.Overflow overflow26 = stackAr8.new Overflow();
        overflow6.addSuppressed((java.lang.Throwable) overflow26);
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj30 = stackAr29.top();
        java.lang.Object obj31 = stackAr29.top();
        boolean boolean32 = stackAr29.isFull();
        stackAr29.makeEmpty();
        boolean boolean34 = stackAr29.isFull();
        boolean boolean35 = stackAr29.isFull();
        DataStructures.daikon.StackAr.Overflow overflow36 = stackAr29.new Overflow();
        java.lang.Object obj37 = stackAr29.top();
        stackAr29.makeEmpty();
        DataStructures.daikon.StackAr stackAr40 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj41 = stackAr40.top();
        java.lang.Object obj42 = stackAr40.top();
        boolean boolean43 = stackAr40.isFull();
        stackAr40.makeEmpty();
        stackAr40.makeEmpty();
        stackAr29.push((java.lang.Object) stackAr40);
        DataStructures.daikon.StackAr.Overflow overflow47 = stackAr40.new Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow47);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test389");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr23.new Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray27 = overflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray27);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow30 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow31 = stackAr1.new Underflow();
        java.lang.Object obj32 = stackAr1.top();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test390");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr23.new Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray27 = overflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray27);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray30 = overflow29.getSuppressed();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test391");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test392");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr1.new Overflow();
        java.lang.Object obj22 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr24.new Overflow();
        java.lang.Object obj26 = stackAr24.top();
        stackAr24.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr24);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test393");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        boolean boolean25 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow26 = stackAr21.new Underflow();
        boolean boolean27 = stackAr21.isFull();
        stackAr21.makeEmpty();
        stackAr21.makeEmpty();
        java.lang.Object obj30 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        boolean boolean32 = stackAr1.isFull();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test394");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow16 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray17 = underflow16.getSuppressed();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test395");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isEmpty();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test396");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test397");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray9 = overflow8.getSuppressed();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr11.new Overflow();
        java.lang.Throwable[] throwableArray15 = overflow14.getSuppressed();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow18);
        overflow8.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr((int) (byte) 10);
        DataStructures.daikon.StackAr.Overflow overflow23 = stackAr22.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow23);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test398");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        stackAr1.pop();
        stackAr1.pop();
        stackAr1.makeEmpty();
        boolean boolean18 = stackAr1.isFull();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test399");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow7 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow8 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray9 = underflow8.getSuppressed();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test400");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr5.top();
        stackAr5.makeEmpty();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test401");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = overflow4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = overflow4.getSuppressed();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test402");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        stackAr5.makeEmpty();
        boolean boolean10 = stackAr5.isFull();
        boolean boolean11 = stackAr5.isFull();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr5.new Overflow();
        java.lang.Object obj13 = stackAr5.top();
        stackAr5.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr5.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr5.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr5.new Overflow();
        stackAr1.push((java.lang.Object) overflow17);
        java.lang.Object obj19 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test403");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj13 = stackAr1.top();
        java.lang.Object obj14 = stackAr1.top();
        java.lang.Object obj15 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test404");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr11.new Overflow();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) (byte) 10);
        stackAr1.push((java.lang.Object) stackAr32);
        stackAr1.pop();
        boolean boolean35 = stackAr1.isFull();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test405");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        java.lang.Object obj28 = stackAr21.top();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test406");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr1.new Overflow();
        boolean boolean11 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray13 = underflow12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = underflow12.getSuppressed();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test407");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray10 = underflow9.getSuppressed();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = stackAr12.top();
        boolean boolean17 = stackAr12.isEmpty();
        stackAr12.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr12.new Overflow();
        java.lang.Throwable[] throwableArray20 = overflow19.getSuppressed();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr22.new Overflow();
        java.lang.Throwable[] throwableArray26 = overflow25.getSuppressed();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr28.new Overflow();
        overflow25.addSuppressed((java.lang.Throwable) overflow29);
        overflow19.addSuppressed((java.lang.Throwable) overflow25);
        underflow9.addSuppressed((java.lang.Throwable) overflow19);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test408");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) 100L);
        java.lang.Object obj14 = stackAr1.topAndPop();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test409");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj16 = stackAr15.top();
        java.lang.Object obj17 = stackAr15.top();
        boolean boolean18 = stackAr15.isFull();
        boolean boolean19 = stackAr15.isEmpty();
        stackAr15.makeEmpty();
        boolean boolean21 = stackAr15.isEmpty();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        boolean boolean27 = stackAr23.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr23.new Underflow();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr30.new Overflow();
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        stackAr15.push((java.lang.Object) underflow28);
        stackAr1.push((java.lang.Object) underflow28);
        boolean boolean35 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj38 = stackAr37.top();
        java.lang.Object obj39 = stackAr37.top();
        boolean boolean40 = stackAr37.isFull();
        java.lang.Object obj41 = stackAr37.top();
        DataStructures.daikon.StackAr.Underflow underflow42 = stackAr37.new Underflow();
        stackAr37.push((java.lang.Object) (short) 1);
        stackAr1.push((java.lang.Object) stackAr37);
        DataStructures.daikon.StackAr.Overflow overflow46 = stackAr1.new Overflow();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test410");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        boolean boolean10 = stackAr1.isFull();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test411");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test412");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isFull();
        boolean boolean13 = stackAr1.isEmpty();
        boolean boolean14 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test413");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isFull();
        boolean boolean13 = stackAr1.isEmpty();
        boolean boolean14 = stackAr1.isFull();
        stackAr1.makeEmpty();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test414");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 10);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj5 = stackAr4.top();
        java.lang.Object obj6 = stackAr4.top();
        boolean boolean7 = stackAr4.isFull();
        stackAr4.makeEmpty();
        boolean boolean9 = stackAr4.isFull();
        boolean boolean10 = stackAr4.isFull();
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr4.new Overflow();
        boolean boolean12 = stackAr4.isFull();
        stackAr4.makeEmpty();
        stackAr4.push((java.lang.Object) (-100));
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow16);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test415");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (byte) 0);
        boolean boolean9 = stackAr8.isEmpty();
        stackAr1.push((java.lang.Object) boolean9);
        boolean boolean11 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test416");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test417");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray5 = overflow4.getSuppressed();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr7.new Overflow();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr10.new Overflow();
        overflow8.addSuppressed((java.lang.Throwable) overflow11);
        java.lang.Throwable[] throwableArray13 = overflow11.getSuppressed();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj16 = stackAr15.top();
        java.lang.Object obj17 = stackAr15.top();
        boolean boolean18 = stackAr15.isFull();
        boolean boolean19 = stackAr15.isEmpty();
        stackAr15.makeEmpty();
        java.lang.Object obj21 = stackAr15.topAndPop();
        java.lang.Object obj22 = stackAr15.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow23 = stackAr15.new Underflow();
        boolean boolean24 = stackAr15.isFull();
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr15.new Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow25);
        overflow4.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow30 = stackAr29.new Overflow();
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow33 = stackAr32.new Overflow();
        overflow30.addSuppressed((java.lang.Throwable) overflow33);
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow37 = stackAr36.new Overflow();
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow40 = stackAr39.new Overflow();
        overflow37.addSuppressed((java.lang.Throwable) overflow40);
        java.lang.Throwable[] throwableArray42 = overflow40.getSuppressed();
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj45 = stackAr44.top();
        java.lang.Object obj46 = stackAr44.top();
        boolean boolean47 = stackAr44.isFull();
        java.lang.Object obj48 = stackAr44.topAndPop();
        boolean boolean49 = stackAr44.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow50 = stackAr44.new Underflow();
        overflow40.addSuppressed((java.lang.Throwable) underflow50);
        overflow33.addSuppressed((java.lang.Throwable) underflow50);
        overflow25.addSuppressed((java.lang.Throwable) underflow50);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test418");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj8 = stackAr7.top();
        java.lang.Object obj9 = stackAr7.top();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr7.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr7.new Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray12);
        boolean boolean14 = stackAr1.isEmpty();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test419");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj14 = stackAr13.top();
        java.lang.Object obj15 = stackAr13.top();
        boolean boolean16 = stackAr13.isFull();
        stackAr13.makeEmpty();
        boolean boolean18 = stackAr13.isFull();
        boolean boolean19 = stackAr13.isFull();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr13.new Overflow();
        java.lang.Object obj21 = stackAr13.top();
        stackAr13.makeEmpty();
        stackAr13.push((java.lang.Object) (-3));
        boolean boolean25 = stackAr13.isEmpty();
        java.lang.Object obj26 = stackAr13.topAndPop();
        stackAr1.push(obj26);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test420");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean9 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        stackAr11.makeEmpty();
        boolean boolean16 = stackAr11.isFull();
        boolean boolean17 = stackAr11.isFull();
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr11.new Overflow();
        java.lang.Object obj19 = stackAr11.top();
        stackAr11.makeEmpty();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj23 = stackAr22.top();
        java.lang.Object obj24 = stackAr22.top();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.makeEmpty();
        stackAr22.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr22.new Overflow();
        stackAr1.push((java.lang.Object) overflow29);
        boolean boolean31 = stackAr1.isFull();
        boolean boolean32 = stackAr1.isFull();
        stackAr1.pop();
        boolean boolean34 = stackAr1.isEmpty();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test421");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow8 = stackAr1.new Underflow();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test422");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        stackAr9.makeEmpty();
        boolean boolean14 = stackAr9.isFull();
        boolean boolean15 = stackAr9.isFull();
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr9.new Overflow();
        java.lang.Object obj17 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj20 = stackAr19.top();
        java.lang.Object obj21 = stackAr19.top();
        boolean boolean22 = stackAr19.isFull();
        java.lang.Object obj23 = stackAr19.top();
        boolean boolean24 = stackAr19.isEmpty();
        stackAr9.push((java.lang.Object) boolean24);
        stackAr1.push((java.lang.Object) boolean24);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test423");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow4 = stackAr1.new Underflow();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test424");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow13 = stackAr1.new Underflow();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test425");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test426");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-3));
        boolean boolean13 = stackAr1.isEmpty();
        java.lang.Object obj14 = stackAr1.topAndPop();
        java.lang.Object obj15 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr1.new Overflow();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test427");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean5 = stackAr1.isEmpty();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test428");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        boolean boolean13 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr9.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        underflow14.addSuppressed((java.lang.Throwable) overflow17);
        stackAr1.push((java.lang.Object) underflow14);
        java.lang.Object obj20 = stackAr1.topAndPop();
        boolean boolean21 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        boolean boolean27 = stackAr23.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr23.new Underflow();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr30.new Overflow();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr33.new Overflow();
        overflow31.addSuppressed((java.lang.Throwable) overflow34);
        stackAr23.push((java.lang.Object) overflow34);
        stackAr1.push((java.lang.Object) overflow34);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test429");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        java.lang.Object obj12 = stackAr1.topAndPop();
        java.lang.Object obj13 = stackAr1.topAndPop();
        boolean boolean14 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow20 = stackAr16.new Underflow();
        java.lang.Throwable[] throwableArray21 = underflow20.getSuppressed();
        stackAr1.push((java.lang.Object) underflow20);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test430");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        boolean boolean25 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow26 = stackAr21.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow27 = stackAr21.new Overflow();
        java.lang.Throwable[] throwableArray28 = overflow27.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray28);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test431");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        boolean boolean19 = stackAr12.isEmpty();
        boolean boolean20 = stackAr12.isEmpty();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr12.new Overflow();
        java.lang.Throwable[] throwableArray22 = overflow21.getSuppressed();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test432");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        stackAr1.makeEmpty();
        boolean boolean16 = stackAr1.isEmpty();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test433");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.topAndPop();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test434");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow11 = stackAr10.new Overflow();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        overflow11.addSuppressed((java.lang.Throwable) overflow14);
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        overflow18.addSuppressed((java.lang.Throwable) overflow21);
        overflow11.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow26 = stackAr25.new Overflow();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr28.new Overflow();
        overflow26.addSuppressed((java.lang.Throwable) overflow29);
        java.lang.Throwable[] throwableArray31 = overflow26.getSuppressed();
        overflow11.addSuppressed((java.lang.Throwable) overflow26);
        java.lang.Throwable[] throwableArray33 = overflow26.getSuppressed();
        underflow7.addSuppressed((java.lang.Throwable) overflow26);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test435");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test436");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test437");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test438");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test439");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
        boolean boolean8 = stackAr1.isFull();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test440");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        boolean boolean25 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow26 = stackAr21.new Underflow();
        boolean boolean27 = stackAr21.isFull();
        stackAr21.makeEmpty();
        stackAr21.makeEmpty();
        java.lang.Object obj30 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr33.new Overflow();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow37 = stackAr36.new Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.daikon.StackAr stackAr40 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj41 = stackAr40.top();
        java.lang.Object obj42 = stackAr40.top();
        DataStructures.daikon.StackAr.Overflow overflow43 = stackAr40.new Overflow();
        java.lang.Throwable[] throwableArray44 = overflow43.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow43);
        stackAr1.push((java.lang.Object) overflow34);
        DataStructures.daikon.StackAr.Overflow overflow47 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow48 = stackAr1.new Overflow();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test441");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        stackAr9.makeEmpty();
        boolean boolean14 = stackAr9.isFull();
        boolean boolean15 = stackAr9.isFull();
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr9.new Overflow();
        java.lang.Object obj17 = stackAr9.top();
        stackAr9.makeEmpty();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj21 = stackAr20.top();
        java.lang.Object obj22 = stackAr20.top();
        boolean boolean23 = stackAr20.isFull();
        stackAr20.makeEmpty();
        stackAr20.makeEmpty();
        stackAr9.push((java.lang.Object) stackAr20);
        DataStructures.daikon.StackAr.Overflow overflow27 = stackAr9.new Overflow();
        stackAr1.push((java.lang.Object) stackAr9);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr9.new Overflow();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test442");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        boolean boolean12 = stackAr1.isFull();
        boolean boolean13 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj18 = stackAr17.top();
        java.lang.Object obj19 = stackAr17.top();
        boolean boolean20 = stackAr17.isFull();
        boolean boolean21 = stackAr17.isEmpty();
        stackAr17.makeEmpty();
        boolean boolean23 = stackAr17.isEmpty();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj26 = stackAr25.top();
        java.lang.Object obj27 = stackAr25.top();
        boolean boolean28 = stackAr25.isFull();
        boolean boolean29 = stackAr25.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow30 = stackAr25.new Underflow();
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow33 = stackAr32.new Overflow();
        underflow30.addSuppressed((java.lang.Throwable) overflow33);
        stackAr17.push((java.lang.Object) underflow30);
        underflow15.addSuppressed((java.lang.Throwable) underflow30);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test443");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray7 = overflow6.getSuppressed();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test444");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-100));
        boolean boolean13 = stackAr1.isFull();
        boolean boolean14 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        boolean boolean19 = stackAr16.isFull();
        boolean boolean20 = stackAr16.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr16.new Underflow();
        java.lang.Throwable[] throwableArray22 = underflow21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = underflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray23);
        boolean boolean25 = stackAr1.isEmpty();
        java.lang.Object obj26 = stackAr1.topAndPop();
        boolean boolean27 = stackAr1.isEmpty();
        java.lang.Object obj28 = stackAr1.top();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test445");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr.Overflow overflow4 = stackAr1.new Overflow();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test446");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj5 = stackAr4.top();
        java.lang.Object obj6 = stackAr4.top();
        boolean boolean7 = stackAr4.isFull();
        boolean boolean8 = stackAr4.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr4.new Underflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr14.new Overflow();
        overflow12.addSuppressed((java.lang.Throwable) overflow15);
        stackAr4.push((java.lang.Object) overflow15);
        boolean boolean18 = stackAr4.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow19 = stackAr4.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr4.new Overflow();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr4);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test447");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj8 = stackAr7.top();
        java.lang.Object obj9 = stackAr7.top();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr7.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr7.new Underflow();
        java.lang.Throwable[] throwableArray12 = underflow11.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray12);
        boolean boolean14 = stackAr1.isFull();
        java.lang.Object obj15 = stackAr1.topAndPop();
        boolean boolean16 = stackAr1.isFull();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test448");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test449");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        stackAr1.push((java.lang.Object) (short) 1);
        java.lang.Object obj9 = stackAr1.top();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test450");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj16 = stackAr15.top();
        java.lang.Object obj17 = stackAr15.top();
        boolean boolean18 = stackAr15.isFull();
        boolean boolean19 = stackAr15.isEmpty();
        stackAr15.makeEmpty();
        boolean boolean21 = stackAr15.isEmpty();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        boolean boolean27 = stackAr23.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr23.new Underflow();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow31 = stackAr30.new Overflow();
        underflow28.addSuppressed((java.lang.Throwable) overflow31);
        stackAr15.push((java.lang.Object) underflow28);
        stackAr1.push((java.lang.Object) underflow28);
        boolean boolean35 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj38 = stackAr37.top();
        java.lang.Object obj39 = stackAr37.top();
        boolean boolean40 = stackAr37.isFull();
        java.lang.Object obj41 = stackAr37.top();
        DataStructures.daikon.StackAr.Underflow underflow42 = stackAr37.new Underflow();
        stackAr37.push((java.lang.Object) (short) 1);
        stackAr1.push((java.lang.Object) stackAr37);
        stackAr37.pop();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test451");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-3));
        boolean boolean13 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr15.new Overflow();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr18.new Overflow();
        overflow16.addSuppressed((java.lang.Throwable) overflow19);
        java.lang.Throwable[] throwableArray21 = overflow19.getSuppressed();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        boolean boolean27 = stackAr23.isEmpty();
        stackAr23.makeEmpty();
        java.lang.Object obj29 = stackAr23.topAndPop();
        java.lang.Object obj30 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow31 = stackAr23.new Underflow();
        boolean boolean32 = stackAr23.isFull();
        DataStructures.daikon.StackAr.Overflow overflow33 = stackAr23.new Overflow();
        overflow19.addSuppressed((java.lang.Throwable) overflow33);
        java.lang.Throwable[] throwableArray35 = overflow19.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray35);
        stackAr1.makeEmpty();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test452");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow5 = stackAr4.new Overflow();
        overflow2.addSuppressed((java.lang.Throwable) overflow5);
        java.lang.Throwable[] throwableArray7 = overflow5.getSuppressed();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.top();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.topAndPop();
        boolean boolean14 = stackAr9.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow15 = stackAr9.new Underflow();
        overflow5.addSuppressed((java.lang.Throwable) underflow15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj19 = stackAr18.top();
        boolean boolean20 = stackAr18.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow21 = stackAr18.new Underflow();
        stackAr18.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow23 = stackAr18.new Overflow();
        overflow5.addSuppressed((java.lang.Throwable) overflow23);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test453");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        stackAr1.pop();
        DataStructures.daikon.StackAr.Overflow overflow16 = stackAr1.new Overflow();
        java.lang.Object obj17 = stackAr1.topAndPop();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test454");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr.Overflow overflow19 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr1.new Overflow();
        stackAr1.pop();
        java.lang.Object obj24 = stackAr1.topAndPop();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test455");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test456");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isFull();
        boolean boolean9 = stackAr5.isEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) 100L);
        stackAr1.makeEmpty();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test457");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean11 = stackAr1.isFull();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow14 = stackAr13.new Overflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        overflow14.addSuppressed((java.lang.Throwable) overflow17);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow21 = stackAr20.new Overflow();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr23.new Overflow();
        overflow21.addSuppressed((java.lang.Throwable) overflow24);
        overflow14.addSuppressed((java.lang.Throwable) overflow21);
        java.lang.Throwable[] throwableArray27 = overflow21.getSuppressed();
        stackAr1.push((java.lang.Object) throwableArray27);
        DataStructures.daikon.StackAr.Overflow overflow29 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow30 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow31 = stackAr1.new Underflow();
        stackAr1.makeEmpty();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test458");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow10 = stackAr1.new Overflow();
        stackAr1.makeEmpty();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test459");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj12 = stackAr11.top();
        java.lang.Object obj13 = stackAr11.top();
        boolean boolean14 = stackAr11.isFull();
        java.lang.Object obj15 = stackAr11.top();
        boolean boolean16 = stackAr11.isEmpty();
        stackAr1.push((java.lang.Object) boolean16);
        stackAr1.pop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        boolean boolean24 = stackAr21.isFull();
        boolean boolean25 = stackAr21.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow26 = stackAr21.new Underflow();
        boolean boolean27 = stackAr21.isFull();
        stackAr21.makeEmpty();
        stackAr21.makeEmpty();
        java.lang.Object obj30 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow34 = stackAr33.new Overflow();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow37 = stackAr36.new Overflow();
        overflow34.addSuppressed((java.lang.Throwable) overflow37);
        DataStructures.daikon.StackAr stackAr40 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj41 = stackAr40.top();
        java.lang.Object obj42 = stackAr40.top();
        DataStructures.daikon.StackAr.Overflow overflow43 = stackAr40.new Overflow();
        java.lang.Throwable[] throwableArray44 = overflow43.getSuppressed();
        overflow34.addSuppressed((java.lang.Throwable) overflow43);
        stackAr1.push((java.lang.Object) overflow34);
        DataStructures.daikon.StackAr stackAr48 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow49 = stackAr48.new Overflow();
        DataStructures.daikon.StackAr stackAr51 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow52 = stackAr51.new Overflow();
        overflow49.addSuppressed((java.lang.Throwable) overflow52);
        DataStructures.daikon.StackAr stackAr55 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow56 = stackAr55.new Overflow();
        DataStructures.daikon.StackAr stackAr58 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow59 = stackAr58.new Overflow();
        overflow56.addSuppressed((java.lang.Throwable) overflow59);
        overflow49.addSuppressed((java.lang.Throwable) overflow56);
        DataStructures.daikon.StackAr stackAr63 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow64 = stackAr63.new Overflow();
        DataStructures.daikon.StackAr stackAr66 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow67 = stackAr66.new Overflow();
        overflow64.addSuppressed((java.lang.Throwable) overflow67);
        java.lang.Throwable[] throwableArray69 = overflow64.getSuppressed();
        overflow49.addSuppressed((java.lang.Throwable) overflow64);
        overflow34.addSuppressed((java.lang.Throwable) overflow49);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test460");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isFull();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        boolean boolean16 = stackAr12.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow17 = stackAr12.new Underflow();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow20 = stackAr19.new Overflow();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow23 = stackAr22.new Overflow();
        overflow20.addSuppressed((java.lang.Throwable) overflow23);
        stackAr12.push((java.lang.Object) overflow23);
        java.lang.Object obj26 = stackAr12.topAndPop();
        stackAr12.makeEmpty();
        boolean boolean28 = stackAr12.isEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test461");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow12 = stackAr1.new Underflow();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test462");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow7 = stackAr1.new Underflow();
        java.lang.Throwable[] throwableArray8 = underflow7.getSuppressed();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        boolean boolean13 = stackAr10.isFull();
        java.lang.Object obj14 = stackAr10.topAndPop();
        boolean boolean15 = stackAr10.isFull();
        stackAr10.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr10.new Overflow();
        underflow7.addSuppressed((java.lang.Throwable) overflow17);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test463");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        stackAr1.pop();
        java.lang.Object obj16 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj19 = stackAr18.top();
        java.lang.Object obj20 = stackAr18.top();
        boolean boolean21 = stackAr18.isFull();
        java.lang.Object obj22 = stackAr18.topAndPop();
        java.lang.Object obj23 = stackAr18.topAndPop();
        stackAr1.push((java.lang.Object) stackAr18);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test464");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        boolean boolean15 = stackAr1.isFull();
        boolean boolean16 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test465");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow13 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow14 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow17 = stackAr16.new Overflow();
        DataStructures.daikon.StackAr.Underflow underflow18 = stackAr16.new Underflow();
        underflow14.addSuppressed((java.lang.Throwable) underflow18);
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow22 = stackAr21.new Overflow();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow25 = stackAr24.new Overflow();
        overflow22.addSuppressed((java.lang.Throwable) overflow25);
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj29 = stackAr28.top();
        java.lang.Object obj30 = stackAr28.top();
        boolean boolean31 = stackAr28.isFull();
        stackAr28.makeEmpty();
        boolean boolean33 = stackAr28.isFull();
        boolean boolean34 = stackAr28.isFull();
        DataStructures.daikon.StackAr.Overflow overflow35 = stackAr28.new Overflow();
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj38 = stackAr37.top();
        java.lang.Object obj39 = stackAr37.top();
        boolean boolean40 = stackAr37.isFull();
        boolean boolean41 = stackAr37.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow42 = stackAr37.new Underflow();
        overflow35.addSuppressed((java.lang.Throwable) underflow42);
        overflow25.addSuppressed((java.lang.Throwable) underflow42);
        underflow14.addSuppressed((java.lang.Throwable) underflow42);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test466");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow15 = stackAr14.new Overflow();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow18 = stackAr17.new Overflow();
        overflow15.addSuppressed((java.lang.Throwable) overflow18);
        java.lang.Throwable[] throwableArray20 = overflow18.getSuppressed();
        overflow12.addSuppressed((java.lang.Throwable) overflow18);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj24 = stackAr23.top();
        java.lang.Object obj25 = stackAr23.top();
        boolean boolean26 = stackAr23.isFull();
        stackAr23.makeEmpty();
        DataStructures.daikon.StackAr.Overflow overflow28 = stackAr23.new Overflow();
        java.lang.Object obj29 = stackAr23.top();
        java.lang.Object obj30 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow31 = stackAr23.new Underflow();
        overflow18.addSuppressed((java.lang.Throwable) underflow31);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test467");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Overflow overflow6 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow7 = stackAr1.new Overflow();
        boolean boolean8 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Underflow underflow9 = stackAr1.new Underflow();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test468");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-3));
        boolean boolean13 = stackAr1.isEmpty();
        java.lang.Object obj14 = stackAr1.topAndPop();
        java.lang.Object obj15 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test469");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        boolean boolean9 = stackAr1.isFull();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow11 = stackAr1.new Underflow();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test470");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (-10));
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push(obj13);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr.Underflow underflow16 = stackAr1.new Underflow();
        java.lang.Object obj17 = stackAr1.top();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test471");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow9 = stackAr8.new Overflow();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(9);
        DataStructures.daikon.StackAr.Overflow overflow12 = stackAr11.new Overflow();
        overflow9.addSuppressed((java.lang.Throwable) overflow12);
        stackAr1.push((java.lang.Object) overflow12);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.Object obj16 = stackAr1.top();
        stackAr1.pop();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test472");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean6 = stackAr1.isFull();
        boolean boolean7 = stackAr1.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr1.new Overflow();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj13 = stackAr12.top();
        java.lang.Object obj14 = stackAr12.top();
        boolean boolean15 = stackAr12.isFull();
        stackAr12.makeEmpty();
        stackAr12.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr12);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj22 = stackAr21.top();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr.Overflow overflow24 = stackAr21.new Overflow();
        boolean boolean25 = stackAr21.isFull();
        java.lang.Object obj26 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
        DataStructures.daikon.StackAr.Underflow underflow28 = stackAr1.new Underflow();
        DataStructures.daikon.StackAr.Underflow underflow29 = stackAr1.new Underflow();
        boolean boolean30 = stackAr1.isEmpty();
        boolean boolean31 = stackAr1.isFull();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test473");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        DataStructures.daikon.StackAr.Overflow overflow2 = stackAr1.new Overflow();
        DataStructures.daikon.StackAr.Overflow overflow3 = stackAr1.new Overflow();
        java.lang.Throwable[] throwableArray4 = overflow3.getSuppressed();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test474");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj5 = stackAr4.top();
        stackAr4.makeEmpty();
        boolean boolean7 = stackAr4.isFull();
        DataStructures.daikon.StackAr.Overflow overflow8 = stackAr4.new Overflow();
        stackAr1.push((java.lang.Object) stackAr4);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test475");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        DataStructures.daikon.StackAr.Underflow underflow6 = stackAr1.new Underflow();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr.Underflow underflow10 = stackAr1.new Underflow();
        boolean boolean11 = stackAr1.isFull();
        java.lang.Object obj12 = stackAr1.top();
    }
}

