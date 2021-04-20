package com.mohsinkd786;

import com.mohsinkd786.service.Addition;
import com.mohsinkd786.service.CalculatorService;
import com.mohsinkd786.service.Operation;
import com.sun.jdi.DoubleValue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown(){

    }

    @Test
    public void testAddition(){

        Addition operation = mock(Addition.class);

        CalculatorService calculatorService = new CalculatorService(operation);

//        when(operation.operate(10,10)).thenReturn(Float.parseFloat("20"));
//        when(operation.operate(10,11)).thenReturn(Float.parseFloat("21"));

        when(operation.operate(anyInt(),anyInt())).thenReturn( Float.parseFloat("20"));

        Assertions.assertEquals(calculatorService.execute(10,10),20);
        Assertions.assertEquals(calculatorService.execute(10,11),20);
    }
}
