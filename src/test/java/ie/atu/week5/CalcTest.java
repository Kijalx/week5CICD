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
        new Calc(6);
    }
    @Test
    void testAdd()
    {
        assertEquals(3, test.add(1,2));
    }

    @AfterEach
    void tearDown() {
    }
}