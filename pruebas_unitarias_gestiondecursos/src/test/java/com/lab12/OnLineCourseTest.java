package com.lab12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

    @Test
    void testConstructorValues() {
        OnlineCourse course = new OnlineCourse(
                "Java Básico",
                30,
                "Laura Gómez",
                "Udemy");

        // Verifica atributos heredados
        assertEquals("Java Básico", course.getTitle());
        assertEquals(30, course.getDuration());
        assertEquals("Laura Gómez", course.getProfessor());

        // Verifica atributo propio
        assertTrue(course.showInformation().contains("Udemy"));
    }

    @Test
    void testShowInformation() {
        OnlineCourse course = new OnlineCourse(
                "Spring Boot",
                45,
                "Miguel Torres",
                "Platzi");

        String expected = "[Online] Spring Boot (45 hs) - Professor: Miguel Torres - Platform: Platzi";

        assertEquals(expected, course.showInformation());
    }

    @Test
    void testPlatformNotEmpty() {
        OnlineCourse course = new OnlineCourse(
                "Python",
                20,
                "Sofia Ruiz",
                "Coursera");

        // Validación lógica usando assertTrue
        assertTrue(
                course.showInformation().contains("Coursera"),
                "La plataforma debe aparecer en la información");
    }
}
