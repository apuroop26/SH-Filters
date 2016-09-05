package se.bth.softhouse.entities;

import com.sun.istack.internal.NotNull;

/**
 * Created by apuroop on 01-09-2016.
 */
public class Audio {

    private int id;
    @NotNull
    private String name;

    public Audio() {

    }

    public Audio(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
