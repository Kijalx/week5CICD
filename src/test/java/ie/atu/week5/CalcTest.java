package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc test;
    @BeforeEach
    void setUp() {
        test = new Calc();
    }

    @Test
    void testConstructorFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{new Calc(4);});
        assertEquals("This is not a valid number", exMessage.getMessage());
    }
    @Test
    void testConstructorPass()
    {
        Calc newCalc = new Calc(6);
        assertEquals(6,newCalc.returnCountValue());
    }
    @Test
    void testAdd()
    {
        assertEquals(3, test.add(1,2));
    }
    @Test
    void testSubtract()
    {
        assertEquals(-2, test.subtract(3, 5));
    }
    @Test
    void testMultiply()
    {
        assertEquals(27.5, test.multiply(5.5, 5));
    }
    @Test
    void testDivideFailVal1()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{test.divide(0,1);});
        assertEquals("This is not a valid number", exMessage.getMessage());
    }
    @Test
    void testDivideFailVal2()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{test.divide(1,0);});
        assertEquals("This is not a valid number", exMessage.getMessage());
    }
    @Test
    void testDivideNoFail()
    {
        assertEquals(1.25, test.divide(5, 4));
    }
    @AfterEach
    void tearDown() {
    }
}