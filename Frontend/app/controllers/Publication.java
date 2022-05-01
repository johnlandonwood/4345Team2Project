package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.Date;
import java.util.concurrent.CompletionStage;

public class Publication {

    private String title;
    private String media_type;
    private String date;
    // will prob need to change data type of column date in publications to varchar type
    private String link;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getMediaType() {
        return media_type;
    }
    public void setMediaType(String mediaType) {
        this.media_type = mediaType;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public CompletionStage<WSResponse> addPublication() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        ObjectNode res = Json.newObject();
        res.put("title", this.title);
        res.put("media_type", this.media_type);
        res.put("date", this.date);
        res.put("link", this.link);

        System.out.println(title);
        System.out.println(media_type);
        System.out.println(date);
        System.out.println(link);

        WSRequest request = ws.url("http://localhost:9005/addPublication");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }



}
