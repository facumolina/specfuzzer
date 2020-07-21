package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListTester0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test01");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((-1));
        list0.insert((int) 'a');
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test02");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((int) (byte) 0);
        list0.insert((int) (byte) 100);
        list0.insert((int) '4');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test03");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert(0);
        list0.insert((int) '4');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test04");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((-1));
        list0.insert((int) (byte) 10);
        list0.insert(0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test05");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((-1));
        list0.insert((-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test06");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) (short) -1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test07");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) (short) 1);
        list0.insert(100);
        list0.insert(1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test08");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) (short) 1);
        list0.insert(0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test09");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) (short) 1);
        list0.insert((int) (short) 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test10");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((-1));
        list0.insert((int) ' ');
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test11");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) (short) 10);
        list0.insert(10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test12");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((-1));
        list0.insert((int) (byte) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test13");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) (byte) 1);
        list0.insert((int) (short) 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test14");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((int) (byte) 0);
        list0.insert((int) (byte) 100);
        list0.insert((int) (byte) 100);
        list0.insert(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test15");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) '4');
        list0.insert((int) '4');
        list0.insert((int) (short) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test16");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert(0);
        list0.insert(0);
        list0.insert(100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test17");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) ' ');
        list0.insert(10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test18");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((int) (byte) 0);
        list0.insert((int) (byte) 100);
        list0.insert((int) 'a');
        list0.insert((int) (short) 0);
        list0.insert((int) ' ');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test19");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert(0);
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) 100);
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test20");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) '4');
        list0.insert(0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test21");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) '#');
        list0.insert((int) (short) 0);
        list0.insert((int) ' ');
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test22");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) '4');
        list0.insert((int) (byte) 1);
        list0.insert(0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test23");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) '4');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test24");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) '4');
        list0.insert((int) ' ');
        list0.insert((-1));
        list0.insert((int) (short) 10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test25");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((int) (byte) 0);
        list0.insert((int) (byte) 100);
        list0.insert((int) (byte) 100);
        list0.insert((int) (short) 1);
        list0.insert((int) (short) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test26");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) '4');
        list0.insert((int) ' ');
        list0.insert((int) (short) 10);
        list0.insert(100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test27");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert(0);
        list0.insert((int) '#');
        list0.insert((int) (byte) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test28");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) (short) -1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test29");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) '#');
        list0.insert((int) (short) 0);
        list0.insert((int) '#');
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test30");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) ' ');
        list0.insert((int) '#');
        list0.insert(1);
        list0.insert((int) '#');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test31");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) '4');
        list0.insert((int) ' ');
        list0.insert((int) (byte) 100);
        list0.insert((int) (byte) 1);
        list0.insert((int) (byte) 100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test32");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) '#');
        list0.insert((int) '4');
        list0.insert((-1));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test33");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((int) (byte) 0);
        list0.insert((int) (byte) 100);
        list0.insert((int) 'a');
        list0.insert((int) (short) 0);
        list0.insert((int) 'a');
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test34");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) ' ');
        list0.insert((int) '#');
        list0.insert((int) 'a');
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test35");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((-1));
        list0.insert((int) ' ');
        list0.insert(100);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test36");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) ' ');
        list0.insert((int) '#');
        list0.insert((int) (short) 10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test37");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((int) (byte) 0);
        list0.insert((int) (byte) 100);
        list0.insert((int) 'a');
        list0.insert((int) (short) 1);
        list0.insert((int) (short) -1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test38");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert(100);
        list0.insert((int) (byte) 0);
        list0.insert(100);
        list0.insert(0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test39");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert((int) ' ');
        list0.insert((int) '#');
        list0.insert(1);
        list0.insert((int) 'a');
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test40");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) '4');
        list0.insert((int) '4');
        list0.insert((int) (byte) 0);
        list0.insert(100);
        list0.insert((int) (byte) 1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test41");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert(1);
        list0.insert((int) (byte) 100);
        list0.insert(0);
        list0.insert((int) (short) 1);
        list0.insert((int) (short) 10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test42");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert(0);
        list0.insert((int) '#');
        list0.insert(100);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test43");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) '4');
        list0.insert((int) ' ');
        list0.insert((int) (byte) -1);
        list0.insert(10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test44");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((int) (byte) 0);
        list0.insert((int) (short) 10);
        list0.insert((int) (byte) -1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test45");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert(100);
        list0.insert((int) (short) 10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test46");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (byte) -1);
        list0.insert((int) (byte) 1);
        list0.insert((int) '4');
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test47");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert(0);
        list0.insert(0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ListTester0.test48");
        DataStructures.List list0 = new DataStructures.List();
        list0.insert((int) (short) -1);
        list0.insert((int) '4');
        list0.insert((-1));
        list0.insert((int) (byte) 100);
        list0.insert((int) (byte) 0);
    }
}

