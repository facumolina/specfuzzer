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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test002");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test003");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
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
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test005");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test006");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
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
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test008");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test009");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test010");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test011");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test012");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 1);
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
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test014");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test015");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test016");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test017");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
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
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test019");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test020");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(5);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test021");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 3);
        java.lang.Object obj5 = stackAr1.topAndPop();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test022");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
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
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test024");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test025");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test026");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr3.makeEmpty();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj19 = new java.lang.Object();
        stackAr18.push(obj19);
        stackAr18.pop();
        java.lang.Object obj22 = stackAr18.top();
        stackAr3.push(obj22);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test027");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test028");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test029");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test030");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) stackAr6);
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        stackAr9.push((java.lang.Object) 'a');
        java.lang.Object obj12 = stackAr9.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test031");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(1);
        stackAr8.push((java.lang.Object) 'a');
        java.lang.Object obj11 = stackAr8.top();
        stackAr5.push(obj11);
        stackAr1.push(obj11);
        stackAr1.pop();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test032");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test033");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test034");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test035");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        stackAr6.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr6.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test036");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test037");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
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
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj5 = new java.lang.Object();
        stackAr4.push(obj5);
        stackAr1.push(obj5);
        stackAr1.pop();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test039");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) stackAr6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr6.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test040");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
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
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test042");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test043");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test044");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.push((java.lang.Object) false);
        stackAr1.makeEmpty();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test045");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test046");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test047");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.top();
        stackAr1.push(obj15);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr19.makeEmpty();
        java.lang.Object obj21 = stackAr19.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj24 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr26.makeEmpty();
        java.lang.Object obj28 = stackAr26.top();
        java.lang.Object obj29 = stackAr26.top();
        java.lang.Object obj30 = stackAr26.top();
        java.lang.Object obj31 = stackAr26.top();
        stackAr23.push(obj31);
        stackAr19.push(obj31);
        stackAr1.push((java.lang.Object) stackAr19);
        java.lang.Object obj35 = stackAr19.topAndPop();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test048");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj14 = new java.lang.Object();
        stackAr13.push(obj14);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr13);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test049");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
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
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test050");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test051");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr5.makeEmpty();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test052");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test053");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr3.makeEmpty();
        java.lang.Object obj17 = stackAr3.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test054");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test055");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr1.pop();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test056");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj13 = stackAr1.topAndPop();
        java.lang.Object obj14 = stackAr1.top();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test057");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test058");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '4');
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test059");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test060");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test061");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(1);
        stackAr8.push((java.lang.Object) 'a');
        stackAr8.pop();
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj13 = stackAr1.topAndPop();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test062");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test063");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(1);
        stackAr7.push((java.lang.Object) 'a');
        stackAr7.pop();
        java.lang.Object obj11 = stackAr7.topAndPop();
        java.lang.Object obj12 = stackAr7.top();
        stackAr1.push(obj12);
        java.lang.Object obj14 = stackAr1.top();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test064");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) (-4));
        stackAr1.makeEmpty();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test065");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) (-4));
        java.lang.Object obj4 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr6.makeEmpty();
        java.lang.Object obj8 = stackAr6.top();
        java.lang.Object obj9 = stackAr6.topAndPop();
        stackAr1.push((java.lang.Object) stackAr6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr6.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test066");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test067");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test068");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr10.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test069");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test070");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test071");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj13 = stackAr12.topAndPop();
        java.lang.Object obj14 = stackAr12.topAndPop();
        java.lang.Object obj15 = stackAr12.top();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj20 = stackAr19.topAndPop();
        stackAr19.push((java.lang.Object) (-8));
        java.lang.Object obj23 = stackAr19.top();
        java.lang.Object obj24 = stackAr19.top();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr26.push((java.lang.Object) stackAr28);
        stackAr19.push((java.lang.Object) stackAr26);
        stackAr17.push((java.lang.Object) stackAr19);
        stackAr12.push((java.lang.Object) stackAr19);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr19);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test072");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.top();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test073");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.top();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(7);
        stackAr10.push((java.lang.Object) 7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test074");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr13.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr13.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test075");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        stackAr4.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr4.topAndPop();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test076");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj11 = stackAr10.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(1);
        stackAr13.push((java.lang.Object) 'a');
        stackAr13.pop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr18.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr20);
        stackAr10.push((java.lang.Object) stackAr20);
        stackAr6.push((java.lang.Object) stackAr20);
        stackAr1.push((java.lang.Object) stackAr20);
        // The following exception was thrown during execution in test generation
        try {
            stackAr20.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test077");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test078");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.push((java.lang.Object) 100);
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test079");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        stackAr4.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.top();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test080");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.top();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test081");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.pop();
        java.lang.Object obj11 = stackAr1.top();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test082");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test083");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr13.makeEmpty();
        java.lang.Object obj26 = stackAr13.top();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test084");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        stackAr1.makeEmpty();
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test085");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
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
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test087");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test088");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.top();
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.topAndPop();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test089");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test090");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test091");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj9 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) (-1.0d));
        stackAr8.push((java.lang.Object) (-1.0d));
        stackAr8.pop();
        stackAr8.pop();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr17.makeEmpty();
        java.lang.Object obj19 = stackAr17.top();
        java.lang.Object obj20 = stackAr17.top();
        java.lang.Object obj21 = stackAr17.top();
        java.lang.Object obj22 = stackAr17.top();
        stackAr8.push(obj22);
        stackAr8.makeEmpty();
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        // The following exception was thrown during execution in test generation
        try {
            stackAr8.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test092");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr10.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test093");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr9.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test094");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test095");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        java.lang.Object obj22 = stackAr18.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr18.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test096");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(1);
        stackAr18.push((java.lang.Object) 'a');
        java.lang.Object obj21 = stackAr18.top();
        stackAr1.push(obj21);
        java.lang.Object obj23 = stackAr1.topAndPop();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test097");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj10 = stackAr9.topAndPop();
        java.lang.Object obj11 = stackAr9.topAndPop();
        java.lang.Object obj12 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj17 = stackAr16.topAndPop();
        stackAr16.push((java.lang.Object) (-8));
        java.lang.Object obj20 = stackAr16.top();
        java.lang.Object obj21 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr23.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr14.push((java.lang.Object) stackAr16);
        stackAr9.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr16);
        java.lang.Object obj31 = stackAr1.topAndPop();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test098");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.pop();
        stackAr1.push((java.lang.Object) 4);
        stackAr1.pop();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test099");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        java.lang.Object obj18 = stackAr15.top();
        stackAr15.push((java.lang.Object) false);
        stackAr1.push((java.lang.Object) stackAr15);
        java.lang.Object obj22 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj25 = stackAr24.topAndPop();
        java.lang.Object obj26 = stackAr24.topAndPop();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(1);
        stackAr28.push((java.lang.Object) 'a');
        stackAr28.makeEmpty();
        stackAr24.push((java.lang.Object) stackAr28);
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr(1);
        stackAr34.push((java.lang.Object) 'a');
        stackAr34.pop();
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr39.push((java.lang.Object) stackAr41);
        stackAr34.push((java.lang.Object) stackAr41);
        stackAr28.push((java.lang.Object) stackAr41);
        stackAr28.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr28);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test100");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test101");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj25 = stackAr24.topAndPop();
        stackAr24.push((java.lang.Object) (-8));
        java.lang.Object obj28 = stackAr24.top();
        java.lang.Object obj29 = stackAr24.top();
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr31.push((java.lang.Object) stackAr33);
        stackAr24.push((java.lang.Object) stackAr31);
        stackAr22.push((java.lang.Object) stackAr24);
        stackAr24.makeEmpty();
        java.lang.Object obj38 = stackAr24.top();
        stackAr1.push(obj38);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test102");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.pop();
        java.lang.Object obj17 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test103");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj9 = stackAr8.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr11.makeEmpty();
        java.lang.Object obj13 = stackAr11.top();
        java.lang.Object obj14 = stackAr11.topAndPop();
        stackAr11.push((java.lang.Object) (-5));
        stackAr11.pop();
        stackAr8.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
        // The following exception was thrown during execution in test generation
        try {
            stackAr11.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test104");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj9 = stackAr8.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr11.makeEmpty();
        java.lang.Object obj13 = stackAr11.top();
        java.lang.Object obj14 = stackAr11.topAndPop();
        stackAr11.push((java.lang.Object) (-5));
        stackAr11.pop();
        stackAr8.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
        java.lang.Object obj20 = stackAr11.topAndPop();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test105");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr5.makeEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj9 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) (-1.0d));
        stackAr8.push((java.lang.Object) (-1.0d));
        stackAr8.pop();
        stackAr5.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.pop();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test106");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(100);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test107");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        java.lang.Object obj7 = stackAr4.topAndPop();
        stackAr4.push((java.lang.Object) (-5));
        stackAr4.pop();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr4.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test108");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj9 = stackAr8.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr8.push((java.lang.Object) stackAr18);
        stackAr8.push((java.lang.Object) (-100));
        stackAr1.push((java.lang.Object) stackAr8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test109");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test110");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj21 = stackAr1.top();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test111");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.top();
        stackAr4.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr1.pop();
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test112");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr8.makeEmpty();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test113");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test114");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 100);
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test115");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj10 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(1);
        stackAr12.push((java.lang.Object) 'a');
        java.lang.Object obj15 = stackAr12.top();
        stackAr9.push(obj15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        stackAr18.makeEmpty();
        stackAr9.push((java.lang.Object) stackAr18);
        stackAr1.push((java.lang.Object) stackAr9);
        stackAr1.makeEmpty();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test116");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test117");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.topAndPop();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test118");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.topAndPop();
        stackAr4.push((java.lang.Object) (-1.0d));
        stackAr4.push((java.lang.Object) (-1.0d));
        stackAr4.pop();
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr4.pop();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test119");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test120");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj11 = stackAr8.top();
        stackAr8.makeEmpty();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test121");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test122");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 10);
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test123");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test124");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.pop();
        java.lang.Object obj14 = stackAr7.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj17 = stackAr16.top();
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr20.makeEmpty();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj24 = stackAr23.topAndPop();
        stackAr23.push((java.lang.Object) (-1.0d));
        stackAr23.push((java.lang.Object) (-1.0d));
        stackAr23.pop();
        stackAr20.push((java.lang.Object) stackAr23);
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr7.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test125");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = new java.lang.Object();
        stackAr8.push(obj9);
        stackAr8.pop();
        java.lang.Object obj12 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) (-4));
        stackAr1.push((java.lang.Object) (-4));
        stackAr1.pop();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test126");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr10.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test127");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test128");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.topAndPop();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test129");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.pop();
        java.lang.Object obj17 = stackAr1.top();
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
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test131");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr3.makeEmpty();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        stackAr3.push(obj11);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        java.lang.Object obj19 = stackAr16.topAndPop();
        stackAr16.push((java.lang.Object) (-5));
        java.lang.Object obj22 = stackAr16.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj22);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test132");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (byte) 1);
        java.lang.Object obj9 = stackAr8.top();
        stackAr3.push(obj9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test133");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test134");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.pop();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test135");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.top();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test136");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr13.makeEmpty();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 10);
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj30 = stackAr29.topAndPop();
        java.lang.Object obj31 = stackAr29.topAndPop();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj34 = stackAr33.topAndPop();
        stackAr29.push((java.lang.Object) stackAr33);
        stackAr27.push((java.lang.Object) stackAr29);
        stackAr29.pop();
        stackAr13.push((java.lang.Object) stackAr29);
        stackAr13.makeEmpty();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test137");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr13.pop();
        java.lang.Object obj26 = stackAr13.topAndPop();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test138");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(5);
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test139");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        stackAr5.push(obj13);
        stackAr1.push(obj13);
        java.lang.Object obj16 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr21.makeEmpty();
        java.lang.Object obj23 = stackAr21.top();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj26 = stackAr25.top();
        stackAr21.push((java.lang.Object) stackAr25);
        stackAr18.push((java.lang.Object) stackAr21);
        stackAr1.push((java.lang.Object) stackAr18);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test140");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        stackAr4.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = stackAr4.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.top();
        stackAr4.push((java.lang.Object) stackAr16);
        java.lang.Object obj20 = stackAr4.topAndPop();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test141");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(1);
        stackAr7.push((java.lang.Object) 'a');
        stackAr7.pop();
        java.lang.Object obj11 = stackAr7.topAndPop();
        java.lang.Object obj12 = stackAr7.top();
        stackAr1.push(obj12);
        java.lang.Object obj14 = stackAr1.topAndPop();
        java.lang.Object obj15 = stackAr1.topAndPop();
        java.lang.Object obj16 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test142");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test143");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test144");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj11 = stackAr10.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(1);
        stackAr13.push((java.lang.Object) 'a');
        stackAr13.pop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr18.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr20);
        stackAr10.push((java.lang.Object) stackAr20);
        stackAr6.push((java.lang.Object) stackAr20);
        stackAr1.push((java.lang.Object) stackAr20);
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
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test145");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr10.push((java.lang.Object) 3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test146");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr3.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test147");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        stackAr5.push(obj13);
        stackAr1.push(obj13);
        stackAr1.pop();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test148");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        stackAr5.push(obj13);
        stackAr1.push(obj13);
        java.lang.Object obj16 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test149");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr3.makeEmpty();
        java.lang.Object obj22 = stackAr3.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test150");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj16 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj19 = new java.lang.Object();
        stackAr18.push(obj19);
        stackAr1.push((java.lang.Object) stackAr18);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj24 = stackAr23.topAndPop();
        stackAr23.push((java.lang.Object) (-1.0d));
        stackAr23.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(2);
        stackAr23.push((java.lang.Object) stackAr30);
        stackAr18.push((java.lang.Object) stackAr30);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test151");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        stackAr1.makeEmpty();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test152");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (-8));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(1);
        stackAr8.push((java.lang.Object) 'a');
        stackAr8.pop();
        java.lang.Object obj12 = stackAr8.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(1);
        stackAr14.push((java.lang.Object) 'a');
        stackAr14.pop();
        java.lang.Object obj18 = stackAr14.topAndPop();
        java.lang.Object obj19 = stackAr14.top();
        stackAr8.push(obj19);
        java.lang.Object obj21 = stackAr8.topAndPop();
        java.lang.Object obj22 = stackAr8.topAndPop();
        java.lang.Object obj23 = stackAr8.topAndPop();
        stackAr1.push(obj23);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test153");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.top();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test154");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test155");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr4.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj11 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test156");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(4);
        java.lang.Object obj2 = stackAr1.top();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test157");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(1);
        stackAr6.push((java.lang.Object) 'a');
        stackAr6.makeEmpty();
        java.lang.Object obj10 = stackAr6.top();
        java.lang.Object obj11 = stackAr6.topAndPop();
        stackAr3.push(obj11);
        stackAr3.pop();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test158");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test159");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        stackAr1.push(obj6);
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr9.makeEmpty();
        java.lang.Object obj11 = stackAr9.top();
        java.lang.Object obj12 = stackAr9.topAndPop();
        stackAr9.push((java.lang.Object) (-5));
        stackAr9.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test160");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.top();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj18 = stackAr17.topAndPop();
        stackAr10.push(obj18);
        stackAr10.pop();
        java.lang.Object obj21 = stackAr10.top();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test161");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test162");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) (-5));
        stackAr8.pop();
        stackAr5.push((java.lang.Object) stackAr8);
        java.lang.Object obj16 = stackAr8.topAndPop();
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj18 = stackAr8.topAndPop();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test163");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.topAndPop();
        stackAr4.push((java.lang.Object) (-1.0d));
        stackAr4.push((java.lang.Object) (-1.0d));
        stackAr4.pop();
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr4.makeEmpty();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test164");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        stackAr5.push(obj13);
        stackAr1.push(obj13);
        java.lang.Object obj16 = null;
        stackAr1.push(obj16);
        stackAr1.pop();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test165");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(1);
        stackAr22.push((java.lang.Object) 'a');
        stackAr22.makeEmpty();
        java.lang.Object obj26 = stackAr22.top();
        stackAr1.push(obj26);
        java.lang.Object obj28 = stackAr1.top();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test166");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr13.pop();
        java.lang.Object obj26 = stackAr13.top();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test167");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        stackAr1.push(obj6);
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test168");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test169");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj9 = stackAr8.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr11.makeEmpty();
        java.lang.Object obj13 = stackAr11.top();
        java.lang.Object obj14 = stackAr11.topAndPop();
        stackAr11.push((java.lang.Object) (-5));
        stackAr11.pop();
        stackAr8.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
        stackAr11.makeEmpty();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test170");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        stackAr6.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj9 = stackAr1.topAndPop();
        stackAr1.pop();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test171");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.top();
        stackAr5.push(obj13);
        stackAr5.makeEmpty();
        stackAr3.push((java.lang.Object) stackAr5);
        java.lang.Object obj17 = stackAr5.top();
        stackAr1.push(obj17);
        java.lang.Object obj19 = stackAr1.top();
        java.lang.Object obj20 = stackAr1.topAndPop();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test172");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test173");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.topAndPop();
        stackAr18.push((java.lang.Object) (-8));
        java.lang.Object obj22 = stackAr18.top();
        java.lang.Object obj23 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr25.push((java.lang.Object) stackAr27);
        stackAr18.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(1);
        stackAr33.push((java.lang.Object) 'a');
        java.lang.Object obj36 = stackAr33.top();
        stackAr16.push(obj36);
        stackAr16.pop();
        java.lang.Object obj39 = stackAr16.topAndPop();
        stackAr7.push((java.lang.Object) stackAr16);
        stackAr16.makeEmpty();
        stackAr16.push((java.lang.Object) 100.0f);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test174");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test175");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj9 = stackAr8.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        java.lang.Object obj14 = stackAr11.top();
        stackAr8.push(obj14);
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) '#');
        stackAr17.makeEmpty();
        stackAr8.push((java.lang.Object) stackAr17);
        java.lang.Object obj20 = stackAr17.top();
        java.lang.Object obj21 = stackAr17.top();
        stackAr1.push(obj21);
        java.lang.Object obj23 = stackAr1.top();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test176");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj5 = stackAr3.top();
        stackAr3.makeEmpty();
        java.lang.Object obj7 = stackAr3.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test177");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        java.lang.Object obj18 = stackAr15.top();
        stackAr15.push((java.lang.Object) false);
        stackAr1.push((java.lang.Object) stackAr15);
        stackAr15.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr15.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test178");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr3.makeEmpty();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-5));
        stackAr3.push((java.lang.Object) true);
        stackAr1.push((java.lang.Object) true);
        java.lang.Object obj12 = stackAr1.topAndPop();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test179");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.topAndPop();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test180");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
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
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test181");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        stackAr4.pop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr9.push((java.lang.Object) stackAr11);
        stackAr4.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
        stackAr1.pop();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test182");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test183");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        java.lang.Object obj18 = stackAr15.top();
        stackAr15.push((java.lang.Object) false);
        stackAr1.push((java.lang.Object) stackAr15);
        java.lang.Object obj22 = stackAr1.top();
        stackAr1.pop();
        java.lang.Object obj24 = stackAr1.top();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test184");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test185");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr3.makeEmpty();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        stackAr3.push(obj11);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test186");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) stackAr8);
        // The following exception was thrown during execution in test generation
        try {
            stackAr8.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test187");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(1);
        stackAr7.push((java.lang.Object) 'a');
        stackAr7.pop();
        java.lang.Object obj11 = stackAr7.topAndPop();
        java.lang.Object obj12 = stackAr7.top();
        stackAr1.push(obj12);
        java.lang.Object obj14 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj17 = stackAr16.top();
        stackAr1.push((java.lang.Object) stackAr16);
        // The following exception was thrown during execution in test generation
        try {
            stackAr16.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test188");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) (-4));
        java.lang.Object obj4 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr6.makeEmpty();
        java.lang.Object obj8 = stackAr6.top();
        java.lang.Object obj9 = stackAr6.topAndPop();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj11 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test189");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(8);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.pop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr5.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr12);
        java.lang.Object obj16 = stackAr3.topAndPop();
        stackAr1.push((java.lang.Object) stackAr3);
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test190");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj16 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj19 = new java.lang.Object();
        stackAr18.push(obj19);
        stackAr1.push((java.lang.Object) stackAr18);
        stackAr18.makeEmpty();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test191");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (short) 100);
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test192");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.pop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(1);
        stackAr10.push((java.lang.Object) 'a');
        stackAr10.pop();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj15 = stackAr1.topAndPop();
        java.lang.Object obj16 = stackAr1.top();
        java.lang.Object obj17 = stackAr1.top();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test193");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.top();
        stackAr1.push(obj15);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr19.makeEmpty();
        java.lang.Object obj21 = stackAr19.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj24 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr26.makeEmpty();
        java.lang.Object obj28 = stackAr26.top();
        java.lang.Object obj29 = stackAr26.top();
        java.lang.Object obj30 = stackAr26.top();
        java.lang.Object obj31 = stackAr26.top();
        stackAr23.push(obj31);
        stackAr19.push(obj31);
        stackAr1.push((java.lang.Object) stackAr19);
        java.lang.Object obj35 = stackAr1.topAndPop();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test194");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        stackAr9.push((java.lang.Object) 'a');
        stackAr9.pop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr14.push((java.lang.Object) stackAr16);
        stackAr9.push((java.lang.Object) stackAr16);
        stackAr9.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj22 = stackAr21.topAndPop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj29 = stackAr28.top();
        stackAr24.push((java.lang.Object) stackAr28);
        stackAr21.push((java.lang.Object) stackAr24);
        stackAr9.push((java.lang.Object) stackAr21);
        stackAr21.makeEmpty();
        stackAr21.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr21);
        stackAr21.push((java.lang.Object) (-2));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test195");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        stackAr1.push(obj11);
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj15 = stackAr14.topAndPop();
        stackAr14.push((java.lang.Object) (-1.0d));
        stackAr14.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(2);
        stackAr14.push((java.lang.Object) stackAr21);
        java.lang.Object obj23 = stackAr21.topAndPop();
        stackAr1.push((java.lang.Object) stackAr21);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test196");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.topAndPop();
        stackAr18.push((java.lang.Object) (-8));
        java.lang.Object obj22 = stackAr18.top();
        java.lang.Object obj23 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr25.push((java.lang.Object) stackAr27);
        stackAr18.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(1);
        stackAr33.push((java.lang.Object) 'a');
        java.lang.Object obj36 = stackAr33.top();
        stackAr16.push(obj36);
        stackAr16.pop();
        java.lang.Object obj39 = stackAr16.topAndPop();
        stackAr7.push((java.lang.Object) stackAr16);
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj43 = stackAr42.topAndPop();
        stackAr42.push((java.lang.Object) (-1.0d));
        stackAr42.push((java.lang.Object) (-1.0d));
        stackAr42.pop();
        stackAr42.makeEmpty();
        stackAr16.push((java.lang.Object) stackAr42);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test197");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.topAndPop();
        stackAr4.push((java.lang.Object) (-1.0d));
        stackAr4.push((java.lang.Object) (-1.0d));
        stackAr4.pop();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr4.topAndPop();
        java.lang.Object obj13 = stackAr4.topAndPop();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test198");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.topAndPop();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test199");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr1.top();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test200");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        stackAr6.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.top();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test201");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj5 = stackAr3.top();
        stackAr3.makeEmpty();
        stackAr3.makeEmpty();
        stackAr3.push((java.lang.Object) '4');
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test202");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj7 = stackAr6.topAndPop();
        stackAr6.push((java.lang.Object) (-8));
        java.lang.Object obj10 = stackAr6.top();
        java.lang.Object obj11 = stackAr6.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr13.push((java.lang.Object) stackAr15);
        stackAr6.push((java.lang.Object) stackAr13);
        stackAr4.push((java.lang.Object) stackAr6);
        java.lang.Object obj19 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr4.makeEmpty();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test203");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr3.makeEmpty();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        stackAr3.push(obj11);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj15 = stackAr3.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test204");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr11.makeEmpty();
        java.lang.Object obj13 = stackAr11.top();
        java.lang.Object obj14 = stackAr11.topAndPop();
        stackAr11.push((java.lang.Object) (-5));
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test205");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.top();
        stackAr4.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr4.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test206");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        stackAr4.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr1.top();
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
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test207");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        java.lang.Object obj21 = stackAr18.topAndPop();
        java.lang.Object obj22 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        stackAr24.push((java.lang.Object) (-5));
        stackAr24.makeEmpty();
        stackAr18.push((java.lang.Object) stackAr24);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj36 = stackAr35.topAndPop();
        stackAr35.push((java.lang.Object) (-8));
        java.lang.Object obj39 = stackAr35.top();
        java.lang.Object obj40 = stackAr35.top();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr42.push((java.lang.Object) stackAr44);
        stackAr35.push((java.lang.Object) stackAr42);
        stackAr33.push((java.lang.Object) stackAr35);
        stackAr33.makeEmpty();
        DataStructures.daikon.StackAr stackAr50 = new DataStructures.daikon.StackAr(1);
        stackAr50.push((java.lang.Object) 'a');
        java.lang.Object obj53 = stackAr50.top();
        stackAr33.push(obj53);
        stackAr33.pop();
        java.lang.Object obj56 = stackAr33.topAndPop();
        stackAr24.push((java.lang.Object) stackAr33);
        java.lang.Object obj58 = stackAr33.top();
        stackAr10.push((java.lang.Object) stackAr33);
        java.lang.Object obj60 = stackAr10.top();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test208");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj11 = stackAr10.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(1);
        stackAr13.push((java.lang.Object) 'a');
        java.lang.Object obj16 = stackAr13.top();
        stackAr10.push(obj16);
        stackAr10.pop();
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test209");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        java.lang.Object obj7 = stackAr4.topAndPop();
        stackAr4.push((java.lang.Object) (-5));
        stackAr4.pop();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr1.top();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test210");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr14.makeEmpty();
        java.lang.Object obj16 = stackAr14.top();
        java.lang.Object obj17 = stackAr14.top();
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.top();
        stackAr11.push(obj19);
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
        stackAr1.pop();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test211");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        stackAr6.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(100);
        stackAr1.push((java.lang.Object) 100);
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(1);
        stackAr13.push((java.lang.Object) 'a');
        stackAr13.pop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr18.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr20);
        stackAr13.pop();
        stackAr1.push((java.lang.Object) stackAr13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test212");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.makeEmpty();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test213");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        stackAr6.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        stackAr6.makeEmpty();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test214");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.topAndPop();
        stackAr18.push((java.lang.Object) (-8));
        java.lang.Object obj22 = stackAr18.top();
        java.lang.Object obj23 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr25.push((java.lang.Object) stackAr27);
        stackAr18.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(1);
        stackAr33.push((java.lang.Object) 'a');
        java.lang.Object obj36 = stackAr33.top();
        stackAr16.push(obj36);
        stackAr16.pop();
        java.lang.Object obj39 = stackAr16.topAndPop();
        stackAr7.push((java.lang.Object) stackAr16);
        java.lang.Object obj41 = stackAr16.topAndPop();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test215");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj7 = stackAr6.topAndPop();
        stackAr6.push((java.lang.Object) 8);
        stackAr6.pop();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj12 = stackAr6.topAndPop();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test216");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 100);
        java.lang.Object obj2 = stackAr1.top();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test217");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        stackAr1.push((java.lang.Object) "hi!");
        java.lang.Object obj4 = stackAr1.top();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test218");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        stackAr5.push(obj13);
        stackAr1.push(obj13);
        java.lang.Object obj16 = stackAr1.topAndPop();
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
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test219");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.pop();
        java.lang.Object obj12 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test220");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test221");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test222");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr14.makeEmpty();
        java.lang.Object obj16 = stackAr14.top();
        java.lang.Object obj17 = stackAr14.top();
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.top();
        stackAr11.push(obj19);
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
        stackAr1.makeEmpty();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test223");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test224");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr10.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test225");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr9.makeEmpty();
        java.lang.Object obj11 = stackAr9.top();
        java.lang.Object obj12 = stackAr9.topAndPop();
        java.lang.Object obj13 = stackAr9.topAndPop();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        java.lang.Object obj18 = stackAr15.topAndPop();
        stackAr15.push((java.lang.Object) (-5));
        stackAr15.makeEmpty();
        stackAr9.push((java.lang.Object) stackAr15);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj27 = stackAr26.topAndPop();
        stackAr26.push((java.lang.Object) (-8));
        java.lang.Object obj30 = stackAr26.top();
        java.lang.Object obj31 = stackAr26.top();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr33.push((java.lang.Object) stackAr35);
        stackAr26.push((java.lang.Object) stackAr33);
        stackAr24.push((java.lang.Object) stackAr26);
        stackAr24.makeEmpty();
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr(1);
        stackAr41.push((java.lang.Object) 'a');
        java.lang.Object obj44 = stackAr41.top();
        stackAr24.push(obj44);
        stackAr24.pop();
        java.lang.Object obj47 = stackAr24.topAndPop();
        stackAr15.push((java.lang.Object) stackAr24);
        java.lang.Object obj49 = stackAr24.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr24);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test226");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.top();
        stackAr1.push(obj8);
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test227");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr5.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test228");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(1);
        stackAr21.push((java.lang.Object) 'a');
        java.lang.Object obj24 = stackAr21.top();
        stackAr18.push(obj24);
        stackAr1.push((java.lang.Object) stackAr18);
        stackAr1.makeEmpty();
        java.lang.Object obj28 = stackAr1.top();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test229");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        java.lang.Object obj21 = stackAr18.topAndPop();
        java.lang.Object obj22 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        stackAr24.push((java.lang.Object) (-5));
        stackAr24.makeEmpty();
        stackAr18.push((java.lang.Object) stackAr24);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj36 = stackAr35.topAndPop();
        stackAr35.push((java.lang.Object) (-8));
        java.lang.Object obj39 = stackAr35.top();
        java.lang.Object obj40 = stackAr35.top();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr42.push((java.lang.Object) stackAr44);
        stackAr35.push((java.lang.Object) stackAr42);
        stackAr33.push((java.lang.Object) stackAr35);
        stackAr33.makeEmpty();
        DataStructures.daikon.StackAr stackAr50 = new DataStructures.daikon.StackAr(1);
        stackAr50.push((java.lang.Object) 'a');
        java.lang.Object obj53 = stackAr50.top();
        stackAr33.push(obj53);
        stackAr33.pop();
        java.lang.Object obj56 = stackAr33.topAndPop();
        stackAr24.push((java.lang.Object) stackAr33);
        java.lang.Object obj58 = stackAr33.top();
        stackAr10.push((java.lang.Object) stackAr33);
        // The following exception was thrown during execution in test generation
        try {
            stackAr33.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test230");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj11 = stackAr10.topAndPop();
        stackAr10.push((java.lang.Object) (-8));
        java.lang.Object obj14 = stackAr10.top();
        stackAr10.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr10);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test231");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.top();
        stackAr1.push(obj15);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr19.makeEmpty();
        java.lang.Object obj21 = stackAr19.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj24 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr26.makeEmpty();
        java.lang.Object obj28 = stackAr26.top();
        java.lang.Object obj29 = stackAr26.top();
        java.lang.Object obj30 = stackAr26.top();
        java.lang.Object obj31 = stackAr26.top();
        stackAr23.push(obj31);
        stackAr19.push(obj31);
        stackAr1.push((java.lang.Object) stackAr19);
        java.lang.Object obj35 = stackAr1.top();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test232");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj27 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test233");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr8.makeEmpty();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test234");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj5 = stackAr3.top();
        stackAr3.makeEmpty();
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test235");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        java.lang.Object obj22 = stackAr18.top();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test236");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test237");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.pop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test238");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(1);
        stackAr7.push((java.lang.Object) 'a');
        java.lang.Object obj10 = stackAr7.top();
        stackAr4.push(obj10);
        stackAr4.makeEmpty();
        java.lang.Object obj13 = stackAr4.topAndPop();
        java.lang.Object obj14 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test239");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        java.lang.Object obj22 = stackAr5.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test240");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.pop();
        stackAr1.pop();
        stackAr1.pop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test241");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        stackAr4.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr4.push((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = stackAr4.topAndPop();
        stackAr4.pop();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test242");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
        java.lang.Object obj11 = stackAr1.top();
        java.lang.Object obj12 = stackAr1.top();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test243");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr10);
        // The following exception was thrown during execution in test generation
        try {
            stackAr10.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test244");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test245");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj5 = stackAr3.top();
        stackAr3.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test246");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(1);
        stackAr8.push((java.lang.Object) 'a');
        java.lang.Object obj11 = stackAr8.top();
        stackAr5.push(obj11);
        stackAr1.push(obj11);
        java.lang.Object obj14 = stackAr1.top();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test247");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        stackAr4.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr4.push((java.lang.Object) (-1.0f));
        stackAr4.makeEmpty();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test248");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test249");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.topAndPop();
        stackAr18.push((java.lang.Object) (-8));
        java.lang.Object obj22 = stackAr18.top();
        java.lang.Object obj23 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr25.push((java.lang.Object) stackAr27);
        stackAr18.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(1);
        stackAr33.push((java.lang.Object) 'a');
        java.lang.Object obj36 = stackAr33.top();
        stackAr16.push(obj36);
        stackAr16.pop();
        java.lang.Object obj39 = stackAr16.topAndPop();
        stackAr7.push((java.lang.Object) stackAr16);
        // The following exception was thrown during execution in test generation
        try {
            stackAr16.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test250");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        stackAr4.pop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr9.push((java.lang.Object) stackAr11);
        stackAr4.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) (-100));
        stackAr1.pop();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test251");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.topAndPop();
        stackAr4.push((java.lang.Object) (-1.0d));
        stackAr4.push((java.lang.Object) (-1.0d));
        stackAr4.pop();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr4.top();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test252");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr14.makeEmpty();
        java.lang.Object obj16 = stackAr14.top();
        java.lang.Object obj17 = stackAr14.top();
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.top();
        stackAr11.push(obj19);
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
        stackAr11.makeEmpty();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test253");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test254");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        stackAr5.push(obj13);
        stackAr1.push(obj13);
        java.lang.Object obj16 = null;
        stackAr1.push(obj16);
        java.lang.Object obj18 = stackAr1.top();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test255");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        java.lang.Object obj2 = stackAr1.top();
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
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test256");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(5);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test257");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        stackAr5.push(obj13);
        stackAr1.push(obj13);
        java.lang.Object obj16 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj23 = stackAr22.topAndPop();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr25.makeEmpty();
        java.lang.Object obj27 = stackAr25.top();
        java.lang.Object obj28 = stackAr25.top();
        java.lang.Object obj29 = stackAr25.top();
        java.lang.Object obj30 = stackAr25.top();
        stackAr22.push(obj30);
        stackAr18.push(obj30);
        stackAr1.push(obj30);
        java.lang.Object obj34 = stackAr1.top();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test258");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test259");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj16 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj19 = new java.lang.Object();
        stackAr18.push(obj19);
        stackAr1.push((java.lang.Object) stackAr18);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(1);
        stackAr23.push((java.lang.Object) 'a');
        stackAr23.pop();
        java.lang.Object obj27 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(1);
        stackAr29.push((java.lang.Object) 'a');
        stackAr29.pop();
        java.lang.Object obj33 = stackAr29.topAndPop();
        java.lang.Object obj34 = stackAr29.top();
        stackAr23.push(obj34);
        java.lang.Object obj36 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj39 = stackAr38.top();
        stackAr23.push((java.lang.Object) stackAr38);
        stackAr1.push((java.lang.Object) stackAr38);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test260");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        stackAr7.makeEmpty();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test261");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        stackAr1.push((java.lang.Object) (-7));
        java.lang.Object obj8 = stackAr1.top();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test262");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        stackAr1.push(obj11);
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj15 = stackAr14.topAndPop();
        java.lang.Object obj16 = stackAr14.topAndPop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj19 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr21.makeEmpty();
        java.lang.Object obj23 = stackAr21.top();
        java.lang.Object obj24 = stackAr21.topAndPop();
        stackAr21.push((java.lang.Object) (-5));
        stackAr21.pop();
        stackAr18.push((java.lang.Object) stackAr21);
        java.lang.Object obj29 = stackAr21.topAndPop();
        stackAr14.push((java.lang.Object) stackAr21);
        stackAr1.push((java.lang.Object) stackAr21);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test263");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr10);
        java.lang.Object obj17 = stackAr5.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test264");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj8 = stackAr7.topAndPop();
        stackAr3.push((java.lang.Object) stackAr7);
        stackAr1.push((java.lang.Object) stackAr3);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj13 = stackAr12.topAndPop();
        java.lang.Object obj14 = stackAr12.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj17 = stackAr16.topAndPop();
        stackAr12.push((java.lang.Object) stackAr16);
        java.lang.Object obj19 = stackAr12.top();
        stackAr12.pop();
        stackAr1.push((java.lang.Object) stackAr12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test265");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.makeEmpty();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test266");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test267");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        java.lang.Object obj18 = stackAr15.top();
        stackAr15.push((java.lang.Object) false);
        stackAr1.push((java.lang.Object) stackAr15);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test268");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) (byte) 100);
        stackAr4.makeEmpty();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj8 = stackAr7.topAndPop();
        java.lang.Object obj9 = stackAr7.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.makeEmpty();
        stackAr7.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(1);
        stackAr17.push((java.lang.Object) 'a');
        stackAr17.pop();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr22.push((java.lang.Object) stackAr24);
        stackAr17.push((java.lang.Object) stackAr24);
        stackAr11.push((java.lang.Object) stackAr24);
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(1);
        stackAr30.push((java.lang.Object) 'a');
        stackAr30.pop();
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr35.push((java.lang.Object) stackAr37);
        stackAr30.push((java.lang.Object) stackAr37);
        stackAr30.makeEmpty();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj43 = stackAr42.topAndPop();
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr45.makeEmpty();
        java.lang.Object obj47 = stackAr45.top();
        DataStructures.daikon.StackAr stackAr49 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj50 = stackAr49.top();
        stackAr45.push((java.lang.Object) stackAr49);
        stackAr42.push((java.lang.Object) stackAr45);
        stackAr30.push((java.lang.Object) stackAr42);
        stackAr42.pop();
        stackAr11.push((java.lang.Object) stackAr42);
        java.lang.Object obj56 = stackAr42.topAndPop();
        stackAr4.push(obj56);
        stackAr1.push(obj56);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test269");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) (short) 100);
        stackAr1.push((java.lang.Object) (short) 100);
        stackAr1.pop();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test270");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        stackAr1.pop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test271");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
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
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test272");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.topAndPop();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test273");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test274");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        stackAr1.push(obj6);
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test275");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj9 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) (-8));
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr15.push((java.lang.Object) stackAr17);
        stackAr8.push((java.lang.Object) stackAr15);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj22 = stackAr8.topAndPop();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test276");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.pop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(1);
        stackAr10.push((java.lang.Object) 'a');
        stackAr10.pop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        java.lang.Object obj15 = stackAr10.top();
        java.lang.Object obj16 = stackAr10.topAndPop();
        java.lang.Object obj17 = stackAr10.topAndPop();
        java.lang.Object obj18 = stackAr10.top();
        java.lang.Object obj19 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr1.makeEmpty();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test277");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = stackAr1.top();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test278");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(1);
        stackAr21.push((java.lang.Object) 'a');
        java.lang.Object obj24 = stackAr21.top();
        stackAr18.push(obj24);
        stackAr1.push((java.lang.Object) stackAr18);
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr28.makeEmpty();
        java.lang.Object obj30 = stackAr28.top();
        java.lang.Object obj31 = stackAr28.topAndPop();
        stackAr28.push((java.lang.Object) (-5));
        stackAr28.pop();
        stackAr28.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr28);
        java.lang.Object obj37 = stackAr1.top();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test279");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj6 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(1);
        stackAr8.push((java.lang.Object) 'a');
        stackAr8.pop();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr13.push((java.lang.Object) stackAr15);
        stackAr8.push((java.lang.Object) stackAr15);
        stackAr5.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        stackAr1.makeEmpty();
        java.lang.Object obj21 = stackAr1.top();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test280");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj14 = stackAr13.top();
        stackAr1.push((java.lang.Object) stackAr13);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test281");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr1.makeEmpty();
        java.lang.Object obj26 = stackAr1.top();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test282");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) (-4));
        java.lang.Object obj4 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr6.makeEmpty();
        java.lang.Object obj8 = stackAr6.top();
        java.lang.Object obj9 = stackAr6.topAndPop();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj11 = stackAr1.top();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test283");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test284");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj5 = new java.lang.Object();
        stackAr4.push(obj5);
        stackAr1.push(obj5);
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test285");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        stackAr1.push((java.lang.Object) stackAr9);
        stackAr9.makeEmpty();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test286");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr1.push(obj4);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test287");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        stackAr1.makeEmpty();
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
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test288");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
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
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test289");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.top();
        stackAr1.push(obj15);
        java.lang.Object obj17 = stackAr1.topAndPop();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test290");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr11.makeEmpty();
        java.lang.Object obj13 = stackAr11.top();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj16 = stackAr15.topAndPop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        java.lang.Object obj21 = stackAr18.top();
        java.lang.Object obj22 = stackAr18.top();
        java.lang.Object obj23 = stackAr18.top();
        stackAr15.push(obj23);
        stackAr11.push(obj23);
        java.lang.Object obj26 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr28.makeEmpty();
        java.lang.Object obj30 = stackAr28.top();
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj33 = stackAr32.topAndPop();
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr35.makeEmpty();
        java.lang.Object obj37 = stackAr35.top();
        java.lang.Object obj38 = stackAr35.top();
        java.lang.Object obj39 = stackAr35.top();
        java.lang.Object obj40 = stackAr35.top();
        stackAr32.push(obj40);
        stackAr28.push(obj40);
        stackAr11.push(obj40);
        stackAr1.push((java.lang.Object) stackAr11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test291");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 10);
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        stackAr4.pop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr9.push((java.lang.Object) stackAr11);
        stackAr4.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test292");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr14.makeEmpty();
        java.lang.Object obj16 = stackAr14.top();
        java.lang.Object obj17 = stackAr14.top();
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.top();
        stackAr11.push(obj19);
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        java.lang.Object obj28 = stackAr24.top();
        java.lang.Object obj29 = stackAr24.top();
        stackAr1.push((java.lang.Object) stackAr24);
        stackAr1.makeEmpty();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test293");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.pop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(1);
        stackAr10.push((java.lang.Object) 'a');
        stackAr10.pop();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) (short) 1);
        java.lang.Object obj17 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj22 = stackAr21.topAndPop();
        stackAr21.push((java.lang.Object) (-8));
        java.lang.Object obj25 = stackAr21.top();
        java.lang.Object obj26 = stackAr21.top();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr28.push((java.lang.Object) stackAr30);
        stackAr21.push((java.lang.Object) stackAr28);
        stackAr19.push((java.lang.Object) stackAr21);
        stackAr19.makeEmpty();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(1);
        stackAr36.push((java.lang.Object) 'a');
        java.lang.Object obj39 = stackAr36.top();
        stackAr19.push(obj39);
        java.lang.Object obj41 = stackAr19.top();
        stackAr19.pop();
        java.lang.Object obj43 = stackAr19.top();
        stackAr1.push(obj43);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test294");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        stackAr6.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr6);
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test295");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.top();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test296");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test297");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(1);
        stackAr8.push((java.lang.Object) 'a');
        java.lang.Object obj11 = stackAr8.top();
        stackAr5.push(obj11);
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) '#');
        stackAr14.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr14);
        java.lang.Object obj17 = stackAr14.top();
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.top();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj22 = stackAr21.topAndPop();
        stackAr14.push(obj22);
        stackAr1.push(obj22);
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr26.makeEmpty();
        java.lang.Object obj28 = stackAr26.top();
        java.lang.Object obj29 = stackAr26.topAndPop();
        java.lang.Object obj30 = stackAr26.top();
        java.lang.Object obj31 = stackAr26.topAndPop();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr33.makeEmpty();
        java.lang.Object obj35 = stackAr33.top();
        java.lang.Object obj36 = stackAr33.topAndPop();
        stackAr33.push((java.lang.Object) (-5));
        stackAr33.pop();
        java.lang.Object obj40 = stackAr33.topAndPop();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(1);
        stackAr42.push((java.lang.Object) 'a');
        stackAr42.pop();
        stackAr33.push((java.lang.Object) stackAr42);
        stackAr26.push((java.lang.Object) stackAr33);
        stackAr1.push((java.lang.Object) stackAr33);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test298");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj10 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(1);
        stackAr12.push((java.lang.Object) 'a');
        java.lang.Object obj15 = stackAr12.top();
        stackAr9.push(obj15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        stackAr18.makeEmpty();
        stackAr9.push((java.lang.Object) stackAr18);
        stackAr1.push((java.lang.Object) stackAr9);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(1);
        stackAr25.push((java.lang.Object) 'a');
        stackAr25.pop();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr30.push((java.lang.Object) stackAr32);
        stackAr25.push((java.lang.Object) stackAr32);
        stackAr23.push((java.lang.Object) stackAr32);
        stackAr32.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr32);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test299");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(8);
        java.lang.Object obj11 = stackAr10.topAndPop();
        stackAr1.push(obj11);
        java.lang.Object obj13 = stackAr1.top();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test300");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.top();
        stackAr4.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.top();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test301");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj5 = new java.lang.Object();
        stackAr4.push(obj5);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj9 = stackAr8.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        java.lang.Object obj14 = stackAr11.top();
        stackAr8.push(obj14);
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) '#');
        stackAr17.makeEmpty();
        stackAr8.push((java.lang.Object) stackAr17);
        java.lang.Object obj20 = stackAr17.top();
        java.lang.Object obj21 = stackAr17.top();
        java.lang.Object obj22 = stackAr17.top();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj25 = stackAr24.topAndPop();
        stackAr17.push(obj25);
        stackAr4.push(obj25);
        stackAr4.pop();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj30 = stackAr1.top();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test302");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(0);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        java.lang.Object obj7 = stackAr3.topAndPop();
        java.lang.Object obj8 = stackAr3.top();
        java.lang.Object obj9 = stackAr3.top();
        java.lang.Object obj10 = stackAr3.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr3);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test303");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(1);
        stackAr21.push((java.lang.Object) 'a');
        java.lang.Object obj24 = stackAr21.top();
        stackAr18.push(obj24);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) '#');
        stackAr27.makeEmpty();
        stackAr18.push((java.lang.Object) stackAr27);
        java.lang.Object obj30 = stackAr18.top();
        stackAr1.push(obj30);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test304");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (short) 100);
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test305");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 0.0d);
        stackAr1.makeEmpty();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test306");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.top();
        java.lang.Object obj9 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr5.topAndPop();
        stackAr5.makeEmpty();
        stackAr5.makeEmpty();
        java.lang.Object obj14 = stackAr5.top();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test307");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.pop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj11 = stackAr10.top();
        stackAr10.makeEmpty();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr14.makeEmpty();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj18 = stackAr17.topAndPop();
        stackAr17.push((java.lang.Object) (-1.0d));
        stackAr17.push((java.lang.Object) (-1.0d));
        stackAr17.pop();
        stackAr14.push((java.lang.Object) stackAr17);
        stackAr10.push((java.lang.Object) stackAr17);
        stackAr1.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj31 = stackAr30.topAndPop();
        stackAr30.push((java.lang.Object) (-8));
        java.lang.Object obj34 = stackAr30.top();
        java.lang.Object obj35 = stackAr30.top();
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr37.push((java.lang.Object) stackAr39);
        stackAr30.push((java.lang.Object) stackAr37);
        stackAr28.push((java.lang.Object) stackAr30);
        java.lang.Object obj43 = stackAr28.top();
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj46 = new java.lang.Object();
        stackAr45.push(obj46);
        stackAr28.push((java.lang.Object) stackAr45);
        stackAr10.push((java.lang.Object) stackAr45);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test308");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        stackAr11.push((java.lang.Object) (-8));
        java.lang.Object obj15 = stackAr11.top();
        java.lang.Object obj16 = stackAr11.top();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr18.push((java.lang.Object) stackAr20);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr9.push((java.lang.Object) stackAr11);
        stackAr11.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test309");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        java.lang.Object obj18 = stackAr15.top();
        stackAr15.push((java.lang.Object) false);
        stackAr1.push((java.lang.Object) stackAr15);
        java.lang.Object obj22 = stackAr1.top();
        stackAr1.pop();
        java.lang.Object obj24 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test310");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test311");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj10 = stackAr9.topAndPop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.topAndPop();
        java.lang.Object obj16 = stackAr12.topAndPop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        java.lang.Object obj21 = stackAr18.topAndPop();
        stackAr18.push((java.lang.Object) (-5));
        stackAr18.makeEmpty();
        stackAr12.push((java.lang.Object) stackAr18);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj30 = stackAr29.topAndPop();
        stackAr29.push((java.lang.Object) (-8));
        java.lang.Object obj33 = stackAr29.top();
        java.lang.Object obj34 = stackAr29.top();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr36.push((java.lang.Object) stackAr38);
        stackAr29.push((java.lang.Object) stackAr36);
        stackAr27.push((java.lang.Object) stackAr29);
        stackAr27.makeEmpty();
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr(1);
        stackAr44.push((java.lang.Object) 'a');
        java.lang.Object obj47 = stackAr44.top();
        stackAr27.push(obj47);
        stackAr27.pop();
        java.lang.Object obj50 = stackAr27.topAndPop();
        stackAr18.push((java.lang.Object) stackAr27);
        java.lang.Object obj52 = stackAr27.top();
        DataStructures.daikon.StackAr stackAr54 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr54.makeEmpty();
        stackAr54.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr59 = new DataStructures.daikon.StackAr(10);
        stackAr59.makeEmpty();
        stackAr54.push((java.lang.Object) stackAr59);
        stackAr27.push((java.lang.Object) stackAr59);
        stackAr9.push((java.lang.Object) stackAr27);
        java.lang.Object obj64 = stackAr9.topAndPop();
        stackAr5.push((java.lang.Object) stackAr9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test312");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test313");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.push((java.lang.Object) 100);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(1);
        stackAr10.push((java.lang.Object) 'a');
        stackAr10.pop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(1);
        stackAr16.push((java.lang.Object) 'a');
        stackAr16.pop();
        java.lang.Object obj20 = stackAr16.topAndPop();
        java.lang.Object obj21 = stackAr16.top();
        stackAr10.push(obj21);
        java.lang.Object obj23 = stackAr10.topAndPop();
        java.lang.Object obj24 = stackAr10.topAndPop();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr1.makeEmpty();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test314");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr14.makeEmpty();
        java.lang.Object obj16 = stackAr14.top();
        java.lang.Object obj17 = stackAr14.top();
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.top();
        stackAr11.push(obj19);
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        java.lang.Object obj28 = stackAr24.top();
        java.lang.Object obj29 = stackAr24.top();
        stackAr1.push((java.lang.Object) stackAr24);
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test315");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test316");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj10 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(1);
        stackAr12.push((java.lang.Object) 'a');
        stackAr12.pop();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr17.push((java.lang.Object) stackAr19);
        stackAr12.push((java.lang.Object) stackAr19);
        stackAr9.push((java.lang.Object) stackAr19);
        java.lang.Object obj23 = stackAr19.topAndPop();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj26 = new java.lang.Object();
        stackAr25.push(obj26);
        stackAr25.pop();
        java.lang.Object obj29 = stackAr25.top();
        java.lang.Object obj30 = stackAr25.top();
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj33 = stackAr32.top();
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr(1);
        stackAr35.push((java.lang.Object) 'a');
        java.lang.Object obj38 = stackAr35.top();
        stackAr32.push(obj38);
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr((int) '#');
        stackAr41.makeEmpty();
        stackAr32.push((java.lang.Object) stackAr41);
        java.lang.Object obj44 = stackAr41.top();
        java.lang.Object obj45 = stackAr41.top();
        stackAr25.push(obj45);
        stackAr19.push(obj45);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr19);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test317");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test318");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-4));
        java.lang.Object obj8 = stackAr1.top();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test319");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr13.makeEmpty();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 10);
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj30 = stackAr29.topAndPop();
        java.lang.Object obj31 = stackAr29.topAndPop();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj34 = stackAr33.topAndPop();
        stackAr29.push((java.lang.Object) stackAr33);
        stackAr27.push((java.lang.Object) stackAr29);
        stackAr29.pop();
        stackAr13.push((java.lang.Object) stackAr29);
        // The following exception was thrown during execution in test generation
        try {
            stackAr29.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test320");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr1.pop();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test321");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.topAndPop();
        java.lang.Object obj14 = stackAr1.top();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test322");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(8);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.pop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr5.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr12);
        java.lang.Object obj16 = stackAr3.topAndPop();
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.makeEmpty();
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test323");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        java.lang.Object obj18 = stackAr15.top();
        stackAr15.push((java.lang.Object) false);
        stackAr1.push((java.lang.Object) stackAr15);
        java.lang.Object obj22 = stackAr1.top();
        stackAr1.pop();
        java.lang.Object obj24 = null;
        stackAr1.push(obj24);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test324");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test325");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr5.makeEmpty();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test326");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr9.makeEmpty();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(1);
        stackAr12.push((java.lang.Object) 'a');
        java.lang.Object obj15 = stackAr12.top();
        stackAr9.push(obj15);
        stackAr1.push((java.lang.Object) stackAr9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test327");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(1);
        stackAr15.push((java.lang.Object) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj19 = stackAr15.top();
        java.lang.Object obj20 = stackAr15.topAndPop();
        stackAr12.push(obj20);
        stackAr1.push(obj20);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test328");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test329");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.top();
        stackAr5.push((java.lang.Object) (byte) 0);
        stackAr1.push((java.lang.Object) (byte) 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test330");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj10 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(1);
        stackAr12.push((java.lang.Object) 'a');
        java.lang.Object obj15 = stackAr12.top();
        stackAr9.push(obj15);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        stackAr18.makeEmpty();
        stackAr9.push((java.lang.Object) stackAr18);
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.Object obj22 = stackAr1.topAndPop();
        java.lang.Object obj23 = stackAr1.top();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test331");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test332");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        stackAr4.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj12 = stackAr4.top();
        java.lang.Object obj13 = stackAr4.top();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test333");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj10 = stackAr9.top();
        java.lang.Object obj11 = stackAr9.topAndPop();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj14 = stackAr13.top();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(1);
        stackAr16.push((java.lang.Object) 'a');
        stackAr16.pop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr21.push((java.lang.Object) stackAr23);
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr13.push((java.lang.Object) stackAr23);
        stackAr9.push((java.lang.Object) stackAr23);
        stackAr9.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test334");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = stackAr1.topAndPop();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test335");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(5);
        java.lang.Object obj23 = stackAr22.top();
        stackAr1.push((java.lang.Object) stackAr22);
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr(1);
        stackAr26.push((java.lang.Object) 'a');
        stackAr26.pop();
        java.lang.Object obj30 = stackAr26.topAndPop();
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr(1);
        stackAr32.push((java.lang.Object) 'a');
        stackAr32.pop();
        java.lang.Object obj36 = stackAr32.topAndPop();
        java.lang.Object obj37 = stackAr32.top();
        stackAr26.push(obj37);
        java.lang.Object obj39 = stackAr26.topAndPop();
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr(9);
        java.lang.Object obj42 = stackAr41.top();
        stackAr26.push((java.lang.Object) stackAr41);
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj46 = stackAr45.topAndPop();
        stackAr45.push((java.lang.Object) (-1.0d));
        stackAr45.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr52 = new DataStructures.daikon.StackAr(1);
        stackAr52.push((java.lang.Object) 'a');
        stackAr52.pop();
        stackAr45.push((java.lang.Object) stackAr52);
        stackAr45.makeEmpty();
        stackAr41.push((java.lang.Object) stackAr45);
        stackAr22.push((java.lang.Object) stackAr41);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test336");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.top();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test337");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.topAndPop();
        stackAr18.push((java.lang.Object) (-8));
        java.lang.Object obj22 = stackAr18.top();
        java.lang.Object obj23 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr25.push((java.lang.Object) stackAr27);
        stackAr18.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(1);
        stackAr33.push((java.lang.Object) 'a');
        java.lang.Object obj36 = stackAr33.top();
        stackAr16.push(obj36);
        stackAr16.pop();
        java.lang.Object obj39 = stackAr16.topAndPop();
        stackAr7.push((java.lang.Object) stackAr16);
        java.lang.Object obj41 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr43 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr43.makeEmpty();
        stackAr43.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr48 = new DataStructures.daikon.StackAr(10);
        stackAr48.makeEmpty();
        stackAr43.push((java.lang.Object) stackAr48);
        stackAr16.push((java.lang.Object) stackAr48);
        java.lang.Object obj52 = stackAr48.top();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test338");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test339");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.top();
        java.lang.Object obj7 = stackAr3.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        stackAr9.push((java.lang.Object) 'a');
        stackAr9.makeEmpty();
        java.lang.Object obj13 = stackAr9.top();
        stackAr9.makeEmpty();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj17 = stackAr16.topAndPop();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr19.makeEmpty();
        java.lang.Object obj21 = stackAr19.top();
        java.lang.Object obj22 = stackAr19.topAndPop();
        stackAr19.push((java.lang.Object) (-5));
        stackAr19.pop();
        stackAr16.push((java.lang.Object) stackAr19);
        stackAr9.push((java.lang.Object) stackAr19);
        stackAr9.makeEmpty();
        stackAr3.push((java.lang.Object) stackAr9);
        stackAr3.pop();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test340");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.top();
        stackAr4.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test341");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr3.makeEmpty();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-5));
        stackAr3.push((java.lang.Object) true);
        stackAr1.push((java.lang.Object) true);
        stackAr1.makeEmpty();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test342");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        stackAr1.push((java.lang.Object) stackAr9);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj17 = stackAr16.top();
        stackAr12.push((java.lang.Object) stackAr16);
        stackAr12.makeEmpty();
        java.lang.Object obj20 = stackAr12.topAndPop();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj23 = stackAr22.topAndPop();
        java.lang.Object obj24 = stackAr22.topAndPop();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr(1);
        stackAr26.push((java.lang.Object) 'a');
        stackAr26.makeEmpty();
        stackAr22.push((java.lang.Object) stackAr26);
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr(1);
        stackAr32.push((java.lang.Object) 'a');
        stackAr32.pop();
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr37.push((java.lang.Object) stackAr39);
        stackAr32.push((java.lang.Object) stackAr39);
        stackAr26.push((java.lang.Object) stackAr39);
        java.lang.Object obj43 = stackAr26.topAndPop();
        stackAr12.push(obj43);
        stackAr9.push(obj43);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test343");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 1);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        stackAr1.push(obj6);
        java.lang.Object obj8 = stackAr1.topAndPop();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test344");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.topAndPop();
        java.lang.Object obj14 = stackAr1.topAndPop();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test345");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj11 = stackAr10.topAndPop();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr1.push((java.lang.Object) stackAr10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test346");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr3.makeEmpty();
        java.lang.Object obj5 = stackAr3.top();
        java.lang.Object obj6 = stackAr3.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        stackAr3.push(obj11);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj15 = stackAr3.top();
        java.lang.Object obj16 = stackAr3.topAndPop();
        java.lang.Object obj17 = stackAr3.top();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test347");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test348");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj8 = stackAr7.topAndPop();
        java.lang.Object obj9 = stackAr7.top();
        stackAr1.push(obj9);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test349");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 4);
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj33 = stackAr32.topAndPop();
        stackAr32.push((java.lang.Object) (-8));
        java.lang.Object obj36 = stackAr32.top();
        java.lang.Object obj37 = stackAr32.top();
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr39.push((java.lang.Object) stackAr41);
        stackAr32.push((java.lang.Object) stackAr39);
        stackAr30.push((java.lang.Object) stackAr32);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr30);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test350");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        stackAr5.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr5.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test351");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr4.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push((java.lang.Object) stackAr4);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.topAndPop();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.topAndPop();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr19.makeEmpty();
        java.lang.Object obj21 = stackAr19.top();
        java.lang.Object obj22 = stackAr19.topAndPop();
        stackAr19.push((java.lang.Object) (-5));
        stackAr19.pop();
        java.lang.Object obj26 = stackAr19.topAndPop();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(1);
        stackAr28.push((java.lang.Object) 'a');
        stackAr28.pop();
        stackAr19.push((java.lang.Object) stackAr28);
        stackAr12.push((java.lang.Object) stackAr19);
        stackAr4.push((java.lang.Object) stackAr12);
        java.lang.Object obj35 = stackAr4.topAndPop();
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr(2);
        java.lang.Object obj38 = stackAr37.top();
        stackAr4.push(obj38);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test352");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        stackAr5.pop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(1);
        stackAr24.push((java.lang.Object) 'a');
        stackAr24.pop();
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr29.push((java.lang.Object) stackAr31);
        stackAr24.push((java.lang.Object) stackAr31);
        stackAr24.makeEmpty();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj37 = stackAr36.topAndPop();
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr39.makeEmpty();
        java.lang.Object obj41 = stackAr39.top();
        DataStructures.daikon.StackAr stackAr43 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj44 = stackAr43.top();
        stackAr39.push((java.lang.Object) stackAr43);
        stackAr36.push((java.lang.Object) stackAr39);
        stackAr24.push((java.lang.Object) stackAr36);
        stackAr36.pop();
        stackAr5.push((java.lang.Object) stackAr36);
        java.lang.Object obj50 = stackAr36.topAndPop();
        stackAr36.makeEmpty();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test353");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test354");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
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
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test355");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        stackAr9.push((java.lang.Object) 'a');
        stackAr9.pop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr14.push((java.lang.Object) stackAr16);
        stackAr9.push((java.lang.Object) stackAr16);
        stackAr9.makeEmpty();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj22 = stackAr21.topAndPop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj29 = stackAr28.top();
        stackAr24.push((java.lang.Object) stackAr28);
        stackAr21.push((java.lang.Object) stackAr24);
        stackAr9.push((java.lang.Object) stackAr21);
        stackAr21.makeEmpty();
        stackAr21.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr21);
        java.lang.Object obj36 = stackAr1.topAndPop();
        java.lang.Object obj37 = stackAr1.topAndPop();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test356");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr5.makeEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj9 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) (-1.0d));
        stackAr8.push((java.lang.Object) (-1.0d));
        stackAr8.pop();
        stackAr5.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj17 = stackAr1.top();
        java.lang.Object obj18 = stackAr1.top();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test357");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        stackAr5.pop();
        java.lang.Object obj23 = stackAr5.top();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test358");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj13 = stackAr1.topAndPop();
        java.lang.Object obj14 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test359");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.topAndPop();
        java.lang.Object obj11 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test360");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 1);
        java.lang.Object obj2 = stackAr1.top();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test361");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.top();
        java.lang.Object obj9 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr5.topAndPop();
        stackAr5.makeEmpty();
        java.lang.Object obj13 = stackAr5.topAndPop();
        stackAr5.makeEmpty();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test362");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        stackAr5.makeEmpty();
        java.lang.Object obj23 = stackAr5.top();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test363");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        java.lang.Object obj12 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr15.push((java.lang.Object) stackAr17);
        stackAr1.push((java.lang.Object) stackAr17);
        java.lang.Object obj20 = stackAr1.topAndPop();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test364");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test365");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(1);
        stackAr18.push((java.lang.Object) 'a');
        java.lang.Object obj21 = stackAr18.top();
        stackAr1.push(obj21);
        stackAr1.pop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test366");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        java.lang.Object obj12 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr15.push((java.lang.Object) stackAr17);
        stackAr1.push((java.lang.Object) stackAr17);
        java.lang.Object obj20 = stackAr17.topAndPop();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test367");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.push((java.lang.Object) 100);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj11 = stackAr10.top();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.top();
        stackAr10.push((java.lang.Object) (byte) 0);
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj18 = stackAr10.top();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test368");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test369");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.top();
        java.lang.Object obj9 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj11 = stackAr5.topAndPop();
        stackAr5.makeEmpty();
        stackAr5.makeEmpty();
        java.lang.Object obj14 = stackAr5.topAndPop();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test370");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test371");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(1);
        stackAr8.push((java.lang.Object) 'a');
        stackAr8.pop();
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test372");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj21 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test373");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        java.lang.Object obj15 = stackAr10.top();
        stackAr1.push(obj15);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr19.makeEmpty();
        java.lang.Object obj21 = stackAr19.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj24 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr26.makeEmpty();
        java.lang.Object obj28 = stackAr26.top();
        java.lang.Object obj29 = stackAr26.top();
        java.lang.Object obj30 = stackAr26.top();
        java.lang.Object obj31 = stackAr26.top();
        stackAr23.push(obj31);
        stackAr19.push(obj31);
        stackAr1.push((java.lang.Object) stackAr19);
        stackAr19.pop();
        stackAr19.makeEmpty();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test374");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-4));
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test375");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj10 = new java.lang.Object();
        stackAr9.push(obj10);
        stackAr9.makeEmpty();
        java.lang.Object obj13 = stackAr9.top();
        stackAr1.push(obj13);
        java.lang.Object obj15 = stackAr1.top();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test376");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        java.lang.Object obj12 = stackAr1.top();
        stackAr1.pop();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test377");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj16 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj19 = new java.lang.Object();
        stackAr18.push(obj19);
        stackAr1.push((java.lang.Object) stackAr18);
        stackAr1.makeEmpty();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test378");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test379");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr3.pop();
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr12.makeEmpty();
        java.lang.Object obj14 = stackAr12.top();
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        java.lang.Object obj17 = stackAr12.top();
        stackAr3.push(obj17);
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(5);
        java.lang.Object obj23 = stackAr22.top();
        stackAr1.push((java.lang.Object) stackAr22);
        stackAr22.makeEmpty();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 0);
        stackAr27.makeEmpty();
        java.lang.Object obj29 = stackAr27.topAndPop();
        java.lang.Object obj30 = stackAr27.topAndPop();
        stackAr22.push(obj30);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test380");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.top();
        java.lang.Object obj12 = stackAr1.top();
        java.lang.Object obj13 = stackAr1.topAndPop();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test381");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test382");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) 6);
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj10 = new java.lang.Object();
        stackAr9.push(obj10);
        java.lang.Object obj12 = stackAr9.topAndPop();
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.Object obj14 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test383");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj11 = stackAr10.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(1);
        stackAr13.push((java.lang.Object) 'a');
        stackAr13.pop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr18.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr20);
        stackAr10.push((java.lang.Object) stackAr20);
        stackAr6.push((java.lang.Object) stackAr20);
        stackAr1.push((java.lang.Object) stackAr20);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr27.makeEmpty();
        java.lang.Object obj29 = stackAr27.top();
        java.lang.Object obj30 = stackAr27.topAndPop();
        java.lang.Object obj31 = stackAr27.topAndPop();
        stackAr1.push((java.lang.Object) stackAr27);
        stackAr1.makeEmpty();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test384");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.topAndPop();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test385");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr1.top();
        stackAr1.pop();
        java.lang.Object obj15 = stackAr1.topAndPop();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test386");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr1.pop();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test387");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj7 = stackAr6.topAndPop();
        stackAr6.push((java.lang.Object) (-8));
        java.lang.Object obj10 = stackAr6.top();
        java.lang.Object obj11 = stackAr6.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr13.push((java.lang.Object) stackAr15);
        stackAr6.push((java.lang.Object) stackAr13);
        stackAr4.push((java.lang.Object) stackAr6);
        java.lang.Object obj19 = stackAr4.top();
        stackAr1.push((java.lang.Object) stackAr4);
        java.lang.Object obj21 = stackAr1.topAndPop();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test388");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr14.makeEmpty();
        java.lang.Object obj16 = stackAr14.top();
        java.lang.Object obj17 = stackAr14.top();
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.top();
        stackAr11.push(obj19);
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        java.lang.Object obj28 = stackAr24.top();
        java.lang.Object obj29 = stackAr24.top();
        stackAr1.push((java.lang.Object) stackAr24);
        java.lang.Object obj31 = stackAr24.top();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test389");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) (short) 10);
        stackAr5.makeEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj9 = stackAr8.topAndPop();
        stackAr8.push((java.lang.Object) (-1.0d));
        stackAr8.push((java.lang.Object) (-1.0d));
        stackAr8.pop();
        stackAr5.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj17 = stackAr1.top();
        java.lang.Object obj18 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test390");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(1);
        stackAr18.push((java.lang.Object) 'a');
        java.lang.Object obj21 = stackAr18.top();
        stackAr1.push(obj21);
        stackAr1.pop();
        java.lang.Object obj24 = stackAr1.topAndPop();
        java.lang.Object obj25 = stackAr1.top();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test391");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr14.makeEmpty();
        java.lang.Object obj16 = stackAr14.top();
        java.lang.Object obj17 = stackAr14.top();
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.top();
        stackAr11.push(obj19);
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        java.lang.Object obj28 = stackAr24.top();
        java.lang.Object obj29 = stackAr24.top();
        stackAr1.push((java.lang.Object) stackAr24);
        stackAr1.pop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test392");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        stackAr5.pop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(1);
        stackAr24.push((java.lang.Object) 'a');
        stackAr24.pop();
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr29.push((java.lang.Object) stackAr31);
        stackAr24.push((java.lang.Object) stackAr31);
        stackAr24.makeEmpty();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj37 = stackAr36.topAndPop();
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr39.makeEmpty();
        java.lang.Object obj41 = stackAr39.top();
        DataStructures.daikon.StackAr stackAr43 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj44 = stackAr43.top();
        stackAr39.push((java.lang.Object) stackAr43);
        stackAr36.push((java.lang.Object) stackAr39);
        stackAr24.push((java.lang.Object) stackAr36);
        stackAr36.pop();
        stackAr5.push((java.lang.Object) stackAr36);
        java.lang.Object obj50 = stackAr36.topAndPop();
        java.lang.Object obj51 = stackAr36.topAndPop();
        DataStructures.daikon.StackAr stackAr53 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj54 = stackAr53.top();
        DataStructures.daikon.StackAr stackAr56 = new DataStructures.daikon.StackAr(1);
        stackAr56.push((java.lang.Object) 'a');
        java.lang.Object obj59 = stackAr56.top();
        stackAr53.push(obj59);
        stackAr53.pop();
        java.lang.Object obj62 = stackAr53.top();
        stackAr36.push(obj62);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test393");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        stackAr1.push((java.lang.Object) 100);
        java.lang.Object obj9 = stackAr1.topAndPop();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test394");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj13 = stackAr12.top();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr(1);
        stackAr15.push((java.lang.Object) 'a');
        java.lang.Object obj18 = stackAr15.top();
        stackAr12.push(obj18);
        stackAr12.makeEmpty();
        java.lang.Object obj21 = stackAr12.topAndPop();
        stackAr1.push(obj21);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test395");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.top();
        java.lang.Object obj9 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr5.makeEmpty();
        java.lang.Object obj12 = stackAr5.topAndPop();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test396");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test397");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj13 = stackAr10.top();
        java.lang.Object obj14 = stackAr10.top();
        stackAr10.makeEmpty();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test398");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test399");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) 8);
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj8 = stackAr7.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj11 = new java.lang.Object();
        stackAr10.push(obj11);
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj15 = stackAr14.top();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(1);
        stackAr17.push((java.lang.Object) 'a');
        java.lang.Object obj20 = stackAr17.top();
        stackAr14.push(obj20);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) '#');
        stackAr23.makeEmpty();
        stackAr14.push((java.lang.Object) stackAr23);
        java.lang.Object obj26 = stackAr23.top();
        java.lang.Object obj27 = stackAr23.top();
        java.lang.Object obj28 = stackAr23.top();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj31 = stackAr30.topAndPop();
        stackAr23.push(obj31);
        stackAr10.push(obj31);
        stackAr10.pop();
        stackAr7.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr7);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test400");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        stackAr1.pop();
        java.lang.Object obj10 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test401");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr4.push((java.lang.Object) stackAr6);
        java.lang.Object obj8 = stackAr4.top();
        java.lang.Object obj9 = stackAr4.topAndPop();
        stackAr1.push((java.lang.Object) stackAr4);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj13 = stackAr12.topAndPop();
        java.lang.Object obj14 = stackAr12.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj17 = stackAr16.topAndPop();
        stackAr16.push((java.lang.Object) (-8));
        java.lang.Object obj20 = stackAr16.top();
        java.lang.Object obj21 = stackAr16.topAndPop();
        stackAr12.push(obj21);
        stackAr4.push(obj21);
        stackAr4.makeEmpty();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test402");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj5 = new java.lang.Object();
        stackAr4.push(obj5);
        java.lang.Object obj7 = stackAr4.topAndPop();
        stackAr1.push(obj7);
        java.lang.Object obj9 = stackAr1.topAndPop();
        java.lang.Object obj10 = stackAr1.top();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test403");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.top();
        stackAr4.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr4);
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj12 = stackAr11.topAndPop();
        stackAr11.push((java.lang.Object) (-1.0d));
        stackAr11.push((java.lang.Object) (-1.0d));
        stackAr11.pop();
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr20.makeEmpty();
        java.lang.Object obj22 = stackAr20.top();
        java.lang.Object obj23 = stackAr20.top();
        java.lang.Object obj24 = stackAr20.top();
        java.lang.Object obj25 = stackAr20.top();
        stackAr11.push(obj25);
        stackAr11.makeEmpty();
        stackAr9.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(5);
        java.lang.Object obj31 = stackAr30.top();
        stackAr9.push((java.lang.Object) stackAr30);
        stackAr30.makeEmpty();
        stackAr4.push((java.lang.Object) stackAr30);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test404");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj10 = stackAr9.topAndPop();
        java.lang.Object obj11 = stackAr9.topAndPop();
        java.lang.Object obj12 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj17 = stackAr16.topAndPop();
        stackAr16.push((java.lang.Object) (-8));
        java.lang.Object obj20 = stackAr16.top();
        java.lang.Object obj21 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr23.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr14.push((java.lang.Object) stackAr16);
        stackAr9.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr16);
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj34 = new java.lang.Object();
        stackAr33.push(obj34);
        stackAr33.pop();
        java.lang.Object obj37 = stackAr33.topAndPop();
        stackAr33.push((java.lang.Object) 6);
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj42 = new java.lang.Object();
        stackAr41.push(obj42);
        java.lang.Object obj44 = stackAr41.topAndPop();
        stackAr33.push((java.lang.Object) stackAr41);
        java.lang.Object obj46 = stackAr33.top();
        stackAr1.push(obj46);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test405");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        stackAr1.pop();
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Object obj11 = stackAr1.top();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test406");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test407");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        java.lang.Object obj12 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test408");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = null;
        stackAr1.push(obj7);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test409");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj9 = stackAr8.topAndPop();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr11.makeEmpty();
        java.lang.Object obj13 = stackAr11.top();
        java.lang.Object obj14 = stackAr11.topAndPop();
        stackAr11.push((java.lang.Object) (-5));
        stackAr11.pop();
        stackAr8.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
        java.lang.Object obj20 = stackAr1.topAndPop();
        java.lang.Object obj21 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj24 = new java.lang.Object();
        stackAr23.push(obj24);
        stackAr23.pop();
        java.lang.Object obj27 = stackAr23.topAndPop();
        java.lang.Object obj28 = stackAr23.topAndPop();
        stackAr23.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr23);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test410");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        stackAr4.pop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr9.push((java.lang.Object) stackAr11);
        stackAr4.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
        java.lang.Object obj15 = stackAr11.topAndPop();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj20 = stackAr19.topAndPop();
        stackAr19.push((java.lang.Object) (-8));
        java.lang.Object obj23 = stackAr19.top();
        java.lang.Object obj24 = stackAr19.top();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr26.push((java.lang.Object) stackAr28);
        stackAr19.push((java.lang.Object) stackAr26);
        stackAr17.push((java.lang.Object) stackAr19);
        java.lang.Object obj32 = stackAr17.top();
        DataStructures.daikon.StackAr stackAr34 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj35 = new java.lang.Object();
        stackAr34.push(obj35);
        stackAr17.push((java.lang.Object) stackAr34);
        stackAr11.push((java.lang.Object) stackAr34);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test411");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        java.lang.Object obj21 = stackAr18.topAndPop();
        java.lang.Object obj22 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        stackAr24.push((java.lang.Object) (-5));
        stackAr24.makeEmpty();
        stackAr18.push((java.lang.Object) stackAr24);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj36 = stackAr35.topAndPop();
        stackAr35.push((java.lang.Object) (-8));
        java.lang.Object obj39 = stackAr35.top();
        java.lang.Object obj40 = stackAr35.top();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr42.push((java.lang.Object) stackAr44);
        stackAr35.push((java.lang.Object) stackAr42);
        stackAr33.push((java.lang.Object) stackAr35);
        stackAr33.makeEmpty();
        DataStructures.daikon.StackAr stackAr50 = new DataStructures.daikon.StackAr(1);
        stackAr50.push((java.lang.Object) 'a');
        java.lang.Object obj53 = stackAr50.top();
        stackAr33.push(obj53);
        stackAr33.pop();
        java.lang.Object obj56 = stackAr33.topAndPop();
        stackAr24.push((java.lang.Object) stackAr33);
        java.lang.Object obj58 = stackAr33.top();
        stackAr10.push((java.lang.Object) stackAr33);
        java.lang.Object obj60 = stackAr33.top();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test412");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test413");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test414");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        stackAr1.makeEmpty();
        java.lang.Object obj10 = stackAr1.top();
        stackAr1.makeEmpty();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test415");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.topAndPop();
        stackAr18.push((java.lang.Object) (-8));
        java.lang.Object obj22 = stackAr18.top();
        java.lang.Object obj23 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr25.push((java.lang.Object) stackAr27);
        stackAr18.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(1);
        stackAr33.push((java.lang.Object) 'a');
        java.lang.Object obj36 = stackAr33.top();
        stackAr16.push(obj36);
        stackAr16.pop();
        java.lang.Object obj39 = stackAr16.topAndPop();
        stackAr7.push((java.lang.Object) stackAr16);
        stackAr16.makeEmpty();
        java.lang.Object obj42 = stackAr16.top();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test416");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = new java.lang.Object();
        stackAr8.push(obj9);
        stackAr8.makeEmpty();
        java.lang.Object obj12 = stackAr8.top();
        stackAr1.push(obj12);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test417");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) stackAr3);
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(1);
        stackAr6.push((java.lang.Object) 'a');
        stackAr6.makeEmpty();
        java.lang.Object obj10 = stackAr6.top();
        java.lang.Object obj11 = stackAr6.topAndPop();
        stackAr3.push(obj11);
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr14.makeEmpty();
        java.lang.Object obj16 = stackAr14.top();
        java.lang.Object obj17 = stackAr14.top();
        stackAr14.makeEmpty();
        stackAr14.makeEmpty();
        stackAr14.makeEmpty();
        java.lang.Object obj21 = stackAr14.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.push(obj21);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test418");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj7 = stackAr6.top();
        java.lang.Object obj8 = stackAr6.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj11 = stackAr10.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(1);
        stackAr13.push((java.lang.Object) 'a');
        stackAr13.pop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr18.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr20);
        stackAr10.push((java.lang.Object) stackAr20);
        stackAr6.push((java.lang.Object) stackAr20);
        stackAr1.push((java.lang.Object) stackAr20);
        java.lang.Object obj26 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test419");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr8.makeEmpty();
        java.lang.Object obj10 = stackAr8.top();
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        java.lang.Object obj13 = stackAr8.top();
        stackAr5.push(obj13);
        stackAr1.push(obj13);
        java.lang.Object obj16 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj23 = stackAr22.topAndPop();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr25.makeEmpty();
        java.lang.Object obj27 = stackAr25.top();
        java.lang.Object obj28 = stackAr25.top();
        java.lang.Object obj29 = stackAr25.top();
        java.lang.Object obj30 = stackAr25.top();
        stackAr22.push(obj30);
        stackAr18.push(obj30);
        stackAr1.push(obj30);
        stackAr1.makeEmpty();
        java.lang.Object obj35 = stackAr1.topAndPop();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test420");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj10 = stackAr9.topAndPop();
        java.lang.Object obj11 = stackAr9.topAndPop();
        java.lang.Object obj12 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj17 = stackAr16.topAndPop();
        stackAr16.push((java.lang.Object) (-8));
        java.lang.Object obj20 = stackAr16.top();
        java.lang.Object obj21 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr23.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr14.push((java.lang.Object) stackAr16);
        stackAr9.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr16);
        java.lang.Object obj31 = stackAr16.top();
        stackAr16.pop();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test421");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        java.lang.Object obj25 = stackAr1.topAndPop();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test422");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj19 = stackAr18.topAndPop();
        stackAr18.push((java.lang.Object) (-8));
        java.lang.Object obj22 = stackAr18.top();
        java.lang.Object obj23 = stackAr18.top();
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr25.push((java.lang.Object) stackAr27);
        stackAr18.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(1);
        stackAr33.push((java.lang.Object) 'a');
        java.lang.Object obj36 = stackAr33.top();
        stackAr16.push(obj36);
        stackAr16.pop();
        java.lang.Object obj39 = stackAr16.topAndPop();
        stackAr7.push((java.lang.Object) stackAr16);
        java.lang.Object obj41 = stackAr7.topAndPop();
        java.lang.Object obj42 = stackAr7.top();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test423");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test424");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-4));
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj11 = stackAr10.top();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(1);
        stackAr13.push((java.lang.Object) 'a');
        stackAr13.pop();
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr18.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr20);
        stackAr10.push((java.lang.Object) stackAr20);
        java.lang.Object obj24 = stackAr20.topAndPop();
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj27 = new java.lang.Object();
        stackAr26.push(obj27);
        stackAr26.pop();
        java.lang.Object obj30 = stackAr26.top();
        java.lang.Object obj31 = stackAr26.top();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj34 = stackAr33.top();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(1);
        stackAr36.push((java.lang.Object) 'a');
        java.lang.Object obj39 = stackAr36.top();
        stackAr33.push(obj39);
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr((int) '#');
        stackAr42.makeEmpty();
        stackAr33.push((java.lang.Object) stackAr42);
        java.lang.Object obj45 = stackAr42.top();
        java.lang.Object obj46 = stackAr42.top();
        stackAr26.push(obj46);
        stackAr20.push(obj46);
        stackAr1.push(obj46);
        java.lang.Object obj50 = stackAr1.topAndPop();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test425");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr5.push((java.lang.Object) (-8));
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.topAndPop();
        stackAr1.push(obj10);
        java.lang.Object obj12 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr(6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr14);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test426");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        java.lang.Object obj9 = stackAr1.top();
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
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test427");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj11 = stackAr10.topAndPop();
        java.lang.Object obj12 = stackAr10.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj15 = stackAr14.topAndPop();
        stackAr14.push((java.lang.Object) (-8));
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.topAndPop();
        stackAr10.push(obj19);
        java.lang.Object obj21 = stackAr10.top();
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj23 = stackAr10.top();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test428");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        stackAr1.push((java.lang.Object) stackAr9);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj13 = stackAr12.topAndPop();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj20 = stackAr19.top();
        stackAr15.push((java.lang.Object) stackAr19);
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr12.pop();
        stackAr1.push((java.lang.Object) stackAr12);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test429");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.top();
        stackAr1.push(obj8);
        stackAr1.pop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test430");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
        stackAr1.makeEmpty();
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
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test431");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj14 = stackAr1.top();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test432");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.push((java.lang.Object) (-8));
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr12 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr10.push((java.lang.Object) stackAr12);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr3.makeEmpty();
        java.lang.Object obj17 = stackAr3.topAndPop();
        stackAr3.makeEmpty();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test433");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr5.makeEmpty();
        java.lang.Object obj7 = stackAr5.top();
        java.lang.Object obj8 = stackAr5.top();
        java.lang.Object obj9 = stackAr5.top();
        java.lang.Object obj10 = stackAr5.top();
        java.lang.Object obj11 = stackAr5.top();
        java.lang.Object obj12 = stackAr5.topAndPop();
        stackAr1.push(obj12);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test434");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj8 = new java.lang.Object();
        stackAr7.push(obj8);
        stackAr7.pop();
        java.lang.Object obj11 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) 6);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj16 = new java.lang.Object();
        stackAr15.push(obj16);
        java.lang.Object obj18 = stackAr15.topAndPop();
        stackAr7.push((java.lang.Object) stackAr15);
        java.lang.Object obj20 = stackAr7.top();
        stackAr1.push(obj20);
        stackAr1.makeEmpty();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test435");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr27.makeEmpty();
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(1);
        stackAr30.push((java.lang.Object) 'a');
        java.lang.Object obj33 = stackAr30.top();
        stackAr27.push(obj33);
        stackAr1.push(obj33);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test436");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        java.lang.Object obj21 = stackAr18.topAndPop();
        java.lang.Object obj22 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        stackAr24.push((java.lang.Object) (-5));
        stackAr24.makeEmpty();
        stackAr18.push((java.lang.Object) stackAr24);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj36 = stackAr35.topAndPop();
        stackAr35.push((java.lang.Object) (-8));
        java.lang.Object obj39 = stackAr35.top();
        java.lang.Object obj40 = stackAr35.top();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr42.push((java.lang.Object) stackAr44);
        stackAr35.push((java.lang.Object) stackAr42);
        stackAr33.push((java.lang.Object) stackAr35);
        stackAr33.makeEmpty();
        DataStructures.daikon.StackAr stackAr50 = new DataStructures.daikon.StackAr(1);
        stackAr50.push((java.lang.Object) 'a');
        java.lang.Object obj53 = stackAr50.top();
        stackAr33.push(obj53);
        stackAr33.pop();
        java.lang.Object obj56 = stackAr33.topAndPop();
        stackAr24.push((java.lang.Object) stackAr33);
        java.lang.Object obj58 = stackAr33.top();
        stackAr10.push((java.lang.Object) stackAr33);
        java.lang.Object obj60 = stackAr33.topAndPop();
        java.lang.Object obj61 = stackAr33.top();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test437");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(2);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj12 = stackAr1.top();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test438");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj10 = stackAr9.topAndPop();
        java.lang.Object obj11 = stackAr9.topAndPop();
        java.lang.Object obj12 = stackAr9.top();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj17 = stackAr16.topAndPop();
        stackAr16.push((java.lang.Object) (-8));
        java.lang.Object obj20 = stackAr16.top();
        java.lang.Object obj21 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr25 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr23.push((java.lang.Object) stackAr25);
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr14.push((java.lang.Object) stackAr16);
        stackAr9.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr16);
        stackAr1.pop();
        java.lang.Object obj32 = stackAr1.topAndPop();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test439");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj12 = stackAr1.topAndPop();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test440");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj7 = stackAr1.top();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        stackAr10.push((java.lang.Object) (-5));
        stackAr1.push((java.lang.Object) stackAr10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test441");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj10 = new java.lang.Object();
        stackAr9.push(obj10);
        stackAr9.pop();
        java.lang.Object obj13 = stackAr9.topAndPop();
        java.lang.Object obj14 = stackAr9.top();
        stackAr9.push((java.lang.Object) 100);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr(1);
        stackAr18.push((java.lang.Object) 'a');
        stackAr18.pop();
        java.lang.Object obj22 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(1);
        stackAr24.push((java.lang.Object) 'a');
        stackAr24.pop();
        java.lang.Object obj28 = stackAr24.topAndPop();
        java.lang.Object obj29 = stackAr24.top();
        stackAr18.push(obj29);
        java.lang.Object obj31 = stackAr18.topAndPop();
        java.lang.Object obj32 = stackAr18.topAndPop();
        stackAr9.push((java.lang.Object) stackAr18);
        stackAr1.push((java.lang.Object) stackAr9);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test442");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr9.makeEmpty();
        java.lang.Object obj11 = stackAr9.top();
        java.lang.Object obj12 = stackAr9.topAndPop();
        java.lang.Object obj13 = stackAr9.topAndPop();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr15.makeEmpty();
        java.lang.Object obj17 = stackAr15.top();
        java.lang.Object obj18 = stackAr15.topAndPop();
        stackAr15.push((java.lang.Object) (-5));
        stackAr15.makeEmpty();
        stackAr9.push((java.lang.Object) stackAr15);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr26 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj27 = stackAr26.topAndPop();
        stackAr26.push((java.lang.Object) (-8));
        java.lang.Object obj30 = stackAr26.top();
        java.lang.Object obj31 = stackAr26.top();
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr33.push((java.lang.Object) stackAr35);
        stackAr26.push((java.lang.Object) stackAr33);
        stackAr24.push((java.lang.Object) stackAr26);
        stackAr24.makeEmpty();
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr(1);
        stackAr41.push((java.lang.Object) 'a');
        java.lang.Object obj44 = stackAr41.top();
        stackAr24.push(obj44);
        stackAr24.pop();
        java.lang.Object obj47 = stackAr24.topAndPop();
        stackAr15.push((java.lang.Object) stackAr24);
        stackAr1.push((java.lang.Object) stackAr24);
        DataStructures.daikon.StackAr stackAr51 = new DataStructures.daikon.StackAr(1);
        stackAr51.push((java.lang.Object) 'a');
        stackAr51.pop();
        java.lang.Object obj55 = stackAr51.topAndPop();
        java.lang.Object obj56 = stackAr51.top();
        DataStructures.daikon.StackAr stackAr58 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr60 = new DataStructures.daikon.StackAr(1);
        stackAr60.push((java.lang.Object) 'a');
        stackAr60.pop();
        DataStructures.daikon.StackAr stackAr65 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr67 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr65.push((java.lang.Object) stackAr67);
        stackAr60.push((java.lang.Object) stackAr67);
        stackAr58.push((java.lang.Object) stackAr67);
        DataStructures.daikon.StackAr stackAr72 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr72.makeEmpty();
        java.lang.Object obj74 = stackAr72.top();
        java.lang.Object obj75 = stackAr72.top();
        stackAr72.push((java.lang.Object) false);
        stackAr58.push((java.lang.Object) stackAr72);
        java.lang.Object obj79 = stackAr58.top();
        stackAr51.push((java.lang.Object) stackAr58);
        stackAr24.push((java.lang.Object) stackAr58);
        java.lang.Object obj82 = stackAr24.top();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test443");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (short) 100);
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr11.makeEmpty();
        stackAr11.push((java.lang.Object) 3);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        stackAr16.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr16);
        java.lang.Object obj19 = stackAr11.top();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr21.makeEmpty();
        java.lang.Object obj23 = stackAr21.topAndPop();
        java.lang.Object obj24 = stackAr21.topAndPop();
        stackAr21.makeEmpty();
        stackAr11.push((java.lang.Object) stackAr21);
        stackAr11.pop();
        stackAr1.push((java.lang.Object) stackAr11);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test444");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.topAndPop();
        java.lang.Object obj11 = stackAr1.topAndPop();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test445");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        java.lang.Object obj9 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test446");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        stackAr5.pop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(1);
        stackAr24.push((java.lang.Object) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj28 = stackAr24.top();
        java.lang.Object obj29 = stackAr24.topAndPop();
        stackAr24.makeEmpty();
        stackAr24.push((java.lang.Object) 0.0d);
        stackAr5.push((java.lang.Object) 0.0d);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test447");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj12 = stackAr11.top();
        stackAr7.push((java.lang.Object) stackAr11);
        stackAr4.push((java.lang.Object) stackAr7);
        stackAr1.push((java.lang.Object) stackAr4);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test448");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
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
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test449");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj6 = stackAr5.top();
        stackAr1.push((java.lang.Object) stackAr5);
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
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test450");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) (short) 100);
        stackAr1.push((java.lang.Object) (short) 100);
        java.lang.Object obj17 = stackAr1.topAndPop();
        java.lang.Object obj18 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test451");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        java.lang.Object obj7 = stackAr1.topAndPop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj11 = stackAr10.topAndPop();
        java.lang.Object obj12 = stackAr10.topAndPop();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj15 = stackAr14.topAndPop();
        stackAr14.push((java.lang.Object) (-8));
        java.lang.Object obj18 = stackAr14.top();
        java.lang.Object obj19 = stackAr14.topAndPop();
        stackAr10.push(obj19);
        java.lang.Object obj21 = stackAr10.top();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr10.makeEmpty();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test452");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) (short) 100);
        stackAr1.push((java.lang.Object) (short) 100);
        java.lang.Object obj17 = stackAr1.topAndPop();
        java.lang.Object obj18 = stackAr1.topAndPop();
        java.lang.Object obj19 = stackAr1.topAndPop();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test453");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        stackAr1.push(obj7);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) '#');
        stackAr10.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) (short) 100);
        stackAr1.push((java.lang.Object) (short) 100);
        java.lang.Object obj17 = stackAr1.topAndPop();
        java.lang.Object obj18 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr20.makeEmpty();
        java.lang.Object obj22 = stackAr20.top();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj25 = stackAr24.topAndPop();
        DataStructures.daikon.StackAr stackAr27 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr27.makeEmpty();
        java.lang.Object obj29 = stackAr27.top();
        java.lang.Object obj30 = stackAr27.top();
        java.lang.Object obj31 = stackAr27.top();
        java.lang.Object obj32 = stackAr27.top();
        stackAr24.push(obj32);
        stackAr20.push(obj32);
        java.lang.Object obj35 = stackAr20.topAndPop();
        DataStructures.daikon.StackAr stackAr37 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr37.makeEmpty();
        java.lang.Object obj39 = stackAr37.top();
        DataStructures.daikon.StackAr stackAr41 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj42 = stackAr41.topAndPop();
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr44.makeEmpty();
        java.lang.Object obj46 = stackAr44.top();
        java.lang.Object obj47 = stackAr44.top();
        java.lang.Object obj48 = stackAr44.top();
        java.lang.Object obj49 = stackAr44.top();
        stackAr41.push(obj49);
        stackAr37.push(obj49);
        stackAr20.push(obj49);
        stackAr1.push((java.lang.Object) stackAr20);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test454");
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test455");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        java.lang.Object obj22 = stackAr5.topAndPop();
        java.lang.Object obj23 = stackAr5.topAndPop();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test456");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr7.makeEmpty();
        java.lang.Object obj9 = stackAr7.top();
        java.lang.Object obj10 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-5));
        stackAr7.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr7);
        stackAr1.pop();
        java.lang.Object obj16 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test457");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj6 = stackAr5.topAndPop();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj8 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr10.makeEmpty();
        java.lang.Object obj12 = stackAr10.top();
        java.lang.Object obj13 = stackAr10.topAndPop();
        java.lang.Object obj14 = stackAr10.topAndPop();
        stackAr10.makeEmpty();
        stackAr5.push((java.lang.Object) stackAr10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr18.makeEmpty();
        java.lang.Object obj20 = stackAr18.top();
        java.lang.Object obj21 = stackAr18.topAndPop();
        java.lang.Object obj22 = stackAr18.topAndPop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr24.makeEmpty();
        java.lang.Object obj26 = stackAr24.top();
        java.lang.Object obj27 = stackAr24.topAndPop();
        stackAr24.push((java.lang.Object) (-5));
        stackAr24.makeEmpty();
        stackAr18.push((java.lang.Object) stackAr24);
        DataStructures.daikon.StackAr stackAr33 = new DataStructures.daikon.StackAr((int) ' ');
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj36 = stackAr35.topAndPop();
        stackAr35.push((java.lang.Object) (-8));
        java.lang.Object obj39 = stackAr35.top();
        java.lang.Object obj40 = stackAr35.top();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr42.push((java.lang.Object) stackAr44);
        stackAr35.push((java.lang.Object) stackAr42);
        stackAr33.push((java.lang.Object) stackAr35);
        stackAr33.makeEmpty();
        DataStructures.daikon.StackAr stackAr50 = new DataStructures.daikon.StackAr(1);
        stackAr50.push((java.lang.Object) 'a');
        java.lang.Object obj53 = stackAr50.top();
        stackAr33.push(obj53);
        stackAr33.pop();
        java.lang.Object obj56 = stackAr33.topAndPop();
        stackAr24.push((java.lang.Object) stackAr33);
        java.lang.Object obj58 = stackAr33.top();
        stackAr10.push((java.lang.Object) stackAr33);
        stackAr33.makeEmpty();
        stackAr33.makeEmpty();
        java.lang.Object obj62 = stackAr33.top();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test458");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj8 = stackAr7.topAndPop();
        stackAr3.push((java.lang.Object) stackAr7);
        stackAr1.push((java.lang.Object) stackAr3);
        java.lang.Object obj11 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test459");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test460");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr(1);
        stackAr4.push((java.lang.Object) 'a');
        stackAr4.pop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr9.push((java.lang.Object) stackAr11);
        stackAr4.push((java.lang.Object) stackAr11);
        stackAr1.push((java.lang.Object) stackAr11);
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj17 = stackAr16.top();
        java.lang.Object obj18 = stackAr16.topAndPop();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj21 = stackAr20.top();
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr(1);
        stackAr23.push((java.lang.Object) 'a');
        stackAr23.pop();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr28.push((java.lang.Object) stackAr30);
        stackAr23.push((java.lang.Object) stackAr30);
        stackAr20.push((java.lang.Object) stackAr30);
        stackAr16.push((java.lang.Object) stackAr30);
        stackAr11.push((java.lang.Object) stackAr30);
        java.lang.Object obj36 = stackAr11.top();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test461");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        stackAr1.push((java.lang.Object) (-7));
        stackAr1.pop();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test462");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
        java.lang.Object obj8 = stackAr1.topAndPop();
        java.lang.Object obj9 = stackAr1.top();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test463");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 4);
        DataStructures.daikon.StackAr stackAr30 = new DataStructures.daikon.StackAr(1);
        stackAr30.push((java.lang.Object) 'a');
        stackAr30.pop();
        java.lang.Object obj34 = stackAr30.topAndPop();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(1);
        stackAr36.push((java.lang.Object) 'a');
        stackAr36.pop();
        java.lang.Object obj40 = stackAr36.topAndPop();
        java.lang.Object obj41 = stackAr36.top();
        stackAr30.push(obj41);
        java.lang.Object obj43 = stackAr30.topAndPop();
        java.lang.Object obj44 = stackAr30.topAndPop();
        java.lang.Object obj45 = stackAr30.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj45);
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Overflow; message: null");
        } catch (DataStructures.daikon.StackAr.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test464");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(7);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test465");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (byte) 10);
        java.lang.Object obj2 = stackAr1.top();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test466");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Object obj6 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj8 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test467");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj8 = stackAr7.topAndPop();
        stackAr7.push((java.lang.Object) (-1.0d));
        stackAr7.push((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = stackAr7.top();
        stackAr7.makeEmpty();
        java.lang.Object obj15 = stackAr7.topAndPop();
        stackAr1.push((java.lang.Object) stackAr7);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test468");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj10 = stackAr1.topAndPop();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test469");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(2);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        stackAr3.push((java.lang.Object) 'a');
        stackAr3.pop();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr8.push((java.lang.Object) stackAr10);
        stackAr3.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
        java.lang.Object obj14 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(1);
        stackAr16.push((java.lang.Object) 'a');
        stackAr16.pop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr21.push((java.lang.Object) stackAr23);
        stackAr16.push((java.lang.Object) stackAr23);
        stackAr16.makeEmpty();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj29 = stackAr28.topAndPop();
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr31.makeEmpty();
        java.lang.Object obj33 = stackAr31.top();
        DataStructures.daikon.StackAr stackAr35 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj36 = stackAr35.top();
        stackAr31.push((java.lang.Object) stackAr35);
        stackAr28.push((java.lang.Object) stackAr31);
        stackAr16.push((java.lang.Object) stackAr28);
        stackAr28.makeEmpty();
        DataStructures.daikon.StackAr stackAr42 = new DataStructures.daikon.StackAr((int) (short) 10);
        DataStructures.daikon.StackAr stackAr44 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj45 = stackAr44.topAndPop();
        java.lang.Object obj46 = stackAr44.topAndPop();
        DataStructures.daikon.StackAr stackAr48 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj49 = stackAr48.topAndPop();
        stackAr44.push((java.lang.Object) stackAr48);
        stackAr42.push((java.lang.Object) stackAr44);
        stackAr44.pop();
        stackAr28.push((java.lang.Object) stackAr44);
        stackAr1.push((java.lang.Object) stackAr44);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test470");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.top();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test471");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        java.lang.Object obj4 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.makeEmpty();
        java.lang.Object obj15 = stackAr11.top();
        java.lang.Object obj16 = stackAr11.topAndPop();
        stackAr8.push(obj16);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj19 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr23 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr21.push((java.lang.Object) stackAr23);
        java.lang.Object obj25 = stackAr23.top();
        java.lang.Object obj26 = stackAr23.top();
        java.lang.Object obj27 = stackAr23.topAndPop();
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(1);
        stackAr29.push((java.lang.Object) 'a');
        stackAr29.makeEmpty();
        java.lang.Object obj33 = stackAr29.top();
        stackAr29.makeEmpty();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj37 = stackAr36.topAndPop();
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr39.makeEmpty();
        java.lang.Object obj41 = stackAr39.top();
        java.lang.Object obj42 = stackAr39.topAndPop();
        stackAr39.push((java.lang.Object) (-5));
        stackAr39.pop();
        stackAr36.push((java.lang.Object) stackAr39);
        stackAr29.push((java.lang.Object) stackAr39);
        stackAr29.makeEmpty();
        stackAr23.push((java.lang.Object) stackAr29);
        stackAr1.push((java.lang.Object) stackAr23);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test472");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr4.makeEmpty();
        java.lang.Object obj6 = stackAr4.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj9 = stackAr8.top();
        stackAr4.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr4);
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr13.makeEmpty();
        java.lang.Object obj15 = stackAr13.top();
        java.lang.Object obj16 = stackAr13.top();
        stackAr13.makeEmpty();
        java.lang.Object obj18 = stackAr13.top();
        stackAr13.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr13);
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr22.makeEmpty();
        java.lang.Object obj24 = stackAr22.top();
        java.lang.Object obj25 = stackAr22.topAndPop();
        stackAr22.push((java.lang.Object) (-5));
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj30 = new java.lang.Object();
        stackAr29.push(obj30);
        stackAr29.pop();
        java.lang.Object obj33 = stackAr29.topAndPop();
        stackAr29.push((java.lang.Object) (-4));
        stackAr22.push((java.lang.Object) (-4));
        DataStructures.daikon.StackAr stackAr38 = new DataStructures.daikon.StackAr(1);
        stackAr38.push((java.lang.Object) 'a');
        stackAr38.makeEmpty();
        java.lang.Object obj42 = stackAr38.top();
        stackAr38.makeEmpty();
        DataStructures.daikon.StackAr stackAr45 = new DataStructures.daikon.StackAr(7);
        java.lang.Object obj46 = stackAr45.topAndPop();
        DataStructures.daikon.StackAr stackAr48 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr48.makeEmpty();
        java.lang.Object obj50 = stackAr48.top();
        java.lang.Object obj51 = stackAr48.topAndPop();
        stackAr48.push((java.lang.Object) (-5));
        stackAr48.pop();
        stackAr45.push((java.lang.Object) stackAr48);
        stackAr38.push((java.lang.Object) stackAr48);
        stackAr38.makeEmpty();
        stackAr22.push((java.lang.Object) stackAr38);
        stackAr1.push((java.lang.Object) stackAr38);
        java.lang.Object obj60 = stackAr1.topAndPop();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test473");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.pop();
        stackAr1.makeEmpty();
        java.lang.Object obj9 = stackAr1.top();
        stackAr1.makeEmpty();
        java.lang.Object obj11 = stackAr1.topAndPop();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test474");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-8));
        stackAr1.pop();
        java.lang.Object obj6 = stackAr1.top();
        java.lang.Object obj7 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj10 = new java.lang.Object();
        stackAr9.push(obj10);
        stackAr9.pop();
        java.lang.Object obj13 = stackAr9.topAndPop();
        java.lang.Object obj14 = stackAr9.topAndPop();
        stackAr9.makeEmpty();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(1);
        stackAr17.push((java.lang.Object) 'a');
        stackAr17.pop();
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr22.push((java.lang.Object) stackAr24);
        stackAr17.push((java.lang.Object) stackAr24);
        stackAr17.makeEmpty();
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj30 = stackAr29.topAndPop();
        DataStructures.daikon.StackAr stackAr32 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr32.makeEmpty();
        java.lang.Object obj34 = stackAr32.top();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj37 = stackAr36.top();
        stackAr32.push((java.lang.Object) stackAr36);
        stackAr29.push((java.lang.Object) stackAr32);
        stackAr17.push((java.lang.Object) stackAr29);
        stackAr29.makeEmpty();
        stackAr29.makeEmpty();
        stackAr9.push((java.lang.Object) stackAr29);
        java.lang.Object obj44 = stackAr9.topAndPop();
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.Object obj46 = stackAr1.topAndPop();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test475");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.push((java.lang.Object) (-5));
        stackAr1.pop();
        java.lang.Object obj8 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr10 = new DataStructures.daikon.StackAr(1);
        stackAr10.push((java.lang.Object) 'a');
        stackAr10.pop();
        stackAr1.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) (short) 1);
        java.lang.Object obj17 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test476");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(10);
        java.lang.Object obj6 = stackAr5.top();
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr(1);
        stackAr8.push((java.lang.Object) 'a');
        stackAr8.pop();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr15 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr13.push((java.lang.Object) stackAr15);
        stackAr8.push((java.lang.Object) stackAr15);
        stackAr5.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        DataStructures.daikon.StackAr stackAr21 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj22 = stackAr21.top();
        stackAr1.push((java.lang.Object) stackAr21);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test477");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj2 = new java.lang.Object();
        stackAr1.push(obj2);
        stackAr1.makeEmpty();
        java.lang.Object obj5 = stackAr1.top();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr9 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj10 = stackAr9.topAndPop();
        stackAr9.push((java.lang.Object) (-1.0d));
        stackAr9.push((java.lang.Object) (-1.0d));
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(2);
        stackAr9.push((java.lang.Object) stackAr16);
        stackAr9.pop();
        stackAr9.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr9);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test478");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.daikon.StackAr stackAr4 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj5 = stackAr4.top();
        stackAr4.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr4);
        stackAr1.pop();
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr((int) (short) 100);
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj14 = new java.lang.Object();
        stackAr13.push(obj14);
        stackAr13.pop();
        java.lang.Object obj17 = stackAr13.topAndPop();
        java.lang.Object obj18 = stackAr13.top();
        stackAr13.push((java.lang.Object) 100);
        DataStructures.daikon.StackAr stackAr22 = new DataStructures.daikon.StackAr(1);
        stackAr22.push((java.lang.Object) 'a');
        stackAr22.pop();
        java.lang.Object obj26 = stackAr22.topAndPop();
        DataStructures.daikon.StackAr stackAr28 = new DataStructures.daikon.StackAr(1);
        stackAr28.push((java.lang.Object) 'a');
        stackAr28.pop();
        java.lang.Object obj32 = stackAr28.topAndPop();
        java.lang.Object obj33 = stackAr28.top();
        stackAr22.push(obj33);
        java.lang.Object obj35 = stackAr22.topAndPop();
        java.lang.Object obj36 = stackAr22.topAndPop();
        stackAr13.push((java.lang.Object) stackAr22);
        java.lang.Object obj38 = stackAr22.top();
        stackAr11.push((java.lang.Object) stackAr22);
        stackAr1.push((java.lang.Object) stackAr11);
        stackAr11.makeEmpty();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test479");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        java.lang.Object obj11 = stackAr8.topAndPop();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        java.lang.Object obj24 = stackAr13.top();
        java.lang.Object obj25 = stackAr13.topAndPop();
        stackAr8.push(obj25);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test480");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        java.lang.Object obj4 = stackAr1.top();
        stackAr1.pop();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test481");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr((int) (short) 10);
        DataStructures.daikon.StackAr stackAr3 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj4 = stackAr3.topAndPop();
        java.lang.Object obj5 = stackAr3.topAndPop();
        DataStructures.daikon.StackAr stackAr7 = new DataStructures.daikon.StackAr((int) ' ');
        java.lang.Object obj8 = stackAr7.topAndPop();
        stackAr3.push((java.lang.Object) stackAr7);
        stackAr1.push((java.lang.Object) stackAr3);
        stackAr3.pop();
        java.lang.Object obj12 = stackAr3.top();
        DataStructures.daikon.StackAr stackAr14 = new DataStructures.daikon.StackAr((int) ' ');
        stackAr14.makeEmpty();
        DataStructures.daikon.StackAr stackAr17 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr19 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr17.push((java.lang.Object) stackAr19);
        java.lang.Object obj21 = stackAr17.top();
        java.lang.Object obj22 = stackAr17.topAndPop();
        stackAr14.push((java.lang.Object) stackAr17);
        java.lang.Object obj24 = stackAr14.top();
        stackAr3.push(obj24);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test482");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        java.lang.Object obj2 = stackAr1.topAndPop();
        java.lang.Object obj3 = stackAr1.topAndPop();
        DataStructures.daikon.StackAr stackAr5 = new DataStructures.daikon.StackAr(1);
        stackAr5.push((java.lang.Object) 'a');
        stackAr5.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.daikon.StackAr stackAr11 = new DataStructures.daikon.StackAr(1);
        stackAr11.push((java.lang.Object) 'a');
        stackAr11.pop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr18 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr16.push((java.lang.Object) stackAr18);
        stackAr11.push((java.lang.Object) stackAr18);
        stackAr5.push((java.lang.Object) stackAr18);
        stackAr5.pop();
        DataStructures.daikon.StackAr stackAr24 = new DataStructures.daikon.StackAr(1);
        stackAr24.push((java.lang.Object) 'a');
        stackAr24.pop();
        DataStructures.daikon.StackAr stackAr29 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr31 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr29.push((java.lang.Object) stackAr31);
        stackAr24.push((java.lang.Object) stackAr31);
        stackAr24.makeEmpty();
        DataStructures.daikon.StackAr stackAr36 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj37 = stackAr36.topAndPop();
        DataStructures.daikon.StackAr stackAr39 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr39.makeEmpty();
        java.lang.Object obj41 = stackAr39.top();
        DataStructures.daikon.StackAr stackAr43 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj44 = stackAr43.top();
        stackAr39.push((java.lang.Object) stackAr43);
        stackAr36.push((java.lang.Object) stackAr39);
        stackAr24.push((java.lang.Object) stackAr36);
        stackAr36.pop();
        stackAr5.push((java.lang.Object) stackAr36);
        java.lang.Object obj50 = stackAr36.top();
        stackAr36.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr36.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.daikon.StackAr.Underflow; message: null");
        } catch (DataStructures.daikon.StackAr.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test483");
        DataStructures.daikon.StackAr stackAr1 = new DataStructures.daikon.StackAr(1);
        stackAr1.push((java.lang.Object) 'a');
        stackAr1.pop();
        DataStructures.daikon.StackAr stackAr6 = new DataStructures.daikon.StackAr(10);
        DataStructures.daikon.StackAr stackAr8 = new DataStructures.daikon.StackAr((int) (short) 1);
        stackAr6.push((java.lang.Object) stackAr8);
        stackAr1.push((java.lang.Object) stackAr8);
        stackAr1.makeEmpty();
        DataStructures.daikon.StackAr stackAr13 = new DataStructures.daikon.StackAr((int) '#');
        java.lang.Object obj14 = stackAr13.topAndPop();
        DataStructures.daikon.StackAr stackAr16 = new DataStructures.daikon.StackAr((int) 'a');
        stackAr16.makeEmpty();
        java.lang.Object obj18 = stackAr16.top();
        DataStructures.daikon.StackAr stackAr20 = new DataStructures.daikon.StackAr((int) 'a');
        java.lang.Object obj21 = stackAr20.top();
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr13.push((java.lang.Object) stackAr16);
        stackAr1.push((java.lang.Object) stackAr13);
        java.lang.Object obj25 = stackAr1.top();
        java.lang.Object obj26 = stackAr1.topAndPop();
    }
}

