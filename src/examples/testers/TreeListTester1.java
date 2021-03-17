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
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList13 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int15 = strComparableList13.indexOf((java.lang.Object) (-7));
        strComparableList13.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableList13.size();
        boolean boolean20 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        boolean boolean21 = strComparableList13.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable24 = strComparableList13.set(1, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test502");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test503");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.set((int) 'a', (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test504");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove((int) (byte) 0);
        strComparableList2.clear();
        int int20 = strComparableList2.size();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test505");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean14 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableList2.size();
        int int16 = strComparableList2.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList19 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableList19.indexOf((java.lang.Object) (-3));
        boolean boolean25 = strComparableList19.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableList19.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList27 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int29 = strComparableList27.indexOf((java.lang.Object) (-7));
        boolean boolean31 = strComparableList27.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList34 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableList34.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList34.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean38 = strComparableList34.remove((java.lang.Object) 10.0f);
        boolean boolean39 = strComparableList27.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList34);
        strComparableList27.clear();
        int int41 = strComparableList19.indexOf((java.lang.Object) strComparableList27);
        int int42 = strComparableList2.indexOf((java.lang.Object) strComparableList19);
        int int43 = strComparableList19.getSizeField();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList46 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean50 = strComparableList46.remove((java.lang.Object) 10.0f);
        boolean boolean52 = strComparableList46.remove((java.lang.Object) 0);
        boolean boolean53 = strComparableList46.isEmpty();
        int int54 = strComparableList19.indexOf((java.lang.Object) boolean53);
        boolean boolean56 = strComparableList19.removeElem((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test506");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        int int15 = strComparableList2.getSizeField();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList18 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableList18.remove((java.lang.Object) 10.0f);
        boolean boolean24 = strComparableList18.remove((java.lang.Object) 0);
        boolean boolean25 = strComparableList18.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList29 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean30 = strComparableList29.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableList29.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean33 = strComparableList29.remove((java.lang.Object) 10.0f);
        boolean boolean34 = strComparableList18.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        boolean boolean35 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        int int36 = strComparableList2.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList39 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableList39.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean41 = strComparableList39.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int43 = strComparableList39.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableList46.indexOf((java.lang.Object) (-3));
        boolean boolean51 = strComparableList39.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList46);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList54 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean55 = strComparableList54.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean56 = strComparableList54.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int58 = strComparableList54.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean63 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int65 = strComparableList61.indexOf((java.lang.Object) (-3));
        boolean boolean66 = strComparableList54.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList61);
        boolean boolean68 = strComparableList54.add((java.lang.Comparable<java.lang.String>) "");
        int int69 = strComparableList39.indexOf((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList72 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean73 = strComparableList72.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean74 = strComparableList72.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean76 = strComparableList72.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList79 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean80 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean81 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean83 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        int int84 = strComparableList72.indexOf((java.lang.Object) strComparableList79);
        boolean boolean85 = strComparableList39.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList72);
        boolean boolean86 = strComparableList39.isEmpty();
        boolean boolean87 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList39);
        strComparableList39.clear();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test507");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList0.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList9 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList9.remove((java.lang.Object) 10.0f);
        boolean boolean15 = strComparableList9.remove((java.lang.Object) 0);
        boolean boolean16 = strComparableList9.isEmpty();
        boolean boolean17 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean19 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "");
        int int25 = strComparableList22.getSizeField();
        int int27 = strComparableList22.indexOf((java.lang.Object) 0.0f);
        boolean boolean29 = strComparableList22.removeElem((java.lang.Comparable<java.lang.String>) "");
        boolean boolean30 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean32 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean33 = strComparableList22.isEmpty();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test508");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.remove((java.lang.Object) 10.0f);
        boolean boolean8 = strComparableList2.remove((java.lang.Object) 0);
        boolean boolean9 = strComparableList2.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList13 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableList13.remove((java.lang.Object) 10.0f);
        boolean boolean18 = strComparableList2.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int22 = strComparableList20.indexOf((java.lang.Object) (-7));
        int int24 = strComparableList20.indexOf((java.lang.Object) (-1.0d));
        boolean boolean25 = strComparableList13.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        boolean boolean27 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean28 = strComparableList20.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList31 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = strComparableList31.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean33 = strComparableList31.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int35 = strComparableList31.indexOf((java.lang.Object) 10.0f);
        int int36 = strComparableList31.size();
        boolean boolean37 = strComparableList31.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList38 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int40 = strComparableList38.indexOf((java.lang.Object) (-7));
        boolean boolean41 = strComparableList31.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList38);
        boolean boolean43 = strComparableList31.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int44 = strComparableList31.getSizeField();
        int int45 = strComparableList31.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList48 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean49 = strComparableList48.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableList48.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean52 = strComparableList48.remove((java.lang.Object) 10.0f);
        boolean boolean54 = strComparableList48.remove((java.lang.Object) 0);
        boolean boolean55 = strComparableList48.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList57 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean58 = strComparableList57.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int59 = strComparableList57.size();
        boolean boolean60 = strComparableList48.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList57);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean65 = strComparableList64.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean66 = strComparableList64.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean68 = strComparableList64.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean69 = strComparableList61.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList64);
        boolean boolean70 = strComparableList48.remove((java.lang.Object) strComparableList61);
        boolean boolean71 = strComparableList61.isEmpty();
        boolean boolean73 = strComparableList61.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int74 = strComparableList31.indexOf((java.lang.Object) strComparableList61);
        boolean boolean75 = strComparableList20.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList61);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList76 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        java.lang.Object obj77 = null;
        boolean boolean78 = strComparableList20.remove(obj77);
        int int79 = strComparableList20.size();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test509");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.getSizeField();
        int int7 = strComparableList2.indexOf((java.lang.Object) 0.0f);
        boolean boolean9 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.clear();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList13 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableList13.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableList20.indexOf((java.lang.Object) (-3));
        boolean boolean25 = strComparableList13.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        boolean boolean27 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableList13.remove((int) (byte) 0);
        boolean boolean30 = strComparableList13.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList33 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean35 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "");
        int int36 = strComparableList33.getSizeField();
        java.lang.Comparable<java.lang.String> strComparable38 = strComparableList33.get(1);
        boolean boolean39 = strComparableList13.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList33);
        boolean boolean40 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList33);
        boolean boolean42 = strComparableList33.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test510");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableList0.getSizeField();
        boolean boolean9 = strComparableList0.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList19 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "");
        int int24 = strComparableList12.indexOf((java.lang.Object) strComparableList19);
        int int25 = strComparableList0.indexOf((java.lang.Object) int24);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList0);
        int int27 = strComparableList26.getSizeField();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test511");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) (-3));
        boolean boolean8 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList2.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList12.remove((java.lang.Object) 10.0f);
        boolean boolean18 = strComparableList12.remove((java.lang.Object) 0);
        boolean boolean19 = strComparableList12.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList21 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableList21.size();
        boolean boolean24 = strComparableList12.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList21);
        int int25 = strComparableList21.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean30 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int32 = strComparableList28.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList35 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean37 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int39 = strComparableList35.indexOf((java.lang.Object) (-3));
        boolean boolean40 = strComparableList28.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList35);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList43 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean45 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int47 = strComparableList43.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList50 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableList50.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableList50.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int54 = strComparableList50.indexOf((java.lang.Object) (-3));
        boolean boolean55 = strComparableList43.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList50);
        boolean boolean57 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        int int58 = strComparableList28.indexOf((java.lang.Object) "");
        boolean boolean59 = strComparableList21.remove((java.lang.Object) int58);
        boolean boolean60 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList21);
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection61 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = strComparableList2.removeAll(strComparableCollection61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test512");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.remove((java.lang.Object) 10.0f);
        boolean boolean8 = strComparableList2.remove((java.lang.Object) 0);
        boolean boolean9 = strComparableList2.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList13 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableList13.remove((java.lang.Object) 10.0f);
        boolean boolean18 = strComparableList2.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList19 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        boolean boolean21 = strComparableList19.remove((java.lang.Object) 8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test513");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.clear();
        int int18 = strComparableList2.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList19 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int21 = strComparableList19.indexOf((java.lang.Object) (-7));
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int24 = strComparableList22.indexOf((java.lang.Object) (-7));
        strComparableList22.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean29 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean31 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList34 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean35 = strComparableList34.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean36 = strComparableList34.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int38 = strComparableList34.indexOf((java.lang.Object) 10.0f);
        int int39 = strComparableList34.size();
        boolean boolean40 = strComparableList22.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList34);
        boolean boolean41 = strComparableList19.remove((java.lang.Object) strComparableList34);
        int int42 = strComparableList2.indexOf((java.lang.Object) strComparableList19);
        boolean boolean43 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "");
        int int49 = strComparableList46.getSizeField();
        int int51 = strComparableList46.indexOf((java.lang.Object) 0.0f);
        boolean boolean53 = strComparableList46.removeElem((java.lang.Comparable<java.lang.String>) "");
        strComparableList46.clear();
        boolean boolean55 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList46);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList58 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean59 = strComparableList58.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean60 = strComparableList58.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int62 = strComparableList58.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList65 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean66 = strComparableList65.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean67 = strComparableList65.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int69 = strComparableList65.indexOf((java.lang.Object) (-3));
        boolean boolean70 = strComparableList58.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList65);
        int int71 = strComparableList58.getSizeField();
        int int72 = strComparableList58.getSizeField();
        boolean boolean73 = strComparableList46.remove((java.lang.Object) int72);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test514");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean14 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableList2.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableList18.indexOf((java.lang.Object) 10.0f);
        int int23 = strComparableList18.size();
        boolean boolean24 = strComparableList18.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList25 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int27 = strComparableList25.indexOf((java.lang.Object) (-7));
        boolean boolean28 = strComparableList18.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList25);
        boolean boolean29 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList18);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList18.replaceAll(strComparableUnaryOperator30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test515");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList13 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int15 = strComparableList13.indexOf((java.lang.Object) (-7));
        strComparableList13.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableList13.size();
        boolean boolean20 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList21 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int23 = strComparableList21.indexOf((java.lang.Object) (-7));
        strComparableList21.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int27 = strComparableList21.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList30 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean31 = strComparableList30.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean32 = strComparableList30.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean34 = strComparableList30.remove((java.lang.Object) 10.0f);
        boolean boolean36 = strComparableList30.remove((java.lang.Object) 0);
        boolean boolean37 = strComparableList30.isEmpty();
        boolean boolean38 = strComparableList21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList30);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean42 = strComparableList41.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean43 = strComparableList41.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int45 = strComparableList41.indexOf((java.lang.Object) 10.0f);
        int int46 = strComparableList41.size();
        boolean boolean47 = strComparableList41.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList48 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int50 = strComparableList48.indexOf((java.lang.Object) (-7));
        boolean boolean51 = strComparableList41.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList48);
        boolean boolean53 = strComparableList41.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int54 = strComparableList41.getSizeField();
        boolean boolean56 = strComparableList41.remove((java.lang.Object) (byte) 100);
        boolean boolean57 = strComparableList21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList41);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList58 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int60 = strComparableList58.indexOf((java.lang.Object) (-7));
        strComparableList58.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int66 = strComparableList64.indexOf((java.lang.Object) (-7));
        int int68 = strComparableList64.indexOf((java.lang.Object) (-1.0d));
        boolean boolean69 = strComparableList58.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList64);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList71 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean72 = strComparableList71.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int73 = strComparableList71.size();
        boolean boolean74 = strComparableList58.remove((java.lang.Object) strComparableList71);
        boolean boolean76 = strComparableList58.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean77 = strComparableList21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList58);
        int int78 = strComparableList2.indexOf((java.lang.Object) strComparableList58);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test516");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        int int15 = strComparableList2.getSizeField();
        int int16 = strComparableList2.getSizeField();
        int int17 = strComparableList2.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList21 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableList21.indexOf((java.lang.Object) (-3));
        boolean boolean27 = strComparableList21.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList21.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList32 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableList32.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean34 = strComparableList32.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int36 = strComparableList32.indexOf((java.lang.Object) (-3));
        boolean boolean38 = strComparableList32.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean39 = strComparableList21.addAll((int) (byte) 1, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList32);
        boolean boolean41 = strComparableList32.removeElem((java.lang.Comparable<java.lang.String>) "");
        boolean boolean43 = strComparableList32.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = strComparableList2.addAll((int) ' ', (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test517");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean14 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableList2.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableList18.indexOf((java.lang.Object) 10.0f);
        int int23 = strComparableList18.size();
        boolean boolean24 = strComparableList18.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList25 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int27 = strComparableList25.indexOf((java.lang.Object) (-7));
        boolean boolean28 = strComparableList18.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList25);
        boolean boolean29 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList18);
        boolean boolean31 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean33 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList18.replaceAll(strComparableUnaryOperator34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test518");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableList16.indexOf((java.lang.Object) (-3));
        boolean boolean21 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        int int22 = strComparableList9.getSizeField();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList25 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableList25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableList25.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean29 = strComparableList25.remove((java.lang.Object) 10.0f);
        boolean boolean31 = strComparableList25.remove((java.lang.Object) 0);
        boolean boolean32 = strComparableList25.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList36 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean37 = strComparableList36.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean38 = strComparableList36.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean40 = strComparableList36.remove((java.lang.Object) 10.0f);
        boolean boolean41 = strComparableList25.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList36);
        boolean boolean42 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList36);
        boolean boolean43 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList36);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean48 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableList46.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList53 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean54 = strComparableList53.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean55 = strComparableList53.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int57 = strComparableList53.indexOf((java.lang.Object) (-3));
        boolean boolean58 = strComparableList46.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList53);
        boolean boolean60 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList46.clear();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean65 = strComparableList64.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean66 = strComparableList64.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int68 = strComparableList64.indexOf((java.lang.Object) (-3));
        int int69 = strComparableList46.indexOf((java.lang.Object) strComparableList64);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList70 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int72 = strComparableList70.indexOf((java.lang.Object) (-7));
        strComparableList70.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int77 = strComparableList70.indexOf((java.lang.Object) false);
        int int78 = strComparableList70.getSizeField();
        int int79 = strComparableList70.getSizeField();
        boolean boolean80 = strComparableList64.remove((java.lang.Object) strComparableList70);
        int int81 = strComparableList2.indexOf((java.lang.Object) strComparableList70);
        int int82 = strComparableList2.getSizeField();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test519");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) (-3));
        boolean boolean8 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableList2.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int12 = strComparableList10.indexOf((java.lang.Object) (-7));
        boolean boolean14 = strComparableList10.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableList17.remove((java.lang.Object) 10.0f);
        boolean boolean22 = strComparableList10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList17);
        strComparableList10.clear();
        int int24 = strComparableList2.indexOf((java.lang.Object) strComparableList10);
        int int25 = strComparableList10.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable27 = strComparableList10.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:6, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test520");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableList0.indexOf((java.lang.Object) false);
        boolean boolean9 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test521");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableList10.getSizeField();
        boolean boolean14 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
        int int15 = strComparableList10.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableList18.indexOf((java.lang.Object) 10.0f);
        int int23 = strComparableList18.size();
        boolean boolean24 = strComparableList18.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList25 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int27 = strComparableList25.indexOf((java.lang.Object) (-7));
        boolean boolean28 = strComparableList18.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList25);
        boolean boolean30 = strComparableList18.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int31 = strComparableList18.getSizeField();
        int int32 = strComparableList18.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList35 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean37 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean39 = strComparableList35.remove((java.lang.Object) 10.0f);
        boolean boolean41 = strComparableList35.remove((java.lang.Object) 0);
        boolean boolean42 = strComparableList35.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean45 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int46 = strComparableList44.size();
        boolean boolean47 = strComparableList35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList48 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList51 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean52 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean53 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean55 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean56 = strComparableList48.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList51);
        boolean boolean57 = strComparableList35.remove((java.lang.Object) strComparableList48);
        boolean boolean58 = strComparableList48.isEmpty();
        boolean boolean60 = strComparableList48.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int61 = strComparableList18.indexOf((java.lang.Object) strComparableList48);
        boolean boolean63 = strComparableList48.add((java.lang.Comparable<java.lang.String>) "");
        int int64 = strComparableList10.indexOf((java.lang.Object) strComparableList48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable66 = strComparableList48.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test522");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        int int15 = strComparableList2.getSizeField();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList18 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableList18.remove((java.lang.Object) 10.0f);
        boolean boolean24 = strComparableList18.remove((java.lang.Object) 0);
        boolean boolean25 = strComparableList18.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList29 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean30 = strComparableList29.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableList29.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean33 = strComparableList29.remove((java.lang.Object) 10.0f);
        boolean boolean34 = strComparableList18.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        boolean boolean35 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList38 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean39 = strComparableList38.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean40 = strComparableList38.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean42 = strComparableList38.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList45 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean46 = strComparableList45.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean47 = strComparableList45.add((java.lang.Comparable<java.lang.String>) "");
        int int48 = strComparableList45.getSizeField();
        int int50 = strComparableList45.indexOf((java.lang.Object) 0.0f);
        boolean boolean52 = strComparableList45.removeElem((java.lang.Comparable<java.lang.String>) "");
        strComparableList45.clear();
        boolean boolean54 = strComparableList38.remove((java.lang.Object) strComparableList45);
        boolean boolean55 = strComparableList2.remove((java.lang.Object) strComparableList38);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList56 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList38);
        int int57 = strComparableList38.getSizeField();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test523");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.clear();
        boolean boolean8 = strComparableList2.isEmpty();
        boolean boolean10 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableList2.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:0, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test524");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        int int14 = strComparableList2.indexOf((java.lang.Object) 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test525");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        boolean boolean4 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList7.remove((java.lang.Object) 10.0f);
        boolean boolean12 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList7);
        int int13 = strComparableList0.size();
        boolean boolean14 = strComparableList0.isEmpty();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test526");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.getSizeField();
        boolean boolean7 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.clear();
        int int11 = strComparableList2.getSizeField();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test527");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableList0.indexOf((java.lang.Object) false);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableList9.size();
        boolean boolean12 = strComparableList0.remove((java.lang.Object) strComparableList9);
        boolean boolean14 = strComparableList9.removeElem((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList9.removeElem((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int22 = strComparableList20.indexOf((java.lang.Object) (-7));
        strComparableList20.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int27 = strComparableList20.indexOf((java.lang.Object) false);
        int int28 = strComparableList20.getSizeField();
        int int29 = strComparableList20.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList32 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableList32.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean34 = strComparableList32.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int36 = strComparableList32.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList39 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableList39.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean41 = strComparableList39.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int43 = strComparableList39.indexOf((java.lang.Object) (-3));
        boolean boolean44 = strComparableList32.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList39);
        boolean boolean46 = strComparableList32.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable48 = strComparableList32.remove((int) (byte) 0);
        boolean boolean49 = strComparableList32.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList52 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean53 = strComparableList52.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean54 = strComparableList52.add((java.lang.Comparable<java.lang.String>) "");
        int int55 = strComparableList52.getSizeField();
        java.lang.Comparable<java.lang.String> strComparable57 = strComparableList52.get(1);
        boolean boolean58 = strComparableList32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList52);
        boolean boolean59 = strComparableList20.remove((java.lang.Object) strComparableList52);
        boolean boolean60 = strComparableList52.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = strComparableList9.addAll(10, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test528");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) (-3));
        boolean boolean8 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableList2.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int12 = strComparableList10.indexOf((java.lang.Object) (-7));
        boolean boolean14 = strComparableList10.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableList17.remove((java.lang.Object) 10.0f);
        boolean boolean22 = strComparableList10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList17);
        strComparableList10.clear();
        int int24 = strComparableList2.indexOf((java.lang.Object) strComparableList10);
        boolean boolean25 = strComparableList2.isEmpty();
        boolean boolean27 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test529");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableList1.size();
        int int4 = strComparableList1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.set((-4), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-4, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test530");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        int int15 = strComparableList2.getSizeField();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList18 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableList18.remove((java.lang.Object) 10.0f);
        boolean boolean24 = strComparableList18.remove((java.lang.Object) 0);
        boolean boolean25 = strComparableList18.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList29 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean30 = strComparableList29.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableList29.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean33 = strComparableList29.remove((java.lang.Object) 10.0f);
        boolean boolean34 = strComparableList18.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        boolean boolean35 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        int int36 = strComparableList2.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList39 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean40 = strComparableList39.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean41 = strComparableList39.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int43 = strComparableList39.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableList46.indexOf((java.lang.Object) (-3));
        boolean boolean51 = strComparableList39.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList46);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList54 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean55 = strComparableList54.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean56 = strComparableList54.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int58 = strComparableList54.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean63 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int65 = strComparableList61.indexOf((java.lang.Object) (-3));
        boolean boolean66 = strComparableList54.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList61);
        boolean boolean68 = strComparableList54.add((java.lang.Comparable<java.lang.String>) "");
        int int69 = strComparableList39.indexOf((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList72 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean73 = strComparableList72.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean74 = strComparableList72.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean76 = strComparableList72.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList79 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean80 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean81 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean83 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        int int84 = strComparableList72.indexOf((java.lang.Object) strComparableList79);
        boolean boolean85 = strComparableList39.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList72);
        boolean boolean86 = strComparableList39.isEmpty();
        boolean boolean87 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList39);
        strComparableList2.clear();
        boolean boolean90 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test531");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.remove((java.lang.Object) 10.0f);
        boolean boolean8 = strComparableList2.remove((java.lang.Object) 0);
        boolean boolean9 = strComparableList2.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList13 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableList13.remove((java.lang.Object) 10.0f);
        boolean boolean18 = strComparableList2.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int22 = strComparableList20.indexOf((java.lang.Object) (-7));
        int int24 = strComparableList20.indexOf((java.lang.Object) (-1.0d));
        boolean boolean25 = strComparableList13.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        boolean boolean27 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean28 = strComparableList20.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList31 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = strComparableList31.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean33 = strComparableList31.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int35 = strComparableList31.indexOf((java.lang.Object) 10.0f);
        int int36 = strComparableList31.size();
        boolean boolean37 = strComparableList31.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList38 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int40 = strComparableList38.indexOf((java.lang.Object) (-7));
        boolean boolean41 = strComparableList31.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList38);
        boolean boolean43 = strComparableList31.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int44 = strComparableList31.getSizeField();
        int int45 = strComparableList31.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList48 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean49 = strComparableList48.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableList48.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean52 = strComparableList48.remove((java.lang.Object) 10.0f);
        boolean boolean54 = strComparableList48.remove((java.lang.Object) 0);
        boolean boolean55 = strComparableList48.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList57 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean58 = strComparableList57.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int59 = strComparableList57.size();
        boolean boolean60 = strComparableList48.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList57);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean65 = strComparableList64.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean66 = strComparableList64.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean68 = strComparableList64.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean69 = strComparableList61.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList64);
        boolean boolean70 = strComparableList48.remove((java.lang.Object) strComparableList61);
        boolean boolean71 = strComparableList61.isEmpty();
        boolean boolean73 = strComparableList61.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int74 = strComparableList31.indexOf((java.lang.Object) strComparableList61);
        boolean boolean75 = strComparableList20.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList61);
        boolean boolean77 = strComparableList20.removeElem((java.lang.Comparable<java.lang.String>) "");
        boolean boolean78 = strComparableList20.isEmpty();
        int int79 = strComparableList20.getSizeField();
        boolean boolean81 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test532");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int8 = strComparableList6.indexOf((java.lang.Object) (-7));
        int int10 = strComparableList6.indexOf((java.lang.Object) (-1.0d));
        boolean boolean11 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList6);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList13 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableList13.size();
        boolean boolean16 = strComparableList0.remove((java.lang.Object) strComparableList13);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int19 = strComparableList17.indexOf((java.lang.Object) (-7));
        strComparableList17.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableList17.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList26 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean30 = strComparableList26.remove((java.lang.Object) 10.0f);
        boolean boolean32 = strComparableList26.remove((java.lang.Object) 0);
        boolean boolean33 = strComparableList26.isEmpty();
        boolean boolean34 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean35 = strComparableList17.isEmpty();
        boolean boolean36 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList17);
        int int37 = strComparableList17.size();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test533");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList2.set((-6), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-6, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test534");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.getSizeField();
        boolean boolean7 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        strComparableList8.clear();
        int int10 = strComparableList8.size();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test535");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        boolean boolean4 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList7.remove((java.lang.Object) 10.0f);
        boolean boolean12 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList7);
        int int13 = strComparableList0.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableList16.indexOf((java.lang.Object) (-3));
        boolean boolean22 = strComparableList16.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableList16.getSizeField();
        boolean boolean24 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        java.lang.Comparable<java.lang.String> strComparable26 = strComparableList16.get(0);
        boolean boolean28 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test536");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int8 = strComparableList6.indexOf((java.lang.Object) (-7));
        int int10 = strComparableList6.indexOf((java.lang.Object) (-1.0d));
        boolean boolean11 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList6);
        boolean boolean13 = strComparableList6.add((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList14 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int16 = strComparableList14.indexOf((java.lang.Object) (-7));
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int19 = strComparableList17.indexOf((java.lang.Object) (-7));
        strComparableList17.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList23 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int25 = strComparableList23.indexOf((java.lang.Object) (-7));
        int int27 = strComparableList23.indexOf((java.lang.Object) (-1.0d));
        boolean boolean28 = strComparableList17.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList23);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList30 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean31 = strComparableList30.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int32 = strComparableList30.size();
        boolean boolean33 = strComparableList17.remove((java.lang.Object) strComparableList30);
        boolean boolean35 = strComparableList17.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList14.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList17);
        boolean boolean37 = strComparableList6.remove((java.lang.Object) strComparableList14);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator38 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList14.replaceAll(strComparableUnaryOperator38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test537");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableList17.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableList24.indexOf((java.lang.Object) (-3));
        boolean boolean29 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean31 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        int int32 = strComparableList2.indexOf((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList36 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean37 = strComparableList36.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean38 = strComparableList36.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int40 = strComparableList36.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList43 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int47 = strComparableList43.indexOf((java.lang.Object) (-3));
        boolean boolean48 = strComparableList36.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList43);
        int int49 = strComparableList43.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList52 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean53 = strComparableList52.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean54 = strComparableList52.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int56 = strComparableList52.indexOf((java.lang.Object) 10.0f);
        int int57 = strComparableList52.size();
        boolean boolean58 = strComparableList52.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList59 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int61 = strComparableList59.indexOf((java.lang.Object) (-7));
        boolean boolean62 = strComparableList52.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList59);
        boolean boolean64 = strComparableList52.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int65 = strComparableList52.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList68 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean69 = strComparableList68.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean70 = strComparableList68.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int72 = strComparableList68.indexOf((java.lang.Object) 10.0f);
        int int73 = strComparableList68.size();
        boolean boolean74 = strComparableList68.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList75 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int77 = strComparableList75.indexOf((java.lang.Object) (-7));
        boolean boolean78 = strComparableList68.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList75);
        boolean boolean79 = strComparableList52.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList68);
        boolean boolean80 = strComparableList43.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList68);
        boolean boolean81 = strComparableList2.addAll(2, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList68);
        int int82 = strComparableList2.size();
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test538");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.clear();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableList20.indexOf((java.lang.Object) (-3));
        int int25 = strComparableList2.indexOf((java.lang.Object) strComparableList20);
        boolean boolean26 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList29 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean30 = strComparableList29.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean31 = strComparableList29.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableList29.indexOf((java.lang.Object) 10.0f);
        int int34 = strComparableList29.size();
        boolean boolean35 = strComparableList29.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList36 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int38 = strComparableList36.indexOf((java.lang.Object) (-7));
        boolean boolean39 = strComparableList29.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList36);
        boolean boolean41 = strComparableList29.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int42 = strComparableList29.size();
        int int43 = strComparableList29.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableList46.indexOf((java.lang.Object) (-3));
        boolean boolean52 = strComparableList46.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int53 = strComparableList46.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList54 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int56 = strComparableList54.indexOf((java.lang.Object) (-7));
        boolean boolean58 = strComparableList54.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList61 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean63 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean65 = strComparableList61.remove((java.lang.Object) 10.0f);
        boolean boolean66 = strComparableList54.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList61);
        strComparableList54.clear();
        int int68 = strComparableList46.indexOf((java.lang.Object) strComparableList54);
        int int69 = strComparableList29.indexOf((java.lang.Object) strComparableList46);
        int int70 = strComparableList46.getSizeField();
        boolean boolean71 = strComparableList2.remove((java.lang.Object) int70);
        int int72 = strComparableList2.size();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test539");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableList17.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableList24.indexOf((java.lang.Object) (-3));
        boolean boolean29 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        int int30 = strComparableList17.getSizeField();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList33 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean35 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean37 = strComparableList33.remove((java.lang.Object) 10.0f);
        boolean boolean39 = strComparableList33.remove((java.lang.Object) 0);
        boolean boolean40 = strComparableList33.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList44 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean45 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean46 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean48 = strComparableList44.remove((java.lang.Object) 10.0f);
        boolean boolean49 = strComparableList33.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        boolean boolean50 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        int int51 = strComparableList17.size();
        int int52 = strComparableList17.size();
        boolean boolean53 = strComparableList17.isEmpty();
        boolean boolean54 = strComparableList9.remove((java.lang.Object) boolean53);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList57 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean58 = strComparableList57.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean59 = strComparableList57.add((java.lang.Comparable<java.lang.String>) "");
        int int60 = strComparableList57.getSizeField();
        boolean boolean62 = strComparableList57.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList63 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList57);
        int int64 = strComparableList9.indexOf((java.lang.Object) strComparableList57);
        boolean boolean66 = strComparableList57.add((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test540");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.remove((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableList16.indexOf((java.lang.Object) (-3));
        boolean boolean21 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        int int22 = strComparableList9.getSizeField();
        int int23 = strComparableList9.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean28 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int30 = strComparableList26.indexOf((java.lang.Object) 10.0f);
        int int31 = strComparableList26.size();
        boolean boolean32 = strComparableList26.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList33 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int35 = strComparableList33.indexOf((java.lang.Object) (-7));
        boolean boolean36 = strComparableList26.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList33);
        boolean boolean37 = strComparableList26.isEmpty();
        boolean boolean38 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean39 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int43 = strComparableList41.indexOf((java.lang.Object) (-7));
        strComparableList41.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int48 = strComparableList41.indexOf((java.lang.Object) false);
        int int49 = strComparableList41.getSizeField();
        int int50 = strComparableList41.getSizeField();
        boolean boolean51 = strComparableList9.addAll((int) (short) 1, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList41);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList52 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean53 = strComparableList52.isEmpty();
        int int54 = strComparableList52.size();
        boolean boolean55 = strComparableList9.remove((java.lang.Object) int54);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test541");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Comparable<java.lang.String>> strComparableList12 = strComparableList0.subList((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test542");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableList0.getSizeField();
        boolean boolean9 = strComparableList0.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList19 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "");
        int int24 = strComparableList12.indexOf((java.lang.Object) strComparableList19);
        int int25 = strComparableList0.indexOf((java.lang.Object) int24);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList28 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean32 = strComparableList28.remove((java.lang.Object) 10.0f);
        boolean boolean34 = strComparableList28.remove((java.lang.Object) 0);
        boolean boolean35 = strComparableList28.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean38 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int39 = strComparableList37.size();
        boolean boolean40 = strComparableList28.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean45 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean46 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean48 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean49 = strComparableList41.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        boolean boolean50 = strComparableList28.remove((java.lang.Object) strComparableList41);
        boolean boolean51 = strComparableList41.isEmpty();
        boolean boolean52 = strComparableList0.remove((java.lang.Object) strComparableList41);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test543");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableList0.getSizeField();
        int int2 = strComparableList0.size();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test544");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        int int15 = strComparableList9.size();
        int int16 = strComparableList9.getSizeField();
        boolean boolean17 = strComparableList9.isEmpty();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test545");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList0.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList9 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList9.remove((java.lang.Object) 10.0f);
        boolean boolean15 = strComparableList9.remove((java.lang.Object) 0);
        boolean boolean16 = strComparableList9.isEmpty();
        boolean boolean17 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean19 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "");
        int int25 = strComparableList22.getSizeField();
        int int27 = strComparableList22.indexOf((java.lang.Object) 0.0f);
        boolean boolean29 = strComparableList22.removeElem((java.lang.Comparable<java.lang.String>) "");
        boolean boolean30 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable33 = strComparableList22.set(10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test546");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList0.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList9 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList9.remove((java.lang.Object) 10.0f);
        boolean boolean15 = strComparableList9.remove((java.lang.Object) 0);
        boolean boolean16 = strComparableList9.isEmpty();
        boolean boolean17 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean19 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableList0.remove((int) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int24 = strComparableList22.indexOf((java.lang.Object) (-7));
        strComparableList22.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableList22.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList31 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = strComparableList31.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean33 = strComparableList31.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean35 = strComparableList31.remove((java.lang.Object) 10.0f);
        boolean boolean37 = strComparableList31.remove((java.lang.Object) 0);
        boolean boolean38 = strComparableList31.isEmpty();
        boolean boolean39 = strComparableList22.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList31);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList40 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList31);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList31);
        boolean boolean42 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList31);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean48 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableList46.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList53 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean54 = strComparableList53.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean55 = strComparableList53.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int57 = strComparableList53.indexOf((java.lang.Object) (-3));
        boolean boolean58 = strComparableList46.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList53);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean63 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int65 = strComparableList61.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList68 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean69 = strComparableList68.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean70 = strComparableList68.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int72 = strComparableList68.indexOf((java.lang.Object) (-3));
        boolean boolean73 = strComparableList61.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList68);
        boolean boolean75 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "");
        int int76 = strComparableList46.indexOf((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList79 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean80 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean81 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean83 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList86 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean87 = strComparableList86.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean88 = strComparableList86.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean90 = strComparableList86.add((java.lang.Comparable<java.lang.String>) "");
        int int91 = strComparableList79.indexOf((java.lang.Object) strComparableList86);
        boolean boolean92 = strComparableList46.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList79);
        boolean boolean94 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = strComparableList31.addAll(6, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test547");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) (-3));
        boolean boolean8 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableList2.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int12 = strComparableList10.indexOf((java.lang.Object) (-7));
        boolean boolean14 = strComparableList10.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList17 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableList17.remove((java.lang.Object) 10.0f);
        boolean boolean22 = strComparableList10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList17);
        strComparableList10.clear();
        int int24 = strComparableList2.indexOf((java.lang.Object) strComparableList10);
        boolean boolean26 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList2.clear();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test548");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList7 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        boolean boolean9 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList13 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableList13.remove((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableList20.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList27 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableList27.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean29 = strComparableList27.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int31 = strComparableList27.indexOf((java.lang.Object) (-3));
        boolean boolean32 = strComparableList20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList27);
        int int33 = strComparableList20.getSizeField();
        int int34 = strComparableList20.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean38 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean39 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int41 = strComparableList37.indexOf((java.lang.Object) 10.0f);
        int int42 = strComparableList37.size();
        boolean boolean43 = strComparableList37.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int46 = strComparableList44.indexOf((java.lang.Object) (-7));
        boolean boolean47 = strComparableList37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        boolean boolean48 = strComparableList37.isEmpty();
        boolean boolean49 = strComparableList20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        boolean boolean50 = strComparableList13.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList52 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int54 = strComparableList52.indexOf((java.lang.Object) (-7));
        strComparableList52.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int59 = strComparableList52.indexOf((java.lang.Object) false);
        int int60 = strComparableList52.getSizeField();
        int int61 = strComparableList52.getSizeField();
        boolean boolean62 = strComparableList20.addAll((int) (short) 1, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList52);
        strComparableList20.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean66 = strComparableList7.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test549");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableList17.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableList24.indexOf((java.lang.Object) (-3));
        boolean boolean29 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean31 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        int int32 = strComparableList2.indexOf((java.lang.Object) "");
        java.lang.Comparable<java.lang.String> strComparable35 = strComparableList2.set(0, (java.lang.Comparable<java.lang.String>) "");
        int int36 = strComparableList2.size();
        java.lang.Comparable<java.lang.String> strComparable38 = strComparableList2.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable40 = strComparableList2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:97, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test550");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.getSizeField();
        boolean boolean7 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList2.set(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList2.remove((java.lang.Object) 100);
        strComparableList2.clear();
        int int14 = strComparableList2.getSizeField();
        boolean boolean15 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int18 = strComparableList16.indexOf((java.lang.Object) (-7));
        strComparableList16.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean25 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean30 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int32 = strComparableList28.indexOf((java.lang.Object) 10.0f);
        int int33 = strComparableList28.size();
        boolean boolean34 = strComparableList16.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList28);
        int int35 = strComparableList28.getSizeField();
        boolean boolean36 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList28);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList40 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean41 = strComparableList40.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean42 = strComparableList40.add((java.lang.Comparable<java.lang.String>) "");
        int int43 = strComparableList40.getSizeField();
        boolean boolean45 = strComparableList40.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable48 = strComparableList40.set(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableList40.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList53 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean54 = strComparableList53.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean55 = strComparableList53.add((java.lang.Comparable<java.lang.String>) "");
        int int56 = strComparableList53.getSizeField();
        int int57 = strComparableList40.indexOf((java.lang.Object) strComparableList53);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = strComparableList28.addAll((-8), (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -8, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test551");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.getSizeField();
        boolean boolean7 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        boolean boolean10 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.add(2, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test552");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableList0.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList4 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableList4.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableList4.add((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableList4.getSizeField();
        boolean boolean9 = strComparableList4.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList4.set(0, (java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableList15.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableList22.indexOf((java.lang.Object) (-3));
        boolean boolean27 = strComparableList15.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean29 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList15.clear();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList33 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean35 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int37 = strComparableList33.indexOf((java.lang.Object) (-3));
        int int38 = strComparableList15.indexOf((java.lang.Object) strComparableList33);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList39 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int41 = strComparableList39.indexOf((java.lang.Object) (-7));
        strComparableList39.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int46 = strComparableList39.indexOf((java.lang.Object) false);
        int int47 = strComparableList39.getSizeField();
        int int48 = strComparableList39.getSizeField();
        boolean boolean49 = strComparableList33.remove((java.lang.Object) strComparableList39);
        boolean boolean50 = strComparableList4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList39);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList51 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int53 = strComparableList51.indexOf((java.lang.Object) (-7));
        strComparableList51.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean58 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean60 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList63 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean64 = strComparableList63.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean65 = strComparableList63.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int67 = strComparableList63.indexOf((java.lang.Object) 10.0f);
        int int68 = strComparableList63.size();
        boolean boolean69 = strComparableList51.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList63);
        int int70 = strComparableList63.getSizeField();
        int int71 = strComparableList39.indexOf((java.lang.Object) int70);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList74 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean75 = strComparableList74.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean76 = strComparableList74.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int78 = strComparableList74.indexOf((java.lang.Object) (-3));
        boolean boolean79 = strComparableList39.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList74);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList80 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList74);
        boolean boolean81 = strComparableList0.remove((java.lang.Object) strComparableList80);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList82 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList0);
        strComparableList0.add((int) (short) 0, (java.lang.Comparable<java.lang.String>) "");
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator86 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList0.replaceAll(strComparableUnaryOperator86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test553");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int5 = strComparableList3.indexOf((java.lang.Object) (-7));
        strComparableList3.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableList15.indexOf((java.lang.Object) 10.0f);
        int int20 = strComparableList15.size();
        boolean boolean21 = strComparableList3.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        boolean boolean22 = strComparableList0.remove((java.lang.Object) strComparableList15);
        int int23 = strComparableList0.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean28 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int30 = strComparableList26.indexOf((java.lang.Object) 10.0f);
        int int31 = strComparableList26.size();
        boolean boolean32 = strComparableList26.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList33 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int35 = strComparableList33.indexOf((java.lang.Object) (-7));
        boolean boolean36 = strComparableList26.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList33);
        boolean boolean38 = strComparableList26.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int39 = strComparableList26.size();
        boolean boolean40 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList43 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean45 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int47 = strComparableList43.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList50 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableList50.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableList50.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int54 = strComparableList50.indexOf((java.lang.Object) (-3));
        boolean boolean55 = strComparableList43.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList50);
        boolean boolean57 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList43.clear();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean63 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int65 = strComparableList61.indexOf((java.lang.Object) (-3));
        int int66 = strComparableList43.indexOf((java.lang.Object) strComparableList61);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList67 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int69 = strComparableList67.indexOf((java.lang.Object) (-7));
        strComparableList67.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int74 = strComparableList67.indexOf((java.lang.Object) false);
        int int75 = strComparableList67.getSizeField();
        int int76 = strComparableList67.getSizeField();
        boolean boolean77 = strComparableList61.remove((java.lang.Object) strComparableList67);
        boolean boolean79 = strComparableList67.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList67.clear();
        boolean boolean81 = strComparableList67.isEmpty();
        int int82 = strComparableList67.size();
        boolean boolean83 = strComparableList26.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList67);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable85 = strComparableList67.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:4, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test554");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableList17.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableList24.indexOf((java.lang.Object) (-3));
        boolean boolean29 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean31 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        int int32 = strComparableList2.indexOf((java.lang.Object) "");
        java.lang.Comparable<java.lang.String> strComparable35 = strComparableList2.set(0, (java.lang.Comparable<java.lang.String>) "");
        int int36 = strComparableList2.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable38 = strComparableList2.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-1, size=4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test555");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableList16.indexOf((java.lang.Object) (-3));
        boolean boolean21 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        int int22 = strComparableList9.getSizeField();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList25 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableList25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableList25.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean29 = strComparableList25.remove((java.lang.Object) 10.0f);
        boolean boolean31 = strComparableList25.remove((java.lang.Object) 0);
        boolean boolean32 = strComparableList25.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList36 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean37 = strComparableList36.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean38 = strComparableList36.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean40 = strComparableList36.remove((java.lang.Object) 10.0f);
        boolean boolean41 = strComparableList25.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList36);
        boolean boolean42 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList36);
        boolean boolean43 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList36);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean47 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean48 = strComparableList46.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int50 = strComparableList46.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList53 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean54 = strComparableList53.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean55 = strComparableList53.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int57 = strComparableList53.indexOf((java.lang.Object) (-3));
        boolean boolean58 = strComparableList46.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList53);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean63 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int65 = strComparableList61.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList68 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean69 = strComparableList68.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean70 = strComparableList68.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int72 = strComparableList68.indexOf((java.lang.Object) (-3));
        boolean boolean73 = strComparableList61.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList68);
        boolean boolean75 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "");
        int int76 = strComparableList46.indexOf((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList79 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean80 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean81 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean83 = strComparableList79.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList86 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean87 = strComparableList86.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean88 = strComparableList86.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean90 = strComparableList86.add((java.lang.Comparable<java.lang.String>) "");
        int int91 = strComparableList79.indexOf((java.lang.Object) strComparableList86);
        boolean boolean92 = strComparableList46.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList79);
        boolean boolean93 = strComparableList46.isEmpty();
        boolean boolean94 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList46);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test556");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableList2.indexOf((java.lang.Object) strComparableList9);
        int int15 = strComparableList2.getSizeField();
        boolean boolean17 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.clear();
        int int19 = strComparableList2.getSizeField();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test557");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableList0.isEmpty();
        strComparableList0.clear();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test558");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableList2.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableList12.indexOf((java.lang.Object) (-3));
        boolean boolean18 = strComparableList12.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableList12.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int22 = strComparableList20.indexOf((java.lang.Object) (-7));
        boolean boolean24 = strComparableList20.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList27 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableList27.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean29 = strComparableList27.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean31 = strComparableList27.remove((java.lang.Object) 10.0f);
        boolean boolean32 = strComparableList20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList27);
        strComparableList20.clear();
        int int34 = strComparableList12.indexOf((java.lang.Object) strComparableList20);
        boolean boolean35 = strComparableList2.addAll((int) (short) 1, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        boolean boolean36 = strComparableList12.isEmpty();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test559");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove((int) (byte) 0);
        int int19 = strComparableList2.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList22 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList22.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean26 = strComparableList22.remove((java.lang.Object) 10.0f);
        boolean boolean28 = strComparableList22.remove((java.lang.Object) 0);
        boolean boolean29 = strComparableList22.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList31 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = strComparableList31.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableList31.size();
        boolean boolean34 = strComparableList22.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList31);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList35 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList38 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean39 = strComparableList38.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean40 = strComparableList38.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean42 = strComparableList38.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean43 = strComparableList35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList38);
        boolean boolean44 = strComparableList22.remove((java.lang.Object) strComparableList35);
        boolean boolean45 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        int int46 = strComparableList2.getSizeField();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test560");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableList17.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableList17.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableList24.indexOf((java.lang.Object) (-3));
        boolean boolean29 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        int int30 = strComparableList17.getSizeField();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList33 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean34 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean35 = strComparableList33.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean37 = strComparableList33.remove((java.lang.Object) 10.0f);
        boolean boolean39 = strComparableList33.remove((java.lang.Object) 0);
        boolean boolean40 = strComparableList33.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList44 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean45 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean46 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean48 = strComparableList44.remove((java.lang.Object) 10.0f);
        boolean boolean49 = strComparableList33.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        boolean boolean50 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        int int51 = strComparableList17.size();
        int int52 = strComparableList17.size();
        boolean boolean53 = strComparableList17.isEmpty();
        boolean boolean54 = strComparableList9.remove((java.lang.Object) boolean53);
        boolean boolean56 = strComparableList9.removeElem((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test561");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableList0.indexOf((java.lang.Object) false);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableList9.size();
        boolean boolean12 = strComparableList0.remove((java.lang.Object) strComparableList9);
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "");
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList18 = strComparableList0.subList(0, (int) (short) 1);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test562");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int19 = strComparableList17.indexOf((java.lang.Object) (-7));
        boolean boolean21 = strComparableList17.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList24 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean28 = strComparableList24.remove((java.lang.Object) 10.0f);
        boolean boolean29 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        strComparableList17.clear();
        boolean boolean31 = strComparableList2.remove((java.lang.Object) strComparableList17);
        strComparableList2.clear();
        boolean boolean34 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean36 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test563");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        int int3 = strComparableList0.getSizeField();
        boolean boolean5 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test564");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) (-3));
        boolean boolean8 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList2.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList12 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean13 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList12.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList12.remove((java.lang.Object) 10.0f);
        boolean boolean18 = strComparableList12.remove((java.lang.Object) 0);
        boolean boolean19 = strComparableList12.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList21 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableList21.size();
        boolean boolean24 = strComparableList12.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList21);
        int int25 = strComparableList21.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean30 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int32 = strComparableList28.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList35 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean37 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int39 = strComparableList35.indexOf((java.lang.Object) (-3));
        boolean boolean40 = strComparableList28.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList35);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList43 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean45 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int47 = strComparableList43.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList50 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableList50.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableList50.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int54 = strComparableList50.indexOf((java.lang.Object) (-3));
        boolean boolean55 = strComparableList43.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList50);
        boolean boolean57 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        int int58 = strComparableList28.indexOf((java.lang.Object) "");
        boolean boolean59 = strComparableList21.remove((java.lang.Object) int58);
        boolean boolean60 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList21);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList2.add((int) (short) 10, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:10, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test565");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        int int14 = strComparableList9.indexOf((java.lang.Object) (byte) 10);
        int int15 = strComparableList9.getSizeField();
        int int16 = strComparableList9.size();
        boolean boolean17 = strComparableList9.isEmpty();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test566");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        boolean boolean4 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList7.remove((java.lang.Object) 10.0f);
        boolean boolean12 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList7);
        int int13 = strComparableList0.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableList16.indexOf((java.lang.Object) (-3));
        boolean boolean22 = strComparableList16.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableList16.getSizeField();
        boolean boolean24 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        boolean boolean26 = strComparableList16.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable29 = strComparableList16.set(100, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:100, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test567");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.clear();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableList20.indexOf((java.lang.Object) (-3));
        int int25 = strComparableList2.indexOf((java.lang.Object) strComparableList20);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int28 = strComparableList26.indexOf((java.lang.Object) (-7));
        strComparableList26.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableList26.indexOf((java.lang.Object) false);
        int int34 = strComparableList26.getSizeField();
        int int35 = strComparableList26.getSizeField();
        boolean boolean36 = strComparableList20.remove((java.lang.Object) strComparableList26);
        boolean boolean38 = strComparableList26.removeElem((java.lang.Comparable<java.lang.String>) "");
        boolean boolean39 = strComparableList26.isEmpty();
        boolean boolean40 = strComparableList26.isEmpty();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test568");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int5 = strComparableList3.indexOf((java.lang.Object) (-7));
        strComparableList3.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        int int13 = strComparableList9.indexOf((java.lang.Object) (-1.0d));
        boolean boolean14 = strComparableList3.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableList16.size();
        boolean boolean19 = strComparableList3.remove((java.lang.Object) strComparableList16);
        boolean boolean21 = strComparableList3.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList3);
        boolean boolean23 = strComparableList3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList3.add((int) '#', (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:35, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test569");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList2.remove((int) (byte) 0);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList21 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int25 = strComparableList21.indexOf((java.lang.Object) 10.0f);
        int int26 = strComparableList21.size();
        boolean boolean27 = strComparableList21.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int30 = strComparableList28.indexOf((java.lang.Object) (-7));
        boolean boolean31 = strComparableList21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList28);
        boolean boolean33 = strComparableList21.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int34 = strComparableList21.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean38 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean39 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int41 = strComparableList37.indexOf((java.lang.Object) 10.0f);
        int int42 = strComparableList37.size();
        boolean boolean43 = strComparableList37.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int46 = strComparableList44.indexOf((java.lang.Object) (-7));
        boolean boolean47 = strComparableList37.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        boolean boolean48 = strComparableList21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        boolean boolean49 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        java.lang.Comparable<java.lang.String> strComparable51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable52 = strComparableList37.set(8, strComparable51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:8, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test570");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        boolean boolean4 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList7 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean8 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList7.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList7.remove((java.lang.Object) 10.0f);
        boolean boolean12 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList7);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList0.remove(0);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList0);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test571");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        int int7 = strComparableList2.size();
        boolean boolean8 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int11 = strComparableList9.indexOf((java.lang.Object) (-7));
        boolean boolean12 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean14 = strComparableList2.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableList2.getSizeField();
        boolean boolean17 = strComparableList2.remove((java.lang.Object) (byte) 100);
        int int18 = strComparableList2.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList21 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean22 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableList21.add((java.lang.Comparable<java.lang.String>) "");
        int int24 = strComparableList21.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Object> objList25 = new DataStructures.commonscollections.TreeList<java.lang.Object>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList21);
        strComparableList21.clear();
        boolean boolean27 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList21);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator28 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList21.replaceAll(strComparableUnaryOperator28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test572");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList0.set((-2), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-2, size=2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test573");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.remove((java.lang.Object) (short) 1);
        strComparableList2.clear();
        strComparableList2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable20 = strComparableList2.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test574");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.remove((java.lang.Object) 10.0f);
        boolean boolean8 = strComparableList2.remove((java.lang.Object) 0);
        boolean boolean9 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList11.size();
        boolean boolean14 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableList15.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList18);
        boolean boolean24 = strComparableList2.remove((java.lang.Object) strComparableList15);
        boolean boolean25 = strComparableList15.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "");
        int int31 = strComparableList28.getSizeField();
        int int33 = strComparableList28.indexOf((java.lang.Object) 0.0f);
        boolean boolean35 = strComparableList28.removeElem((java.lang.Comparable<java.lang.String>) "");
        strComparableList28.clear();
        boolean boolean37 = strComparableList15.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable40 = strComparableList15.set(2, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:2, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test575");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int5 = strComparableList3.indexOf((java.lang.Object) (-7));
        strComparableList3.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableList3.add((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableList15.indexOf((java.lang.Object) 10.0f);
        int int20 = strComparableList15.size();
        boolean boolean21 = strComparableList3.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        boolean boolean22 = strComparableList0.remove((java.lang.Object) strComparableList15);
        int int23 = strComparableList0.getSizeField();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean28 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int30 = strComparableList26.indexOf((java.lang.Object) 10.0f);
        int int31 = strComparableList26.size();
        boolean boolean32 = strComparableList26.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList33 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int35 = strComparableList33.indexOf((java.lang.Object) (-7));
        boolean boolean36 = strComparableList26.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList33);
        boolean boolean38 = strComparableList26.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int39 = strComparableList26.size();
        boolean boolean40 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList43 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean44 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean45 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int47 = strComparableList43.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList50 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean51 = strComparableList50.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableList50.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int54 = strComparableList50.indexOf((java.lang.Object) (-3));
        boolean boolean55 = strComparableList43.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList50);
        boolean boolean57 = strComparableList43.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList43.clear();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean62 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean63 = strComparableList61.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int65 = strComparableList61.indexOf((java.lang.Object) (-3));
        int int66 = strComparableList43.indexOf((java.lang.Object) strComparableList61);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList67 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int69 = strComparableList67.indexOf((java.lang.Object) (-7));
        strComparableList67.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int74 = strComparableList67.indexOf((java.lang.Object) false);
        int int75 = strComparableList67.getSizeField();
        int int76 = strComparableList67.getSizeField();
        boolean boolean77 = strComparableList61.remove((java.lang.Object) strComparableList67);
        boolean boolean79 = strComparableList67.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList67.clear();
        boolean boolean81 = strComparableList67.isEmpty();
        int int82 = strComparableList67.size();
        boolean boolean83 = strComparableList26.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList67);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList84 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList67);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList87 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean88 = strComparableList87.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean89 = strComparableList87.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean91 = strComparableList87.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList87.clear();
        int int93 = strComparableList84.indexOf((java.lang.Object) strComparableList87);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test576");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        strComparableList0.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean11 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableList10.getSizeField();
        boolean boolean14 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
        int int15 = strComparableList10.size();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableList18.indexOf((java.lang.Object) 10.0f);
        int int23 = strComparableList18.size();
        boolean boolean24 = strComparableList18.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList25 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int27 = strComparableList25.indexOf((java.lang.Object) (-7));
        boolean boolean28 = strComparableList18.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList25);
        boolean boolean30 = strComparableList18.removeElem((java.lang.Comparable<java.lang.String>) "");
        int int31 = strComparableList18.getSizeField();
        int int32 = strComparableList18.size();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList35 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean36 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean37 = strComparableList35.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean39 = strComparableList35.remove((java.lang.Object) 10.0f);
        boolean boolean41 = strComparableList35.remove((java.lang.Object) 0);
        boolean boolean42 = strComparableList35.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean45 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int46 = strComparableList44.size();
        boolean boolean47 = strComparableList35.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList48 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList51 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean52 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean53 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean55 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean56 = strComparableList48.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList51);
        boolean boolean57 = strComparableList35.remove((java.lang.Object) strComparableList48);
        boolean boolean58 = strComparableList48.isEmpty();
        boolean boolean60 = strComparableList48.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        int int61 = strComparableList18.indexOf((java.lang.Object) strComparableList48);
        boolean boolean63 = strComparableList48.add((java.lang.Comparable<java.lang.String>) "");
        int int64 = strComparableList10.indexOf((java.lang.Object) strComparableList48);
        boolean boolean65 = strComparableList10.isEmpty();
        int int66 = strComparableList10.getSizeField();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test577");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableList0.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList4 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean5 = strComparableList4.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList4.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableList4.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableList11.indexOf((java.lang.Object) (-3));
        boolean boolean16 = strComparableList4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList19 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean20 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int23 = strComparableList19.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList26.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int30 = strComparableList26.indexOf((java.lang.Object) (-3));
        boolean boolean31 = strComparableList19.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean33 = strComparableList19.add((java.lang.Comparable<java.lang.String>) "");
        int int34 = strComparableList4.indexOf((java.lang.Object) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean38 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean39 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean41 = strComparableList37.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean45 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean46 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean48 = strComparableList44.add((java.lang.Comparable<java.lang.String>) "");
        int int49 = strComparableList37.indexOf((java.lang.Object) strComparableList44);
        boolean boolean50 = strComparableList4.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        java.lang.Comparable<java.lang.String> strComparable52 = strComparableList4.remove(4);
        boolean boolean53 = strComparableList0.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList4);
        java.lang.Comparable<java.lang.String> strComparable55 = strComparableList0.remove(0);
        strComparableList0.clear();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test578");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) 10.0f);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean10 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList9.indexOf((java.lang.Object) (-3));
        boolean boolean14 = strComparableList2.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean16 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableList2.clear();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableList20.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int24 = strComparableList20.indexOf((java.lang.Object) (-3));
        int int25 = strComparableList2.indexOf((java.lang.Object) strComparableList20);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int28 = strComparableList26.indexOf((java.lang.Object) (-7));
        strComparableList26.add(0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int33 = strComparableList26.indexOf((java.lang.Object) false);
        int int34 = strComparableList26.getSizeField();
        int int35 = strComparableList26.getSizeField();
        boolean boolean36 = strComparableList20.remove((java.lang.Object) strComparableList26);
        boolean boolean38 = strComparableList26.removeElem((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList26.add((-8), (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:-8, size=1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test579");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableList2.indexOf((java.lang.Object) (-3));
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList7 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        int int9 = strComparableList2.size();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test580");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.remove((java.lang.Object) 10.0f);
        boolean boolean8 = strComparableList2.remove((java.lang.Object) 0);
        boolean boolean9 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList11.size();
        boolean boolean14 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int18 = strComparableList16.indexOf((java.lang.Object) (-7));
        boolean boolean20 = strComparableList16.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList23 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean24 = strComparableList23.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean25 = strComparableList23.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean27 = strComparableList23.remove((java.lang.Object) 10.0f);
        boolean boolean28 = strComparableList16.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList23);
        boolean boolean30 = strComparableList16.removeElem((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableList11.addAll(1, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator32 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList11.replaceAll(strComparableUnaryOperator32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test581");
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        int int2 = strComparableList0.indexOf((java.lang.Object) (-7));
        boolean boolean4 = strComparableList0.removeElem((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableList0.isEmpty();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test582");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.remove((java.lang.Object) 10.0f);
        boolean boolean8 = strComparableList2.remove((java.lang.Object) 0);
        boolean boolean9 = strComparableList2.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean12 = strComparableList11.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableList11.size();
        boolean boolean14 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean19 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableList15.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList18);
        boolean boolean24 = strComparableList2.remove((java.lang.Object) strComparableList15);
        boolean boolean25 = strComparableList15.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "");
        int int31 = strComparableList28.getSizeField();
        int int33 = strComparableList28.indexOf((java.lang.Object) 0.0f);
        boolean boolean35 = strComparableList28.removeElem((java.lang.Comparable<java.lang.String>) "");
        strComparableList28.clear();
        boolean boolean37 = strComparableList15.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList28);
        boolean boolean39 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "");
        int int40 = strComparableList28.getSizeField();
        boolean boolean42 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TreeListTester1.test583");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableList2.remove((java.lang.Object) 10.0f);
        boolean boolean8 = strComparableList2.remove((java.lang.Object) 0);
        boolean boolean9 = strComparableList2.isEmpty();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList13 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableList13.remove((java.lang.Object) 10.0f);
        boolean boolean18 = strComparableList2.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        boolean boolean19 = strComparableList13.isEmpty();
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>> strComparableList21 = new DataStructures.commonscollections.TreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
    }
}

