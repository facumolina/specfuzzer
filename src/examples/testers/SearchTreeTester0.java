package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SearchTreeTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test001");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) -1);
        searchTree0.insert((int) (byte) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test002");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert(8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test003");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) ' ');
        searchTree0.insert((-1));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test004");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(0);
        searchTree0.insert((-9));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test005");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((int) ' ');
        searchTree0.insert(100);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test006");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-1));
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test007");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((-3));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test008");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test009");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert(0);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test010");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert(7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test011");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test012");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert((-2));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test013");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert(6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test014");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(0);
        searchTree0.insert(8);
        searchTree0.insert((-100));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test015");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) ' ');
        searchTree0.insert((-5));
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test016");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) 'a');
        searchTree0.insert(10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test017");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test018");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-6));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test019");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test020");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test021");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(4);
        searchTree0.insert((-10));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test022");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) '#');
        searchTree0.insert(0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test023");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) '#');
        searchTree0.insert((int) '4');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test024");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-4));
        searchTree0.insert((-10));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test025");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(6);
        searchTree0.insert(2);
        searchTree0.insert((-9));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test026");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test027");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test028");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) ' ');
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test029");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-100));
        searchTree0.insert(100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test030");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((-8));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test031");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert((-1));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test032");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(6);
        searchTree0.insert(8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test033");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert(9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test034");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-3));
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test035");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(8);
        searchTree0.insert(0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test036");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test037");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert(3);
        searchTree0.insert(100);
        searchTree0.insert((-3));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test038");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(7);
        searchTree0.insert(100);
        searchTree0.insert((-8));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test039");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert(8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test040");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-100));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test041");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test042");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-4));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test043");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((-8));
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test044");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test045");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert((-2));
        searchTree0.insert(2);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test046");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(4);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test047");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(0);
        searchTree0.insert((-10));
        searchTree0.insert(0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test048");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test049");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(0);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test050");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(100);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test051");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((int) ' ');
        searchTree0.insert(2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test052");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert(100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test053");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert((-8));
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test054");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(7);
        searchTree0.insert(7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test055");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert(3);
        searchTree0.insert(1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test056");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((-4));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test057");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert((-1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test058");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test059");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(0);
        searchTree0.insert((int) '4');
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test060");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test061");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test062");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((-2));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test063");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((-10));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test064");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test065");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((int) 'a');
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert(2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test066");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert((-9));
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test067");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test068");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert((-5));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test069");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test070");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert(9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test071");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((-6));
        searchTree0.insert((-3));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test072");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert(1);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test073");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(1);
        searchTree0.insert(100);
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test074");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test075");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert((-9));
        searchTree0.insert((-7));
        searchTree0.insert((-8));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test076");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert(3);
        searchTree0.insert((-6));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test077");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((-1));
        searchTree0.insert((int) '4');
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test078");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert((-9));
        searchTree0.insert((int) 'a');
        searchTree0.insert((-3));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test079");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(8);
        searchTree0.insert(100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test080");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test081");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test082");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-9));
        searchTree0.insert(100);
        searchTree0.insert(1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test083");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) -1);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test084");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test085");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test086");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test087");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test088");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(8);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test089");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert((-2));
        searchTree0.insert(2);
        searchTree0.insert((-7));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test090");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test091");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test092");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test093");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test094");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(3);
        searchTree0.insert(100);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test095");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-6));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test096");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test097");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((-4));
        searchTree0.insert(2);
        searchTree0.insert(6);
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test098");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(10);
        searchTree0.insert((int) '#');
        searchTree0.insert((-8));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test099");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (byte) 10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test100");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test101");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(6);
        searchTree0.insert(0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test102");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test103");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(4);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test104");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test105");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((-4));
        searchTree0.insert(1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test106");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test107");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(6);
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test108");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-7));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test109");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test110");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-8));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test111");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert((-100));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test112");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-10));
        searchTree0.insert((-9));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test113");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert((-100));
        searchTree0.insert((int) '4');
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test114");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(2);
        searchTree0.insert((-7));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test115");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert((int) ' ');
        searchTree0.insert((-10));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test116");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert(1);
        searchTree0.insert(1);
        searchTree0.insert(5);
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test117");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert(0);
        searchTree0.insert((-2));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test118");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(100);
        searchTree0.insert((-10));
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test119");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-1));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test120");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert(0);
        searchTree0.insert((-3));
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test121");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-1));
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) (byte) 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test122");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert((-10));
        searchTree0.insert((-4));
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test123");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(100);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test124");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert(1);
        searchTree0.insert(1);
        searchTree0.insert(5);
        searchTree0.insert((-2));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test125");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(10);
        searchTree0.insert((int) '4');
        searchTree0.insert((-100));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test126");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((-6));
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test127");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(10);
        searchTree0.insert(10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test128");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((-4));
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((-1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test129");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(8);
        searchTree0.insert(10);
        searchTree0.insert((-100));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test130");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert((-8));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test131");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(8);
        searchTree0.insert(9);
        searchTree0.insert((-8));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test132");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test133");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert((int) '#');
        searchTree0.insert(10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test134");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test135");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(0);
        searchTree0.insert(1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test136");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(0);
        searchTree0.insert(0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test137");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) ' ');
        searchTree0.insert((-3));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test138");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(7);
        searchTree0.insert(100);
        searchTree0.insert((-7));
        searchTree0.insert(2);
        searchTree0.insert((int) ' ');
        searchTree0.insert(7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test139");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert(0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test140");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 100);
        searchTree0.insert(0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test141");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test142");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(100);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test143");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((-4));
        searchTree0.insert(3);
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test144");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert((-2));
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test145");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert(0);
        searchTree0.insert(100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test146");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test147");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert((-9));
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-9));
        searchTree0.insert(1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test148");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(3);
        searchTree0.insert(4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test149");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(100);
        searchTree0.insert((int) ' ');
        searchTree0.insert(5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test150");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((-3));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test151");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-1));
        searchTree0.insert((-4));
        searchTree0.insert((-1));
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test152");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((-1));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test153");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test154");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((int) ' ');
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert(2);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test155");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(7);
        searchTree0.insert((-5));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((-7));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test156");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(1);
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test157");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((-6));
        searchTree0.insert(0);
        searchTree0.insert(100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test158");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert(2);
        searchTree0.insert(4);
        searchTree0.insert(1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test159");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test160");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(100);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert((-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test161");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) ' ');
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test162");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert(0);
        searchTree0.insert((-4));
        searchTree0.insert((int) '4');
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test163");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert((-8));
        searchTree0.insert(0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test164");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-8));
        searchTree0.insert((-7));
        searchTree0.insert(1);
        searchTree0.insert(4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test165");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert(7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test166");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-3));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test167");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert((int) '#');
        searchTree0.insert(7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test168");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((-5));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test169");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-1));
        searchTree0.insert((-4));
        searchTree0.insert(8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test170");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert(0);
        searchTree0.insert(5);
        searchTree0.insert(10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test171");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(10);
        searchTree0.insert(4);
        searchTree0.insert(6);
        searchTree0.insert((-1));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test172");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-7));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test173");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test174");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert((-8));
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test175");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(10);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(9);
        searchTree0.insert(2);
        searchTree0.insert(3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test176");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test177");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((int) '#');
        searchTree0.insert(100);
        searchTree0.insert(9);
        searchTree0.insert(2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test178");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert((-1));
        searchTree0.insert((-10));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test179");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test180");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert(7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test181");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(8);
        searchTree0.insert(10);
        searchTree0.insert((-10));
        searchTree0.insert((-9));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test182");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(7);
        searchTree0.insert(100);
        searchTree0.insert((-7));
        searchTree0.insert(0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test183");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert(0);
        searchTree0.insert((-100));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test184");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(10);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-5));
        searchTree0.insert((-10));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test185");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert(8);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert((-4));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test186");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert(1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test187");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((-8));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test188");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-7));
        searchTree0.insert((-9));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test189");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(4);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test190");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert((-5));
        searchTree0.insert(100);
        searchTree0.insert(100);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test191");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-7));
        searchTree0.insert(6);
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test192");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(100);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test193");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(6);
        searchTree0.insert((-2));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test194");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) 'a');
        searchTree0.insert(6);
        searchTree0.insert((-2));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test195");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(7);
        searchTree0.insert((-7));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test196");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-3));
        searchTree0.insert((int) '4');
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test197");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(7);
        searchTree0.insert((-5));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test198");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert((-9));
        searchTree0.insert((int) '#');
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test199");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) ' ');
        searchTree0.insert(100);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test200");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((-4));
        searchTree0.insert(10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test201");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(5);
        searchTree0.insert((int) '4');
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test202");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test203");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert(8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test204");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test205");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(4);
        searchTree0.insert(6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test206");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test207");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test208");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) '4');
        searchTree0.insert(1);
        searchTree0.insert((-1));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test209");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) '4');
        searchTree0.insert((-10));
        searchTree0.insert((int) '#');
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test210");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((-100));
        searchTree0.insert(1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test211");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(10);
        searchTree0.insert((-7));
        searchTree0.insert(1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test212");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-2));
        searchTree0.insert(10);
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test213");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(5);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test214");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) '4');
        searchTree0.insert((-10));
        searchTree0.insert(0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test215");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-100));
        searchTree0.insert((-10));
        searchTree0.insert((-3));
        searchTree0.insert(2);
        searchTree0.insert((-7));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test216");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-1));
        searchTree0.insert(0);
        searchTree0.insert(9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test217");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test218");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) '#');
        searchTree0.insert((-7));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test219");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-6));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test220");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-8));
        searchTree0.insert(3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test221");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-1));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test222");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(6);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test223");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert(0);
        searchTree0.insert((-3));
        searchTree0.insert((-9));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test224");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert(2);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test225");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert((-9));
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-9));
        searchTree0.insert(0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test226");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-8));
        searchTree0.insert(1);
        searchTree0.insert(9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test227");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test228");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((-1));
        searchTree0.insert(7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test229");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(0);
        searchTree0.insert(1);
        searchTree0.insert(100);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test230");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert(0);
        searchTree0.insert(6);
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-10));
        searchTree0.insert((-8));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test231");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test232");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(100);
        searchTree0.insert((-10));
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test233");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert(10);
        searchTree0.insert(10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test234");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test235");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test236");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert(8);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test237");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert((-5));
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test238");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((-1));
        searchTree0.insert(4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test239");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(0);
        searchTree0.insert(0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test240");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test241");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test242");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((-4));
        searchTree0.insert((-2));
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test243");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test244");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(100);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(8);
        searchTree0.insert((-2));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test245");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(100);
        searchTree0.insert(0);
        searchTree0.insert(3);
        searchTree0.insert(10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test246");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test247");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test248");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test249");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) ' ');
        searchTree0.insert((-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test250");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(10);
        searchTree0.insert((int) '4');
        searchTree0.insert((-8));
        searchTree0.insert(10);
        searchTree0.insert(100);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test251");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test252");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(2);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test253");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(0);
        searchTree0.insert(3);
        searchTree0.insert(9);
        searchTree0.insert((-5));
        searchTree0.insert((-10));
        searchTree0.insert((-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test254");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(100);
        searchTree0.insert(1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test255");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(6);
        searchTree0.insert((-4));
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test256");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test257");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((int) '#');
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test258");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(9);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(5);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test259");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test260");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert((-3));
        searchTree0.insert(9);
        searchTree0.insert(7);
        searchTree0.insert((-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test261");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((-10));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test262");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert(8);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(10);
        searchTree0.insert((-8));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test263");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(10);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-5));
        searchTree0.insert((-4));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test264");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert(1);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test265");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((-2));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test266");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert((-1));
        searchTree0.insert(1);
        searchTree0.insert((-100));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test267");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-8));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test268");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert(4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test269");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((-4));
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test270");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(7);
        searchTree0.insert(5);
        searchTree0.insert((int) '4');
        searchTree0.insert((-1));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test271");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(100);
        searchTree0.insert(0);
        searchTree0.insert((int) '4');
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test272");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(1);
        searchTree0.insert(100);
        searchTree0.insert((-1));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test273");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert((-8));
        searchTree0.insert((-10));
        searchTree0.insert(4);
        searchTree0.insert(9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test274");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert((-5));
        searchTree0.insert(7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test275");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-1));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test276");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert((-2));
        searchTree0.insert(2);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (byte) 10);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test277");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-100));
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((-10));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test278");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test279");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-3));
        searchTree0.insert((int) '4');
        searchTree0.insert((-6));
        searchTree0.insert((-8));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test280");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert((-9));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test281");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) -1);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test282");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-100));
        searchTree0.insert(2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test283");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert((-2));
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test284");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) 'a');
        searchTree0.insert(7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test285");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-8));
        searchTree0.insert(2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test286");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-100));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test287");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert(1);
        searchTree0.insert(1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test288");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert(0);
        searchTree0.insert((int) ' ');
        searchTree0.insert(2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test289");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(0);
        searchTree0.insert((-10));
        searchTree0.insert(1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test290");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-9));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test291");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert(10);
        searchTree0.insert(6);
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test292");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(6);
        searchTree0.insert((-9));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test293");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test294");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert(3);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-100));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test295");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test296");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert((-4));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test297");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(100);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert(10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test298");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert(6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test299");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert((-9));
        searchTree0.insert((-3));
        searchTree0.insert((int) (byte) 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test300");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert(8);
        searchTree0.insert(2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test301");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((-4));
        searchTree0.insert((-1));
        searchTree0.insert(1);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test302");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(10);
        searchTree0.insert(9);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test303");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert(8);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test304");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(7);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert(2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test305");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-100));
        searchTree0.insert((-10));
        searchTree0.insert((-2));
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test306");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert((-2));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test307");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test308");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test309");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert(7);
        searchTree0.insert(8);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test310");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert(5);
        searchTree0.insert((-100));
        searchTree0.insert((-2));
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test311");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) ' ');
        searchTree0.insert(1);
        searchTree0.insert(8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test312");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-1));
        searchTree0.insert((-6));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test313");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(7);
        searchTree0.insert(1);
        searchTree0.insert((int) 'a');
        searchTree0.insert(0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test314");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert((-4));
        searchTree0.insert(1);
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test315");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert((-8));
        searchTree0.insert(0);
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test316");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert((int) ' ');
        searchTree0.insert((int) '#');
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test317");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) 10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test318");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert((-8));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test319");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(100);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert(5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test320");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert((int) '#');
        searchTree0.insert(2);
        searchTree0.insert(4);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test321");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(100);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(0);
        searchTree0.insert((-10));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test322");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 100);
        searchTree0.insert(0);
        searchTree0.insert((int) '4');
        searchTree0.insert(0);
        searchTree0.insert((-10));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test323");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(100);
        searchTree0.insert(5);
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test324");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test325");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert((-7));
        searchTree0.insert(3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test326");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert(3);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test327");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test328");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(7);
        searchTree0.insert((-6));
        searchTree0.insert(7);
        searchTree0.insert(4);
        searchTree0.insert((-2));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test329");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-6));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test330");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test331");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test332");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(3);
        searchTree0.insert(0);
        searchTree0.insert((-1));
        searchTree0.insert(0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test333");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(100);
        searchTree0.insert((-7));
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test334");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(5);
        searchTree0.insert((int) ' ');
        searchTree0.insert((-1));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test335");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert(8);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test336");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-7));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test337");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(6);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test338");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-4));
        searchTree0.insert((-9));
        searchTree0.insert(8);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test339");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(3);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test340");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(10);
        searchTree0.insert((-7));
        searchTree0.insert((-1));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test341");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) ' ');
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test342");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-8));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(2);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test343");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(8);
        searchTree0.insert(1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test344");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 100);
        searchTree0.insert(100);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test345");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert((int) '#');
        searchTree0.insert(100);
        searchTree0.insert((-4));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test346");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((-6));
        searchTree0.insert(0);
        searchTree0.insert(7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test347");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((int) '4');
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test348");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(0);
        searchTree0.insert(3);
        searchTree0.insert(9);
        searchTree0.insert(7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test349");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert((-9));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test350");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test351");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(0);
        searchTree0.insert(6);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test352");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test353");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(1);
        searchTree0.insert(100);
        searchTree0.insert(7);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test354");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(100);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test355");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert(2);
        searchTree0.insert(1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test356");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test357");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert((-10));
        searchTree0.insert(4);
        searchTree0.insert(7);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test358");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-10));
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert(10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test359");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert(2);
        searchTree0.insert(4);
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test360");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) -1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test361");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert(5);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test362");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-100));
        searchTree0.insert(2);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test363");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-7));
        searchTree0.insert(6);
        searchTree0.insert((-8));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test364");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(10);
        searchTree0.insert((-100));
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((-8));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test365");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) ' ');
        searchTree0.insert((-9));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test366");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(100);
        searchTree0.insert((-10));
        searchTree0.insert((-8));
        searchTree0.insert(9);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test367");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert(10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test368");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-1));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test369");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert(5);
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert(4);
        searchTree0.insert((-3));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test370");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(8);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test371");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test372");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert((-8));
        searchTree0.insert((-10));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test373");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(10);
        searchTree0.insert(3);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test374");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(10);
        searchTree0.insert((int) ' ');
        searchTree0.insert((int) ' ');
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test375");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(0);
        searchTree0.insert(3);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(100);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test376");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(0);
        searchTree0.insert((int) '4');
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test377");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(10);
        searchTree0.insert((-100));
        searchTree0.insert((int) ' ');
        searchTree0.insert((-3));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test378");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-100));
        searchTree0.insert((-10));
        searchTree0.insert((-3));
        searchTree0.insert(2);
        searchTree0.insert(7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test379");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test380");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-8));
        searchTree0.insert(1);
        searchTree0.insert((-3));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test381");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(7);
        searchTree0.insert(4);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test382");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(100);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test383");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(1);
        searchTree0.insert(9);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test384");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((-4));
        searchTree0.insert(0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test385");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(10);
        searchTree0.insert((-10));
        searchTree0.insert(100);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test386");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test387");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert((-8));
        searchTree0.insert((-10));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert(100);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test388");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((-4));
        searchTree0.insert(2);
        searchTree0.insert(0);
        searchTree0.insert(0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test389");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((-3));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert(0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test390");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert(100);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test391");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(10);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test392");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) '4');
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((-3));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test393");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-3));
        searchTree0.insert(0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test394");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(2);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test395");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((-4));
        searchTree0.insert(3);
        searchTree0.insert(5);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test396");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) 'a');
        searchTree0.insert(1);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test397");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test398");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(4);
        searchTree0.insert((-10));
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test399");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-1));
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test400");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(5);
        searchTree0.insert(5);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test401");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert(1);
        searchTree0.insert(4);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test402");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert(2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test403");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(5);
        searchTree0.insert((int) ' ');
        searchTree0.insert((int) '#');
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test404");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert((int) ' ');
        searchTree0.insert(0);
        searchTree0.insert((-1));
        searchTree0.insert(1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test405");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert((-1));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test406");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-5));
        searchTree0.insert(3);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test407");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert((-1));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test408");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(10);
        searchTree0.insert(4);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((-9));
        searchTree0.insert((int) '#');
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test409");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test410");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-3));
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test411");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert(3);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) '4');
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test412");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((-10));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test413");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-4));
        searchTree0.insert((-1));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test414");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(100);
        searchTree0.insert((int) ' ');
        searchTree0.insert((-4));
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test415");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-1));
        searchTree0.insert((-5));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test416");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(10);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-5));
        searchTree0.insert(2);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test417");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(2);
        searchTree0.insert(0);
        searchTree0.insert(7);
        searchTree0.insert(10);
        searchTree0.insert(0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test418");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert(100);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test419");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert((-9));
        searchTree0.insert((-3));
        searchTree0.insert(5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test420");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(0);
        searchTree0.insert((-2));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test421");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((-1));
        searchTree0.insert(10);
        searchTree0.insert((-100));
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((-2));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test422");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(9);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert(5);
        searchTree0.insert(10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test423");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert((-4));
        searchTree0.insert((-7));
        searchTree0.insert((int) ' ');
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test424");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert(8);
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-7));
        searchTree0.insert((-2));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test425");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert(2);
        searchTree0.insert(4);
        searchTree0.insert(6);
        searchTree0.insert(0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test426");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert(0);
        searchTree0.insert((int) ' ');
        searchTree0.insert(4);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test427");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert(1);
        searchTree0.insert(6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test428");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test429");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test430");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(9);
        searchTree0.insert((int) '4');
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test431");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((int) ' ');
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test432");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert((-100));
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test433");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test434");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(5);
        searchTree0.insert(0);
        searchTree0.insert(3);
        searchTree0.insert((-6));
        searchTree0.insert((-1));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test435");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert(0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test436");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) 'a');
        searchTree0.insert(1);
        searchTree0.insert(2);
        searchTree0.insert((-5));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test437");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(4);
        searchTree0.insert(1);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test438");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((int) (short) 100);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test439");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(100);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert(100);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test440");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test441");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(0);
        searchTree0.insert((int) (short) -1);
        searchTree0.insert((int) 'a');
        searchTree0.insert(10);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test442");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(0);
        searchTree0.insert((int) (short) -1);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) (byte) 100);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test443");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((-4));
        searchTree0.insert(3);
        searchTree0.insert(100);
        searchTree0.insert((-10));
        searchTree0.insert(10);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test444");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(4);
        searchTree0.insert((-100));
        searchTree0.insert(1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test445");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(7);
        searchTree0.insert(0);
        searchTree0.insert(0);
        searchTree0.insert(7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test446");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((-1));
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(100);
        searchTree0.insert((-7));
        searchTree0.insert((-4));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test447");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(10);
        searchTree0.insert(10);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert((-5));
        searchTree0.insert((int) '4');
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test448");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(7);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(7);
        searchTree0.insert((-5));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((-9));
        searchTree0.insert((-7));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test449");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((-1));
        searchTree0.insert(100);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test450");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((-8));
        searchTree0.insert(10);
        searchTree0.insert(4);
        searchTree0.insert((-1));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test451");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((-6));
        searchTree0.insert(6);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test452");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(10);
        searchTree0.insert((int) ' ');
        searchTree0.insert(100);
        searchTree0.insert((-10));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test453");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-9));
        searchTree0.insert((-1));
        searchTree0.insert(4);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test454");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(100);
        searchTree0.insert(0);
        searchTree0.insert(3);
        searchTree0.insert(0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test455");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((-100));
        searchTree0.insert(5);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test456");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((-3));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert(100);
        searchTree0.insert(0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test457");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(1);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test458");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test459");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test460");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert((int) (byte) 1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test461");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) -1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test462");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((int) (short) -1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (byte) -1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test463");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert((-5));
        searchTree0.insert(100);
        searchTree0.insert(9);
        searchTree0.insert(1);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test464");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test465");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 100);
        searchTree0.insert(3);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test466");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) '4');
        searchTree0.insert((-2));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-1));
        searchTree0.insert(7);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test467");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((-9));
        searchTree0.insert(0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test468");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test469");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-100));
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
        searchTree0.insert(0);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test470");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert((int) 'a');
        searchTree0.insert(5);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(10);
        searchTree0.insert((int) (short) 1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test471");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-5));
        searchTree0.insert(0);
        searchTree0.insert((-6));
        searchTree0.insert(1);
        searchTree0.insert(0);
        searchTree0.insert(6);
        searchTree0.insert((-100));
        searchTree0.insert(10);
        searchTree0.insert((-10));
        searchTree0.insert((-1));
        searchTree0.insert(1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test472");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(2);
        searchTree0.insert((int) (byte) -1);
        searchTree0.insert((int) '4');
        searchTree0.insert((-10));
        searchTree0.insert((int) (short) 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test473");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(2);
        searchTree0.insert(0);
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert(1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test474");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert(8);
        searchTree0.insert((int) (short) 0);
        searchTree0.insert(0);
        searchTree0.insert(1);
        searchTree0.insert((int) (short) 100);
        searchTree0.insert((-1));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test475");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert(8);
        searchTree0.insert((-5));
        searchTree0.insert((-8));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test476");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert(9);
        searchTree0.insert((-1));
        searchTree0.insert((-100));
        searchTree0.insert(8);
        searchTree0.insert((-4));
        searchTree0.insert(3);
        searchTree0.insert((int) (short) -1);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test477");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-8));
        searchTree0.insert((int) '#');
        searchTree0.insert(8);
        searchTree0.insert((-5));
        searchTree0.insert((-1));
        searchTree0.insert(10);
        searchTree0.insert(9);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test478");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((-10));
        searchTree0.insert(9);
        searchTree0.insert(0);
        searchTree0.insert((int) 'a');
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test479");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((int) 'a');
        searchTree0.insert(3);
        searchTree0.insert((int) '#');
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test480");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) '#');
        searchTree0.insert((int) (byte) 10);
        searchTree0.insert((-5));
        searchTree0.insert(3);
        searchTree0.insert((int) '4');
        searchTree0.insert((-8));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test481");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(1);
        searchTree0.insert((-1));
        searchTree0.insert((int) '#');
        searchTree0.insert(100);
        searchTree0.insert(9);
        searchTree0.insert((-8));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test482");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert(0);
        searchTree0.insert((int) (short) 1);
        searchTree0.insert(5);
        searchTree0.insert((int) (short) 10);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test483");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert(1);
        searchTree0.insert(0);
        searchTree0.insert((int) '4');
        searchTree0.insert((-5));
        searchTree0.insert(1);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test484");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert((-3));
        searchTree0.insert((-3));
        searchTree0.insert((int) (short) 10);
        searchTree0.insert(5);
        searchTree0.insert(4);
        searchTree0.insert(7);
        searchTree0.insert((int) (byte) 1);
        searchTree0.insert((-8));
        searchTree0.insert(0);
        searchTree0.insert(6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SearchTreeTester0.test485");
        DataStructures.korat.binarysearchtree.SearchTree searchTree0 = new DataStructures.korat.binarysearchtree.SearchTree();
        searchTree0.insert(100);
        searchTree0.insert((-100));
        searchTree0.insert((-7));
        searchTree0.insert(4);
        searchTree0.insert(10);
        searchTree0.insert((int) (byte) 0);
        searchTree0.insert((int) ' ');
        searchTree0.insert((int) (short) 10);
        searchTree0.insert((-2));
    }
}

