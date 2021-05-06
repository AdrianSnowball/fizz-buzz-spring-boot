package uk.snowballconsultancy.fizbuzz.fizzbuzz.domain;

public class FizzBuzz {

    public String calculate(int input) {
        if(input == 3){
            return "Fizz";
        }
        return String.valueOf(input);
    }
}
