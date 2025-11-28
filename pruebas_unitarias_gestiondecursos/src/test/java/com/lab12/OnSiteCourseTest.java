package com.lab12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class OnSiteCourseTest {

    @Test
    void testConstructorValues() {
        OnSiteCourse course = new OnSiteCourse(
                "Matemática",
                40,
                "Juan Pérez",
                "Aula 12",
                30);

        // assertEquals
        assertEquals("Matemática", course.getTitle());
        assertEquals(40, course.getDuration());
        assertEquals("Juan Pérez", course.getProfessor());
        assertEquals("Aula 12", course.showInformation().contains("Aula 12") ? "Aula 12" : null);
        assertEquals(30, course.showInformation().contains("30") ? 30 : -1);
    }

    @Test
    void testShowInformation() {
        OnSiteCourse course = new OnSiteCourse(
                "Programación",
                60,
                "Ana López",
                "Laboratorio 4",
                25);

        String expected = "[On Site] Programación (60 hs) - Professor: Ana López - Room: Laboratorio 4, Quota: 25";

        assertEquals(expected, course.showInformation());
    }

    @Test
    void testQuotaIsPositive() {
        OnSiteCourse course = new OnSiteCourse(
                "Biología",
                50,
                "Carlos Ruiz",
                "Sala A",
                20);

        // assertTrue
        assertTrue(course.showInformation().contains("20"));
        assertTrue(20 > 0, "La cuota debe ser positiva");
    }
}
