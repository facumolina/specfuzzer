package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvlTreeListTester1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test501");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        boolean boolean22 = strList19.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean30 = strList19.addAll((java.util.Collection<java.lang.String>) strList28);
        strList19.clear();
        boolean boolean32 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList33.containsAll((java.util.Collection<java.lang.String>) strList36);
        strList33.clear();
        boolean boolean40 = strList5.contains((java.lang.Object) strList33);
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream42 = strList33.stream();
        DataStructures.AvlTreeList<java.lang.Object> objList43 = new DataStructures.AvlTreeList<java.lang.Object>((java.util.Collection<java.lang.String>) strList33);
        int int44 = strList33.size();
        boolean boolean45 = strList33.isEmpty();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test502");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        java.util.stream.Stream<java.lang.String> strStream21 = strList20.parallelStream();
        boolean boolean23 = strList20.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        DataStructures.AvlTreeList<java.lang.String> strList29 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList27);
        java.util.stream.Stream<java.lang.String> strStream30 = strList29.parallelStream();
        boolean boolean31 = strList20.addAll((java.util.Collection<java.lang.String>) strList29);
        strList20.clear();
        boolean boolean33 = strList14.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        DataStructures.AvlTreeList<java.lang.String> strList39 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList37);
        java.util.stream.Stream<java.lang.String> strStream40 = strList39.parallelStream();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList39.addAll((java.util.Collection<java.lang.String>) strList43);
        int int46 = strList14.lastIndexOf((java.lang.Object) strList39);
        boolean boolean47 = strList5.equals((java.lang.Object) int46);
        strList5.clear();
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator49 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList5.replaceAll(strUnaryOperator49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test503");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        int int12 = strList5.size();
        boolean boolean13 = strList5.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor15 = strList14.iterator();
        boolean boolean17 = strList14.add("");
        boolean boolean19 = strList14.add("");
        boolean boolean20 = strList5.containsAll((java.util.Collection<java.lang.String>) strList14);
        java.util.Spliterator<java.lang.String> strSpliterator21 = strList14.spliterator();
        DataStructures.AvlTreeList<java.lang.String> strList22 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        boolean boolean27 = strList22.containsAll((java.util.Collection<java.lang.String>) strList25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList31);
        boolean boolean34 = strList33.isEmpty();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        DataStructures.AvlTreeList<java.lang.String> strList40 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.lang.String> strStream41 = strList40.parallelStream();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        boolean boolean48 = strList40.containsAll((java.util.Collection<java.lang.String>) strList47);
        strList47.clear();
        boolean boolean50 = strList33.containsAll((java.util.Collection<java.lang.String>) strList47);
        boolean boolean51 = strList25.removeAll((java.util.Collection<java.lang.String>) strList47);
        java.lang.Object[] objArray52 = strList25.toArray();
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        DataStructures.AvlTreeList<java.lang.String> strList58 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        java.util.stream.Stream<java.lang.String> strStream59 = strList58.parallelStream();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        DataStructures.AvlTreeList<java.lang.String> strList65 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList63);
        boolean boolean66 = strList58.containsAll((java.util.Collection<java.lang.String>) strList65);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        DataStructures.AvlTreeList<java.lang.String> strList72 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList70);
        java.util.stream.Stream<java.lang.String> strStream73 = strList72.parallelStream();
        boolean boolean75 = strList72.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        DataStructures.AvlTreeList<java.lang.String> strList81 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList79);
        java.util.stream.Stream<java.lang.String> strStream82 = strList81.parallelStream();
        boolean boolean83 = strList72.addAll((java.util.Collection<java.lang.String>) strList81);
        strList72.clear();
        boolean boolean85 = strList58.containsAll((java.util.Collection<java.lang.String>) strList72);
        DataStructures.AvlTreeList<java.lang.String> strList86 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        boolean boolean91 = strList86.containsAll((java.util.Collection<java.lang.String>) strList89);
        strList86.clear();
        boolean boolean93 = strList58.contains((java.lang.Object) strList86);
        boolean boolean94 = strList25.containsAll((java.util.Collection<java.lang.String>) strList86);
        boolean boolean95 = strList14.containsAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean96 = strList25.isEmpty();
        java.lang.Object[] objArray97 = strList25.toArray();
        boolean boolean98 = strList25.isEmpty();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test504");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        boolean boolean18 = strList12.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strList5.addAll((java.util.Collection<java.lang.String>) strList12);
        java.util.Iterator<java.lang.String> strItor20 = strList5.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList21 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        boolean boolean26 = strList21.containsAll((java.util.Collection<java.lang.String>) strList24);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        DataStructures.AvlTreeList<java.lang.String> strList32 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        boolean boolean33 = strList32.isEmpty();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        DataStructures.AvlTreeList<java.lang.String> strList39 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList37);
        java.util.stream.Stream<java.lang.String> strStream40 = strList39.parallelStream();
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        DataStructures.AvlTreeList<java.lang.String> strList46 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList44);
        boolean boolean47 = strList39.containsAll((java.util.Collection<java.lang.String>) strList46);
        strList46.clear();
        boolean boolean49 = strList32.containsAll((java.util.Collection<java.lang.String>) strList46);
        boolean boolean50 = strList24.removeAll((java.util.Collection<java.lang.String>) strList46);
        java.lang.Object[] objArray51 = strList24.toArray();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        DataStructures.AvlTreeList<java.lang.String> strList57 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList55);
        java.util.stream.Stream<java.lang.String> strStream58 = strList57.parallelStream();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        DataStructures.AvlTreeList<java.lang.String> strList64 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList62);
        boolean boolean65 = strList57.containsAll((java.util.Collection<java.lang.String>) strList64);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        DataStructures.AvlTreeList<java.lang.String> strList71 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList69);
        java.util.stream.Stream<java.lang.String> strStream72 = strList71.parallelStream();
        boolean boolean74 = strList71.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        DataStructures.AvlTreeList<java.lang.String> strList80 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList78);
        java.util.stream.Stream<java.lang.String> strStream81 = strList80.parallelStream();
        boolean boolean82 = strList71.addAll((java.util.Collection<java.lang.String>) strList80);
        strList71.clear();
        boolean boolean84 = strList57.containsAll((java.util.Collection<java.lang.String>) strList71);
        DataStructures.AvlTreeList<java.lang.String> strList85 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        boolean boolean90 = strList85.containsAll((java.util.Collection<java.lang.String>) strList88);
        strList85.clear();
        boolean boolean92 = strList57.contains((java.lang.Object) strList85);
        boolean boolean93 = strList24.containsAll((java.util.Collection<java.lang.String>) strList85);
        java.util.Spliterator<java.lang.String> strSpliterator94 = strList85.spliterator();
        java.util.stream.Stream<java.lang.String> strStream95 = strList85.stream();
        int int96 = strList5.lastIndexOf((java.lang.Object) strList85);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test505");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        DataStructures.AvlTreeList<java.lang.String> strList11 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList9);
        java.util.stream.Stream<java.lang.String> strStream12 = strList11.parallelStream();
        boolean boolean14 = strList11.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        java.util.stream.Stream<java.lang.String> strStream21 = strList20.parallelStream();
        boolean boolean22 = strList11.addAll((java.util.Collection<java.lang.String>) strList20);
        strList11.clear();
        boolean boolean24 = strList5.removeAll((java.util.Collection<java.lang.String>) strList11);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        DataStructures.AvlTreeList<java.lang.String> strList30 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList28);
        java.util.stream.Stream<java.lang.String> strStream31 = strList30.parallelStream();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        boolean boolean36 = strList30.addAll((java.util.Collection<java.lang.String>) strList34);
        int int37 = strList5.lastIndexOf((java.lang.Object) strList30);
        boolean boolean38 = strList5.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList39 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList5);
        java.util.ListIterator<java.lang.String> strItor40 = strList5.listIterator();
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        boolean boolean46 = strList41.containsAll((java.util.Collection<java.lang.String>) strList44);
        java.util.ListIterator<java.lang.String> strItor47 = strList44.listIterator();
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        DataStructures.AvlTreeList<java.lang.String> strList53 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList51);
        java.util.stream.Stream<java.lang.String> strStream54 = strList53.parallelStream();
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        DataStructures.AvlTreeList<java.lang.String> strList60 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList58);
        java.util.stream.Stream<java.lang.String> strStream61 = strList60.parallelStream();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = strList60.addAll((java.util.Collection<java.lang.String>) strList64);
        boolean boolean67 = strList53.addAll((java.util.Collection<java.lang.String>) strList60);
        DataStructures.AvlTreeList<java.lang.String> strList68 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        boolean boolean73 = strList68.containsAll((java.util.Collection<java.lang.String>) strList71);
        java.util.ListIterator<java.lang.String> strItor74 = strList71.listIterator();
        int int75 = strList53.lastIndexOf((java.lang.Object) strItor74);
        int int76 = strList44.lastIndexOf((java.lang.Object) strItor74);
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        DataStructures.AvlTreeList<java.lang.String> strList82 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList80);
        java.util.stream.Stream<java.lang.String> strStream83 = strList82.parallelStream();
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = strList82.addAll((java.util.Collection<java.lang.String>) strList86);
        boolean boolean89 = strList44.remove((java.lang.Object) boolean88);
        boolean boolean90 = strList5.retainAll((java.util.Collection<java.lang.String>) strList44);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test506");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        strList0.clear();
        java.lang.Object[] objArray7 = strList0.toArray();
        java.util.Iterator<java.lang.String> strItor8 = strList0.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList9 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean10 = strList0.remove((java.lang.Object) strList9);
        boolean boolean12 = strList9.add("hi!");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test507");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        java.util.stream.Stream<java.lang.String> strStream21 = strList20.parallelStream();
        boolean boolean23 = strList20.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        DataStructures.AvlTreeList<java.lang.String> strList29 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList27);
        java.util.stream.Stream<java.lang.String> strStream30 = strList29.parallelStream();
        boolean boolean31 = strList20.addAll((java.util.Collection<java.lang.String>) strList29);
        strList20.clear();
        boolean boolean33 = strList14.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        DataStructures.AvlTreeList<java.lang.String> strList39 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList37);
        java.util.stream.Stream<java.lang.String> strStream40 = strList39.parallelStream();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList39.addAll((java.util.Collection<java.lang.String>) strList43);
        int int46 = strList14.lastIndexOf((java.lang.Object) strList39);
        boolean boolean47 = strList5.equals((java.lang.Object) int46);
        java.util.ListIterator<java.lang.String> strItor48 = strList5.listIterator();
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        DataStructures.AvlTreeList<java.lang.String> strList54 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList52);
        boolean boolean56 = strList52.contains((java.lang.Object) 0.0d);
        int int57 = strList5.lastIndexOf((java.lang.Object) strList52);
        java.util.stream.Stream<java.lang.String> strStream58 = strList52.parallelStream();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test508");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        DataStructures.AvlTreeList<java.lang.String> strList4 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor5 = strList4.iterator();
        boolean boolean7 = strList4.add("");
        boolean boolean9 = strList4.add("");
        boolean boolean10 = strList2.addAll((java.util.Collection<java.lang.String>) strList4);
        DataStructures.AvlTreeList<java.lang.String> strList11 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        boolean boolean16 = strList11.containsAll((java.util.Collection<java.lang.String>) strList14);
        java.util.ListIterator<java.lang.String> strItor17 = strList14.listIterator();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        DataStructures.AvlTreeList<java.lang.String> strList23 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList21);
        java.util.stream.Stream<java.lang.String> strStream24 = strList23.parallelStream();
        boolean boolean26 = strList23.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        DataStructures.AvlTreeList<java.lang.String> strList32 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList32.parallelStream();
        boolean boolean34 = strList23.addAll((java.util.Collection<java.lang.String>) strList32);
        strList23.clear();
        boolean boolean36 = strList14.addAll((java.util.Collection<java.lang.String>) strList23);
        boolean boolean37 = strList23.isEmpty();
        boolean boolean38 = strList2.containsAll((java.util.Collection<java.lang.String>) strList23);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        DataStructures.AvlTreeList<java.lang.String> strList44 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList42);
        java.util.stream.Stream<java.lang.String> strStream45 = strList44.parallelStream();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        DataStructures.AvlTreeList<java.lang.String> strList51 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList49);
        boolean boolean52 = strList44.containsAll((java.util.Collection<java.lang.String>) strList51);
        boolean boolean53 = strList2.remove((java.lang.Object) boolean52);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        DataStructures.AvlTreeList<java.lang.String> strList59 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList57);
        java.util.stream.Stream<java.lang.String> strStream60 = strList59.parallelStream();
        boolean boolean62 = strList59.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        DataStructures.AvlTreeList<java.lang.String> strList68 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList66);
        java.util.stream.Stream<java.lang.String> strStream69 = strList68.parallelStream();
        boolean boolean70 = strList59.addAll((java.util.Collection<java.lang.String>) strList68);
        int int71 = strList59.size();
        boolean boolean72 = strList59.isEmpty();
        int int73 = strList2.indexOf((java.lang.Object) strList59);
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        DataStructures.AvlTreeList<java.lang.String> strList79 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList77);
        java.util.stream.Stream<java.lang.String> strStream80 = strList79.parallelStream();
        boolean boolean82 = strList79.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray85 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        DataStructures.AvlTreeList<java.lang.String> strList88 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList86);
        java.util.stream.Stream<java.lang.String> strStream89 = strList88.parallelStream();
        boolean boolean90 = strList79.addAll((java.util.Collection<java.lang.String>) strList88);
        boolean boolean91 = strList59.equals((java.lang.Object) strList88);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test509");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        boolean boolean6 = strList5.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        boolean boolean20 = strList12.containsAll((java.util.Collection<java.lang.String>) strList19);
        strList19.clear();
        boolean boolean22 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean31 = strList28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = strList19.retainAll((java.util.Collection<java.lang.String>) strList28);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList19);
        DataStructures.AvlTreeList<java.lang.String> strList34 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        DataStructures.AvlTreeList<java.lang.String> strList40 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.lang.String> strStream41 = strList40.parallelStream();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        boolean boolean46 = strList40.addAll((java.util.Collection<java.lang.String>) strList44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        DataStructures.AvlTreeList<java.lang.String> strList52 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList50);
        java.util.stream.Stream<java.lang.String> strStream53 = strList52.parallelStream();
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        DataStructures.AvlTreeList<java.lang.String> strList59 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList57);
        boolean boolean60 = strList52.containsAll((java.util.Collection<java.lang.String>) strList59);
        int int61 = strList52.size();
        boolean boolean62 = strList40.retainAll((java.util.Collection<java.lang.String>) strList52);
        boolean boolean63 = strList33.addAll((java.util.Collection<java.lang.String>) strList52);
        java.util.Spliterator<java.lang.String> strSpliterator64 = strList52.spliterator();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test510");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        boolean boolean22 = strList19.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean30 = strList19.addAll((java.util.Collection<java.lang.String>) strList28);
        strList19.clear();
        boolean boolean32 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList33.containsAll((java.util.Collection<java.lang.String>) strList36);
        strList33.clear();
        boolean boolean40 = strList5.contains((java.lang.Object) strList33);
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream42 = strList33.stream();
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        DataStructures.AvlTreeList<java.lang.String> strList48 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList46);
        java.util.stream.Stream<java.lang.String> strStream49 = strList48.parallelStream();
        boolean boolean51 = strList48.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        DataStructures.AvlTreeList<java.lang.String> strList57 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList55);
        java.util.stream.Stream<java.lang.String> strStream58 = strList57.parallelStream();
        boolean boolean59 = strList48.addAll((java.util.Collection<java.lang.String>) strList57);
        strList48.clear();
        boolean boolean61 = strList33.removeAll((java.util.Collection<java.lang.String>) strList48);
        java.lang.Object[] objArray62 = strList33.toArray();
        int int63 = strList33.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = strList33.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test511");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        strList0.clear();
        java.lang.Object[] objArray7 = strList0.toArray();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        DataStructures.AvlTreeList<java.lang.String> strList13 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList11);
        java.util.stream.Stream<java.lang.String> strStream14 = strList13.parallelStream();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = strList13.addAll((java.util.Collection<java.lang.String>) strList17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor21 = strList20.iterator();
        boolean boolean23 = strList20.add("");
        java.util.stream.Stream<java.lang.String> strStream24 = strList20.parallelStream();
        boolean boolean25 = strList13.addAll((java.util.Collection<java.lang.String>) strList20);
        boolean boolean26 = strList0.removeAll((java.util.Collection<java.lang.String>) strList13);
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList13.replaceAll(strUnaryOperator27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test512");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        strList12.clear();
        java.util.stream.Stream<java.lang.String> strStream15 = strList12.stream();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        DataStructures.AvlTreeList<java.lang.String> strList22 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList20);
        java.util.stream.Stream<java.lang.String> strStream23 = strList22.parallelStream();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        DataStructures.AvlTreeList<java.lang.String> strList29 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList27);
        boolean boolean30 = strList22.containsAll((java.util.Collection<java.lang.String>) strList29);
        java.util.stream.Stream<java.lang.String> strStream31 = strList29.stream();
        DataStructures.AvlTreeList<java.lang.String> strList32 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor33 = strList32.iterator();
        boolean boolean35 = strList32.add("");
        boolean boolean37 = strList32.add("");
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        boolean boolean43 = strList38.containsAll((java.util.Collection<java.lang.String>) strList41);
        boolean boolean44 = strList32.removeAll((java.util.Collection<java.lang.String>) strList38);
        boolean boolean45 = strList29.addAll((java.util.Collection<java.lang.String>) strList32);
        java.lang.Object obj46 = null;
        int int47 = strList32.indexOf(obj46);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        DataStructures.AvlTreeList<java.lang.String> strList53 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList51);
        java.util.stream.Stream<java.lang.String> strStream54 = strList53.parallelStream();
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        DataStructures.AvlTreeList<java.lang.String> strList60 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList58);
        boolean boolean61 = strList53.containsAll((java.util.Collection<java.lang.String>) strList60);
        strList60.clear();
        int int63 = strList32.indexOf((java.lang.Object) strList60);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        DataStructures.AvlTreeList<java.lang.String> strList69 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList67);
        java.util.stream.Stream<java.lang.String> strStream70 = strList69.parallelStream();
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        DataStructures.AvlTreeList<java.lang.String> strList76 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList74);
        boolean boolean77 = strList69.containsAll((java.util.Collection<java.lang.String>) strList76);
        boolean boolean78 = strList60.contains((java.lang.Object) boolean77);
        java.lang.Object[] objArray79 = strList60.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = strList12.addAll((int) (short) -1, (java.util.Collection<java.lang.String>) strList60);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test513");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        strList0.clear();
        java.lang.Object[] objArray7 = strList0.toArray();
        java.util.Iterator<java.lang.String> strItor8 = strList0.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList9 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean10 = strList0.remove((java.lang.Object) strList9);
        DataStructures.AvlTreeList<java.lang.String> strList11 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList17.parallelStream();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = strList17.addAll((java.util.Collection<java.lang.String>) strList21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        DataStructures.AvlTreeList<java.lang.String> strList29 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList27);
        java.util.stream.Stream<java.lang.String> strStream30 = strList29.parallelStream();
        boolean boolean32 = strList29.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList36);
        java.util.stream.Stream<java.lang.String> strStream39 = strList38.parallelStream();
        boolean boolean40 = strList29.addAll((java.util.Collection<java.lang.String>) strList38);
        strList29.clear();
        int int42 = strList29.size();
        boolean boolean43 = strList21.contains((java.lang.Object) strList29);
        java.util.stream.Stream<java.lang.String> strStream44 = strList29.stream();
        boolean boolean45 = strList11.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean46 = strList0.addAll((java.util.Collection<java.lang.String>) strList29);
        java.lang.Object[] objArray47 = strList29.toArray();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        DataStructures.AvlTreeList<java.lang.String> strList53 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        DataStructures.AvlTreeList<java.lang.String> strList59 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList57);
        java.util.stream.Stream<java.lang.String> strStream60 = strList59.parallelStream();
        boolean boolean62 = strList59.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        DataStructures.AvlTreeList<java.lang.String> strList68 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList66);
        java.util.stream.Stream<java.lang.String> strStream69 = strList68.parallelStream();
        boolean boolean70 = strList59.addAll((java.util.Collection<java.lang.String>) strList68);
        strList59.clear();
        boolean boolean72 = strList53.removeAll((java.util.Collection<java.lang.String>) strList59);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        DataStructures.AvlTreeList<java.lang.String> strList78 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList76);
        java.util.stream.Stream<java.lang.String> strStream79 = strList78.parallelStream();
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        boolean boolean84 = strList78.addAll((java.util.Collection<java.lang.String>) strList82);
        int int85 = strList53.lastIndexOf((java.lang.Object) strList78);
        java.util.Iterator<java.lang.String> strItor86 = strList78.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList87 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList78);
        java.lang.Object[] objArray88 = strList78.toArray();
        boolean boolean89 = strList29.retainAll((java.util.Collection<java.lang.String>) strList78);
        java.util.stream.Stream<java.lang.String> strStream90 = strList29.parallelStream();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test514");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList17.parallelStream();
        boolean boolean20 = strList17.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        DataStructures.AvlTreeList<java.lang.String> strList26 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList24);
        java.util.stream.Stream<java.lang.String> strStream27 = strList26.parallelStream();
        boolean boolean28 = strList17.addAll((java.util.Collection<java.lang.String>) strList26);
        strList17.clear();
        int int30 = strList17.size();
        boolean boolean31 = strList9.contains((java.lang.Object) strList17);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList33.containsAll((java.util.Collection<java.lang.String>) strList36);
        strList33.clear();
        java.lang.Object[] objArray40 = strList33.toArray();
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor42 = strList41.iterator();
        boolean boolean44 = strList41.add("");
        boolean boolean46 = strList41.add("");
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = strList47.containsAll((java.util.Collection<java.lang.String>) strList50);
        boolean boolean53 = strList41.removeAll((java.util.Collection<java.lang.String>) strList47);
        boolean boolean54 = strList33.removeAll((java.util.Collection<java.lang.String>) strList41);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        DataStructures.AvlTreeList<java.lang.String> strList60 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList58);
        java.util.stream.Stream<java.lang.String> strStream61 = strList60.parallelStream();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = strList60.addAll((java.util.Collection<java.lang.String>) strList64);
        int int67 = strList60.size();
        boolean boolean68 = strList60.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList69 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean70 = strList60.removeAll((java.util.Collection<java.lang.String>) strList69);
        DataStructures.AvlTreeList<java.lang.String> strList71 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList69);
        java.util.Iterator<java.lang.String> strItor72 = strList71.iterator();
        java.lang.Object[] objArray73 = strList71.toArray();
        java.util.stream.Stream<java.lang.String> strStream74 = strList71.stream();
        boolean boolean75 = strList33.addAll((java.util.Collection<java.lang.String>) strList71);
        java.util.stream.Stream<java.lang.String> strStream76 = strList33.parallelStream();
        java.lang.String[] strArray79 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        DataStructures.AvlTreeList<java.lang.String> strList82 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList80);
        java.util.stream.Stream<java.lang.String> strStream83 = strList82.parallelStream();
        java.lang.String[] strArray86 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        DataStructures.AvlTreeList<java.lang.String> strList89 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList87);
        boolean boolean90 = strList82.containsAll((java.util.Collection<java.lang.String>) strList89);
        int int91 = strList82.size();
        java.util.ListIterator<java.lang.String> strItor92 = strList82.listIterator();
        java.util.stream.Stream<java.lang.String> strStream93 = strList82.parallelStream();
        int int94 = strList33.indexOf((java.lang.Object) strList82);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = strList17.addAll(3, (java.util.Collection<java.lang.String>) strList33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test515");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        boolean boolean6 = strList5.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        boolean boolean20 = strList12.containsAll((java.util.Collection<java.lang.String>) strList19);
        strList19.clear();
        boolean boolean22 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        java.util.Spliterator<java.lang.String> strSpliterator23 = strList5.spliterator();
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList5.replaceAll(strUnaryOperator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test516");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        // The following exception was thrown during execution in test generation
        try {
            strList12.add(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test517");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        boolean boolean22 = strList19.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean30 = strList19.addAll((java.util.Collection<java.lang.String>) strList28);
        strList19.clear();
        boolean boolean32 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList33.containsAll((java.util.Collection<java.lang.String>) strList36);
        strList33.clear();
        boolean boolean40 = strList5.contains((java.lang.Object) strList33);
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream42 = strList33.stream();
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        DataStructures.AvlTreeList<java.lang.String> strList48 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList46);
        java.util.stream.Stream<java.lang.String> strStream49 = strList48.parallelStream();
        boolean boolean51 = strList48.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        DataStructures.AvlTreeList<java.lang.String> strList57 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList55);
        java.util.stream.Stream<java.lang.String> strStream58 = strList57.parallelStream();
        boolean boolean59 = strList48.addAll((java.util.Collection<java.lang.String>) strList57);
        strList48.clear();
        boolean boolean61 = strList33.removeAll((java.util.Collection<java.lang.String>) strList48);
        java.util.stream.Stream<java.lang.String> strStream62 = strList48.stream();
        // The following exception was thrown during execution in test generation
        try {
            strList48.add(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test518");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.util.stream.Stream<java.lang.String> strStream15 = strList14.parallelStream();
        boolean boolean16 = strList5.addAll((java.util.Collection<java.lang.String>) strList14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        boolean boolean22 = strList17.containsAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        boolean boolean29 = strList28.isEmpty();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        DataStructures.AvlTreeList<java.lang.String> strList35 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream36 = strList35.parallelStream();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        DataStructures.AvlTreeList<java.lang.String> strList42 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList40);
        boolean boolean43 = strList35.containsAll((java.util.Collection<java.lang.String>) strList42);
        strList42.clear();
        boolean boolean45 = strList28.containsAll((java.util.Collection<java.lang.String>) strList42);
        int int46 = strList20.indexOf((java.lang.Object) strList28);
        java.util.Spliterator<java.lang.String> strSpliterator47 = strList20.spliterator();
        boolean boolean48 = strList5.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        DataStructures.AvlTreeList<java.lang.String> strList54 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList52);
        java.util.stream.Stream<java.lang.String> strStream55 = strList54.parallelStream();
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        DataStructures.AvlTreeList<java.lang.String> strList61 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList59);
        boolean boolean62 = strList54.containsAll((java.util.Collection<java.lang.String>) strList61);
        strList61.clear();
        boolean boolean64 = strList5.remove((java.lang.Object) strList61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = strList61.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test519");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        strList0.clear();
        java.lang.Object[] objArray7 = strList0.toArray();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        DataStructures.AvlTreeList<java.lang.String> strList13 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList11);
        java.util.stream.Stream<java.lang.String> strStream14 = strList13.parallelStream();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = strList13.addAll((java.util.Collection<java.lang.String>) strList17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor21 = strList20.iterator();
        boolean boolean23 = strList20.add("");
        java.util.stream.Stream<java.lang.String> strStream24 = strList20.parallelStream();
        boolean boolean25 = strList13.addAll((java.util.Collection<java.lang.String>) strList20);
        boolean boolean26 = strList0.removeAll((java.util.Collection<java.lang.String>) strList13);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        DataStructures.AvlTreeList<java.lang.String> strList32 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList32.parallelStream();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList32.addAll((java.util.Collection<java.lang.String>) strList36);
        int int39 = strList32.size();
        boolean boolean40 = strList32.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor42 = strList41.iterator();
        boolean boolean44 = strList41.add("");
        boolean boolean46 = strList41.add("");
        boolean boolean47 = strList32.containsAll((java.util.Collection<java.lang.String>) strList41);
        boolean boolean48 = strList13.addAll((java.util.Collection<java.lang.String>) strList41);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test520");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        java.util.stream.Stream<java.lang.String> strStream21 = strList20.parallelStream();
        boolean boolean23 = strList20.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        DataStructures.AvlTreeList<java.lang.String> strList29 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList27);
        java.util.stream.Stream<java.lang.String> strStream30 = strList29.parallelStream();
        boolean boolean31 = strList20.addAll((java.util.Collection<java.lang.String>) strList29);
        strList20.clear();
        boolean boolean33 = strList14.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        DataStructures.AvlTreeList<java.lang.String> strList39 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList37);
        java.util.stream.Stream<java.lang.String> strStream40 = strList39.parallelStream();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList39.addAll((java.util.Collection<java.lang.String>) strList43);
        int int46 = strList14.lastIndexOf((java.lang.Object) strList39);
        boolean boolean47 = strList5.equals((java.lang.Object) int46);
        java.util.ListIterator<java.lang.String> strItor48 = strList5.listIterator();
        java.util.stream.Stream<java.lang.String> strStream49 = strList5.stream();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        DataStructures.AvlTreeList<java.lang.String> strList55 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList53);
        java.util.stream.Stream<java.lang.String> strStream56 = strList55.parallelStream();
        boolean boolean57 = strList5.remove((java.lang.Object) strStream56);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test521");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        boolean boolean22 = strList19.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean30 = strList19.addAll((java.util.Collection<java.lang.String>) strList28);
        strList19.clear();
        boolean boolean32 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        java.util.stream.Stream<java.lang.String> strStream33 = strList19.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream34 = strList19.parallelStream();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test522");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean1 = strList0.isEmpty();
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList2 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.String>) strList0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        DataStructures.AvlTreeList<java.lang.String> strList8 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList6);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.util.stream.Stream<java.lang.String> strStream15 = strList14.parallelStream();
        boolean boolean17 = strList14.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        DataStructures.AvlTreeList<java.lang.String> strList23 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList21);
        java.util.stream.Stream<java.lang.String> strStream24 = strList23.parallelStream();
        boolean boolean25 = strList14.addAll((java.util.Collection<java.lang.String>) strList23);
        strList14.clear();
        boolean boolean27 = strList8.removeAll((java.util.Collection<java.lang.String>) strList14);
        java.util.stream.Stream<java.lang.String> strStream28 = strList8.stream();
        boolean boolean29 = strList0.remove((java.lang.Object) strStream28);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        DataStructures.AvlTreeList<java.lang.String> strList35 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream36 = strList35.parallelStream();
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        DataStructures.AvlTreeList<java.lang.String> strList42 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList40);
        boolean boolean43 = strList35.containsAll((java.util.Collection<java.lang.String>) strList42);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        DataStructures.AvlTreeList<java.lang.String> strList49 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList47);
        java.util.stream.Stream<java.lang.String> strStream50 = strList49.parallelStream();
        boolean boolean52 = strList49.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        DataStructures.AvlTreeList<java.lang.String> strList58 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        java.util.stream.Stream<java.lang.String> strStream59 = strList58.parallelStream();
        boolean boolean60 = strList49.addAll((java.util.Collection<java.lang.String>) strList58);
        strList49.clear();
        boolean boolean62 = strList35.containsAll((java.util.Collection<java.lang.String>) strList49);
        java.util.stream.Stream<java.lang.String> strStream63 = strList49.parallelStream();
        boolean boolean64 = strList0.contains((java.lang.Object) strList49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = strList49.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test523");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        int int12 = strList5.size();
        boolean boolean13 = strList5.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean15 = strList5.removeAll((java.util.Collection<java.lang.String>) strList14);
        java.lang.Object obj16 = null;
        int int17 = strList5.indexOf(obj16);
        DataStructures.AvlTreeList<java.lang.String> strList18 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        DataStructures.AvlTreeList<java.lang.String> strList24 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList22);
        java.util.stream.Stream<java.lang.String> strStream25 = strList24.parallelStream();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strList24.addAll((java.util.Collection<java.lang.String>) strList28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        DataStructures.AvlTreeList<java.lang.String> strList36 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList34);
        java.util.stream.Stream<java.lang.String> strStream37 = strList36.parallelStream();
        boolean boolean39 = strList36.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        DataStructures.AvlTreeList<java.lang.String> strList45 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList43);
        java.util.stream.Stream<java.lang.String> strStream46 = strList45.parallelStream();
        boolean boolean47 = strList36.addAll((java.util.Collection<java.lang.String>) strList45);
        strList36.clear();
        int int49 = strList36.size();
        boolean boolean50 = strList28.contains((java.lang.Object) strList36);
        java.util.stream.Stream<java.lang.String> strStream51 = strList36.stream();
        boolean boolean52 = strList18.addAll((java.util.Collection<java.lang.String>) strList36);
        boolean boolean53 = strList5.retainAll((java.util.Collection<java.lang.String>) strList18);
        java.util.Iterator<java.lang.String> strItor54 = strList18.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList55 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = strList55.containsAll((java.util.Collection<java.lang.String>) strList58);
        strList55.clear();
        java.lang.Object[] objArray62 = strList55.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator63 = strList55.spliterator();
        boolean boolean64 = strList18.addAll((java.util.Collection<java.lang.String>) strList55);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        DataStructures.AvlTreeList<java.lang.String> strList70 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList68);
        java.util.stream.Stream<java.lang.String> strStream71 = strList70.parallelStream();
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        DataStructures.AvlTreeList<java.lang.String> strList77 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList75);
        boolean boolean78 = strList70.containsAll((java.util.Collection<java.lang.String>) strList77);
        java.util.stream.Stream<java.lang.String> strStream79 = strList77.stream();
        boolean boolean80 = strList18.retainAll((java.util.Collection<java.lang.String>) strList77);
        strList77.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.String> strItor83 = strList77.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test524");
        DataStructures.AvlTreeList<java.util.AbstractCollection<java.lang.String>> strCollectionList0 = new DataStructures.AvlTreeList<java.util.AbstractCollection<java.lang.String>>();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test525");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean13 = strList9.add("hi!");
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList9.replaceAll(strUnaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test526");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.util.stream.Stream<java.lang.String> strStream15 = strList14.parallelStream();
        boolean boolean16 = strList5.addAll((java.util.Collection<java.lang.String>) strList14);
        boolean boolean18 = strList5.equals((java.lang.Object) 100);
        java.util.stream.Stream<java.lang.String> strStream19 = strList5.stream();
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList5);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        DataStructures.AvlTreeList<java.lang.String> strList26 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        DataStructures.AvlTreeList<java.lang.String> strList31 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor32 = strList31.iterator();
        boolean boolean34 = strList31.add("");
        boolean boolean36 = strList31.add("");
        boolean boolean37 = strList29.addAll((java.util.Collection<java.lang.String>) strList31);
        int int38 = strList26.indexOf((java.lang.Object) boolean37);
        java.util.Spliterator<java.lang.String> strSpliterator39 = strList26.spliterator();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        DataStructures.AvlTreeList<java.lang.String> strList45 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList43);
        java.util.stream.Stream<java.lang.String> strStream46 = strList45.parallelStream();
        int int47 = strList26.lastIndexOf((java.lang.Object) strStream46);
        int int48 = strList20.lastIndexOf((java.lang.Object) int47);
        DataStructures.AvlTreeList<java.lang.String> strList49 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList20);
        java.lang.String str51 = strList49.remove(0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test527");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        boolean boolean22 = strList19.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean30 = strList19.addAll((java.util.Collection<java.lang.String>) strList28);
        strList19.clear();
        boolean boolean32 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList33.containsAll((java.util.Collection<java.lang.String>) strList36);
        strList33.clear();
        boolean boolean40 = strList5.contains((java.lang.Object) strList33);
        boolean boolean42 = strList5.add("");
        java.lang.Object[] objArray43 = strList5.toArray();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        DataStructures.AvlTreeList<java.lang.String> strList49 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList47);
        java.util.stream.Stream<java.lang.String> strStream50 = strList49.parallelStream();
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        DataStructures.AvlTreeList<java.lang.String> strList56 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList54);
        java.util.stream.Stream<java.lang.String> strStream57 = strList56.parallelStream();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        boolean boolean62 = strList56.addAll((java.util.Collection<java.lang.String>) strList60);
        boolean boolean63 = strList49.addAll((java.util.Collection<java.lang.String>) strList56);
        java.util.Iterator<java.lang.String> strItor64 = strList49.iterator();
        boolean boolean65 = strList5.contains((java.lang.Object) strList49);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        DataStructures.AvlTreeList<java.lang.String> strList71 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList69);
        java.util.stream.Stream<java.lang.String> strStream72 = strList69.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream73 = strList69.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream74 = strList69.stream();
        boolean boolean75 = strList49.retainAll((java.util.Collection<java.lang.String>) strList69);
        java.util.stream.Stream<java.lang.String> strStream76 = strList69.parallelStream();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test528");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.util.stream.Stream<java.lang.String> strStream15 = strList14.parallelStream();
        boolean boolean16 = strList5.addAll((java.util.Collection<java.lang.String>) strList14);
        java.lang.String str19 = strList14.set((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = strList14.set((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test529");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        DataStructures.AvlTreeList<java.lang.String> strList6 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList4);
        java.util.stream.Stream<java.lang.String> strStream7 = strList6.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList6.addAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        DataStructures.AvlTreeList<java.lang.String> strList18 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList16);
        java.util.stream.Stream<java.lang.String> strStream19 = strList18.parallelStream();
        boolean boolean21 = strList18.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        DataStructures.AvlTreeList<java.lang.String> strList27 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList25);
        java.util.stream.Stream<java.lang.String> strStream28 = strList27.parallelStream();
        boolean boolean29 = strList18.addAll((java.util.Collection<java.lang.String>) strList27);
        strList18.clear();
        int int31 = strList18.size();
        boolean boolean32 = strList10.contains((java.lang.Object) strList18);
        java.util.stream.Stream<java.lang.String> strStream33 = strList18.stream();
        boolean boolean34 = strList0.addAll((java.util.Collection<java.lang.String>) strList18);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        DataStructures.AvlTreeList<java.lang.String> strList40 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.lang.String> strStream41 = strList40.parallelStream();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        boolean boolean48 = strList40.containsAll((java.util.Collection<java.lang.String>) strList47);
        strList47.clear();
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        DataStructures.AvlTreeList<java.lang.String> strList55 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList53);
        java.util.stream.Stream<java.lang.String> strStream56 = strList53.parallelStream();
        boolean boolean57 = strList47.addAll((java.util.Collection<java.lang.String>) strList53);
        boolean boolean58 = strList0.containsAll((java.util.Collection<java.lang.String>) strList53);
        boolean boolean59 = strList0.isEmpty();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test530");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        int int12 = strList5.size();
        boolean boolean13 = strList5.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean15 = strList5.removeAll((java.util.Collection<java.lang.String>) strList14);
        DataStructures.AvlTreeList<java.lang.String> strList16 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        boolean boolean22 = strList17.containsAll((java.util.Collection<java.lang.String>) strList20);
        strList17.clear();
        java.lang.Object[] objArray24 = strList17.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator25 = strList17.spliterator();
        boolean boolean26 = strList16.containsAll((java.util.Collection<java.lang.String>) strList17);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        DataStructures.AvlTreeList<java.lang.String> strList32 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList32.parallelStream();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        DataStructures.AvlTreeList<java.lang.String> strList39 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList37);
        java.util.stream.Stream<java.lang.String> strStream40 = strList39.parallelStream();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = strList39.addAll((java.util.Collection<java.lang.String>) strList43);
        boolean boolean46 = strList32.addAll((java.util.Collection<java.lang.String>) strList39);
        java.util.Iterator<java.lang.String> strItor47 = strList32.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList48 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor49 = strList48.iterator();
        java.util.ListIterator<java.lang.String> strItor50 = strList48.listIterator();
        java.util.stream.Stream<java.lang.String> strStream51 = strList48.stream();
        boolean boolean52 = strList32.remove((java.lang.Object) strStream51);
        boolean boolean53 = strList16.retainAll((java.util.Collection<java.lang.String>) strList32);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        DataStructures.AvlTreeList<java.lang.String> strList59 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList57);
        java.util.stream.Stream<java.lang.String> strStream60 = strList59.parallelStream();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = strList59.addAll((java.util.Collection<java.lang.String>) strList63);
        int int66 = strList59.size();
        boolean boolean67 = strList59.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList68 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean69 = strList59.removeAll((java.util.Collection<java.lang.String>) strList68);
        java.lang.Object obj70 = null;
        int int71 = strList59.indexOf(obj70);
        boolean boolean72 = strList32.equals((java.lang.Object) int71);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test531");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        boolean boolean6 = strList5.isEmpty();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        boolean boolean20 = strList12.containsAll((java.util.Collection<java.lang.String>) strList19);
        strList19.clear();
        boolean boolean22 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean31 = strList28.remove((java.lang.Object) (byte) 10);
        boolean boolean32 = strList19.retainAll((java.util.Collection<java.lang.String>) strList28);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList19);
        java.util.stream.Stream<java.lang.String> strStream34 = strList19.stream();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        DataStructures.AvlTreeList<java.lang.String> strList40 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.lang.String> strStream41 = strList40.parallelStream();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        boolean boolean48 = strList40.containsAll((java.util.Collection<java.lang.String>) strList47);
        DataStructures.AvlTreeList<java.lang.String> strList49 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList47);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        DataStructures.AvlTreeList<java.lang.String> strList55 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList53);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        DataStructures.AvlTreeList<java.lang.String> strList61 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList59);
        boolean boolean62 = strList53.equals((java.lang.Object) strList59);
        java.lang.Object[] objArray63 = strList59.toArray();
        boolean boolean64 = strList49.removeAll((java.util.Collection<java.lang.String>) strList59);
        int int65 = strList19.indexOf((java.lang.Object) boolean64);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test532");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.util.stream.Stream<java.lang.String> strStream15 = strList14.parallelStream();
        boolean boolean16 = strList5.addAll((java.util.Collection<java.lang.String>) strList14);
        boolean boolean18 = strList5.equals((java.lang.Object) 100);
        java.util.ListIterator<java.lang.String> strItor19 = strList5.listIterator();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        DataStructures.AvlTreeList<java.lang.String> strList25 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList23);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        DataStructures.AvlTreeList<java.lang.String> strList31 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList29);
        java.util.stream.Stream<java.lang.String> strStream32 = strList31.parallelStream();
        boolean boolean34 = strList31.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        DataStructures.AvlTreeList<java.lang.String> strList40 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.lang.String> strStream41 = strList40.parallelStream();
        boolean boolean42 = strList31.addAll((java.util.Collection<java.lang.String>) strList40);
        strList31.clear();
        boolean boolean44 = strList25.removeAll((java.util.Collection<java.lang.String>) strList31);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        DataStructures.AvlTreeList<java.lang.String> strList50 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList48);
        java.util.stream.Stream<java.lang.String> strStream51 = strList50.parallelStream();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        boolean boolean56 = strList50.addAll((java.util.Collection<java.lang.String>) strList54);
        int int57 = strList25.lastIndexOf((java.lang.Object) strList50);
        java.util.Spliterator<java.lang.String> strSpliterator58 = strList25.spliterator();
        java.util.List<java.lang.String> strList61 = strList25.subList(1, 2);
        boolean boolean62 = strList5.equals((java.lang.Object) strList61);
        DataStructures.AvlTreeList<java.lang.String> strList63 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = strList63.containsAll((java.util.Collection<java.lang.String>) strList66);
        java.util.ListIterator<java.lang.String> strItor69 = strList66.listIterator();
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        DataStructures.AvlTreeList<java.lang.String> strList75 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList73);
        java.util.stream.Stream<java.lang.String> strStream76 = strList75.parallelStream();
        boolean boolean78 = strList75.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        DataStructures.AvlTreeList<java.lang.String> strList84 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList82);
        java.util.stream.Stream<java.lang.String> strStream85 = strList84.parallelStream();
        boolean boolean86 = strList75.addAll((java.util.Collection<java.lang.String>) strList84);
        strList75.clear();
        boolean boolean88 = strList66.addAll((java.util.Collection<java.lang.String>) strList75);
        boolean boolean89 = strList75.isEmpty();
        boolean boolean90 = strList5.containsAll((java.util.Collection<java.lang.String>) strList75);
        java.util.stream.Stream<java.lang.String> strStream91 = strList75.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = strList75.set(6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test533");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        java.util.ListIterator<java.lang.String> strItor6 = strList3.listIterator();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        boolean boolean15 = strList12.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        DataStructures.AvlTreeList<java.lang.String> strList21 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList19);
        java.util.stream.Stream<java.lang.String> strStream22 = strList21.parallelStream();
        boolean boolean23 = strList12.addAll((java.util.Collection<java.lang.String>) strList21);
        strList12.clear();
        boolean boolean25 = strList3.addAll((java.util.Collection<java.lang.String>) strList12);
        boolean boolean26 = strList12.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = strList28.containsAll((java.util.Collection<java.lang.String>) strList31);
        strList28.clear();
        java.lang.Object[] objArray35 = strList28.toArray();
        java.util.ListIterator<java.lang.String> strItor36 = strList28.listIterator();
        boolean boolean37 = strList12.addAll(0, (java.util.Collection<java.lang.String>) strList28);
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor39 = strList38.iterator();
        java.util.ListIterator<java.lang.String> strItor40 = strList38.listIterator();
        int int42 = strList38.indexOf((java.lang.Object) (-1.0f));
        boolean boolean43 = strList28.addAll((java.util.Collection<java.lang.String>) strList38);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        DataStructures.AvlTreeList<java.lang.String> strList50 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList48);
        java.util.stream.Stream<java.lang.String> strStream51 = strList50.parallelStream();
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        DataStructures.AvlTreeList<java.lang.String> strList57 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList55);
        boolean boolean58 = strList50.containsAll((java.util.Collection<java.lang.String>) strList57);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        DataStructures.AvlTreeList<java.lang.String> strList64 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList62);
        java.util.stream.Stream<java.lang.String> strStream65 = strList64.parallelStream();
        boolean boolean67 = strList64.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        DataStructures.AvlTreeList<java.lang.String> strList73 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList71);
        java.util.stream.Stream<java.lang.String> strStream74 = strList73.parallelStream();
        boolean boolean75 = strList64.addAll((java.util.Collection<java.lang.String>) strList73);
        strList64.clear();
        boolean boolean77 = strList50.containsAll((java.util.Collection<java.lang.String>) strList64);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = strList28.addAll((-100), (java.util.Collection<java.lang.String>) strList50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test534");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor1 = strList0.iterator();
        java.lang.Object[] objArray2 = strList0.toArray();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test535");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        boolean boolean18 = strList12.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strList5.addAll((java.util.Collection<java.lang.String>) strList12);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        boolean boolean25 = strList20.containsAll((java.util.Collection<java.lang.String>) strList23);
        java.util.ListIterator<java.lang.String> strItor26 = strList23.listIterator();
        boolean boolean27 = strList5.equals((java.lang.Object) strList23);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList31);
        java.util.stream.Stream<java.lang.String> strStream34 = strList33.parallelStream();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        DataStructures.AvlTreeList<java.lang.String> strList40 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        boolean boolean41 = strList33.containsAll((java.util.Collection<java.lang.String>) strList40);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        java.util.stream.Stream<java.lang.String> strStream48 = strList47.parallelStream();
        boolean boolean50 = strList47.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        DataStructures.AvlTreeList<java.lang.String> strList56 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList54);
        java.util.stream.Stream<java.lang.String> strStream57 = strList56.parallelStream();
        boolean boolean58 = strList47.addAll((java.util.Collection<java.lang.String>) strList56);
        strList47.clear();
        boolean boolean60 = strList33.containsAll((java.util.Collection<java.lang.String>) strList47);
        DataStructures.AvlTreeList<java.lang.String> strList61 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = strList61.containsAll((java.util.Collection<java.lang.String>) strList64);
        strList61.clear();
        boolean boolean68 = strList33.contains((java.lang.Object) strList61);
        DataStructures.AvlTreeList<java.lang.String> strList69 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList61);
        java.util.stream.Stream<java.lang.String> strStream70 = strList61.stream();
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        DataStructures.AvlTreeList<java.lang.String> strList76 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList74);
        java.util.stream.Stream<java.lang.String> strStream77 = strList76.parallelStream();
        boolean boolean79 = strList76.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        DataStructures.AvlTreeList<java.lang.String> strList85 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList83);
        java.util.stream.Stream<java.lang.String> strStream86 = strList85.parallelStream();
        boolean boolean87 = strList76.addAll((java.util.Collection<java.lang.String>) strList85);
        strList76.clear();
        boolean boolean89 = strList61.removeAll((java.util.Collection<java.lang.String>) strList76);
        java.util.stream.Stream<java.lang.String> strStream90 = strList76.stream();
        boolean boolean92 = strList76.add("");
        int int93 = strList5.lastIndexOf((java.lang.Object) "");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test536");
        DataStructures.AvlTreeList.Node<?> wildcardNode0 = DataStructures.AvlTreeList.Node.EMPTY_LEAF;
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test537");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        java.util.ListIterator<java.lang.String> strItor6 = strList3.listIterator();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        boolean boolean15 = strList12.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        DataStructures.AvlTreeList<java.lang.String> strList21 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList19);
        java.util.stream.Stream<java.lang.String> strStream22 = strList21.parallelStream();
        boolean boolean23 = strList12.addAll((java.util.Collection<java.lang.String>) strList21);
        strList12.clear();
        boolean boolean25 = strList3.addAll((java.util.Collection<java.lang.String>) strList12);
        boolean boolean26 = strList12.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = strList28.containsAll((java.util.Collection<java.lang.String>) strList31);
        strList28.clear();
        java.lang.Object[] objArray35 = strList28.toArray();
        java.util.ListIterator<java.lang.String> strItor36 = strList28.listIterator();
        boolean boolean37 = strList12.addAll(0, (java.util.Collection<java.lang.String>) strList28);
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor39 = strList38.iterator();
        java.util.ListIterator<java.lang.String> strItor40 = strList38.listIterator();
        int int42 = strList38.indexOf((java.lang.Object) (-1.0f));
        boolean boolean43 = strList28.addAll((java.util.Collection<java.lang.String>) strList38);
        int int44 = strList38.size();
        strList38.clear();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        DataStructures.AvlTreeList<java.lang.String> strList51 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList49);
        java.util.stream.Stream<java.lang.String> strStream52 = strList51.parallelStream();
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        DataStructures.AvlTreeList<java.lang.String> strList58 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        boolean boolean59 = strList51.containsAll((java.util.Collection<java.lang.String>) strList58);
        java.util.stream.Stream<java.lang.String> strStream60 = strList58.stream();
        boolean boolean61 = strList38.retainAll((java.util.Collection<java.lang.String>) strList58);
        java.util.ListIterator<java.lang.String> strItor62 = strList38.listIterator();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test538");
        DataStructures.AvlTreeList<java.util.ListIterator<java.lang.String>[][]> strItorArrayList0 = new DataStructures.AvlTreeList<java.util.ListIterator<java.lang.String>[][]>();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test539");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor13 = strList12.iterator();
        boolean boolean15 = strList12.add("");
        java.util.stream.Stream<java.lang.String> strStream16 = strList12.parallelStream();
        boolean boolean17 = strList5.addAll((java.util.Collection<java.lang.String>) strList12);
        java.util.Iterator<java.lang.String> strItor18 = strList12.iterator();
        int int19 = strList12.size();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test540");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        strList12.clear();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        java.util.stream.Stream<java.lang.String> strStream21 = strList18.parallelStream();
        boolean boolean22 = strList12.addAll((java.util.Collection<java.lang.String>) strList18);
        strList12.clear();
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList12.replaceAll(strUnaryOperator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test541");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.util.stream.Stream<java.lang.String> strStream15 = strList14.parallelStream();
        boolean boolean16 = strList5.addAll((java.util.Collection<java.lang.String>) strList14);
        boolean boolean18 = strList5.equals((java.lang.Object) 100);
        java.util.ListIterator<java.lang.String> strItor19 = strList5.listIterator();
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        boolean boolean25 = strList20.containsAll((java.util.Collection<java.lang.String>) strList23);
        java.util.ListIterator<java.lang.String> strItor26 = strList23.listIterator();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        DataStructures.AvlTreeList<java.lang.String> strList32 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList32.parallelStream();
        boolean boolean35 = strList32.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList39);
        java.util.stream.Stream<java.lang.String> strStream42 = strList41.parallelStream();
        boolean boolean43 = strList32.addAll((java.util.Collection<java.lang.String>) strList41);
        strList32.clear();
        boolean boolean45 = strList23.addAll((java.util.Collection<java.lang.String>) strList32);
        boolean boolean46 = strList32.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList48 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        boolean boolean53 = strList48.containsAll((java.util.Collection<java.lang.String>) strList51);
        strList48.clear();
        java.lang.Object[] objArray55 = strList48.toArray();
        java.util.ListIterator<java.lang.String> strItor56 = strList48.listIterator();
        boolean boolean57 = strList32.addAll(0, (java.util.Collection<java.lang.String>) strList48);
        DataStructures.AvlTreeList<java.lang.String> strList58 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor59 = strList58.iterator();
        java.util.ListIterator<java.lang.String> strItor60 = strList58.listIterator();
        int int62 = strList58.indexOf((java.lang.Object) (-1.0f));
        boolean boolean63 = strList48.addAll((java.util.Collection<java.lang.String>) strList58);
        int int64 = strList58.size();
        boolean boolean65 = strList5.equals((java.lang.Object) strList58);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList68 = strList58.subList(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test542");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList17.parallelStream();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        DataStructures.AvlTreeList<java.lang.String> strList24 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList22);
        boolean boolean25 = strList17.containsAll((java.util.Collection<java.lang.String>) strList24);
        int int26 = strList17.size();
        boolean boolean27 = strList5.retainAll((java.util.Collection<java.lang.String>) strList17);
        java.lang.String str29 = strList17.get(1);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        DataStructures.AvlTreeList<java.lang.String> strList35 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList39);
        java.util.stream.Stream<java.lang.String> strStream42 = strList41.parallelStream();
        boolean boolean44 = strList41.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        DataStructures.AvlTreeList<java.lang.String> strList50 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList48);
        java.util.stream.Stream<java.lang.String> strStream51 = strList50.parallelStream();
        boolean boolean52 = strList41.addAll((java.util.Collection<java.lang.String>) strList50);
        strList41.clear();
        boolean boolean54 = strList35.removeAll((java.util.Collection<java.lang.String>) strList41);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        DataStructures.AvlTreeList<java.lang.String> strList60 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList58);
        java.util.stream.Stream<java.lang.String> strStream61 = strList60.parallelStream();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = strList60.addAll((java.util.Collection<java.lang.String>) strList64);
        int int67 = strList35.lastIndexOf((java.lang.Object) strList60);
        java.util.Iterator<java.lang.String> strItor68 = strList60.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList69 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList60);
        boolean boolean70 = strList17.containsAll((java.util.Collection<java.lang.String>) strList60);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test543");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        boolean boolean22 = strList19.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean30 = strList19.addAll((java.util.Collection<java.lang.String>) strList28);
        strList19.clear();
        boolean boolean32 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList33.containsAll((java.util.Collection<java.lang.String>) strList36);
        strList33.clear();
        boolean boolean40 = strList5.contains((java.lang.Object) strList33);
        strList33.clear();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        java.util.stream.Stream<java.lang.String> strStream48 = strList47.parallelStream();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        boolean boolean53 = strList47.addAll((java.util.Collection<java.lang.String>) strList51);
        int int54 = strList47.size();
        boolean boolean55 = strList47.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList56 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean57 = strList47.removeAll((java.util.Collection<java.lang.String>) strList56);
        DataStructures.AvlTreeList<java.lang.String> strList58 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        DataStructures.AvlTreeList<java.lang.String> strList59 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        boolean boolean64 = strList59.containsAll((java.util.Collection<java.lang.String>) strList62);
        strList59.clear();
        java.lang.Object[] objArray66 = strList59.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator67 = strList59.spliterator();
        boolean boolean68 = strList58.containsAll((java.util.Collection<java.lang.String>) strList59);
        DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>> strComparableList69 = new DataStructures.AvlTreeList<java.lang.Comparable<java.lang.String>>();
        boolean boolean70 = strList59.remove((java.lang.Object) strComparableList69);
        boolean boolean71 = strList33.removeAll((java.util.Collection<java.lang.String>) strList59);
        // The following exception was thrown during execution in test generation
        try {
            strList59.add((-6), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test544");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        strList0.clear();
        java.lang.Object[] objArray7 = strList0.toArray();
        java.util.Iterator<java.lang.String> strItor8 = strList0.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList9 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean10 = strList0.remove((java.lang.Object) strList9);
        DataStructures.AvlTreeList<java.lang.String> strList11 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList17.parallelStream();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = strList17.addAll((java.util.Collection<java.lang.String>) strList21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        DataStructures.AvlTreeList<java.lang.String> strList29 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList27);
        java.util.stream.Stream<java.lang.String> strStream30 = strList29.parallelStream();
        boolean boolean32 = strList29.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList36);
        java.util.stream.Stream<java.lang.String> strStream39 = strList38.parallelStream();
        boolean boolean40 = strList29.addAll((java.util.Collection<java.lang.String>) strList38);
        strList29.clear();
        int int42 = strList29.size();
        boolean boolean43 = strList21.contains((java.lang.Object) strList29);
        java.util.stream.Stream<java.lang.String> strStream44 = strList29.stream();
        boolean boolean45 = strList11.addAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean46 = strList0.addAll((java.util.Collection<java.lang.String>) strList29);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        DataStructures.AvlTreeList<java.lang.String> strList52 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList50);
        java.util.stream.Stream<java.lang.String> strStream53 = strList52.parallelStream();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        boolean boolean58 = strList52.addAll((java.util.Collection<java.lang.String>) strList56);
        int int59 = strList52.size();
        boolean boolean60 = strList52.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList61 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean62 = strList52.removeAll((java.util.Collection<java.lang.String>) strList61);
        DataStructures.AvlTreeList<java.lang.String> strList63 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList61);
        java.util.Iterator<java.lang.String> strItor64 = strList63.iterator();
        java.lang.Object[] objArray65 = strList63.toArray();
        java.util.stream.Stream<java.lang.String> strStream66 = strList63.stream();
        boolean boolean67 = strList29.retainAll((java.util.Collection<java.lang.String>) strList63);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test545");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream1 = strList0.parallelStream();
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        DataStructures.AvlTreeList<java.lang.String> strList7 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList5);
        java.util.stream.Stream<java.lang.String> strStream8 = strList7.parallelStream();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        boolean boolean15 = strList7.containsAll((java.util.Collection<java.lang.String>) strList14);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        DataStructures.AvlTreeList<java.lang.String> strList21 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList19);
        java.util.stream.Stream<java.lang.String> strStream22 = strList21.parallelStream();
        boolean boolean24 = strList21.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        DataStructures.AvlTreeList<java.lang.String> strList30 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList28);
        java.util.stream.Stream<java.lang.String> strStream31 = strList30.parallelStream();
        boolean boolean32 = strList21.addAll((java.util.Collection<java.lang.String>) strList30);
        strList21.clear();
        boolean boolean34 = strList7.containsAll((java.util.Collection<java.lang.String>) strList21);
        DataStructures.AvlTreeList<java.lang.String> strList35 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = strList35.containsAll((java.util.Collection<java.lang.String>) strList38);
        strList35.clear();
        boolean boolean42 = strList7.contains((java.lang.Object) strList35);
        java.util.stream.Stream<java.lang.String> strStream43 = strList7.parallelStream();
        java.lang.Object obj44 = null;
        int int45 = strList7.indexOf(obj44);
        int int46 = strList0.indexOf((java.lang.Object) strList7);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        DataStructures.AvlTreeList<java.lang.String> strList52 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList50);
        java.util.stream.Stream<java.lang.String> strStream53 = strList52.parallelStream();
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        DataStructures.AvlTreeList<java.lang.String> strList59 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList57);
        java.util.stream.Stream<java.lang.String> strStream60 = strList59.parallelStream();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = strList59.addAll((java.util.Collection<java.lang.String>) strList63);
        boolean boolean66 = strList52.addAll((java.util.Collection<java.lang.String>) strList59);
        DataStructures.AvlTreeList<java.lang.String> strList67 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        boolean boolean72 = strList67.containsAll((java.util.Collection<java.lang.String>) strList70);
        java.util.ListIterator<java.lang.String> strItor73 = strList70.listIterator();
        boolean boolean74 = strList52.equals((java.lang.Object) strList70);
        boolean boolean75 = strList7.containsAll((java.util.Collection<java.lang.String>) strList52);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList78 = strList7.subList(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test546");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        strList12.clear();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        java.util.stream.Stream<java.lang.String> strStream21 = strList18.parallelStream();
        boolean boolean22 = strList12.addAll((java.util.Collection<java.lang.String>) strList18);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean31 = strList28.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        DataStructures.AvlTreeList<java.lang.String> strList37 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        java.util.stream.Stream<java.lang.String> strStream38 = strList37.parallelStream();
        boolean boolean39 = strList28.addAll((java.util.Collection<java.lang.String>) strList37);
        boolean boolean41 = strList28.equals((java.lang.Object) 100);
        java.util.stream.Stream<java.lang.String> strStream42 = strList28.stream();
        DataStructures.AvlTreeList<java.lang.String> strList43 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList28);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        DataStructures.AvlTreeList<java.lang.String> strList49 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        DataStructures.AvlTreeList<java.lang.String> strList54 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor55 = strList54.iterator();
        boolean boolean57 = strList54.add("");
        boolean boolean59 = strList54.add("");
        boolean boolean60 = strList52.addAll((java.util.Collection<java.lang.String>) strList54);
        int int61 = strList49.indexOf((java.lang.Object) boolean60);
        java.util.Spliterator<java.lang.String> strSpliterator62 = strList49.spliterator();
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        DataStructures.AvlTreeList<java.lang.String> strList68 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList66);
        java.util.stream.Stream<java.lang.String> strStream69 = strList68.parallelStream();
        int int70 = strList49.lastIndexOf((java.lang.Object) strStream69);
        int int71 = strList43.lastIndexOf((java.lang.Object) int70);
        boolean boolean73 = strList43.contains((java.lang.Object) 0L);
        strList43.clear();
        boolean boolean75 = strList18.equals((java.lang.Object) strList43);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test547");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        boolean boolean8 = strList5.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.util.stream.Stream<java.lang.String> strStream15 = strList14.parallelStream();
        boolean boolean16 = strList5.addAll((java.util.Collection<java.lang.String>) strList14);
        strList5.clear();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        DataStructures.AvlTreeList<java.lang.String> strList23 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList21);
        java.util.stream.Stream<java.lang.String> strStream24 = strList23.parallelStream();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        DataStructures.AvlTreeList<java.lang.String> strList30 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList28);
        boolean boolean31 = strList23.containsAll((java.util.Collection<java.lang.String>) strList30);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        DataStructures.AvlTreeList<java.lang.String> strList37 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        java.util.stream.Stream<java.lang.String> strStream38 = strList37.parallelStream();
        boolean boolean40 = strList37.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        DataStructures.AvlTreeList<java.lang.String> strList46 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList44);
        java.util.stream.Stream<java.lang.String> strStream47 = strList46.parallelStream();
        boolean boolean48 = strList37.addAll((java.util.Collection<java.lang.String>) strList46);
        strList37.clear();
        boolean boolean50 = strList23.containsAll((java.util.Collection<java.lang.String>) strList37);
        DataStructures.AvlTreeList<java.lang.String> strList51 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        boolean boolean56 = strList51.containsAll((java.util.Collection<java.lang.String>) strList54);
        strList51.clear();
        boolean boolean58 = strList23.contains((java.lang.Object) strList51);
        boolean boolean59 = strList5.removeAll((java.util.Collection<java.lang.String>) strList51);
        int int60 = strList5.size();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        DataStructures.AvlTreeList<java.lang.String> strList66 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList64);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        DataStructures.AvlTreeList<java.lang.String> strList72 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList70);
        java.util.stream.Stream<java.lang.String> strStream73 = strList72.parallelStream();
        boolean boolean75 = strList72.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        DataStructures.AvlTreeList<java.lang.String> strList81 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList79);
        java.util.stream.Stream<java.lang.String> strStream82 = strList81.parallelStream();
        boolean boolean83 = strList72.addAll((java.util.Collection<java.lang.String>) strList81);
        strList72.clear();
        boolean boolean85 = strList66.removeAll((java.util.Collection<java.lang.String>) strList72);
        java.util.stream.Stream<java.lang.String> strStream86 = strList66.stream();
        boolean boolean87 = strList5.removeAll((java.util.Collection<java.lang.String>) strList66);
        java.lang.Object obj88 = null;
        boolean boolean89 = strList66.equals(obj88);
        java.lang.String str91 = strList66.remove(0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test548");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        boolean boolean22 = strList19.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean30 = strList19.addAll((java.util.Collection<java.lang.String>) strList28);
        strList19.clear();
        boolean boolean32 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList33.containsAll((java.util.Collection<java.lang.String>) strList36);
        strList33.clear();
        boolean boolean40 = strList5.contains((java.lang.Object) strList33);
        DataStructures.AvlTreeList<java.lang.String> strList41 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList33);
        java.util.stream.Stream<java.lang.String> strStream42 = strList33.stream();
        DataStructures.AvlTreeList<java.lang.Object> objList43 = new DataStructures.AvlTreeList<java.lang.Object>((java.util.Collection<java.lang.String>) strList33);
        int int44 = strList33.size();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        DataStructures.AvlTreeList<java.lang.String> strList50 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList48);
        java.util.stream.Stream<java.lang.String> strStream51 = strList50.parallelStream();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        boolean boolean56 = strList50.addAll((java.util.Collection<java.lang.String>) strList54);
        int int57 = strList50.size();
        boolean boolean58 = strList50.isEmpty();
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        DataStructures.AvlTreeList<java.lang.String> strList64 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList62);
        java.util.stream.Stream<java.lang.String> strStream65 = strList64.parallelStream();
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        DataStructures.AvlTreeList<java.lang.String> strList71 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList69);
        java.util.stream.Stream<java.lang.String> strStream72 = strList71.parallelStream();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = strList71.addAll((java.util.Collection<java.lang.String>) strList75);
        boolean boolean78 = strList64.addAll((java.util.Collection<java.lang.String>) strList71);
        java.util.ListIterator<java.lang.String> strItor80 = strList64.listIterator((int) (byte) 1);
        boolean boolean81 = strList50.removeAll((java.util.Collection<java.lang.String>) strList64);
        boolean boolean82 = strList33.addAll((java.util.Collection<java.lang.String>) strList64);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test549");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        strList0.clear();
        java.lang.Object[] objArray7 = strList0.toArray();
        DataStructures.AvlTreeList<java.lang.String> strList8 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor9 = strList8.iterator();
        boolean boolean11 = strList8.add("");
        boolean boolean13 = strList8.add("");
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = strList14.containsAll((java.util.Collection<java.lang.String>) strList17);
        boolean boolean20 = strList8.removeAll((java.util.Collection<java.lang.String>) strList14);
        boolean boolean21 = strList0.removeAll((java.util.Collection<java.lang.String>) strList8);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        DataStructures.AvlTreeList<java.lang.String> strList27 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList25);
        java.util.stream.Stream<java.lang.String> strStream28 = strList27.parallelStream();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = strList27.addAll((java.util.Collection<java.lang.String>) strList31);
        int int34 = strList27.size();
        boolean boolean35 = strList27.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList36 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean37 = strList27.removeAll((java.util.Collection<java.lang.String>) strList36);
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList36);
        java.util.Iterator<java.lang.String> strItor39 = strList38.iterator();
        java.lang.Object[] objArray40 = strList38.toArray();
        java.util.stream.Stream<java.lang.String> strStream41 = strList38.stream();
        boolean boolean42 = strList0.addAll((java.util.Collection<java.lang.String>) strList38);
        java.util.Iterator<java.lang.String> strItor43 = strList38.iterator();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test550");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        int int12 = strList5.size();
        boolean boolean13 = strList5.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean15 = strList5.removeAll((java.util.Collection<java.lang.String>) strList14);
        DataStructures.AvlTreeList<java.lang.String> strList16 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        boolean boolean22 = strList17.containsAll((java.util.Collection<java.lang.String>) strList20);
        strList17.clear();
        java.lang.Object[] objArray24 = strList17.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator25 = strList17.spliterator();
        boolean boolean26 = strList16.containsAll((java.util.Collection<java.lang.String>) strList17);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        DataStructures.AvlTreeList<java.lang.String> strList32 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList32.parallelStream();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        DataStructures.AvlTreeList<java.lang.String> strList39 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList37);
        boolean boolean40 = strList32.containsAll((java.util.Collection<java.lang.String>) strList39);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        DataStructures.AvlTreeList<java.lang.String> strList46 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList44);
        java.util.stream.Stream<java.lang.String> strStream47 = strList46.parallelStream();
        boolean boolean49 = strList46.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        DataStructures.AvlTreeList<java.lang.String> strList55 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList53);
        java.util.stream.Stream<java.lang.String> strStream56 = strList55.parallelStream();
        boolean boolean57 = strList46.addAll((java.util.Collection<java.lang.String>) strList55);
        strList46.clear();
        boolean boolean59 = strList32.containsAll((java.util.Collection<java.lang.String>) strList46);
        DataStructures.AvlTreeList<java.lang.String> strList60 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = strList60.containsAll((java.util.Collection<java.lang.String>) strList63);
        strList60.clear();
        boolean boolean67 = strList32.contains((java.lang.Object) strList60);
        DataStructures.AvlTreeList<java.lang.String> strList68 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList60);
        java.util.stream.Stream<java.lang.String> strStream69 = strList60.stream();
        DataStructures.AvlTreeList<java.lang.String> strList70 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor71 = strList70.iterator();
        boolean boolean73 = strList70.add("");
        boolean boolean75 = strList70.add("");
        int int76 = strList60.lastIndexOf((java.lang.Object) boolean75);
        strList60.clear();
        boolean boolean78 = strList17.contains((java.lang.Object) strList60);
        java.util.stream.Stream<java.lang.String> strStream79 = strList17.parallelStream();
        java.util.ListIterator<java.lang.String> strItor80 = strList17.listIterator();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test551");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        boolean boolean18 = strList12.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strList5.addAll((java.util.Collection<java.lang.String>) strList12);
        java.util.ListIterator<java.lang.String> strItor21 = strList5.listIterator((int) (byte) 1);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        DataStructures.AvlTreeList<java.lang.String> strList27 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList25);
        java.util.stream.Stream<java.lang.String> strStream28 = strList27.parallelStream();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = strList27.addAll((java.util.Collection<java.lang.String>) strList31);
        DataStructures.AvlTreeList<java.lang.String> strList34 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor35 = strList34.iterator();
        boolean boolean37 = strList34.add("");
        java.util.stream.Stream<java.lang.String> strStream38 = strList34.parallelStream();
        boolean boolean39 = strList27.addAll((java.util.Collection<java.lang.String>) strList34);
        java.util.Spliterator<java.lang.String> strSpliterator40 = strList34.spliterator();
        java.util.ListIterator<java.lang.String> strItor41 = strList34.listIterator();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        java.util.stream.Stream<java.lang.String> strStream48 = strList47.parallelStream();
        boolean boolean50 = strList47.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        DataStructures.AvlTreeList<java.lang.String> strList56 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList54);
        java.util.stream.Stream<java.lang.String> strStream57 = strList56.parallelStream();
        boolean boolean58 = strList47.addAll((java.util.Collection<java.lang.String>) strList56);
        boolean boolean60 = strList47.equals((java.lang.Object) 100);
        java.util.stream.Stream<java.lang.String> strStream61 = strList47.stream();
        DataStructures.AvlTreeList<java.lang.String> strList62 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList47);
        java.lang.Object obj63 = null;
        int int64 = strList47.indexOf(obj63);
        java.util.ListIterator<java.lang.String> strItor66 = strList47.listIterator((int) (byte) 1);
        boolean boolean67 = strList34.equals((java.lang.Object) strList47);
        boolean boolean68 = strList5.containsAll((java.util.Collection<java.lang.String>) strList47);
        java.util.Iterator<java.lang.String> strItor69 = strList5.iterator();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test552");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        int int12 = strList5.size();
        boolean boolean13 = strList5.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor15 = strList14.iterator();
        boolean boolean17 = strList14.add("");
        boolean boolean19 = strList14.add("");
        boolean boolean20 = strList5.containsAll((java.util.Collection<java.lang.String>) strList14);
        java.util.Spliterator<java.lang.String> strSpliterator21 = strList14.spliterator();
        DataStructures.AvlTreeList<java.lang.String> strList22 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        boolean boolean27 = strList22.containsAll((java.util.Collection<java.lang.String>) strList25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList31);
        boolean boolean34 = strList33.isEmpty();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        DataStructures.AvlTreeList<java.lang.String> strList40 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.lang.String> strStream41 = strList40.parallelStream();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        boolean boolean48 = strList40.containsAll((java.util.Collection<java.lang.String>) strList47);
        strList47.clear();
        boolean boolean50 = strList33.containsAll((java.util.Collection<java.lang.String>) strList47);
        boolean boolean51 = strList25.removeAll((java.util.Collection<java.lang.String>) strList47);
        java.lang.Object[] objArray52 = strList25.toArray();
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        DataStructures.AvlTreeList<java.lang.String> strList58 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList56);
        java.util.stream.Stream<java.lang.String> strStream59 = strList58.parallelStream();
        java.lang.String[] strArray62 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        DataStructures.AvlTreeList<java.lang.String> strList65 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList63);
        boolean boolean66 = strList58.containsAll((java.util.Collection<java.lang.String>) strList65);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        DataStructures.AvlTreeList<java.lang.String> strList72 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList70);
        java.util.stream.Stream<java.lang.String> strStream73 = strList72.parallelStream();
        boolean boolean75 = strList72.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray78 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        DataStructures.AvlTreeList<java.lang.String> strList81 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList79);
        java.util.stream.Stream<java.lang.String> strStream82 = strList81.parallelStream();
        boolean boolean83 = strList72.addAll((java.util.Collection<java.lang.String>) strList81);
        strList72.clear();
        boolean boolean85 = strList58.containsAll((java.util.Collection<java.lang.String>) strList72);
        DataStructures.AvlTreeList<java.lang.String> strList86 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        boolean boolean91 = strList86.containsAll((java.util.Collection<java.lang.String>) strList89);
        strList86.clear();
        boolean boolean93 = strList58.contains((java.lang.Object) strList86);
        boolean boolean94 = strList25.containsAll((java.util.Collection<java.lang.String>) strList86);
        boolean boolean95 = strList14.containsAll((java.util.Collection<java.lang.String>) strList25);
        boolean boolean96 = strList25.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator97 = strList25.spliterator();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test553");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        DataStructures.AvlTreeList<java.lang.String> strList23 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList21);
        java.util.stream.Stream<java.lang.String> strStream24 = strList23.parallelStream();
        boolean boolean26 = strList23.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        DataStructures.AvlTreeList<java.lang.String> strList32 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList30);
        java.util.stream.Stream<java.lang.String> strStream33 = strList32.parallelStream();
        boolean boolean34 = strList23.addAll((java.util.Collection<java.lang.String>) strList32);
        strList23.clear();
        boolean boolean36 = strList17.removeAll((java.util.Collection<java.lang.String>) strList23);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        DataStructures.AvlTreeList<java.lang.String> strList42 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList40);
        java.util.stream.Stream<java.lang.String> strStream43 = strList42.parallelStream();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        boolean boolean48 = strList42.addAll((java.util.Collection<java.lang.String>) strList46);
        int int49 = strList17.lastIndexOf((java.lang.Object) strList42);
        java.util.Iterator<java.lang.String> strItor50 = strList42.iterator();
        strList42.add(3, "");
        java.util.stream.Stream<java.lang.String> strStream54 = strList42.parallelStream();
        int int55 = strList42.size();
        boolean boolean56 = strList9.addAll((java.util.Collection<java.lang.String>) strList42);
        java.lang.Object[] objArray57 = strList42.toArray();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test554");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        boolean boolean7 = strList3.contains((java.lang.Object) 0.0d);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        java.util.stream.Stream<java.lang.String> strStream21 = strList20.parallelStream();
        boolean boolean23 = strList20.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        DataStructures.AvlTreeList<java.lang.String> strList29 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList27);
        java.util.stream.Stream<java.lang.String> strStream30 = strList29.parallelStream();
        boolean boolean31 = strList20.addAll((java.util.Collection<java.lang.String>) strList29);
        strList20.clear();
        boolean boolean33 = strList14.removeAll((java.util.Collection<java.lang.String>) strList20);
        java.util.stream.Stream<java.lang.String> strStream34 = strList14.stream();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        DataStructures.AvlTreeList<java.lang.String> strList40 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList38);
        boolean boolean41 = strList40.isEmpty();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        java.util.stream.Stream<java.lang.String> strStream48 = strList47.parallelStream();
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        DataStructures.AvlTreeList<java.lang.String> strList54 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList52);
        boolean boolean55 = strList47.containsAll((java.util.Collection<java.lang.String>) strList54);
        strList54.clear();
        boolean boolean57 = strList40.containsAll((java.util.Collection<java.lang.String>) strList54);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        DataStructures.AvlTreeList<java.lang.String> strList63 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList61);
        java.util.stream.Stream<java.lang.String> strStream64 = strList63.parallelStream();
        boolean boolean66 = strList63.remove((java.lang.Object) (byte) 10);
        boolean boolean67 = strList54.retainAll((java.util.Collection<java.lang.String>) strList63);
        boolean boolean68 = strList14.removeAll((java.util.Collection<java.lang.String>) strList63);
        boolean boolean69 = strList3.addAll(0, (java.util.Collection<java.lang.String>) strList63);
        int int70 = strList63.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = strList63.set(4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test555");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        strList5.clear();
        java.util.Iterator<java.lang.String> strItor15 = strList5.iterator();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        DataStructures.AvlTreeList<java.lang.String> strList21 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList19);
        java.util.stream.Stream<java.lang.String> strStream22 = strList19.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream23 = strList19.parallelStream();
        boolean boolean24 = strList5.equals((java.lang.Object) strList19);
        int int25 = strList5.size();
        java.util.stream.Stream<java.lang.String> strStream26 = strList5.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strList5.get((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test556");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor1 = strList0.iterator();
        java.util.ListIterator<java.lang.String> strItor2 = strList0.listIterator();
        java.util.stream.Stream<java.lang.String> strStream3 = strList0.stream();
        DataStructures.AvlTreeList<java.lang.String> strList4 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor5 = strList4.iterator();
        boolean boolean7 = strList4.add("");
        boolean boolean9 = strList4.add("");
        DataStructures.AvlTreeList<java.lang.String> strList10 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        boolean boolean15 = strList10.containsAll((java.util.Collection<java.lang.String>) strList13);
        boolean boolean16 = strList4.removeAll((java.util.Collection<java.lang.String>) strList10);
        int int17 = strList0.lastIndexOf((java.lang.Object) strList10);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        DataStructures.AvlTreeList<java.lang.String> strList23 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList21);
        boolean boolean24 = strList23.isEmpty();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        DataStructures.AvlTreeList<java.lang.String> strList30 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList28);
        java.util.stream.Stream<java.lang.String> strStream31 = strList30.parallelStream();
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        DataStructures.AvlTreeList<java.lang.String> strList37 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList35);
        boolean boolean38 = strList30.containsAll((java.util.Collection<java.lang.String>) strList37);
        strList37.clear();
        boolean boolean40 = strList23.containsAll((java.util.Collection<java.lang.String>) strList37);
        java.util.Spliterator<java.lang.String> strSpliterator41 = strList23.spliterator();
        int int42 = strList10.indexOf((java.lang.Object) strList23);
        DataStructures.AvlTreeList<java.lang.String> strList43 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        boolean boolean48 = strList43.containsAll((java.util.Collection<java.lang.String>) strList46);
        strList43.clear();
        java.lang.Object[] objArray50 = strList43.toArray();
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        DataStructures.AvlTreeList<java.lang.String> strList56 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList54);
        java.util.stream.Stream<java.lang.String> strStream57 = strList56.parallelStream();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        boolean boolean62 = strList56.addAll((java.util.Collection<java.lang.String>) strList60);
        DataStructures.AvlTreeList<java.lang.String> strList63 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor64 = strList63.iterator();
        boolean boolean66 = strList63.add("");
        java.util.stream.Stream<java.lang.String> strStream67 = strList63.parallelStream();
        boolean boolean68 = strList56.addAll((java.util.Collection<java.lang.String>) strList63);
        boolean boolean69 = strList43.removeAll((java.util.Collection<java.lang.String>) strList56);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        DataStructures.AvlTreeList<java.lang.String> strList75 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList73);
        java.lang.Object[] objArray76 = strList75.toArray();
        boolean boolean77 = strList56.containsAll((java.util.Collection<java.lang.String>) strList75);
        boolean boolean78 = strList23.retainAll((java.util.Collection<java.lang.String>) strList75);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test557");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        boolean boolean13 = strList5.containsAll((java.util.Collection<java.lang.String>) strList12);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        boolean boolean22 = strList19.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList26);
        java.util.stream.Stream<java.lang.String> strStream29 = strList28.parallelStream();
        boolean boolean30 = strList19.addAll((java.util.Collection<java.lang.String>) strList28);
        strList19.clear();
        boolean boolean32 = strList5.containsAll((java.util.Collection<java.lang.String>) strList19);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strList33.containsAll((java.util.Collection<java.lang.String>) strList36);
        strList33.clear();
        boolean boolean40 = strList5.contains((java.lang.Object) strList33);
        boolean boolean42 = strList5.add("");
        java.lang.Object[] objArray43 = strList5.toArray();
        DataStructures.AvlTreeList<java.lang.String> strList44 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = strList44.containsAll((java.util.Collection<java.lang.String>) strList47);
        strList44.clear();
        java.lang.Object[] objArray51 = strList44.toArray();
        java.util.Iterator<java.lang.String> strItor52 = strList44.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList53 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean54 = strList44.remove((java.lang.Object) strList53);
        int int55 = strList5.indexOf((java.lang.Object) strList44);
        java.util.stream.Stream<java.lang.String> strStream56 = strList5.parallelStream();
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        DataStructures.AvlTreeList<java.lang.String> strList62 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList60);
        boolean boolean63 = strList62.isEmpty();
        java.lang.Object[] objArray64 = strList62.toArray();
        boolean boolean65 = strList5.equals((java.lang.Object) strList62);
        java.util.function.UnaryOperator<java.lang.String> strUnaryOperator66 = null;
        // The following exception was thrown during execution in test generation
        try {
            strList5.replaceAll(strUnaryOperator66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test558");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor1 = strList0.iterator();
        boolean boolean3 = strList0.add("");
        boolean boolean5 = strList0.add("");
        DataStructures.AvlTreeList<java.lang.String> strList6 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList6.containsAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean12 = strList0.removeAll((java.util.Collection<java.lang.String>) strList6);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        DataStructures.AvlTreeList<java.lang.String> strList18 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList16);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        DataStructures.AvlTreeList<java.lang.String> strList24 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList22);
        java.util.stream.Stream<java.lang.String> strStream25 = strList24.parallelStream();
        boolean boolean27 = strList24.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList31);
        java.util.stream.Stream<java.lang.String> strStream34 = strList33.parallelStream();
        boolean boolean35 = strList24.addAll((java.util.Collection<java.lang.String>) strList33);
        strList24.clear();
        boolean boolean37 = strList18.removeAll((java.util.Collection<java.lang.String>) strList24);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        DataStructures.AvlTreeList<java.lang.String> strList43 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList41);
        java.util.stream.Stream<java.lang.String> strStream44 = strList43.parallelStream();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = strList43.addAll((java.util.Collection<java.lang.String>) strList47);
        int int50 = strList18.lastIndexOf((java.lang.Object) strList43);
        java.util.Iterator<java.lang.String> strItor51 = strList43.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList52 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList43);
        java.lang.Object[] objArray53 = strList43.toArray();
        java.util.ListIterator<java.lang.String> strItor54 = strList43.listIterator();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        DataStructures.AvlTreeList<java.lang.String> strList60 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList58);
        java.lang.String[] strArray63 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        DataStructures.AvlTreeList<java.lang.String> strList66 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList64);
        java.util.stream.Stream<java.lang.String> strStream67 = strList66.parallelStream();
        boolean boolean69 = strList66.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        DataStructures.AvlTreeList<java.lang.String> strList75 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList73);
        java.util.stream.Stream<java.lang.String> strStream76 = strList75.parallelStream();
        boolean boolean77 = strList66.addAll((java.util.Collection<java.lang.String>) strList75);
        strList66.clear();
        boolean boolean79 = strList60.removeAll((java.util.Collection<java.lang.String>) strList66);
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        DataStructures.AvlTreeList<java.lang.String> strList85 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList83);
        java.util.stream.Stream<java.lang.String> strStream86 = strList85.parallelStream();
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        boolean boolean91 = strList85.addAll((java.util.Collection<java.lang.String>) strList89);
        int int92 = strList60.lastIndexOf((java.lang.Object) strList85);
        java.util.ListIterator<java.lang.String> strItor93 = strList85.listIterator();
        boolean boolean94 = strList43.addAll((java.util.Collection<java.lang.String>) strList85);
        boolean boolean95 = strList0.removeAll((java.util.Collection<java.lang.String>) strList85);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test559");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        java.util.ListIterator<java.lang.String> strItor6 = strList3.listIterator();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        boolean boolean15 = strList12.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        DataStructures.AvlTreeList<java.lang.String> strList21 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList19);
        java.util.stream.Stream<java.lang.String> strStream22 = strList21.parallelStream();
        boolean boolean23 = strList12.addAll((java.util.Collection<java.lang.String>) strList21);
        strList12.clear();
        boolean boolean25 = strList3.addAll((java.util.Collection<java.lang.String>) strList12);
        boolean boolean26 = strList12.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = strList28.containsAll((java.util.Collection<java.lang.String>) strList31);
        strList28.clear();
        java.lang.Object[] objArray35 = strList28.toArray();
        java.util.ListIterator<java.lang.String> strItor36 = strList28.listIterator();
        boolean boolean37 = strList12.addAll(0, (java.util.Collection<java.lang.String>) strList28);
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor39 = strList38.iterator();
        java.util.ListIterator<java.lang.String> strItor40 = strList38.listIterator();
        int int42 = strList38.indexOf((java.lang.Object) (-1.0f));
        boolean boolean43 = strList28.addAll((java.util.Collection<java.lang.String>) strList38);
        int int44 = strList38.size();
        strList38.clear();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        DataStructures.AvlTreeList<java.lang.String> strList51 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList49);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        DataStructures.AvlTreeList<java.lang.String> strList57 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList55);
        boolean boolean58 = strList49.equals((java.lang.Object) strList55);
        boolean boolean60 = strList55.add("hi!");
        boolean boolean61 = strList38.addAll((java.util.Collection<java.lang.String>) strList55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = strList38.remove((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test560");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        int int12 = strList5.size();
        boolean boolean13 = strList5.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList14 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean15 = strList5.removeAll((java.util.Collection<java.lang.String>) strList14);
        java.lang.Object obj16 = null;
        int int17 = strList5.indexOf(obj16);
        DataStructures.AvlTreeList<java.lang.String> strList18 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        DataStructures.AvlTreeList<java.lang.String> strList24 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList22);
        java.util.stream.Stream<java.lang.String> strStream25 = strList24.parallelStream();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strList24.addAll((java.util.Collection<java.lang.String>) strList28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        DataStructures.AvlTreeList<java.lang.String> strList36 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList34);
        java.util.stream.Stream<java.lang.String> strStream37 = strList36.parallelStream();
        boolean boolean39 = strList36.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        DataStructures.AvlTreeList<java.lang.String> strList45 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList43);
        java.util.stream.Stream<java.lang.String> strStream46 = strList45.parallelStream();
        boolean boolean47 = strList36.addAll((java.util.Collection<java.lang.String>) strList45);
        strList36.clear();
        int int49 = strList36.size();
        boolean boolean50 = strList28.contains((java.lang.Object) strList36);
        java.util.stream.Stream<java.lang.String> strStream51 = strList36.stream();
        boolean boolean52 = strList18.addAll((java.util.Collection<java.lang.String>) strList36);
        boolean boolean53 = strList5.retainAll((java.util.Collection<java.lang.String>) strList18);
        java.util.Iterator<java.lang.String> strItor54 = strList18.iterator();
        DataStructures.AvlTreeList<java.lang.String> strList55 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = strList55.containsAll((java.util.Collection<java.lang.String>) strList58);
        strList55.clear();
        java.lang.Object[] objArray62 = strList55.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator63 = strList55.spliterator();
        boolean boolean64 = strList18.addAll((java.util.Collection<java.lang.String>) strList55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.String> strItor66 = strList55.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test561");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        DataStructures.AvlTreeList<java.lang.String> strList6 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList4);
        java.util.stream.Stream<java.lang.String> strStream7 = strList6.parallelStream();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        boolean boolean12 = strList6.addAll((java.util.Collection<java.lang.String>) strList10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        DataStructures.AvlTreeList<java.lang.String> strList18 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList16);
        java.util.stream.Stream<java.lang.String> strStream19 = strList18.parallelStream();
        boolean boolean21 = strList18.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        DataStructures.AvlTreeList<java.lang.String> strList27 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList25);
        java.util.stream.Stream<java.lang.String> strStream28 = strList27.parallelStream();
        boolean boolean29 = strList18.addAll((java.util.Collection<java.lang.String>) strList27);
        strList18.clear();
        int int31 = strList18.size();
        boolean boolean32 = strList10.contains((java.lang.Object) strList18);
        java.util.stream.Stream<java.lang.String> strStream33 = strList18.stream();
        boolean boolean34 = strList0.addAll((java.util.Collection<java.lang.String>) strList18);
        DataStructures.AvlTreeList<java.lang.String> strList35 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = strList35.containsAll((java.util.Collection<java.lang.String>) strList38);
        java.util.ListIterator<java.lang.String> strItor41 = strList38.listIterator();
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList45);
        java.util.stream.Stream<java.lang.String> strStream48 = strList47.parallelStream();
        boolean boolean50 = strList47.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        DataStructures.AvlTreeList<java.lang.String> strList56 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList54);
        java.util.stream.Stream<java.lang.String> strStream57 = strList56.parallelStream();
        boolean boolean58 = strList47.addAll((java.util.Collection<java.lang.String>) strList56);
        strList47.clear();
        boolean boolean60 = strList38.addAll((java.util.Collection<java.lang.String>) strList47);
        boolean boolean61 = strList47.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList63 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = strList63.containsAll((java.util.Collection<java.lang.String>) strList66);
        strList63.clear();
        java.lang.Object[] objArray70 = strList63.toArray();
        java.util.ListIterator<java.lang.String> strItor71 = strList63.listIterator();
        boolean boolean72 = strList47.addAll(0, (java.util.Collection<java.lang.String>) strList63);
        DataStructures.AvlTreeList<java.lang.String> strList73 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor74 = strList73.iterator();
        java.util.ListIterator<java.lang.String> strItor75 = strList73.listIterator();
        java.util.ListIterator[] listIteratorArray77 = new java.util.ListIterator[1];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray78 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray77;
        strItorArray78[0] = strItor75;
        DataStructures.AvlTreeList<java.lang.String> strList81 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor82 = strList81.iterator();
        java.util.ListIterator<java.lang.String> strItor83 = strList81.listIterator();
        java.util.ListIterator[] listIteratorArray85 = new java.util.ListIterator[1];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray86 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray85;
        strItorArray86[0] = strItor83;
        java.util.ListIterator[][] listIteratorArray90 = new java.util.ListIterator[2][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[][] strItorArray91 = (java.util.ListIterator<java.lang.String>[][]) listIteratorArray90;
        strItorArray91[0] = strItorArray78;
        strItorArray91[1] = strItorArray86;
        java.util.ListIterator<java.lang.String>[][] strItorArray96 = strList63.toArray(strItorArray91);
        java.util.ListIterator<java.lang.String>[][] strItorArray97 = strList0.toArray(strItorArray96);
        java.lang.Object[] objArray98 = strList0.toArray();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test562");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor1 = strList0.iterator();
        boolean boolean3 = strList0.add("");
        boolean boolean5 = strList0.add("");
        DataStructures.AvlTreeList<java.lang.String> strList6 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList6.containsAll((java.util.Collection<java.lang.String>) strList9);
        boolean boolean12 = strList0.removeAll((java.util.Collection<java.lang.String>) strList6);
        java.util.List[] listArray14 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.String>[] strListArray15 = (java.util.List<java.lang.String>[]) listArray14;
        java.util.List<java.lang.String>[] strListArray16 = strList6.toArray((java.util.List<java.lang.String>[]) listArray14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor18 = strList17.iterator();
        java.util.ListIterator<java.lang.String> strItor19 = strList17.listIterator();
        java.util.stream.Stream<java.lang.String> strStream20 = strList17.stream();
        boolean boolean21 = strList6.contains((java.lang.Object) strStream20);
        java.util.Spliterator<java.lang.String> strSpliterator22 = strList6.spliterator();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test563");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        java.util.ListIterator<java.lang.String> strItor6 = strList3.listIterator();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        DataStructures.AvlTreeList<java.lang.String> strList12 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList10);
        java.util.stream.Stream<java.lang.String> strStream13 = strList12.parallelStream();
        boolean boolean15 = strList12.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        DataStructures.AvlTreeList<java.lang.String> strList21 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList19);
        java.util.stream.Stream<java.lang.String> strStream22 = strList21.parallelStream();
        boolean boolean23 = strList12.addAll((java.util.Collection<java.lang.String>) strList21);
        strList12.clear();
        boolean boolean25 = strList3.addAll((java.util.Collection<java.lang.String>) strList12);
        boolean boolean26 = strList12.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList28 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = strList28.containsAll((java.util.Collection<java.lang.String>) strList31);
        strList28.clear();
        java.lang.Object[] objArray35 = strList28.toArray();
        java.util.ListIterator<java.lang.String> strItor36 = strList28.listIterator();
        boolean boolean37 = strList12.addAll(0, (java.util.Collection<java.lang.String>) strList28);
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor39 = strList38.iterator();
        java.util.ListIterator<java.lang.String> strItor40 = strList38.listIterator();
        int int42 = strList38.indexOf((java.lang.Object) (-1.0f));
        boolean boolean43 = strList28.addAll((java.util.Collection<java.lang.String>) strList38);
        strList38.clear();
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        DataStructures.AvlTreeList<java.lang.String> strList50 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList48);
        java.util.stream.Stream<java.lang.String> strStream51 = strList50.parallelStream();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        boolean boolean56 = strList50.addAll((java.util.Collection<java.lang.String>) strList54);
        int int57 = strList50.size();
        boolean boolean58 = strList50.isEmpty();
        DataStructures.AvlTreeList<java.lang.String> strList59 = new DataStructures.AvlTreeList<java.lang.String>();
        boolean boolean60 = strList50.removeAll((java.util.Collection<java.lang.String>) strList59);
        DataStructures.AvlTreeList<java.lang.String> strList61 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList59);
        boolean boolean62 = strList61.isEmpty();
        boolean boolean63 = strList38.equals((java.lang.Object) strList61);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList66 = strList61.subList((int) (short) 1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test564");
        DataStructures.AvlTreeList<java.lang.String> strList0 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        boolean boolean5 = strList0.containsAll((java.util.Collection<java.lang.String>) strList3);
        strList0.clear();
        java.lang.Object[] objArray7 = strList0.toArray();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        DataStructures.AvlTreeList<java.lang.String> strList13 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList11);
        java.util.stream.Stream<java.lang.String> strStream14 = strList13.parallelStream();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = strList13.addAll((java.util.Collection<java.lang.String>) strList17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor21 = strList20.iterator();
        boolean boolean23 = strList20.add("");
        java.util.stream.Stream<java.lang.String> strStream24 = strList20.parallelStream();
        boolean boolean25 = strList13.addAll((java.util.Collection<java.lang.String>) strList20);
        boolean boolean26 = strList0.removeAll((java.util.Collection<java.lang.String>) strList13);
        boolean boolean27 = strList0.isEmpty();
        java.util.Spliterator<java.lang.String> strSpliterator28 = strList0.spliterator();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        DataStructures.AvlTreeList<java.lang.String> strList34 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList32);
        boolean boolean35 = strList34.isEmpty();
        java.lang.Object[] objArray36 = strList34.toArray();
        DataStructures.AvlTreeList<java.lang.Object> objList37 = new DataStructures.AvlTreeList<java.lang.Object>();
        boolean boolean38 = strList34.equals((java.lang.Object) objList37);
        java.util.stream.Stream<java.lang.String> strStream39 = strList34.parallelStream();
        boolean boolean40 = strList0.containsAll((java.util.Collection<java.lang.String>) strList34);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test565");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        int int12 = strList5.size();
        boolean boolean13 = strList5.isEmpty();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        DataStructures.AvlTreeList<java.lang.String> strList19 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList17);
        java.util.stream.Stream<java.lang.String> strStream20 = strList19.parallelStream();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        DataStructures.AvlTreeList<java.lang.String> strList26 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList24);
        boolean boolean27 = strList19.containsAll((java.util.Collection<java.lang.String>) strList26);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        DataStructures.AvlTreeList<java.lang.String> strList33 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList31);
        java.util.stream.Stream<java.lang.String> strStream34 = strList33.parallelStream();
        boolean boolean36 = strList33.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        DataStructures.AvlTreeList<java.lang.String> strList42 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList40);
        java.util.stream.Stream<java.lang.String> strStream43 = strList42.parallelStream();
        boolean boolean44 = strList33.addAll((java.util.Collection<java.lang.String>) strList42);
        strList33.clear();
        boolean boolean46 = strList19.containsAll((java.util.Collection<java.lang.String>) strList33);
        DataStructures.AvlTreeList<java.lang.String> strList47 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = strList47.containsAll((java.util.Collection<java.lang.String>) strList50);
        strList47.clear();
        boolean boolean54 = strList19.contains((java.lang.Object) strList47);
        DataStructures.AvlTreeList<java.lang.String> strList55 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList47);
        java.util.stream.Stream<java.lang.String> strStream56 = strList47.stream();
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        DataStructures.AvlTreeList<java.lang.String> strList62 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList60);
        java.util.stream.Stream<java.lang.String> strStream63 = strList62.parallelStream();
        boolean boolean65 = strList62.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        DataStructures.AvlTreeList<java.lang.String> strList71 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList69);
        java.util.stream.Stream<java.lang.String> strStream72 = strList71.parallelStream();
        boolean boolean73 = strList62.addAll((java.util.Collection<java.lang.String>) strList71);
        strList62.clear();
        boolean boolean75 = strList47.removeAll((java.util.Collection<java.lang.String>) strList62);
        java.util.stream.Stream<java.lang.String> strStream76 = strList62.stream();
        java.util.stream.Stream<java.lang.String> strStream77 = strList62.stream();
        DataStructures.AvlTreeList<java.lang.String> strList78 = new DataStructures.AvlTreeList<java.lang.String>();
        java.util.Iterator<java.lang.String> strItor79 = strList78.iterator();
        boolean boolean81 = strList78.add("");
        boolean boolean83 = strList78.add("");
        DataStructures.AvlTreeList<java.lang.String> strList84 = new DataStructures.AvlTreeList<java.lang.String>();
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        boolean boolean89 = strList84.containsAll((java.util.Collection<java.lang.String>) strList87);
        boolean boolean90 = strList78.removeAll((java.util.Collection<java.lang.String>) strList84);
        boolean boolean91 = strList62.containsAll((java.util.Collection<java.lang.String>) strList78);
        boolean boolean92 = strList5.contains((java.lang.Object) boolean91);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test566");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        DataStructures.AvlTreeList<java.lang.String> strList11 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList9);
        java.util.stream.Stream<java.lang.String> strStream12 = strList11.parallelStream();
        boolean boolean14 = strList11.remove((java.lang.Object) (byte) 10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        DataStructures.AvlTreeList<java.lang.String> strList20 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList18);
        java.util.stream.Stream<java.lang.String> strStream21 = strList20.parallelStream();
        boolean boolean22 = strList11.addAll((java.util.Collection<java.lang.String>) strList20);
        strList11.clear();
        boolean boolean24 = strList5.removeAll((java.util.Collection<java.lang.String>) strList11);
        java.util.stream.Stream<java.lang.String> strStream25 = strList5.stream();
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        DataStructures.AvlTreeList<java.lang.String> strList31 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = strList31.isEmpty();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        DataStructures.AvlTreeList<java.lang.String> strList38 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList36);
        java.util.stream.Stream<java.lang.String> strStream39 = strList38.parallelStream();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        DataStructures.AvlTreeList<java.lang.String> strList45 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList43);
        boolean boolean46 = strList38.containsAll((java.util.Collection<java.lang.String>) strList45);
        strList45.clear();
        boolean boolean48 = strList31.containsAll((java.util.Collection<java.lang.String>) strList45);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        DataStructures.AvlTreeList<java.lang.String> strList54 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList52);
        java.util.stream.Stream<java.lang.String> strStream55 = strList54.parallelStream();
        boolean boolean57 = strList54.remove((java.lang.Object) (byte) 10);
        boolean boolean58 = strList45.retainAll((java.util.Collection<java.lang.String>) strList54);
        boolean boolean59 = strList5.removeAll((java.util.Collection<java.lang.String>) strList54);
        int int60 = strList5.size();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test567");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        DataStructures.AvlTreeList<java.lang.String> strList5 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList3);
        java.util.stream.Stream<java.lang.String> strStream6 = strList5.parallelStream();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        boolean boolean11 = strList5.addAll((java.util.Collection<java.lang.String>) strList9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        DataStructures.AvlTreeList<java.lang.String> strList17 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList15);
        java.util.stream.Stream<java.lang.String> strStream18 = strList17.parallelStream();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        DataStructures.AvlTreeList<java.lang.String> strList24 = new DataStructures.AvlTreeList<java.lang.String>((java.util.Collection<java.lang.String>) strList22);
        boolean boolean25 = strList17.containsAll((java.util.Collection<java.lang.String>) strList24);
        int int26 = strList17.size();
        boolean boolean27 = strList5.retainAll((java.util.Collection<java.lang.String>) strList17);
        java.lang.String str29 = strList17.get(1);
        int int30 = strList17.size();
        java.util.Collection<java.lang.String> strCollection31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = strList17.addAll(strCollection31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

