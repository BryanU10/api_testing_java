package tests;

import base.BaseTests;
import constants.Constants;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Login extends BaseTests {

    @Test
    public void LoginSuccessful(){
        given()
                .auth()
                .preemptive()
                .basic("eve.holt@reqres.in", "")
                .when()
                .get(Constants.POST_LOGIN)
                .then()
                .statusCode(200)
                .log().all();
    }
}


