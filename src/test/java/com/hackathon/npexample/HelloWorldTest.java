package com.hackathon.npexample;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HelloWorldTest {

    public static boolean debug = false;


    @Test
    public void greet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.greet");
        HelloWorld helloWorld0 = new HelloWorld();
        String str = helloWorld0.greet(null);
        org.junit.Assert.assertEquals("'" + str + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");

    }


    @Test
    public void sortList() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.sortList");
        HelloWorld helloWorld0 = new HelloWorld();
        java.util.List<String> strList = helloWorld0.sortList(null);
        org.junit.Assert.assertNotNull(strList);
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        HelloWorld helloWorld0 = new HelloWorld();
        Class<?> wildcardClass1 = helloWorld0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }


    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        java.util.List<String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<String> strList4 = helloWorld0.sortList(strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        Class<?> wildcardClass3 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        Class<?> wildcardClass5 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        Class<?> wildcardClass5 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        HelloWorld helloWorld0 = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        String str3 = helloWorld1.greet("");
        String[] strArray7 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList8 = new java.util.ArrayList<String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<String>) strList8, strArray7);
        java.util.List<String> strList10 = helloWorld1.sortList((java.util.List<String>) strList8);
        java.util.List<String> strList11 = helloWorld0.sortList(strList10);
        Class<?> wildcardClass12 = strList10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User Name can't be empty" + "'", str3, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        HelloWorld helloWorld4 = new HelloWorld();
        String str6 = helloWorld4.greet("");
        String[] strArray10 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList11 = new java.util.ArrayList<String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<String>) strList11, strArray10);
        java.util.List<String> strList13 = helloWorld4.sortList((java.util.List<String>) strList11);
        java.util.List<String> strList14 = helloWorld3.sortList(strList13);
        java.util.List<String> strList15 = helloWorld0.sortList(strList13);
        HelloWorld helloWorld16 = new HelloWorld();
        String str18 = helloWorld16.greet("");
        HelloWorld helloWorld19 = new HelloWorld();
        HelloWorld helloWorld20 = new HelloWorld();
        String str22 = helloWorld20.greet("");
        String[] strArray26 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList27 = new java.util.ArrayList<String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<String>) strList27, strArray26);
        java.util.List<String> strList29 = helloWorld20.sortList((java.util.List<String>) strList27);
        java.util.List<String> strList30 = helloWorld19.sortList(strList29);
        java.util.List<String> strList31 = helloWorld16.sortList(strList29);
        java.util.List<String> strList32 = helloWorld0.sortList(strList31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User Name can't be empty" + "'", str18, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        HelloWorld helloWorld0 = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        String str3 = helloWorld1.greet("");
        String[] strArray7 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList8 = new java.util.ArrayList<String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<String>) strList8, strArray7);
        java.util.List<String> strList10 = helloWorld1.sortList((java.util.List<String>) strList8);
        java.util.List<String> strList11 = helloWorld0.sortList(strList10);
        Class<?> wildcardClass12 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User Name can't be empty" + "'", str3, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        Class<?> wildcardClass7 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        HelloWorld helloWorld4 = new HelloWorld();
        String str6 = helloWorld4.greet("");
        String[] strArray10 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList11 = new java.util.ArrayList<String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<String>) strList11, strArray10);
        java.util.List<String> strList13 = helloWorld4.sortList((java.util.List<String>) strList11);
        java.util.List<String> strList14 = helloWorld3.sortList(strList13);
        java.util.List<String> strList15 = helloWorld0.sortList(strList13);
        Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str2, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        String str8 = helloWorld0.greet("hi!");
        HelloWorld helloWorld9 = new HelloWorld();
        String str11 = helloWorld9.greet("");
        String str13 = helloWorld9.greet("User Name can't be empty");
        String str15 = helloWorld9.greet("");
        String[] strArray17 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList18 = new java.util.ArrayList<String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<String>) strList18, strArray17);
        java.util.List<String> strList20 = helloWorld9.sortList((java.util.List<String>) strList18);
        java.util.List<String> strList21 = helloWorld0.sortList(strList20);
        Class<?> wildcardClass22 = strList21.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Mr./Ms HI!" + "'", str8, "Hello Mr./Ms HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User Name can't be empty" + "'", str15, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("");
        String[] strArray8 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList9 = new java.util.ArrayList<String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<String>) strList9, strArray8);
        java.util.List<String> strList11 = helloWorld0.sortList((java.util.List<String>) strList9);
        Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        HelloWorld helloWorld0 = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        String str3 = helloWorld1.greet("");
        String[] strArray7 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList8 = new java.util.ArrayList<String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<String>) strList8, strArray7);
        java.util.List<String> strList10 = helloWorld1.sortList((java.util.List<String>) strList8);
        java.util.List<String> strList11 = helloWorld0.sortList(strList10);
        String str13 = helloWorld0.greet("");
        String str15 = helloWorld0.greet("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User Name can't be empty" + "'", str3, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hello Mr./Ms HI!" + "'", str15, "Hello Mr./Ms HI!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        String str8 = helloWorld0.greet("hi!");
        HelloWorld helloWorld9 = new HelloWorld();
        String str11 = helloWorld9.greet("");
        String str13 = helloWorld9.greet("User Name can't be empty");
        String str15 = helloWorld9.greet("");
        String[] strArray17 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList18 = new java.util.ArrayList<String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<String>) strList18, strArray17);
        java.util.List<String> strList20 = helloWorld9.sortList((java.util.List<String>) strList18);
        java.util.List<String> strList21 = helloWorld0.sortList(strList20);
        Class<?> wildcardClass22 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Mr./Ms HI!" + "'", str8, "Hello Mr./Ms HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User Name can't be empty" + "'", str15, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        HelloWorld helloWorld0 = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        String str3 = helloWorld1.greet("");
        String[] strArray7 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList8 = new java.util.ArrayList<String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<String>) strList8, strArray7);
        java.util.List<String> strList10 = helloWorld1.sortList((java.util.List<String>) strList8);
        java.util.List<String> strList11 = helloWorld0.sortList(strList10);
        String str13 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User Name can't be empty" + "'", str3, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("User Name can't be empty");
        String str13 = helloWorld7.greet("");
        String[] strArray15 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList16 = new java.util.ArrayList<String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<String>) strList16, strArray15);
        java.util.List<String> strList18 = helloWorld7.sortList((java.util.List<String>) strList16);
        java.util.List<String> strList19 = helloWorld0.sortList(strList18);
        String str21 = helloWorld0.greet("Hello Mr./Ms HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str11, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hello Mr./Ms HELLO MR./MS HI!" + "'", str21, "Hello Mr./Ms HELLO MR./MS HI!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("");
        HelloWorld helloWorld7 = new HelloWorld();
        HelloWorld helloWorld8 = new HelloWorld();
        String str10 = helloWorld8.greet("");
        String[] strArray14 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList15 = new java.util.ArrayList<String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<String>) strList15, strArray14);
        java.util.List<String> strList17 = helloWorld8.sortList((java.util.List<String>) strList15);
        java.util.List<String> strList18 = helloWorld7.sortList(strList17);
        java.util.List<String> strList19 = helloWorld0.sortList(strList18);
        String str21 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        Class<?> wildcardClass22 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User Name can't be empty" + "'", str10, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str21, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        HelloWorld helloWorld0 = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        String str3 = helloWorld1.greet("");
        String[] strArray7 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList8 = new java.util.ArrayList<String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<String>) strList8, strArray7);
        java.util.List<String> strList10 = helloWorld1.sortList((java.util.List<String>) strList8);
        java.util.List<String> strList11 = helloWorld0.sortList(strList10);
        String str13 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        String str15 = helloWorld0.greet("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User Name can't be empty" + "'", str3, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hello Mr./Ms HI!" + "'", str15, "Hello Mr./Ms HI!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("User Name can't be empty");
        String str13 = helloWorld7.greet("");
        String[] strArray15 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList16 = new java.util.ArrayList<String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<String>) strList16, strArray15);
        java.util.List<String> strList18 = helloWorld7.sortList((java.util.List<String>) strList16);
        java.util.List<String> strList19 = helloWorld0.sortList(strList18);
        HelloWorld helloWorld20 = new HelloWorld();
        String str22 = helloWorld20.greet("");
        HelloWorld helloWorld23 = new HelloWorld();
        HelloWorld helloWorld24 = new HelloWorld();
        String str26 = helloWorld24.greet("");
        String[] strArray30 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList31 = new java.util.ArrayList<String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<String>) strList31, strArray30);
        java.util.List<String> strList33 = helloWorld24.sortList((java.util.List<String>) strList31);
        java.util.List<String> strList34 = helloWorld23.sortList(strList33);
        java.util.List<String> strList35 = helloWorld20.sortList(strList33);
        java.util.List<String> strList36 = helloWorld0.sortList(strList35);
        Class<?> wildcardClass37 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str11, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User Name can't be empty" + "'", str26, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        String str5 = helloWorld3.greet("");
        HelloWorld helloWorld6 = new HelloWorld();
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String[] strArray13 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList14 = new java.util.ArrayList<String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<String>) strList14, strArray13);
        java.util.List<String> strList16 = helloWorld7.sortList((java.util.List<String>) strList14);
        java.util.List<String> strList17 = helloWorld6.sortList(strList16);
        java.util.List<String> strList18 = helloWorld3.sortList(strList16);
        java.util.List<String> strList19 = helloWorld0.sortList(strList16);
        Class<?> wildcardClass20 = strList19.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User Name can't be empty" + "'", str5, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("");
        String str8 = helloWorld0.greet("Hello Mr./Ms HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Mr./Ms HELLO MR./MS HI!" + "'", str8, "Hello Mr./Ms HELLO MR./MS HI!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        String str8 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str8, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        String str5 = helloWorld3.greet("");
        HelloWorld helloWorld6 = new HelloWorld();
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String[] strArray13 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList14 = new java.util.ArrayList<String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<String>) strList14, strArray13);
        java.util.List<String> strList16 = helloWorld7.sortList((java.util.List<String>) strList14);
        java.util.List<String> strList17 = helloWorld6.sortList(strList16);
        java.util.List<String> strList18 = helloWorld3.sortList(strList16);
        java.util.List<String> strList19 = helloWorld0.sortList(strList16);
        HelloWorld helloWorld20 = new HelloWorld();
        String str22 = helloWorld20.greet("");
        String str24 = helloWorld20.greet("");
        String str26 = helloWorld20.greet("");
        HelloWorld helloWorld27 = new HelloWorld();
        String str29 = helloWorld27.greet("");
        String str31 = helloWorld27.greet("User Name can't be empty");
        String str33 = helloWorld27.greet("");
        String[] strArray35 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList36 = new java.util.ArrayList<String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<String>) strList36, strArray35);
        java.util.List<String> strList38 = helloWorld27.sortList((java.util.List<String>) strList36);
        java.util.List<String> strList39 = helloWorld20.sortList(strList38);
        HelloWorld helloWorld40 = new HelloWorld();
        String str42 = helloWorld40.greet("");
        HelloWorld helloWorld43 = new HelloWorld();
        HelloWorld helloWorld44 = new HelloWorld();
        String str46 = helloWorld44.greet("");
        String[] strArray50 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList51 = new java.util.ArrayList<String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<String>) strList51, strArray50);
        java.util.List<String> strList53 = helloWorld44.sortList((java.util.List<String>) strList51);
        java.util.List<String> strList54 = helloWorld43.sortList(strList53);
        java.util.List<String> strList55 = helloWorld40.sortList(strList53);
        java.util.List<String> strList56 = helloWorld20.sortList(strList55);
        java.util.List<String> strList57 = helloWorld0.sortList(strList56);
        Class<?> wildcardClass58 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User Name can't be empty" + "'", str5, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "User Name can't be empty" + "'", str24, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User Name can't be empty" + "'", str26, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "User Name can't be empty" + "'", str29, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str31, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "User Name can't be empty" + "'", str33, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User Name can't be empty" + "'", str42, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "User Name can't be empty" + "'", str46, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String[] strArray6 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList7 = new java.util.ArrayList<String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<String>) strList7, strArray6);
        java.util.List<String> strList9 = helloWorld0.sortList((java.util.List<String>) strList7);
        Class<?> wildcardClass10 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        HelloWorld helloWorld4 = new HelloWorld();
        String str6 = helloWorld4.greet("");
        String[] strArray10 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList11 = new java.util.ArrayList<String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<String>) strList11, strArray10);
        java.util.List<String> strList13 = helloWorld4.sortList((java.util.List<String>) strList11);
        java.util.List<String> strList14 = helloWorld3.sortList(strList13);
        java.util.List<String> strList15 = helloWorld0.sortList(strList13);
        HelloWorld helloWorld16 = new HelloWorld();
        String str18 = helloWorld16.greet("");
        String str20 = helloWorld16.greet("User Name can't be empty");
        String str22 = helloWorld16.greet("");
        String[] strArray24 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList25 = new java.util.ArrayList<String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<String>) strList25, strArray24);
        java.util.List<String> strList27 = helloWorld16.sortList((java.util.List<String>) strList25);
        java.util.List<String> strList28 = helloWorld0.sortList(strList27);
        String str30 = helloWorld0.greet("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User Name can't be empty" + "'", str18, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str20, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User Name can't be empty" + "'", str30, "User Name can't be empty");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        HelloWorld helloWorld8 = new HelloWorld();
        String str10 = helloWorld8.greet("");
        String[] strArray14 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList15 = new java.util.ArrayList<String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<String>) strList15, strArray14);
        java.util.List<String> strList17 = helloWorld8.sortList((java.util.List<String>) strList15);
        java.util.List<String> strList18 = helloWorld7.sortList(strList17);
        java.util.List<String> strList19 = helloWorld0.sortList(strList17);
        HelloWorld helloWorld20 = new HelloWorld();
        String str22 = helloWorld20.greet("");
        String str24 = helloWorld20.greet("");
        String str26 = helloWorld20.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld27 = new HelloWorld();
        String str29 = helloWorld27.greet("");
        String str31 = helloWorld27.greet("");
        String str33 = helloWorld27.greet("");
        HelloWorld helloWorld34 = new HelloWorld();
        String str36 = helloWorld34.greet("");
        String str38 = helloWorld34.greet("User Name can't be empty");
        String str40 = helloWorld34.greet("");
        String[] strArray42 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList43 = new java.util.ArrayList<String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<String>) strList43, strArray42);
        java.util.List<String> strList45 = helloWorld34.sortList((java.util.List<String>) strList43);
        java.util.List<String> strList46 = helloWorld27.sortList(strList45);
        java.util.List<String> strList47 = helloWorld20.sortList(strList46);
        String str49 = helloWorld20.greet("User Name can't be empty");
        HelloWorld helloWorld50 = new HelloWorld();
        HelloWorld helloWorld51 = new HelloWorld();
        String str53 = helloWorld51.greet("");
        String[] strArray57 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList58 = new java.util.ArrayList<String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<String>) strList58, strArray57);
        java.util.List<String> strList60 = helloWorld51.sortList((java.util.List<String>) strList58);
        java.util.List<String> strList61 = helloWorld50.sortList(strList60);
        java.util.List<String> strList62 = helloWorld20.sortList(strList61);
        java.util.List<String> strList63 = helloWorld0.sortList(strList61);
        String str65 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User Name can't be empty" + "'", str10, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "User Name can't be empty" + "'", str24, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str26, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "User Name can't be empty" + "'", str29, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "User Name can't be empty" + "'", str31, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "User Name can't be empty" + "'", str33, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User Name can't be empty" + "'", str36, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str38, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "User Name can't be empty" + "'", str40, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str49, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "User Name can't be empty" + "'", str53, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HI!" + "'", str65, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HI!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        String str5 = helloWorld3.greet("");
        HelloWorld helloWorld6 = new HelloWorld();
        String str8 = helloWorld6.greet("");
        HelloWorld helloWorld9 = new HelloWorld();
        HelloWorld helloWorld10 = new HelloWorld();
        String str12 = helloWorld10.greet("");
        String[] strArray16 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList17 = new java.util.ArrayList<String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<String>) strList17, strArray16);
        java.util.List<String> strList19 = helloWorld10.sortList((java.util.List<String>) strList17);
        java.util.List<String> strList20 = helloWorld9.sortList(strList19);
        java.util.List<String> strList21 = helloWorld6.sortList(strList19);
        java.util.List<String> strList22 = helloWorld3.sortList(strList19);
        java.util.List<String> strList23 = helloWorld0.sortList(strList22);
        Class<?> wildcardClass24 = strList23.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User Name can't be empty" + "'", str5, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User Name can't be empty" + "'", str8, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User Name can't be empty" + "'", str12, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        String str8 = helloWorld0.greet("hi!");
        HelloWorld helloWorld9 = new HelloWorld();
        String str11 = helloWorld9.greet("");
        String str13 = helloWorld9.greet("User Name can't be empty");
        String str15 = helloWorld9.greet("");
        String[] strArray17 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList18 = new java.util.ArrayList<String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<String>) strList18, strArray17);
        java.util.List<String> strList20 = helloWorld9.sortList((java.util.List<String>) strList18);
        java.util.List<String> strList21 = helloWorld0.sortList(strList20);
        String str23 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        String str25 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        String str27 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Mr./Ms HI!" + "'", str8, "Hello Mr./Ms HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User Name can't be empty" + "'", str15, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str23, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str25, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str27, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        HelloWorld helloWorld4 = new HelloWorld();
        String str6 = helloWorld4.greet("");
        String[] strArray10 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList11 = new java.util.ArrayList<String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<String>) strList11, strArray10);
        java.util.List<String> strList13 = helloWorld4.sortList((java.util.List<String>) strList11);
        java.util.List<String> strList14 = helloWorld3.sortList(strList13);
        java.util.List<String> strList15 = helloWorld0.sortList(strList13);
        HelloWorld helloWorld16 = new HelloWorld();
        String str18 = helloWorld16.greet("");
        String str20 = helloWorld16.greet("User Name can't be empty");
        String str22 = helloWorld16.greet("");
        String[] strArray24 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList25 = new java.util.ArrayList<String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<String>) strList25, strArray24);
        java.util.List<String> strList27 = helloWorld16.sortList((java.util.List<String>) strList25);
        java.util.List<String> strList28 = helloWorld0.sortList(strList27);
        Class<?> wildcardClass29 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User Name can't be empty" + "'", str18, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str20, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("");
        String str13 = helloWorld7.greet("");
        HelloWorld helloWorld14 = new HelloWorld();
        String str16 = helloWorld14.greet("");
        String str18 = helloWorld14.greet("User Name can't be empty");
        String str20 = helloWorld14.greet("");
        String[] strArray22 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList23 = new java.util.ArrayList<String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<String>) strList23, strArray22);
        java.util.List<String> strList25 = helloWorld14.sortList((java.util.List<String>) strList23);
        java.util.List<String> strList26 = helloWorld7.sortList(strList25);
        java.util.List<String> strList27 = helloWorld0.sortList(strList26);
        HelloWorld helloWorld28 = new HelloWorld();
        String str30 = helloWorld28.greet("");
        HelloWorld helloWorld31 = new HelloWorld();
        String str33 = helloWorld31.greet("");
        HelloWorld helloWorld34 = new HelloWorld();
        HelloWorld helloWorld35 = new HelloWorld();
        String str37 = helloWorld35.greet("");
        String[] strArray41 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList42 = new java.util.ArrayList<String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<String>) strList42, strArray41);
        java.util.List<String> strList44 = helloWorld35.sortList((java.util.List<String>) strList42);
        java.util.List<String> strList45 = helloWorld34.sortList(strList44);
        java.util.List<String> strList46 = helloWorld31.sortList(strList44);
        java.util.List<String> strList47 = helloWorld28.sortList(strList44);
        java.util.List<String> strList48 = helloWorld0.sortList(strList47);
        HelloWorld helloWorld49 = new HelloWorld();
        String str51 = helloWorld49.greet("");
        String str53 = helloWorld49.greet("");
        HelloWorld helloWorld54 = new HelloWorld();
        String str56 = helloWorld54.greet("");
        HelloWorld helloWorld57 = new HelloWorld();
        String str59 = helloWorld57.greet("");
        HelloWorld helloWorld60 = new HelloWorld();
        HelloWorld helloWorld61 = new HelloWorld();
        String str63 = helloWorld61.greet("");
        String[] strArray67 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList68 = new java.util.ArrayList<String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<String>) strList68, strArray67);
        java.util.List<String> strList70 = helloWorld61.sortList((java.util.List<String>) strList68);
        java.util.List<String> strList71 = helloWorld60.sortList(strList70);
        java.util.List<String> strList72 = helloWorld57.sortList(strList70);
        java.util.List<String> strList73 = helloWorld54.sortList(strList70);
        java.util.List<String> strList74 = helloWorld49.sortList(strList70);
        java.util.List<String> strList75 = helloWorld0.sortList(strList70);
        Class<?> wildcardClass76 = strList70.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User Name can't be empty" + "'", str16, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str18, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User Name can't be empty" + "'", str20, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User Name can't be empty" + "'", str30, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "User Name can't be empty" + "'", str33, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "User Name can't be empty" + "'", str37, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "User Name can't be empty" + "'", str51, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "User Name can't be empty" + "'", str53, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "User Name can't be empty" + "'", str56, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "User Name can't be empty" + "'", str59, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "User Name can't be empty" + "'", str63, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("User Name can't be empty");
        String str13 = helloWorld7.greet("");
        String[] strArray15 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList16 = new java.util.ArrayList<String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<String>) strList16, strArray15);
        java.util.List<String> strList18 = helloWorld7.sortList((java.util.List<String>) strList16);
        java.util.List<String> strList19 = helloWorld0.sortList(strList18);
        HelloWorld helloWorld20 = new HelloWorld();
        String str22 = helloWorld20.greet("");
        HelloWorld helloWorld23 = new HelloWorld();
        HelloWorld helloWorld24 = new HelloWorld();
        String str26 = helloWorld24.greet("");
        String[] strArray30 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList31 = new java.util.ArrayList<String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<String>) strList31, strArray30);
        java.util.List<String> strList33 = helloWorld24.sortList((java.util.List<String>) strList31);
        java.util.List<String> strList34 = helloWorld23.sortList(strList33);
        java.util.List<String> strList35 = helloWorld20.sortList(strList33);
        java.util.List<String> strList36 = helloWorld0.sortList(strList35);
        Class<?> wildcardClass37 = strList35.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str11, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User Name can't be empty" + "'", str26, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("");
        String str13 = helloWorld7.greet("");
        HelloWorld helloWorld14 = new HelloWorld();
        String str16 = helloWorld14.greet("");
        String str18 = helloWorld14.greet("User Name can't be empty");
        String str20 = helloWorld14.greet("");
        String[] strArray22 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList23 = new java.util.ArrayList<String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<String>) strList23, strArray22);
        java.util.List<String> strList25 = helloWorld14.sortList((java.util.List<String>) strList23);
        java.util.List<String> strList26 = helloWorld7.sortList(strList25);
        java.util.List<String> strList27 = helloWorld0.sortList(strList26);
        String str29 = helloWorld0.greet("User Name can't be empty");
        String str31 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld32 = new HelloWorld();
        String str34 = helloWorld32.greet("");
        String str36 = helloWorld32.greet("");
        String str38 = helloWorld32.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld39 = new HelloWorld();
        String str41 = helloWorld39.greet("");
        String str43 = helloWorld39.greet("");
        String str45 = helloWorld39.greet("");
        HelloWorld helloWorld46 = new HelloWorld();
        String str48 = helloWorld46.greet("");
        String str50 = helloWorld46.greet("User Name can't be empty");
        String str52 = helloWorld46.greet("");
        String[] strArray54 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList55 = new java.util.ArrayList<String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<String>) strList55, strArray54);
        java.util.List<String> strList57 = helloWorld46.sortList((java.util.List<String>) strList55);
        java.util.List<String> strList58 = helloWorld39.sortList(strList57);
        java.util.List<String> strList59 = helloWorld32.sortList(strList58);
        HelloWorld helloWorld60 = new HelloWorld();
        String str62 = helloWorld60.greet("");
        HelloWorld helloWorld63 = new HelloWorld();
        String str65 = helloWorld63.greet("");
        HelloWorld helloWorld66 = new HelloWorld();
        HelloWorld helloWorld67 = new HelloWorld();
        String str69 = helloWorld67.greet("");
        String[] strArray73 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList74 = new java.util.ArrayList<String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<String>) strList74, strArray73);
        java.util.List<String> strList76 = helloWorld67.sortList((java.util.List<String>) strList74);
        java.util.List<String> strList77 = helloWorld66.sortList(strList76);
        java.util.List<String> strList78 = helloWorld63.sortList(strList76);
        java.util.List<String> strList79 = helloWorld60.sortList(strList76);
        java.util.List<String> strList80 = helloWorld32.sortList(strList79);
        HelloWorld helloWorld81 = new HelloWorld();
        HelloWorld helloWorld82 = new HelloWorld();
        String str84 = helloWorld82.greet("");
        String[] strArray88 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList89 = new java.util.ArrayList<String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<String>) strList89, strArray88);
        java.util.List<String> strList91 = helloWorld82.sortList((java.util.List<String>) strList89);
        java.util.List<String> strList92 = helloWorld81.sortList(strList91);
        java.util.List<String> strList93 = helloWorld32.sortList(strList92);
        java.util.List<String> strList94 = helloWorld0.sortList(strList93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User Name can't be empty" + "'", str16, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str18, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User Name can't be empty" + "'", str20, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str29, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str31, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "User Name can't be empty" + "'", str34, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User Name can't be empty" + "'", str36, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str38, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "User Name can't be empty" + "'", str41, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User Name can't be empty" + "'", str43, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "User Name can't be empty" + "'", str45, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "User Name can't be empty" + "'", str48, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str50, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "User Name can't be empty" + "'", str52, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "User Name can't be empty" + "'", str62, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "User Name can't be empty" + "'", str65, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "User Name can't be empty" + "'", str69, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "User Name can't be empty" + "'", str84, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("");
        String str13 = helloWorld7.greet("");
        HelloWorld helloWorld14 = new HelloWorld();
        String str16 = helloWorld14.greet("");
        String str18 = helloWorld14.greet("User Name can't be empty");
        String str20 = helloWorld14.greet("");
        String[] strArray22 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList23 = new java.util.ArrayList<String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<String>) strList23, strArray22);
        java.util.List<String> strList25 = helloWorld14.sortList((java.util.List<String>) strList23);
        java.util.List<String> strList26 = helloWorld7.sortList(strList25);
        java.util.List<String> strList27 = helloWorld0.sortList(strList26);
        HelloWorld helloWorld28 = new HelloWorld();
        String str30 = helloWorld28.greet("");
        HelloWorld helloWorld31 = new HelloWorld();
        String str33 = helloWorld31.greet("");
        HelloWorld helloWorld34 = new HelloWorld();
        HelloWorld helloWorld35 = new HelloWorld();
        String str37 = helloWorld35.greet("");
        String[] strArray41 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList42 = new java.util.ArrayList<String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<String>) strList42, strArray41);
        java.util.List<String> strList44 = helloWorld35.sortList((java.util.List<String>) strList42);
        java.util.List<String> strList45 = helloWorld34.sortList(strList44);
        java.util.List<String> strList46 = helloWorld31.sortList(strList44);
        java.util.List<String> strList47 = helloWorld28.sortList(strList44);
        java.util.List<String> strList48 = helloWorld0.sortList(strList47);
        String str50 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        String str52 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User Name can't be empty" + "'", str16, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str18, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User Name can't be empty" + "'", str20, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User Name can't be empty" + "'", str30, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "User Name can't be empty" + "'", str33, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "User Name can't be empty" + "'", str37, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str50, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HI!" + "'", str52, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HI!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        String str8 = helloWorld0.greet("");
        String str10 = helloWorld0.greet("");
        HelloWorld helloWorld11 = new HelloWorld();
        String str13 = helloWorld11.greet("");
        HelloWorld helloWorld14 = new HelloWorld();
        String str16 = helloWorld14.greet("");
        HelloWorld helloWorld17 = new HelloWorld();
        String str19 = helloWorld17.greet("");
        HelloWorld helloWorld20 = new HelloWorld();
        HelloWorld helloWorld21 = new HelloWorld();
        String str23 = helloWorld21.greet("");
        String[] strArray27 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList28 = new java.util.ArrayList<String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<String>) strList28, strArray27);
        java.util.List<String> strList30 = helloWorld21.sortList((java.util.List<String>) strList28);
        java.util.List<String> strList31 = helloWorld20.sortList(strList30);
        java.util.List<String> strList32 = helloWorld17.sortList(strList30);
        java.util.List<String> strList33 = helloWorld14.sortList(strList30);
        java.util.List<String> strList34 = helloWorld11.sortList(strList33);
        java.util.List<String> strList35 = helloWorld0.sortList(strList34);
        String str37 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User Name can't be empty" + "'", str8, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User Name can't be empty" + "'", str10, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User Name can't be empty" + "'", str16, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User Name can't be empty" + "'", str19, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User Name can't be empty" + "'", str23, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str37, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("");
        String[] strArray8 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList9 = new java.util.ArrayList<String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<String>) strList9, strArray8);
        java.util.List<String> strList11 = helloWorld0.sortList((java.util.List<String>) strList9);
        String str13 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        HelloWorld helloWorld0 = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        String str3 = helloWorld1.greet("");
        String[] strArray7 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList8 = new java.util.ArrayList<String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<String>) strList8, strArray7);
        java.util.List<String> strList10 = helloWorld1.sortList((java.util.List<String>) strList8);
        java.util.List<String> strList11 = helloWorld0.sortList(strList10);
        String str13 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        String str15 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HI!");
        Class<?> wildcardClass16 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User Name can't be empty" + "'", str3, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HI!" + "'", str15, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HI!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("");
        Class<?> wildcardClass7 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        HelloWorld helloWorld4 = new HelloWorld();
        String str6 = helloWorld4.greet("");
        String[] strArray10 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList11 = new java.util.ArrayList<String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<String>) strList11, strArray10);
        java.util.List<String> strList13 = helloWorld4.sortList((java.util.List<String>) strList11);
        java.util.List<String> strList14 = helloWorld3.sortList(strList13);
        java.util.List<String> strList15 = helloWorld0.sortList(strList13);
        HelloWorld helloWorld16 = new HelloWorld();
        String str18 = helloWorld16.greet("");
        String str20 = helloWorld16.greet("User Name can't be empty");
        String str22 = helloWorld16.greet("");
        String[] strArray24 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList25 = new java.util.ArrayList<String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<String>) strList25, strArray24);
        java.util.List<String> strList27 = helloWorld16.sortList((java.util.List<String>) strList25);
        java.util.List<String> strList28 = helloWorld0.sortList(strList27);
        String str30 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User Name can't be empty" + "'", str18, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str20, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str30, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("");
        String str13 = helloWorld7.greet("");
        HelloWorld helloWorld14 = new HelloWorld();
        String str16 = helloWorld14.greet("");
        String str18 = helloWorld14.greet("User Name can't be empty");
        String str20 = helloWorld14.greet("");
        String[] strArray22 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList23 = new java.util.ArrayList<String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<String>) strList23, strArray22);
        java.util.List<String> strList25 = helloWorld14.sortList((java.util.List<String>) strList23);
        java.util.List<String> strList26 = helloWorld7.sortList(strList25);
        java.util.List<String> strList27 = helloWorld0.sortList(strList26);
        String str29 = helloWorld0.greet("User Name can't be empty");
        HelloWorld helloWorld30 = new HelloWorld();
        HelloWorld helloWorld31 = new HelloWorld();
        String str33 = helloWorld31.greet("");
        String[] strArray37 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList38 = new java.util.ArrayList<String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<String>) strList38, strArray37);
        java.util.List<String> strList40 = helloWorld31.sortList((java.util.List<String>) strList38);
        java.util.List<String> strList41 = helloWorld30.sortList(strList40);
        java.util.List<String> strList42 = helloWorld0.sortList(strList41);
        Class<?> wildcardClass43 = strList42.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User Name can't be empty" + "'", str16, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str18, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User Name can't be empty" + "'", str20, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str29, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "User Name can't be empty" + "'", str33, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("User Name can't be empty");
        String str13 = helloWorld7.greet("");
        String[] strArray15 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList16 = new java.util.ArrayList<String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<String>) strList16, strArray15);
        java.util.List<String> strList18 = helloWorld7.sortList((java.util.List<String>) strList16);
        java.util.List<String> strList19 = helloWorld0.sortList(strList18);
        Class<?> wildcardClass20 = strList18.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str11, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        HelloWorld helloWorld8 = new HelloWorld();
        String str10 = helloWorld8.greet("");
        String[] strArray14 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList15 = new java.util.ArrayList<String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<String>) strList15, strArray14);
        java.util.List<String> strList17 = helloWorld8.sortList((java.util.List<String>) strList15);
        java.util.List<String> strList18 = helloWorld7.sortList(strList17);
        java.util.List<String> strList19 = helloWorld0.sortList(strList17);
        String str21 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        String str23 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User Name can't be empty" + "'", str10, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str21, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str23, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        String str5 = helloWorld3.greet("");
        HelloWorld helloWorld6 = new HelloWorld();
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String[] strArray13 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList14 = new java.util.ArrayList<String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<String>) strList14, strArray13);
        java.util.List<String> strList16 = helloWorld7.sortList((java.util.List<String>) strList14);
        java.util.List<String> strList17 = helloWorld6.sortList(strList16);
        java.util.List<String> strList18 = helloWorld3.sortList(strList16);
        java.util.List<String> strList19 = helloWorld0.sortList(strList16);
        HelloWorld helloWorld20 = new HelloWorld();
        String str22 = helloWorld20.greet("");
        String str24 = helloWorld20.greet("");
        String str26 = helloWorld20.greet("");
        HelloWorld helloWorld27 = new HelloWorld();
        String str29 = helloWorld27.greet("");
        String str31 = helloWorld27.greet("User Name can't be empty");
        String str33 = helloWorld27.greet("");
        String[] strArray35 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList36 = new java.util.ArrayList<String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<String>) strList36, strArray35);
        java.util.List<String> strList38 = helloWorld27.sortList((java.util.List<String>) strList36);
        java.util.List<String> strList39 = helloWorld20.sortList(strList38);
        HelloWorld helloWorld40 = new HelloWorld();
        String str42 = helloWorld40.greet("");
        HelloWorld helloWorld43 = new HelloWorld();
        HelloWorld helloWorld44 = new HelloWorld();
        String str46 = helloWorld44.greet("");
        String[] strArray50 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList51 = new java.util.ArrayList<String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<String>) strList51, strArray50);
        java.util.List<String> strList53 = helloWorld44.sortList((java.util.List<String>) strList51);
        java.util.List<String> strList54 = helloWorld43.sortList(strList53);
        java.util.List<String> strList55 = helloWorld40.sortList(strList53);
        java.util.List<String> strList56 = helloWorld20.sortList(strList55);
        java.util.List<String> strList57 = helloWorld0.sortList(strList56);
        HelloWorld helloWorld58 = new HelloWorld();
        String str60 = helloWorld58.greet("");
        String str62 = helloWorld58.greet("User Name can't be empty");
        String str64 = helloWorld58.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld65 = new HelloWorld();
        String str67 = helloWorld65.greet("");
        String str69 = helloWorld65.greet("User Name can't be empty");
        String str71 = helloWorld65.greet("");
        String[] strArray73 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList74 = new java.util.ArrayList<String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<String>) strList74, strArray73);
        java.util.List<String> strList76 = helloWorld65.sortList((java.util.List<String>) strList74);
        java.util.List<String> strList77 = helloWorld58.sortList((java.util.List<String>) strList74);
        java.util.List<String> strList78 = helloWorld0.sortList((java.util.List<String>) strList74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User Name can't be empty" + "'", str5, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "User Name can't be empty" + "'", str24, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User Name can't be empty" + "'", str26, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "User Name can't be empty" + "'", str29, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str31, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "User Name can't be empty" + "'", str33, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "User Name can't be empty" + "'", str42, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "User Name can't be empty" + "'", str46, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "User Name can't be empty" + "'", str60, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str62, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str64, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "User Name can't be empty" + "'", str67, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str69, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "User Name can't be empty" + "'", str71, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        HelloWorld helloWorld3 = new HelloWorld();
        HelloWorld helloWorld4 = new HelloWorld();
        String str6 = helloWorld4.greet("");
        String[] strArray10 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList11 = new java.util.ArrayList<String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<String>) strList11, strArray10);
        java.util.List<String> strList13 = helloWorld4.sortList((java.util.List<String>) strList11);
        java.util.List<String> strList14 = helloWorld3.sortList(strList13);
        java.util.List<String> strList15 = helloWorld0.sortList(strList13);
        HelloWorld helloWorld16 = new HelloWorld();
        String str18 = helloWorld16.greet("");
        String str20 = helloWorld16.greet("User Name can't be empty");
        String str22 = helloWorld16.greet("");
        String[] strArray24 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList25 = new java.util.ArrayList<String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<String>) strList25, strArray24);
        java.util.List<String> strList27 = helloWorld16.sortList((java.util.List<String>) strList25);
        java.util.List<String> strList28 = helloWorld0.sortList(strList27);
        String str30 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        Class<?> wildcardClass31 = helloWorld0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User Name can't be empty" + "'", str18, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str20, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str30, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("User Name can't be empty");
        String str13 = helloWorld7.greet("");
        String[] strArray15 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList16 = new java.util.ArrayList<String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<String>) strList16, strArray15);
        java.util.List<String> strList18 = helloWorld7.sortList((java.util.List<String>) strList16);
        java.util.List<String> strList19 = helloWorld0.sortList((java.util.List<String>) strList16);
        Class<?> wildcardClass20 = strList16.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str11, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String[] strArray6 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList7 = new java.util.ArrayList<String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<String>) strList7, strArray6);
        java.util.List<String> strList9 = helloWorld0.sortList((java.util.List<String>) strList7);
        String str11 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        java.util.List<String> strList12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<String> strList13 = helloWorld0.sortList(strList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str11, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("");
        HelloWorld helloWorld7 = new HelloWorld();
        HelloWorld helloWorld8 = new HelloWorld();
        String str10 = helloWorld8.greet("");
        String[] strArray14 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList15 = new java.util.ArrayList<String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<String>) strList15, strArray14);
        java.util.List<String> strList17 = helloWorld8.sortList((java.util.List<String>) strList15);
        java.util.List<String> strList18 = helloWorld7.sortList(strList17);
        java.util.List<String> strList19 = helloWorld0.sortList(strList18);
        String str21 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        String str23 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User Name can't be empty" + "'", str10, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str21, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str23, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("");
        String[] strArray8 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList9 = new java.util.ArrayList<String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<String>) strList9, strArray8);
        java.util.List<String> strList11 = helloWorld0.sortList((java.util.List<String>) strList9);
        HelloWorld helloWorld12 = new HelloWorld();
        HelloWorld helloWorld13 = new HelloWorld();
        String str15 = helloWorld13.greet("");
        String[] strArray19 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList20 = new java.util.ArrayList<String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<String>) strList20, strArray19);
        java.util.List<String> strList22 = helloWorld13.sortList((java.util.List<String>) strList20);
        java.util.List<String> strList23 = helloWorld12.sortList(strList22);
        java.util.List<String> strList24 = helloWorld0.sortList(strList22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User Name can't be empty" + "'", str15, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String[] strArray6 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList7 = new java.util.ArrayList<String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<String>) strList7, strArray6);
        java.util.List<String> strList9 = helloWorld0.sortList((java.util.List<String>) strList7);
        String str11 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        String str13 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str11, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("User Name can't be empty");
        String str13 = helloWorld7.greet("");
        String[] strArray15 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList16 = new java.util.ArrayList<String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<String>) strList16, strArray15);
        java.util.List<String> strList18 = helloWorld7.sortList((java.util.List<String>) strList16);
        java.util.List<String> strList19 = helloWorld0.sortList((java.util.List<String>) strList16);
        HelloWorld helloWorld20 = new HelloWorld();
        String str22 = helloWorld20.greet("");
        String str24 = helloWorld20.greet("User Name can't be empty");
        String str26 = helloWorld20.greet("");
        HelloWorld helloWorld27 = new HelloWorld();
        HelloWorld helloWorld28 = new HelloWorld();
        String str30 = helloWorld28.greet("");
        String[] strArray34 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList35 = new java.util.ArrayList<String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<String>) strList35, strArray34);
        java.util.List<String> strList37 = helloWorld28.sortList((java.util.List<String>) strList35);
        java.util.List<String> strList38 = helloWorld27.sortList(strList37);
        java.util.List<String> strList39 = helloWorld20.sortList(strList38);
        java.util.List<String> strList40 = helloWorld0.sortList(strList38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str11, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str24, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "User Name can't be empty" + "'", str26, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User Name can't be empty" + "'", str30, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("User Name can't be empty");
        String str6 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        HelloWorld helloWorld8 = new HelloWorld();
        String str10 = helloWorld8.greet("");
        String[] strArray14 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList15 = new java.util.ArrayList<String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<String>) strList15, strArray14);
        java.util.List<String> strList17 = helloWorld8.sortList((java.util.List<String>) strList15);
        java.util.List<String> strList18 = helloWorld7.sortList(strList17);
        java.util.List<String> strList19 = helloWorld0.sortList(strList17);
        String str21 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        String str23 = helloWorld0.greet("User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str4, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User Name can't be empty" + "'", str10, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str21, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str23, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("");
        String str13 = helloWorld7.greet("");
        String str15 = helloWorld7.greet("hi!");
        HelloWorld helloWorld16 = new HelloWorld();
        String str18 = helloWorld16.greet("");
        String str20 = helloWorld16.greet("User Name can't be empty");
        String str22 = helloWorld16.greet("");
        String[] strArray24 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList25 = new java.util.ArrayList<String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<String>) strList25, strArray24);
        java.util.List<String> strList27 = helloWorld16.sortList((java.util.List<String>) strList25);
        java.util.List<String> strList28 = helloWorld7.sortList(strList27);
        java.util.List<String> strList29 = helloWorld0.sortList(strList28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hello Mr./Ms HI!" + "'", str15, "Hello Mr./Ms HI!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User Name can't be empty" + "'", str18, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str20, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "User Name can't be empty" + "'", str22, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        HelloWorld helloWorld0 = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        String str3 = helloWorld1.greet("");
        String[] strArray7 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList8 = new java.util.ArrayList<String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<String>) strList8, strArray7);
        java.util.List<String> strList10 = helloWorld1.sortList((java.util.List<String>) strList8);
        java.util.List<String> strList11 = helloWorld0.sortList(strList10);
        String str13 = helloWorld0.greet("");
        HelloWorld helloWorld14 = new HelloWorld();
        String str16 = helloWorld14.greet("");
        String str18 = helloWorld14.greet("User Name can't be empty");
        String str20 = helloWorld14.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld21 = new HelloWorld();
        String str23 = helloWorld21.greet("");
        String str25 = helloWorld21.greet("User Name can't be empty");
        String str27 = helloWorld21.greet("");
        String[] strArray29 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList30 = new java.util.ArrayList<String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<String>) strList30, strArray29);
        java.util.List<String> strList32 = helloWorld21.sortList((java.util.List<String>) strList30);
        java.util.List<String> strList33 = helloWorld14.sortList((java.util.List<String>) strList30);
        java.util.List<String> strList34 = helloWorld0.sortList(strList33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User Name can't be empty" + "'", str3, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User Name can't be empty" + "'", str16, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str18, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str20, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User Name can't be empty" + "'", str23, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str25, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User Name can't be empty" + "'", str27, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
        HelloWorld helloWorld7 = new HelloWorld();
        String str9 = helloWorld7.greet("");
        String str11 = helloWorld7.greet("");
        String str13 = helloWorld7.greet("");
        HelloWorld helloWorld14 = new HelloWorld();
        String str16 = helloWorld14.greet("");
        String str18 = helloWorld14.greet("User Name can't be empty");
        String str20 = helloWorld14.greet("");
        String[] strArray22 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList23 = new java.util.ArrayList<String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<String>) strList23, strArray22);
        java.util.List<String> strList25 = helloWorld14.sortList((java.util.List<String>) strList23);
        java.util.List<String> strList26 = helloWorld7.sortList(strList25);
        java.util.List<String> strList27 = helloWorld0.sortList(strList26);
        String str29 = helloWorld0.greet("User Name can't be empty");
        HelloWorld helloWorld30 = new HelloWorld();
        HelloWorld helloWorld31 = new HelloWorld();
        String str33 = helloWorld31.greet("");
        String[] strArray37 = new String[] { "User Name can't be empty", "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY", "User Name can't be empty" };
        java.util.ArrayList<String> strList38 = new java.util.ArrayList<String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<String>) strList38, strArray37);
        java.util.List<String> strList40 = helloWorld31.sortList((java.util.List<String>) strList38);
        java.util.List<String> strList41 = helloWorld30.sortList(strList40);
        java.util.List<String> strList42 = helloWorld0.sortList(strList41);
        String str44 = helloWorld0.greet("Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str6, "Hello Mr./Ms HELLO MR./MS HELLO MR./MS USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User Name can't be empty" + "'", str9, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Name can't be empty" + "'", str13, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User Name can't be empty" + "'", str16, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str18, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User Name can't be empty" + "'", str20, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str29, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "User Name can't be empty" + "'", str33, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY" + "'", str44, "Hello Mr./Ms HELLO MR./MS USER NAME CAN'T BE EMPTY");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        HelloWorld helloWorld0 = new HelloWorld();
        String str2 = helloWorld0.greet("");
        String str4 = helloWorld0.greet("");
        String str6 = helloWorld0.greet("");
        String str8 = helloWorld0.greet("hi!");
        HelloWorld helloWorld9 = new HelloWorld();
        String str11 = helloWorld9.greet("");
        String str13 = helloWorld9.greet("User Name can't be empty");
        String str15 = helloWorld9.greet("");
        String[] strArray17 = new String[] { "User Name can't be empty" };
        java.util.ArrayList<String> strList18 = new java.util.ArrayList<String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<String>) strList18, strArray17);
        java.util.List<String> strList20 = helloWorld9.sortList((java.util.List<String>) strList18);
        java.util.List<String> strList21 = helloWorld0.sortList(strList20);
        Class<?> wildcardClass22 = strList20.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User Name can't be empty" + "'", str2, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User Name can't be empty" + "'", str4, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User Name can't be empty" + "'", str6, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello Mr./Ms HI!" + "'", str8, "Hello Mr./Ms HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User Name can't be empty" + "'", str11, "User Name can't be empty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hello Mr./Ms USER NAME CAN'T BE EMPTY" + "'", str13, "Hello Mr./Ms USER NAME CAN'T BE EMPTY");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User Name can't be empty" + "'", str15, "User Name can't be empty");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

