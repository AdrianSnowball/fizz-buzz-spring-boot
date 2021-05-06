package uk.snowballconsultancy.fizbuzz.fizzbuzz.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import uk.snowballconsultancy.fizbuzz.fizzbuzz.service.FizzBuzzRenderer;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class FizzBuzzController {

    private final FizzBuzzRenderer fizzBuzzRenderer;

    public FizzBuzzController(FizzBuzzRenderer fizzBuzzRenderer) {
        this.fizzBuzzRenderer = fizzBuzzRenderer;
    }

    @GetMapping(path = "/fizzbuzz", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> fetchFizzBuzz(){

        String result = fizzBuzzRenderer.fetchResult();
        return new ResponseEntity<>(result, OK);
    }
}
