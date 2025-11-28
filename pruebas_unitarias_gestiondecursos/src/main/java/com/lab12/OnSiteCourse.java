package com.lab12;

public class OnSiteCourse extends Course {

    private String room;
    private int quota;

    public OnSiteCourse(String title, int duration, String professor, String room, int quota) {
        super(title, duration, professor);
        this.room = room;
        this.quota = quota;
    }

    @Override
    public String showInformation() {
        return "[On Site] " + getTitle() + " (" + getDuration() + " hs) - Professor: "
            + getProfessor() + " - Room: " + room + ", Quota: " + quota;
    }
}