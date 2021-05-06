package uk.snowballconsultancy.fizbuzz.fizzbuzz.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class FizzBuzzServiceTest {

    private FizzBuzzService fizzBuzzService;

    @BeforeEach
    public void setup(){
        fizzBuzzService = new FizzBuzzService();
    }

    @Test
    public void weGetEmptyString(){

        String result = fizzBuzzService.fetchResult();
        assertThat(result, equalTo(""));
    }
}