package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Publication;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


public class PublicationController extends Controller {

    public Result addPublication() {
        System.out.println("In add publication");
        JsonNode req = request().body().asJson();
        String title = req.get("title").asText();
        String media_type = req.get("media_type").asText();
        String date = req.get("date").asText();
        String link = req.get("link").asText();

        ObjectNode result = null;
        System.out.println("new publication");

        result = Json.newObject();
        Publication publication = new Publication();
        publication.title=title;
        publication.media_type = media_type;
        publication.date = date;
        publication.link = link;
        System.out.println("fields:");
        System.out.println(publication.title);
        System.out.println(publication.media_type);
        System.out.println(publication.date);
        System.out.println(publication.link);
        publication.save();
        result.put("title", title);
        result.put("media_type", media_type);
        result.put("date", date);
        result.put("link", link);
        result.put("body", title);
        return ok(result);
    }
}
