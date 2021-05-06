package uk.snowballconsultancy.fizbuzz.fizzbuzz.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void weGetOneWhenOne(){

        String result = fizzBuzz.calculate(1);
    }

}