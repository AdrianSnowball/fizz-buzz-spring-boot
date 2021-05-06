package uk.snowballconsultancy.fizbuzz.fizzbuzz.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void weGetOneWhenOne() {

        String result = fizzBuzz.calculate(1);
        assertThat(result, equalTo("1"));
    }


    @Test
    public void weGetTwoWhenTwo() {

        String result = fizzBuzz.calculate(2);
        assertThat(result, equalTo("2"));
    }

    @Test
    public void weGetFizzWhenThree() {

        String result = fizzBuzz.calculate(3);
        assertThat(result, equalTo("Fizz"));
    }

}