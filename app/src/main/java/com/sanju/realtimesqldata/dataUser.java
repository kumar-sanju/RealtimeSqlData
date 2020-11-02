package com.sanju.realtimesqldata;

public class dataUser {
    private String id;

    private String name;
    private String gender;
    private String title;
    private long time;

    public dataUser() {
    }

    public dataUser(String name, String gender, String title, long time) {
        this.name = name;
        this.gender = gender;
        this.title = title;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
