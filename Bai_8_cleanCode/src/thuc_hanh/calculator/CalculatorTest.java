package thuc_hanh.calculator;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//@RunWith(Parameterized.class)
public class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    public void testCalculateAdd() {
        int firstOperand  = 1;
        int secondOperand  = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand , secondOperand , operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    public void testCalculateSub() {
        int firstOperand  = 2;
        int secondOperand  = 1;
        char operator = '-';
        int expected = 1;

        int result = Calculator.calculate(firstOperand , secondOperand , operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    public void testCalculateMul() {
        int firstOperand  = 2;
        int secondOperand  = 2;
        char operator = '*';
        int expected = 4;

        int result = Calculator.calculate(firstOperand , secondOperand , operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    public void testCalculateDiv() {
        int firstOperand  = 6;
        int secondOperand  = 3;
        char operator = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand , secondOperand , operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    public void testCalculateDivByZero() {
        int firstOperand  = 2;
        int secondOperand  = 0;
        char operator = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand , secondOperand , operator);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    public void testCalculateWrongOperator() {
        int  firstOperand = 2;
        int secondOperand  = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand , secondOperand , operator);});
    }
}