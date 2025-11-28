package com.lab12;

public class OnlineCourse extends Course {

    private String platform;

    public OnlineCourse(String title, int duration, String professor, String platform) {
        super(title, duration, professor);
        this.platform = platform;
    }

    @Override
    public String showInformation() {
        return "[Online] " + getTitle() + " (" + getDuration() + " hs) - Professor: "
                + getProfessor() + " - Platform: " + platform;
    }
}