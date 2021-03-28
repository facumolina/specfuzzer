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
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = charSequenceList7.remove((java.lang.Object) (-4));
        int int11 = charSequenceList7.indexOf((java.lang.Object) (-1.0f));
        charSequenceList7.clear();
        boolean boolean13 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList14.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.remove((java.lang.Object) (-4));
        charSequenceList17.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean23 = charSequenceList14.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean25 = charSequenceList14.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        boolean boolean35 = charSequenceList32.add((java.lang.CharSequence) "hi!");
        boolean boolean36 = charSequenceList26.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList26.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        int int41 = charSequenceList38.size();
        boolean boolean42 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        boolean boolean43 = charSequenceList14.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.remove((java.lang.Object) (-4));
        charSequenceList44.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int50 = charSequenceList44.getSizeField();
        int int51 = charSequenceList44.size();
        boolean boolean52 = charSequenceList26.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int53 = charSequenceList26.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList54 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean55 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence57 = charSequenceList7.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test502");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean18 = charSequenceList12.removeElem((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceList12.add((java.lang.CharSequence) "");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test503");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList0.getSizeField();
        charSequenceList0.clear();
        boolean boolean28 = charSequenceList0.add((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList0.add((-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test504");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.CharSequence charSequence7 = charSequenceList3.set(0, (java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList8 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean10 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        boolean boolean17 = charSequenceList14.add((java.lang.CharSequence) "hi!");
        boolean boolean18 = charSequenceList8.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        int int19 = charSequenceList3.indexOf((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean22 = charSequenceList20.remove((java.lang.Object) (-4));
        charSequenceList20.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean27 = charSequenceList20.removeElem((java.lang.CharSequence) "");
        boolean boolean29 = charSequenceList20.remove((java.lang.Object) 0);
        charSequenceList20.clear();
        boolean boolean31 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        int int32 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList36 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        charSequenceList36.clear();
        int int39 = charSequenceList36.size();
        int int40 = charSequenceList3.indexOf((java.lang.Object) int39);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test505");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean14 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList5.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int16 = charSequenceList5.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        boolean boolean21 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean23 = charSequenceList1.remove((java.lang.Object) charSequenceList17);
        boolean boolean25 = charSequenceList17.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.remove((java.lang.Object) (-4));
        charSequenceList39.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int45 = charSequenceList39.getSizeField();
        charSequenceList39.clear();
        boolean boolean47 = charSequenceList37.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean48 = charSequenceList26.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean49 = charSequenceList17.remove((java.lang.Object) charSequenceList39);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList51 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean53 = charSequenceList51.remove((java.lang.Object) (-4));
        int int55 = charSequenceList51.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean58 = charSequenceList56.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        boolean boolean60 = charSequenceList57.removeElem((java.lang.CharSequence) "hi!");
        int int61 = charSequenceList51.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList62 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean64 = charSequenceList62.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList65 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean67 = charSequenceList65.remove((java.lang.Object) (-4));
        charSequenceList65.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean72 = charSequenceList65.removeElem((java.lang.CharSequence) "");
        boolean boolean74 = charSequenceList65.remove((java.lang.Object) 0);
        boolean boolean76 = charSequenceList65.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean77 = charSequenceList62.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65);
        boolean boolean79 = charSequenceList62.add((java.lang.CharSequence) "hi!");
        boolean boolean80 = charSequenceList51.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = charSequenceList17.addAll(100, (java.util.Collection<java.lang.CharSequence>) charSequenceList51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test506");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = charSequenceList7.remove((java.lang.Object) (-4));
        int int11 = charSequenceList7.indexOf((java.lang.Object) (-1.0f));
        charSequenceList7.clear();
        boolean boolean13 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList14.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.remove((java.lang.Object) (-4));
        charSequenceList17.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean23 = charSequenceList14.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean25 = charSequenceList14.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        boolean boolean35 = charSequenceList32.add((java.lang.CharSequence) "hi!");
        boolean boolean36 = charSequenceList26.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList26.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        int int41 = charSequenceList38.size();
        boolean boolean42 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        boolean boolean43 = charSequenceList14.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.remove((java.lang.Object) (-4));
        charSequenceList44.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int50 = charSequenceList44.getSizeField();
        int int51 = charSequenceList44.size();
        boolean boolean52 = charSequenceList26.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int53 = charSequenceList26.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList54 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean55 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence57 = charSequenceList26.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test507");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.CharSequence charSequence7 = charSequenceList3.set(0, (java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList8 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean10 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean14 = charSequenceList8.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean17 = charSequenceList15.remove((java.lang.Object) (-4));
        charSequenceList15.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int21 = charSequenceList15.getSizeField();
        charSequenceList15.clear();
        boolean boolean23 = charSequenceList11.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        boolean boolean24 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList3.add((-10), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test508");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.remove((java.lang.Object) (-4));
        charSequenceList12.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean19 = charSequenceList12.removeElem((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceList0.addAll(2, (java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        charSequenceList12.clear();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test509");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int23 = charSequenceList12.size();
        boolean boolean25 = charSequenceList12.remove((java.lang.Object) 1L);
        boolean boolean26 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        charSequenceList0.clear();
        int int28 = charSequenceList0.getSizeField();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test510");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        int int18 = charSequenceList17.getSizeField();
        boolean boolean20 = charSequenceList17.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean23 = charSequenceList21.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27, charSequenceArray26);
        boolean boolean30 = charSequenceList27.add((java.lang.CharSequence) "hi!");
        boolean boolean31 = charSequenceList21.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        java.lang.CharSequence charSequence33 = charSequenceList21.get(1);
        boolean boolean35 = charSequenceList21.removeElem((java.lang.CharSequence) "");
        boolean boolean36 = charSequenceList17.remove((java.lang.Object) boolean35);
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator37 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList17.replaceAll(charSequenceUnaryOperator37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test511");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        boolean boolean27 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        boolean boolean28 = charSequenceList18.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.add((java.lang.CharSequence) "hi!");
        int int33 = charSequenceList30.size();
        boolean boolean34 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean36 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        boolean boolean47 = charSequenceList44.add((java.lang.CharSequence) "hi!");
        boolean boolean48 = charSequenceList38.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int49 = charSequenceList38.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean52 = charSequenceList50.add((java.lang.CharSequence) "hi!");
        int int53 = charSequenceList50.size();
        boolean boolean54 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        int int56 = charSequenceList55.getSizeField();
        boolean boolean57 = charSequenceList37.remove((java.lang.Object) int56);
        int int58 = charSequenceList30.indexOf((java.lang.Object) charSequenceList37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence60 = charSequenceList37.get(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:3, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test512");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        boolean boolean27 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        boolean boolean28 = charSequenceList18.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.add((java.lang.CharSequence) "hi!");
        int int33 = charSequenceList30.size();
        boolean boolean34 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean36 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean39 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList40 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = charSequenceList40.remove((java.lang.Object) (-4));
        charSequenceList40.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean47 = charSequenceList40.removeElem((java.lang.CharSequence) "");
        boolean boolean49 = charSequenceList40.remove((java.lang.Object) 0);
        boolean boolean51 = charSequenceList40.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean52 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        boolean boolean54 = charSequenceList37.add((java.lang.CharSequence) "hi!");
        boolean boolean55 = charSequenceList30.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList58 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean59 = charSequenceList57.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        boolean boolean61 = charSequenceList58.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList62 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean64 = charSequenceList62.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList68 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68, charSequenceArray67);
        boolean boolean71 = charSequenceList68.add((java.lang.CharSequence) "hi!");
        boolean boolean72 = charSequenceList62.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList68);
        int int73 = charSequenceList62.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList74 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean76 = charSequenceList74.add((java.lang.CharSequence) "hi!");
        int int77 = charSequenceList74.size();
        boolean boolean78 = charSequenceList62.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList74);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList79 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList74);
        boolean boolean80 = charSequenceList58.remove((java.lang.Object) charSequenceList74);
        boolean boolean82 = charSequenceList74.removeElem((java.lang.CharSequence) "hi!");
        charSequenceList74.clear();
        int int85 = charSequenceList74.indexOf((java.lang.Object) (-2));
        int int86 = charSequenceList30.indexOf((java.lang.Object) int85);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test513");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        boolean boolean13 = charSequenceList0.add((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        boolean boolean16 = charSequenceList14.removeElem((java.lang.CharSequence) "");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test514");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        boolean boolean12 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.remove((java.lang.Object) (-4));
        charSequenceList13.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int19 = charSequenceList13.getSizeField();
        charSequenceList13.clear();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        boolean boolean34 = charSequenceList24.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean35 = charSequenceList13.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean36 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        int int37 = charSequenceList26.size();
        int int38 = charSequenceList26.getSizeField();
        int int39 = charSequenceList26.size();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test515");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence charSequence12 = charSequenceList0.get(1);
        boolean boolean14 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence16 = charSequenceList0.remove((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test516");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.add((java.lang.CharSequence) "hi!");
        int int3 = charSequenceList0.size();
        int int4 = charSequenceList0.size();
        charSequenceList0.clear();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test517");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        boolean boolean27 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        boolean boolean28 = charSequenceList18.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.add((java.lang.CharSequence) "hi!");
        int int33 = charSequenceList30.size();
        boolean boolean34 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean36 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean39 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList40 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = charSequenceList40.remove((java.lang.Object) (-4));
        charSequenceList40.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean47 = charSequenceList40.removeElem((java.lang.CharSequence) "");
        boolean boolean49 = charSequenceList40.remove((java.lang.Object) 0);
        boolean boolean51 = charSequenceList40.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean52 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        boolean boolean54 = charSequenceList37.add((java.lang.CharSequence) "hi!");
        boolean boolean55 = charSequenceList30.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        int int56 = charSequenceList30.size();
        charSequenceList30.clear();
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList60 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60, charSequenceArray59);
        boolean boolean63 = charSequenceList60.add((java.lang.CharSequence) "hi!");
        boolean boolean65 = charSequenceList60.add((java.lang.CharSequence) "hi!");
        int int66 = charSequenceList60.size();
        boolean boolean67 = charSequenceList30.remove((java.lang.Object) int66);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection69 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = charSequenceList30.addAll((-6), charSequenceCollection69);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -6, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test518");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        boolean boolean27 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        boolean boolean28 = charSequenceList18.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.add((java.lang.CharSequence) "hi!");
        int int33 = charSequenceList30.size();
        boolean boolean34 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean36 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        boolean boolean47 = charSequenceList44.add((java.lang.CharSequence) "hi!");
        boolean boolean48 = charSequenceList38.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int49 = charSequenceList38.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean52 = charSequenceList50.add((java.lang.CharSequence) "hi!");
        int int53 = charSequenceList50.size();
        boolean boolean54 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        int int56 = charSequenceList55.getSizeField();
        boolean boolean57 = charSequenceList37.remove((java.lang.Object) int56);
        int int58 = charSequenceList30.indexOf((java.lang.Object) charSequenceList37);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList60 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean62 = charSequenceList60.remove((java.lang.Object) (-4));
        charSequenceList60.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int66 = charSequenceList60.getSizeField();
        charSequenceList60.clear();
        boolean boolean69 = charSequenceList60.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean70 = charSequenceList30.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList60);
        boolean boolean72 = charSequenceList30.removeElem((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test519");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int6 = charSequenceList0.getSizeField();
        boolean boolean8 = charSequenceList0.remove((java.lang.Object) (-5));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        int int10 = charSequenceList0.size();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test520");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList0.getSizeField();
        charSequenceList0.clear();
        boolean boolean28 = charSequenceList0.add((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean31 = charSequenceList29.remove((java.lang.Object) (-4));
        charSequenceList29.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean36 = charSequenceList29.removeElem((java.lang.CharSequence) "");
        boolean boolean38 = charSequenceList29.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int41 = charSequenceList29.indexOf((java.lang.Object) (-2));
        boolean boolean42 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int43 = charSequenceList0.getSizeField();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test521");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList0.getSizeField();
        charSequenceList0.clear();
        boolean boolean28 = charSequenceList0.add((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean31 = charSequenceList29.remove((java.lang.Object) (-4));
        charSequenceList29.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean36 = charSequenceList29.removeElem((java.lang.CharSequence) "");
        boolean boolean38 = charSequenceList29.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int41 = charSequenceList29.indexOf((java.lang.Object) (-2));
        boolean boolean42 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int43 = charSequenceList29.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        boolean boolean48 = charSequenceList45.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList49 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean51 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        boolean boolean58 = charSequenceList55.add((java.lang.CharSequence) "hi!");
        boolean boolean59 = charSequenceList49.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList55);
        int int60 = charSequenceList49.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList61 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean63 = charSequenceList61.add((java.lang.CharSequence) "hi!");
        int int64 = charSequenceList61.size();
        boolean boolean65 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList66 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        boolean boolean67 = charSequenceList45.remove((java.lang.Object) charSequenceList61);
        boolean boolean69 = charSequenceList61.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList70 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean72 = charSequenceList70.remove((java.lang.Object) (-4));
        charSequenceList70.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int76 = charSequenceList70.getSizeField();
        charSequenceList70.clear();
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList81 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList83 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean85 = charSequenceList83.remove((java.lang.Object) (-4));
        charSequenceList83.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int89 = charSequenceList83.getSizeField();
        charSequenceList83.clear();
        boolean boolean91 = charSequenceList81.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList83);
        boolean boolean92 = charSequenceList70.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList83);
        boolean boolean93 = charSequenceList61.remove((java.lang.Object) charSequenceList83);
        boolean boolean94 = charSequenceList29.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        charSequenceList29.clear();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList29.add((-6), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test522");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean14 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList5.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int16 = charSequenceList5.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        boolean boolean21 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean23 = charSequenceList1.remove((java.lang.Object) charSequenceList17);
        boolean boolean25 = charSequenceList17.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.remove((java.lang.Object) (-4));
        charSequenceList39.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int45 = charSequenceList39.getSizeField();
        charSequenceList39.clear();
        boolean boolean47 = charSequenceList37.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean48 = charSequenceList26.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean49 = charSequenceList17.remove((java.lang.Object) charSequenceList39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence51 = charSequenceList17.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test523");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.add((java.lang.CharSequence) "hi!");
        int int3 = charSequenceList0.size();
        int int4 = charSequenceList0.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList8 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        charSequenceList8.clear();
        java.lang.CharSequence charSequence11 = null;
        boolean boolean12 = charSequenceList8.add(charSequence11);
        java.util.List<java.lang.CharSequence> charSequenceList15 = charSequenceList8.subList((int) (byte) 0, 1);
        boolean boolean16 = charSequenceList0.remove((java.lang.Object) charSequenceList8);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.remove((java.lang.Object) (-4));
        charSequenceList18.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int24 = charSequenceList18.getSizeField();
        charSequenceList18.clear();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29, charSequenceArray28);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = charSequenceList31.remove((java.lang.Object) (-4));
        charSequenceList31.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int37 = charSequenceList31.getSizeField();
        charSequenceList31.clear();
        boolean boolean39 = charSequenceList29.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        boolean boolean40 = charSequenceList18.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = charSequenceList8.addAll((-3), (java.util.Collection<java.lang.CharSequence>) charSequenceList31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -3, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test524");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean14 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList5.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int16 = charSequenceList5.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        boolean boolean21 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean23 = charSequenceList1.remove((java.lang.Object) charSequenceList17);
        boolean boolean25 = charSequenceList17.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean33 = charSequenceList26.removeElem((java.lang.CharSequence) "");
        boolean boolean35 = charSequenceList26.remove((java.lang.Object) 0);
        boolean boolean37 = charSequenceList26.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean38 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList41 = charSequenceList26.subList(10, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test525");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int23 = charSequenceList12.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        int int27 = charSequenceList24.size();
        boolean boolean28 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        boolean boolean29 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.remove((java.lang.Object) (-4));
        charSequenceList30.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int36 = charSequenceList30.getSizeField();
        int int37 = charSequenceList30.size();
        boolean boolean38 = charSequenceList12.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        java.lang.Object obj39 = null;
        boolean boolean40 = charSequenceList30.remove(obj39);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean43 = charSequenceList30.add((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence46 = charSequenceList30.set(0, (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        boolean boolean53 = charSequenceList50.add((java.lang.CharSequence) "hi!");
        boolean boolean55 = charSequenceList50.add((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = charSequenceList30.addAll(100, (java.util.Collection<java.lang.CharSequence>) charSequenceList56);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test526");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList0.getSizeField();
        charSequenceList0.clear();
        boolean boolean28 = charSequenceList0.add((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean31 = charSequenceList29.remove((java.lang.Object) (-4));
        charSequenceList29.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean36 = charSequenceList29.removeElem((java.lang.CharSequence) "");
        boolean boolean38 = charSequenceList29.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int41 = charSequenceList29.indexOf((java.lang.Object) (-2));
        boolean boolean42 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int43 = charSequenceList29.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        boolean boolean48 = charSequenceList45.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList49 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean51 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        boolean boolean58 = charSequenceList55.add((java.lang.CharSequence) "hi!");
        boolean boolean59 = charSequenceList49.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList55);
        int int60 = charSequenceList49.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList61 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean63 = charSequenceList61.add((java.lang.CharSequence) "hi!");
        int int64 = charSequenceList61.size();
        boolean boolean65 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList66 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        boolean boolean67 = charSequenceList45.remove((java.lang.Object) charSequenceList61);
        boolean boolean69 = charSequenceList61.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList70 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean72 = charSequenceList70.remove((java.lang.Object) (-4));
        charSequenceList70.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int76 = charSequenceList70.getSizeField();
        charSequenceList70.clear();
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList81 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList83 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean85 = charSequenceList83.remove((java.lang.Object) (-4));
        charSequenceList83.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int89 = charSequenceList83.getSizeField();
        charSequenceList83.clear();
        boolean boolean91 = charSequenceList81.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList83);
        boolean boolean92 = charSequenceList70.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList83);
        boolean boolean93 = charSequenceList61.remove((java.lang.Object) charSequenceList83);
        boolean boolean94 = charSequenceList29.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        boolean boolean96 = charSequenceList61.removeElem((java.lang.CharSequence) "");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test527");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean14 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList5.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int16 = charSequenceList5.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        boolean boolean21 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean23 = charSequenceList1.remove((java.lang.Object) charSequenceList17);
        charSequenceList17.clear();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean27 = charSequenceList25.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean30 = charSequenceList28.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        boolean boolean31 = charSequenceList25.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean32 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList17.add((int) (short) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test528");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean14 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList5.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int16 = charSequenceList5.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        boolean boolean21 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean23 = charSequenceList1.remove((java.lang.Object) charSequenceList17);
        boolean boolean25 = charSequenceList17.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.remove((java.lang.Object) (-4));
        charSequenceList39.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int45 = charSequenceList39.getSizeField();
        charSequenceList39.clear();
        boolean boolean47 = charSequenceList37.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean48 = charSequenceList26.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean49 = charSequenceList17.remove((java.lang.Object) charSequenceList39);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        charSequenceList50.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence53 = charSequenceList50.get(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test529");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        boolean boolean6 = charSequenceList0.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        java.lang.CharSequence charSequence8 = null;
        boolean boolean9 = charSequenceList0.add(charSequence8);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test530");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean6 = charSequenceList1.removeElem((java.lang.CharSequence) "");
        boolean boolean8 = charSequenceList1.removeElem((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = charSequenceList1.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test531");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        int int11 = charSequenceList0.indexOf((java.lang.Object) (-4));
        boolean boolean13 = charSequenceList0.remove((java.lang.Object) 2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList14.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        boolean boolean23 = charSequenceList20.add((java.lang.CharSequence) "hi!");
        boolean boolean24 = charSequenceList14.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean33 = charSequenceList26.removeElem((java.lang.CharSequence) "");
        boolean boolean34 = charSequenceList14.addAll(2, (java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean36 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator37 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList0.replaceAll(charSequenceUnaryOperator37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test532");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList2 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        boolean boolean5 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        int int8 = charSequenceList2.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean11 = charSequenceList9.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.remove((java.lang.Object) (-4));
        charSequenceList12.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean18 = charSequenceList9.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean20 = charSequenceList9.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean23 = charSequenceList21.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27, charSequenceArray26);
        boolean boolean30 = charSequenceList27.add((java.lang.CharSequence) "hi!");
        boolean boolean31 = charSequenceList21.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        int int32 = charSequenceList21.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean35 = charSequenceList33.add((java.lang.CharSequence) "hi!");
        int int36 = charSequenceList33.size();
        boolean boolean37 = charSequenceList21.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        boolean boolean38 = charSequenceList9.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.remove((java.lang.Object) (-4));
        charSequenceList39.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int45 = charSequenceList39.getSizeField();
        int int46 = charSequenceList39.size();
        boolean boolean47 = charSequenceList21.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean48 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList49 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean51 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        boolean boolean58 = charSequenceList55.add((java.lang.CharSequence) "hi!");
        boolean boolean59 = charSequenceList49.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList55);
        int int60 = charSequenceList49.size();
        boolean boolean62 = charSequenceList49.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>> charSequenceCollectionList63 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>>();
        boolean boolean64 = charSequenceList49.remove((java.lang.Object) charSequenceCollectionList63);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList67 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList67, charSequenceArray66);
        boolean boolean70 = charSequenceList67.add((java.lang.CharSequence) "hi!");
        boolean boolean72 = charSequenceList67.add((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList73 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList67);
        int int74 = charSequenceList49.indexOf((java.lang.Object) charSequenceList73);
        boolean boolean75 = charSequenceList21.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49);
        boolean boolean77 = charSequenceList21.add((java.lang.CharSequence) "");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test533");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        boolean boolean12 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.remove((java.lang.Object) (-4));
        charSequenceList13.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int19 = charSequenceList13.getSizeField();
        charSequenceList13.clear();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        boolean boolean34 = charSequenceList24.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean35 = charSequenceList13.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean36 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        charSequenceList41.clear();
        int int44 = charSequenceList41.size();
        boolean boolean45 = charSequenceList37.remove((java.lang.Object) charSequenceList41);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList46.add((int) '4', (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test534");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        boolean boolean12 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.remove((java.lang.Object) (-4));
        charSequenceList13.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int19 = charSequenceList13.getSizeField();
        charSequenceList13.clear();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        boolean boolean34 = charSequenceList24.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean35 = charSequenceList13.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean36 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        charSequenceList41.clear();
        int int44 = charSequenceList41.size();
        boolean boolean45 = charSequenceList37.remove((java.lang.Object) charSequenceList41);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList47 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean49 = charSequenceList47.remove((java.lang.Object) (-4));
        charSequenceList47.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean54 = charSequenceList47.removeElem((java.lang.CharSequence) "");
        boolean boolean56 = charSequenceList47.remove((java.lang.Object) 0);
        charSequenceList47.clear();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList58 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList59 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean60 = charSequenceList58.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList64 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64, charSequenceArray63);
        boolean boolean67 = charSequenceList64.add((java.lang.CharSequence) "hi!");
        boolean boolean68 = charSequenceList58.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        boolean boolean69 = charSequenceList47.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        boolean boolean70 = charSequenceList41.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList47);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test535");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean6 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        boolean boolean13 = charSequenceList10.add((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceList4.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        boolean boolean15 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        int int17 = charSequenceList4.indexOf((java.lang.Object) 0.0d);
        int int18 = charSequenceList4.getSizeField();
        java.lang.CharSequence charSequence20 = charSequenceList4.get(0);
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList4.replaceAll(charSequenceUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test536");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean12 = charSequenceList0.remove((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        boolean boolean23 = charSequenceList13.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        charSequenceList19.clear();
        int int25 = charSequenceList0.indexOf((java.lang.Object) charSequenceList19);
        int int26 = charSequenceList19.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList30 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30, charSequenceArray29);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean34 = charSequenceList32.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        boolean boolean41 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        boolean boolean42 = charSequenceList32.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        boolean boolean43 = charSequenceList30.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int45 = charSequenceList32.indexOf((java.lang.Object) 0.0d);
        boolean boolean46 = charSequenceList19.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList49 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49, charSequenceArray48);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList51 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean53 = charSequenceList51.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57, charSequenceArray56);
        boolean boolean60 = charSequenceList57.add((java.lang.CharSequence) "hi!");
        boolean boolean61 = charSequenceList51.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        boolean boolean62 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        int int63 = charSequenceList51.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList64 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean66 = charSequenceList64.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList67 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList68 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean69 = charSequenceList67.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68);
        boolean boolean71 = charSequenceList68.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean72 = charSequenceList64.remove((java.lang.Object) boolean71);
        int int73 = charSequenceList64.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList74 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList75 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean76 = charSequenceList74.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList80 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80, charSequenceArray79);
        boolean boolean83 = charSequenceList80.add((java.lang.CharSequence) "hi!");
        boolean boolean84 = charSequenceList74.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList80);
        int int85 = charSequenceList74.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList86 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean88 = charSequenceList86.add((java.lang.CharSequence) "hi!");
        int int89 = charSequenceList86.size();
        boolean boolean90 = charSequenceList74.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList86);
        int int92 = charSequenceList86.indexOf((java.lang.Object) 10L);
        charSequenceList86.clear();
        boolean boolean94 = charSequenceList64.remove((java.lang.Object) charSequenceList86);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList95 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList86);
        boolean boolean96 = charSequenceList51.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList86);
        boolean boolean97 = charSequenceList32.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList86);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test537");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        int int18 = charSequenceList17.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test538");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int23 = charSequenceList12.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        int int27 = charSequenceList24.size();
        boolean boolean28 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        boolean boolean29 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.remove((java.lang.Object) (-4));
        charSequenceList30.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int36 = charSequenceList30.getSizeField();
        int int37 = charSequenceList30.size();
        boolean boolean38 = charSequenceList12.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        java.lang.Object obj39 = null;
        boolean boolean40 = charSequenceList30.remove(obj39);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean43 = charSequenceList30.removeElem((java.lang.CharSequence) "hi!");
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator44 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList30.replaceAll(charSequenceUnaryOperator44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test539");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        boolean boolean12 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.remove((java.lang.Object) (-4));
        charSequenceList13.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int19 = charSequenceList13.getSizeField();
        charSequenceList13.clear();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        boolean boolean34 = charSequenceList24.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean35 = charSequenceList13.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean36 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        boolean boolean47 = charSequenceList44.add((java.lang.CharSequence) "hi!");
        boolean boolean48 = charSequenceList38.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean52 = charSequenceList50.remove((java.lang.Object) (-4));
        charSequenceList50.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean57 = charSequenceList50.removeElem((java.lang.CharSequence) "");
        boolean boolean58 = charSequenceList38.addAll(2, (java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList59 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        boolean boolean61 = charSequenceList59.removeElem((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = charSequenceList26.addAll(8, (java.util.Collection<java.lang.CharSequence>) charSequenceList59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test540");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = charSequenceList7.remove((java.lang.Object) (-4));
        charSequenceList7.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int13 = charSequenceList7.getSizeField();
        charSequenceList7.clear();
        boolean boolean15 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = charSequenceList16.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.remove((java.lang.Object) (-4));
        charSequenceList19.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean25 = charSequenceList16.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        boolean boolean27 = charSequenceList16.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean30 = charSequenceList28.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList34 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        boolean boolean37 = charSequenceList34.add((java.lang.CharSequence) "hi!");
        boolean boolean38 = charSequenceList28.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        int int39 = charSequenceList28.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList40 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = charSequenceList40.add((java.lang.CharSequence) "hi!");
        int int43 = charSequenceList40.size();
        boolean boolean44 = charSequenceList28.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        boolean boolean45 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean48 = charSequenceList46.remove((java.lang.Object) (-4));
        charSequenceList46.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int52 = charSequenceList46.getSizeField();
        int int53 = charSequenceList46.size();
        boolean boolean54 = charSequenceList28.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        boolean boolean55 = charSequenceList7.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence58 = charSequenceList7.set((-2), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test541");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        boolean boolean13 = charSequenceList0.remove((java.lang.Object) 1L);
        int int14 = charSequenceList0.size();
        charSequenceList0.clear();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean20 = charSequenceList16.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test542");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean12 = charSequenceList0.remove((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        boolean boolean23 = charSequenceList13.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        charSequenceList19.clear();
        int int25 = charSequenceList0.indexOf((java.lang.Object) charSequenceList19);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList29 = charSequenceList26.subList((int) (byte) 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test543");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.remove((java.lang.Object) (-4));
        charSequenceList5.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int11 = charSequenceList5.getSizeField();
        charSequenceList5.clear();
        boolean boolean13 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        int int14 = charSequenceList3.size();
        int int15 = charSequenceList3.size();
        boolean boolean17 = charSequenceList3.removeElem((java.lang.CharSequence) "");
        int int18 = charSequenceList3.size();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test544");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.CharSequence charSequence7 = charSequenceList3.set(0, (java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList8 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean10 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean14 = charSequenceList8.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean17 = charSequenceList15.remove((java.lang.Object) (-4));
        charSequenceList15.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int21 = charSequenceList15.getSizeField();
        charSequenceList15.clear();
        boolean boolean23 = charSequenceList11.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        boolean boolean24 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        boolean boolean35 = charSequenceList32.add((java.lang.CharSequence) "hi!");
        boolean boolean36 = charSequenceList26.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList26.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        int int41 = charSequenceList38.size();
        boolean boolean42 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList43 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean47 = charSequenceList45.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList48 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean50 = charSequenceList48.remove((java.lang.Object) (-4));
        charSequenceList48.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean54 = charSequenceList45.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48);
        boolean boolean56 = charSequenceList45.remove((java.lang.Object) 6);
        boolean boolean58 = charSequenceList45.add((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList59 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        boolean boolean60 = charSequenceList38.addAll(1, (java.util.Collection<java.lang.CharSequence>) charSequenceList59);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList61 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean63 = charSequenceList61.remove((java.lang.Object) (-4));
        int int65 = charSequenceList61.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList66 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList67 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean68 = charSequenceList66.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList67);
        boolean boolean70 = charSequenceList67.removeElem((java.lang.CharSequence) "hi!");
        int int71 = charSequenceList61.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList72 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList73 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean74 = charSequenceList72.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList78 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList78, charSequenceArray77);
        boolean boolean81 = charSequenceList78.add((java.lang.CharSequence) "hi!");
        boolean boolean82 = charSequenceList72.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList78);
        charSequenceList78.clear();
        int int84 = charSequenceList78.size();
        boolean boolean85 = charSequenceList61.remove((java.lang.Object) charSequenceList78);
        int int86 = charSequenceList78.size();
        java.lang.CharSequence[] charSequenceArray88 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList89 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList89, charSequenceArray88);
        boolean boolean92 = charSequenceList89.add((java.lang.CharSequence) "hi!");
        boolean boolean94 = charSequenceList89.add((java.lang.CharSequence) "hi!");
        boolean boolean95 = charSequenceList78.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList89);
        boolean boolean96 = charSequenceList38.remove((java.lang.Object) charSequenceList78);
        boolean boolean97 = charSequenceList11.addAll((int) (byte) 0, (java.util.Collection<java.lang.CharSequence>) charSequenceList38);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test545");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean12 = charSequenceList0.remove((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        boolean boolean23 = charSequenceList13.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        charSequenceList19.clear();
        int int25 = charSequenceList0.indexOf((java.lang.Object) charSequenceList19);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        java.lang.CharSequence charSequence28 = charSequenceList26.remove((int) (short) 1);
        int int29 = charSequenceList26.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        boolean boolean34 = charSequenceList31.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList36 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean37 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        boolean boolean44 = charSequenceList41.add((java.lang.CharSequence) "hi!");
        boolean boolean45 = charSequenceList35.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        int int46 = charSequenceList35.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList47 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean49 = charSequenceList47.add((java.lang.CharSequence) "hi!");
        int int50 = charSequenceList47.size();
        boolean boolean51 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        boolean boolean53 = charSequenceList31.remove((java.lang.Object) charSequenceList47);
        boolean boolean54 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence57 = charSequenceList31.set((-1), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test546");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.remove((java.lang.Object) (-4));
        charSequenceList5.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int11 = charSequenceList5.getSizeField();
        charSequenceList5.clear();
        boolean boolean13 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        int int14 = charSequenceList3.size();
        int int15 = charSequenceList3.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        int int21 = charSequenceList17.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = charSequenceList3.addAll((int) ' ', (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test547");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList0.getSizeField();
        charSequenceList0.clear();
        charSequenceList0.add(0, (java.lang.CharSequence) "hi!");
        int int30 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = charSequenceList31.add((java.lang.CharSequence) "hi!");
        boolean boolean35 = charSequenceList31.add((java.lang.CharSequence) "hi!");
        boolean boolean36 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        int int37 = charSequenceList0.size();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test548");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.remove((java.lang.Object) (-4));
        charSequenceList5.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int11 = charSequenceList5.getSizeField();
        charSequenceList5.clear();
        boolean boolean13 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        int int14 = charSequenceList3.size();
        boolean boolean16 = charSequenceList3.remove((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence18 = charSequenceList3.get(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:7, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test549");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int23 = charSequenceList12.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        int int27 = charSequenceList24.size();
        boolean boolean28 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        boolean boolean29 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.remove((java.lang.Object) (-4));
        charSequenceList30.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int36 = charSequenceList30.getSizeField();
        int int37 = charSequenceList30.size();
        boolean boolean38 = charSequenceList12.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        int int39 = charSequenceList12.getSizeField();
        int int40 = charSequenceList12.getSizeField();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence42 = charSequenceList12.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test550");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        boolean boolean21 = charSequenceList18.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList23 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean24 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean31 = charSequenceList28.add((java.lang.CharSequence) "hi!");
        boolean boolean32 = charSequenceList22.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        int int33 = charSequenceList22.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList34 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean36 = charSequenceList34.add((java.lang.CharSequence) "hi!");
        int int37 = charSequenceList34.size();
        boolean boolean38 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        boolean boolean40 = charSequenceList18.remove((java.lang.Object) charSequenceList34);
        int int41 = charSequenceList18.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList42 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean44 = charSequenceList42.add((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        int int46 = charSequenceList18.indexOf((java.lang.Object) charSequenceList45);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList47 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int48 = charSequenceList0.indexOf((java.lang.Object) charSequenceList18);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test551");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.remove((java.lang.Object) (-4));
        charSequenceList5.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int11 = charSequenceList5.getSizeField();
        charSequenceList5.clear();
        boolean boolean13 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        int int14 = charSequenceList3.size();
        boolean boolean16 = charSequenceList3.remove((java.lang.Object) 10.0d);
        java.lang.Object obj17 = null;
        int int18 = charSequenceList3.indexOf(obj17);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test552");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        boolean boolean27 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        boolean boolean28 = charSequenceList18.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.add((java.lang.CharSequence) "hi!");
        int int33 = charSequenceList30.size();
        boolean boolean34 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean36 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean39 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList40 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = charSequenceList40.remove((java.lang.Object) (-4));
        charSequenceList40.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean47 = charSequenceList40.removeElem((java.lang.CharSequence) "");
        boolean boolean49 = charSequenceList40.remove((java.lang.Object) 0);
        boolean boolean51 = charSequenceList40.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean52 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        boolean boolean54 = charSequenceList37.add((java.lang.CharSequence) "hi!");
        boolean boolean55 = charSequenceList30.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        int int56 = charSequenceList37.size();
        charSequenceList37.clear();
        boolean boolean59 = charSequenceList37.add((java.lang.CharSequence) "");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test553");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean6 = charSequenceList1.removeElem((java.lang.CharSequence) "");
        charSequenceList1.clear();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test554");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = charSequenceList7.remove((java.lang.Object) (-4));
        int int11 = charSequenceList7.indexOf((java.lang.Object) (-1.0f));
        charSequenceList7.clear();
        boolean boolean13 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        int int15 = charSequenceList7.indexOf((java.lang.Object) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        boolean boolean22 = charSequenceList16.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList23 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = charSequenceList23.remove((java.lang.Object) (-4));
        charSequenceList23.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int29 = charSequenceList23.getSizeField();
        charSequenceList23.clear();
        boolean boolean31 = charSequenceList19.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean34 = charSequenceList32.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean37 = charSequenceList35.remove((java.lang.Object) (-4));
        charSequenceList35.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean41 = charSequenceList32.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        boolean boolean43 = charSequenceList32.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        boolean boolean53 = charSequenceList50.add((java.lang.CharSequence) "hi!");
        boolean boolean54 = charSequenceList44.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        int int55 = charSequenceList44.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean58 = charSequenceList56.add((java.lang.CharSequence) "hi!");
        int int59 = charSequenceList56.size();
        boolean boolean60 = charSequenceList44.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56);
        boolean boolean61 = charSequenceList32.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList62 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean64 = charSequenceList62.remove((java.lang.Object) (-4));
        charSequenceList62.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int68 = charSequenceList62.getSizeField();
        int int69 = charSequenceList62.size();
        boolean boolean70 = charSequenceList44.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62);
        boolean boolean71 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int72 = charSequenceList7.indexOf((java.lang.Object) charSequenceList44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence74 = charSequenceList7.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test555");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        boolean boolean12 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.remove((java.lang.Object) (-4));
        charSequenceList13.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int19 = charSequenceList13.getSizeField();
        charSequenceList13.clear();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        boolean boolean34 = charSequenceList24.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean35 = charSequenceList13.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean36 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        charSequenceList41.clear();
        int int44 = charSequenceList41.size();
        boolean boolean45 = charSequenceList37.remove((java.lang.Object) charSequenceList41);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean48 = charSequenceList46.remove((java.lang.Object) (-4));
        charSequenceList46.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int52 = charSequenceList46.getSizeField();
        boolean boolean54 = charSequenceList46.remove((java.lang.Object) (-5));
        boolean boolean56 = charSequenceList46.remove((java.lang.Object) 4);
        boolean boolean58 = charSequenceList46.remove((java.lang.Object) 1.0f);
        boolean boolean59 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test556");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int6 = charSequenceList0.getSizeField();
        boolean boolean8 = charSequenceList0.remove((java.lang.Object) (-5));
        boolean boolean10 = charSequenceList0.remove((java.lang.Object) 4);
        boolean boolean12 = charSequenceList0.add((java.lang.CharSequence) "");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test557");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        charSequenceList0.clear();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        charSequenceList18.clear();
        int int24 = charSequenceList18.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean27 = charSequenceList25.add((java.lang.CharSequence) "hi!");
        int int28 = charSequenceList25.size();
        int int29 = charSequenceList25.size();
        boolean boolean30 = charSequenceList18.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean31 = charSequenceList0.addAll((int) (short) 0, (java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean33 = charSequenceList0.removeElem((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test558");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.remove((java.lang.Object) (-4));
        charSequenceList5.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int11 = charSequenceList5.getSizeField();
        charSequenceList5.clear();
        boolean boolean13 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList14.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        boolean boolean23 = charSequenceList20.add((java.lang.CharSequence) "hi!");
        boolean boolean24 = charSequenceList14.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        boolean boolean26 = charSequenceList14.remove((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean29 = charSequenceList27.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        boolean boolean36 = charSequenceList33.add((java.lang.CharSequence) "hi!");
        boolean boolean37 = charSequenceList27.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        charSequenceList33.clear();
        int int39 = charSequenceList14.indexOf((java.lang.Object) charSequenceList33);
        boolean boolean41 = charSequenceList14.remove((java.lang.Object) ' ');
        boolean boolean42 = charSequenceList5.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test559");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        boolean boolean13 = charSequenceList0.remove((java.lang.Object) 1L);
        int int14 = charSequenceList0.size();
        charSequenceList0.clear();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = charSequenceList0.addAll(0, charSequenceCollection17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test560");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean11 = charSequenceList9.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean18 = charSequenceList15.add((java.lang.CharSequence) "hi!");
        boolean boolean19 = charSequenceList9.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int20 = charSequenceList9.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean23 = charSequenceList21.add((java.lang.CharSequence) "hi!");
        int int24 = charSequenceList21.size();
        boolean boolean25 = charSequenceList9.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        int int27 = charSequenceList21.indexOf((java.lang.Object) 10L);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean30 = charSequenceList28.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList34 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        boolean boolean37 = charSequenceList34.add((java.lang.CharSequence) "hi!");
        boolean boolean38 = charSequenceList28.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        int int39 = charSequenceList28.size();
        boolean boolean41 = charSequenceList28.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>> charSequenceCollectionList42 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>>();
        boolean boolean43 = charSequenceList28.remove((java.lang.Object) charSequenceCollectionList42);
        boolean boolean45 = charSequenceList28.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean46 = charSequenceList21.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        charSequenceList28.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = charSequenceList3.addAll((int) '4', (java.util.Collection<java.lang.CharSequence>) charSequenceList28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test561");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList0.getSizeField();
        charSequenceList0.clear();
        boolean boolean28 = charSequenceList0.add((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean31 = charSequenceList29.remove((java.lang.Object) (-4));
        charSequenceList29.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean36 = charSequenceList29.removeElem((java.lang.CharSequence) "");
        boolean boolean38 = charSequenceList29.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int41 = charSequenceList29.indexOf((java.lang.Object) (-2));
        boolean boolean42 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int43 = charSequenceList29.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        boolean boolean48 = charSequenceList45.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList49 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean51 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        boolean boolean58 = charSequenceList55.add((java.lang.CharSequence) "hi!");
        boolean boolean59 = charSequenceList49.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList55);
        int int60 = charSequenceList49.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList61 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean63 = charSequenceList61.add((java.lang.CharSequence) "hi!");
        int int64 = charSequenceList61.size();
        boolean boolean65 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList66 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        boolean boolean67 = charSequenceList45.remove((java.lang.Object) charSequenceList61);
        boolean boolean69 = charSequenceList61.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList70 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean72 = charSequenceList70.remove((java.lang.Object) (-4));
        charSequenceList70.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int76 = charSequenceList70.getSizeField();
        charSequenceList70.clear();
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList81 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList83 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean85 = charSequenceList83.remove((java.lang.Object) (-4));
        charSequenceList83.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int89 = charSequenceList83.getSizeField();
        charSequenceList83.clear();
        boolean boolean91 = charSequenceList81.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList83);
        boolean boolean92 = charSequenceList70.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList83);
        boolean boolean93 = charSequenceList61.remove((java.lang.Object) charSequenceList83);
        boolean boolean94 = charSequenceList29.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        charSequenceList29.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence97 = charSequenceList29.get((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test562");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean10 = charSequenceList3.removeElem((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceList3.remove((java.lang.Object) 0);
        boolean boolean14 = charSequenceList3.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean17 = charSequenceList0.add((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean23 = charSequenceList21.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        boolean boolean24 = charSequenceList18.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean27 = charSequenceList25.remove((java.lang.Object) (-4));
        int int29 = charSequenceList25.indexOf((java.lang.Object) (-1.0f));
        charSequenceList25.clear();
        boolean boolean31 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean33 = charSequenceList25.add((java.lang.CharSequence) "hi!");
        boolean boolean35 = charSequenceList25.add((java.lang.CharSequence) "hi!");
        boolean boolean36 = charSequenceList0.remove((java.lang.Object) boolean35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList39 = charSequenceList0.subList(100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test563");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList17.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence28 = charSequenceList17.set((int) (byte) -1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test564");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = charSequenceList7.remove((java.lang.Object) (-4));
        int int11 = charSequenceList7.indexOf((java.lang.Object) (-1.0f));
        charSequenceList7.clear();
        boolean boolean13 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList14.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        boolean boolean18 = charSequenceList15.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        boolean boolean28 = charSequenceList25.add((java.lang.CharSequence) "hi!");
        boolean boolean29 = charSequenceList19.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        int int30 = charSequenceList19.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = charSequenceList31.add((java.lang.CharSequence) "hi!");
        int int34 = charSequenceList31.size();
        boolean boolean35 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList36 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        boolean boolean37 = charSequenceList15.remove((java.lang.Object) charSequenceList31);
        int int38 = charSequenceList15.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.remove((java.lang.Object) (-4));
        int int43 = charSequenceList39.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        boolean boolean48 = charSequenceList45.removeElem((java.lang.CharSequence) "hi!");
        int int49 = charSequenceList39.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList51 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean52 = charSequenceList50.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        boolean boolean59 = charSequenceList56.add((java.lang.CharSequence) "hi!");
        boolean boolean60 = charSequenceList50.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList56);
        charSequenceList56.clear();
        int int62 = charSequenceList56.size();
        boolean boolean63 = charSequenceList39.remove((java.lang.Object) charSequenceList56);
        int int64 = charSequenceList39.getSizeField();
        charSequenceList39.clear();
        boolean boolean66 = charSequenceList15.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean68 = charSequenceList15.add((java.lang.CharSequence) "hi!");
        int int69 = charSequenceList7.indexOf((java.lang.Object) charSequenceList15);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList15.add((-7), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-7, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test565");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.CharSequence charSequence7 = charSequenceList3.set(0, (java.lang.CharSequence) "");
        int int8 = charSequenceList3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = charSequenceList3.get((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test566");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean6 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        boolean boolean13 = charSequenceList10.add((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceList4.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        boolean boolean15 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        int int17 = charSequenceList4.indexOf((java.lang.Object) 0.0d);
        int int18 = charSequenceList4.getSizeField();
        java.lang.CharSequence charSequence19 = null;
        boolean boolean20 = charSequenceList4.add(charSequence19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence23 = charSequenceList4.set(10, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test567");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean10 = charSequenceList3.removeElem((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceList3.remove((java.lang.Object) 0);
        boolean boolean14 = charSequenceList3.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        int int16 = charSequenceList3.getSizeField();
        boolean boolean18 = charSequenceList3.add((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test568");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        boolean boolean27 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        boolean boolean28 = charSequenceList18.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.add((java.lang.CharSequence) "hi!");
        int int33 = charSequenceList30.size();
        boolean boolean34 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean36 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean39 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList40 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean42 = charSequenceList40.remove((java.lang.Object) (-4));
        charSequenceList40.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean47 = charSequenceList40.removeElem((java.lang.CharSequence) "");
        boolean boolean49 = charSequenceList40.remove((java.lang.Object) 0);
        boolean boolean51 = charSequenceList40.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean52 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        boolean boolean54 = charSequenceList37.add((java.lang.CharSequence) "hi!");
        boolean boolean55 = charSequenceList30.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean58 = charSequenceList56.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        boolean boolean60 = charSequenceList57.remove((java.lang.Object) true);
        boolean boolean61 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence63 = charSequenceList57.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test569");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        charSequenceList6.clear();
        int int12 = charSequenceList6.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        int int16 = charSequenceList13.size();
        int int17 = charSequenceList13.size();
        boolean boolean18 = charSequenceList6.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        charSequenceList6.clear();
        charSequenceList6.clear();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean23 = charSequenceList21.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        boolean boolean25 = charSequenceList22.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean27 = charSequenceList22.removeElem((java.lang.CharSequence) "");
        boolean boolean28 = charSequenceList6.remove((java.lang.Object) boolean27);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test570");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList17.size();
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean31 = charSequenceList28.add((java.lang.CharSequence) "hi!");
        boolean boolean33 = charSequenceList28.add((java.lang.CharSequence) "hi!");
        boolean boolean34 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList36 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean37 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean41 = charSequenceList35.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList42 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean44 = charSequenceList42.remove((java.lang.Object) (-4));
        int int46 = charSequenceList42.indexOf((java.lang.Object) (-1.0f));
        charSequenceList42.clear();
        boolean boolean48 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        boolean boolean50 = charSequenceList42.add((java.lang.CharSequence) "hi!");
        boolean boolean52 = charSequenceList42.add((java.lang.CharSequence) "hi!");
        boolean boolean53 = charSequenceList17.remove((java.lang.Object) boolean52);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList17.add((-5), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-5, size=3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test571");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        boolean boolean13 = charSequenceList0.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>> charSequenceCollectionList14 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>>();
        boolean boolean15 = charSequenceList0.remove((java.lang.Object) charSequenceCollectionList14);
        boolean boolean17 = charSequenceList0.removeElem((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21, charSequenceArray20);
        java.lang.CharSequence charSequence25 = charSequenceList21.set(0, (java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        boolean boolean35 = charSequenceList32.add((java.lang.CharSequence) "hi!");
        boolean boolean36 = charSequenceList26.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList21.indexOf((java.lang.Object) 0);
        boolean boolean38 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        int int39 = charSequenceList0.getSizeField();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test572");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList2 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        boolean boolean5 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        int int6 = charSequenceList2.getSizeField();
        boolean boolean8 = charSequenceList2.removeElem((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence11 = charSequenceList2.set((int) (short) 100, charSequence10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test573");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        boolean boolean13 = charSequenceList0.add((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList17 = charSequenceList14.subList(10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test574");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence13 = charSequenceList0.set((-6), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test575");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = charSequenceList7.remove((java.lang.Object) (-4));
        int int11 = charSequenceList7.indexOf((java.lang.Object) (-1.0f));
        charSequenceList7.clear();
        boolean boolean13 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList14.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.remove((java.lang.Object) (-4));
        charSequenceList17.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean23 = charSequenceList14.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean25 = charSequenceList14.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        boolean boolean35 = charSequenceList32.add((java.lang.CharSequence) "hi!");
        boolean boolean36 = charSequenceList26.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList26.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        int int41 = charSequenceList38.size();
        boolean boolean42 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        boolean boolean43 = charSequenceList14.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.remove((java.lang.Object) (-4));
        charSequenceList44.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int50 = charSequenceList44.getSizeField();
        int int51 = charSequenceList44.size();
        boolean boolean52 = charSequenceList26.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int53 = charSequenceList26.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList54 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean55 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        int int56 = charSequenceList7.getSizeField();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence58 = charSequenceList7.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test576");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int23 = charSequenceList12.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        int int27 = charSequenceList24.size();
        boolean boolean28 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        boolean boolean29 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList30.remove((java.lang.Object) (-4));
        charSequenceList30.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int36 = charSequenceList30.getSizeField();
        int int37 = charSequenceList30.size();
        boolean boolean38 = charSequenceList12.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        java.lang.Object obj39 = null;
        boolean boolean40 = charSequenceList30.remove(obj39);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList30.add((-8), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test577");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean6 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        boolean boolean13 = charSequenceList10.add((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceList4.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        boolean boolean15 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        int int17 = charSequenceList4.indexOf((java.lang.Object) 0.0d);
        int int18 = charSequenceList4.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean21 = charSequenceList19.removeElem((java.lang.CharSequence) "");
        boolean boolean23 = charSequenceList19.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        int int27 = charSequenceList24.size();
        int int28 = charSequenceList24.size();
        boolean boolean29 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        charSequenceList19.clear();
        boolean boolean32 = charSequenceList19.removeElem((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test578");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        boolean boolean12 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.remove((java.lang.Object) (-4));
        charSequenceList13.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int19 = charSequenceList13.getSizeField();
        charSequenceList13.clear();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        boolean boolean34 = charSequenceList24.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean35 = charSequenceList13.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean36 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean38 = charSequenceList0.removeElem((java.lang.CharSequence) "");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test579");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int23 = charSequenceList12.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        int int27 = charSequenceList24.size();
        boolean boolean28 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        boolean boolean29 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean31 = charSequenceList12.remove((java.lang.Object) 7);
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = charSequenceList12.remove(obj32);
        int int34 = charSequenceList12.getSizeField();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test580");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        charSequenceList6.clear();
        int int12 = charSequenceList6.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        int int16 = charSequenceList13.size();
        int int17 = charSequenceList13.size();
        boolean boolean18 = charSequenceList6.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        charSequenceList6.clear();
        int int20 = charSequenceList6.getSizeField();
        boolean boolean22 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList6.add((-4), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test581");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean14 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList5.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int16 = charSequenceList5.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        boolean boolean21 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean23 = charSequenceList1.remove((java.lang.Object) charSequenceList17);
        boolean boolean25 = charSequenceList17.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.remove((java.lang.Object) (-4));
        charSequenceList26.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int32 = charSequenceList26.getSizeField();
        charSequenceList26.clear();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.remove((java.lang.Object) (-4));
        charSequenceList39.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int45 = charSequenceList39.getSizeField();
        charSequenceList39.clear();
        boolean boolean47 = charSequenceList37.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean48 = charSequenceList26.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean49 = charSequenceList17.remove((java.lang.Object) charSequenceList39);
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator50 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList17.replaceAll(charSequenceUnaryOperator50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test582");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = charSequenceList7.remove((java.lang.Object) (-4));
        int int11 = charSequenceList7.indexOf((java.lang.Object) (-1.0f));
        charSequenceList7.clear();
        boolean boolean13 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList14.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.remove((java.lang.Object) (-4));
        charSequenceList17.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean23 = charSequenceList14.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean25 = charSequenceList14.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean28 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        boolean boolean35 = charSequenceList32.add((java.lang.CharSequence) "hi!");
        boolean boolean36 = charSequenceList26.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList26.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList38.add((java.lang.CharSequence) "hi!");
        int int41 = charSequenceList38.size();
        boolean boolean42 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        boolean boolean43 = charSequenceList14.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean46 = charSequenceList44.remove((java.lang.Object) (-4));
        charSequenceList44.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int50 = charSequenceList44.getSizeField();
        int int51 = charSequenceList44.size();
        boolean boolean52 = charSequenceList26.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int53 = charSequenceList26.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList54 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        boolean boolean55 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean59 = charSequenceList57.remove((java.lang.Object) (-4));
        int int61 = charSequenceList57.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList62 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean64 = charSequenceList62.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        boolean boolean66 = charSequenceList63.removeElem((java.lang.CharSequence) "hi!");
        int int67 = charSequenceList57.indexOf((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = charSequenceList26.addAll((-10), (java.util.Collection<java.lang.CharSequence>) charSequenceList57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test583");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList2 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        boolean boolean5 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        boolean boolean7 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList8 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        boolean boolean19 = charSequenceList16.add((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceList10.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList16);
        int int21 = charSequenceList10.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = charSequenceList8.addAll((int) (byte) -1, (java.util.Collection<java.lang.CharSequence>) charSequenceList22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test584");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList0.getSizeField();
        charSequenceList0.clear();
        boolean boolean28 = charSequenceList0.add((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean31 = charSequenceList29.remove((java.lang.Object) (-4));
        charSequenceList29.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean36 = charSequenceList29.removeElem((java.lang.CharSequence) "");
        boolean boolean38 = charSequenceList29.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int41 = charSequenceList29.indexOf((java.lang.Object) (-2));
        boolean boolean42 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int43 = charSequenceList29.getSizeField();
        int int44 = charSequenceList29.size();
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator45 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList29.replaceAll(charSequenceUnaryOperator45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test585");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.remove((java.lang.Object) (-4));
        int int16 = charSequenceList12.indexOf((java.lang.Object) (-1.0f));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean22 = charSequenceList20.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        boolean boolean23 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        boolean boolean24 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean26 = charSequenceList17.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean27 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean30 = charSequenceList28.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList34 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        boolean boolean37 = charSequenceList34.add((java.lang.CharSequence) "hi!");
        boolean boolean38 = charSequenceList28.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        charSequenceList34.clear();
        int int40 = charSequenceList34.size();
        int int41 = charSequenceList34.size();
        boolean boolean43 = charSequenceList34.removeElem((java.lang.CharSequence) "");
        boolean boolean44 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence47 = charSequenceList34.set(2, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test586");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList2 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean3 = charSequenceList1.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean10 = charSequenceList7.add((java.lang.CharSequence) "hi!");
        boolean boolean11 = charSequenceList1.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        int int12 = charSequenceList1.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        int int16 = charSequenceList13.size();
        boolean boolean17 = charSequenceList1.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        int int19 = charSequenceList18.getSizeField();
        boolean boolean20 = charSequenceList0.remove((java.lang.Object) int19);
        int int21 = charSequenceList0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList24 = charSequenceList0.subList((-5), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test587");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        boolean boolean21 = charSequenceList11.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        charSequenceList17.clear();
        int int23 = charSequenceList17.size();
        boolean boolean24 = charSequenceList0.remove((java.lang.Object) charSequenceList17);
        int int25 = charSequenceList0.getSizeField();
        charSequenceList0.clear();
        int int27 = charSequenceList0.getSizeField();
        int int28 = charSequenceList0.size();
        int int29 = charSequenceList0.size();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test588");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean18 = charSequenceList12.removeElem((java.lang.CharSequence) "");
        int int19 = charSequenceList12.size();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList22 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30, charSequenceArray29);
        boolean boolean33 = charSequenceList30.add((java.lang.CharSequence) "hi!");
        boolean boolean34 = charSequenceList24.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean35 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int36 = charSequenceList24.getSizeField();
        boolean boolean37 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test589");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList23 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        boolean boolean26 = charSequenceList23.add((java.lang.CharSequence) "hi!");
        boolean boolean27 = charSequenceList17.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence charSequence29 = charSequenceList17.get(1);
        boolean boolean30 = charSequenceList12.remove((java.lang.Object) charSequence29);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "hi!", "" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList34 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        charSequenceList34.clear();
        int int37 = charSequenceList34.size();
        boolean boolean39 = charSequenceList34.removeElem((java.lang.CharSequence) "");
        boolean boolean40 = charSequenceList12.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test590");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean7 = charSequenceList4.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceList0.remove((java.lang.Object) boolean7);
        int int9 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        boolean boolean19 = charSequenceList16.add((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceList10.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList16);
        int int21 = charSequenceList10.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean24 = charSequenceList22.add((java.lang.CharSequence) "hi!");
        int int25 = charSequenceList22.size();
        boolean boolean26 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        int int28 = charSequenceList22.indexOf((java.lang.Object) 10L);
        charSequenceList22.clear();
        boolean boolean30 = charSequenceList0.remove((java.lang.Object) charSequenceList22);
        boolean boolean32 = charSequenceList22.removeElem((java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean35 = charSequenceList33.remove((java.lang.Object) (-4));
        charSequenceList33.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean39 = charSequenceList22.remove((java.lang.Object) charSequenceList33);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test591");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int23 = charSequenceList12.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        int int27 = charSequenceList24.size();
        boolean boolean28 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        boolean boolean29 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList32 = charSequenceList12.subList((-8), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -8");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test592");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        boolean boolean6 = charSequenceList0.removeElem((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList10 = charSequenceList7.subList((-5), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test593");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        int int10 = charSequenceList3.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.remove((java.lang.Object) (-4));
        int int16 = charSequenceList12.indexOf((java.lang.Object) (-1.0f));
        charSequenceList12.clear();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean23 = charSequenceList21.remove((java.lang.Object) (-4));
        charSequenceList21.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean28 = charSequenceList21.removeElem((java.lang.CharSequence) "");
        boolean boolean30 = charSequenceList21.remove((java.lang.Object) 0);
        boolean boolean32 = charSequenceList21.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean33 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        boolean boolean35 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>> charSequenceCollectionList36 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>>();
        int int37 = charSequenceList18.indexOf((java.lang.Object) charSequenceCollectionList36);
        int int38 = charSequenceList12.indexOf((java.lang.Object) charSequenceCollectionList36);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.remove((java.lang.Object) (-4));
        charSequenceList39.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int45 = charSequenceList39.getSizeField();
        charSequenceList39.clear();
        boolean boolean47 = charSequenceList12.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        int int48 = charSequenceList11.indexOf((java.lang.Object) charSequenceList12);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test594");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.remove((java.lang.Object) (-4));
        charSequenceList12.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean19 = charSequenceList12.removeElem((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceList0.addAll(2, (java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        java.lang.CharSequence charSequence28 = charSequenceList24.set(0, (java.lang.CharSequence) "");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean31 = charSequenceList29.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        boolean boolean38 = charSequenceList35.add((java.lang.CharSequence) "hi!");
        boolean boolean39 = charSequenceList29.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        int int40 = charSequenceList24.indexOf((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean43 = charSequenceList41.remove((java.lang.Object) (-4));
        charSequenceList41.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean48 = charSequenceList41.removeElem((java.lang.CharSequence) "");
        boolean boolean50 = charSequenceList41.remove((java.lang.Object) 0);
        charSequenceList41.clear();
        boolean boolean52 = charSequenceList24.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        boolean boolean53 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList54 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean56 = charSequenceList54.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList60 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60, charSequenceArray59);
        boolean boolean63 = charSequenceList60.add((java.lang.CharSequence) "hi!");
        boolean boolean64 = charSequenceList54.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList60);
        boolean boolean66 = charSequenceList54.remove((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList67 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList68 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean69 = charSequenceList67.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList73 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73, charSequenceArray72);
        boolean boolean76 = charSequenceList73.add((java.lang.CharSequence) "hi!");
        boolean boolean77 = charSequenceList67.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        charSequenceList73.clear();
        int int79 = charSequenceList54.indexOf((java.lang.Object) charSequenceList73);
        int int80 = charSequenceList73.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList81 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        boolean boolean82 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList83 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        boolean boolean85 = charSequenceList81.removeElem((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence88 = charSequenceList81.set(0, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test595");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean14 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList5.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int16 = charSequenceList5.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        boolean boolean21 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean23 = charSequenceList1.remove((java.lang.Object) charSequenceList17);
        boolean boolean25 = charSequenceList17.removeElem((java.lang.CharSequence) "hi!");
        charSequenceList17.clear();
        int int28 = charSequenceList17.indexOf((java.lang.Object) (-2));
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        boolean boolean34 = charSequenceList31.add((java.lang.CharSequence) "hi!");
        int int35 = charSequenceList31.getSizeField();
        boolean boolean37 = charSequenceList31.removeElem((java.lang.CharSequence) "");
        boolean boolean38 = charSequenceList17.remove((java.lang.Object) charSequenceList31);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test596");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean12 = charSequenceList6.add((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = charSequenceList6.get(2);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean23 = charSequenceList21.remove((java.lang.Object) (-4));
        charSequenceList21.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int27 = charSequenceList21.getSizeField();
        charSequenceList21.clear();
        boolean boolean29 = charSequenceList19.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        int int30 = charSequenceList19.size();
        int int31 = charSequenceList19.size();
        boolean boolean32 = charSequenceList6.addAll((int) (short) 0, (java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        int int33 = charSequenceList6.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList34 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean36 = charSequenceList34.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList40 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40, charSequenceArray39);
        boolean boolean43 = charSequenceList40.add((java.lang.CharSequence) "hi!");
        boolean boolean44 = charSequenceList34.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        int int45 = charSequenceList34.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean48 = charSequenceList46.add((java.lang.CharSequence) "hi!");
        int int49 = charSequenceList46.size();
        boolean boolean50 = charSequenceList34.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        charSequenceList46.clear();
        boolean boolean52 = charSequenceList6.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        boolean boolean54 = charSequenceList46.add((java.lang.CharSequence) "");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test597");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        int int18 = charSequenceList12.indexOf((java.lang.Object) 10L);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        boolean boolean28 = charSequenceList25.add((java.lang.CharSequence) "hi!");
        boolean boolean29 = charSequenceList19.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        int int30 = charSequenceList19.size();
        boolean boolean32 = charSequenceList19.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>> charSequenceCollectionList33 = new DataStructures.commonscollections.TreeList<java.util.AbstractCollection<java.lang.CharSequence>>();
        boolean boolean34 = charSequenceList19.remove((java.lang.Object) charSequenceCollectionList33);
        boolean boolean36 = charSequenceList19.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean37 = charSequenceList12.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence39 = charSequenceList19.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:5, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test598");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceList6.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test599");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        charSequenceList6.clear();
        int int12 = charSequenceList6.size();
        int int13 = charSequenceList6.size();
        int int14 = charSequenceList6.getSizeField();
        boolean boolean16 = charSequenceList6.add((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test600");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.CharSequence charSequence7 = charSequenceList3.set(0, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence9 = charSequenceList3.remove((int) (short) 0);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test601");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.remove((java.lang.Object) (-4));
        charSequenceList12.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean19 = charSequenceList12.removeElem((java.lang.CharSequence) "");
        boolean boolean20 = charSequenceList0.addAll(2, (java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean23 = charSequenceList21.removeElem((java.lang.CharSequence) "");
        charSequenceList21.clear();
        boolean boolean26 = charSequenceList21.removeElem((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test602");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        boolean boolean11 = charSequenceList0.removeElem((java.lang.CharSequence) "hi!");
        int int12 = charSequenceList0.size();
        java.lang.CharSequence charSequence13 = null;
        boolean boolean14 = charSequenceList0.removeElem(charSequence13);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean17 = charSequenceList15.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = charSequenceList18.remove((java.lang.Object) (-4));
        charSequenceList18.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean24 = charSequenceList15.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        boolean boolean26 = charSequenceList15.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean29 = charSequenceList27.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        boolean boolean36 = charSequenceList33.add((java.lang.CharSequence) "hi!");
        boolean boolean37 = charSequenceList27.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        int int38 = charSequenceList27.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.add((java.lang.CharSequence) "hi!");
        int int42 = charSequenceList39.size();
        boolean boolean43 = charSequenceList27.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean44 = charSequenceList15.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean47 = charSequenceList45.remove((java.lang.Object) (-4));
        charSequenceList45.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int51 = charSequenceList45.getSizeField();
        int int52 = charSequenceList45.size();
        boolean boolean53 = charSequenceList27.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        java.lang.Object obj54 = null;
        boolean boolean55 = charSequenceList45.remove(obj54);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        boolean boolean58 = charSequenceList45.add((java.lang.CharSequence) "");
        boolean boolean60 = charSequenceList45.add((java.lang.CharSequence) "hi!");
        boolean boolean61 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test603");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        boolean boolean6 = charSequenceList0.removeElem((java.lang.CharSequence) "hi!");
        charSequenceList0.clear();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test604");
        DataStructures.commonscollections.TreeList<java.lang.Cloneable> cloneableList0 = new DataStructures.commonscollections.TreeList<java.lang.Cloneable>();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test605");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.remove((java.lang.Object) (-4));
        charSequenceList5.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int11 = charSequenceList5.getSizeField();
        charSequenceList5.clear();
        boolean boolean13 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        int int14 = charSequenceList3.size();
        int int15 = charSequenceList3.size();
        boolean boolean17 = charSequenceList3.removeElem((java.lang.CharSequence) "");
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList3.replaceAll(charSequenceUnaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test606");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        int int4 = charSequenceList0.indexOf((java.lang.Object) 100.0d);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean9 = charSequenceList6.removeElem((java.lang.CharSequence) "hi!");
        int int10 = charSequenceList0.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList14.remove((java.lang.Object) (-4));
        charSequenceList14.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean21 = charSequenceList14.removeElem((java.lang.CharSequence) "");
        boolean boolean23 = charSequenceList14.remove((java.lang.Object) 0);
        boolean boolean25 = charSequenceList14.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean26 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        boolean boolean28 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean29 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int30 = charSequenceList0.getSizeField();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test607");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        boolean boolean4 = charSequenceList1.remove((java.lang.Object) true);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean14 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean15 = charSequenceList5.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int16 = charSequenceList5.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        int int20 = charSequenceList17.size();
        boolean boolean21 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean23 = charSequenceList1.remove((java.lang.Object) charSequenceList17);
        charSequenceList17.clear();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean27 = charSequenceList25.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean30 = charSequenceList28.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        boolean boolean31 = charSequenceList25.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean32 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        int int33 = charSequenceList17.size();
        int int34 = charSequenceList17.getSizeField();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test608");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean10 = charSequenceList3.removeElem((java.lang.CharSequence) "");
        boolean boolean12 = charSequenceList3.remove((java.lang.Object) 0);
        int int14 = charSequenceList3.indexOf((java.lang.Object) (-4));
        boolean boolean16 = charSequenceList3.remove((java.lang.Object) 2);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList23 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        boolean boolean26 = charSequenceList23.add((java.lang.CharSequence) "hi!");
        boolean boolean27 = charSequenceList17.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean31 = charSequenceList29.remove((java.lang.Object) (-4));
        charSequenceList29.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean36 = charSequenceList29.removeElem((java.lang.CharSequence) "");
        boolean boolean37 = charSequenceList17.addAll(2, (java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        boolean boolean39 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        boolean boolean40 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean42 = charSequenceList3.removeElem((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence44 = charSequenceList3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test609");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean12 = charSequenceList0.remove((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        boolean boolean23 = charSequenceList13.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        charSequenceList19.clear();
        int int25 = charSequenceList0.indexOf((java.lang.Object) charSequenceList19);
        boolean boolean27 = charSequenceList0.remove((java.lang.Object) ' ');
        boolean boolean29 = charSequenceList0.remove((java.lang.Object) (-1));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test610");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean7 = charSequenceList4.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean8 = charSequenceList0.remove((java.lang.Object) boolean7);
        int int9 = charSequenceList0.size();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList0.add(100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test611");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean12 = charSequenceList6.add((java.lang.CharSequence) "");
        boolean boolean14 = charSequenceList6.removeElem((java.lang.CharSequence) "");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test612");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4);
        boolean boolean6 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList7 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean9 = charSequenceList7.remove((java.lang.Object) (-4));
        charSequenceList7.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int13 = charSequenceList7.getSizeField();
        charSequenceList7.clear();
        boolean boolean15 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList7.add(2, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test613");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        charSequenceList0.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean7 = charSequenceList0.removeElem((java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.remove((java.lang.Object) 0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        boolean boolean12 = charSequenceList10.add((java.lang.CharSequence) "");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test614");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean13 = charSequenceList11.add((java.lang.CharSequence) "hi!");
        boolean boolean14 = charSequenceList6.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        charSequenceList6.clear();
        int int16 = charSequenceList6.size();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test615");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean12 = charSequenceList0.remove((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        boolean boolean23 = charSequenceList13.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        charSequenceList19.clear();
        int int25 = charSequenceList0.indexOf((java.lang.Object) charSequenceList19);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean29 = charSequenceList27.remove((java.lang.Object) (-4));
        charSequenceList27.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean34 = charSequenceList27.removeElem((java.lang.CharSequence) "");
        boolean boolean36 = charSequenceList27.remove((java.lang.Object) 0);
        boolean boolean38 = charSequenceList27.removeElem((java.lang.CharSequence) "hi!");
        int int39 = charSequenceList26.indexOf((java.lang.Object) "hi!");
        charSequenceList26.clear();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test616");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        boolean boolean12 = charSequenceList0.remove((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean15 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        boolean boolean23 = charSequenceList13.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        charSequenceList19.clear();
        int int25 = charSequenceList0.indexOf((java.lang.Object) charSequenceList19);
        int int26 = charSequenceList19.getSizeField();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test617");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList1 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList1);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        boolean boolean9 = charSequenceList6.add((java.lang.CharSequence) "hi!");
        boolean boolean10 = charSequenceList0.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList6);
        int int11 = charSequenceList0.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.add((java.lang.CharSequence) "hi!");
        int int15 = charSequenceList12.size();
        boolean boolean16 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        int int18 = charSequenceList17.getSizeField();
        charSequenceList17.add(0, (java.lang.CharSequence) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean24 = charSequenceList22.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean27 = charSequenceList25.remove((java.lang.Object) (-4));
        charSequenceList25.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean31 = charSequenceList22.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean33 = charSequenceList22.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList34 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean36 = charSequenceList34.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList40 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40, charSequenceArray39);
        boolean boolean43 = charSequenceList40.add((java.lang.CharSequence) "hi!");
        boolean boolean44 = charSequenceList34.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        int int45 = charSequenceList34.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean48 = charSequenceList46.add((java.lang.CharSequence) "hi!");
        int int49 = charSequenceList46.size();
        boolean boolean50 = charSequenceList34.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        boolean boolean51 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean54 = charSequenceList52.remove((java.lang.Object) (-4));
        charSequenceList52.add((int) (byte) 0, (java.lang.CharSequence) "");
        int int58 = charSequenceList52.getSizeField();
        int int59 = charSequenceList52.size();
        boolean boolean60 = charSequenceList34.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        java.lang.Object obj61 = null;
        boolean boolean62 = charSequenceList52.remove(obj61);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        boolean boolean65 = charSequenceList52.removeElem((java.lang.CharSequence) "hi!");
        boolean boolean66 = charSequenceList17.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test618");
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.remove((java.lang.Object) (-4));
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean5 = charSequenceList3.remove((java.lang.Object) (-4));
        charSequenceList3.add((int) (byte) 0, (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean11 = charSequenceList0.remove((java.lang.Object) 6);
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!" };
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        boolean boolean21 = charSequenceList18.add((java.lang.CharSequence) "hi!");
        boolean boolean22 = charSequenceList12.addAll(0, (java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        int int23 = charSequenceList12.size();
        DataStructures.commonscollections.TreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.commonscollections.TreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.add((java.lang.CharSequence) "hi!");
        int int27 = charSequenceList24.size();
        boolean boolean28 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        boolean boolean29 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean31 = charSequenceList12.remove((java.lang.Object) 7);
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = charSequenceList12.remove(obj32);
        boolean boolean35 = charSequenceList12.remove((java.lang.Object) "hi!");
    }
}

