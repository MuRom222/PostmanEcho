package ru.netology.echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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
                .body("data", equalTo ("some data"));
    }

    @Test

    void shouldСashBack () {

        given( )
                .baseUri("https://postman-echo.com")
                .body("cashback 250")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo ("cashback 250"));
    }

}
