package uk.snowballconsultancy.fizbuzz.fizzbuzz.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import uk.snowballconsultancy.fizbuzz.fizzbuzz.domain.FizzBuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FizzBuzzRendererTest {

    @Mock
    private FizzBuzz mockFizzBuzz;

    @InjectMocks
    private FizzBuzzRenderer fizzBuzzRenderer;

    @Test
    public void weOutpuitBasedOnResultFromFizzBuzz(){

        when(mockFizzBuzz.calculate(anyInt())).thenReturn("1");
        when(mockFizzBuzz.calculate(1)).thenReturn("Fizz");
        when(mockFizzBuzz.calculate(3)).thenReturn("Buzz");
        when(mockFizzBuzz.calculate(5)).thenReturn("FizzBuzz");

        String result = fizzBuzzRenderer.fetchResult();
        assertThat(result, startsWith("Fizz\n1\nBuzz\n1\nFizzBuzz"));
    }
}