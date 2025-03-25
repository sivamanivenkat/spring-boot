package com.Venkat.jnuitdemo;

import com.Venkat.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;


import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

//    @BeforeAll
//    static void setupBeforeEachClass(){
//        System.out.println("@BeforeAll runs before all the methods only once");
//    }
//
//    @AfterAll
//    static void releaseAfterAll(){
//        System.out.println("@AfterAll runs all the methods only once...");
//    }
//
//    @BeforeEach
//    void setUpBeforeEach(){
//        demoUtils = new DemoUtils();
//        System.out.println("@beforeEach runs before each method!");
//    }
//
//    @AfterEach
//    void releaseAfterEach(){
//        System.out.println("Running AfterEach().");
//    }

    @DisplayName("Equals and Not Equals")
    @Test
    @Order(10)
    void testEqualsNotEquals(){

        demoUtils = new DemoUtils();
        System.out.println("Running testEqualsNotEquals!!");

        assertEquals(12, demoUtils.multiply(2,6), "2 multiplied by 6 should be 12");
        assertEquals(8, demoUtils.add(2,6), "2 plus 6 must be 8");
    }

   @DisplayName("Null not Null")
    @Test
   @Order(1)
    void test_Null_notNull(){

        demoUtils = new DemoUtils();
        System.out.println("Running testNullnotNull!!");
        String str1 = null;
        String str2 = "Venkat";

        assertNull(demoUtils.checkNull(str1), "String should be Null");
        assertNotNull(demoUtils.checkNull(str2), " String should not be null");
    }

    @DisplayName("Same Not Same")
    @Test
    @Order(-10)
    void testSameNotSame(){
        demoUtils = new DemoUtils();
        String str = "Mani Venkat";
        assertSame(demoUtils.getName(),demoUtils.getNameDuplicate(),"Objects should be same");
        assertNotSame(str, demoUtils.getName(),  "Objects should not be same");
    }

    @DisplayName("True or False")
    @Test
    @Order(-5)
    void testTrueFalse(){
        demoUtils = new DemoUtils();
        int num1 = 10;
        int num2 = 6;

        assertTrue(demoUtils.isGreater(num1, num2), "This should return true");
        assertFalse(demoUtils.isGreater(num2, num1), "This should return false");

    }

    @DisplayName("Array Equals")
    @Test
    @Order(0)
    void testArrayEquals(){
        demoUtils = new DemoUtils();
        String[] str = {"Mani", "Venkat", "K"};
        assertArrayEquals(str, demoUtils.getMyName(), "Each Array element should be same");
    }

    @DisplayName("Iterable Equals")
    @Test
    void testIterableEquals(){
        demoUtils = new DemoUtils();
        List<String> list = List.of("Mani", "Venkat", "K");
        assertIterableEquals(list, demoUtils.getMyNameinList(), "Elements of List should be equal");
    }

    @DisplayName("Lines Match")
    @Test
    void testLinesMatch(){
        demoUtils = new DemoUtils();
        List<String> list = List.of("Mani", "Venkat", "K");
        assertLinesMatch(list, demoUtils.getMyNameinList(), "Elements of List should be equal");
    }

    @DisplayName("Throws and not throws")
    @Test
    void testThrowsAndNotThrows(){
        demoUtils = new DemoUtils();

        assertThrows(Exception.class, () -> {demoUtils.throwException(-3);}, "Exception should be thrown");

        assertDoesNotThrow(()->{demoUtils.throwException(3);}, "Exception should not be thrown");
    }

    @DisplayName("Timeout Preemptively")
    @Test
    void testTimeout(){
        demoUtils = new DemoUtils();
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {demoUtils.checkTimeout();} , "Execeution should be completed in 3 seconds");
    }
}
