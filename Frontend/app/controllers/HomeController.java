package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.CustomExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.*;
import java.util.concurrent.CompletionStage;

import play.db.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


import javax.inject.*;


/**
 * Software Service Market Place
 */
public class HomeController extends Controller {




    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.login.render(""));
    }

    /**
     * Index page
     */
    public Result signup() {
        return ok(views.html.register.render(null));
    }

    public CompletionStage<Result> loginHandler() {

        Form<User> loginForm = formFactory.form(User.class).bindFromRequest();
        if (loginForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.login.render(""));  // send parameter like register so that user could know
        }

        return loginForm.get().checkAuthorized()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null && r.asJson().asBoolean()) {
                        System.out.println(r.asJson());
                        // add username to session
                        session("username",loginForm.get().getUsername());   // store username in session for your project
                        // redirect to index page, to display all categories
                        return ok(views.html.index.render("Welcome!!! " + loginForm.get().getUsername()));
                    } else {
                        System.out.println("response null");
                        String authorizeMessage = "Incorrect Username or Password ";
                        return badRequest(views.html.login.render(authorizeMessage));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> signupHandler() {

        Form<User> registrationForm = formFactory.form(User.class).bindFromRequest();
        if (registrationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.register.render(null));
        }
        return registrationForm.get().registerUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        return ok(login.render(""));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.register.render("Username already exists"));
                    }
                }, ec.current());

    }

    public Result myProfile(String first_name, String last_name, String occupation, String bio, String phone, String email) {
        return ok(views.html.myprofile.render(first_name, last_name, occupation, bio, phone, email));
    }

    public CompletionStage<Result> addPublicationHandler() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest(views.html.register.render(null));
        }
        return publicationForm.get().addPublication()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        return ok(myprofile.render("Landon", "Wood", "CS Student", "Junior Computer Science Student at SMU.", "214-601-6524", "landonw@smu.edu"));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.myprofile.render("-", "-", "-", "-", "-", "-"));
                    }
                }, ec.current());
    }







}