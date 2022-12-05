package ru.netology.echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {


    @Test
    void shouldSendAndReturnData() {

        given( )
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body(/* --> ваша проверка здесь <-- */);
    }

}
