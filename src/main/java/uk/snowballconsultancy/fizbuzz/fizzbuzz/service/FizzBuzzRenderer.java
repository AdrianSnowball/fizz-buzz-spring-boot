package uk.snowballconsultancy.fizbuzz.fizzbuzz.service;

import org.springframework.stereotype.Component;
import uk.snowballconsultancy.fizbuzz.fizzbuzz.domain.FizzBuzz;

import java.util.stream.IntStream;

@Component
public class FizzBuzzRenderer {

    private final FizzBuzz fizzBuzz;

    public FizzBuzzRenderer(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    public String fetchResult() {

        StringBuilder builder = new StringBuilder("");

        IntStream range = IntStream.rangeClosed(1, 100);

        range.forEach(number ->{
            builder.append(fizzBuzz.calculate(number));
            builder.append("\n");
        });
        return builder.toString();
    }
}
