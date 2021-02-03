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
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        boolean boolean12 = strList3.isEmpty();
        int int13 = strList3.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String str23 = strList17.set((int) (short) 0, "hi!");
        boolean boolean24 = strList3.addAll((java.util.Collection<java.lang.String>) strList17);
        java.lang.String str25 = strList3.getLast();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test502");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        boolean boolean10 = strList3.addLast("hi!");
        boolean boolean12 = strList3.addLast("hi!");
        boolean boolean13 = strList3.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean20 = strList18.addLast("");
        java.lang.Object obj21 = null;
        boolean boolean22 = strList18.remove(obj21);
        boolean boolean23 = strList15.addAll((java.util.Collection<java.lang.String>) strList18);
        java.lang.String str25 = strList15.get(0);
        boolean boolean27 = strList15.remove((java.lang.Object) 10);
        java.lang.String str28 = strList15.getFirst();
        java.lang.String str29 = strList15.removeFirst();
        boolean boolean30 = strList14.removeAll((java.util.Collection<java.lang.String>) strList15);
        java.lang.String str31 = strList15.removeLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList33 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean36 = strList34.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean39 = strList37.addLast("");
        java.lang.Object obj40 = null;
        boolean boolean41 = strList37.remove(obj40);
        boolean boolean42 = strList34.addAll((java.util.Collection<java.lang.String>) strList37);
        java.lang.String str44 = strList34.get(0);
        boolean boolean46 = strList34.remove((java.lang.Object) 10);
        java.lang.String str47 = strList34.getFirst();
        java.lang.String str48 = strList34.removeFirst();
        boolean boolean49 = strList33.removeAll((java.util.Collection<java.lang.String>) strList34);
        java.lang.String str50 = strList34.removeLast();
        boolean boolean52 = strList34.remove((java.lang.Object) (-1.0f));
        boolean boolean53 = strList32.removeAll((java.util.Collection<java.lang.String>) strList34);
        int int54 = strList15.indexOf((java.lang.Object) strList32);
        boolean boolean56 = strList15.add("hi!");
        boolean boolean58 = strList15.addFirst("hi!");
        boolean boolean59 = strList3.removeAll((java.util.Collection<java.lang.String>) strList15);
        java.lang.String str61 = strList3.get(0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test503");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        boolean boolean10 = strList3.addLast("hi!");
        strList3.clear();
        boolean boolean13 = strList3.addFirst("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean20 = strList18.addLast("");
        java.lang.Object obj21 = null;
        boolean boolean22 = strList18.remove(obj21);
        boolean boolean23 = strList15.addAll((java.util.Collection<java.lang.String>) strList18);
        java.lang.String str25 = strList15.get(0);
        boolean boolean27 = strList15.remove((java.lang.Object) 10);
        java.lang.String str28 = strList15.getFirst();
        java.lang.String str29 = strList15.removeFirst();
        boolean boolean30 = strList14.removeAll((java.util.Collection<java.lang.String>) strList15);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean36 = strList34.addLast("");
        java.lang.Object obj37 = null;
        boolean boolean38 = strList34.remove(obj37);
        boolean boolean39 = strList31.addAll((java.util.Collection<java.lang.String>) strList34);
        int int40 = strList34.size();
        boolean boolean41 = strList14.removeAll((java.util.Collection<java.lang.String>) strList34);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean44 = strList42.addLast("");
        boolean boolean45 = strList14.addAll((java.util.Collection<java.lang.String>) strList42);
        boolean boolean46 = strList14.isEmpty();
        boolean boolean48 = strList14.addFirst("hi!");
        boolean boolean49 = strList3.removeAll((java.util.Collection<java.lang.String>) strList14);
        java.util.Collection<java.lang.String> strCollection51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = strList3.addAll(0, strCollection51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test504");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList3.removeAll((java.util.Collection<java.lang.String>) strList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        boolean boolean21 = strList13.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean22 = strList3.addAll((java.util.Collection<java.lang.String>) strList16);
        java.lang.String str25 = strList16.set(0, "");
        boolean boolean26 = strList16.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList29 = strList16.subList((-10), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test505");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String str9 = strList3.set((int) (short) 0, "hi!");
        boolean boolean11 = strList3.add("hi!");
        java.lang.String str12 = strList3.getFirst();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test506");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>(9);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean4 = strList2.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean7 = strList5.addLast("");
        java.lang.Object obj8 = null;
        boolean boolean9 = strList5.remove(obj8);
        boolean boolean10 = strList2.addAll((java.util.Collection<java.lang.String>) strList5);
        int int11 = strList5.size();
        boolean boolean13 = strList5.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean19 = strList17.addLast("");
        java.lang.Object obj20 = null;
        boolean boolean21 = strList17.remove(obj20);
        boolean boolean22 = strList14.addAll((java.util.Collection<java.lang.String>) strList17);
        boolean boolean24 = strList17.addLast("hi!");
        int int25 = strList5.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList27 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean29 = strList27.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList30 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean32 = strList30.addLast("");
        java.lang.Object obj33 = null;
        boolean boolean34 = strList30.remove(obj33);
        boolean boolean35 = strList27.addAll((java.util.Collection<java.lang.String>) strList30);
        java.lang.String str37 = strList27.get(0);
        boolean boolean39 = strList27.remove((java.lang.Object) 10);
        java.lang.String str40 = strList27.getFirst();
        java.lang.String str41 = strList27.removeFirst();
        boolean boolean42 = strList26.removeAll((java.util.Collection<java.lang.String>) strList27);
        boolean boolean43 = strList5.remove((java.lang.Object) strList26);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean46 = strList44.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList47 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList44);
        java.lang.String str48 = strList47.getFirst();
        boolean boolean50 = strList47.addLast("hi!");
        strList47.clear();
        boolean boolean53 = strList47.add("");
        boolean boolean54 = strList5.addAll((java.util.Collection<java.lang.String>) strList47);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean57 = strList55.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList58 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList55);
        boolean boolean60 = strList58.add("hi!");
        int int62 = strList58.indexOf((java.lang.Object) (-5));
        boolean boolean63 = strList5.removeAll((java.util.Collection<java.lang.String>) strList58);
        boolean boolean64 = strList58.isEmpty();
        boolean boolean65 = strList1.removeAll((java.util.Collection<java.lang.String>) strList58);
        int int66 = strList58.getCacheSize();
        strList58.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = strList58.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (97) greater than the size of the list (0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test507");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        java.lang.Object obj18 = null;
        boolean boolean19 = strList15.remove(obj18);
        boolean boolean20 = strList12.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean22 = strList15.addLast("hi!");
        int int23 = strList3.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean27 = strList25.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        java.lang.Object obj31 = null;
        boolean boolean32 = strList28.remove(obj31);
        boolean boolean33 = strList25.addAll((java.util.Collection<java.lang.String>) strList28);
        java.lang.String str35 = strList25.get(0);
        boolean boolean37 = strList25.remove((java.lang.Object) 10);
        java.lang.String str38 = strList25.getFirst();
        java.lang.String str39 = strList25.removeFirst();
        boolean boolean40 = strList24.removeAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean41 = strList3.remove((java.lang.Object) strList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean44 = strList42.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList42);
        java.lang.String str46 = strList45.getFirst();
        boolean boolean48 = strList45.addLast("hi!");
        strList45.clear();
        boolean boolean51 = strList45.add("");
        boolean boolean52 = strList3.addAll((java.util.Collection<java.lang.String>) strList45);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList53 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean55 = strList53.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList53);
        boolean boolean58 = strList56.add("hi!");
        int int60 = strList56.indexOf((java.lang.Object) (-5));
        boolean boolean61 = strList3.removeAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean63 = strList3.add("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = strList3.get(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (6) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test508");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.add("hi!");
        int int7 = strList3.indexOf((java.lang.Object) (-5));
        boolean boolean9 = strList3.addLast("hi!");
        java.lang.String str10 = strList3.removeFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        java.lang.Object obj18 = null;
        boolean boolean19 = strList15.remove(obj18);
        boolean boolean20 = strList12.addAll((java.util.Collection<java.lang.String>) strList15);
        java.lang.String str22 = strList12.get(0);
        boolean boolean24 = strList12.remove((java.lang.Object) 10);
        java.lang.String str25 = strList12.getFirst();
        java.lang.String str26 = strList12.removeFirst();
        boolean boolean27 = strList11.removeAll((java.util.Collection<java.lang.String>) strList12);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        int int37 = strList31.size();
        boolean boolean38 = strList11.removeAll((java.util.Collection<java.lang.String>) strList31);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList39 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean41 = strList39.addLast("");
        boolean boolean42 = strList11.addAll((java.util.Collection<java.lang.String>) strList39);
        int int43 = strList3.indexOf((java.lang.Object) boolean42);
        java.lang.String str44 = strList3.removeFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean47 = strList45.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList48 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean50 = strList48.addLast("");
        java.lang.Object obj51 = null;
        boolean boolean52 = strList48.remove(obj51);
        boolean boolean53 = strList45.addAll((java.util.Collection<java.lang.String>) strList48);
        boolean boolean55 = strList48.addLast("hi!");
        boolean boolean57 = strList48.addLast("hi!");
        boolean boolean59 = strList48.addFirst("hi!");
        boolean boolean61 = strList48.addFirst("hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList62 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList48);
        boolean boolean63 = strList3.removeAll((java.util.Collection<java.lang.String>) strList48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = strList48.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (5).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test509");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        java.lang.String str13 = strList0.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList17.removeAll((java.util.Collection<java.lang.String>) strList24);
        boolean boolean27 = strList0.remove((java.lang.Object) strList17);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        int int37 = strList28.size();
        boolean boolean38 = strList0.remove((java.lang.Object) strList28);
        int int39 = strList0.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((-8));
        strList42.clear();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean46 = strList44.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList47 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList44);
        java.lang.String str48 = strList47.getLast();
        java.lang.String str49 = strList47.removeFirst();
        boolean boolean50 = strList47.isEmpty();
        int int51 = strList47.size();
        int int52 = strList47.size();
        boolean boolean54 = strList47.add("");
        java.lang.String str56 = strList47.get(0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList57 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean59 = strList57.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList60 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean62 = strList60.addLast("");
        java.lang.Object obj63 = null;
        boolean boolean64 = strList60.remove(obj63);
        boolean boolean65 = strList57.addAll((java.util.Collection<java.lang.String>) strList60);
        int int66 = strList60.size();
        boolean boolean68 = strList60.remove((java.lang.Object) 1L);
        boolean boolean69 = strList60.isEmpty();
        boolean boolean71 = strList60.addFirst("hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList72 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean74 = strList72.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList75 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean77 = strList75.addLast("");
        java.lang.Object obj78 = null;
        boolean boolean79 = strList75.remove(obj78);
        boolean boolean80 = strList72.addAll((java.util.Collection<java.lang.String>) strList75);
        java.lang.String str82 = strList72.get(0);
        boolean boolean84 = strList72.remove((java.lang.Object) 10);
        java.lang.String str85 = strList72.getFirst();
        java.lang.String str86 = strList72.removeFirst();
        java.lang.String str87 = strList72.getLast();
        boolean boolean88 = strList60.remove((java.lang.Object) strList72);
        int int89 = strList47.indexOf((java.lang.Object) boolean88);
        boolean boolean90 = strList42.addAll((java.util.Collection<java.lang.String>) strList47);
        int int91 = strList40.indexOf((java.lang.Object) strList47);
        int int92 = strList47.getCacheSize();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test510");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        java.lang.String str4 = strList3.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        boolean boolean7 = strList5.add("hi!");
        boolean boolean9 = strList5.add("hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean12 = strList10.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        strList10.clear();
        boolean boolean15 = strList5.remove((java.lang.Object) strList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        int int22 = strList16.indexOf((java.lang.Object) 10L);
        java.lang.String str23 = strList16.getLast();
        boolean boolean25 = strList16.add("hi!");
        boolean boolean27 = strList16.add("");
        java.lang.String str28 = strList16.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList29 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean31 = strList29.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean34 = strList32.addLast("");
        java.lang.Object obj35 = null;
        boolean boolean36 = strList32.remove(obj35);
        boolean boolean37 = strList29.addAll((java.util.Collection<java.lang.String>) strList32);
        int int38 = strList32.size();
        boolean boolean40 = strList32.remove((java.lang.Object) 1L);
        java.lang.String str41 = strList32.getLast();
        int int42 = strList16.indexOf((java.lang.Object) strList32);
        boolean boolean43 = strList5.remove((java.lang.Object) strList32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = strList32.set((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (1) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test511");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean3 = strList1.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList4 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean6 = strList4.addLast("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strList4.remove(obj7);
        boolean boolean9 = strList1.addAll((java.util.Collection<java.lang.String>) strList4);
        java.lang.String str11 = strList1.get(0);
        boolean boolean13 = strList1.remove((java.lang.Object) 10);
        java.lang.String str14 = strList1.getFirst();
        java.lang.String str15 = strList1.removeFirst();
        boolean boolean16 = strList0.removeAll((java.util.Collection<java.lang.String>) strList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean19 = strList17.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean22 = strList20.addLast("");
        java.lang.Object obj23 = null;
        boolean boolean24 = strList20.remove(obj23);
        boolean boolean25 = strList17.addAll((java.util.Collection<java.lang.String>) strList20);
        int int26 = strList20.size();
        boolean boolean27 = strList0.removeAll((java.util.Collection<java.lang.String>) strList20);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        boolean boolean31 = strList0.addAll((java.util.Collection<java.lang.String>) strList28);
        int int32 = strList0.size();
        int int33 = strList0.getCacheSize();
        int int34 = strList0.getCacheSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = strList0.remove((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-10) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test512");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        boolean boolean10 = strList3.addLast("hi!");
        strList3.clear();
        boolean boolean13 = strList3.addLast("");
        boolean boolean15 = strList3.add("hi!");
        boolean boolean17 = strList3.addLast("hi!");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test513");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        boolean boolean12 = strList3.isEmpty();
        boolean boolean14 = strList3.addFirst("hi!");
        boolean boolean16 = strList3.add("");
        boolean boolean17 = strList3.isEmpty();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test514");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        java.lang.Object obj18 = null;
        boolean boolean19 = strList15.remove(obj18);
        boolean boolean20 = strList12.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean22 = strList15.addLast("hi!");
        int int23 = strList3.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean27 = strList25.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        java.lang.Object obj31 = null;
        boolean boolean32 = strList28.remove(obj31);
        boolean boolean33 = strList25.addAll((java.util.Collection<java.lang.String>) strList28);
        java.lang.String str35 = strList25.get(0);
        boolean boolean37 = strList25.remove((java.lang.Object) 10);
        java.lang.String str38 = strList25.getFirst();
        java.lang.String str39 = strList25.removeFirst();
        boolean boolean40 = strList24.removeAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean41 = strList3.remove((java.lang.Object) strList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean44 = strList42.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList42);
        java.lang.String str46 = strList45.getFirst();
        boolean boolean48 = strList45.addLast("hi!");
        strList45.clear();
        boolean boolean51 = strList45.add("");
        boolean boolean52 = strList3.addAll((java.util.Collection<java.lang.String>) strList45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = strList3.get(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (9) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test515");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.add("hi!");
        int int7 = strList3.indexOf((java.lang.Object) (-5));
        boolean boolean9 = strList3.addLast("hi!");
        java.lang.String str10 = strList3.removeFirst();
        java.lang.String str11 = strList3.getLast();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test516");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>(100);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test517");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        java.lang.Object obj3 = null;
        boolean boolean4 = strList0.remove(obj3);
        int int6 = strList0.indexOf((java.lang.Object) 10L);
        java.lang.String str7 = strList0.getLast();
        boolean boolean9 = strList0.add("hi!");
        boolean boolean11 = strList0.add("");
        java.lang.String str12 = strList0.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        boolean boolean21 = strList13.addAll((java.util.Collection<java.lang.String>) strList16);
        int int22 = strList16.size();
        boolean boolean24 = strList16.remove((java.lang.Object) 1L);
        java.lang.String str25 = strList16.getLast();
        int int26 = strList0.indexOf((java.lang.Object) strList16);
        java.lang.String str27 = strList0.getFirst();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test518");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        int int4 = strList3.size();
        boolean boolean6 = strList3.addLast("");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test519");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList0.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean12 = strList10.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        java.lang.Object obj16 = null;
        boolean boolean17 = strList13.remove(obj16);
        boolean boolean18 = strList10.addAll((java.util.Collection<java.lang.String>) strList13);
        java.lang.String str20 = strList10.get(0);
        boolean boolean22 = strList10.remove((java.lang.Object) 10);
        java.lang.String str23 = strList10.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean26 = strList24.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList27 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList24);
        boolean boolean29 = strList27.remove((java.lang.Object) (-8));
        boolean boolean30 = strList27.isEmpty();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        boolean boolean36 = strList27.removeAll((java.util.Collection<java.lang.String>) strList34);
        boolean boolean37 = strList10.remove((java.lang.Object) strList27);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean40 = strList38.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean43 = strList41.addLast("");
        java.lang.Object obj44 = null;
        boolean boolean45 = strList41.remove(obj44);
        boolean boolean46 = strList38.addAll((java.util.Collection<java.lang.String>) strList41);
        int int47 = strList38.size();
        boolean boolean48 = strList10.remove((java.lang.Object) strList38);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList49 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        boolean boolean50 = strList0.remove((java.lang.Object) strList49);
        java.lang.String str52 = strList49.get((int) (byte) 0);
        java.lang.String str53 = strList49.removeFirst();
        java.lang.String str54 = strList49.removeFirst();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test520");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        java.lang.Object obj3 = null;
        boolean boolean4 = strList0.remove(obj3);
        int int6 = strList0.indexOf((java.lang.Object) 10L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((int) (byte) 1);
        boolean boolean9 = strList0.removeAll((java.util.Collection<java.lang.String>) strList8);
        strList8.clear();
        int int11 = strList8.getCacheSize();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test521");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList3.removeAll((java.util.Collection<java.lang.String>) strList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        boolean boolean21 = strList13.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean22 = strList3.addAll((java.util.Collection<java.lang.String>) strList16);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean28 = strList26.addLast("");
        java.lang.Object obj29 = null;
        boolean boolean30 = strList26.remove(obj29);
        boolean boolean31 = strList23.addAll((java.util.Collection<java.lang.String>) strList26);
        java.lang.String str33 = strList23.get(0);
        boolean boolean34 = strList23.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean37 = strList35.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        java.lang.String str39 = strList38.getLast();
        java.lang.String str40 = strList38.removeFirst();
        boolean boolean41 = strList23.remove((java.lang.Object) str40);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean44 = strList42.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean47 = strList45.addLast("");
        java.lang.Object obj48 = null;
        boolean boolean49 = strList45.remove(obj48);
        boolean boolean50 = strList42.addAll((java.util.Collection<java.lang.String>) strList45);
        java.lang.String str52 = strList42.get(0);
        boolean boolean54 = strList42.remove((java.lang.Object) 10);
        java.lang.String str55 = strList42.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean58 = strList56.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList59 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        boolean boolean61 = strList59.remove((java.lang.Object) (-8));
        boolean boolean62 = strList59.isEmpty();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = strList59.removeAll((java.util.Collection<java.lang.String>) strList66);
        boolean boolean69 = strList42.remove((java.lang.Object) strList59);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList70 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean72 = strList70.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList73 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean75 = strList73.addLast("");
        java.lang.Object obj76 = null;
        boolean boolean77 = strList73.remove(obj76);
        boolean boolean78 = strList70.addAll((java.util.Collection<java.lang.String>) strList73);
        int int79 = strList70.size();
        boolean boolean80 = strList42.remove((java.lang.Object) strList70);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList81 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean83 = strList81.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList84 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList81);
        boolean boolean86 = strList84.add("hi!");
        int int88 = strList84.indexOf((java.lang.Object) (-5));
        int int89 = strList70.indexOf((java.lang.Object) int88);
        boolean boolean90 = strList23.addAll((java.util.Collection<java.lang.String>) strList70);
        boolean boolean91 = strList16.removeAll((java.util.Collection<java.lang.String>) strList23);
        int int92 = strList16.getCacheSize();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test522");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        boolean boolean10 = strList3.addLast("hi!");
        boolean boolean12 = strList3.addLast("hi!");
        boolean boolean14 = strList3.addFirst("hi!");
        boolean boolean16 = strList3.addFirst("hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean20 = strList18.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList21 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean23 = strList21.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean26 = strList24.addLast("");
        java.lang.Object obj27 = null;
        boolean boolean28 = strList24.remove(obj27);
        boolean boolean29 = strList21.addAll((java.util.Collection<java.lang.String>) strList24);
        int int30 = strList18.indexOf((java.lang.Object) strList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList31);
        strList31.clear();
        boolean boolean36 = strList18.remove((java.lang.Object) strList31);
        int int37 = strList3.indexOf((java.lang.Object) strList31);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test523");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        java.lang.Object obj3 = null;
        boolean boolean4 = strList0.remove(obj3);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        int int7 = strList5.indexOf((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean10 = strList8.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList8);
        boolean boolean13 = strList11.remove((java.lang.Object) (-8));
        boolean boolean14 = strList11.isEmpty();
        boolean boolean15 = strList5.remove((java.lang.Object) boolean14);
        boolean boolean17 = strList5.add("");
        boolean boolean18 = strList0.addAll((java.util.Collection<java.lang.String>) strList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean22 = strList20.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        java.lang.Object obj26 = null;
        boolean boolean27 = strList23.remove(obj26);
        boolean boolean28 = strList20.addAll((java.util.Collection<java.lang.String>) strList23);
        int int29 = strList23.size();
        boolean boolean31 = strList23.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean34 = strList32.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean37 = strList35.addLast("");
        java.lang.Object obj38 = null;
        boolean boolean39 = strList35.remove(obj38);
        boolean boolean40 = strList32.addAll((java.util.Collection<java.lang.String>) strList35);
        boolean boolean42 = strList35.addLast("hi!");
        int int43 = strList23.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean47 = strList45.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList48 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean50 = strList48.addLast("");
        java.lang.Object obj51 = null;
        boolean boolean52 = strList48.remove(obj51);
        boolean boolean53 = strList45.addAll((java.util.Collection<java.lang.String>) strList48);
        java.lang.String str55 = strList45.get(0);
        boolean boolean57 = strList45.remove((java.lang.Object) 10);
        java.lang.String str58 = strList45.getFirst();
        java.lang.String str59 = strList45.removeFirst();
        boolean boolean60 = strList44.removeAll((java.util.Collection<java.lang.String>) strList45);
        boolean boolean61 = strList23.remove((java.lang.Object) strList44);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList62 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean64 = strList62.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList65 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList62);
        boolean boolean67 = strList65.remove((java.lang.Object) (-8));
        boolean boolean68 = strList65.isEmpty();
        java.lang.String str71 = strList65.set((int) (short) 0, "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList72 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList73 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean75 = strList73.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList76 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean78 = strList76.addLast("");
        java.lang.Object obj79 = null;
        boolean boolean80 = strList76.remove(obj79);
        boolean boolean81 = strList73.addAll((java.util.Collection<java.lang.String>) strList76);
        java.lang.String str83 = strList73.get(0);
        boolean boolean85 = strList73.remove((java.lang.Object) 10);
        java.lang.String str86 = strList73.getFirst();
        java.lang.String str87 = strList73.removeFirst();
        boolean boolean88 = strList72.removeAll((java.util.Collection<java.lang.String>) strList73);
        boolean boolean89 = strList65.remove((java.lang.Object) strList72);
        boolean boolean90 = strList44.removeAll((java.util.Collection<java.lang.String>) strList72);
        boolean boolean91 = strList19.remove((java.lang.Object) strList44);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test524");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        boolean boolean12 = strList3.isEmpty();
        boolean boolean14 = strList3.add("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean20 = strList18.addLast("");
        java.lang.Object obj21 = null;
        boolean boolean22 = strList18.remove(obj21);
        boolean boolean23 = strList15.addAll((java.util.Collection<java.lang.String>) strList18);
        int int24 = strList18.size();
        boolean boolean26 = strList18.remove((java.lang.Object) 1L);
        boolean boolean27 = strList18.isEmpty();
        int int28 = strList18.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList29 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean31 = strList29.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList29);
        boolean boolean34 = strList32.remove((java.lang.Object) (-8));
        boolean boolean35 = strList32.isEmpty();
        java.lang.String str38 = strList32.set((int) (short) 0, "hi!");
        boolean boolean39 = strList18.addAll((java.util.Collection<java.lang.String>) strList32);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean42 = strList40.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList43 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean45 = strList43.addLast("");
        java.lang.Object obj46 = null;
        boolean boolean47 = strList43.remove(obj46);
        boolean boolean48 = strList40.addAll((java.util.Collection<java.lang.String>) strList43);
        int int49 = strList43.size();
        boolean boolean51 = strList43.remove((java.lang.Object) 1L);
        int int52 = strList32.indexOf((java.lang.Object) boolean51);
        boolean boolean54 = strList32.addLast("");
        boolean boolean55 = strList3.addAll((java.util.Collection<java.lang.String>) strList32);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test525");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        java.lang.String str4 = strList3.getFirst();
        boolean boolean6 = strList3.addLast("hi!");
        java.lang.String str7 = strList3.removeLast();
        java.lang.String str8 = strList3.removeFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strList3.set((-9), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-9) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test526");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList2 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean4 = strList2.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean7 = strList5.addLast("");
        java.lang.Object obj8 = null;
        boolean boolean9 = strList5.remove(obj8);
        boolean boolean10 = strList2.addAll((java.util.Collection<java.lang.String>) strList5);
        java.lang.String str12 = strList2.get(0);
        boolean boolean14 = strList2.remove((java.lang.Object) 10);
        java.lang.String str15 = strList2.getFirst();
        java.lang.String str16 = strList2.removeFirst();
        boolean boolean17 = strList1.removeAll((java.util.Collection<java.lang.String>) strList2);
        java.lang.String str18 = strList2.removeLast();
        boolean boolean20 = strList2.remove((java.lang.Object) (-1.0f));
        boolean boolean21 = strList0.removeAll((java.util.Collection<java.lang.String>) strList2);
        boolean boolean23 = strList0.addFirst("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList26 = strList0.subList((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test527");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean11 = strList0.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        java.lang.Object obj15 = null;
        boolean boolean16 = strList12.remove(obj15);
        boolean boolean17 = strList0.addAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String str18 = strList0.getFirst();
        int int19 = strList0.size();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test528");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String str9 = strList3.set((int) (short) 0, "hi!");
        boolean boolean11 = strList3.add("hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.lang.String str16 = strList15.getLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean19 = strList17.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean22 = strList20.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        java.lang.Object obj26 = null;
        boolean boolean27 = strList23.remove(obj26);
        boolean boolean28 = strList20.addAll((java.util.Collection<java.lang.String>) strList23);
        int int29 = strList17.indexOf((java.lang.Object) strList23);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList30 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean32 = strList30.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList33 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        strList30.clear();
        boolean boolean35 = strList17.remove((java.lang.Object) strList30);
        boolean boolean36 = strList15.removeAll((java.util.Collection<java.lang.String>) strList17);
        boolean boolean37 = strList3.remove((java.lang.Object) strList17);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test529");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        java.lang.String str4 = strList3.getLast();
        java.lang.String str5 = strList3.removeFirst();
        boolean boolean6 = strList3.isEmpty();
        boolean boolean8 = strList3.addFirst("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = strList3.subList(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test530");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean11 = strList0.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.lang.String str16 = strList15.getLast();
        java.lang.String str17 = strList15.removeFirst();
        boolean boolean18 = strList0.remove((java.lang.Object) str17);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean21 = strList19.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean24 = strList22.addLast("");
        java.lang.Object obj25 = null;
        boolean boolean26 = strList22.remove(obj25);
        boolean boolean27 = strList19.addAll((java.util.Collection<java.lang.String>) strList22);
        java.lang.String str29 = strList19.get(0);
        boolean boolean31 = strList19.remove((java.lang.Object) 10);
        java.lang.String str32 = strList19.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList33 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean35 = strList33.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList36 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        boolean boolean38 = strList36.remove((java.lang.Object) (-8));
        boolean boolean39 = strList36.isEmpty();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList36.removeAll((java.util.Collection<java.lang.String>) strList43);
        boolean boolean46 = strList19.remove((java.lang.Object) strList36);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList47 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean49 = strList47.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList50 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean52 = strList50.addLast("");
        java.lang.Object obj53 = null;
        boolean boolean54 = strList50.remove(obj53);
        boolean boolean55 = strList47.addAll((java.util.Collection<java.lang.String>) strList50);
        int int56 = strList47.size();
        boolean boolean57 = strList19.remove((java.lang.Object) strList47);
        boolean boolean59 = strList47.add("");
        boolean boolean60 = strList0.removeAll((java.util.Collection<java.lang.String>) strList47);
        boolean boolean61 = strList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = strList0.getFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test531");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        java.lang.String str12 = strList0.get(0);
        int int13 = strList0.size();
        int int14 = strList0.getCacheSize();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test532");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean11 = strList0.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.lang.String str16 = strList15.getLast();
        java.lang.String str17 = strList15.removeFirst();
        boolean boolean18 = strList0.remove((java.lang.Object) str17);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean21 = strList19.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean24 = strList22.addLast("");
        java.lang.Object obj25 = null;
        boolean boolean26 = strList22.remove(obj25);
        boolean boolean27 = strList19.addAll((java.util.Collection<java.lang.String>) strList22);
        java.lang.String str29 = strList19.get(0);
        boolean boolean31 = strList19.remove((java.lang.Object) 10);
        java.lang.String str32 = strList19.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList33 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean35 = strList33.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList36 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        boolean boolean38 = strList36.remove((java.lang.Object) (-8));
        boolean boolean39 = strList36.isEmpty();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList36.removeAll((java.util.Collection<java.lang.String>) strList43);
        boolean boolean46 = strList19.remove((java.lang.Object) strList36);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList47 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean49 = strList47.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList50 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean52 = strList50.addLast("");
        java.lang.Object obj53 = null;
        boolean boolean54 = strList50.remove(obj53);
        boolean boolean55 = strList47.addAll((java.util.Collection<java.lang.String>) strList50);
        int int56 = strList47.size();
        boolean boolean57 = strList19.remove((java.lang.Object) strList47);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList58 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean60 = strList58.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList61 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList58);
        boolean boolean63 = strList61.add("hi!");
        int int65 = strList61.indexOf((java.lang.Object) (-5));
        int int66 = strList47.indexOf((java.lang.Object) int65);
        boolean boolean67 = strList0.addAll((java.util.Collection<java.lang.String>) strList47);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList68 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        java.lang.String str69 = strList0.getLast();
        int int70 = strList0.getCacheSize();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test533");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String str9 = strList3.set((int) (short) 0, "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean12 = strList10.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        java.lang.Object obj16 = null;
        boolean boolean17 = strList13.remove(obj16);
        boolean boolean18 = strList10.addAll((java.util.Collection<java.lang.String>) strList13);
        int int19 = strList13.size();
        boolean boolean20 = strList3.addAll((java.util.Collection<java.lang.String>) strList13);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList21 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean24 = strList22.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList22);
        boolean boolean27 = strList25.addLast("");
        boolean boolean28 = strList21.remove((java.lang.Object) boolean27);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList29 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean31 = strList29.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean34 = strList32.addLast("");
        java.lang.Object obj35 = null;
        boolean boolean36 = strList32.remove(obj35);
        boolean boolean37 = strList29.addAll((java.util.Collection<java.lang.String>) strList32);
        java.lang.String str39 = strList29.get(0);
        java.lang.String str41 = strList29.get(0);
        java.lang.String str42 = strList29.removeFirst();
        boolean boolean43 = strList21.addAll((java.util.Collection<java.lang.String>) strList29);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList21);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test534");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList3.removeAll((java.util.Collection<java.lang.String>) strList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        boolean boolean21 = strList13.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean22 = strList3.addAll((java.util.Collection<java.lang.String>) strList16);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean28 = strList26.addLast("");
        java.lang.Object obj29 = null;
        boolean boolean30 = strList26.remove(obj29);
        boolean boolean31 = strList23.addAll((java.util.Collection<java.lang.String>) strList26);
        java.lang.String str33 = strList23.get(0);
        boolean boolean34 = strList23.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean37 = strList35.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        java.lang.String str39 = strList38.getLast();
        java.lang.String str40 = strList38.removeFirst();
        boolean boolean41 = strList23.remove((java.lang.Object) str40);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean44 = strList42.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean47 = strList45.addLast("");
        java.lang.Object obj48 = null;
        boolean boolean49 = strList45.remove(obj48);
        boolean boolean50 = strList42.addAll((java.util.Collection<java.lang.String>) strList45);
        java.lang.String str52 = strList42.get(0);
        boolean boolean54 = strList42.remove((java.lang.Object) 10);
        java.lang.String str55 = strList42.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean58 = strList56.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList59 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        boolean boolean61 = strList59.remove((java.lang.Object) (-8));
        boolean boolean62 = strList59.isEmpty();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = strList59.removeAll((java.util.Collection<java.lang.String>) strList66);
        boolean boolean69 = strList42.remove((java.lang.Object) strList59);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList70 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean72 = strList70.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList73 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean75 = strList73.addLast("");
        java.lang.Object obj76 = null;
        boolean boolean77 = strList73.remove(obj76);
        boolean boolean78 = strList70.addAll((java.util.Collection<java.lang.String>) strList73);
        int int79 = strList70.size();
        boolean boolean80 = strList42.remove((java.lang.Object) strList70);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList81 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean83 = strList81.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList84 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList81);
        boolean boolean86 = strList84.add("hi!");
        int int88 = strList84.indexOf((java.lang.Object) (-5));
        int int89 = strList70.indexOf((java.lang.Object) int88);
        boolean boolean90 = strList23.addAll((java.util.Collection<java.lang.String>) strList70);
        boolean boolean91 = strList16.removeAll((java.util.Collection<java.lang.String>) strList23);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object> objList92 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.Object>((java.util.Collection<java.lang.String>) strList16);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test535");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        boolean boolean10 = strList3.addLast("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        boolean boolean15 = strList3.removeAll((java.util.Collection<java.lang.String>) strList13);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean21 = strList19.addLast("");
        java.lang.Object obj22 = null;
        boolean boolean23 = strList19.remove(obj22);
        boolean boolean24 = strList16.addAll((java.util.Collection<java.lang.String>) strList19);
        java.lang.String str26 = strList16.get(0);
        boolean boolean28 = strList16.remove((java.lang.Object) 10);
        java.lang.String str29 = strList16.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList30 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean32 = strList30.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList33 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        boolean boolean35 = strList33.remove((java.lang.Object) (-8));
        boolean boolean36 = strList33.isEmpty();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = strList33.removeAll((java.util.Collection<java.lang.String>) strList40);
        boolean boolean43 = strList16.remove((java.lang.Object) strList33);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList44 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean46 = strList44.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList47 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean49 = strList47.addLast("");
        java.lang.Object obj50 = null;
        boolean boolean51 = strList47.remove(obj50);
        boolean boolean52 = strList44.addAll((java.util.Collection<java.lang.String>) strList47);
        java.lang.String str54 = strList44.get(0);
        boolean boolean55 = strList44.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean58 = strList56.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList59 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        java.lang.String str60 = strList59.getLast();
        java.lang.String str61 = strList59.removeFirst();
        boolean boolean62 = strList44.remove((java.lang.Object) str61);
        boolean boolean63 = strList16.addAll((java.util.Collection<java.lang.String>) strList44);
        int int64 = strList3.indexOf((java.lang.Object) strList16);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList65 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        boolean boolean66 = strList3.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList67 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean69 = strList67.addLast("");
        java.lang.Object obj70 = null;
        boolean boolean71 = strList67.remove(obj70);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList72 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        int int74 = strList72.indexOf((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList75 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean77 = strList75.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList78 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList75);
        boolean boolean80 = strList78.remove((java.lang.Object) (-8));
        boolean boolean81 = strList78.isEmpty();
        boolean boolean82 = strList72.remove((java.lang.Object) boolean81);
        boolean boolean84 = strList72.add("");
        boolean boolean85 = strList67.addAll((java.util.Collection<java.lang.String>) strList72);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList86 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList72);
        int int87 = strList3.indexOf((java.lang.Object) strList72);
        boolean boolean89 = strList3.addLast("");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test536");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean3 = strList1.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList4 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean6 = strList4.addLast("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strList4.remove(obj7);
        boolean boolean9 = strList1.addAll((java.util.Collection<java.lang.String>) strList4);
        java.lang.String str11 = strList1.get(0);
        boolean boolean13 = strList1.remove((java.lang.Object) 10);
        java.lang.String str14 = strList1.getFirst();
        java.lang.String str15 = strList1.removeFirst();
        boolean boolean16 = strList0.removeAll((java.util.Collection<java.lang.String>) strList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean19 = strList17.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean22 = strList20.addLast("");
        java.lang.Object obj23 = null;
        boolean boolean24 = strList20.remove(obj23);
        boolean boolean25 = strList17.addAll((java.util.Collection<java.lang.String>) strList20);
        int int26 = strList20.size();
        boolean boolean27 = strList0.removeAll((java.util.Collection<java.lang.String>) strList20);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        boolean boolean31 = strList0.addAll((java.util.Collection<java.lang.String>) strList28);
        int int32 = strList0.size();
        java.lang.String str33 = strList0.getFirst();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test537");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.add("hi!");
        int int7 = strList3.indexOf((java.lang.Object) (-5));
        boolean boolean9 = strList3.addLast("hi!");
        java.lang.String str10 = strList3.removeFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        java.lang.Object obj18 = null;
        boolean boolean19 = strList15.remove(obj18);
        boolean boolean20 = strList12.addAll((java.util.Collection<java.lang.String>) strList15);
        java.lang.String str22 = strList12.get(0);
        boolean boolean24 = strList12.remove((java.lang.Object) 10);
        java.lang.String str25 = strList12.getFirst();
        java.lang.String str26 = strList12.removeFirst();
        boolean boolean27 = strList11.removeAll((java.util.Collection<java.lang.String>) strList12);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        int int37 = strList31.size();
        boolean boolean38 = strList11.removeAll((java.util.Collection<java.lang.String>) strList31);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList39 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean41 = strList39.addLast("");
        boolean boolean42 = strList11.addAll((java.util.Collection<java.lang.String>) strList39);
        int int43 = strList3.indexOf((java.lang.Object) boolean42);
        // The following exception was thrown during execution in test generation
        try {
            strList3.add((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (35) greater than the size of the list (2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test538");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        boolean boolean10 = strList3.addLast("hi!");
        strList3.clear();
        boolean boolean12 = strList3.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        boolean boolean21 = strList13.addAll((java.util.Collection<java.lang.String>) strList16);
        java.lang.String str23 = strList13.get(0);
        boolean boolean24 = strList13.isEmpty();
        boolean boolean26 = strList13.add("hi!");
        boolean boolean27 = strList3.removeAll((java.util.Collection<java.lang.String>) strList13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = strList13.set((-7), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-7) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test539");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        java.lang.String str4 = strList3.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strList5.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test540");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean4 = strList3.isEmpty();
        boolean boolean6 = strList3.addFirst("hi!");
        boolean boolean8 = strList3.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList9 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean11 = strList9.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        java.lang.Object obj15 = null;
        boolean boolean16 = strList12.remove(obj15);
        boolean boolean17 = strList9.addAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String str19 = strList9.get(0);
        boolean boolean21 = strList9.remove((java.lang.Object) 10);
        java.lang.String str22 = strList9.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList23);
        boolean boolean28 = strList26.remove((java.lang.Object) (-8));
        boolean boolean29 = strList26.isEmpty();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        boolean boolean35 = strList26.removeAll((java.util.Collection<java.lang.String>) strList33);
        boolean boolean36 = strList9.remove((java.lang.Object) strList26);
        int int37 = strList26.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean40 = strList38.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean43 = strList41.addLast("");
        java.lang.Object obj44 = null;
        boolean boolean45 = strList41.remove(obj44);
        boolean boolean46 = strList38.addAll((java.util.Collection<java.lang.String>) strList41);
        int int47 = strList41.size();
        java.lang.String str48 = strList41.getFirst();
        boolean boolean49 = strList26.addAll((java.util.Collection<java.lang.String>) strList41);
        boolean boolean51 = strList41.addLast("hi!");
        boolean boolean52 = strList3.remove((java.lang.Object) strList41);
        strList3.clear();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test541");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        java.lang.Object obj18 = null;
        boolean boolean19 = strList15.remove(obj18);
        boolean boolean20 = strList12.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean22 = strList15.addLast("hi!");
        int int23 = strList3.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean27 = strList25.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        java.lang.Object obj31 = null;
        boolean boolean32 = strList28.remove(obj31);
        boolean boolean33 = strList25.addAll((java.util.Collection<java.lang.String>) strList28);
        java.lang.String str35 = strList25.get(0);
        boolean boolean37 = strList25.remove((java.lang.Object) 10);
        java.lang.String str38 = strList25.getFirst();
        java.lang.String str39 = strList25.removeFirst();
        boolean boolean40 = strList24.removeAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean41 = strList3.remove((java.lang.Object) strList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList43 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean45 = strList43.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList46 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean48 = strList46.addLast("");
        java.lang.Object obj49 = null;
        boolean boolean50 = strList46.remove(obj49);
        boolean boolean51 = strList43.addAll((java.util.Collection<java.lang.String>) strList46);
        java.lang.String str53 = strList43.get(0);
        java.lang.String str55 = strList43.get(0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean58 = strList56.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList59 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        boolean boolean61 = strList59.remove((java.lang.Object) (-8));
        boolean boolean62 = strList59.isEmpty();
        java.lang.String str65 = strList59.set((int) (short) 0, "hi!");
        boolean boolean67 = strList59.add("hi!");
        boolean boolean68 = strList43.addAll((java.util.Collection<java.lang.String>) strList59);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList69 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean71 = strList69.addLast("");
        java.lang.Object obj72 = null;
        boolean boolean73 = strList69.remove(obj72);
        int int75 = strList69.indexOf((java.lang.Object) 10L);
        java.lang.String str76 = strList69.getLast();
        boolean boolean77 = strList43.removeAll((java.util.Collection<java.lang.String>) strList69);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = strList3.addAll(7, (java.util.Collection<java.lang.String>) strList43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (7) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test542");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        java.lang.Object obj18 = null;
        boolean boolean19 = strList15.remove(obj18);
        boolean boolean20 = strList12.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean22 = strList15.addLast("hi!");
        int int23 = strList3.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean27 = strList25.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        java.lang.Object obj31 = null;
        boolean boolean32 = strList28.remove(obj31);
        boolean boolean33 = strList25.addAll((java.util.Collection<java.lang.String>) strList28);
        java.lang.String str35 = strList25.get(0);
        boolean boolean37 = strList25.remove((java.lang.Object) 10);
        java.lang.String str38 = strList25.getFirst();
        java.lang.String str39 = strList25.removeFirst();
        boolean boolean40 = strList24.removeAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean41 = strList3.remove((java.lang.Object) strList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean44 = strList42.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList42);
        java.lang.String str46 = strList45.getFirst();
        boolean boolean48 = strList45.addLast("hi!");
        strList45.clear();
        boolean boolean51 = strList45.add("");
        boolean boolean52 = strList3.addAll((java.util.Collection<java.lang.String>) strList45);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList53 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean55 = strList53.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList53);
        boolean boolean58 = strList56.add("hi!");
        int int60 = strList56.indexOf((java.lang.Object) (-5));
        boolean boolean61 = strList3.removeAll((java.util.Collection<java.lang.String>) strList56);
        int int62 = strList56.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = strList56.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test543");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        java.lang.Object obj3 = null;
        boolean boolean4 = strList0.remove(obj3);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        int int7 = strList5.indexOf((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean10 = strList8.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList8);
        boolean boolean13 = strList11.remove((java.lang.Object) (-8));
        boolean boolean14 = strList11.isEmpty();
        boolean boolean15 = strList5.remove((java.lang.Object) boolean14);
        boolean boolean17 = strList5.add("");
        boolean boolean18 = strList0.addAll((java.util.Collection<java.lang.String>) strList5);
        int int20 = strList0.indexOf((java.lang.Object) 100);
        boolean boolean22 = strList0.addFirst("hi!");
        java.lang.String str23 = strList0.getLast();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test544");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        java.lang.Object obj3 = null;
        boolean boolean4 = strList0.remove(obj3);
        boolean boolean5 = strList0.isEmpty();
        boolean boolean6 = strList0.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList7 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean9 = strList7.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList7);
        boolean boolean12 = strList10.add("hi!");
        int int14 = strList10.indexOf((java.lang.Object) (-5));
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList15);
        boolean boolean20 = strList18.remove((java.lang.Object) (-8));
        boolean boolean21 = strList18.isEmpty();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        boolean boolean27 = strList18.removeAll((java.util.Collection<java.lang.String>) strList25);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        boolean boolean37 = strList18.addAll((java.util.Collection<java.lang.String>) strList31);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        boolean boolean39 = strList10.addAll((java.util.Collection<java.lang.String>) strList38);
        java.lang.String str40 = strList10.removeFirst();
        boolean boolean41 = strList0.removeAll((java.util.Collection<java.lang.String>) strList10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test545");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String str9 = strList3.set((int) (short) 0, "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean12 = strList10.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        java.lang.Object obj16 = null;
        boolean boolean17 = strList13.remove(obj16);
        boolean boolean18 = strList10.addAll((java.util.Collection<java.lang.String>) strList13);
        int int19 = strList13.size();
        boolean boolean20 = strList3.addAll((java.util.Collection<java.lang.String>) strList13);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList21 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean24 = strList22.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean27 = strList25.addLast("");
        java.lang.Object obj28 = null;
        boolean boolean29 = strList25.remove(obj28);
        boolean boolean30 = strList22.addAll((java.util.Collection<java.lang.String>) strList25);
        int int31 = strList25.size();
        boolean boolean33 = strList25.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean36 = strList34.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean39 = strList37.addLast("");
        java.lang.Object obj40 = null;
        boolean boolean41 = strList37.remove(obj40);
        boolean boolean42 = strList34.addAll((java.util.Collection<java.lang.String>) strList37);
        boolean boolean44 = strList37.addLast("hi!");
        int int45 = strList25.indexOf((java.lang.Object) "hi!");
        java.lang.String str47 = strList25.get(0);
        boolean boolean48 = strList21.addAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean50 = strList25.add("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = strList25.get(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (2) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test546");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        java.lang.String str13 = strList0.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList17.removeAll((java.util.Collection<java.lang.String>) strList24);
        boolean boolean27 = strList0.remove((java.lang.Object) strList17);
        int int28 = strList17.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList29 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean31 = strList29.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean34 = strList32.addLast("");
        java.lang.Object obj35 = null;
        boolean boolean36 = strList32.remove(obj35);
        boolean boolean37 = strList29.addAll((java.util.Collection<java.lang.String>) strList32);
        int int38 = strList32.size();
        java.lang.String str39 = strList32.getFirst();
        boolean boolean40 = strList17.addAll((java.util.Collection<java.lang.String>) strList32);
        int int41 = strList32.size();
        java.lang.String str42 = strList32.getFirst();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test547");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        boolean boolean7 = strList3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strList3.set(2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (2) greater than the size of the list (1).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test548");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList0.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean12 = strList10.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        java.lang.Object obj16 = null;
        boolean boolean17 = strList13.remove(obj16);
        boolean boolean18 = strList10.addAll((java.util.Collection<java.lang.String>) strList13);
        java.lang.String str20 = strList10.get(0);
        boolean boolean22 = strList10.remove((java.lang.Object) 10);
        java.lang.String str23 = strList10.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean26 = strList24.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList27 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList24);
        boolean boolean29 = strList27.remove((java.lang.Object) (-8));
        boolean boolean30 = strList27.isEmpty();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        boolean boolean36 = strList27.removeAll((java.util.Collection<java.lang.String>) strList34);
        boolean boolean37 = strList10.remove((java.lang.Object) strList27);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean40 = strList38.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean43 = strList41.addLast("");
        java.lang.Object obj44 = null;
        boolean boolean45 = strList41.remove(obj44);
        boolean boolean46 = strList38.addAll((java.util.Collection<java.lang.String>) strList41);
        int int47 = strList38.size();
        boolean boolean48 = strList10.remove((java.lang.Object) strList38);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList49 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        boolean boolean50 = strList0.remove((java.lang.Object) strList49);
        java.lang.String str52 = strList49.get((int) (byte) 0);
        java.lang.String str53 = strList49.removeFirst();
        java.lang.String str54 = strList49.getFirst();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test549");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        java.lang.String str13 = strList0.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList17.removeAll((java.util.Collection<java.lang.String>) strList24);
        boolean boolean27 = strList0.remove((java.lang.Object) strList17);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        int int37 = strList28.size();
        boolean boolean38 = strList0.remove((java.lang.Object) strList28);
        int int39 = strList0.size();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        strList0.add(0, "hi!");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test550");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean3 = strList1.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList4 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean6 = strList4.addLast("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strList4.remove(obj7);
        boolean boolean9 = strList1.addAll((java.util.Collection<java.lang.String>) strList4);
        java.lang.String str11 = strList1.get(0);
        boolean boolean13 = strList1.remove((java.lang.Object) 10);
        java.lang.String str14 = strList1.getFirst();
        java.lang.String str15 = strList1.removeFirst();
        boolean boolean16 = strList0.removeAll((java.util.Collection<java.lang.String>) strList1);
        java.lang.String str17 = strList1.removeLast();
        int int18 = strList1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList21 = strList1.subList(0, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-5)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test551");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        java.lang.Object obj18 = null;
        boolean boolean19 = strList15.remove(obj18);
        boolean boolean20 = strList12.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean22 = strList15.addLast("hi!");
        int int23 = strList3.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean27 = strList25.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        java.lang.Object obj31 = null;
        boolean boolean32 = strList28.remove(obj31);
        boolean boolean33 = strList25.addAll((java.util.Collection<java.lang.String>) strList28);
        java.lang.String str35 = strList25.get(0);
        boolean boolean37 = strList25.remove((java.lang.Object) 10);
        java.lang.String str38 = strList25.getFirst();
        java.lang.String str39 = strList25.removeFirst();
        boolean boolean40 = strList24.removeAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean41 = strList3.remove((java.lang.Object) strList24);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean44 = strList42.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList42);
        java.lang.String str46 = strList45.getFirst();
        boolean boolean48 = strList45.addLast("hi!");
        strList45.clear();
        boolean boolean51 = strList45.add("");
        boolean boolean52 = strList3.addAll((java.util.Collection<java.lang.String>) strList45);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList53 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean55 = strList53.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList53);
        boolean boolean58 = strList56.add("hi!");
        int int60 = strList56.indexOf((java.lang.Object) (-5));
        boolean boolean61 = strList3.removeAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean63 = strList3.add("");
        boolean boolean65 = strList3.addLast("");
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator66 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList3.replaceAll(strUnaryOperator66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test552");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList3.removeAll((java.util.Collection<java.lang.String>) strList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        boolean boolean21 = strList13.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean22 = strList3.addAll((java.util.Collection<java.lang.String>) strList16);
        java.lang.String str25 = strList16.set(0, "");
        java.lang.String str26 = strList16.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList16.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (1) is the size of the list.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test553");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        java.lang.String str13 = strList0.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList17.removeAll((java.util.Collection<java.lang.String>) strList24);
        boolean boolean27 = strList0.remove((java.lang.Object) strList17);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        boolean boolean38 = strList31.addLast("hi!");
        strList31.clear();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean42 = strList40.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList43 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList40);
        boolean boolean45 = strList43.remove((java.lang.Object) (-8));
        boolean boolean46 = strList43.isEmpty();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = strList43.removeAll((java.util.Collection<java.lang.String>) strList50);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList53 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean55 = strList53.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean58 = strList56.addLast("");
        java.lang.Object obj59 = null;
        boolean boolean60 = strList56.remove(obj59);
        boolean boolean61 = strList53.addAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean62 = strList43.addAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean63 = strList31.removeAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean64 = strList0.removeAll((java.util.Collection<java.lang.String>) strList31);
        strList0.clear();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test554");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        boolean boolean12 = strList3.isEmpty();
        int int13 = strList3.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String str23 = strList17.set((int) (short) 0, "hi!");
        boolean boolean24 = strList3.addAll((java.util.Collection<java.lang.String>) strList17);
        boolean boolean26 = strList3.addFirst("hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        java.lang.String str38 = strList28.get(0);
        boolean boolean39 = strList28.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean42 = strList40.addLast("");
        java.lang.Object obj43 = null;
        boolean boolean44 = strList40.remove(obj43);
        boolean boolean45 = strList28.addAll((java.util.Collection<java.lang.String>) strList40);
        java.lang.String str46 = strList28.getFirst();
        boolean boolean47 = strList3.addAll(2, (java.util.Collection<java.lang.String>) strList28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = strList3.get((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-5) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test555");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean3 = strList1.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList4 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean6 = strList4.addLast("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strList4.remove(obj7);
        boolean boolean9 = strList1.addAll((java.util.Collection<java.lang.String>) strList4);
        java.lang.String str11 = strList1.get(0);
        boolean boolean13 = strList1.remove((java.lang.Object) 10);
        java.lang.String str14 = strList1.getFirst();
        java.lang.String str15 = strList1.removeFirst();
        boolean boolean16 = strList0.removeAll((java.util.Collection<java.lang.String>) strList1);
        java.lang.String str17 = strList1.removeLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean22 = strList20.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        java.lang.Object obj26 = null;
        boolean boolean27 = strList23.remove(obj26);
        boolean boolean28 = strList20.addAll((java.util.Collection<java.lang.String>) strList23);
        java.lang.String str30 = strList20.get(0);
        boolean boolean32 = strList20.remove((java.lang.Object) 10);
        java.lang.String str33 = strList20.getFirst();
        java.lang.String str34 = strList20.removeFirst();
        boolean boolean35 = strList19.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.String str36 = strList20.removeLast();
        boolean boolean38 = strList20.remove((java.lang.Object) (-1.0f));
        boolean boolean39 = strList18.removeAll((java.util.Collection<java.lang.String>) strList20);
        int int40 = strList1.indexOf((java.lang.Object) strList18);
        boolean boolean42 = strList1.add("hi!");
        boolean boolean44 = strList1.addFirst("hi!");
        boolean boolean45 = strList1.isEmpty();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test556");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((int) (short) 1);
        boolean boolean2 = strList1.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test557");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        java.lang.Object obj3 = null;
        boolean boolean4 = strList0.remove(obj3);
        int int6 = strList0.indexOf((java.lang.Object) 10L);
        java.lang.String str7 = strList0.getLast();
        boolean boolean9 = strList0.add("hi!");
        boolean boolean11 = strList0.add("");
        boolean boolean13 = strList0.addFirst("");
        boolean boolean14 = strList0.isEmpty();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test558");
        DataStructures.commonscollections.NodeCachingLinkedList<java.util.ArrayList<java.lang.String>> strListList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.util.ArrayList<java.lang.String>>((int) 'a');
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test559");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean7 = strList5.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean10 = strList8.addLast("");
        java.lang.Object obj11 = null;
        boolean boolean12 = strList8.remove(obj11);
        boolean boolean13 = strList5.addAll((java.util.Collection<java.lang.String>) strList8);
        boolean boolean15 = strList8.addLast("hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        boolean boolean20 = strList8.removeAll((java.util.Collection<java.lang.String>) strList18);
        boolean boolean21 = strList3.addAll((int) (short) 1, (java.util.Collection<java.lang.String>) strList8);
        boolean boolean23 = strList8.addLast("");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test560");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean3 = strList1.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList4 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean6 = strList4.addLast("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strList4.remove(obj7);
        boolean boolean9 = strList1.addAll((java.util.Collection<java.lang.String>) strList4);
        java.lang.String str11 = strList1.get(0);
        boolean boolean13 = strList1.remove((java.lang.Object) 10);
        java.lang.String str14 = strList1.getFirst();
        java.lang.String str15 = strList1.removeFirst();
        boolean boolean16 = strList0.removeAll((java.util.Collection<java.lang.String>) strList1);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean19 = strList17.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean22 = strList20.addLast("");
        java.lang.Object obj23 = null;
        boolean boolean24 = strList20.remove(obj23);
        boolean boolean25 = strList17.addAll((java.util.Collection<java.lang.String>) strList20);
        int int26 = strList20.size();
        boolean boolean27 = strList0.removeAll((java.util.Collection<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList30 = strList20.subList((-6), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test561");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        java.lang.String str13 = strList0.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList17.removeAll((java.util.Collection<java.lang.String>) strList24);
        boolean boolean27 = strList0.remove((java.lang.Object) strList17);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        boolean boolean38 = strList31.addLast("hi!");
        strList31.clear();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean42 = strList40.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList43 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList40);
        boolean boolean45 = strList43.remove((java.lang.Object) (-8));
        boolean boolean46 = strList43.isEmpty();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = strList43.removeAll((java.util.Collection<java.lang.String>) strList50);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList53 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean55 = strList53.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean58 = strList56.addLast("");
        java.lang.Object obj59 = null;
        boolean boolean60 = strList56.remove(obj59);
        boolean boolean61 = strList53.addAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean62 = strList43.addAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean63 = strList31.removeAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean64 = strList0.removeAll((java.util.Collection<java.lang.String>) strList31);
        boolean boolean66 = strList31.add("");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test562");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((-8));
        strList1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = strList1.subList((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test563");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String str9 = strList3.set((int) (short) 0, "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean12 = strList10.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        java.lang.Object obj16 = null;
        boolean boolean17 = strList13.remove(obj16);
        boolean boolean18 = strList10.addAll((java.util.Collection<java.lang.String>) strList13);
        int int19 = strList13.size();
        boolean boolean20 = strList3.addAll((java.util.Collection<java.lang.String>) strList13);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList21 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean24 = strList22.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean27 = strList25.addLast("");
        java.lang.Object obj28 = null;
        boolean boolean29 = strList25.remove(obj28);
        boolean boolean30 = strList22.addAll((java.util.Collection<java.lang.String>) strList25);
        int int31 = strList25.size();
        boolean boolean33 = strList25.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean36 = strList34.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList37 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean39 = strList37.addLast("");
        java.lang.Object obj40 = null;
        boolean boolean41 = strList37.remove(obj40);
        boolean boolean42 = strList34.addAll((java.util.Collection<java.lang.String>) strList37);
        boolean boolean44 = strList37.addLast("hi!");
        int int45 = strList25.indexOf((java.lang.Object) "hi!");
        java.lang.String str47 = strList25.get(0);
        boolean boolean48 = strList21.addAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean50 = strList25.add("hi!");
        boolean boolean52 = strList25.add("hi!");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test564");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        boolean boolean10 = strList3.addLast("hi!");
        strList3.clear();
        boolean boolean13 = strList3.addLast("");
        boolean boolean15 = strList3.add("hi!");
        boolean boolean17 = strList3.addFirst("");
        java.lang.String str18 = strList3.getFirst();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test565");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean11 = strList0.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        java.lang.Object obj15 = null;
        boolean boolean16 = strList12.remove(obj15);
        boolean boolean17 = strList0.addAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String str18 = strList0.getFirst();
        java.lang.String str19 = strList0.getFirst();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test566");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean11 = strList0.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList12 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean14 = strList12.addLast("");
        java.lang.Object obj15 = null;
        boolean boolean16 = strList12.remove(obj15);
        boolean boolean17 = strList0.addAll((java.util.Collection<java.lang.String>) strList12);
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (97) greater than the size of the list (3).");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test567");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String str9 = strList3.set((int) (short) 0, "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean12 = strList10.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        java.lang.Object obj16 = null;
        boolean boolean17 = strList13.remove(obj16);
        boolean boolean18 = strList10.addAll((java.util.Collection<java.lang.String>) strList13);
        int int19 = strList13.size();
        boolean boolean21 = strList13.remove((java.lang.Object) 1L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean24 = strList22.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList25 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean27 = strList25.addLast("");
        java.lang.Object obj28 = null;
        boolean boolean29 = strList25.remove(obj28);
        boolean boolean30 = strList22.addAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean32 = strList25.addLast("hi!");
        int int33 = strList13.indexOf((java.lang.Object) "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList34 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean37 = strList35.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean40 = strList38.addLast("");
        java.lang.Object obj41 = null;
        boolean boolean42 = strList38.remove(obj41);
        boolean boolean43 = strList35.addAll((java.util.Collection<java.lang.String>) strList38);
        java.lang.String str45 = strList35.get(0);
        boolean boolean47 = strList35.remove((java.lang.Object) 10);
        java.lang.String str48 = strList35.getFirst();
        java.lang.String str49 = strList35.removeFirst();
        boolean boolean50 = strList34.removeAll((java.util.Collection<java.lang.String>) strList35);
        boolean boolean51 = strList13.remove((java.lang.Object) strList34);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList52 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean54 = strList52.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList55 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList52);
        java.lang.String str56 = strList55.getFirst();
        boolean boolean58 = strList55.addLast("hi!");
        strList55.clear();
        boolean boolean61 = strList55.add("");
        boolean boolean62 = strList13.addAll((java.util.Collection<java.lang.String>) strList55);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList63 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean65 = strList63.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList66 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList63);
        boolean boolean68 = strList66.add("hi!");
        int int70 = strList66.indexOf((java.lang.Object) (-5));
        boolean boolean71 = strList13.removeAll((java.util.Collection<java.lang.String>) strList66);
        int int72 = strList3.indexOf((java.lang.Object) strList66);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList73 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList76 = strList73.subList(0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test568");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean3 = strList1.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList4 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean6 = strList4.addLast("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strList4.remove(obj7);
        boolean boolean9 = strList1.addAll((java.util.Collection<java.lang.String>) strList4);
        java.lang.String str11 = strList1.get(0);
        boolean boolean13 = strList1.remove((java.lang.Object) 10);
        java.lang.String str14 = strList1.getFirst();
        java.lang.String str15 = strList1.removeFirst();
        boolean boolean16 = strList0.removeAll((java.util.Collection<java.lang.String>) strList1);
        java.lang.String str17 = strList1.removeLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean22 = strList20.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        java.lang.Object obj26 = null;
        boolean boolean27 = strList23.remove(obj26);
        boolean boolean28 = strList20.addAll((java.util.Collection<java.lang.String>) strList23);
        java.lang.String str30 = strList20.get(0);
        boolean boolean32 = strList20.remove((java.lang.Object) 10);
        java.lang.String str33 = strList20.getFirst();
        java.lang.String str34 = strList20.removeFirst();
        boolean boolean35 = strList19.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.String str36 = strList20.removeLast();
        boolean boolean38 = strList20.remove((java.lang.Object) (-1.0f));
        boolean boolean39 = strList18.removeAll((java.util.Collection<java.lang.String>) strList20);
        int int40 = strList1.indexOf((java.lang.Object) strList18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = strList1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test569");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String str9 = strList3.set((int) (short) 0, "hi!");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList10 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean12 = strList10.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        java.lang.Object obj16 = null;
        boolean boolean17 = strList13.remove(obj16);
        boolean boolean18 = strList10.addAll((java.util.Collection<java.lang.String>) strList13);
        int int19 = strList13.size();
        boolean boolean20 = strList3.addAll((java.util.Collection<java.lang.String>) strList13);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList21 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList22 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList21);
        java.lang.String str23 = strList22.getLast();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test570");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        java.lang.String str13 = strList0.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList17.removeAll((java.util.Collection<java.lang.String>) strList24);
        boolean boolean27 = strList0.remove((java.lang.Object) strList17);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean33 = strList31.addLast("");
        java.lang.Object obj34 = null;
        boolean boolean35 = strList31.remove(obj34);
        boolean boolean36 = strList28.addAll((java.util.Collection<java.lang.String>) strList31);
        java.lang.String str38 = strList28.get(0);
        boolean boolean39 = strList28.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList40 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean42 = strList40.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList43 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList40);
        java.lang.String str44 = strList43.getLast();
        java.lang.String str45 = strList43.removeFirst();
        boolean boolean46 = strList28.remove((java.lang.Object) str45);
        boolean boolean47 = strList0.addAll((java.util.Collection<java.lang.String>) strList28);
        int int48 = strList0.size();
        java.lang.String str49 = strList0.removeLast();
        // The following exception was thrown during execution in test generation
        try {
            strList0.add((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Couldn't get the node: index (-1) less than zero.");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test571");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean19 = strList17.addLast("");
        java.lang.Object obj20 = null;
        boolean boolean21 = strList17.remove(obj20);
        boolean boolean22 = strList14.addAll((java.util.Collection<java.lang.String>) strList17);
        java.lang.String str24 = strList14.get(0);
        boolean boolean26 = strList14.remove((java.lang.Object) 10);
        java.lang.String str27 = strList14.getFirst();
        java.lang.String str28 = strList14.removeFirst();
        boolean boolean29 = strList13.removeAll((java.util.Collection<java.lang.String>) strList14);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList30 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean32 = strList30.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList33 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean35 = strList33.addLast("");
        java.lang.Object obj36 = null;
        boolean boolean37 = strList33.remove(obj36);
        boolean boolean38 = strList30.addAll((java.util.Collection<java.lang.String>) strList33);
        int int39 = strList33.size();
        boolean boolean40 = strList13.removeAll((java.util.Collection<java.lang.String>) strList33);
        int int41 = strList13.getCacheSize();
        int int42 = strList13.getCacheSize();
        int int43 = strList0.indexOf((java.lang.Object) int42);
        java.lang.String str44 = strList0.getFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList47 = strList0.subList(8, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test572");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList3.removeAll((java.util.Collection<java.lang.String>) strList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        boolean boolean21 = strList13.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean22 = strList3.addAll((java.util.Collection<java.lang.String>) strList16);
        int int23 = strList16.size();
        java.lang.String str24 = strList16.removeLast();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test573");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        int int2 = strList0.indexOf((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList6 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        boolean boolean8 = strList6.remove((java.lang.Object) (-8));
        boolean boolean9 = strList6.isEmpty();
        boolean boolean10 = strList0.remove((java.lang.Object) boolean9);
        boolean boolean12 = strList0.add("");
        boolean boolean14 = strList0.addFirst("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean21 = strList19.addLast("");
        java.lang.Object obj22 = null;
        boolean boolean23 = strList19.remove(obj22);
        boolean boolean24 = strList16.addAll((java.util.Collection<java.lang.String>) strList19);
        java.lang.String str26 = strList16.get(0);
        boolean boolean27 = strList16.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList28 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean30 = strList28.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList31 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList28);
        java.lang.String str32 = strList31.getLast();
        java.lang.String str33 = strList31.removeFirst();
        boolean boolean34 = strList16.remove((java.lang.Object) str33);
        java.lang.String str35 = strList16.removeLast();
        boolean boolean36 = strList0.addAll(1, (java.util.Collection<java.lang.String>) strList16);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test574");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        java.lang.String str10 = strList3.getFirst();
        boolean boolean12 = strList3.addFirst("hi!");
        int int13 = strList3.size();
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList3.replaceAll(strUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test575");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        java.lang.String str13 = strList0.getFirst();
        java.lang.String str14 = strList0.removeFirst();
        java.lang.String str15 = strList0.getLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean19 = strList17.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        boolean boolean22 = strList20.remove((java.lang.Object) (-8));
        int int23 = strList16.indexOf((java.lang.Object) boolean22);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test576");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        boolean boolean12 = strList0.remove((java.lang.Object) 10);
        java.lang.String str13 = strList0.getFirst();
        boolean boolean15 = strList0.addLast("hi!");
        strList0.clear();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test577");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        java.lang.String str10 = strList0.get(0);
        java.lang.String str12 = strList0.get(0);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList13);
        boolean boolean18 = strList16.remove((java.lang.Object) (-8));
        boolean boolean19 = strList16.isEmpty();
        java.lang.String str22 = strList16.set((int) (short) 0, "hi!");
        boolean boolean24 = strList16.add("hi!");
        boolean boolean25 = strList0.addAll((java.util.Collection<java.lang.String>) strList16);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean28 = strList26.addLast("");
        java.lang.Object obj29 = null;
        boolean boolean30 = strList26.remove(obj29);
        int int32 = strList26.indexOf((java.lang.Object) 10L);
        java.lang.String str33 = strList26.getLast();
        boolean boolean34 = strList0.removeAll((java.util.Collection<java.lang.String>) strList26);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean37 = strList35.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        boolean boolean40 = strList38.remove((java.lang.Object) (-8));
        boolean boolean41 = strList38.isEmpty();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        boolean boolean47 = strList38.removeAll((java.util.Collection<java.lang.String>) strList45);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList48 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean50 = strList48.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList51 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean53 = strList51.addLast("");
        java.lang.Object obj54 = null;
        boolean boolean55 = strList51.remove(obj54);
        boolean boolean56 = strList48.addAll((java.util.Collection<java.lang.String>) strList51);
        boolean boolean57 = strList38.addAll((java.util.Collection<java.lang.String>) strList51);
        boolean boolean58 = strList26.remove((java.lang.Object) boolean57);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test578");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList0);
        boolean boolean5 = strList3.remove((java.lang.Object) (-8));
        boolean boolean6 = strList3.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList3.removeAll((java.util.Collection<java.lang.String>) strList10);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList13 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean15 = strList13.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList16 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean18 = strList16.addLast("");
        java.lang.Object obj19 = null;
        boolean boolean20 = strList16.remove(obj19);
        boolean boolean21 = strList13.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean22 = strList3.addAll((java.util.Collection<java.lang.String>) strList16);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList26 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean28 = strList26.addLast("");
        java.lang.Object obj29 = null;
        boolean boolean30 = strList26.remove(obj29);
        boolean boolean31 = strList23.addAll((java.util.Collection<java.lang.String>) strList26);
        java.lang.String str33 = strList23.get(0);
        boolean boolean34 = strList23.isEmpty();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean37 = strList35.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        java.lang.String str39 = strList38.getLast();
        java.lang.String str40 = strList38.removeFirst();
        boolean boolean41 = strList23.remove((java.lang.Object) str40);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList42 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean44 = strList42.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList45 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean47 = strList45.addLast("");
        java.lang.Object obj48 = null;
        boolean boolean49 = strList45.remove(obj48);
        boolean boolean50 = strList42.addAll((java.util.Collection<java.lang.String>) strList45);
        java.lang.String str52 = strList42.get(0);
        boolean boolean54 = strList42.remove((java.lang.Object) 10);
        java.lang.String str55 = strList42.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList56 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean58 = strList56.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList59 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        boolean boolean61 = strList59.remove((java.lang.Object) (-8));
        boolean boolean62 = strList59.isEmpty();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = strList59.removeAll((java.util.Collection<java.lang.String>) strList66);
        boolean boolean69 = strList42.remove((java.lang.Object) strList59);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList70 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean72 = strList70.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList73 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean75 = strList73.addLast("");
        java.lang.Object obj76 = null;
        boolean boolean77 = strList73.remove(obj76);
        boolean boolean78 = strList70.addAll((java.util.Collection<java.lang.String>) strList73);
        int int79 = strList70.size();
        boolean boolean80 = strList42.remove((java.lang.Object) strList70);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList81 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean83 = strList81.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList84 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList81);
        boolean boolean86 = strList84.add("hi!");
        int int88 = strList84.indexOf((java.lang.Object) (-5));
        int int89 = strList70.indexOf((java.lang.Object) int88);
        boolean boolean90 = strList23.addAll((java.util.Collection<java.lang.String>) strList70);
        boolean boolean91 = strList16.removeAll((java.util.Collection<java.lang.String>) strList23);
        int int92 = strList23.getCacheSize();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList95 = strList23.subList((-8), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -8");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test579");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList1 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean3 = strList1.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList4 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean6 = strList4.addLast("");
        java.lang.Object obj7 = null;
        boolean boolean8 = strList4.remove(obj7);
        boolean boolean9 = strList1.addAll((java.util.Collection<java.lang.String>) strList4);
        java.lang.String str11 = strList1.get(0);
        boolean boolean13 = strList1.remove((java.lang.Object) 10);
        java.lang.String str14 = strList1.getFirst();
        java.lang.String str15 = strList1.removeFirst();
        boolean boolean16 = strList0.removeAll((java.util.Collection<java.lang.String>) strList1);
        java.lang.String str17 = strList1.removeLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList18 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList20 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean22 = strList20.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList23 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean25 = strList23.addLast("");
        java.lang.Object obj26 = null;
        boolean boolean27 = strList23.remove(obj26);
        boolean boolean28 = strList20.addAll((java.util.Collection<java.lang.String>) strList23);
        java.lang.String str30 = strList20.get(0);
        boolean boolean32 = strList20.remove((java.lang.Object) 10);
        java.lang.String str33 = strList20.getFirst();
        java.lang.String str34 = strList20.removeFirst();
        boolean boolean35 = strList19.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.String str36 = strList20.removeLast();
        boolean boolean38 = strList20.remove((java.lang.Object) (-1.0f));
        boolean boolean39 = strList18.removeAll((java.util.Collection<java.lang.String>) strList20);
        int int40 = strList1.indexOf((java.lang.Object) strList18);
        boolean boolean42 = strList1.add("hi!");
        boolean boolean44 = strList1.addFirst("hi!");
        java.lang.String str45 = strList1.getFirst();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test580");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        java.lang.Object obj3 = null;
        boolean boolean4 = strList0.remove(obj3);
        int int6 = strList0.indexOf((java.lang.Object) 10L);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((int) (byte) 1);
        boolean boolean9 = strList0.removeAll((java.util.Collection<java.lang.String>) strList8);
        java.lang.String str10 = strList0.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean13 = strList11.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        java.lang.Object obj17 = null;
        boolean boolean18 = strList14.remove(obj17);
        boolean boolean19 = strList11.addAll((java.util.Collection<java.lang.String>) strList14);
        java.lang.String str21 = strList11.get(0);
        boolean boolean23 = strList11.remove((java.lang.Object) 10);
        java.lang.String str24 = strList11.getFirst();
        java.lang.String str25 = strList11.removeFirst();
        java.lang.String str26 = strList11.getLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList27 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList11);
        int int28 = strList0.indexOf((java.lang.Object) strList27);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test581");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        java.lang.Object obj3 = null;
        boolean boolean4 = strList0.remove(obj3);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList5 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        int int7 = strList5.indexOf((java.lang.Object) (byte) 100);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList8 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean10 = strList8.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList11 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList8);
        boolean boolean13 = strList11.remove((java.lang.Object) (-8));
        boolean boolean14 = strList11.isEmpty();
        boolean boolean15 = strList5.remove((java.lang.Object) boolean14);
        boolean boolean17 = strList5.add("");
        boolean boolean18 = strList0.addAll((java.util.Collection<java.lang.String>) strList5);
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList5);
        java.lang.String str20 = strList5.removeLast();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList21 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean23 = strList21.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList24 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean26 = strList24.addLast("");
        java.lang.Object obj27 = null;
        boolean boolean28 = strList24.remove(obj27);
        boolean boolean29 = strList21.addAll((java.util.Collection<java.lang.String>) strList24);
        java.lang.String str31 = strList21.get(0);
        boolean boolean33 = strList21.remove((java.lang.Object) 10);
        java.lang.String str34 = strList21.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList35 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean37 = strList35.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList38 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        boolean boolean40 = strList38.remove((java.lang.Object) (-8));
        boolean boolean41 = strList38.isEmpty();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        boolean boolean47 = strList38.removeAll((java.util.Collection<java.lang.String>) strList45);
        boolean boolean48 = strList21.remove((java.lang.Object) strList38);
        boolean boolean49 = strList21.isEmpty();
        boolean boolean50 = strList5.addAll((java.util.Collection<java.lang.String>) strList21);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test582");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        boolean boolean12 = strList3.isEmpty();
        boolean boolean14 = strList3.add("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList15 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean17 = strList15.addLast("");
        boolean boolean18 = strList3.remove((java.lang.Object) "");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList19 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        boolean boolean20 = strList19.isEmpty();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NodeCachingLinkedListTester1.test583");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList0 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean2 = strList0.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList3 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean5 = strList3.addLast("");
        java.lang.Object obj6 = null;
        boolean boolean7 = strList3.remove(obj6);
        boolean boolean8 = strList0.addAll((java.util.Collection<java.lang.String>) strList3);
        int int9 = strList3.size();
        boolean boolean11 = strList3.remove((java.lang.Object) 1L);
        boolean boolean12 = strList3.isEmpty();
        int int13 = strList3.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList14 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean16 = strList14.addLast("");
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList17 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = strList17.remove((java.lang.Object) (-8));
        boolean boolean20 = strList17.isEmpty();
        java.lang.String str23 = strList17.set((int) (short) 0, "hi!");
        boolean boolean24 = strList3.addAll((java.util.Collection<java.lang.String>) strList17);
        boolean boolean26 = strList3.addFirst("hi!");
        boolean boolean28 = strList3.addFirst("");
        boolean boolean30 = strList3.add("");
        java.lang.String str31 = strList3.getFirst();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String> strList32 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.String>();
        boolean boolean34 = strList32.addLast("");
        java.lang.Object obj35 = null;
        boolean boolean36 = strList32.remove(obj35);
        int int38 = strList32.indexOf((java.lang.Object) 10L);
        java.lang.String str39 = strList32.getLast();
        int int40 = strList32.getCacheSize();
        DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence> charSequenceList41 = new DataStructures.commonscollections.NodeCachingLinkedList<java.lang.CharSequence>((java.util.Collection<java.lang.String>) strList32);
        java.lang.String str42 = strList32.getFirst();
        boolean boolean43 = strList3.remove((java.lang.Object) strList32);
    }
}

