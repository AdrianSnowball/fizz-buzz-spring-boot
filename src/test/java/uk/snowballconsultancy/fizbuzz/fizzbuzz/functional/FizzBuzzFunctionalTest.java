package uk.snowballconsultancy.fizbuzz.fizzbuzz.functional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FizzBuzzFunctionalTest {

    @LocalServerPort
    protected int serverPort;

    @Test
    public void weGetOKFromEndpoint(){

        String url = String.format("http://localhost:%d/fizzbuzz", serverPort);

        given().
            header("Accept", "text/plain").
        when().
            get(url).
        then().
            statusCode(200).
        and().
            body(equalTo(""));
        }

}
