package com.lab12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

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

}