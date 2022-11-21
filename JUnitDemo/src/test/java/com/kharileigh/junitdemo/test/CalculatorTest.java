/**
 *
 * @author kharileigh
 * <---- TEST FILE FOR CALCULATOR ---->
 */

package com.kharileigh.junitdemo.test;

import com.kharileigh.junitdemo.exceptions.NegativeNumberException;
import com.kharileigh.junitdemo.Calculator;

// IMPORTS ALL STATIC MEMBERS FROM CLASS - can call methods directly without class name
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;


@DisplayName("Testing Calculator Class")
public class CalculatorTest {
    
    private Calculator calculator;
    
    public CalculatorTest() {
    }
    
    
    @BeforeEach
    public void setUp() throws Exception {
        calculator = new Calculator();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        calculator = null;
    }

    
    /**
     * Test of divide method, of class Calculator.
     */
    
    
    // NESTED - USED TO GROUP SIMILAR TEST CASES WHEN DISPLAYING RESULTS
    @Nested
    class CheckDivide {
        
            // equals for positive scenario
            @DisplayName("Divide 20 by 5")
            @Test
            void R001_T001() throws NegativeNumberException {
                    assertEquals(4, calculator.divide(20, 5));
            }

            // throws for negative scenario
            @DisplayName("Divide -20 by 5")
            @Test
            void R001_T002() throws NegativeNumberException {
                    assertThrows(NegativeNumberException.class,()->calculator.divide(-20, 5));
            }

            @DisplayName("Divide 20 by -5")
            @Test
            void R001_T003() throws NegativeNumberException {
                    assertThrows(NegativeNumberException.class,()->calculator.divide(20, -5));
            }

            @DisplayName("Divide -20 by -5")
            @Test
            void R001_T004() throws NegativeNumberException {
                    assertThrows(NegativeNumberException.class,()->calculator.divide(-20, -5));
            }
            
            @DisplayName("Divide 0 by 5")
            @Test
            void R001_T005() throws NegativeNumberException {
                    assertEquals(0, calculator.divide(0, 5));
            }
            
            @DisplayName("Divide 20 by 0")
            @Test
            void R001_T006() throws NegativeNumberException {
                    assertThrows(ArithmeticException.class,()->calculator.divide(20, 0));
            }
    }
    
    
    @Nested
    class CheckAdd {
    
            @DisplayName("Add 20 and 5")
            @Test
            void R002_T001() throws NegativeNumberException {
                    assertEquals(25, calculator.add(20, 5));
            }

            @DisplayName("Add -20 and 5")
            @Test
            void R002_T002() throws NegativeNumberException {
                    assertThrows(NegativeNumberException.class, () -> calculator.add(-20, 5));
            }

            @DisplayName("Add 20 and -5")
            @Test
            void R002_T003() throws NegativeNumberException {
                    assertThrows(NegativeNumberException.class, () -> calculator.add(20, -5));
            }

            @DisplayName("Add -20 and -5")
            @Test
            void R002_T004() throws NegativeNumberException {
                    assertThrows(NegativeNumberException.class, () -> calculator.add(-20, -5));
            }

            @DisplayName("Add 0 and 5")
            @Test
            void R002_T005() throws NegativeNumberException {
                    assertEquals(5, calculator.add(0, 5));
            }

            @DisplayName("Add 20 and 0")
            @Test
            void R002_T006() throws NegativeNumberException {
                    assertEquals(20, calculator.add(20, 0));
            }  
    
    }
    
}
