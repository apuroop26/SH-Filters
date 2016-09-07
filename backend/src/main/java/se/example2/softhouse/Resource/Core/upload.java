package se.example2.softhouse.Resource.Core;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rohithvajhala on 01-09-2016.
 */
public class upload {

    @JsonProperty
    private String text;

    public upload(String text) {

        this.text = text;
    }
    public void setId(String text) {
        this.text = text;
        System.out.println("hello");
    }
}
