package uk.snowballconsultancy.fizbuzz.fizzbuzz.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import uk.snowballconsultancy.fizbuzz.fizzbuzz.domain.FizzBuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
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
    public void weOutputBasedOnResultFromFizzBuzz(){

        when(mockFizzBuzz.calculate(anyInt())).thenReturn("1");
        when(mockFizzBuzz.calculate(1)).thenReturn("Fizz");
        when(mockFizzBuzz.calculate(3)).thenReturn("Buzz");
        when(mockFizzBuzz.calculate(5)).thenReturn("FizzBuzz");

        String result = fizzBuzzRenderer.fetchResult();
        assertThat(result, startsWith("Fizz\n1\nBuzz\n1\nFizzBuzz"));
    }

    @Test
    public void weOutputBasedOnIfNumberContains3(){

        when(mockFizzBuzz.calculate(anyInt())).thenReturn("1");
        when(mockFizzBuzz.calculate(13)).thenReturn("13");

        String result = fizzBuzzRenderer.fetchResult();
        assertThat(result, startsWith("1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\nFizz\n1"));
    }

    @Test
    public void weOutputBasedOnIfNumberContains5(){

        when(mockFizzBuzz.calculate(anyInt())).thenReturn("1");
        when(mockFizzBuzz.calculate(25)).thenReturn("25");

        String result = fizzBuzzRenderer.fetchResult();
        assertThat(result, startsWith("1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\nBuzz"));
    }


    @Test
    public void weOutputBasedOnIfNumberContains3And5(){

        when(mockFizzBuzz.calculate(anyInt())).thenReturn("1");
        when(mockFizzBuzz.calculate(35)).thenReturn("35");

        String result = fizzBuzzRenderer.fetchResult();
        assertThat(result, startsWith("1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\nFizzBuzz"));
    }
}