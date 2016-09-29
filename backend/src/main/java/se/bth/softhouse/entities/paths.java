package se.bth.softhouse.entities;

import com.sun.istack.internal.NotNull;
import se.bth.softhouse.resources.AudioResource;

public class paths {
    private int id;
    @NotNull
    private String name="rohith";
    private String pathname;
    AudioResource getpath = new AudioResource(null);
    public String y = getpath.sendpath();

    public paths() {

    }

        public paths(int id, String name, String y) {
        this.id = id;
        this.name = name;
        this.pathname= y;
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

    public String getpathName() {
        return pathname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setpathName(String pathname) {
        this.pathname = y;
    }
}

