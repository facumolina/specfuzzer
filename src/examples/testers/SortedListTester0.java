package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SortedListTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test001");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(8);
        list0.insert((int) 'a');
        list0.insert((int) (short) -1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test002");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test003");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert(2);
        list0.clear();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test004");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.insert((int) (byte) 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test005");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test006");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert((int) 'a');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test007");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.clear();
        list0.insert((-100));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test008");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert((int) (short) -1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test009");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert((int) (byte) 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test010");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(1);
        list0.insert((-7));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test011");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.insert(8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test012");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test013");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert((-100));
        list0.clear();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test014");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert((-7));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test015");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.insert(1);
        list0.clear();
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test016");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test017");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert(1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test018");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert((int) (short) 10);
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test019");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert((int) (short) 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test020");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(4);
        list0.clear();
        list0.insert(10);
        list0.clear();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test021");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((int) (short) 1);
        list0.insert((int) (short) 1);
        list0.insert(6);
        list0.clear();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test022");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(9);
        list0.clear();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test023");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) ' ');
        list0.insert((-8));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test024");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) -1);
        list0.insert((int) (short) -1);
        list0.insert((int) (byte) 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test025");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 10);
        list0.clear();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test026");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(8);
        list0.insert((int) (short) 0);
        list0.insert(2);
        list0.insert((-1));
        list0.insert(0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test027");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((int) (short) 1);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test028");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test029");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test030");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert(8);
        list0.insert((int) ' ');
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test031");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-9));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test032");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert((-2));
        list0.insert((int) (byte) 0);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test033");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test034");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.clear();
        list0.insert((-1));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test035");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert((int) ' ');
        list0.insert((-3));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test036");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert(6);
        list0.clear();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test037");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(8);
        list0.clear();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test038");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.clear();
        list0.insert((-5));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test039");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test040");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.clear();
        list0.insert((int) (short) 10);
        list0.clear();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test041");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.insert((-8));
        list0.clear();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test042");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test043");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert((-100));
        list0.insert((int) '4');
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test044");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.clear();
        list0.insert(9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test045");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert((int) '4');
        list0.insert(7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test046");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert((int) 'a');
        list0.insert((int) (byte) 100);
        list0.insert(1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test047");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test048");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert(1);
        list0.clear();
        list0.insert(0);
        list0.insert(100);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test049");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert((int) 'a');
        list0.insert((int) (byte) 100);
        list0.insert(2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test050");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test051");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert((-10));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test052");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.insert((-7));
        list0.clear();
        list0.insert((int) ' ');
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test053");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((-6));
        list0.insert(5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test054");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((int) (byte) 10);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test055");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.insert((-3));
        list0.clear();
        list0.insert((int) (short) 10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test056");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) -1);
        list0.insert(100);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test057");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(3);
        list0.insert(1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test058");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) -1);
        list0.insert((-8));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test059");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test060");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.clear();
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test061");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-1));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test062");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(8);
        list0.insert((int) (short) 0);
        list0.insert(2);
        list0.clear();
        list0.insert((-6));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test063");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) ' ');
        list0.insert((int) ' ');
        list0.clear();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test064");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert(8);
        list0.clear();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test065");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((-6));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test066");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(10);
        list0.insert(100);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test067");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.clear();
        list0.insert((-8));
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test068");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.insert((-2));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test069");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.insert((-3));
        list0.insert((int) (short) 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test070");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert((-10));
        list0.insert((-10));
        list0.insert((-8));
        list0.insert((-4));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test071");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert(10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test072");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((-9));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test073");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert((int) '4');
        list0.clear();
        list0.insert(2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test074");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.clear();
        list0.insert(2);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test075");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.insert((int) (short) 0);
        list0.insert((-100));
        list0.insert((int) (byte) -1);
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test076");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((-1));
        list0.clear();
        list0.insert(5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test077");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert((-10));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test078");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert((-5));
        list0.clear();
        list0.insert((int) (short) -1);
        list0.clear();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test079");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.clear();
        list0.insert((-2));
        list0.insert(3);
        list0.clear();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test080");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test081");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.clear();
        list0.insert((-2));
        list0.insert(3);
        list0.insert((-6));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test082");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.insert((-7));
        list0.insert((int) (short) 1);
        list0.clear();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test083");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test084");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(8);
        list0.insert((int) (short) 0);
        list0.insert(2);
        list0.insert((int) '#');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test085");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((int) '4');
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test086");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(4);
        list0.clear();
        list0.insert(10);
        list0.insert(100);
        list0.insert(6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test087");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.clear();
        list0.insert((-2));
        list0.insert(3);
        list0.insert((-100));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test088");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test089");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) -1);
        list0.insert((int) (short) -1);
        list0.insert((-6));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test090");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.insert(9);
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test091");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.clear();
        list0.insert((-4));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test092");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert(100);
        list0.insert(7);
        list0.clear();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test093");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(4);
        list0.clear();
        list0.insert(10);
        list0.insert(3);
        list0.insert((-3));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test094");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert(8);
        list0.clear();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test095");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((int) (short) 1);
        list0.insert((int) (short) 1);
        list0.clear();
        list0.insert((-100));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test096");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert(1);
        list0.insert(3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test097");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) (byte) 10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-8));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test098");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert((-10));
        list0.insert((-10));
        list0.insert((-8));
        list0.clear();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test099");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.insert(100);
        list0.insert((int) ' ');
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test100");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test101");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert((int) (short) 10);
        list0.insert((int) (short) 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test102");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((-1));
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert((int) (byte) 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test103");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert(8);
        list0.insert((-7));
        list0.clear();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test104");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test105");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(1);
        list0.insert(10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test106");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.clear();
        list0.clear();
        list0.insert((-10));
        list0.insert(1);
        list0.insert((int) (short) 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test107");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test108");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 100);
        list0.insert(0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test109");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) (byte) 10);
        list0.insert(100);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test110");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((int) 'a');
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test111");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert((-10));
        list0.clear();
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test112");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert(10);
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test113");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test114");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((int) 'a');
        list0.insert((-9));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test115");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((-4));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test116");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.insert(8);
        list0.insert((-9));
        list0.insert((-1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test117");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.insert((-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test118");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test119");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert((-10));
        list0.insert((-100));
        list0.clear();
        list0.insert((-2));
        list0.clear();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test120");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) 100);
        list0.clear();
        list0.clear();
        list0.insert((-3));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test121");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert((-8));
        list0.clear();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test122");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-8));
        list0.insert(6);
        list0.clear();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test123");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.insert(1);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test124");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) -1);
        list0.insert((-3));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test125");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-9));
        list0.clear();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test126");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert((int) (short) 10);
        list0.insert((int) (byte) 10);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test127");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert((-5));
        list0.clear();
        list0.insert((int) (byte) 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test128");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert(8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test129");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-10));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test130");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((int) ' ');
        list0.insert((-5));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test131");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-8));
        list0.insert(100);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test132");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.insert(9);
        list0.insert(0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test133");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test134");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.clear();
        list0.insert((-2));
        list0.insert(3);
        list0.insert((int) (short) 10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test135");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.insert(1);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test136");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert((int) (short) 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test137");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) 'a');
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test138");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert(6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test139");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.clear();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test140");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.insert((int) (short) 100);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test141");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test142");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) 10);
        list0.clear();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test143");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert((int) (byte) 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test144");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert((int) 'a');
        list0.insert((-1));
        list0.insert((-4));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test145");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((-3));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test146");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert(8);
        list0.insert(10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test147");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert(10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test148");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert((-9));
        list0.clear();
        list0.insert((int) (short) 10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test149");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.clear();
        list0.insert(2);
        list0.insert((int) '#');
        list0.insert((int) (short) -1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test150");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert((-3));
        list0.clear();
        list0.clear();
        list0.insert(5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test151");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert(100);
        list0.insert((int) (byte) 10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test152");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test153");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-2));
        list0.clear();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test154");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) (short) 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test155");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.insert(100);
        list0.clear();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test156");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test157");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test158");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert(4);
        list0.insert(10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test159");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((int) (byte) 10);
        list0.clear();
        list0.insert(10);
        list0.clear();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test160");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test161");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.clear();
        list0.insert((-10));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test162");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.insert((-2));
        list0.insert(100);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test163");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.insert(10);
        list0.insert(7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test164");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) -1);
        list0.insert(0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test165");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert(1);
        list0.clear();
        list0.insert(4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test166");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test167");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(3);
        list0.insert(2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test168");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) -1);
        list0.clear();
        list0.clear();
        list0.insert(100);
        list0.insert((-9));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test169");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert(10);
        list0.insert((int) (byte) 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test170");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert(8);
        list0.insert((-8));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test171");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test172");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) ' ');
        list0.insert(6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test173");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert((-100));
        list0.insert((-3));
        list0.insert((int) (short) -1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test174");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert(5);
        list0.insert(2);
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test175");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((-5));
        list0.clear();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test176");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert(5);
        list0.clear();
        list0.insert(1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test177");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(6);
        list0.insert((-8));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test178");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.insert(3);
        list0.insert(6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test179");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((-100));
        list0.insert(1);
        list0.insert((int) (byte) 10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test180");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) ' ');
        list0.insert(7);
        list0.insert(8);
        list0.insert(8);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test181");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert(10);
        list0.insert(0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test182");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert((-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test183");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.insert((-8));
        list0.insert(6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test184");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test185");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert((int) (short) 10);
        list0.clear();
        list0.insert((int) (byte) 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test186");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(8);
        list0.insert((int) 'a');
        list0.insert(0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test187");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test188");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-8));
        list0.clear();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test189");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test190");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test191");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test192");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.clear();
        list0.insert((-1));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test193");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert((int) (short) 10);
        list0.insert(0);
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test194");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert(0);
        list0.insert(3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test195");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert((int) 'a');
        list0.insert((int) (byte) 100);
        list0.insert((int) (short) 10);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test196");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test197");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(3);
        list0.insert(3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test198");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert((-8));
        list0.insert(0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test199");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-4));
        list0.insert(0);
        list0.clear();
        list0.insert(4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test200");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert((int) ' ');
        list0.clear();
        list0.insert(7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test201");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test202");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.clear();
        list0.insert(1);
        list0.clear();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test203");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) (byte) 10);
        list0.clear();
        list0.clear();
        list0.insert(100);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test204");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(4);
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test205");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((int) (short) 1);
        list0.insert((int) (short) 1);
        list0.insert(0);
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test206");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.insert(2);
        list0.insert(6);
        list0.insert((-100));
        list0.clear();
        list0.insert((int) (short) 100);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test207");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((-1));
        list0.insert((int) (byte) 1);
        list0.clear();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test208");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert(6);
        list0.insert(0);
        list0.clear();
        list0.insert((-8));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test209");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((int) (byte) 10);
        list0.insert((-10));
        list0.clear();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test210");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test211");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.insert((int) ' ');
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test212");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test213");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.clear();
        list0.insert(9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test214");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert(100);
        list0.insert((int) (byte) -1);
        list0.insert((-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test215");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((-6));
        list0.clear();
        list0.insert(3);
        list0.clear();
        list0.insert((int) (short) 0);
        list0.insert((int) '#');
        list0.clear();
        list0.insert(3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test216");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(9);
        list0.clear();
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test217");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.insert(3);
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test218");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 10);
        list0.insert((-2));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test219");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.insert(10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test220");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test221");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert((-100));
        list0.insert((-7));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test222");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-5));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test223");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test224");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.insert((int) (short) 100);
        list0.insert((-8));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test225");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test226");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.insert((-3));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test227");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert((int) '4');
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test228");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert(5);
        list0.insert((-4));
        list0.clear();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test229");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.clear();
        list0.insert((-3));
        list0.clear();
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test230");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((-8));
        list0.clear();
        list0.insert((-8));
        list0.clear();
        list0.insert(9);
        list0.insert((-5));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test231");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((-6));
        list0.clear();
        list0.insert(3);
        list0.clear();
        list0.insert((int) (short) 0);
        list0.insert((int) '#');
        list0.clear();
        list0.clear();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test232");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert(5);
        list0.clear();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test233");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(9);
        list0.clear();
        list0.insert(9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test234");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert(8);
        list0.insert((-7));
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test235");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert((-9));
        list0.clear();
        list0.insert(10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test236");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert((int) 'a');
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test237");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert((int) (short) 10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test238");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(4);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test239");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((-100));
        list0.insert(100);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test240");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 10);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((-5));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test241");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-2));
        list0.insert((int) 'a');
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test242");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert((int) 'a');
        list0.insert((int) (byte) 100);
        list0.insert((int) (short) 10);
        list0.clear();
        list0.insert((int) '#');
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test243");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((-1));
        list0.clear();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test244");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.insert((int) (short) -1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test245");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.insert((-8));
        list0.insert((int) ' ');
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test246");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((-8));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test247");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test248");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert((int) '4');
        list0.insert((-5));
        list0.insert((-10));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test249");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) -1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test250");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert((int) (short) 10);
        list0.insert(0);
        list0.insert(6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test251");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test252");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test253");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert((-100));
        list0.insert((-1));
        list0.insert(7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test254");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test255");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert(8);
        list0.insert((int) '4');
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test256");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((-3));
        list0.clear();
        list0.insert((int) 'a');
        list0.insert((int) '#');
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test257");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.insert((-7));
        list0.insert(1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test258");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) -1);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test259");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert(5);
        list0.clear();
        list0.clear();
        list0.insert((-9));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test260");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test261");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(8);
        list0.insert((int) 'a');
        list0.insert((int) 'a');
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test262");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert(4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test263");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(8);
        list0.insert(100);
        list0.insert((int) '#');
        list0.clear();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test264");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert(5);
        list0.insert(2);
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test265");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert(5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test266");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(8);
        list0.insert((int) (short) 0);
        list0.insert(2);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test267");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert(5);
        list0.clear();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test268");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(1);
        list0.clear();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test269");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) -1);
        list0.insert((int) (short) -1);
        list0.clear();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test270");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((-3));
        list0.insert(4);
        list0.clear();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test271");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.clear();
        list0.insert((int) 'a');
        list0.clear();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test272");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((-3));
        list0.clear();
        list0.insert((-6));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test273");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert(0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test274");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.clear();
        list0.insert((-8));
        list0.insert((int) (short) 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test275");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert(10);
        list0.clear();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test276");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.clear();
        list0.insert((-5));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test277");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert(9);
        list0.clear();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test278");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test279");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) (byte) 10);
        list0.clear();
        list0.clear();
        list0.insert((-1));
        list0.clear();
        list0.insert((-1));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test280");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert((-10));
        list0.insert((-10));
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.clear();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test281");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-3));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test282");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert(0);
        list0.insert(4);
        list0.clear();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test283");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert((int) (short) 100);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test284");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.insert((-1));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test285");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(1);
        list0.insert((int) (short) 100);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test286");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test287");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert(10);
        list0.insert((-8));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test288");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.insert(8);
        list0.insert(1);
        list0.clear();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test289");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test290");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert((-9));
        list0.clear();
        list0.insert((-1));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test291");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert((-100));
        list0.clear();
        list0.insert((int) '#');
        list0.insert(100);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test292");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(1);
        list0.insert(1);
        list0.insert((-3));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test293");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.insert(4);
        list0.clear();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test294");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) -1);
        list0.clear();
        list0.clear();
        list0.insert(100);
        list0.insert(10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test295");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(9);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test296");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((int) (short) -1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test297");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert(8);
        list0.insert((-7));
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-8));
        list0.clear();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test298");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert((-10));
        list0.clear();
        list0.insert(0);
        list0.insert((-1));
        list0.clear();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test299");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) ' ');
        list0.clear();
        list0.insert(10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test300");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert((int) (short) 10);
        list0.insert(0);
        list0.insert((int) (short) -1);
        list0.insert(8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test301");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert((-9));
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test302");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test303");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) (short) -1);
        list0.clear();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test304");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.insert((-4));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test305");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.clear();
        list0.insert((-8));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test306");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert((-2));
        list0.insert((int) (byte) 0);
        list0.clear();
        list0.insert((-7));
        list0.insert(0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test307");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test308");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(10);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test309");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((-6));
        list0.clear();
        list0.insert(3);
        list0.clear();
        list0.insert((int) (short) 0);
        list0.insert((int) '#');
        list0.clear();
        list0.insert((int) '4');
        list0.clear();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test310");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((-5));
        list0.insert(100);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test311");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test312");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-7));
        list0.insert((-1));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test313");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((int) (byte) 10);
        list0.insert((int) '#');
        list0.insert((-100));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test314");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert((-10));
        list0.insert((-10));
        list0.insert((-8));
        list0.insert(3);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test315");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert((-2));
        list0.insert((int) (byte) 0);
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test316");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert((-10));
        list0.insert((-10));
        list0.clear();
        list0.clear();
        list0.insert((-1));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test317");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) ' ');
        list0.clear();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test318");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.insert(0);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test319");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-8));
        list0.insert(5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test320");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.insert(0);
        list0.insert((int) 'a');
        list0.insert((-1));
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test321");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 10);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test322");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.insert(2);
        list0.clear();
        list0.insert((-9));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test323");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((-2));
        list0.clear();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test324");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test325");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(4);
        list0.insert((-4));
        list0.insert((int) (byte) -1);
        list0.insert((int) ' ');
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test326");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert(0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test327");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test328");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.insert((-8));
        list0.insert(0);
        list0.insert((int) (short) 10);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test329");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.insert((-6));
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test330");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) ' ');
        list0.insert(7);
        list0.insert((-10));
        list0.clear();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test331");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.insert((-8));
        list0.insert(0);
        list0.clear();
        list0.insert(1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test332");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert((-9));
        list0.clear();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test333");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(1);
        list0.insert(1);
        list0.insert((-100));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test334");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) '4');
        list0.insert((-8));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test335");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert((-8));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test336");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.insert((int) (short) 0);
        list0.insert((-1));
        list0.insert(100);
        list0.clear();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test337");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) -1);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test338");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert(5);
        list0.insert(2);
        list0.clear();
        list0.insert((int) (byte) 0);
        list0.clear();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test339");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test340");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((-6));
        list0.clear();
        list0.insert(3);
        list0.clear();
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test341");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.insert((int) (short) 0);
        list0.insert((-100));
        list0.clear();
        list0.clear();
        list0.insert((int) (short) -1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test342");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) 100);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((int) (short) 0);
        list0.insert(100);
        list0.clear();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test343");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert(6);
        list0.insert((-7));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test344");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.insert(2);
        list0.insert(6);
        list0.clear();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test345");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((int) 'a');
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert((-100));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test346");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(3);
        list0.clear();
        list0.insert(1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test347");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert((-10));
        list0.clear();
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test348");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.clear();
        list0.insert((-2));
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test349");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert((-3));
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test350");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.insert((-2));
        list0.clear();
        list0.insert((int) (short) -1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test351");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert(10);
        list0.clear();
        list0.insert((-8));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test352");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.clear();
        list0.insert((-9));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test353");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test354");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test355");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.insert((-10));
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test356");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((int) (byte) 10);
        list0.insert((-10));
        list0.insert((-1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test357");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert((int) ' ');
        list0.insert((int) '4');
        list0.insert((int) (byte) 10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test358");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert(10);
        list0.clear();
        list0.insert((int) (short) 100);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test359");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert(1);
        list0.clear();
        list0.insert((-10));
        list0.clear();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test360");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test361");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.clear();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test362");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-8));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test363");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test364");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((-5));
        list0.insert((int) '#');
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test365");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert(10);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test366");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert((int) (short) 0);
        list0.insert((int) ' ');
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test367");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert((-3));
        list0.insert((int) (short) -1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test368");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test369");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-4));
        list0.insert(7);
        list0.insert(1);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test370");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test371");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 0);
        list0.clear();
        list0.insert(1);
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert(5);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test372");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert((int) (short) -1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test373");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) (short) -1);
        list0.insert((-7));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test374");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert((-10));
        list0.clear();
        list0.insert((-4));
        list0.clear();
        list0.insert(1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test375");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert((int) 'a');
        list0.insert((int) (short) 1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test376");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(9);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test377");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.insert((-8));
        list0.insert((-10));
        list0.clear();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test378");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.insert((-9));
        list0.insert(7);
        list0.clear();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test379");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.insert(8);
        list0.clear();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test380");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(3);
        list0.insert(10);
        list0.clear();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test381");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert((-100));
        list0.clear();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test382");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.clear();
        list0.insert((-2));
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 10);
        list0.clear();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test383");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert((-9));
        list0.insert((int) (short) -1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test384");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((-6));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test385");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(8);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test386");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (byte) 100);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert(0);
        list0.insert((-1));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test387");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.insert(6);
        list0.clear();
        list0.insert((-6));
        list0.insert(100);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test388");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test389");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((-7));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test390");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert(2);
        list0.insert(8);
        list0.insert((-7));
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert((int) '4');
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test391");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(4);
        list0.insert(10);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test392");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test393");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.clear();
        list0.clear();
        list0.insert(1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test394");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert(6);
        list0.insert((int) (short) 100);
        list0.insert(0);
        list0.insert((int) ' ');
        list0.insert(7);
        list0.insert((-9));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test395");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((int) (byte) 10);
        list0.insert((int) '4');
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test396");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.clear();
        list0.insert(4);
        list0.clear();
        list0.insert((-100));
        list0.insert(4);
        list0.clear();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test397");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(4);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test398");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert(3);
        list0.insert(10);
        list0.insert(0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test399");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test400");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.clear();
        list0.insert((-3));
        list0.clear();
        list0.insert((int) (short) 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test401");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.insert((-2));
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test402");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.clear();
        list0.insert(0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test403");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(8);
        list0.insert((int) (short) 0);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test404");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) ' ');
        list0.clear();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test405");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((-6));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test406");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.clear();
        list0.insert((-3));
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test407");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert(7);
        list0.clear();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test408");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) ' ');
        list0.insert(0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test409");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(8);
        list0.insert(8);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test410");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((-6));
        list0.clear();
        list0.insert(3);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test411");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert(1);
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.clear();
        list0.insert(1);
        list0.clear();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test412");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) -1);
        list0.insert(8);
        list0.insert(9);
        list0.insert(0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test413");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(4);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test414");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((int) (byte) 10);
        list0.insert((-10));
        list0.insert(0);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test415");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.insert(10);
        list0.insert((-4));
        list0.insert(4);
        list0.clear();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test416");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test417");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test418");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test419");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((-1));
        list0.insert((-8));
        list0.clear();
        list0.insert((-8));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test420");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.insert(0);
        list0.insert((int) (short) 10);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test421");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.clear();
        list0.clear();
        list0.insert((-10));
        list0.clear();
        list0.clear();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test422");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.insert((int) (short) 100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(4);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test423");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert((-3));
        list0.insert(8);
        list0.insert(0);
        list0.insert((-6));
        list0.clear();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test424");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.clear();
        list0.clear();
        list0.insert((-6));
        list0.clear();
        list0.insert((int) (short) 10);
        list0.insert(0);
        list0.insert((int) (short) -1);
        list0.clear();
        list0.insert((int) (byte) 0);
        list0.insert((-6));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test425");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.insert(100);
        list0.insert((int) '4');
        list0.insert(6);
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(1);
        list0.clear();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test426");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(5);
        list0.insert(8);
        list0.insert(1);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test427");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 100);
        list0.insert((-8));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test428");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert((-8));
        list0.insert((int) ' ');
        list0.insert((-2));
        list0.insert((int) (short) 100);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test429");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test430");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.insert((int) (byte) 10);
        list0.insert((-10));
        list0.insert(2);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test431");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 10);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.insert((int) (byte) 1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test432");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.insert((int) (short) 100);
        list0.clear();
        list0.insert((int) (short) -1);
        list0.clear();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test433");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
        list0.insert(0);
        list0.clear();
        list0.insert((-2));
        list0.clear();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test434");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(10);
        list0.clear();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test435");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.insert((int) (byte) 10);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
        list0.clear();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test436");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(100);
        list0.clear();
        list0.insert(100);
        list0.clear();
        list0.insert((int) (byte) -1);
        list0.clear();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test437");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.clear();
        list0.clear();
        list0.insert((int) ' ');
        list0.insert(10);
        list0.insert((-4));
        list0.insert(4);
        list0.insert((int) '4');
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test438");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(4);
        list0.clear();
        list0.insert(10);
        list0.insert(100);
        list0.clear();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test439");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert(6);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(0);
        list0.clear();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test440");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert(10);
        list0.insert(10);
        list0.insert(5);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test441");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.clear();
        list0.insert(5);
        list0.clear();
        list0.clear();
        list0.insert((int) '#');
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test442");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(0);
        list0.clear();
        list0.insert((int) 'a');
        list0.insert(100);
        list0.insert(4);
        list0.clear();
        list0.clear();
        list0.clear();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test443");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.insert((-10));
        list0.clear();
        list0.insert((-4));
        list0.clear();
        list0.insert((int) (byte) 100);
        list0.clear();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test444");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert((-5));
        list0.clear();
        list0.insert((int) (byte) 1);
        list0.insert(1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test445");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(9);
        list0.insert(100);
        list0.clear();
        list0.clear();
        list0.insert(10);
        list0.clear();
        list0.clear();
        list0.insert(8);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test446");
        DataStructures.SortedList list0 = new DataStructures.SortedList();
        list0.insert(0);
        list0.clear();
        list0.clear();
        list0.insert((int) (short) 100);
        list0.insert((-1));
    }
}

