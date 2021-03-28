package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TreeListTester1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test501");
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
        strList3.add((int) (short) 0, "hi!");
        boolean boolean28 = strList3.removeElem("hi!");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test502");
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
            strList3.add(4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test503");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test504");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test505");
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
        boolean boolean26 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test506");
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
            java.lang.String str16 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test507");
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
        java.lang.String str27 = strList3.remove((int) (short) 0);
        boolean boolean29 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test508");
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
            java.lang.String str24 = strList3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test509");
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
            strList3.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test510");
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
            strList3.add((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test511");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test512");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("hi!");
        boolean boolean12 = strList3.removeElem("");
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test513");
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
            java.lang.String str19 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test514");
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
            strList3.add((-5), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test515");
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
            java.lang.String str28 = strList3.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test516");
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
            java.lang.String str18 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test517");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        java.lang.String str7 = strList2.remove((int) (short) 0);
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test518");
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
            strList3.add((-9), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test519");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test520");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test521");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("hi!");
        boolean boolean15 = strList3.removeElem("");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test522");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test523");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (short) 0, "");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test524");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        java.lang.String str10 = strList2.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test525");
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
            strList3.add((-2), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test526");
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
            strList3.add((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test527");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        boolean boolean11 = strList2.removeElem("");
        boolean boolean13 = strList2.removeElem("");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test528");
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
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-6), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test529");
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
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test530");
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
        boolean boolean21 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strList3.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test531");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        java.lang.String str12 = strList2.remove((int) (short) 0);
        boolean boolean14 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList2.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test532");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add((int) (short) 0, "hi!");
        boolean boolean12 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test533");
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
            strList3.add((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test534");
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
        boolean boolean21 = strList3.removeElem("hi!");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test535");
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
            java.lang.String str22 = strList3.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test536");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        boolean boolean6 = strList0.removeElem("");
        boolean boolean8 = strList0.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList0.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test537");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("hi!");
        java.lang.String str15 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test538");
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
        boolean boolean25 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test539");
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
            strList3.add(8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test540");
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
            strList3.add(8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test541");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList2.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test542");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        java.lang.String str8 = strList3.remove((int) (short) 0);
        boolean boolean10 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test543");
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
        boolean boolean30 = strList3.removeElem("");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test544");
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
        boolean boolean28 = strList3.removeElem("hi!");
        boolean boolean30 = strList3.removeElem("hi!");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test545");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test546");
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
            java.lang.String str28 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test547");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        boolean boolean6 = strList0.removeElem("");
        boolean boolean8 = strList0.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test548");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        boolean boolean6 = strList0.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((-100), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test549");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        java.lang.String str8 = strList3.remove(0);
        boolean boolean10 = strList3.removeElem("hi!");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test550");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        java.lang.String str20 = strList3.remove(2);
        boolean boolean22 = strList3.removeElem("");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test551");
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
            java.lang.String str25 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test552");
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
        boolean boolean25 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = strList3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test553");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        boolean boolean12 = strList2.removeElem("hi!");
        boolean boolean14 = strList2.removeElem("");
        strList2.add((int) (short) 0, "hi!");
        boolean boolean19 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strList2.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test554");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test555");
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
        boolean boolean31 = strList3.removeElem("hi!");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test556");
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
            java.lang.String str19 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test557");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("hi!");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test558");
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
            java.lang.String str23 = strList3.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test559");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove((int) (short) 0);
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        boolean boolean21 = strList3.removeElem("");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test560");
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
        boolean boolean28 = strList3.removeElem("");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test561");
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
            java.lang.String str21 = strList3.remove(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test562");
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
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test563");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        java.lang.String str7 = strList2.remove((int) (short) 0);
        boolean boolean9 = strList2.removeElem("hi!");
        strList2.add((int) (short) 0, "");
        boolean boolean14 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList2.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test564");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("hi!");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("");
        boolean boolean14 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test565");
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
            java.lang.String str16 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test566");
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
            java.lang.String str23 = strList3.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test567");
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
        boolean boolean29 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-6), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test568");
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
        boolean boolean23 = strList3.removeElem("hi!");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test569");
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
        java.lang.String str31 = strList3.remove(1);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test570");
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
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test571");
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
        boolean boolean21 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test572");
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
            java.lang.String str21 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test573");
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
        boolean boolean34 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test574");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test575");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test576");
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
        strList3.add((int) (short) 0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-100), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test577");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "hi!");
        boolean boolean10 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test578");
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
            java.lang.String str19 = strList3.remove((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test579");
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
        boolean boolean27 = strList3.removeElem("");
        strList3.add(0, "");
        strList3.add(0, "hi!");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test580");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        boolean boolean11 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test581");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = strList3.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test582");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
        strList3.add((int) (short) 1, "hi!");
        boolean boolean16 = strList3.removeElem("");
        boolean boolean18 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test583");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
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
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test584");
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
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test585");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        boolean boolean16 = strList3.removeElem("hi!");
        boolean boolean18 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strList3.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test586");
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
        strList3.add((int) (byte) 0, "");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test587");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        strList2.add((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList2.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test588");
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
            strList3.add((-6), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test589");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        boolean boolean11 = strList2.removeElem("hi!");
        boolean boolean13 = strList2.removeElem("");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test590");
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
        boolean boolean22 = strList3.removeElem("hi!");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test591");
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
            strList3.add((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test592");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        java.lang.String str10 = strList2.remove((int) (short) 0);
        boolean boolean12 = strList2.removeElem("hi!");
        strList2.add((int) (byte) 0, "hi!");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test593");
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
        java.lang.String str26 = strList3.remove(0);
        boolean boolean28 = strList3.removeElem("hi!");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test594");
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
            java.lang.String str20 = strList3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test595");
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
        strList3.add(0, "");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test596");
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
            java.lang.String str21 = strList3.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test597");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strList3.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test598");
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
            strList3.add((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test599");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test600");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        boolean boolean11 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test601");
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
        boolean boolean33 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test602");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("");
        boolean boolean6 = strList0.removeElem("");
        boolean boolean8 = strList0.removeElem("hi!");
        boolean boolean10 = strList0.removeElem("hi!");
        boolean boolean12 = strList0.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test603");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "");
        boolean boolean10 = strList2.removeElem("");
        boolean boolean12 = strList2.removeElem("");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test604");
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
        boolean boolean26 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test605");
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
            strList3.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test606");
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
        boolean boolean24 = strList3.removeElem("");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test607");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        strList2.add(0, "");
        boolean boolean10 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strList2.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test608");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        boolean boolean11 = strList2.removeElem("");
        strList2.add(0, "");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test609");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        boolean boolean11 = strList2.removeElem("");
        boolean boolean13 = strList2.removeElem("hi!");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test610");
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
            strList3.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test611");
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
        boolean boolean27 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test612");
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
            strList3.add((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test613");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        java.lang.String str12 = strList3.remove((int) (short) 0);
        strList3.add(0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test614");
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
        boolean boolean27 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = strList3.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test615");
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
        boolean boolean26 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-100), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test616");
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
        java.lang.String str23 = strList3.remove((int) (short) 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test617");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test618");
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
        strList3.add(0, "");
        java.lang.String str28 = strList3.remove((int) (short) 1);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test619");
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
            java.lang.String str26 = strList3.remove((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test620");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test621");
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
        boolean boolean29 = strList3.removeElem("hi!");
        strList3.add((int) (short) 1, "hi!");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test622");
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
        boolean boolean25 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = strList3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test623");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        boolean boolean11 = strList2.removeElem("hi!");
        boolean boolean13 = strList2.removeElem("hi!");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test624");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test625");
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
            java.lang.String str30 = strList3.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test626");
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
        boolean boolean22 = strList3.removeElem("");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test627");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        java.lang.String str7 = strList2.remove((int) (short) 0);
        boolean boolean9 = strList2.removeElem("hi!");
        strList2.add((int) (short) 0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList2.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test628");
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
            java.lang.String str22 = strList3.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test629");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        boolean boolean11 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strList2.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test630");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        boolean boolean12 = strList3.removeElem("hi!");
        boolean boolean14 = strList3.removeElem("");
        strList3.add((int) (short) 1, "");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test631");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        boolean boolean14 = strList3.removeElem("hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        boolean boolean18 = strList3.removeElem("hi!");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test632");
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
        java.lang.String str22 = strList3.remove((int) (byte) 1);
        boolean boolean24 = strList3.removeElem("");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test633");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        boolean boolean17 = strList3.removeElem("");
        boolean boolean19 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test634");
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
        boolean boolean27 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test635");
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
            java.lang.String str19 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test636");
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
        boolean boolean25 = strList3.removeElem("hi!");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test637");
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
        strList3.add(0, "hi!");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test638");
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
        strList3.add((int) (byte) 1, "");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test639");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        strList3.add(0, "hi!");
        java.lang.String str20 = strList3.remove(2);
        boolean boolean22 = strList3.removeElem("hi!");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test640");
        DataStructures.commonscollections.TreeList<java.lang.String> strList0 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean2 = strList0.removeElem("hi!");
        boolean boolean4 = strList0.removeElem("hi!");
        boolean boolean6 = strList0.removeElem("hi!");
        boolean boolean8 = strList0.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test641");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test642");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test643");
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
        strList3.add(0, "");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test644");
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
            strList3.add(4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test645");
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
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-4), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test646");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        boolean boolean5 = strList2.removeElem("hi!");
        strList2.add((int) (short) 1, "");
        java.lang.String str10 = strList2.remove((int) (short) 0);
        boolean boolean12 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test647");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList2.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test648");
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
            strList3.add((-5), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test649");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean16 = strList3.removeElem("hi!");
        boolean boolean18 = strList3.removeElem("");
        boolean boolean20 = strList3.removeElem("hi!");
        boolean boolean22 = strList3.removeElem("");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test650");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("");
        java.lang.String str12 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList3.remove((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test651");
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
        java.lang.String str24 = strList3.remove(3);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test652");
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
        java.lang.String str25 = strList3.remove(0);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test653");
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
            java.lang.String str18 = strList3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test654");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        boolean boolean9 = strList2.removeElem("hi!");
        boolean boolean11 = strList2.removeElem("");
        boolean boolean13 = strList2.removeElem("hi!");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test655");
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
        boolean boolean28 = strList3.removeElem("");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test656");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        java.lang.String str8 = strList3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test657");
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
        boolean boolean27 = strList3.removeElem("hi!");
        boolean boolean29 = strList3.removeElem("hi!");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test658");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        strList2.add((int) (byte) 0, "");
        boolean boolean17 = strList2.removeElem("");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test659");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("");
        boolean boolean13 = strList3.removeElem("");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test660");
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
        boolean boolean27 = strList3.removeElem("hi!");
        boolean boolean29 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test661");
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
        boolean boolean27 = strList3.removeElem("");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test662");
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
        boolean boolean23 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test663");
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
            java.lang.String str17 = strList3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test664");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test665");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        boolean boolean12 = strList2.removeElem("hi!");
        boolean boolean14 = strList2.removeElem("");
        strList2.add((int) (short) 0, "hi!");
        boolean boolean19 = strList2.removeElem("hi!");
        boolean boolean21 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test666");
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
        boolean boolean25 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test667");
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
            strList3.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test668");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        boolean boolean14 = strList2.removeElem("hi!");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test669");
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
        boolean boolean22 = strList3.removeElem("hi!");
        boolean boolean24 = strList3.removeElem("hi!");
        boolean boolean26 = strList3.removeElem("");
        boolean boolean28 = strList3.removeElem("");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test670");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        strList3.add(0, "hi!");
        boolean boolean16 = strList3.removeElem("");
        boolean boolean18 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-6), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test671");
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
        boolean boolean26 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test672");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add(1, "");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("hi!");
        boolean boolean21 = strList3.removeElem("hi!");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test673");
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
        strList3.add((int) (byte) 1, "hi!");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test674");
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
        boolean boolean31 = strList3.removeElem("hi!");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test675");
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
        boolean boolean27 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = strList3.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test676");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = strList2.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test677");
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
        strList3.add(2, "hi!");
        java.lang.String str26 = strList3.remove(0);
        boolean boolean28 = strList3.removeElem("");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test678");
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
        boolean boolean21 = strList3.removeElem("");
        boolean boolean23 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = strList3.remove((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test679");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
        strList3.add((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test680");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        strList3.add(0, "");
        boolean boolean11 = strList3.removeElem("hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        boolean boolean15 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test681");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("hi!");
        strList3.add((int) (byte) 0, "");
        boolean boolean17 = strList3.removeElem("hi!");
        strList3.add(1, "hi!");
        strList3.add(0, "");
        boolean boolean25 = strList3.removeElem("hi!");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test682");
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
            strList3.add((-9), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-9, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test683");
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
            java.lang.String str23 = strList3.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test684");
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
        boolean boolean22 = strList3.removeElem("hi!");
        boolean boolean24 = strList3.removeElem("hi!");
        boolean boolean26 = strList3.removeElem("");
        strList3.add(0, "hi!");
        boolean boolean31 = strList3.removeElem("hi!");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test685");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove(0);
        boolean boolean7 = strList2.removeElem("hi!");
        strList2.add(0, "hi!");
        boolean boolean12 = strList2.removeElem("hi!");
        boolean boolean14 = strList2.removeElem("");
        strList2.add((int) (short) 0, "hi!");
        boolean boolean19 = strList2.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test686");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        boolean boolean10 = strList3.removeElem("hi!");
        java.lang.String str12 = strList3.remove(0);
        boolean boolean14 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strList3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test687");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        strList3.add(0, "");
        boolean boolean15 = strList3.removeElem("hi!");
        boolean boolean17 = strList3.removeElem("hi!");
        boolean boolean19 = strList3.removeElem("hi!");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test688");
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
            strList3.add(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test689");
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
        strList3.add(0, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test690");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList2 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = strList2.remove((int) (short) 0);
        boolean boolean7 = strList2.removeElem("");
        boolean boolean9 = strList2.removeElem("");
        boolean boolean11 = strList2.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList2.add(4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test691");
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
        boolean boolean30 = strList3.removeElem("hi!");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test692");
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
        boolean boolean22 = strList3.removeElem("hi!");
        boolean boolean24 = strList3.removeElem("hi!");
        boolean boolean26 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList3.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test693");
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
        boolean boolean28 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test694");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        boolean boolean14 = strList3.removeElem("");
        boolean boolean16 = strList3.removeElem("hi!");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test695");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str6 = strList3.remove(1);
        strList3.add(1, "hi!");
        strList3.add(2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-6), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test696");
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
        java.lang.String str22 = strList3.remove((int) (byte) 1);
        boolean boolean24 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:32, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test697");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("hi!");
        boolean boolean8 = strList3.removeElem("");
        strList3.add((int) (short) 0, "hi!");
        boolean boolean13 = strList3.removeElem("hi!");
        boolean boolean15 = strList3.removeElem("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = strList3.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test698");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.String> strList3 = new DataStructures.commonscollections.TreeList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean6 = strList3.removeElem("");
        boolean boolean8 = strList3.removeElem("");
        java.lang.String str10 = strList3.remove((int) (short) 0);
        boolean boolean12 = strList3.removeElem("");
        strList3.add((int) (byte) 1, "hi!");
        boolean boolean17 = strList3.removeElem("");
        boolean boolean19 = strList3.removeElem("");
        java.lang.String str21 = strList3.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add(9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:9, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test699");
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
        strList3.add((int) (byte) 0, "hi!");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test700");
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
            java.lang.String str17 = strList3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test701");
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
        boolean boolean22 = strList3.removeElem("hi!");
        boolean boolean24 = strList3.removeElem("hi!");
        boolean boolean26 = strList3.removeElem("");
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((-2), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }
}

