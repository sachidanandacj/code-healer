package com.hackathon.codehealerexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

class CodeHealerExampleApplicationTests {

    CodeHealerExampleApplication exampleApplication = new CodeHealerExampleApplication();

    @Test
    void contextLoads() {
    }

    @Test
    void getSum() {
        int[] arr = {5, 5};
        Assertions.assertEquals(10, exampleApplication.getSum(arr));
    }

    @Test
    void getSubString() {
        Assertions.assertEquals("bc", exampleApplication.getSubString("abcd", 1, 3));
    }

    @Test
    void getSubStringForNull() {
        Assertions.assertEquals(null, exampleApplication.getSubString(null, 0, 0));
    }

}
