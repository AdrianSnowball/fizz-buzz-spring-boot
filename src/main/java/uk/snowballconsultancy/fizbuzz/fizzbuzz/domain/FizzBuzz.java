package uk.snowballconsultancy.fizbuzz.fizzbuzz.domain;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzz {

    public String calculate(int input) {

        boolean isMultipleOfThree = input % 3 == 0;
        boolean isMultipleOfFive = input % 5 == 0;

        if (isMultipleOfThree && isMultipleOfFive) {
            return "FizzBuzz";
        }
        if (isMultipleOfThree) {
            return "Fizz";
        }
        if (isMultipleOfFive) {
            return "Buzz";
        }
        return String.valueOf(input);
    }
}
