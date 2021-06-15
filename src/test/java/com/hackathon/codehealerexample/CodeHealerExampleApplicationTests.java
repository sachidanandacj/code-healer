package com.hackathon.codehealerexample;

import org.junit.Assert;
import org.junit.Test;

public class CodeHealerExampleApplicationTests {

    public CodeHealerExampleApplication exampleApplication = new CodeHealerExampleApplication();

    @Test
    public void getSum() {
        int[] arr = {5, 5};
        Assert.assertEquals(10, exampleApplication.getSum(arr));
    }

    @Test
    public void getSubString() {
        Assert.assertEquals("bc", exampleApplication.getSubString("abcd", 1, 3));
    }

    @Test
    public void getSubStringForNull() {
        Assert.assertEquals(null, exampleApplication.getSubString(null, 0, 0));
    }

}
