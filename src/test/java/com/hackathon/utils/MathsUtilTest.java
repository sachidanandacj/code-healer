package com.hackathon.utils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathsUtilTest {

    public static boolean debug = false;

   // @Test
    public void divide_test() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.divide");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.divide((int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        org.junit.Assert.assertNotNull(int3);
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = mathsUtil0.divide(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(10, (int) (byte) 10);
        Class<?> wildcardClass10 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.sum((int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 99 + "'", int12 == 99);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(10, (int) (byte) 10);
        int int12 = mathsUtil0.divide(100, (int) (short) -1);
        Class<?> wildcardClass13 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 350 + "'", int6 == 350);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.substract((int) (short) 0, (int) (byte) -1);
        int int15 = mathsUtil0.multiply(99, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 990 + "'", int15 == 990);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.substract((-99), (int) (byte) 10);
        int int12 = mathsUtil0.multiply(52, (-101));
        int int15 = mathsUtil0.divide((-100), 991);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-109) + "'", int9 == (-109));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5252) + "'", int12 == (-5252));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.multiply(98, 0);
        int int6 = mathsUtil0.multiply((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.multiply(98, 0);
        int int6 = mathsUtil0.sum((int) (byte) 1, (int) (byte) 10);
        int int9 = mathsUtil0.sum(11, (-99));
        int int12 = mathsUtil0.sum(10, 10);
        Class<?> wildcardClass13 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-88) + "'", int9 == (-88));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (short) -1, (-99));
        int int6 = mathsUtil0.multiply(3, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = mathsUtil0.divide(96, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 300 + "'", int6 == 300);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.multiply(98, 0);
        int int6 = mathsUtil0.divide((int) (short) 1, (-99));
        int int9 = mathsUtil0.sum((int) (short) -1, (-9934));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9935) + "'", int9 == (-9935));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.multiply((-99), (int) (short) 100);
        Class<?> wildcardClass10 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9900) + "'", int9 == (-9900));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.substract(0, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide((int) ' ', 10);
        int int12 = mathsUtil0.substract(990, 2000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.substract((-99), (int) (byte) 10);
        int int12 = mathsUtil0.multiply((int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-109) + "'", int9 == (-109));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.substract((int) (byte) 10, 100);
        int int9 = mathsUtil0.substract((-100), (int) (short) 1);
        int int12 = mathsUtil0.multiply((int) (byte) 0, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-90) + "'", int6 == (-90));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.substract((int) (byte) -1, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(10, (int) (byte) 10);
        int int12 = mathsUtil0.divide((-99), 2000);
        int int15 = mathsUtil0.sum(0, (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-90) + "'", int15 == (-90));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.divide(10, 300);
        int int9 = mathsUtil0.multiply((int) (byte) 1, (int) '4');
        Class<?> wildcardClass10 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.substract((int) (short) 0, (int) (byte) -1);
        int int15 = mathsUtil0.substract((-1), 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.substract((int) (short) 0, (int) (byte) -1);
        int int15 = mathsUtil0.sum(10, (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-80) + "'", int15 == (-80));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        MathsUtil mathsUtil0 = new MathsUtil();
        Class<?> wildcardClass1 = mathsUtil0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.sum((-100), (int) (short) 0);
        int int15 = mathsUtil0.sum(100, (int) (byte) -1);
        int int18 = mathsUtil0.sum((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.substract((int) (byte) 10, 100);
        int int9 = mathsUtil0.substract((-100), (int) (short) 1);
        Class<?> wildcardClass10 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-90) + "'", int6 == (-90));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (short) -1, (-99));
        int int6 = mathsUtil0.multiply(3, 100);
        int int9 = mathsUtil0.substract((int) ' ', 52);
        int int12 = mathsUtil0.multiply(300, (-90));
        Class<?> wildcardClass13 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 300 + "'", int6 == 300);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-20) + "'", int9 == (-20));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-27000) + "'", int12 == (-27000));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.substract((-9900), 34);
        int int15 = mathsUtil0.substract(0, 300);
        Class<?> wildcardClass16 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9934) + "'", int12 == (-9934));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-300) + "'", int15 == (-300));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide((int) ' ', 10);
        int int12 = mathsUtil0.sum(1, (int) 'a');
        int int15 = mathsUtil0.sum(990, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1024 + "'", int15 == 1024);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.multiply((-99), (int) (short) 100);
        int int12 = mathsUtil0.divide((-5252), (-80));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9900) + "'", int9 == (-9900));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65 + "'", int12 == 65);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.multiply((-99), (int) (short) 100);
        int int12 = mathsUtil0.sum(11, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9900) + "'", int9 == (-9900));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-90) + "'", int12 == (-90));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.sum((int) (byte) 1, 990);
        Class<?> wildcardClass10 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide((int) ' ', 10);
        int int12 = mathsUtil0.sum(1, (int) 'a');
        Class<?> wildcardClass13 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.sum((-100), (int) (short) 0);
        int int15 = mathsUtil0.sum(100, (int) (byte) -1);
        int int18 = mathsUtil0.sum((int) (byte) -1, (int) 'a');
        int int21 = mathsUtil0.divide((-1), (int) (byte) 1);
        int int24 = mathsUtil0.divide(0, 11);
        int int27 = mathsUtil0.substract((int) (byte) 0, (-300));
        int int30 = mathsUtil0.divide(20, 9901);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 300 + "'", int27 == 300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.sum((-100), (int) (short) 0);
        int int15 = mathsUtil0.sum(100, (int) (byte) -1);
        int int18 = mathsUtil0.sum((int) (byte) -1, (int) 'a');
        int int21 = mathsUtil0.sum(100, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (short) -1, (-99));
        int int6 = mathsUtil0.multiply(3, 100);
        int int9 = mathsUtil0.divide(100, (-27000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 300 + "'", int6 == 300);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.sum((int) (byte) 1, 990);
        int int12 = mathsUtil0.divide((int) (byte) 1, (-101));
        int int15 = mathsUtil0.substract((int) 'a', 96);
        int int18 = mathsUtil0.sum((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.multiply(98, 0);
        int int6 = mathsUtil0.divide((int) (short) 1, (-99));
        int int9 = mathsUtil0.sum(2, 51480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51482 + "'", int9 == 51482);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.substract((-9900), 34);
        int int15 = mathsUtil0.multiply(990, 52);
        int int18 = mathsUtil0.divide((int) (short) 10, 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9934) + "'", int12 == (-9934));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51480 + "'", int15 == 51480);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.divide(10, 300);
        int int9 = mathsUtil0.multiply(20, (int) (byte) 100);
        int int12 = mathsUtil0.substract((int) (byte) -1, (int) (short) 0);
        int int15 = mathsUtil0.multiply(0, (-1010));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.multiply(98, 0);
        int int6 = mathsUtil0.sum((int) (byte) 1, (int) (byte) 10);
        int int9 = mathsUtil0.sum(11, (-99));
        int int12 = mathsUtil0.sum((int) (byte) 1, (int) 'a');
        int int15 = mathsUtil0.sum((int) (short) -1, (-9900));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-88) + "'", int9 == (-88));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9901) + "'", int15 == (-9901));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.divide(0, (int) ' ');
        int int12 = mathsUtil0.sum((-100), (int) (short) 0);
        int int15 = mathsUtil0.sum(100, (int) (byte) -1);
        int int18 = mathsUtil0.sum((int) (byte) -1, (int) 'a');
        int int21 = mathsUtil0.divide((-1), (int) (byte) 1);
        int int24 = mathsUtil0.divide((-9901), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-990) + "'", int24 == (-990));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.substract((int) (byte) 10, 100);
        int int9 = mathsUtil0.substract((-101), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-90) + "'", int6 == (-90));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-153) + "'", int9 == (-153));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.divide((-27000), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-27000) + "'", int3 == (-27000));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.substract((-99), (int) (byte) 10);
        int int12 = mathsUtil0.divide((int) (short) 100, (int) (short) -1);
        int int15 = mathsUtil0.sum((-109), (int) (short) 0);
        int int18 = mathsUtil0.multiply((int) (byte) -1, 20);
        int int21 = mathsUtil0.sum(36, 34);
        Class<?> wildcardClass22 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-109) + "'", int9 == (-109));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-109) + "'", int15 == (-109));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-20) + "'", int18 == (-20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 70 + "'", int21 == 70);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.sum((int) (byte) 1, 990);
        int int12 = mathsUtil0.divide(0, 51480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 991 + "'", int9 == 991);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (short) -1, (-99));
        int int6 = mathsUtil0.multiply(3, 100);
        Class<?> wildcardClass7 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 300 + "'", int6 == 300);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.multiply(98, 0);
        int int6 = mathsUtil0.sum((int) (byte) 1, (int) (byte) 10);
        int int9 = mathsUtil0.substract((int) '#', (int) (short) 1);
        int int12 = mathsUtil0.divide((int) (byte) 0, 52);
        int int15 = mathsUtil0.divide(51480, (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2574) + "'", int15 == (-2574));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.divide(10, 300);
        int int9 = mathsUtil0.multiply((int) (byte) 1, (int) '4');
        int int12 = mathsUtil0.substract(1, (-9900));
        int int15 = mathsUtil0.sum((int) (short) 100, 51480);
        int int18 = mathsUtil0.substract((-90), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9901 + "'", int12 == 9901);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51580 + "'", int15 == 51580);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.multiply(98, 0);
        Class<?> wildcardClass4 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.multiply((int) (short) 0, (int) ' ');
        int int9 = mathsUtil0.substract((-99), (int) (byte) 10);
        int int12 = mathsUtil0.divide((int) (short) 100, (int) (short) -1);
        int int15 = mathsUtil0.sum((-109), (int) (short) 0);
        Class<?> wildcardClass16 = mathsUtil0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-109) + "'", int9 == (-109));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-109) + "'", int15 == (-109));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        MathsUtil mathsUtil0 = new MathsUtil();
        int int3 = mathsUtil0.substract((int) (byte) 1, (int) (short) 100);
        int int6 = mathsUtil0.divide(10, 300);
        int int9 = mathsUtil0.multiply((int) (byte) 1, (int) '4');
        int int12 = mathsUtil0.substract(1, (-9900));
        int int15 = mathsUtil0.divide(51580, (-153));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-99) + "'", int3 == (-99));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9901 + "'", int12 == 9901);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-337) + "'", int15 == (-337));
    }
}

