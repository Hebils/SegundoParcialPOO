/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Angello
 */
public class ProfesorTest {
    
    @Test
    void testCalcularPagoMensual() {
        Profesor profesor = new Profesor("Carlos Lopez", 45, 112233445, "Calle del Sol 456", "10/07/1980", 12345678, "Matematicas", 160, 20.0);
        double expectedPagoMensual = (20.0 * 160) * 1.20;
        assertEquals(expectedPagoMensual, profesor.calcularPagoMensual(), 0.01);
    }

    @Test
    void testCalcularPrestacionesSociales() {
        Profesor profesor = new Profesor("Carlos Lopez", 45, 112233445, "Calle del Sol 456", "10/07/1980", 12345678, "Matematicas", 160, 20.0);
        double pagoMensual = profesor.calcularPagoMensual();
        double expectedPrestaciones = pagoMensual * 0.17;
        assertEquals(expectedPrestaciones, profesor.calcularPrestacionesSociales(), 0.01);
    }
    
}
