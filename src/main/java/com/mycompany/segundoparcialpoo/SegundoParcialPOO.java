/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segundoparcialpoo;

import Modelo.Estudiante;
import Modelo.Persona;
import Modelo.Profesor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Angello
 */
public class SegundoParcialPOO {

    private static List<Persona> listaPersonas = new ArrayList<>();
    private static List<Estudiante> listaEstudiantes = new ArrayList<>();
    private static List<Profesor> listaProfesores = new ArrayList<>();
    
    public static void main(String[] args){
        
        int opcion;
        do{
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(
        "Menu \n" +
                
        "1. Agregar persona \n" +
                
        "2. Agregar profesor \n" +
                
        "3. Lista de estudiantes \n" +
                
        "4. Lista de profesores \n" +
                
        "5. Salir \n" +
                
        "Elige una opción"
        
        ));
        
        switch(opcion){
            
            case 1: 
                
                agregarEstudiante();
                
                break;
                
            case 2:
                
                agregarProfesor();
                
                break;
                
            case 3:
                
                
                
                break;
                
            case 4:
                
                
                
                break;
                
            case 5:
                
                JOptionPane.showMessageDialog(null,"Saliendo del sistema");
                
                break;
                
            default:
                
                JOptionPane.showMessageDialog(null, "Opcion invalida");
                
                break;
            
        }
            
        }while(opcion != 5);
        
    }
    
    public static void agregarEstudiante(){
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del estudiante:"));
        
        if(edad >= 18){
            
            JOptionPane.showMessageDialog(null, "No es un estudiante, intenta agregarlo como profesor");
            
            return;
            
        } else {
            String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Teléfono del estudiante:"));
            String direccion = JOptionPane.showInputDialog("Dirección del estudiante:");
            String nacimiento = JOptionPane.showInputDialog("Fecha de nacimiento del estudiante (YYYY-MM-DD):");
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código del estudiante:"));
            String grado = JOptionPane.showInputDialog("Grado del estudiante:");
        
            Estudiante nuevoEstudiante = new Estudiante(nombre, edad, telefono, direccion, nacimiento, codigo, grado);
            listaEstudiantes.add(nuevoEstudiante);
            listaPersonas.add(nuevoEstudiante);
            JOptionPane.showMessageDialog(null, "Estudiante registrado exitosamente.\n" + nuevoEstudiante.toString());
        }
        
    }
    
    public static void agregarProfesor(){
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del estudiante:"));
        
        if(edad < 18){
            
            JOptionPane.showMessageDialog(null, "No es un profesor, intenta agregarlo como estudiante");
            
            return;
            
        } else {
            String nombre = JOptionPane.showInputDialog("Nombre del profesor:");
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Teléfono del profesor:"));
            String direccion = JOptionPane.showInputDialog("Dirección del profesor:");
            String nacimiento = JOptionPane.showInputDialog("Fecha de nacimiento del profesor (YYYY-MM-DD):");
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Cédula del profesor:"));
            String materia = JOptionPane.showInputDialog("Área del profesor:");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario por hora del profesor:"));
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas dictadas en el mes:"));

            Profesor nuevoProfesor = new Profesor(nombre, edad, telefono, direccion, nacimiento, cedula, materia, horas, salario);
            listaProfesores.add(nuevoProfesor);
            listaPersonas.add(nuevoProfesor);
            JOptionPane.showMessageDialog(null, "Profesor registrado exitosamente.\n" + nuevoProfesor.toString());
        }
        
    }
    
    
    
}
