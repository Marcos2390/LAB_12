package com.lab12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CourseTest {
    @Test
    void testConstructorWithoutProfessor() {
        Course c = new Course("Python", 30);

        assertEquals("Python", c.getTitle());
        assertEquals(30, c.getDuration());
        assertNull(c.getProfessor());

        String expected = "Curso: Python - Duración: 30 horas - Profesor: N/A";
        assertEquals(expected, c.showInformation());
    }

    class Course {
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

        public String showInformation() {
            String prof = (professor != null) ? professor : "N/A";
            return "Curso: " + title + " - Duración: " + duration + " horas - Profesor: " + prof;
        }
    }
}
