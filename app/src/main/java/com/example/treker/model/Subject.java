package com.example.treker.model;

public class Subject {
    final int id;
    final String title;
    final String time;
    final String data;
    final String kind;

    public Subject(int id, String title, String time, String data, String kind) {
        this.id = id;
        this.title = title;
        this.time = time;
        this.data = data;
        this.kind = kind;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public String getData() {
        return data;
    }

    public String getKind() {
        return kind;
    }
}