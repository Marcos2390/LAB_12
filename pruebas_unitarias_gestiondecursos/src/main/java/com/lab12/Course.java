package com.lab12;

public class Course {
    private String title;
    private int duration;
    private String professor;

    public Course(String title, int duration, String professor) {
        this.title = title;
        this.duration = duration;
        this.professor = professor;
    }

    public Course(String title, int duration) {
        this(title, duration, null);
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

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String showInformation() {
        String prof = (professor != null) ? professor : "N/A";
        return "Curso: " + title + " - Duración: " + duration + " horas - Profesor: " + prof;
    }
}