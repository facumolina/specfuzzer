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
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean9 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        int int15 = charSequenceList13.size();
        boolean boolean17 = charSequenceList13.equals((java.lang.Object) (short) 100);
        boolean boolean19 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.lang.Object[] objArray27 = charSequenceList25.toArray();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        int int33 = charSequenceList31.size();
        boolean boolean34 = charSequenceList25.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        int int36 = charSequenceList25.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList40 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40, charSequenceArray39);
        java.lang.Object[] objArray42 = charSequenceList40.toArray();
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        int int48 = charSequenceList46.size();
        boolean boolean49 = charSequenceList40.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        int int51 = charSequenceList40.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean52 = charSequenceList25.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList56 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        java.lang.Object[] objArray58 = charSequenceList56.toArray();
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList62 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62, charSequenceArray61);
        int int64 = charSequenceList62.size();
        boolean boolean65 = charSequenceList56.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62);
        int int67 = charSequenceList56.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList71 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList71, charSequenceArray70);
        int int73 = charSequenceList71.size();
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList76 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76, charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList81 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        boolean boolean83 = charSequenceList76.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        boolean boolean84 = charSequenceList71.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76);
        boolean boolean85 = charSequenceList56.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76);
        boolean boolean86 = charSequenceList40.equals((java.lang.Object) charSequenceList56);
        boolean boolean87 = charSequenceList21.equals((java.lang.Object) boolean86);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList90 = charSequenceList21.subList(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test502");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray1 = charSequenceList0.toArray();
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList4 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4, charSequenceArray3);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        boolean boolean11 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        java.util.List<java.lang.CharSequence> charSequenceList14 = charSequenceList9.subList((int) (short) 0, (int) (byte) 1);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        boolean boolean16 = charSequenceList0.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test503");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.lang.Object[] objArray20 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        int int26 = charSequenceList24.size();
        boolean boolean27 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean30 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.Object[] objArray31 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList35 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        java.lang.Object[] objArray37 = charSequenceList35.toArray();
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        int int43 = charSequenceList41.size();
        boolean boolean44 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        boolean boolean45 = charSequenceList18.equals((java.lang.Object) charSequenceList41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList48 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48, charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList53 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        boolean boolean55 = charSequenceList48.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        boolean boolean56 = charSequenceList53.isEmpty();
        boolean boolean58 = charSequenceList53.equals((java.lang.Object) (-1L));
        java.lang.Object obj59 = null;
        boolean boolean60 = charSequenceList53.remove(obj59);
        boolean boolean61 = charSequenceList18.equals((java.lang.Object) boolean60);
        java.lang.Object[] objArray62 = charSequenceList18.toArray();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test504");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.lang.Object[] objArray20 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        int int26 = charSequenceList24.size();
        boolean boolean27 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean30 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.Object[] objArray31 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList35 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        java.lang.Object[] objArray37 = charSequenceList35.toArray();
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        int int43 = charSequenceList41.size();
        boolean boolean44 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        boolean boolean45 = charSequenceList18.equals((java.lang.Object) charSequenceList41);
        int int46 = charSequenceList41.size();
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList50 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        java.lang.Object[] objArray52 = charSequenceList50.toArray();
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        int int58 = charSequenceList56.size();
        boolean boolean59 = charSequenceList50.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56);
        int int61 = charSequenceList50.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList65 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65, charSequenceArray64);
        java.lang.Object[] objArray67 = charSequenceList65.toArray();
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList71 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList71, charSequenceArray70);
        int int73 = charSequenceList71.size();
        boolean boolean74 = charSequenceList65.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList71);
        int int76 = charSequenceList65.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean77 = charSequenceList50.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65);
        java.lang.Object[] objArray78 = charSequenceList65.toArray();
        boolean boolean79 = charSequenceList41.contains((java.lang.Object) objArray78);
        charSequenceList41.clear();
        java.util.Collection<java.lang.CharSequence> charSequenceCollection81 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = charSequenceList41.removeAll(charSequenceCollection81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test505");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList4 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4, charSequenceArray3);
        java.lang.Object[] objArray6 = charSequenceList4.toArray();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        int int12 = charSequenceList10.size();
        boolean boolean13 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        boolean boolean14 = charSequenceList0.contains((java.lang.Object) boolean13);
        boolean boolean15 = charSequenceList0.isEmpty();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        int int21 = charSequenceList19.size();
        boolean boolean23 = charSequenceList19.equals((java.lang.Object) 0L);
        boolean boolean24 = charSequenceList19.isEmpty();
        boolean boolean25 = charSequenceList19.isEmpty();
        int int26 = charSequenceList19.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean29 = charSequenceList27.equals((java.lang.Object) (short) -1);
        int int30 = charSequenceList19.lastIndexOf((java.lang.Object) boolean29);
        int int31 = charSequenceList0.lastIndexOf((java.lang.Object) boolean29);
        int int32 = charSequenceList0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList35 = charSequenceList0.subList(9, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test506");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean1 = charSequenceList0.isEmpty();
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList5 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5, charSequenceArray4);
        java.lang.Object[] objArray7 = charSequenceList5.toArray();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        int int13 = charSequenceList11.size();
        boolean boolean14 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList11.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean18 = charSequenceList11.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean19 = charSequenceList0.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList22 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList27 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27, charSequenceArray26);
        boolean boolean29 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        boolean boolean30 = charSequenceList27.isEmpty();
        boolean boolean32 = charSequenceList27.equals((java.lang.Object) (-1L));
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList36 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        java.lang.Object[] objArray38 = charSequenceList36.toArray();
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList42 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        int int44 = charSequenceList42.size();
        boolean boolean45 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        int int47 = charSequenceList36.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList51 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51, charSequenceArray50);
        java.lang.Object[] objArray53 = charSequenceList51.toArray();
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57, charSequenceArray56);
        int int59 = charSequenceList57.size();
        boolean boolean60 = charSequenceList51.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        int int62 = charSequenceList51.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean63 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        java.lang.Object[] objArray64 = charSequenceList51.toArray();
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList68 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68, charSequenceArray67);
        java.lang.Object[] objArray70 = charSequenceList68.toArray();
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList74 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList74, charSequenceArray73);
        int int76 = charSequenceList74.size();
        boolean boolean77 = charSequenceList68.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList74);
        boolean boolean78 = charSequenceList51.equals((java.lang.Object) charSequenceList74);
        boolean boolean79 = charSequenceList27.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        boolean boolean80 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test507");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList4 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4, charSequenceArray3);
        java.lang.Object[] objArray6 = charSequenceList4.toArray();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        int int12 = charSequenceList10.size();
        boolean boolean13 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        boolean boolean14 = charSequenceList0.contains((java.lang.Object) boolean13);
        boolean boolean15 = charSequenceList0.isEmpty();
        java.lang.Object obj16 = null;
        boolean boolean17 = charSequenceList0.contains(obj16);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test508");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean9 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        int int15 = charSequenceList13.size();
        boolean boolean17 = charSequenceList13.equals((java.lang.Object) (short) 100);
        boolean boolean19 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList24 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        java.lang.Object[] objArray26 = charSequenceList24.toArray();
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30, charSequenceArray29);
        int int32 = charSequenceList30.size();
        boolean boolean33 = charSequenceList24.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        int int35 = charSequenceList24.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList39 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39, charSequenceArray38);
        java.lang.Object[] objArray41 = charSequenceList39.toArray();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        int int47 = charSequenceList45.size();
        boolean boolean48 = charSequenceList39.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        int int50 = charSequenceList39.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean51 = charSequenceList24.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList55 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        java.lang.Object[] objArray57 = charSequenceList55.toArray();
        boolean boolean58 = charSequenceList39.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList62 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62, charSequenceArray61);
        java.lang.Object[] objArray64 = charSequenceList62.toArray();
        boolean boolean65 = charSequenceList55.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62);
        boolean boolean66 = charSequenceList2.remove((java.lang.Object) charSequenceList55);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList70 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70, charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList75 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75, charSequenceArray74);
        boolean boolean77 = charSequenceList70.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList81 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        int int83 = charSequenceList81.size();
        boolean boolean85 = charSequenceList81.equals((java.lang.Object) (short) 100);
        boolean boolean87 = charSequenceList81.add((java.lang.CharSequence) "hi!");
        boolean boolean88 = charSequenceList70.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList89 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = charSequenceList2.addAll((int) '4', (java.util.Collection<java.lang.CharSequence>) charSequenceList89);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test509");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.lang.Object[] objArray20 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        int int26 = charSequenceList24.size();
        boolean boolean27 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean30 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList34 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        java.lang.Object[] objArray36 = charSequenceList34.toArray();
        boolean boolean37 = charSequenceList18.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList41 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        java.lang.Object[] objArray43 = charSequenceList41.toArray();
        boolean boolean44 = charSequenceList34.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList47 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47, charSequenceArray46);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList52 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52, charSequenceArray51);
        boolean boolean54 = charSequenceList47.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        boolean boolean55 = charSequenceList52.isEmpty();
        boolean boolean57 = charSequenceList52.equals((java.lang.Object) (-1L));
        java.lang.Object obj58 = null;
        boolean boolean59 = charSequenceList52.remove(obj58);
        boolean boolean60 = charSequenceList34.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList61 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList65 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65, charSequenceArray64);
        java.lang.Object[] objArray67 = charSequenceList65.toArray();
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList71 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList71, charSequenceArray70);
        int int73 = charSequenceList71.size();
        boolean boolean74 = charSequenceList65.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList71);
        boolean boolean75 = charSequenceList61.contains((java.lang.Object) boolean74);
        boolean boolean76 = charSequenceList61.isEmpty();
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList80 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80, charSequenceArray79);
        int int82 = charSequenceList80.size();
        boolean boolean84 = charSequenceList80.equals((java.lang.Object) 0L);
        boolean boolean85 = charSequenceList80.isEmpty();
        boolean boolean86 = charSequenceList80.isEmpty();
        int int87 = charSequenceList80.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList88 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean90 = charSequenceList88.equals((java.lang.Object) (short) -1);
        int int91 = charSequenceList80.lastIndexOf((java.lang.Object) boolean90);
        int int92 = charSequenceList61.lastIndexOf((java.lang.Object) boolean90);
        boolean boolean93 = charSequenceList34.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        int int94 = charSequenceList61.size();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test510");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        charSequenceList3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = charSequenceList3.set((int) (short) 10, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test511");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        java.lang.Object[] objArray4 = charSequenceList0.toArray();
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        boolean boolean14 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean15 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList19 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        java.lang.Object[] objArray21 = charSequenceList19.toArray();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        int int27 = charSequenceList25.size();
        boolean boolean28 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean30 = charSequenceList25.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList25.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean34 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean35 = charSequenceList0.isEmpty();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test512");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.lang.Object[] objArray9 = charSequenceList7.toArray();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        int int15 = charSequenceList13.size();
        boolean boolean16 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        int int18 = charSequenceList7.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList22 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        java.lang.Object[] objArray24 = charSequenceList22.toArray();
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        int int30 = charSequenceList28.size();
        boolean boolean31 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        int int33 = charSequenceList22.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean34 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean37 = charSequenceList35.contains((java.lang.Object) (byte) 0);
        boolean boolean38 = charSequenceList22.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        boolean boolean40 = charSequenceList22.remove((java.lang.Object) 10.0f);
        boolean boolean41 = charSequenceList0.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        java.lang.Object[] objArray47 = charSequenceList45.toArray();
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList51 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51, charSequenceArray50);
        int int53 = charSequenceList51.size();
        boolean boolean54 = charSequenceList45.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        int int56 = charSequenceList45.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList60 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60, charSequenceArray59);
        int int62 = charSequenceList60.size();
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList65 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65, charSequenceArray64);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList70 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70, charSequenceArray69);
        boolean boolean72 = charSequenceList65.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70);
        boolean boolean73 = charSequenceList60.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65);
        boolean boolean74 = charSequenceList45.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList75 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean77 = charSequenceList75.equals((java.lang.Object) (byte) 100);
        boolean boolean78 = charSequenceList65.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        boolean boolean79 = charSequenceList0.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence82 = charSequenceList0.set((-8), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test513");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList4 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4, charSequenceArray3);
        java.lang.Object[] objArray6 = charSequenceList4.toArray();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        int int12 = charSequenceList10.size();
        boolean boolean13 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        boolean boolean14 = charSequenceList0.contains((java.lang.Object) boolean13);
        boolean boolean15 = charSequenceList0.isEmpty();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        int int21 = charSequenceList19.size();
        boolean boolean23 = charSequenceList19.equals((java.lang.Object) 0L);
        boolean boolean24 = charSequenceList19.isEmpty();
        boolean boolean25 = charSequenceList19.isEmpty();
        int int26 = charSequenceList19.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean29 = charSequenceList27.equals((java.lang.Object) (short) -1);
        int int30 = charSequenceList19.lastIndexOf((java.lang.Object) boolean29);
        int int31 = charSequenceList0.lastIndexOf((java.lang.Object) boolean29);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList35 = charSequenceList0.subList((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test514");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList11 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        java.lang.Object[] objArray13 = charSequenceList11.toArray();
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        int int19 = charSequenceList17.size();
        boolean boolean20 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        int int22 = charSequenceList11.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        java.lang.Object[] objArray28 = charSequenceList26.toArray();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        int int34 = charSequenceList32.size();
        boolean boolean35 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList26.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean38 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.contains((java.lang.Object) (byte) 0);
        boolean boolean42 = charSequenceList26.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean43 = charSequenceList3.remove((java.lang.Object) charSequenceList39);
        java.lang.Object[] objArray44 = charSequenceList39.toArray();
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList48 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48, charSequenceArray47);
        int int50 = charSequenceList48.size();
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList53 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList58 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58, charSequenceArray57);
        boolean boolean60 = charSequenceList53.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        boolean boolean61 = charSequenceList48.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        java.lang.CharSequence charSequence63 = charSequenceList48.get(0);
        boolean boolean64 = charSequenceList39.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48);
        int int65 = charSequenceList39.size();
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList68 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68, charSequenceArray67);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList73 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73, charSequenceArray72);
        boolean boolean75 = charSequenceList68.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList79 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList79, charSequenceArray78);
        int int81 = charSequenceList79.size();
        java.lang.CharSequence[] charSequenceArray84 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList85 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList85, charSequenceArray84);
        charSequenceList85.clear();
        boolean boolean88 = charSequenceList79.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList85);
        boolean boolean89 = charSequenceList73.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList79);
        boolean boolean91 = charSequenceList73.contains((java.lang.Object) 100);
        int int92 = charSequenceList39.lastIndexOf((java.lang.Object) charSequenceList73);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test515");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        boolean boolean8 = charSequenceList3.isEmpty();
        boolean boolean9 = charSequenceList3.isEmpty();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "hi!" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        java.lang.CharSequence charSequence16 = charSequenceList13.remove(1);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        int int22 = charSequenceList20.size();
        charSequenceList20.clear();
        boolean boolean24 = charSequenceList13.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray31 = charSequenceList30.toArray();
        int int32 = charSequenceList28.indexOf((java.lang.Object) objArray31);
        boolean boolean33 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean34 = charSequenceList3.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean36 = charSequenceList28.add((java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList40 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40, charSequenceArray39);
        java.lang.Object[] objArray42 = charSequenceList40.toArray();
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        int int48 = charSequenceList46.size();
        boolean boolean49 = charSequenceList40.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        int int51 = charSequenceList40.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        int int57 = charSequenceList55.size();
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList60 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60, charSequenceArray59);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList65 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65, charSequenceArray64);
        boolean boolean67 = charSequenceList60.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65);
        boolean boolean68 = charSequenceList55.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60);
        boolean boolean69 = charSequenceList40.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList70 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean72 = charSequenceList70.equals((java.lang.Object) (byte) 100);
        boolean boolean73 = charSequenceList60.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70);
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList76 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76, charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList81 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        boolean boolean83 = charSequenceList76.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        boolean boolean84 = charSequenceList60.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76);
        boolean boolean85 = charSequenceList28.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76);
        boolean boolean87 = charSequenceList28.add((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test516");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList11 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        java.lang.Object[] objArray13 = charSequenceList11.toArray();
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        int int19 = charSequenceList17.size();
        boolean boolean20 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean22 = charSequenceList17.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        boolean boolean23 = charSequenceList3.equals((java.lang.Object) charSequenceList21);
        charSequenceList3.clear();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray26 = charSequenceList25.toArray();
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30, charSequenceArray29);
        int int32 = charSequenceList30.size();
        boolean boolean34 = charSequenceList30.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList42 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        boolean boolean44 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        int int45 = charSequenceList30.indexOf((java.lang.Object) charSequenceList42);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean48 = charSequenceList46.equals((java.lang.Object) (byte) 100);
        int int49 = charSequenceList30.lastIndexOf((java.lang.Object) charSequenceList46);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean51 = charSequenceList25.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean53 = charSequenceList3.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        charSequenceList3.clear();
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList58 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58, charSequenceArray57);
        java.lang.Object[] objArray60 = charSequenceList58.toArray();
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList64 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64, charSequenceArray63);
        int int66 = charSequenceList64.size();
        boolean boolean67 = charSequenceList58.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList68 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean70 = charSequenceList68.equals((java.lang.Object) (byte) 100);
        boolean boolean71 = charSequenceList58.contains((java.lang.Object) charSequenceList68);
        charSequenceList68.clear();
        boolean boolean73 = charSequenceList3.remove((java.lang.Object) charSequenceList68);
        charSequenceList68.clear();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test517");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.lang.Object[] objArray20 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        int int26 = charSequenceList24.size();
        boolean boolean27 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean30 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.Object[] objArray31 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList35 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        java.lang.Object[] objArray37 = charSequenceList35.toArray();
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        int int43 = charSequenceList41.size();
        boolean boolean44 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        boolean boolean45 = charSequenceList18.equals((java.lang.Object) charSequenceList41);
        boolean boolean47 = charSequenceList41.add((java.lang.CharSequence) "hi!");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList48 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean50 = charSequenceList48.equals((java.lang.Object) (short) -1);
        boolean boolean52 = charSequenceList48.add((java.lang.CharSequence) "hi!");
        boolean boolean53 = charSequenceList41.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48);
        int int54 = charSequenceList41.size();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test518");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList4 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4, charSequenceArray3);
        java.lang.Object[] objArray6 = charSequenceList4.toArray();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        int int12 = charSequenceList10.size();
        boolean boolean13 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        boolean boolean14 = charSequenceList0.contains((java.lang.Object) boolean13);
        boolean boolean15 = charSequenceList0.isEmpty();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        int int21 = charSequenceList19.size();
        boolean boolean23 = charSequenceList19.equals((java.lang.Object) 0L);
        boolean boolean24 = charSequenceList19.isEmpty();
        boolean boolean25 = charSequenceList19.isEmpty();
        int int26 = charSequenceList19.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean29 = charSequenceList27.equals((java.lang.Object) (short) -1);
        int int30 = charSequenceList19.lastIndexOf((java.lang.Object) boolean29);
        int int31 = charSequenceList0.lastIndexOf((java.lang.Object) boolean29);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        java.lang.Object[] objArray39 = charSequenceList37.toArray();
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList43 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43, charSequenceArray42);
        int int45 = charSequenceList43.size();
        boolean boolean46 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        boolean boolean47 = charSequenceList33.contains((java.lang.Object) boolean46);
        boolean boolean48 = charSequenceList33.isEmpty();
        int int49 = charSequenceList33.size();
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList53 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        int int55 = charSequenceList53.size();
        boolean boolean57 = charSequenceList53.equals((java.lang.Object) 0L);
        boolean boolean58 = charSequenceList53.isEmpty();
        boolean boolean59 = charSequenceList53.isEmpty();
        charSequenceList53.clear();
        boolean boolean61 = charSequenceList33.equals((java.lang.Object) charSequenceList53);
        boolean boolean62 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList65 = charSequenceList0.subList(5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(5) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test519");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean9 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        int int15 = charSequenceList13.size();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        charSequenceList19.clear();
        boolean boolean22 = charSequenceList13.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        boolean boolean23 = charSequenceList7.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        boolean boolean25 = charSequenceList7.contains((java.lang.Object) 100);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList26 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean27 = charSequenceList26.isEmpty();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.lang.Object[] objArray33 = charSequenceList31.toArray();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        boolean boolean40 = charSequenceList31.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean42 = charSequenceList37.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList43 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean44 = charSequenceList37.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        boolean boolean45 = charSequenceList26.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        charSequenceList37.clear();
        boolean boolean47 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList51 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51, charSequenceArray50);
        int int53 = charSequenceList51.size();
        boolean boolean55 = charSequenceList51.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList58 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58, charSequenceArray57);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList63 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63, charSequenceArray62);
        boolean boolean65 = charSequenceList58.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        int int66 = charSequenceList51.indexOf((java.lang.Object) charSequenceList63);
        java.lang.CharSequence charSequence68 = charSequenceList51.get((int) (byte) 0);
        int int69 = charSequenceList37.indexOf((java.lang.Object) charSequence68);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList74 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList74, charSequenceArray73);
        int int76 = charSequenceList74.size();
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList80 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80, charSequenceArray79);
        charSequenceList80.clear();
        boolean boolean83 = charSequenceList74.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80);
        boolean boolean85 = charSequenceList74.contains((java.lang.Object) 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = charSequenceList37.addAll((int) (byte) 1, (java.util.Collection<java.lang.CharSequence>) charSequenceList74);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test520");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        java.lang.Object[] objArray18 = charSequenceList16.toArray();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        int int24 = charSequenceList22.size();
        boolean boolean25 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        int int27 = charSequenceList16.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.lang.Object[] objArray33 = charSequenceList31.toArray();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        boolean boolean40 = charSequenceList31.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        int int42 = charSequenceList31.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean43 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList47 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47, charSequenceArray46);
        java.lang.Object[] objArray49 = charSequenceList47.toArray();
        boolean boolean50 = charSequenceList31.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList54 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54, charSequenceArray53);
        java.lang.Object[] objArray56 = charSequenceList54.toArray();
        boolean boolean57 = charSequenceList47.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54);
        boolean boolean58 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        boolean boolean60 = charSequenceList47.remove((java.lang.Object) (-100));
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList64 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64, charSequenceArray63);
        int int66 = charSequenceList64.size();
        boolean boolean68 = charSequenceList64.equals((java.lang.Object) 0L);
        charSequenceList64.clear();
        boolean boolean70 = charSequenceList47.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        boolean boolean72 = charSequenceList64.add((java.lang.CharSequence) "hi!");
        int int73 = charSequenceList64.size();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test521");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean32 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList36 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        java.lang.Object[] objArray38 = charSequenceList36.toArray();
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList42 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        int int44 = charSequenceList42.size();
        boolean boolean45 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        int int47 = charSequenceList36.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList51 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51, charSequenceArray50);
        java.lang.Object[] objArray53 = charSequenceList51.toArray();
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57, charSequenceArray56);
        int int59 = charSequenceList57.size();
        boolean boolean60 = charSequenceList51.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        int int62 = charSequenceList51.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean63 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        java.lang.Object[] objArray64 = charSequenceList51.toArray();
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList68 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68, charSequenceArray67);
        java.lang.Object[] objArray70 = charSequenceList68.toArray();
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList74 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList74, charSequenceArray73);
        int int76 = charSequenceList74.size();
        boolean boolean77 = charSequenceList68.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList74);
        boolean boolean78 = charSequenceList51.equals((java.lang.Object) charSequenceList74);
        int int79 = charSequenceList3.lastIndexOf((java.lang.Object) boolean78);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList80 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        boolean boolean82 = charSequenceList3.remove((java.lang.Object) 7);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList83 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray84 = charSequenceList83.toArray();
        boolean boolean85 = charSequenceList3.remove((java.lang.Object) charSequenceList83);
        java.lang.Object[] objArray86 = charSequenceList3.toArray();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test522");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) (short) 100);
        boolean boolean9 = charSequenceList3.add((java.lang.CharSequence) "");
        java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.CharSequence>[] charSequenceCollectionArray11 = charSequenceList3.toArray(charSequenceCollectionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test523");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        charSequenceList3.clear();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList12 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray13 = charSequenceList12.toArray();
        int int14 = charSequenceList10.indexOf((java.lang.Object) objArray13);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList17 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList22 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        boolean boolean24 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        java.util.List<java.lang.CharSequence> charSequenceList27 = charSequenceList22.subList((int) (short) 0, (int) (byte) 1);
        boolean boolean28 = charSequenceList10.contains((java.lang.Object) charSequenceList27);
        boolean boolean29 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test524");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList6 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6, charSequenceArray5);
        int int8 = charSequenceList6.size();
        boolean boolean10 = charSequenceList6.equals((java.lang.Object) 0L);
        int int11 = charSequenceList6.size();
        boolean boolean12 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList6);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test525");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean32 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList36 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        java.lang.Object[] objArray38 = charSequenceList36.toArray();
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList42 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        int int44 = charSequenceList42.size();
        boolean boolean45 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        int int47 = charSequenceList36.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList51 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51, charSequenceArray50);
        java.lang.Object[] objArray53 = charSequenceList51.toArray();
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57, charSequenceArray56);
        int int59 = charSequenceList57.size();
        boolean boolean60 = charSequenceList51.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        int int62 = charSequenceList51.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean63 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        boolean boolean64 = charSequenceList3.remove((java.lang.Object) charSequenceList36);
        java.lang.Object[] objArray65 = charSequenceList36.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList68 = charSequenceList36.subList(9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(9) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test526");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        java.lang.Object[] objArray4 = charSequenceList0.toArray();
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        boolean boolean14 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean15 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList19 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        java.lang.Object[] objArray21 = charSequenceList19.toArray();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        int int27 = charSequenceList25.size();
        boolean boolean28 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean30 = charSequenceList25.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList25.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean34 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean36 = charSequenceList25.add((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test527");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean32 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean35 = charSequenceList33.equals((java.lang.Object) (byte) 100);
        boolean boolean36 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean39 = charSequenceList37.equals((java.lang.Object) (byte) 100);
        boolean boolean40 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-7), (short) 100 };
        java.lang.Object[] objArray44 = charSequenceList23.toArray(objArray43);
        java.lang.Object[] objArray45 = charSequenceList23.toArray();
        boolean boolean47 = charSequenceList23.add((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test528");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        charSequenceList0.clear();
        java.lang.Object[] objArray5 = charSequenceList0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList0.add((int) (byte) 1, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test529");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean9 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        int int15 = charSequenceList13.size();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        charSequenceList19.clear();
        boolean boolean22 = charSequenceList13.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        boolean boolean23 = charSequenceList7.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList27 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27, charSequenceArray26);
        java.lang.Object[] objArray29 = charSequenceList27.toArray();
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        int int35 = charSequenceList33.size();
        boolean boolean36 = charSequenceList27.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean38 = charSequenceList33.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        boolean boolean39 = charSequenceList13.equals((java.lang.Object) boolean38);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList42 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList47 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47, charSequenceArray46);
        boolean boolean49 = charSequenceList42.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList53 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        java.lang.Object[] objArray55 = charSequenceList53.toArray();
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList59 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59, charSequenceArray58);
        int int61 = charSequenceList59.size();
        boolean boolean62 = charSequenceList53.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59);
        int int64 = charSequenceList53.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList68 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68, charSequenceArray67);
        int int70 = charSequenceList68.size();
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList73 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73, charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList78 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList78, charSequenceArray77);
        boolean boolean80 = charSequenceList73.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList78);
        boolean boolean81 = charSequenceList68.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        boolean boolean82 = charSequenceList53.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList83 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean85 = charSequenceList83.equals((java.lang.Object) (byte) 100);
        boolean boolean86 = charSequenceList73.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList83);
        boolean boolean87 = charSequenceList42.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        boolean boolean88 = charSequenceList13.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        java.lang.Object[] objArray89 = charSequenceList13.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence92 = charSequenceList13.set((int) (byte) 1, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test530");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = charSequenceList9.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence charSequence33 = charSequenceList18.get(0);
        boolean boolean34 = charSequenceList13.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList42 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        boolean boolean44 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        java.util.List<java.lang.CharSequence> charSequenceList47 = charSequenceList42.subList((int) (short) 0, (int) (byte) 1);
        boolean boolean48 = charSequenceList18.contains((java.lang.Object) charSequenceList42);
        java.lang.Object obj49 = null;
        boolean boolean50 = charSequenceList18.equals(obj49);
        charSequenceList18.clear();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList18.add((-100), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test531");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean1 = charSequenceList0.isEmpty();
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList5 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5, charSequenceArray4);
        java.lang.Object[] objArray7 = charSequenceList5.toArray();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        int int13 = charSequenceList11.size();
        boolean boolean14 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList11.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean18 = charSequenceList11.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean19 = charSequenceList0.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList23 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        int int25 = charSequenceList23.size();
        boolean boolean27 = charSequenceList23.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.lang.Object[] objArray33 = charSequenceList31.toArray();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        boolean boolean40 = charSequenceList31.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        int int42 = charSequenceList31.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList46 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        java.lang.Object[] objArray48 = charSequenceList46.toArray();
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52, charSequenceArray51);
        int int54 = charSequenceList52.size();
        boolean boolean55 = charSequenceList46.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        int int57 = charSequenceList46.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean58 = charSequenceList31.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList62 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62, charSequenceArray61);
        java.lang.Object[] objArray64 = charSequenceList62.toArray();
        boolean boolean65 = charSequenceList46.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62);
        int int67 = charSequenceList46.lastIndexOf((java.lang.Object) 0.0d);
        boolean boolean69 = charSequenceList46.remove((java.lang.Object) 100.0f);
        boolean boolean70 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        java.lang.CharSequence charSequence72 = charSequenceList23.get(4);
        boolean boolean73 = charSequenceList0.equals((java.lang.Object) 4);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test532");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) (short) 100);
        boolean boolean9 = charSequenceList3.add((java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        java.lang.Object[] objArray15 = charSequenceList13.toArray();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        int int21 = charSequenceList19.size();
        boolean boolean22 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        int int24 = charSequenceList13.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        java.lang.Object[] objArray30 = charSequenceList28.toArray();
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList34 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        int int36 = charSequenceList34.size();
        boolean boolean37 = charSequenceList28.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        int int39 = charSequenceList28.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean40 = charSequenceList13.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean43 = charSequenceList41.contains((java.lang.Object) (byte) 0);
        boolean boolean44 = charSequenceList28.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean47 = charSequenceList45.equals((java.lang.Object) (short) -1);
        int int48 = charSequenceList41.lastIndexOf((java.lang.Object) (short) -1);
        charSequenceList41.clear();
        boolean boolean50 = charSequenceList3.remove((java.lang.Object) charSequenceList41);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test533");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        java.lang.Object[] objArray10 = charSequenceList8.toArray();
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        int int16 = charSequenceList14.size();
        boolean boolean17 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        int int19 = charSequenceList8.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.Object[] objArray25 = charSequenceList23.toArray();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29, charSequenceArray28);
        int int31 = charSequenceList29.size();
        boolean boolean32 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int34 = charSequenceList23.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean35 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList39 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39, charSequenceArray38);
        java.lang.Object[] objArray41 = charSequenceList39.toArray();
        boolean boolean42 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList46 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        java.lang.Object[] objArray48 = charSequenceList46.toArray();
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52, charSequenceArray51);
        int int54 = charSequenceList52.size();
        boolean boolean55 = charSequenceList46.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean57 = charSequenceList52.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList58 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean59 = charSequenceList52.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63, charSequenceArray62);
        int int65 = charSequenceList63.size();
        boolean boolean67 = charSequenceList63.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList70 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70, charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList75 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75, charSequenceArray74);
        boolean boolean77 = charSequenceList70.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        int int78 = charSequenceList63.indexOf((java.lang.Object) charSequenceList75);
        int int79 = charSequenceList58.lastIndexOf((java.lang.Object) charSequenceList63);
        boolean boolean80 = charSequenceList23.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        boolean boolean81 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean83 = charSequenceList0.add((java.lang.CharSequence) "");
        charSequenceList0.clear();
        java.lang.CharSequence charSequence86 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList0.add((int) (byte) 100, charSequence86);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test534");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList11 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        java.lang.Object[] objArray13 = charSequenceList11.toArray();
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        int int19 = charSequenceList17.size();
        boolean boolean20 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean22 = charSequenceList17.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        boolean boolean23 = charSequenceList3.equals((java.lang.Object) charSequenceList21);
        charSequenceList3.clear();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray26 = charSequenceList25.toArray();
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList30 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30, charSequenceArray29);
        int int32 = charSequenceList30.size();
        boolean boolean34 = charSequenceList30.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList42 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        boolean boolean44 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        int int45 = charSequenceList30.indexOf((java.lang.Object) charSequenceList42);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean48 = charSequenceList46.equals((java.lang.Object) (byte) 100);
        int int49 = charSequenceList30.lastIndexOf((java.lang.Object) charSequenceList46);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean51 = charSequenceList25.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        boolean boolean53 = charSequenceList3.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        charSequenceList3.clear();
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList58 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58, charSequenceArray57);
        java.lang.Object[] objArray60 = charSequenceList58.toArray();
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList64 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64, charSequenceArray63);
        int int66 = charSequenceList64.size();
        boolean boolean67 = charSequenceList58.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList68 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean70 = charSequenceList68.equals((java.lang.Object) (byte) 100);
        boolean boolean71 = charSequenceList58.contains((java.lang.Object) charSequenceList68);
        charSequenceList68.clear();
        boolean boolean73 = charSequenceList3.remove((java.lang.Object) charSequenceList68);
        java.lang.Object[] objArray74 = charSequenceList3.toArray();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test535");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean32 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean35 = charSequenceList33.equals((java.lang.Object) (byte) 100);
        boolean boolean36 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean39 = charSequenceList37.equals((java.lang.Object) (byte) 100);
        boolean boolean40 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (-7), (short) 100 };
        java.lang.Object[] objArray44 = charSequenceList23.toArray(objArray43);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList48 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48, charSequenceArray47);
        java.lang.Object[] objArray50 = charSequenceList48.toArray();
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList54 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54, charSequenceArray53);
        int int56 = charSequenceList54.size();
        boolean boolean57 = charSequenceList48.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList58 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean59 = charSequenceList54.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList60 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean61 = charSequenceList54.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60);
        boolean boolean62 = charSequenceList23.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60);
        boolean boolean63 = charSequenceList23.isEmpty();
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList67 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList67, charSequenceArray66);
        int int69 = charSequenceList67.size();
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList73 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73, charSequenceArray72);
        charSequenceList73.clear();
        boolean boolean76 = charSequenceList67.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        int int77 = charSequenceList23.indexOf((java.lang.Object) charSequenceList73);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test536");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean17 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int18 = charSequenceList3.indexOf((java.lang.Object) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.equals((java.lang.Object) (byte) 100);
        int int22 = charSequenceList3.lastIndexOf((java.lang.Object) charSequenceList19);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList23 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        charSequenceList3.add(1, (java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList30 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30, charSequenceArray29);
        java.lang.Object[] objArray32 = charSequenceList30.toArray();
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList36 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        java.lang.Object[] objArray38 = charSequenceList36.toArray();
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList42 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        int int44 = charSequenceList42.size();
        boolean boolean45 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList49 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49, charSequenceArray48);
        java.lang.Object[] objArray51 = charSequenceList49.toArray();
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        int int57 = charSequenceList55.size();
        boolean boolean58 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55);
        int int60 = charSequenceList49.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList64 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64, charSequenceArray63);
        java.lang.Object[] objArray66 = charSequenceList64.toArray();
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList70 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70, charSequenceArray69);
        int int72 = charSequenceList70.size();
        boolean boolean73 = charSequenceList64.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70);
        int int75 = charSequenceList64.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean76 = charSequenceList49.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList80 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80, charSequenceArray79);
        java.lang.Object[] objArray82 = charSequenceList80.toArray();
        boolean boolean83 = charSequenceList64.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80);
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList87 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList87, charSequenceArray86);
        java.lang.Object[] objArray89 = charSequenceList87.toArray();
        boolean boolean90 = charSequenceList80.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList87);
        boolean boolean91 = charSequenceList36.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80);
        boolean boolean93 = charSequenceList80.remove((java.lang.Object) (-100));
        boolean boolean94 = charSequenceList30.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList95 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList30);
        int int96 = charSequenceList3.indexOf((java.lang.Object) charSequenceList95);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test537");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        java.lang.Object[] objArray10 = charSequenceList8.toArray();
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        int int16 = charSequenceList14.size();
        boolean boolean17 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        int int19 = charSequenceList8.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.Object[] objArray25 = charSequenceList23.toArray();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29, charSequenceArray28);
        int int31 = charSequenceList29.size();
        boolean boolean32 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int34 = charSequenceList23.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean35 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList39 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39, charSequenceArray38);
        java.lang.Object[] objArray41 = charSequenceList39.toArray();
        boolean boolean42 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList46 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        java.lang.Object[] objArray48 = charSequenceList46.toArray();
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52, charSequenceArray51);
        int int54 = charSequenceList52.size();
        boolean boolean55 = charSequenceList46.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean57 = charSequenceList52.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList58 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean59 = charSequenceList52.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63, charSequenceArray62);
        int int65 = charSequenceList63.size();
        boolean boolean67 = charSequenceList63.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList70 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70, charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList75 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75, charSequenceArray74);
        boolean boolean77 = charSequenceList70.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        int int78 = charSequenceList63.indexOf((java.lang.Object) charSequenceList75);
        int int79 = charSequenceList58.lastIndexOf((java.lang.Object) charSequenceList63);
        boolean boolean80 = charSequenceList23.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        boolean boolean81 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        int int82 = charSequenceList0.size();
        boolean boolean83 = charSequenceList0.isEmpty();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test538");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean9 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        java.util.List<java.lang.CharSequence> charSequenceList12 = charSequenceList7.subList((int) (short) 0, (int) (byte) 1);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence16 = charSequenceList13.set((-1), (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test539");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        java.lang.Object[] objArray4 = charSequenceList0.toArray();
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        boolean boolean14 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean15 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList19 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        java.lang.Object[] objArray21 = charSequenceList19.toArray();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        int int27 = charSequenceList25.size();
        boolean boolean28 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean30 = charSequenceList25.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean32 = charSequenceList25.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        boolean boolean34 = charSequenceList0.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence37 = charSequenceList0.set((-6), (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test540");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray1 = charSequenceList0.toArray();
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList4 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4, charSequenceArray3);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        boolean boolean11 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21, charSequenceArray20);
        charSequenceList21.clear();
        boolean boolean24 = charSequenceList15.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        boolean boolean25 = charSequenceList9.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList29 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29, charSequenceArray28);
        java.lang.Object[] objArray31 = charSequenceList29.toArray();
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList35 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        int int37 = charSequenceList35.size();
        boolean boolean38 = charSequenceList29.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean40 = charSequenceList35.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean41 = charSequenceList15.equals((java.lang.Object) boolean40);
        boolean boolean43 = charSequenceList15.add((java.lang.CharSequence) "");
        boolean boolean44 = charSequenceList0.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList47 = charSequenceList15.subList(0, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-8)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test541");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.lang.Object[] objArray11 = charSequenceList9.toArray();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        boolean boolean18 = charSequenceList9.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList22 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        java.lang.Object[] objArray24 = charSequenceList22.toArray();
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        int int30 = charSequenceList28.size();
        boolean boolean31 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        int int33 = charSequenceList22.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        java.lang.Object[] objArray39 = charSequenceList37.toArray();
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList43 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43, charSequenceArray42);
        int int45 = charSequenceList43.size();
        boolean boolean46 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        int int48 = charSequenceList37.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean49 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList53 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        java.lang.Object[] objArray55 = charSequenceList53.toArray();
        boolean boolean56 = charSequenceList37.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList60 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60, charSequenceArray59);
        java.lang.Object[] objArray62 = charSequenceList60.toArray();
        boolean boolean63 = charSequenceList53.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60);
        boolean boolean64 = charSequenceList9.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        boolean boolean66 = charSequenceList53.remove((java.lang.Object) (-100));
        boolean boolean67 = charSequenceList3.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList68 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList72 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList72, charSequenceArray71);
        int int74 = charSequenceList72.size();
        boolean boolean76 = charSequenceList72.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList79 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList79, charSequenceArray78);
        java.lang.CharSequence[] charSequenceArray83 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList84 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList84, charSequenceArray83);
        boolean boolean86 = charSequenceList79.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList84);
        int int87 = charSequenceList72.indexOf((java.lang.Object) charSequenceList84);
        boolean boolean88 = charSequenceList3.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList84);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test542");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.lang.Object[] objArray20 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        int int26 = charSequenceList24.size();
        boolean boolean27 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean30 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList34 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        java.lang.Object[] objArray36 = charSequenceList34.toArray();
        boolean boolean37 = charSequenceList18.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34);
        int int39 = charSequenceList18.lastIndexOf((java.lang.Object) 0.0d);
        boolean boolean41 = charSequenceList18.remove((java.lang.Object) 100.0f);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList45 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        int int47 = charSequenceList45.size();
        boolean boolean49 = charSequenceList45.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList53 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        java.lang.Object[] objArray55 = charSequenceList53.toArray();
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList59 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59, charSequenceArray58);
        int int61 = charSequenceList59.size();
        boolean boolean62 = charSequenceList53.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean64 = charSequenceList59.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        boolean boolean65 = charSequenceList45.equals((java.lang.Object) charSequenceList63);
        boolean boolean66 = charSequenceList18.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator67 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList18.replaceAll(charSequenceUnaryOperator67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test543");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean17 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int18 = charSequenceList3.indexOf((java.lang.Object) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.equals((java.lang.Object) (byte) 100);
        int int22 = charSequenceList3.lastIndexOf((java.lang.Object) charSequenceList19);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList23 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList19);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean26 = charSequenceList24.contains((java.lang.Object) (byte) 0);
        int int27 = charSequenceList24.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        boolean boolean29 = charSequenceList19.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        java.lang.Object[] objArray30 = charSequenceList19.toArray();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test544");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean17 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int18 = charSequenceList3.indexOf((java.lang.Object) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.equals((java.lang.Object) (byte) 100);
        int int22 = charSequenceList3.lastIndexOf((java.lang.Object) charSequenceList19);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        java.lang.Object[] objArray28 = charSequenceList26.toArray();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        int int34 = charSequenceList32.size();
        boolean boolean35 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList26.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList41 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        java.lang.Object[] objArray43 = charSequenceList41.toArray();
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList47 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47, charSequenceArray46);
        int int49 = charSequenceList47.size();
        boolean boolean50 = charSequenceList41.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        int int52 = charSequenceList41.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean53 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        java.lang.Object[] objArray54 = charSequenceList41.toArray();
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList58 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58, charSequenceArray57);
        java.lang.Object[] objArray60 = charSequenceList58.toArray();
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList64 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64, charSequenceArray63);
        int int66 = charSequenceList64.size();
        boolean boolean67 = charSequenceList58.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        boolean boolean68 = charSequenceList41.equals((java.lang.Object) charSequenceList64);
        boolean boolean69 = charSequenceList19.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        charSequenceList64.clear();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test545");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        java.lang.Object[] objArray18 = charSequenceList16.toArray();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        int int24 = charSequenceList22.size();
        boolean boolean25 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        int int27 = charSequenceList16.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.lang.Object[] objArray33 = charSequenceList31.toArray();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        boolean boolean40 = charSequenceList31.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        int int42 = charSequenceList31.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean43 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList47 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47, charSequenceArray46);
        java.lang.Object[] objArray49 = charSequenceList47.toArray();
        boolean boolean50 = charSequenceList31.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList54 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54, charSequenceArray53);
        java.lang.Object[] objArray56 = charSequenceList54.toArray();
        boolean boolean57 = charSequenceList47.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54);
        boolean boolean58 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        boolean boolean60 = charSequenceList3.remove((java.lang.Object) 100.0f);
        boolean boolean62 = charSequenceList3.remove((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList66 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList66, charSequenceArray65);
        int int68 = charSequenceList66.size();
        boolean boolean70 = charSequenceList66.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList73 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73, charSequenceArray72);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList78 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList78, charSequenceArray77);
        boolean boolean80 = charSequenceList73.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList78);
        int int81 = charSequenceList66.indexOf((java.lang.Object) charSequenceList78);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList82 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean84 = charSequenceList82.equals((java.lang.Object) (byte) 100);
        int int85 = charSequenceList66.lastIndexOf((java.lang.Object) charSequenceList82);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList86 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList66);
        boolean boolean87 = charSequenceList66.isEmpty();
        charSequenceList66.clear();
        charSequenceList66.clear();
        boolean boolean90 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList66);
        int int91 = charSequenceList66.size();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test546");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList4 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList4, charSequenceArray3);
        java.lang.Object[] objArray6 = charSequenceList4.toArray();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        int int12 = charSequenceList10.size();
        boolean boolean13 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10);
        boolean boolean14 = charSequenceList0.contains((java.lang.Object) boolean13);
        boolean boolean15 = charSequenceList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence18 = charSequenceList0.set((int) (byte) 100, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test547");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean17 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int18 = charSequenceList3.indexOf((java.lang.Object) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.equals((java.lang.Object) (byte) 100);
        int int22 = charSequenceList3.lastIndexOf((java.lang.Object) charSequenceList19);
        boolean boolean23 = charSequenceList3.isEmpty();
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27, charSequenceArray26);
        int int29 = charSequenceList27.size();
        charSequenceList27.clear();
        charSequenceList27.clear();
        java.lang.Object[] objArray32 = charSequenceList27.toArray();
        int int33 = charSequenceList3.lastIndexOf((java.lang.Object) objArray32);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test548");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean32 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean35 = charSequenceList33.equals((java.lang.Object) (byte) 100);
        boolean boolean36 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList40 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40, charSequenceArray39);
        java.lang.Object[] objArray42 = charSequenceList40.toArray();
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        int int48 = charSequenceList46.size();
        boolean boolean49 = charSequenceList40.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList50 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean51 = charSequenceList46.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean54 = charSequenceList52.contains((java.lang.Object) (byte) 0);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList55 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray56 = charSequenceList55.toArray();
        DataStructures.AvlTreeList[] avlTreeListArray58 = new DataStructures.AvlTreeList[3];
        @SuppressWarnings("unchecked")
        DataStructures.AvlTreeList<java.lang.CharSequence>[] charSequenceListArray59 = (DataStructures.AvlTreeList<java.lang.CharSequence>[]) avlTreeListArray58;
        charSequenceListArray59[0] = charSequenceList46;
        charSequenceListArray59[1] = charSequenceList52;
        charSequenceListArray59[2] = charSequenceList55;
        DataStructures.AvlTreeList<java.lang.CharSequence>[] charSequenceListArray66 = charSequenceList23.toArray(charSequenceListArray59);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList70 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70, charSequenceArray69);
        int int72 = charSequenceList70.size();
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList75 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75, charSequenceArray74);
        java.lang.CharSequence[] charSequenceArray79 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList80 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80, charSequenceArray79);
        boolean boolean82 = charSequenceList75.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList80);
        boolean boolean83 = charSequenceList70.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        boolean boolean84 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList85 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        int int87 = charSequenceList23.indexOf((java.lang.Object) ' ');
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator88 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList23.replaceAll(charSequenceUnaryOperator88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test549");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) (short) 100);
        boolean boolean9 = charSequenceList3.add((java.lang.CharSequence) "");
        boolean boolean11 = charSequenceList3.contains((java.lang.Object) 1.0d);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        java.lang.CharSequence charSequence18 = charSequenceList15.remove(1);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        int int24 = charSequenceList22.size();
        charSequenceList22.clear();
        boolean boolean26 = charSequenceList15.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        boolean boolean27 = charSequenceList3.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test550");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean15 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        boolean boolean16 = charSequenceList3.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        java.lang.CharSequence charSequence18 = charSequenceList3.get(0);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!" };
        java.lang.String[] strArray23 = charSequenceList3.toArray(strArray22);
        java.lang.CharSequence charSequence25 = charSequenceList3.remove(1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test551");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean1 = charSequenceList0.isEmpty();
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList5 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5, charSequenceArray4);
        java.lang.Object[] objArray7 = charSequenceList5.toArray();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        int int13 = charSequenceList11.size();
        boolean boolean14 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList11.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean18 = charSequenceList11.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean19 = charSequenceList0.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList23 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        int int25 = charSequenceList23.size();
        boolean boolean27 = charSequenceList23.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList30 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList30, charSequenceArray29);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList35 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        boolean boolean37 = charSequenceList30.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35);
        int int38 = charSequenceList23.indexOf((java.lang.Object) charSequenceList35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList42 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        java.lang.Object[] objArray44 = charSequenceList42.toArray();
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList48 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48, charSequenceArray47);
        int int50 = charSequenceList48.size();
        boolean boolean51 = charSequenceList42.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48);
        int int53 = charSequenceList42.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList57 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57, charSequenceArray56);
        java.lang.Object[] objArray59 = charSequenceList57.toArray();
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63, charSequenceArray62);
        int int65 = charSequenceList63.size();
        boolean boolean66 = charSequenceList57.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        int int68 = charSequenceList57.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean69 = charSequenceList42.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList73 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73, charSequenceArray72);
        java.lang.Object[] objArray75 = charSequenceList73.toArray();
        boolean boolean76 = charSequenceList57.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList73);
        int int77 = charSequenceList35.indexOf((java.lang.Object) charSequenceList57);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList78 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean80 = charSequenceList78.contains((java.lang.Object) (byte) 0);
        int int81 = charSequenceList78.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList82 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList78);
        boolean boolean83 = charSequenceList35.remove((java.lang.Object) charSequenceList78);
        charSequenceList78.clear();
        boolean boolean85 = charSequenceList11.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList78);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test552");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean15 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        boolean boolean16 = charSequenceList3.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "hi!" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList20 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        java.lang.CharSequence charSequence23 = charSequenceList20.remove(1);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27, charSequenceArray26);
        int int29 = charSequenceList27.size();
        charSequenceList27.clear();
        boolean boolean31 = charSequenceList20.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean33 = charSequenceList32.isEmpty();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        java.lang.Object[] objArray39 = charSequenceList37.toArray();
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList43 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43, charSequenceArray42);
        int int45 = charSequenceList43.size();
        boolean boolean46 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList47 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean48 = charSequenceList43.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList49 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean50 = charSequenceList43.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49);
        boolean boolean51 = charSequenceList32.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        int int52 = charSequenceList32.size();
        boolean boolean53 = charSequenceList27.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int54 = charSequenceList8.lastIndexOf((java.lang.Object) boolean53);
        java.lang.Object[] objArray55 = charSequenceList8.toArray();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test553");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean17 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int18 = charSequenceList3.indexOf((java.lang.Object) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.equals((java.lang.Object) (byte) 100);
        int int22 = charSequenceList3.lastIndexOf((java.lang.Object) charSequenceList19);
        java.lang.Object obj23 = null;
        int int24 = charSequenceList3.lastIndexOf(obj23);
        java.lang.Object[] objArray25 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "hi!" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29, charSequenceArray28);
        java.lang.CharSequence charSequence32 = charSequenceList29.remove(1);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList36 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        int int38 = charSequenceList36.size();
        charSequenceList36.clear();
        boolean boolean40 = charSequenceList29.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList44 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray47 = charSequenceList46.toArray();
        int int48 = charSequenceList44.indexOf((java.lang.Object) objArray47);
        boolean boolean49 = charSequenceList29.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        boolean boolean50 = charSequenceList3.remove((java.lang.Object) charSequenceList44);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList54 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54, charSequenceArray53);
        int int56 = charSequenceList54.size();
        boolean boolean58 = charSequenceList54.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList61 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61, charSequenceArray60);
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList66 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList66, charSequenceArray65);
        boolean boolean68 = charSequenceList61.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList66);
        int int69 = charSequenceList54.indexOf((java.lang.Object) charSequenceList66);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList70 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean72 = charSequenceList70.equals((java.lang.Object) (byte) 100);
        int int73 = charSequenceList54.lastIndexOf((java.lang.Object) charSequenceList70);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList74 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList70);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList75 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean77 = charSequenceList75.contains((java.lang.Object) (byte) 0);
        int int78 = charSequenceList75.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList79 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        boolean boolean80 = charSequenceList70.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        int int81 = charSequenceList70.size();
        boolean boolean82 = charSequenceList70.isEmpty();
        boolean boolean83 = charSequenceList3.contains((java.lang.Object) boolean82);
        charSequenceList3.clear();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test554");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean32 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean34 = charSequenceList23.contains((java.lang.Object) 100.0f);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        java.lang.Object[] objArray40 = charSequenceList38.toArray();
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        int int46 = charSequenceList44.size();
        boolean boolean47 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int49 = charSequenceList38.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList53 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        java.lang.Object[] objArray55 = charSequenceList53.toArray();
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList59 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59, charSequenceArray58);
        int int61 = charSequenceList59.size();
        boolean boolean62 = charSequenceList53.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59);
        int int64 = charSequenceList53.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean65 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        java.lang.Object[] objArray66 = charSequenceList53.toArray();
        boolean boolean67 = charSequenceList23.equals((java.lang.Object) objArray66);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test555");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean15 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        boolean boolean16 = charSequenceList3.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence18 = charSequenceList3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test556");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList4 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        java.lang.Object[] objArray10 = charSequenceList8.toArray();
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        int int16 = charSequenceList14.size();
        boolean boolean17 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        int int19 = charSequenceList8.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.Object[] objArray25 = charSequenceList23.toArray();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29, charSequenceArray28);
        int int31 = charSequenceList29.size();
        boolean boolean32 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int34 = charSequenceList23.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean35 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList39 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39, charSequenceArray38);
        java.lang.Object[] objArray41 = charSequenceList39.toArray();
        boolean boolean42 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList46 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        java.lang.Object[] objArray48 = charSequenceList46.toArray();
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52, charSequenceArray51);
        int int54 = charSequenceList52.size();
        boolean boolean55 = charSequenceList46.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean57 = charSequenceList52.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList58 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean59 = charSequenceList52.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList63 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63, charSequenceArray62);
        int int65 = charSequenceList63.size();
        boolean boolean67 = charSequenceList63.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList70 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70, charSequenceArray69);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList75 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75, charSequenceArray74);
        boolean boolean77 = charSequenceList70.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        int int78 = charSequenceList63.indexOf((java.lang.Object) charSequenceList75);
        int int79 = charSequenceList58.lastIndexOf((java.lang.Object) charSequenceList63);
        boolean boolean80 = charSequenceList23.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList63);
        boolean boolean81 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        int int82 = charSequenceList0.size();
        boolean boolean84 = charSequenceList0.add((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test557");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean32 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList36 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        java.lang.Object[] objArray38 = charSequenceList36.toArray();
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList42 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        int int44 = charSequenceList42.size();
        boolean boolean45 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        int int47 = charSequenceList36.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList51 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51, charSequenceArray50);
        java.lang.Object[] objArray53 = charSequenceList51.toArray();
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList57 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57, charSequenceArray56);
        int int59 = charSequenceList57.size();
        boolean boolean60 = charSequenceList51.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        int int62 = charSequenceList51.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean63 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        boolean boolean64 = charSequenceList3.remove((java.lang.Object) charSequenceList36);
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList67 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList67, charSequenceArray66);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList72 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList72, charSequenceArray71);
        boolean boolean74 = charSequenceList67.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList72);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList78 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList78, charSequenceArray77);
        int int80 = charSequenceList78.size();
        boolean boolean82 = charSequenceList78.equals((java.lang.Object) (short) 100);
        boolean boolean84 = charSequenceList78.add((java.lang.CharSequence) "hi!");
        boolean boolean85 = charSequenceList67.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList78);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList86 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList78);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList87 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList86);
        java.lang.Object[] objArray88 = charSequenceList86.toArray();
        boolean boolean89 = charSequenceList36.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList86);
        java.lang.CharSequence charSequence91 = charSequenceList86.remove((int) (short) 1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test558");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        java.lang.Object[] objArray4 = charSequenceList0.toArray();
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        boolean boolean14 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean15 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence17 = charSequenceList0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test559");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.contains((java.lang.Object) (byte) 0);
        int int3 = charSequenceList0.size();
        java.lang.Object[] objArray4 = charSequenceList0.toArray();
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        boolean boolean14 = charSequenceList7.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean15 = charSequenceList0.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        boolean boolean25 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean26 = charSequenceList23.isEmpty();
        boolean boolean27 = charSequenceList0.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        int int34 = charSequenceList32.size();
        boolean boolean36 = charSequenceList32.equals((java.lang.Object) 0L);
        java.lang.Object[] objArray37 = charSequenceList32.toArray();
        boolean boolean38 = charSequenceList23.addAll((int) (byte) 0, (java.util.Collection<java.lang.CharSequence>) charSequenceList32);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test560");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean17 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int18 = charSequenceList3.indexOf((java.lang.Object) charSequenceList15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList22 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        java.lang.Object[] objArray24 = charSequenceList22.toArray();
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList28 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        int int30 = charSequenceList28.size();
        boolean boolean31 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        int int33 = charSequenceList22.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        java.lang.Object[] objArray39 = charSequenceList37.toArray();
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList43 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43, charSequenceArray42);
        int int45 = charSequenceList43.size();
        boolean boolean46 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        int int48 = charSequenceList37.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean49 = charSequenceList22.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList53 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        java.lang.Object[] objArray55 = charSequenceList53.toArray();
        boolean boolean56 = charSequenceList37.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        int int57 = charSequenceList15.indexOf((java.lang.Object) charSequenceList37);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList58 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test561");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        charSequenceList3.clear();
        int int9 = charSequenceList3.size();
        charSequenceList3.clear();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test562");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        java.lang.Object[] objArray18 = charSequenceList16.toArray();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22, charSequenceArray21);
        int int24 = charSequenceList22.size();
        boolean boolean25 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
        int int27 = charSequenceList16.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.lang.Object[] objArray33 = charSequenceList31.toArray();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList37 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        boolean boolean40 = charSequenceList31.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37);
        int int42 = charSequenceList31.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean43 = charSequenceList16.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList47 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47, charSequenceArray46);
        java.lang.Object[] objArray49 = charSequenceList47.toArray();
        boolean boolean50 = charSequenceList31.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList54 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54, charSequenceArray53);
        java.lang.Object[] objArray56 = charSequenceList54.toArray();
        boolean boolean57 = charSequenceList47.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54);
        boolean boolean58 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList62 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62, charSequenceArray61);
        java.lang.Object[] objArray64 = charSequenceList62.toArray();
        java.lang.CharSequence[] charSequenceArray67 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList68 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68, charSequenceArray67);
        int int70 = charSequenceList68.size();
        boolean boolean71 = charSequenceList62.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList68);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList72 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean73 = charSequenceList68.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList72);
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList77 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList77, charSequenceArray76);
        int int79 = charSequenceList77.size();
        java.lang.CharSequence[] charSequenceArray81 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList82 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList82, charSequenceArray81);
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList87 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList87, charSequenceArray86);
        boolean boolean89 = charSequenceList82.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList87);
        boolean boolean90 = charSequenceList77.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList82);
        java.lang.CharSequence charSequence92 = charSequenceList77.get(0);
        boolean boolean93 = charSequenceList72.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList77);
        boolean boolean94 = charSequenceList3.remove((java.lang.Object) charSequenceList72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence96 = charSequenceList72.remove(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test563");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        charSequenceList9.clear();
        boolean boolean12 = charSequenceList3.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        int int18 = charSequenceList16.size();
        boolean boolean20 = charSequenceList16.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        int int31 = charSequenceList16.indexOf((java.lang.Object) charSequenceList28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList35 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        java.lang.Object[] objArray37 = charSequenceList35.toArray();
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList41 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        int int43 = charSequenceList41.size();
        boolean boolean44 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        int int46 = charSequenceList35.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList50 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50, charSequenceArray49);
        java.lang.Object[] objArray52 = charSequenceList50.toArray();
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList56 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        int int58 = charSequenceList56.size();
        boolean boolean59 = charSequenceList50.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56);
        int int61 = charSequenceList50.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean62 = charSequenceList35.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList50);
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList66 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList66, charSequenceArray65);
        java.lang.Object[] objArray68 = charSequenceList66.toArray();
        boolean boolean69 = charSequenceList50.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList66);
        int int70 = charSequenceList28.indexOf((java.lang.Object) charSequenceList50);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList71 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean73 = charSequenceList71.contains((java.lang.Object) (byte) 0);
        int int74 = charSequenceList71.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList75 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList71);
        boolean boolean76 = charSequenceList28.remove((java.lang.Object) charSequenceList71);
        charSequenceList71.clear();
        int int78 = charSequenceList3.indexOf((java.lang.Object) charSequenceList71);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test564");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean2 = charSequenceList0.equals((java.lang.Object) (short) -1);
        boolean boolean4 = charSequenceList0.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        java.lang.Object[] objArray10 = charSequenceList8.toArray();
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList14 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        int int16 = charSequenceList14.size();
        boolean boolean17 = charSequenceList8.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList21 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21, charSequenceArray20);
        java.lang.Object[] objArray23 = charSequenceList21.toArray();
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27, charSequenceArray26);
        int int29 = charSequenceList27.size();
        boolean boolean30 = charSequenceList21.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27);
        int int32 = charSequenceList21.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList36 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        java.lang.Object[] objArray38 = charSequenceList36.toArray();
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList42 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        int int44 = charSequenceList42.size();
        boolean boolean45 = charSequenceList36.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        int int47 = charSequenceList36.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean48 = charSequenceList21.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList52 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52, charSequenceArray51);
        java.lang.Object[] objArray54 = charSequenceList52.toArray();
        boolean boolean55 = charSequenceList36.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList59 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59, charSequenceArray58);
        java.lang.Object[] objArray61 = charSequenceList59.toArray();
        boolean boolean62 = charSequenceList52.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59);
        boolean boolean63 = charSequenceList8.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        boolean boolean65 = charSequenceList8.add((java.lang.CharSequence) "");
        int int66 = charSequenceList0.indexOf((java.lang.Object) charSequenceList8);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test565");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList11 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        java.lang.Object[] objArray13 = charSequenceList11.toArray();
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        int int19 = charSequenceList17.size();
        boolean boolean20 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        int int22 = charSequenceList11.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        java.lang.Object[] objArray28 = charSequenceList26.toArray();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        int int34 = charSequenceList32.size();
        boolean boolean35 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        int int37 = charSequenceList26.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean38 = charSequenceList11.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList39 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean41 = charSequenceList39.contains((java.lang.Object) (byte) 0);
        boolean boolean42 = charSequenceList26.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        boolean boolean43 = charSequenceList3.remove((java.lang.Object) charSequenceList39);
        java.lang.Object[] objArray44 = charSequenceList39.toArray();
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList48 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48, charSequenceArray47);
        int int50 = charSequenceList48.size();
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList53 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53, charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList58 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58, charSequenceArray57);
        boolean boolean60 = charSequenceList53.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        boolean boolean61 = charSequenceList48.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        java.lang.CharSequence charSequence63 = charSequenceList48.get(0);
        boolean boolean64 = charSequenceList39.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48);
        int int65 = charSequenceList39.size();
        java.lang.Object[] objArray66 = charSequenceList39.toArray();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test566");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean17 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int18 = charSequenceList3.indexOf((java.lang.Object) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.equals((java.lang.Object) (byte) 100);
        int int22 = charSequenceList3.lastIndexOf((java.lang.Object) charSequenceList19);
        java.util.List<java.lang.CharSequence> charSequenceList25 = charSequenceList3.subList(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList28 = charSequenceList3.subList(10, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test567");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray1 = charSequenceList0.toArray();
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList5 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5, charSequenceArray4);
        int int7 = charSequenceList5.size();
        boolean boolean9 = charSequenceList5.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList17 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean19 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        int int20 = charSequenceList5.indexOf((java.lang.Object) charSequenceList17);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean23 = charSequenceList21.equals((java.lang.Object) (byte) 100);
        int int24 = charSequenceList5.lastIndexOf((java.lang.Object) charSequenceList21);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList25 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        boolean boolean26 = charSequenceList0.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList27 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList5);
        charSequenceList27.add(0, (java.lang.CharSequence) "hi!");
        boolean boolean31 = charSequenceList27.isEmpty();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test568");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.Object[] objArray6 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList10 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        int int12 = charSequenceList10.size();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList16 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        charSequenceList16.clear();
        boolean boolean19 = charSequenceList10.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.Object[] objArray25 = charSequenceList23.toArray();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29, charSequenceArray28);
        int int31 = charSequenceList29.size();
        boolean boolean32 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29);
        int int34 = charSequenceList23.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        java.lang.Object[] objArray40 = charSequenceList38.toArray();
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList44 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        int int46 = charSequenceList44.size();
        boolean boolean47 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        int int49 = charSequenceList38.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean50 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        java.lang.Object[] objArray51 = charSequenceList38.toArray();
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList55 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        java.lang.Object[] objArray57 = charSequenceList55.toArray();
        java.lang.CharSequence[] charSequenceArray60 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList61 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61, charSequenceArray60);
        int int63 = charSequenceList61.size();
        boolean boolean64 = charSequenceList55.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList65 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean66 = charSequenceList61.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList67 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean68 = charSequenceList61.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList67);
        boolean boolean69 = charSequenceList38.remove((java.lang.Object) charSequenceList67);
        boolean boolean70 = charSequenceList10.equals((java.lang.Object) charSequenceList67);
        java.util.ArrayList[] arrayListArray72 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.CharSequence>[] charSequenceListArray73 = (java.util.ArrayList<java.lang.CharSequence>[]) arrayListArray72;
        java.util.ArrayList<java.lang.CharSequence>[] charSequenceListArray74 = charSequenceList10.toArray((java.util.ArrayList<java.lang.CharSequence>[]) arrayListArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.util.RandomAccess[] randomAccessArray75 = charSequenceList3.toArray((java.util.RandomAccess[]) charSequenceListArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
        // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test569");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean9 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        int int15 = charSequenceList13.size();
        boolean boolean17 = charSequenceList13.equals((java.lang.Object) (short) 100);
        boolean boolean19 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.lang.Object[] objArray27 = charSequenceList25.toArray();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList31 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        int int33 = charSequenceList31.size();
        boolean boolean34 = charSequenceList25.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31);
        int int36 = charSequenceList25.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList40 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40, charSequenceArray39);
        java.lang.Object[] objArray42 = charSequenceList40.toArray();
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList46 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        int int48 = charSequenceList46.size();
        boolean boolean49 = charSequenceList40.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        int int51 = charSequenceList40.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean52 = charSequenceList25.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList56 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        java.lang.Object[] objArray58 = charSequenceList56.toArray();
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList62 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62, charSequenceArray61);
        int int64 = charSequenceList62.size();
        boolean boolean65 = charSequenceList56.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62);
        int int67 = charSequenceList56.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList71 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList71, charSequenceArray70);
        int int73 = charSequenceList71.size();
        java.lang.CharSequence[] charSequenceArray75 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList76 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76, charSequenceArray75);
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList81 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        boolean boolean83 = charSequenceList76.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        boolean boolean84 = charSequenceList71.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76);
        boolean boolean85 = charSequenceList56.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList76);
        boolean boolean86 = charSequenceList40.equals((java.lang.Object) charSequenceList56);
        boolean boolean87 = charSequenceList21.equals((java.lang.Object) boolean86);
        java.lang.CharSequence charSequence90 = charSequenceList21.set((int) (byte) 1, (java.lang.CharSequence) "");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test570");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean9 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        int int15 = charSequenceList13.size();
        boolean boolean17 = charSequenceList13.equals((java.lang.Object) (short) 100);
        boolean boolean19 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        java.lang.Object[] objArray23 = charSequenceList21.toArray();
        java.lang.Object obj24 = null;
        int int25 = charSequenceList21.indexOf(obj24);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test571");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.lang.Object[] objArray20 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        int int26 = charSequenceList24.size();
        boolean boolean27 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean30 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList34 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList34, charSequenceArray33);
        java.lang.Object[] objArray36 = charSequenceList34.toArray();
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList40 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40, charSequenceArray39);
        int int42 = charSequenceList40.size();
        boolean boolean43 = charSequenceList34.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList40);
        int int45 = charSequenceList34.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList49 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49, charSequenceArray48);
        int int51 = charSequenceList49.size();
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList54 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54, charSequenceArray53);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList59 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59, charSequenceArray58);
        boolean boolean61 = charSequenceList54.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59);
        boolean boolean62 = charSequenceList49.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54);
        boolean boolean63 = charSequenceList34.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54);
        boolean boolean64 = charSequenceList18.equals((java.lang.Object) charSequenceList34);
        java.lang.Object[] objArray65 = charSequenceList18.toArray();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test572");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList3 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        java.lang.Object[] objArray5 = charSequenceList3.toArray();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        int int11 = charSequenceList9.size();
        boolean boolean12 = charSequenceList3.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        int int14 = charSequenceList3.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList18 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        int int20 = charSequenceList18.size();
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList28 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28, charSequenceArray27);
        boolean boolean30 = charSequenceList23.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList28);
        boolean boolean31 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        boolean boolean32 = charSequenceList3.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean35 = charSequenceList33.equals((java.lang.Object) (byte) 100);
        boolean boolean36 = charSequenceList23.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33);
        java.lang.Object[] objArray37 = charSequenceList33.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence40 = charSequenceList33.set(8, (java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test573");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean1 = charSequenceList0.isEmpty();
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList5 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList5, charSequenceArray4);
        java.lang.Object[] objArray7 = charSequenceList5.toArray();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList11 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        int int13 = charSequenceList11.size();
        boolean boolean14 = charSequenceList5.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList15 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean16 = charSequenceList11.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList17 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean18 = charSequenceList11.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        boolean boolean19 = charSequenceList0.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        int int20 = charSequenceList0.size();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList0);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test574");
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList0 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        java.lang.Object[] objArray1 = charSequenceList0.toArray();
        java.lang.Object[] objArray2 = charSequenceList0.toArray();
        boolean boolean3 = charSequenceList0.isEmpty();
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList0.replaceAll(charSequenceUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test575");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        boolean boolean7 = charSequenceList3.equals((java.lang.Object) 0L);
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList10 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList10, charSequenceArray9);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean17 = charSequenceList10.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15);
        int int18 = charSequenceList3.indexOf((java.lang.Object) charSequenceList15);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList19 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean21 = charSequenceList19.equals((java.lang.Object) (byte) 100);
        int int22 = charSequenceList3.lastIndexOf((java.lang.Object) charSequenceList19);
        java.lang.Object obj23 = null;
        int int24 = charSequenceList3.lastIndexOf(obj23);
        java.lang.Object[] objArray25 = charSequenceList3.toArray();
        boolean boolean26 = charSequenceList3.isEmpty();
        boolean boolean27 = charSequenceList3.isEmpty();
        charSequenceList3.clear();
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList29 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList3);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test576");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        boolean boolean9 = charSequenceList2.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7);
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList13 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        int int15 = charSequenceList13.size();
        boolean boolean17 = charSequenceList13.equals((java.lang.Object) (short) 100);
        boolean boolean19 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        boolean boolean20 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList21 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList22 = new DataStructures.AvlTreeList<java.lang.CharSequence>((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        java.lang.Object[] objArray28 = charSequenceList26.toArray();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList32 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        int int34 = charSequenceList32.size();
        boolean boolean35 = charSequenceList26.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList36 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean37 = charSequenceList32.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList38 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean39 = charSequenceList32.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList43 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43, charSequenceArray42);
        java.lang.Object[] objArray45 = charSequenceList43.toArray();
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList49 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49, charSequenceArray48);
        int int51 = charSequenceList49.size();
        boolean boolean52 = charSequenceList43.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49);
        int int54 = charSequenceList43.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList58 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58, charSequenceArray57);
        java.lang.Object[] objArray60 = charSequenceList58.toArray();
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList64 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64, charSequenceArray63);
        int int66 = charSequenceList64.size();
        boolean boolean67 = charSequenceList58.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList64);
        int int69 = charSequenceList58.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean70 = charSequenceList43.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        java.lang.Object[] objArray71 = charSequenceList58.toArray();
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList75 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75, charSequenceArray74);
        java.lang.Object[] objArray77 = charSequenceList75.toArray();
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList81 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        int int83 = charSequenceList81.size();
        boolean boolean84 = charSequenceList75.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList85 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean86 = charSequenceList81.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList85);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList87 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean88 = charSequenceList81.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList87);
        boolean boolean89 = charSequenceList58.remove((java.lang.Object) charSequenceList87);
        boolean boolean90 = charSequenceList32.remove((java.lang.Object) charSequenceList58);
        int int91 = charSequenceList21.lastIndexOf((java.lang.Object) charSequenceList32);
        boolean boolean93 = charSequenceList32.equals((java.lang.Object) 9);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AvlTreeListTester1.test577");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList3 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList3, charSequenceArray2);
        int int5 = charSequenceList3.size();
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList9 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        charSequenceList9.clear();
        boolean boolean12 = charSequenceList3.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        boolean boolean14 = charSequenceList3.contains((java.lang.Object) 2);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.lang.Object[] objArray20 = charSequenceList18.toArray();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList24 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        int int26 = charSequenceList24.size();
        boolean boolean27 = charSequenceList18.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        int int29 = charSequenceList18.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList33 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList33, charSequenceArray32);
        int int35 = charSequenceList33.size();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList43 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43, charSequenceArray42);
        boolean boolean45 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        boolean boolean46 = charSequenceList33.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        boolean boolean47 = charSequenceList18.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList48 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean50 = charSequenceList48.equals((java.lang.Object) (byte) 100);
        boolean boolean51 = charSequenceList38.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48);
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList52 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean54 = charSequenceList52.equals((java.lang.Object) (byte) 100);
        boolean boolean55 = charSequenceList38.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        boolean boolean56 = charSequenceList3.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList52);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList60 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList60, charSequenceArray59);
        java.lang.Object[] objArray62 = charSequenceList60.toArray();
        java.lang.CharSequence[] charSequenceArray65 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList66 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList66, charSequenceArray65);
        int int68 = charSequenceList66.size();
        boolean boolean69 = charSequenceList60.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList66);
        int int71 = charSequenceList60.lastIndexOf((java.lang.Object) 1.0f);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "hi!", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList75 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75, charSequenceArray74);
        java.lang.Object[] objArray77 = charSequenceList75.toArray();
        java.lang.CharSequence[] charSequenceArray80 = new java.lang.CharSequence[] { "", "" };
        DataStructures.AvlTreeList<java.lang.CharSequence> charSequenceList81 = new DataStructures.AvlTreeList<java.lang.CharSequence>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81, charSequenceArray80);
        int int83 = charSequenceList81.size();
        boolean boolean84 = charSequenceList75.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList81);
        int int86 = charSequenceList75.lastIndexOf((java.lang.Object) 1.0f);
        boolean boolean87 = charSequenceList60.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        java.lang.CharSequence[] charSequenceArray90 = new java.lang.CharSequence[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList91 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList91, charSequenceArray90);
        java.lang.Object[] objArray93 = charSequenceList91.toArray();
        boolean boolean94 = charSequenceList75.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList91);
        boolean boolean95 = charSequenceList3.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList75);
        java.lang.CharSequence charSequence96 = null;
        boolean boolean97 = charSequenceList3.add(charSequence96);
    }
}

