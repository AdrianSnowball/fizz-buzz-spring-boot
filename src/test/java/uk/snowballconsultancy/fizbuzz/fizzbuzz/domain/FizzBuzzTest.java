package uk.snowballconsultancy.fizbuzz.fizzbuzz.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 33, 48, 72})
    public void weGetFizzWhenMultipleOfThree(int number) {

        String result = fizzBuzz.calculate(number);
        assertThat(result, equalTo("Fizz"));
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 80, 100})
    public void weGetBuzzWhenMultipleOfFive(int number) {

        String result = fizzBuzz.calculate(number);
        assertThat(result, equalTo("Buzz"));
    }

}