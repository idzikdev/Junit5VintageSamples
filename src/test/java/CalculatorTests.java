import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    /***
     * method is calling before all tests
     */
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Before all tests");
    }

    /***
     * method is calling before each test
     */
    @BeforeEach
    public void beforeEachTests() {
        System.out.println("Before each test");
    }

    /***
     * method is calling after each test
     */
    @AfterEach
    public void afterEachTest() {
        System.out.println("After each test");
    }

    /***
     * method is calling after all tests
     */
    @AfterAll
    public static void afterAllTests() {
        System.out.println("After all tests");
    }


    /***
     * method is checking the addition of two numbers
     */
    @DisplayName("should add two numbers")
    @Test
    public void should_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(10, 15);
        //then
        assertEquals(25, result);
    }

    /***
     * method is checking the addition of two numbers
     */
    @DisplayName("should not add two numbers")
    @Test
    public void should_not_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(11, 15);
        //then
        assertNotEquals(25, result);
    }

    /**
     * method is checking the division of two numbers
     */
    @DisplayName("should divide two numbers")
    @Test
    public void should_divide_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(100, 10);
        //then
        assertEquals(10, result);
    }

    /**
     * method is checking the division of two numbers
     */
    @DisplayName("should not divide two numbers")
    @Test
    public void should_not_divide_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when

        //then
        assertThrows(ArithmeticException.class,()->{calculator.divide(100,0);});
    }
}