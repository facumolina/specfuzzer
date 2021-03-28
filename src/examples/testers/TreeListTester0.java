package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TreeListTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test001");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test002");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test003");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test004");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add(1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test005");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test006");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test007");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-2), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test008");
        DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.String>> strIterableList0 = new DataStructures.commonscollections.TreeList<java.lang.Iterable<java.lang.String>>();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test009");
        DataStructures.commonscollections.TreeList<java.io.Serializable> serializableList0 = new DataStructures.commonscollections.TreeList<java.io.Serializable>();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test010");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test011");
        DataStructures.commonscollections.TreeList<java.lang.Object> objList0 = new DataStructures.commonscollections.TreeList<java.lang.Object>();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test012");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-6), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test013");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strList0.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test014");
        DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.String>> strCollectionList0 = new DataStructures.commonscollections.TreeList<java.util.Collection<java.lang.String>>();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test015");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test016");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test017");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test018");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test019");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test020");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test021");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test022");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test023");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test024");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test025");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test026");
        DataStructures.commonscollections.TreeList<java.util.AbstractList<java.lang.String>> strListList0 = new DataStructures.commonscollections.TreeList<java.util.AbstractList<java.lang.String>>();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test027");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test028");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test029");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-6), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test030");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test031");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test032");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test033");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test034");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test035");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test036");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test037");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-100), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test038");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-7), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test039");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test040");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test041");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test042");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test043");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test044");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strList3.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test045");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test046");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test047");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test048");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = strList3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test049");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test050");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strList3.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test051");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test052");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test053");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test054");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test055");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test056");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test057");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test058");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test059");
        DataStructures.commonscollections.TreeList<java.util.List<java.lang.String>> strListList0 = new DataStructures.commonscollections.TreeList<java.util.List<java.lang.String>>();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test060");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-3), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test061");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strList3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test062");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test063");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-6), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test064");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test065");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test066");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test067");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strList3.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test068");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test069");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-8), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test070");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList3.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test071");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add(9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test072");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test073");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-9), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test074");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test075");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-100), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test076");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test077");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test078");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test079");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test080");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test081");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test082");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test083");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test084");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test085");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test086");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test087");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        boolean boolean18 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test088");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList3.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test089");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test090");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strList3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test091");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test092");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test093");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test094");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test095");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test096");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test097");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test098");
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.String>> strCollectionList0 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.String>>();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test099");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = strList3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test100");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test101");
        DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.String>> strListList0 = new DataStructures.commonscollections.TreeList<DataStructures.commonscollections.TreeList<java.lang.String>>();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test102");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test103");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test104");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test105");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test106");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-6), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test107");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        java.lang.String str10 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList2.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test108");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test109");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test110");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test111");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test112");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        boolean boolean11 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test113");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test114");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test115");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test116");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test117");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        boolean boolean11 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test118");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test119");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test120");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test121");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strList3.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test122");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test123");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test124");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test125");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test126");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test127");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test128");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test129");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test130");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test131");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test132");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test133");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test134");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        java.lang.String str8 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test135");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList2.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test136");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test137");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        java.lang.String str19 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList3.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test138");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test139");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-10), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test140");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        boolean boolean26 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test141");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test142");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test143");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test144");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test145");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test146");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test147");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        java.lang.String str10 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList2.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test148");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        boolean boolean11 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test149");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((-4), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test150");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test151");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test152");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test153");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test154");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        boolean boolean15 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strList3.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test155");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-3), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test156");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("");
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test157");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test158");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        strList3.add(0, "hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test159");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test160");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-100), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test161");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add((int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList2.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test162");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test163");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test164");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test165");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test166");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test167");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test168");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test169");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test170");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test171");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test172");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test173");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test174");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test175");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-2), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test176");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test177");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test178");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test179");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test180");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        java.lang.String str8 = strList3.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test181");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test182");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test183");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test184");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test185");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-9), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test186");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = strList3.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test187");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add((int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test188");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test189");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-10), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test190");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test191");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        boolean boolean26 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test192");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        boolean boolean23 = strList3.removeElem("");
        boolean boolean25 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-6), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test193");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test194");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList3.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test195");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test196");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test197");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        boolean boolean11 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test198");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        java.lang.String str10 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-9), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test199");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        boolean boolean10 = strList2.removeElem("");
        strList2.add((int) (short) 0, "hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test200");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strList3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test201");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test202");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test203");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add(2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test204");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        boolean boolean16 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strList3.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test205");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test206");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test207");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        strList3.add(3, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test208");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test209");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test210");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("");
        boolean boolean19 = strList3.removeElem("hi!");
        boolean boolean21 = strList3.removeElem("hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test211");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test212");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test213");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        java.lang.String str7 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test214");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        boolean boolean29 = strList3.removeElem("hi!");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test215");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        strList3.add(3, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test216");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        boolean boolean12 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList2.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test217");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test218");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test219");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("hi!");
        java.lang.String str15 = strList3.remove(0);
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test220");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("hi!");
        java.lang.String str15 = strList3.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-7), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test221");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-10), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test222");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList3.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test223");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        boolean boolean11 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test224");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test225");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-8), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test226");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test227");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        java.lang.String str22 = strList3.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = strList3.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test228");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test229");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        strList3.add((int) (short) 0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test230");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test231");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-3), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test232");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        java.lang.String str7 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test233");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("");
        boolean boolean25 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-5), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test234");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test235");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test236");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test237");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test238");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test239");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(1);
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test240");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test241");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test242");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test243");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        java.lang.String str22 = strList3.remove((int) (short) 1);
        boolean boolean24 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strList3.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test244");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test245");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test246");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test247");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-3), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test248");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test249");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test250");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test251");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        boolean boolean29 = strList3.removeElem("hi!");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = strList3.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test252");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList3.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test253");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        java.lang.String str7 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test254");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test255");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test256");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        java.lang.String str26 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test257");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str14 = strList3.remove(0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test258");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test259");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        boolean boolean22 = strList3.removeElem("hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test260");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(1);
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test261");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test262");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test263");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        java.lang.String str22 = strList3.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-3), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test264");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-3), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test265");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test266");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        boolean boolean10 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList2.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test267");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test268");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        strList3.add((int) (short) 0, "");
        boolean boolean20 = strList3.removeElem("");
        boolean boolean22 = strList3.removeElem("");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test269");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-2), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test270");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test271");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test272");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        boolean boolean29 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test273");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test274");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test275");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test276");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList0.add(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test277");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test278");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test279");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        boolean boolean10 = strList2.removeElem("");
        boolean boolean12 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList2.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test280");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test281");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        strList3.add((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test282");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-8), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test283");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        java.lang.String str25 = strList3.remove(0);
        boolean boolean27 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test284");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test285");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test286");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test287");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strList3.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test288");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test289");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test290");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strList3.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test291");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test292");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test293");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-8), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test294");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test295");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        boolean boolean18 = strList3.removeElem("hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test296");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(0, "hi!");
        strList3.add((int) (short) 0, "hi!");
        boolean boolean30 = strList3.removeElem("");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test297");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test298");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test299");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test300");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test301");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test302");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-10), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test303");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(1);
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test304");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test305");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        java.lang.String str23 = strList3.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test306");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strList3.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test307");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        boolean boolean11 = strList2.removeElem("");
        boolean boolean13 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strList2.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test308");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test309");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        boolean boolean18 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test310");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        java.lang.String str21 = strList3.remove(2);
        boolean boolean23 = strList3.removeElem("");
        boolean boolean25 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test311");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test312");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        boolean boolean11 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test313");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test314");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        java.lang.String str8 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-7), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test315");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test316");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test317");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-2), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test318");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test319");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test320");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        boolean boolean7 = strList2.removeElem("hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test321");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test322");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        boolean boolean11 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList2.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test323");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        java.lang.String str8 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test324");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        strList3.add((int) (short) 0, "");
        boolean boolean20 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-3), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test325");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove((int) (short) 0);
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test326");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test327");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add((int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList2.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test328");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-2), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test329");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        boolean boolean11 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test330");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test331");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        boolean boolean12 = strList2.removeElem("hi!");
        boolean boolean14 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test332");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        boolean boolean14 = strList3.removeElem("");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-7), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test333");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        boolean boolean10 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test334");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test335");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add(0, "");
        strList3.add((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test336");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(1);
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("");
        strList3.add(1, "");
        boolean boolean28 = strList3.removeElem("");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test337");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test338");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test339");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-9), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test340");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test341");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-100), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test342");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test343");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        boolean boolean20 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test344");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        java.lang.String str7 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test345");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test346");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(1);
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-9), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test347");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test348");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(1);
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("");
        strList3.add(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test349");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        java.lang.String str26 = strList3.remove(2);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test350");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        java.lang.String str26 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-8), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test351");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test352");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test353");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        boolean boolean7 = strList2.removeElem("");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test354");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        boolean boolean29 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = strList3.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test355");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test356");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test357");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        boolean boolean29 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test358");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        java.lang.String str8 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test359");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test360");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test361");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test362");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-10), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test363");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test364");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        strList3.add(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test365");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test366");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(1);
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-5), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test367");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(0, "hi!");
        strList3.add((int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test368");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        boolean boolean26 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test369");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        boolean boolean29 = strList3.removeElem("hi!");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test370");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test371");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        boolean boolean12 = strList2.removeElem("hi!");
        boolean boolean14 = strList2.removeElem("");
        strList2.add((int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList2.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test372");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test373");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strList0.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test374");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test375");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test376");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test377");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        boolean boolean17 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-8), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test378");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList3.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test379");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        java.lang.String str26 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test380");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        strList3.add((int) (short) 1, "hi!");
        boolean boolean28 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test381");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test382");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        boolean boolean29 = strList3.removeElem("");
        boolean boolean31 = strList3.removeElem("");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test383");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test384");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test385");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test386");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test387");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-3), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test388");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test389");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test390");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        strList3.add(3, "");
        boolean boolean29 = strList3.removeElem("");
        java.lang.String str31 = strList3.remove(2);
        boolean boolean33 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test391");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-2), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test392");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        java.lang.String str26 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test393");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList0.add(2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test394");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test395");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        java.lang.String str22 = strList3.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test396");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test397");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(0, "hi!");
        boolean boolean24 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test398");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test399");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        strList3.add(1, "hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = strList3.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test400");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test401");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test402");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        java.lang.String str26 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test403");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        boolean boolean10 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test404");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        java.lang.String str23 = strList3.remove(0);
        java.lang.String str25 = strList3.remove((int) (byte) 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test405");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test406");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
        strList3.add(0, "");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test407");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strList0.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test408");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test409");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test410");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        boolean boolean17 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test411");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test412");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test413");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-6), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test414");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        boolean boolean17 = strList3.removeElem("");
        boolean boolean19 = strList3.removeElem("hi!");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test415");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test416");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        strList3.add(0, "");
        boolean boolean15 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test417");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        java.lang.String str10 = strList2.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test418");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-9), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test419");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        strList3.add(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test420");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test421");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-2), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test422");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test423");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("hi!");
        strList0.add(0, "");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test424");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(0, "hi!");
        strList3.add(0, "hi!");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test425");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        boolean boolean11 = strList2.removeElem("");
        boolean boolean13 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strList2.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test426");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add(2, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test427");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test428");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test429");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-3), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test430");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        boolean boolean18 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test431");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test432");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        java.lang.String str23 = strList3.remove((int) (byte) 1);
        boolean boolean25 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-2), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test433");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        boolean boolean6 = strList0.removeElem("");
        boolean boolean8 = strList0.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test434");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        java.lang.String str12 = strList2.remove((int) (short) 0);
        boolean boolean14 = strList2.removeElem("hi!");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test435");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add((int) (byte) 1, "");
        strList3.add(4, "hi!");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test436");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((-3), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test437");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test438");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        java.lang.String str23 = strList3.remove((int) (byte) 1);
        strList3.add((int) (byte) 1, "");
        boolean boolean28 = strList3.removeElem("hi!");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test439");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test440");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean26 = strList3.removeElem("");
        boolean boolean28 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test441");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test442");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("");
        boolean boolean16 = strList3.removeElem("");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test443");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test444");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test445");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        java.lang.String str7 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test446");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test447");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean26 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test448");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("hi!");
        java.lang.String str23 = strList3.remove((int) (byte) 0);
        boolean boolean25 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-9), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test449");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test450");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        boolean boolean15 = strList3.removeElem("");
        boolean boolean17 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test451");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList2.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test452");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        strList3.add(1, "");
        java.lang.String str26 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test453");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test454");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        boolean boolean20 = strList3.removeElem("hi!");
        java.lang.String str22 = strList3.remove((int) (short) 1);
        boolean boolean24 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strList3.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test455");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        strList3.add(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test456");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        boolean boolean15 = strList3.removeElem("");
        boolean boolean17 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test457");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test458");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        boolean boolean21 = strList3.removeElem("");
        java.lang.String str23 = strList3.remove(0);
        boolean boolean25 = strList3.removeElem("");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test459");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test460");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test461");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test462");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        strList2.add((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test463");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(2, "hi!");
        boolean boolean27 = strList3.removeElem("");
        boolean boolean29 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = strList3.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test464");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        java.lang.String str7 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strList2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test465");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test466");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("hi!");
        java.lang.String str15 = strList3.remove(0);
        strList3.add(0, "");
        boolean boolean20 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = strList3.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test467");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test468");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 1, "hi!");
        boolean boolean22 = strList3.removeElem("");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test469");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
        strList3.add((int) (short) 1, "hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test470");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strList0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test471");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        boolean boolean6 = strList0.removeElem("");
        boolean boolean8 = strList0.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((-100), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test472");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        java.lang.String str21 = strList3.remove((int) (short) 1);
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test473");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        boolean boolean18 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test474");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test475");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        java.lang.String str8 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test476");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        java.lang.String str19 = strList3.remove(0);
        strList3.add((int) (byte) 0, "");
        boolean boolean24 = strList3.removeElem("");
        strList3.add(3, "");
        boolean boolean29 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test477");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        strList3.add((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test478");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        java.lang.String str8 = strList3.remove((int) (short) 0);
        boolean boolean10 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test479");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        boolean boolean10 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList2.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test480");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        strList3.add(0, "");
        strList3.add((int) (short) 1, "");
        java.lang.String str23 = strList3.remove(0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test481");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        boolean boolean11 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test482");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test483");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("hi!");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test484");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test485");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        boolean boolean10 = strList2.removeElem("");
        boolean boolean12 = strList2.removeElem("hi!");
        strList2.add((int) (byte) 1, "");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test486");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        boolean boolean15 = strList3.removeElem("");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("hi!");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test487");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test488");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test489");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test490");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("hi!");
        boolean boolean23 = strList3.removeElem("hi!");
        strList3.add((int) (short) 1, "hi!");
        boolean boolean28 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test491");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        strList3.add(2, "hi!");
        strList3.add(2, "hi!");
        boolean boolean27 = strList3.removeElem("");
        boolean boolean29 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test492");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test493");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        boolean boolean14 = strList3.removeElem("");
        boolean boolean16 = strList3.removeElem("hi!");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test494");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "");
        strList2.add((int) (byte) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test495");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test496");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test497");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        boolean boolean12 = strList2.removeElem("hi!");
        boolean boolean14 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList2.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test498");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        boolean boolean16 = strList3.removeElem("");
        boolean boolean18 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-100), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test499");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        strList3.add(2, "hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester0.test500");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean16 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

