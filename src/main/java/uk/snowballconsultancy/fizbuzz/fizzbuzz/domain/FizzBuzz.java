package uk.snowballconsultancy.fizbuzz.fizzbuzz.domain;

public class FizzBuzz {

    public String calculate(int input) {
        if (input % 3 == 0) {
            return "Fizz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(input);
    }
}
