package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NodeCachingLinkedListTester1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test501");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        int int7 = strComparableList1.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList9.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray21 = strComparableList9.toArray(objArray20);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean25 = strComparableList23.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableList23.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList30 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean32 = strComparableList30.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean36 = strComparableList34.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean38 = strComparableList34.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray46 = strComparableList34.toArray(objArray45);
        boolean boolean48 = strComparableList34.equals((java.lang.Object) 0.0f);
        boolean boolean49 = strComparableList30.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList34);
        boolean boolean50 = strComparableList23.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList30);
        boolean boolean51 = strComparableList23.isEmpty();
        boolean boolean52 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList23);
        java.lang.Comparable<java.lang.String> strComparable55 = strComparableList23.set((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        int int57 = strComparableList23.indexOf((java.lang.Object) (-1.0f));
        boolean boolean59 = strComparableList23.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean63 = strComparableList61.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean65 = strComparableList61.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList67 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean boolean68 = strComparableList61.contains((java.lang.Object) '#');
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList70 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList71 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList70);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList72 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList71);
        boolean boolean73 = strComparableList61.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList71);
        boolean boolean74 = strComparableList23.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList71);
        boolean boolean75 = strComparableList1.contains((java.lang.Object) strComparableList23);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test502");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        boolean boolean8 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList1.isEmpty();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test503");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList22.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray34 = strComparableList22.toArray(objArray33);
        boolean boolean36 = strComparableList22.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray37 = strComparableList22.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList39 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean41 = strComparableList39.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList43 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean45 = strComparableList43.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean47 = strComparableList43.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray54 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray55 = strComparableList43.toArray(objArray54);
        boolean boolean57 = strComparableList43.equals((java.lang.Object) 0.0f);
        boolean boolean58 = strComparableList39.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList43);
        boolean boolean59 = strComparableList22.contains((java.lang.Object) strComparableList39);
        boolean boolean60 = strComparableList5.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList5.add((-3), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-3) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test504");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList22.contains((java.lang.Object) 100L);
        boolean boolean27 = strComparableList5.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean28 = strComparableList5.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList29 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test505");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableList5.getLast();
        boolean boolean12 = strComparableList5.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Object[] objArray13 = strComparableList5.toArray();
        boolean boolean14 = strComparableList2.equals((java.lang.Object) strComparableList5);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList5.removeLast();
        boolean boolean17 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test506");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList5.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean46 = strComparableList44.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList44.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray55 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray56 = strComparableList44.toArray(objArray55);
        java.lang.Comparable<java.lang.String> strComparable57 = strComparableList44.removeFirst();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList59 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean60 = strComparableList59.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean61 = strComparableList44.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList59);
        boolean boolean62 = strComparableList22.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        boolean boolean64 = strComparableList22.contains((java.lang.Object) 1.0d);
        int int65 = strComparableList22.size();
        strComparableList22.clear();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test507");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        boolean boolean15 = strComparableList1.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean20 = strComparableList18.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList22.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray34 = strComparableList22.toArray(objArray33);
        boolean boolean36 = strComparableList22.equals((java.lang.Object) 0.0f);
        boolean boolean37 = strComparableList18.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean38 = strComparableList1.contains((java.lang.Object) strComparableList18);
        java.lang.Comparable<java.lang.String> strComparable39 = null;
        boolean boolean40 = strComparableList1.addFirst(strComparable39);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList43 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean45 = strComparableList43.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList47 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean49 = strComparableList47.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean51 = strComparableList47.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray59 = strComparableList47.toArray(objArray58);
        boolean boolean61 = strComparableList47.equals((java.lang.Object) 0.0f);
        boolean boolean62 = strComparableList43.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList47);
        boolean boolean64 = strComparableList47.contains((java.lang.Object) 1L);
        strComparableList47.clear();
        boolean boolean66 = strComparableList1.addAll(0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable68 = strComparableList47.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test508");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        boolean boolean22 = strComparableList5.contains((java.lang.Object) 1L);
        strComparableList5.clear();
        boolean boolean25 = strComparableList5.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableList5.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test509");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        int int7 = strComparableList1.getCacheSize();
        boolean boolean9 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test510");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean4 = strComparableList2.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableList2.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray14 = strComparableList2.toArray(objArray13);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList2.removeFirst();
        boolean boolean17 = strComparableList2.addLast((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean21 = strComparableList19.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableList19.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray31 = strComparableList19.toArray(objArray30);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList33 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean35 = strComparableList33.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean37 = strComparableList33.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray45 = strComparableList33.toArray(objArray44);
        java.lang.Object[] objArray46 = strComparableList33.toArray();
        boolean boolean48 = strComparableList33.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean49 = strComparableList19.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList33);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList51 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean53 = strComparableList51.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean57 = strComparableList55.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean59 = strComparableList55.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray67 = strComparableList55.toArray(objArray66);
        boolean boolean69 = strComparableList55.equals((java.lang.Object) 0.0f);
        boolean boolean70 = strComparableList51.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        boolean boolean71 = strComparableList19.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        boolean boolean73 = strComparableList55.equals((java.lang.Object) 1.0f);
        boolean boolean75 = strComparableList55.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean76 = strComparableList2.remove((java.lang.Object) "hi!");
        boolean boolean77 = strComparableList0.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test511");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList15.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean43 = strComparableList15.isEmpty();
        boolean boolean44 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean48 = strComparableList46.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableList46.contains((java.lang.Object) 0.0f);
        strComparableList46.clear();
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray57 = strComparableList46.toArray((java.lang.Comparable<java.lang.String>[]) strArray56);
        boolean boolean58 = strComparableList1.equals((java.lang.Object) strComparableList46);
        int int59 = strComparableList46.getCacheSize();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test512");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList1.removeFirst();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList16 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        strComparableList1.clear();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test513");
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>((int) '4');
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test514");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        int int7 = strComparableList1.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList9.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean18 = strComparableList16.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean22 = strComparableList20.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList20.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray32 = strComparableList20.toArray(objArray31);
        boolean boolean34 = strComparableList20.equals((java.lang.Object) 0.0f);
        boolean boolean35 = strComparableList16.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        boolean boolean36 = strComparableList9.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        boolean boolean37 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        java.lang.Comparable<java.lang.String> strComparable38 = strComparableList1.removeFirst();
        boolean boolean40 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test515");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList1.removeFirst();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList16 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean22 = strComparableList20.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList20.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray32 = strComparableList20.toArray(objArray31);
        boolean boolean34 = strComparableList20.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray35 = strComparableList20.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean39 = strComparableList37.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean43 = strComparableList41.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableList41.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray53 = strComparableList41.toArray(objArray52);
        boolean boolean55 = strComparableList41.equals((java.lang.Object) 0.0f);
        boolean boolean56 = strComparableList37.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList41);
        boolean boolean57 = strComparableList20.contains((java.lang.Object) strComparableList37);
        java.lang.Comparable<java.lang.String> strComparable58 = null;
        boolean boolean59 = strComparableList20.addFirst(strComparable58);
        int int60 = strComparableList1.indexOf((java.lang.Object) strComparable58);
        int int61 = strComparableList1.getCacheSize();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test516");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        boolean boolean15 = strComparableList1.equals((java.lang.Object) 0.0f);
        boolean boolean17 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList1.getFirst();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test517");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean10 = strComparableList8.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean14 = strComparableList12.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList12.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray24 = strComparableList12.toArray(objArray23);
        boolean boolean26 = strComparableList12.equals((java.lang.Object) 0.0f);
        boolean boolean27 = strComparableList8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        boolean boolean28 = strComparableList1.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList30 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean32 = strComparableList30.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean36 = strComparableList34.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean38 = strComparableList34.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray46 = strComparableList34.toArray(objArray45);
        boolean boolean48 = strComparableList34.equals((java.lang.Object) 0.0f);
        boolean boolean49 = strComparableList30.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList34);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList51 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean53 = strComparableList51.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean57 = strComparableList55.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean59 = strComparableList55.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray67 = strComparableList55.toArray(objArray66);
        boolean boolean69 = strComparableList55.equals((java.lang.Object) 0.0f);
        boolean boolean70 = strComparableList51.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        boolean boolean71 = strComparableList34.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList51);
        boolean boolean72 = strComparableList8.equals((java.lang.Object) strComparableList34);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList74 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean76 = strComparableList74.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean78 = strComparableList74.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable79 = strComparableList74.getLast();
        boolean boolean81 = strComparableList74.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Object[] objArray82 = strComparableList74.toArray();
        boolean boolean83 = strComparableList34.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList74);
        int int84 = strComparableList34.getCacheSize();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test518");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test519");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        int int15 = strComparableList1.indexOf((java.lang.Object) 10.0d);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableList1.removeFirst();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test520");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        java.lang.Object[] objArray14 = strComparableList1.toArray();
        boolean boolean16 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableList1.size();
        java.lang.Object[] objArray18 = strComparableList1.toArray();
        strComparableList1.clear();
        boolean boolean20 = strComparableList1.isEmpty();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test521");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList1.removeFirst();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList16 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean17 = strComparableList16.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean22 = strComparableList20.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList20.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray32 = strComparableList20.toArray(objArray31);
        boolean boolean34 = strComparableList20.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray35 = strComparableList20.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean39 = strComparableList37.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean43 = strComparableList41.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableList41.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray53 = strComparableList41.toArray(objArray52);
        boolean boolean55 = strComparableList41.equals((java.lang.Object) 0.0f);
        boolean boolean56 = strComparableList37.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList41);
        boolean boolean57 = strComparableList20.contains((java.lang.Object) strComparableList37);
        java.lang.Comparable<java.lang.String> strComparable58 = null;
        boolean boolean59 = strComparableList20.addFirst(strComparable58);
        int int60 = strComparableList1.indexOf((java.lang.Object) strComparable58);
        boolean boolean61 = strComparableList1.isEmpty();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test522");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        int int4 = strComparableList2.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean8 = strComparableList6.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList6.contains((java.lang.Object) 100L);
        boolean boolean12 = strComparableList6.remove((java.lang.Object) (-2));
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList6.removeFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray27 = strComparableList15.toArray(objArray26);
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableList15.removeFirst();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList30 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean31 = strComparableList30.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean32 = strComparableList15.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList30);
        java.util.AbstractList[] abstractListArray34 = new java.util.AbstractList[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.lang.Comparable<java.lang.String>>[] strComparableListArray35 = (java.util.AbstractList<java.lang.Comparable<java.lang.String>>[]) abstractListArray34;
        strComparableListArray35[0] = strComparableList30;
        java.util.AbstractList<java.lang.Comparable<java.lang.String>>[] strComparableListArray38 = strComparableList6.toArray(strComparableListArray35);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean42 = strComparableList40.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableList40.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray52 = strComparableList40.toArray(objArray51);
        java.lang.Comparable<java.lang.String> strComparable53 = strComparableList40.removeFirst();
        int int54 = strComparableList6.lastIndexOf((java.lang.Object) strComparable53);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList57 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList58 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList57);
        int int59 = strComparableList57.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean63 = strComparableList61.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean65 = strComparableList61.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable66 = strComparableList61.getLast();
        boolean boolean68 = strComparableList61.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Object[] objArray69 = strComparableList61.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList71 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean73 = strComparableList71.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean75 = strComparableList71.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray82 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray83 = strComparableList71.toArray(objArray82);
        java.lang.Object[] objArray84 = strComparableList71.toArray();
        boolean boolean85 = strComparableList61.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList71);
        boolean boolean86 = strComparableList57.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList61);
        boolean boolean87 = strComparableList6.addAll((int) (short) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList57);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String[]> strArrayList89 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String[]>((-3));
        int int90 = strComparableList57.lastIndexOf((java.lang.Object) (-3));
        boolean boolean91 = strComparableList2.remove((java.lang.Object) (-3));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test523");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        int int21 = strComparableList1.size();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableList1.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean27 = strComparableList25.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean29 = strComparableList25.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray37 = strComparableList25.toArray(objArray36);
        java.lang.Object[] objArray38 = strComparableList25.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean42 = strComparableList40.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean46 = strComparableList44.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList44.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray55 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray56 = strComparableList44.toArray(objArray55);
        boolean boolean58 = strComparableList44.equals((java.lang.Object) 0.0f);
        boolean boolean59 = strComparableList40.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean63 = strComparableList61.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList65 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean67 = strComparableList65.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean69 = strComparableList65.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray76 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray77 = strComparableList65.toArray(objArray76);
        boolean boolean79 = strComparableList65.equals((java.lang.Object) 0.0f);
        boolean boolean80 = strComparableList61.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList65);
        boolean boolean81 = strComparableList44.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList61);
        boolean boolean82 = strComparableList25.contains((java.lang.Object) boolean81);
        int int83 = strComparableList25.getCacheSize();
        strComparableList25.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = strComparableList1.addAll((int) '4', (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (52) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test524");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean10 = strComparableList8.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean14 = strComparableList12.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList12.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray24 = strComparableList12.toArray(objArray23);
        boolean boolean26 = strComparableList12.equals((java.lang.Object) 0.0f);
        boolean boolean27 = strComparableList8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        boolean boolean28 = strComparableList1.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        boolean boolean30 = strComparableList8.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean32 = strComparableList8.remove((java.lang.Object) (byte) -1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test525");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.getFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test526");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean10 = strComparableList8.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean14 = strComparableList12.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList12.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray24 = strComparableList12.toArray(objArray23);
        boolean boolean26 = strComparableList12.equals((java.lang.Object) 0.0f);
        boolean boolean27 = strComparableList8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        boolean boolean28 = strComparableList1.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableList1.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean33 = strComparableList31.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean37 = strComparableList35.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean39 = strComparableList35.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray47 = strComparableList35.toArray(objArray46);
        boolean boolean49 = strComparableList35.equals((java.lang.Object) 0.0f);
        boolean boolean50 = strComparableList31.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList35);
        boolean boolean52 = strComparableList35.contains((java.lang.Object) 1L);
        strComparableList35.clear();
        boolean boolean55 = strComparableList35.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList57 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean59 = strComparableList57.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean61 = strComparableList57.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable62 = strComparableList57.getLast();
        boolean boolean64 = strComparableList57.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Object[] objArray65 = strComparableList57.toArray();
        java.lang.Object[] objArray66 = strComparableList35.toArray(objArray65);
        int int67 = strComparableList1.lastIndexOf((java.lang.Object) objArray65);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test527");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.clear();
        boolean boolean6 = strComparableList1.contains((java.lang.Object) (-8));
        boolean boolean8 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strComparableList1.addAll(strComparableCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test528");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        boolean boolean7 = strComparableList6.isEmpty();
        boolean boolean9 = strComparableList6.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test529");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        boolean boolean15 = strComparableList1.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean20 = strComparableList18.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList22.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray34 = strComparableList22.toArray(objArray33);
        boolean boolean36 = strComparableList22.equals((java.lang.Object) 0.0f);
        boolean boolean37 = strComparableList18.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean38 = strComparableList1.contains((java.lang.Object) strComparableList18);
        java.lang.Comparable<java.lang.String> strComparable39 = null;
        boolean boolean40 = strComparableList1.addFirst(strComparable39);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList43 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean45 = strComparableList43.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList47 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean49 = strComparableList47.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean51 = strComparableList47.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray59 = strComparableList47.toArray(objArray58);
        boolean boolean61 = strComparableList47.equals((java.lang.Object) 0.0f);
        boolean boolean62 = strComparableList43.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList47);
        boolean boolean64 = strComparableList47.contains((java.lang.Object) 1L);
        strComparableList47.clear();
        boolean boolean66 = strComparableList1.addAll(0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList47);
        int int67 = strComparableList1.size();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator68 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test530");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        java.lang.Object[] objArray14 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean18 = strComparableList16.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableList16.contains((java.lang.Object) 0.0f);
        boolean boolean21 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        strComparableList16.clear();
        int int23 = strComparableList16.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean27 = strComparableList25.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableList25.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList30 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean32 = strComparableList30.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean34 = strComparableList30.contains((java.lang.Object) 0.0f);
        java.lang.Object[] objArray35 = strComparableList30.toArray();
        boolean boolean36 = strComparableList25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList30);
        java.lang.Comparable<java.lang.String> strComparable37 = strComparableList25.getLast();
        boolean boolean38 = strComparableList16.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList25);
        int int39 = strComparableList25.size();
        strComparableList25.clear();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test531");
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(strComparableCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test532");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList7 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean boolean8 = strComparableList1.contains((java.lang.Object) '#');
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        int int13 = strComparableList1.indexOf((java.lang.Object) strComparableList11);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableList15.getLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean26 = strComparableList24.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList24.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableList24.getLast();
        boolean boolean31 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean32 = strComparableList24.isEmpty();
        boolean boolean34 = strComparableList24.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean35 = strComparableList22.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean36 = strComparableList15.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean37 = strComparableList11.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        strComparableList11.clear();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test533");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-2));
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean5 = strComparableList3.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList3.clear();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean10 = strComparableList8.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList8.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray20 = strComparableList8.toArray(objArray19);
        java.lang.Object[] objArray21 = strComparableList8.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean25 = strComparableList23.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableList23.contains((java.lang.Object) 0.0f);
        boolean boolean28 = strComparableList8.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList23);
        boolean boolean29 = strComparableList3.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        int int30 = strComparableList3.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean34 = strComparableList32.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList32.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray44 = strComparableList32.toArray(objArray43);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean48 = strComparableList46.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableList46.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray58 = strComparableList46.toArray(objArray57);
        java.lang.Object[] objArray59 = strComparableList46.toArray();
        boolean boolean61 = strComparableList46.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean62 = strComparableList32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList46);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean66 = strComparableList64.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList68 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean70 = strComparableList68.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean72 = strComparableList68.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray79 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray80 = strComparableList68.toArray(objArray79);
        boolean boolean82 = strComparableList68.equals((java.lang.Object) 0.0f);
        boolean boolean83 = strComparableList64.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList68);
        boolean boolean84 = strComparableList32.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList68);
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection85 = null;
        boolean boolean86 = strComparableList32.retainAll(strComparableCollection85);
        boolean boolean87 = strComparableList3.equals((java.lang.Object) boolean86);
        boolean boolean88 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList3);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test534");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList5.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean46 = strComparableList44.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList44.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray55 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray56 = strComparableList44.toArray(objArray55);
        java.lang.Comparable<java.lang.String> strComparable57 = strComparableList44.removeFirst();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList59 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean60 = strComparableList59.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean61 = strComparableList44.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList59);
        boolean boolean62 = strComparableList22.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList22.add((-9), (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test535");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray27 = strComparableList15.toArray(objArray26);
        java.lang.Object[] objArray28 = strComparableList15.toArray();
        boolean boolean30 = strComparableList15.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableList1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList33 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean35 = strComparableList33.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean39 = strComparableList37.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean41 = strComparableList37.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray49 = strComparableList37.toArray(objArray48);
        boolean boolean51 = strComparableList37.equals((java.lang.Object) 0.0f);
        boolean boolean52 = strComparableList33.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        boolean boolean53 = strComparableList1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean57 = strComparableList55.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean59 = strComparableList55.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList60 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        int int62 = strComparableList55.indexOf((java.lang.Object) (-10));
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean66 = strComparableList64.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean68 = strComparableList64.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray75 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray76 = strComparableList64.toArray(objArray75);
        java.lang.Object[] objArray77 = strComparableList64.toArray();
        int int78 = strComparableList55.indexOf((java.lang.Object) strComparableList64);
        boolean boolean79 = strComparableList55.isEmpty();
        java.lang.Object[] objArray80 = strComparableList55.toArray();
        boolean boolean81 = strComparableList1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        boolean boolean82 = strComparableList1.isEmpty();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test536");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        java.lang.Object[] objArray14 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean18 = strComparableList16.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableList16.contains((java.lang.Object) 0.0f);
        boolean boolean21 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableList16.removeLast();
        java.lang.Object[] objArray23 = strComparableList16.toArray();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test537");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableList9.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean16 = strComparableList14.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList14.contains((java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = strComparableList14.toArray();
        boolean boolean20 = strComparableList9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
        boolean boolean21 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable23 = strComparableList1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test538");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        int int15 = strComparableList1.indexOf((java.lang.Object) 10.0d);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean19 = strComparableList17.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList21 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean23 = strComparableList21.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean25 = strComparableList21.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray33 = strComparableList21.toArray(objArray32);
        boolean boolean35 = strComparableList21.equals((java.lang.Object) 0.0f);
        boolean boolean36 = strComparableList17.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList21);
        java.lang.Comparable<java.lang.String> strComparable37 = strComparableList21.getLast();
        boolean boolean39 = strComparableList21.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean40 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList21);
        java.lang.Comparable<java.lang.String> strComparable41 = strComparableList1.removeFirst();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test539");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object[][]> objArrayList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object[][]>((-6));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test540");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        boolean boolean7 = strComparableList1.remove((java.lang.Object) (-2));
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList1.removeFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean12 = strComparableList10.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList10.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList10.getLast();
        boolean boolean17 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableList10.isEmpty();
        int int19 = strComparableList10.size();
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList22.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList27 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList29 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean31 = strComparableList29.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean33 = strComparableList29.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        int int35 = strComparableList29.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean39 = strComparableList37.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean41 = strComparableList37.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean46 = strComparableList44.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList48 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean50 = strComparableList48.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableList48.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray59 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray60 = strComparableList48.toArray(objArray59);
        boolean boolean62 = strComparableList48.equals((java.lang.Object) 0.0f);
        boolean boolean63 = strComparableList44.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList48);
        boolean boolean64 = strComparableList37.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        boolean boolean65 = strComparableList29.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        strComparableList44.add(1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean69 = strComparableList22.remove((java.lang.Object) 1);
        boolean boolean70 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test541");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList15.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean43 = strComparableList15.isEmpty();
        boolean boolean44 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        java.lang.Comparable<java.lang.String> strComparable47 = strComparableList15.set((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        int int49 = strComparableList15.indexOf((java.lang.Object) (-1.0f));
        boolean boolean51 = strComparableList15.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList53 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean55 = strComparableList53.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean57 = strComparableList53.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList59 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean boolean60 = strComparableList53.contains((java.lang.Object) '#');
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList62 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList63 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList62);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList63);
        boolean boolean65 = strComparableList53.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList63);
        boolean boolean66 = strComparableList15.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable67 = strComparableList63.getFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test542");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableList9.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean16 = strComparableList14.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList14.contains((java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = strComparableList14.toArray();
        boolean boolean20 = strComparableList9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
        boolean boolean21 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableList14.getFirst();
        strComparableList14.clear();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test543");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList9.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray21 = strComparableList9.toArray(objArray20);
        java.lang.Object[] objArray22 = strComparableList9.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean26 = strComparableList24.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList24.contains((java.lang.Object) 0.0f);
        boolean boolean29 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean30 = strComparableList1.remove((java.lang.Object) strComparableList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean34 = strComparableList32.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList32.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable37 = strComparableList32.getLast();
        java.lang.Comparable<java.lang.String> strComparable38 = strComparableList32.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean42 = strComparableList40.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableList40.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray52 = strComparableList40.toArray(objArray51);
        java.lang.Object[] objArray53 = strComparableList40.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean57 = strComparableList55.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean59 = strComparableList55.contains((java.lang.Object) 0.0f);
        boolean boolean60 = strComparableList40.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        boolean boolean61 = strComparableList32.remove((java.lang.Object) strComparableList55);
        boolean boolean62 = strComparableList1.equals((java.lang.Object) strComparableList32);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean66 = strComparableList64.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean68 = strComparableList64.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable69 = strComparableList64.getLast();
        boolean boolean71 = strComparableList64.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean72 = strComparableList64.isEmpty();
        boolean boolean73 = strComparableList32.equals((java.lang.Object) strComparableList64);
        java.lang.Object[] objArray74 = strComparableList64.toArray();
        java.lang.Comparable<java.lang.String> strComparable75 = strComparableList64.getLast();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test544");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableList5.size();
        boolean boolean10 = strComparableList5.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean14 = strComparableList12.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList12.clear();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean19 = strComparableList17.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableList17.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray29 = strComparableList17.toArray(objArray28);
        java.lang.Object[] objArray30 = strComparableList17.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean34 = strComparableList32.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList32.contains((java.lang.Object) 0.0f);
        boolean boolean37 = strComparableList17.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList32);
        boolean boolean38 = strComparableList12.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList17);
        int int39 = strComparableList12.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean43 = strComparableList41.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableList41.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray53 = strComparableList41.toArray(objArray52);
        java.lang.Object[] objArray54 = strComparableList41.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean58 = strComparableList56.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean60 = strComparableList56.contains((java.lang.Object) 0.0f);
        boolean boolean61 = strComparableList41.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList56);
        strComparableList56.clear();
        boolean boolean63 = strComparableList12.equals((java.lang.Object) strComparableList56);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        boolean boolean65 = strComparableList5.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        boolean boolean66 = strComparableList3.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable68 = strComparableList12.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (1) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test545");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableList9.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean16 = strComparableList14.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList14.contains((java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = strComparableList14.toArray();
        boolean boolean20 = strComparableList9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
        boolean boolean21 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
        strComparableList1.clear();
        boolean boolean23 = strComparableList1.isEmpty();
        boolean boolean24 = strComparableList1.isEmpty();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test546");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        int int7 = strComparableList1.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList9.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean18 = strComparableList16.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean22 = strComparableList20.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList20.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray32 = strComparableList20.toArray(objArray31);
        boolean boolean34 = strComparableList20.equals((java.lang.Object) 0.0f);
        boolean boolean35 = strComparableList16.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        boolean boolean36 = strComparableList9.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        boolean boolean37 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        int int38 = strComparableList16.getCacheSize();
        boolean boolean40 = strComparableList16.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test547");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test548");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        boolean boolean8 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList1.isEmpty();
        boolean boolean11 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList1.getFirst();
        boolean boolean14 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test549");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        boolean boolean15 = strComparableList1.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean20 = strComparableList18.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList22.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray34 = strComparableList22.toArray(objArray33);
        boolean boolean36 = strComparableList22.equals((java.lang.Object) 0.0f);
        boolean boolean37 = strComparableList18.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean38 = strComparableList1.contains((java.lang.Object) strComparableList18);
        java.lang.Object obj39 = null;
        int int40 = strComparableList18.indexOf(obj39);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test550");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList5.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean46 = strComparableList44.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList48 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean50 = strComparableList48.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean52 = strComparableList48.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray59 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray60 = strComparableList48.toArray(objArray59);
        boolean boolean62 = strComparableList48.equals((java.lang.Object) 0.0f);
        boolean boolean63 = strComparableList44.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList48);
        boolean boolean65 = strComparableList48.contains((java.lang.Object) 1L);
        strComparableList48.clear();
        boolean boolean67 = strComparableList5.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList48);
        java.lang.Object[] objArray68 = strComparableList48.toArray();
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection69 = null;
        boolean boolean70 = strComparableList48.removeAll(strComparableCollection69);
        boolean boolean72 = strComparableList48.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test551");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList5.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean44 = strComparableList22.contains((java.lang.Object) "hi!");
        boolean boolean46 = strComparableList22.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test552");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList7 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean boolean8 = strComparableList1.contains((java.lang.Object) '#');
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        int int13 = strComparableList1.indexOf((java.lang.Object) strComparableList11);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableList15.getLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean26 = strComparableList24.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList24.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableList24.getLast();
        boolean boolean31 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean32 = strComparableList24.isEmpty();
        boolean boolean34 = strComparableList24.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean35 = strComparableList22.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean36 = strComparableList15.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean37 = strComparableList11.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable38 = strComparableList11.getFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test553");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean5 = strComparableList3.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList7 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean9 = strComparableList7.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableList7.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray19 = strComparableList7.toArray(objArray18);
        boolean boolean21 = strComparableList7.equals((java.lang.Object) 0.0f);
        boolean boolean22 = strComparableList3.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList7);
        int int23 = strComparableList1.indexOf((java.lang.Object) strComparableList7);
        boolean boolean25 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList27 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean29 = strComparableList27.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableList27.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray39 = strComparableList27.toArray(objArray38);
        java.lang.Object[] objArray40 = strComparableList27.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean44 = strComparableList42.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean48 = strComparableList46.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableList46.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray57 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray58 = strComparableList46.toArray(objArray57);
        boolean boolean60 = strComparableList46.equals((java.lang.Object) 0.0f);
        boolean boolean61 = strComparableList42.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList46);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList63 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean65 = strComparableList63.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList67 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean69 = strComparableList67.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean71 = strComparableList67.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray78 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray79 = strComparableList67.toArray(objArray78);
        boolean boolean81 = strComparableList67.equals((java.lang.Object) 0.0f);
        boolean boolean82 = strComparableList63.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList67);
        boolean boolean83 = strComparableList46.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList63);
        boolean boolean84 = strComparableList27.contains((java.lang.Object) boolean83);
        boolean boolean85 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList27);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test554");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        boolean boolean15 = strComparableList1.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean20 = strComparableList18.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList22.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray34 = strComparableList22.toArray(objArray33);
        boolean boolean36 = strComparableList22.equals((java.lang.Object) 0.0f);
        boolean boolean37 = strComparableList18.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean38 = strComparableList1.contains((java.lang.Object) strComparableList18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable40 = strComparableList1.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (10) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test555");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableList9.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean16 = strComparableList14.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableList14.contains((java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = strComparableList14.toArray();
        boolean boolean20 = strComparableList9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
        boolean boolean21 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable23 = strComparableList1.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (6) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test556");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray27 = strComparableList15.toArray(objArray26);
        java.lang.Object[] objArray28 = strComparableList15.toArray();
        boolean boolean30 = strComparableList15.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableList1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        java.lang.Comparable<java.lang.String> strComparable32 = strComparableList15.getFirst();
        java.lang.Comparable<java.lang.String> strComparable33 = strComparableList15.removeFirst();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test557");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        boolean boolean8 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Object[] objArray9 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean13 = strComparableList11.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList11.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray23 = strComparableList11.toArray(objArray22);
        java.lang.Object[] objArray24 = strComparableList11.toArray();
        boolean boolean25 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        int int26 = strComparableList1.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((-9));
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList30 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean32 = strComparableList30.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean34 = strComparableList30.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean39 = strComparableList37.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean43 = strComparableList41.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableList41.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray53 = strComparableList41.toArray(objArray52);
        boolean boolean55 = strComparableList41.equals((java.lang.Object) 0.0f);
        boolean boolean56 = strComparableList37.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList41);
        boolean boolean57 = strComparableList30.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        java.lang.Comparable<java.lang.String> strComparable58 = strComparableList37.removeLast();
        boolean boolean60 = strComparableList37.equals((java.lang.Object) 10L);
        boolean boolean61 = strComparableList28.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        int int62 = strComparableList1.indexOf((java.lang.Object) boolean61);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test558");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.clear();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean8 = strComparableList6.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList6.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray18 = strComparableList6.toArray(objArray17);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean22 = strComparableList20.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList20.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray32 = strComparableList20.toArray(objArray31);
        java.lang.Object[] objArray33 = strComparableList20.toArray();
        boolean boolean35 = strComparableList20.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList6.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean40 = strComparableList38.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean44 = strComparableList42.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean46 = strComparableList42.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray54 = strComparableList42.toArray(objArray53);
        boolean boolean56 = strComparableList42.equals((java.lang.Object) 0.0f);
        boolean boolean57 = strComparableList38.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList42);
        boolean boolean58 = strComparableList6.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList42);
        boolean boolean59 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList42);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList61 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean63 = strComparableList61.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean65 = strComparableList61.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList66 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList61);
        int int68 = strComparableList61.indexOf((java.lang.Object) (-10));
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList70 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean72 = strComparableList70.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean74 = strComparableList70.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray81 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray82 = strComparableList70.toArray(objArray81);
        java.lang.Object[] objArray83 = strComparableList70.toArray();
        int int84 = strComparableList61.indexOf((java.lang.Object) strComparableList70);
        boolean boolean86 = strComparableList70.equals((java.lang.Object) 0L);
        boolean boolean87 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList70);
        boolean boolean89 = strComparableList70.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable91 = strComparableList70.get(0);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test559");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList15.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean43 = strComparableList15.isEmpty();
        boolean boolean44 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        java.lang.Comparable<java.lang.String> strComparable47 = strComparableList15.set((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        int int49 = strComparableList15.indexOf((java.lang.Object) (-1.0f));
        java.lang.Comparable<java.lang.String> strComparable50 = strComparableList15.getLast();
        boolean boolean52 = strComparableList15.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean53 = strComparableList15.isEmpty();
        boolean boolean55 = strComparableList15.add((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test560");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        int int3 = strComparableList2.size();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test561");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList7 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean9 = strComparableList7.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean13 = strComparableList11.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList11.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray23 = strComparableList11.toArray(objArray22);
        boolean boolean25 = strComparableList11.equals((java.lang.Object) 0.0f);
        boolean boolean26 = strComparableList7.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean30 = strComparableList28.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean34 = strComparableList32.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList32.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray44 = strComparableList32.toArray(objArray43);
        boolean boolean46 = strComparableList32.equals((java.lang.Object) 0.0f);
        boolean boolean47 = strComparableList28.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList32);
        boolean boolean48 = strComparableList11.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList28);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList50 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean52 = strComparableList50.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int53 = strComparableList50.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean57 = strComparableList55.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean59 = strComparableList55.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList60 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        int int62 = strComparableList55.indexOf((java.lang.Object) (-10));
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean66 = strComparableList64.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean68 = strComparableList64.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray75 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray76 = strComparableList64.toArray(objArray75);
        java.lang.Object[] objArray77 = strComparableList64.toArray();
        int int78 = strComparableList55.indexOf((java.lang.Object) strComparableList64);
        boolean boolean79 = strComparableList50.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList64);
        boolean boolean80 = strComparableList28.equals((java.lang.Object) strComparableList64);
        boolean boolean81 = strComparableList1.remove((java.lang.Object) boolean80);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList83 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) '#');
        int int84 = strComparableList1.lastIndexOf((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Comparable<java.lang.String>> strComparableList87 = strComparableList1.subList(4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test562");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        java.lang.Object[] objArray3 = strComparableList2.toArray();
        boolean boolean5 = strComparableList2.addLast((java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableList2.getCacheSize();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test563");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        boolean boolean8 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Object[] objArray9 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean13 = strComparableList11.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableList11.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray23 = strComparableList11.toArray(objArray22);
        java.lang.Object[] objArray24 = strComparableList11.toArray();
        boolean boolean25 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        java.lang.Comparable<java.lang.String> strComparable26 = strComparableList11.getLast();
        strComparableList11.clear();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test564");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.ArrayList<java.lang.Comparable<java.lang.String>>>((int) 'a');
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test565");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList15.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean43 = strComparableList15.isEmpty();
        boolean boolean44 = strComparableList1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList15);
        java.lang.Comparable<java.lang.String> strComparable47 = strComparableList15.set((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = strComparableList15.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList50 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(5);
        boolean boolean51 = strComparableList15.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList50);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList53 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean55 = strComparableList53.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean57 = strComparableList53.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray65 = strComparableList53.toArray(objArray64);
        java.lang.Object[] objArray66 = strComparableList53.toArray();
        boolean boolean68 = strComparableList53.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList70 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean72 = strComparableList70.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean74 = strComparableList70.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable75 = strComparableList70.getLast();
        boolean boolean77 = strComparableList70.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean78 = strComparableList53.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList70);
        boolean boolean79 = strComparableList15.contains((java.lang.Object) boolean78);
        boolean boolean80 = strComparableList15.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable83 = strComparableList15.set(0, (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test566");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList5.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        int int43 = strComparableList5.size();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test567");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        boolean boolean7 = strComparableList6.isEmpty();
        strComparableList6.clear();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test568");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean10 = strComparableList8.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableList8.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        boolean boolean14 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean18 = strComparableList16.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableList16.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableList16.getLast();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableList16.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean26 = strComparableList24.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList24.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray36 = strComparableList24.toArray(objArray35);
        java.lang.Object[] objArray37 = strComparableList24.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList39 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean41 = strComparableList39.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean43 = strComparableList39.contains((java.lang.Object) 0.0f);
        boolean boolean44 = strComparableList24.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList39);
        boolean boolean45 = strComparableList16.remove((java.lang.Object) strComparableList39);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList47 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean49 = strComparableList47.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean51 = strComparableList47.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable52 = strComparableList47.getLast();
        java.lang.Comparable<java.lang.String> strComparable53 = strComparableList47.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean57 = strComparableList55.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean59 = strComparableList55.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray67 = strComparableList55.toArray(objArray66);
        java.lang.Object[] objArray68 = strComparableList55.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList70 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean72 = strComparableList70.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean74 = strComparableList70.contains((java.lang.Object) 0.0f);
        boolean boolean75 = strComparableList55.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList70);
        boolean boolean76 = strComparableList47.remove((java.lang.Object) strComparableList70);
        boolean boolean77 = strComparableList16.equals((java.lang.Object) strComparableList47);
        boolean boolean78 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList47);
        java.lang.Comparable<java.lang.String> strComparable79 = strComparableList1.getLast();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test569");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        boolean boolean8 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList1.isEmpty();
        boolean boolean11 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean15 = strComparableList13.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableList13.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableList13.getLast();
        boolean boolean20 = strComparableList13.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableList13.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableList13.get(0);
        boolean boolean24 = strComparableList1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        java.lang.Object[] objArray39 = strComparableList26.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean43 = strComparableList41.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableList41.contains((java.lang.Object) 0.0f);
        boolean boolean46 = strComparableList26.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList41);
        boolean boolean47 = strComparableList13.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList49 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean51 = strComparableList49.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean53 = strComparableList49.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray60 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray61 = strComparableList49.toArray(objArray60);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList63 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean65 = strComparableList63.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean67 = strComparableList63.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList70 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean72 = strComparableList70.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList74 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean76 = strComparableList74.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean78 = strComparableList74.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray85 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray86 = strComparableList74.toArray(objArray85);
        boolean boolean88 = strComparableList74.equals((java.lang.Object) 0.0f);
        boolean boolean89 = strComparableList70.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList74);
        boolean boolean90 = strComparableList63.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList70);
        boolean boolean91 = strComparableList63.isEmpty();
        boolean boolean92 = strComparableList49.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList63);
        int int93 = strComparableList49.size();
        boolean boolean94 = strComparableList13.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList49);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test570");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        int int7 = strComparableList1.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList9.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean18 = strComparableList16.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean22 = strComparableList20.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList20.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray32 = strComparableList20.toArray(objArray31);
        boolean boolean34 = strComparableList20.equals((java.lang.Object) 0.0f);
        boolean boolean35 = strComparableList16.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        boolean boolean36 = strComparableList9.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        boolean boolean37 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList16);
        strComparableList16.add(1, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean42 = strComparableList16.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test571");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList2);
        int int4 = strComparableList2.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean8 = strComparableList6.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList6.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray18 = strComparableList6.toArray(objArray17);
        java.lang.Object[] objArray19 = strComparableList6.toArray();
        boolean boolean21 = strComparableList6.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableList6.removeFirst();
        int int23 = strComparableList2.lastIndexOf((java.lang.Object) strComparableList6);
        int int24 = strComparableList6.getCacheSize();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test572");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean5 = strComparableList3.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableList3.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray15 = strComparableList3.toArray(objArray14);
        int int16 = strComparableList1.lastIndexOf((java.lang.Object) objArray14);
        boolean boolean18 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableList1.removeLast();
        strComparableList1.clear();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test573");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean10 = strComparableList8.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean14 = strComparableList12.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList12.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray24 = strComparableList12.toArray(objArray23);
        boolean boolean26 = strComparableList12.equals((java.lang.Object) 0.0f);
        boolean boolean27 = strComparableList8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        boolean boolean28 = strComparableList1.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableList8.removeLast();
        boolean boolean31 = strComparableList8.equals((java.lang.Object) 10L);
        DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>> strComparableListList32 = new DataStructures.commonscollections.NodeCachingLinkedList<DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>>();
        boolean boolean33 = strComparableList8.contains((java.lang.Object) strComparableListList32);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean37 = strComparableList35.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList35.clear();
        boolean boolean40 = strComparableList35.contains((java.lang.Object) (-8));
        boolean boolean41 = strComparableList8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable42 = strComparableList8.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test574");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableList1.removeFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean18 = strComparableList16.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean22 = strComparableList20.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableList20.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray32 = strComparableList20.toArray(objArray31);
        boolean boolean34 = strComparableList20.equals((java.lang.Object) 0.0f);
        boolean boolean35 = strComparableList16.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean39 = strComparableList37.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean43 = strComparableList41.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean45 = strComparableList41.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray53 = strComparableList41.toArray(objArray52);
        boolean boolean55 = strComparableList41.equals((java.lang.Object) 0.0f);
        boolean boolean56 = strComparableList37.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList41);
        boolean boolean57 = strComparableList20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList37);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList59 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean61 = strComparableList59.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean63 = strComparableList59.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray70 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray71 = strComparableList59.toArray(objArray70);
        java.lang.Comparable<java.lang.String> strComparable72 = strComparableList59.removeFirst();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList74 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean75 = strComparableList74.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean76 = strComparableList59.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList74);
        boolean boolean77 = strComparableList37.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList59);
        boolean boolean78 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList59);
        int int80 = strComparableList1.lastIndexOf((java.lang.Object) 100);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList82 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        boolean boolean83 = strComparableList1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList82);
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator84 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList82.replaceAll(strComparableUnaryOperator84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test575");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        boolean boolean7 = strComparableList1.remove((java.lang.Object) (-2));
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList1.removeFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean12 = strComparableList10.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList10.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray22 = strComparableList10.toArray(objArray21);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableList10.removeFirst();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList25 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean26 = strComparableList25.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean27 = strComparableList10.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList25);
        java.util.AbstractList[] abstractListArray29 = new java.util.AbstractList[1];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.lang.Comparable<java.lang.String>>[] strComparableListArray30 = (java.util.AbstractList<java.lang.Comparable<java.lang.String>>[]) abstractListArray29;
        strComparableListArray30[0] = strComparableList25;
        java.util.AbstractList<java.lang.Comparable<java.lang.String>>[] strComparableListArray33 = strComparableList1.toArray(strComparableListArray30);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean37 = strComparableList35.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean39 = strComparableList35.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray47 = strComparableList35.toArray(objArray46);
        java.lang.Comparable<java.lang.String> strComparable48 = strComparableList35.removeFirst();
        int int49 = strComparableList1.lastIndexOf((java.lang.Object) strComparable48);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList51 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean53 = strComparableList51.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean55 = strComparableList51.contains((java.lang.Object) 0.0f);
        strComparableList51.clear();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "", "" };
        java.lang.Comparable<java.lang.String>[] strComparableArray62 = strComparableList51.toArray((java.lang.Comparable<java.lang.String>[]) strArray61);
        boolean boolean63 = strComparableList1.equals((java.lang.Object) strComparableList51);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test576");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        boolean boolean8 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList1.isEmpty();
        boolean boolean11 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean15 = strComparableList13.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableList13.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean20 = strComparableList18.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableList18.contains((java.lang.Object) 0.0f);
        java.lang.Object[] objArray23 = strComparableList18.toArray();
        boolean boolean24 = strComparableList13.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList18);
        boolean boolean26 = strComparableList13.add((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean30 = strComparableList28.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean34 = strComparableList32.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList32.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray44 = strComparableList32.toArray(objArray43);
        boolean boolean46 = strComparableList32.equals((java.lang.Object) 0.0f);
        boolean boolean47 = strComparableList28.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList32);
        boolean boolean49 = strComparableList28.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable50 = strComparableList28.removeLast();
        int int51 = strComparableList13.indexOf((java.lang.Object) strComparableList28);
        boolean boolean52 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        java.lang.Comparable<java.lang.String> strComparable53 = strComparableList13.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable54 = strComparableList13.getLast();
        int int55 = strComparableList13.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList57 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean59 = strComparableList57.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean61 = strComparableList57.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList64 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean66 = strComparableList64.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList68 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean70 = strComparableList68.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean72 = strComparableList68.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray79 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray80 = strComparableList68.toArray(objArray79);
        boolean boolean82 = strComparableList68.equals((java.lang.Object) 0.0f);
        boolean boolean83 = strComparableList64.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList68);
        boolean boolean84 = strComparableList57.addAll((int) (byte) 0, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList64);
        boolean boolean85 = strComparableList57.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable86 = strComparableList57.removeLast();
        boolean boolean87 = strComparableList13.remove((java.lang.Object) strComparable86);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test577");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean7 = strComparableList5.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableList5.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray17 = strComparableList5.toArray(objArray16);
        boolean boolean19 = strComparableList5.equals((java.lang.Object) 0.0f);
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean28 = strComparableList26.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList26.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray38 = strComparableList26.toArray(objArray37);
        boolean boolean40 = strComparableList26.equals((java.lang.Object) 0.0f);
        boolean boolean41 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
        boolean boolean42 = strComparableList5.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean44 = strComparableList22.contains((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList46 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean48 = strComparableList46.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean50 = strComparableList46.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable51 = strComparableList46.getLast();
        int int53 = strComparableList46.indexOf((java.lang.Object) 8);
        boolean boolean54 = strComparableList22.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList46);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList57 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList56);
        int int58 = strComparableList56.getCacheSize();
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray60 = new java.lang.CharSequence[][] { charSequenceArray59 };
        java.lang.CharSequence[][] charSequenceArray61 = strComparableList56.toArray(charSequenceArray60);
        boolean boolean62 = strComparableList22.contains((java.lang.Object) charSequenceArray60);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test578");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableList1.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean11 = strComparableList9.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableList9.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray21 = strComparableList9.toArray(objArray20);
        java.lang.Object[] objArray22 = strComparableList9.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean26 = strComparableList24.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList24.contains((java.lang.Object) 0.0f);
        boolean boolean29 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean30 = strComparableList1.remove((java.lang.Object) strComparableList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean34 = strComparableList32.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean36 = strComparableList32.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable37 = strComparableList32.getLast();
        java.lang.Comparable<java.lang.String> strComparable38 = strComparableList32.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean42 = strComparableList40.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean44 = strComparableList40.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray52 = strComparableList40.toArray(objArray51);
        java.lang.Object[] objArray53 = strComparableList40.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean57 = strComparableList55.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean59 = strComparableList55.contains((java.lang.Object) 0.0f);
        boolean boolean60 = strComparableList40.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        boolean boolean61 = strComparableList32.remove((java.lang.Object) strComparableList55);
        boolean boolean62 = strComparableList1.equals((java.lang.Object) strComparableList32);
        boolean boolean64 = strComparableList1.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable65 = strComparableList1.getFirst();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test579");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        boolean boolean7 = strComparableList1.remove((java.lang.Object) (-2));
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableList1.removeFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean12 = strComparableList10.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableList10.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableList10.getLast();
        boolean boolean17 = strComparableList10.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableList10.isEmpty();
        int int19 = strComparableList10.size();
        boolean boolean20 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean26 = strComparableList24.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList24.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList29 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean30 = strComparableList29.isEmpty();
        boolean boolean31 = strComparableList22.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        boolean boolean32 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test580");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableList1.clear();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean8 = strComparableList6.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableList6.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray18 = strComparableList6.toArray(objArray17);
        boolean boolean20 = strComparableList6.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray21 = strComparableList6.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean25 = strComparableList23.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList27 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean29 = strComparableList27.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean31 = strComparableList27.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray39 = strComparableList27.toArray(objArray38);
        boolean boolean41 = strComparableList27.equals((java.lang.Object) 0.0f);
        boolean boolean42 = strComparableList23.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList27);
        boolean boolean43 = strComparableList6.contains((java.lang.Object) strComparableList23);
        boolean boolean44 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable46 = strComparableList1.remove(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (5) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test581");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>> strComparableListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.List<java.lang.Comparable<java.lang.String>>>((int) (byte) 10);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test582");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableList1.getLast();
        boolean boolean8 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableList1.isEmpty();
        boolean boolean11 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableList1.getFirst();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableList1.removeLast();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test583");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray13 = strComparableList1.toArray(objArray12);
        boolean boolean15 = strComparableList1.equals((java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = strComparableList1.toArray();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean20 = strComparableList18.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean24 = strComparableList22.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = strComparableList22.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray34 = strComparableList22.toArray(objArray33);
        boolean boolean36 = strComparableList22.equals((java.lang.Object) 0.0f);
        boolean boolean37 = strComparableList18.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        boolean boolean38 = strComparableList1.contains((java.lang.Object) strComparableList18);
        java.lang.Comparable<java.lang.String> strComparable39 = strComparableList1.removeLast();
        int int40 = strComparableList1.size();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test584");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList7 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean boolean8 = strComparableList1.contains((java.lang.Object) '#');
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList11);
        int int13 = strComparableList1.indexOf((java.lang.Object) strComparableList11);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean17 = strComparableList15.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableList15.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableList15.getLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean26 = strComparableList24.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean28 = strComparableList24.contains((java.lang.Object) 100L);
        java.lang.Comparable<java.lang.String> strComparable29 = strComparableList24.getLast();
        boolean boolean31 = strComparableList24.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean32 = strComparableList24.isEmpty();
        boolean boolean34 = strComparableList24.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean35 = strComparableList22.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean36 = strComparableList15.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        boolean boolean37 = strComparableList11.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList39 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList39);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList40);
        boolean boolean42 = strComparableList24.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList41);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test585");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean3 = strComparableList1.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableList1.contains((java.lang.Object) 100L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean10 = strComparableList8.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean14 = strComparableList12.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableList12.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray24 = strComparableList12.toArray(objArray23);
        boolean boolean26 = strComparableList12.equals((java.lang.Object) 0.0f);
        boolean boolean27 = strComparableList8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
        boolean boolean29 = strComparableList8.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean30 = strComparableList1.equals((java.lang.Object) "hi!");
        java.lang.Comparable<java.lang.String> strComparable31 = strComparableList1.removeLast();
        java.lang.Comparable<java.lang.String> strComparable32 = null;
        boolean boolean33 = strComparableList1.addLast(strComparable32);
        boolean boolean35 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>> strComparableList39 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Comparable<java.lang.String>>(0);
        boolean boolean41 = strComparableList39.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean43 = strComparableList39.contains((java.lang.Object) 100L);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (-1.0d), true, 0, (-8), '#', (-1L) };
        java.lang.Object[] objArray51 = strComparableList39.toArray(objArray50);
        int int52 = strComparableList37.lastIndexOf((java.lang.Object) objArray50);
        boolean boolean53 = strComparableList1.remove((java.lang.Object) int52);
    }
}

