package com.lab12;

public abstract class Course {
    private String title;
    private int duration;
    private String professor;

    public Course(String title, int duration, String professor) {
        this.title = title;
        this.duration = duration;
        this.professor = professor;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getProfessor() {
        return professor;
    }

    public abstract String showInformation();
}