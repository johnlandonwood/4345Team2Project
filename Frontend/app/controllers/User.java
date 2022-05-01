package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;


public class User {

    private String username;

    private String password;

//    private String first_name;
//
//    private String last_name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getFirstName() {return first_name;}
//
//    public void setFirstName(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public String getLastName() {return last_name;}
//
//    public void setLastName(String last_name) {
//        this.last_name = last_name;
//    }


    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/login");
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }



    public  CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);

        System.out.println(username);
        System.out.println(password);

        WSRequest request = ws.url("http://localhost:9005/signup");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


//    public  CompletionStage<WSResponse> updateUser() {
//
//        WSClient ws = play.test.WSTestClient.newClient(9005);
//        // send this. user
//        ObjectNode res = Json.newObject();
//
//        res.put("first_name", this.first_name);
//        res.put("last_name", this.last_name);
//
//        System.out.println(first_name);
//        System.out.println(last_name);
//
//        WSRequest request = ws.url("http://localhost:9005/editprofile");
//        return request.addHeader("Content-Type", "application/json")
//                .post(res)
//                .thenApply((WSResponse r) -> {
//                    return r;
//                });
//    }

}
