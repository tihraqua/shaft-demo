package com.qacart.shaft;

import com.jcraft.jsch.jce.SHA1;
import com.shaft.driver.SHAFT;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Api {

    @Test
    public void sendRequest(){
        SHAFT.API api = new SHAFT.API("https://todo.qacart.com");
        HashMap<String, String> requestBody = new HashMap<>();
        requestBody.put("email","tihraquamahdi@gmail.com");
        requestBody.put("password","12345678");
        api.post("/api/v1/users/login").setRequestBody(requestBody).setContentType(ContentType.JSON).perform();
        String token = api.getResponseJSONValue("access_token");
        System.out.println("Token:"+ token);
    }
}
