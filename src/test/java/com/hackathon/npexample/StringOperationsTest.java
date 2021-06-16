package com.hackathon.npexample;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringOperationsTest {

    public static boolean debug = false;


    @Test
    public void areStringsEqual() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.greet");
        StringOperations stringOperations0 = new StringOperations();
        Boolean aBoolean = stringOperations0.areStringsEqual(null,null);
        org.junit.Assert.assertTrue("Strings are not equal ",aBoolean);
    }


    @Test
    public void getSubString() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.sortList");
        StringOperations stringOperations0 = new StringOperations();
        String str = stringOperations0.getSubString(null,2,3);
        org.junit.Assert.assertNotNull(str);
    }

    @Test
    public void getLastIndexOf() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.sortList");
        StringOperations stringOperations0 = new StringOperations();
        Integer integer = stringOperations0.getLastIndexOf(null,"hello");
        org.junit.Assert.assertNotNull(integer);
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        StringOperations stringOperations0 = new StringOperations();
        // The following exception was thrown during execution in test generation
        try {
            String str4 = stringOperations0.getSubString("", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 1, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        Class<?> wildcardClass7 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str7 = stringOperations0.getSubString("", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        // The following exception was thrown during execution in test generation
        try {
            String str10 = stringOperations0.getSubString("", (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 32, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str7 = stringOperations0.getSubString("hi!", (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 100, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            String str7 = stringOperations0.getSubString("", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 35, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            String str10 = stringOperations0.getSubString("", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 1, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        Class<?> wildcardClass10 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str7 = stringOperations0.getSubString("", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 10, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        // The following exception was thrown during execution in test generation
        try {
            String str10 = stringOperations0.getSubString("", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 10, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str19 = stringOperations0.getSubString("", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 1, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        // The following exception was thrown during execution in test generation
        try {
            String str10 = stringOperations0.getSubString("", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end -1, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            String str13 = stringOperations0.getSubString("", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 1, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        // The following exception was thrown during execution in test generation
        try {
            String str10 = stringOperations0.getSubString("hi!", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 10, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str10 = stringOperations0.getSubString("", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 0, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str10 = stringOperations0.getSubString("hi!", (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 10, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str19 = stringOperations0.getSubString("hi!", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 1, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        StringOperations stringOperations0 = new StringOperations();
        // The following exception was thrown during execution in test generation
        try {
            String str4 = stringOperations0.getSubString("hi!", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        Class<?> wildcardClass7 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            String str7 = stringOperations0.getSubString("hi!", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int9 = stringOperations0.getLastIndexOf("", "hi!");
        Class<?> wildcardClass10 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str19 = stringOperations0.getSubString("", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 1, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str10 = stringOperations0.getSubString("hi!", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        Class<?> wildcardClass7 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            String str7 = stringOperations0.getSubString("", (int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 3, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int9 = stringOperations0.getLastIndexOf("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str13 = stringOperations0.getSubString("", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 100, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        int int9 = stringOperations0.getLastIndexOf("", "");
        boolean boolean12 = stringOperations0.areStringsEqual("", "hi!");
        boolean boolean15 = stringOperations0.areStringsEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int9 = stringOperations0.getLastIndexOf("", "hi!");
        int int12 = stringOperations0.getLastIndexOf("hi!", "hi!");
        Class<?> wildcardClass13 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        int int9 = stringOperations0.getLastIndexOf("", "");
        boolean boolean12 = stringOperations0.areStringsEqual("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str16 = stringOperations0.getSubString("", (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end -1, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str16 = stringOperations0.getSubString("hi!", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 0, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str19 = stringOperations0.getSubString("", (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 0, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "hi!");
        Class<?> wildcardClass10 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean6 = stringOperations0.areStringsEqual("", "hi!");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int12 = stringOperations0.getLastIndexOf("", "hi!");
        int int15 = stringOperations0.getLastIndexOf("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        Class<?> wildcardClass13 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str19 = stringOperations0.getSubString("hi!", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean6 = stringOperations0.areStringsEqual("", "hi!");
        int int9 = stringOperations0.getLastIndexOf("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        int int15 = stringOperations0.getLastIndexOf("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean6 = stringOperations0.areStringsEqual("", "hi!");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int12 = stringOperations0.getLastIndexOf("", "hi!");
        Class<?> wildcardClass13 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean9 = stringOperations0.areStringsEqual("", "hi!");
        Class<?> wildcardClass10 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("", "");
        boolean boolean6 = stringOperations0.areStringsEqual("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            String str13 = stringOperations0.getSubString("", (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 100, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("", "");
        Class<?> wildcardClass7 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("", "");
        Class<?> wildcardClass4 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        int int9 = stringOperations0.getLastIndexOf("", "hi!");
        Class<?> wildcardClass10 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "");
        Class<?> wildcardClass10 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int18 = stringOperations0.getLastIndexOf("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            String str22 = stringOperations0.getSubString("", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 1, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int12 = stringOperations0.getLastIndexOf("hi!", "");
        int int15 = stringOperations0.getLastIndexOf("hi!", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        Class<?> wildcardClass7 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        int int9 = stringOperations0.getLastIndexOf("", "");
        boolean boolean12 = stringOperations0.areStringsEqual("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str16 = stringOperations0.getSubString("hi!", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 97, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "hi!");
        int int9 = stringOperations0.getLastIndexOf("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        int int9 = stringOperations0.getLastIndexOf("", "hi!");
        Class<?> wildcardClass10 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int12 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean15 = stringOperations0.areStringsEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int12 = stringOperations0.getLastIndexOf("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            String str16 = stringOperations0.getSubString("", (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean6 = stringOperations0.areStringsEqual("", "hi!");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        int int12 = stringOperations0.getLastIndexOf("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str16 = stringOperations0.getSubString("", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 32, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean6 = stringOperations0.areStringsEqual("", "hi!");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str13 = stringOperations0.getSubString("hi!", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 32, length 3");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "hi!");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean18 = stringOperations0.areStringsEqual("", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("", "");
        int int9 = stringOperations0.getLastIndexOf("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            String str13 = stringOperations0.getSubString("", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 35, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean6 = stringOperations0.areStringsEqual("", "");
        int int9 = stringOperations0.getLastIndexOf("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean18 = stringOperations0.areStringsEqual("", "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        StringOperations stringOperations0 = new StringOperations();
        boolean boolean3 = stringOperations0.areStringsEqual("hi!", "hi!");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean9 = stringOperations0.areStringsEqual("", "hi!");
        int int12 = stringOperations0.getLastIndexOf("", "");
        // The following exception was thrown during execution in test generation
        try {
            String str16 = stringOperations0.getSubString("", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 0, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "hi!");
        boolean boolean12 = stringOperations0.areStringsEqual("", "hi!");
        boolean boolean15 = stringOperations0.areStringsEqual("hi!", "hi!");
        Class<?> wildcardClass16 = stringOperations0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        StringOperations stringOperations0 = new StringOperations();
        // The following exception was thrown during execution in test generation
        try {
            String str4 = stringOperations0.getSubString("", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 100, length 0");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        StringOperations stringOperations0 = new StringOperations();
        int int3 = stringOperations0.getLastIndexOf("hi!", "");
        int int6 = stringOperations0.getLastIndexOf("hi!", "");
        boolean boolean9 = stringOperations0.areStringsEqual("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

