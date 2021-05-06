package uk.snowballconsultancy.fizbuzz.fizzbuzz.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import uk.snowballconsultancy.fizbuzz.fizzbuzz.service.FizzBuzzService;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;

    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping(path = "/fizzbuzz", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> fetchFizzBuzz(){

        String result = fizzBuzzService.fetchResult();
        return new ResponseEntity<>(result, OK);
    }
}
