package com.lab12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CourseTest {

    @Test
    void testConstructorStoresValues() {
        Course c = new Course("Python", 30);

        assertEquals("Python", c.getTitle());
        assertEquals(30, c.getDuration());
    }

    @Test
    void testConstructorWithAndWithoutProfessor() {
        Course courseWithoutProfessor = new Course("Java", 40);
        Course courseWithProfessor = new Course("Java", 40, "Juan Pérez");

        assertNull(courseWithoutProfessor.getProfessor());
        assertEquals("Juan Pérez", courseWithProfessor.getProfessor());
    }

    @Test
    void testShowInformation() {
        Course c = new Course("Python", 30);

        String expected = "Curso: Python - Duración: 30 horas - Profesor: N/A";
        assertEquals(expected, c.showInformation());
    }
}
