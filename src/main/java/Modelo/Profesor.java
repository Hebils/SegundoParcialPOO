/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Angello
 */
public class Profesor extends Persona{
    
    private int cedula;
    private String materia;
    private int horas;
    private double salario;

    public Profesor(String nombre, int edad, int telefono, String direccion, String nacimiento, int cedula, String materia, int horas, double salario) {
        super(nombre, edad, telefono, direccion, nacimiento);
        this.cedula = cedula;
        this.materia = materia;
        this.horas = horas;
        this.salario = salario;
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularPagoMensual() {
        double pagoBase = salario * horas;
        double bonoPreparacion = pagoBase * 0.20;
        return pagoBase + bonoPreparacion;
    }
    
    public double calcularPrestacionesSociales() {
        return calcularPagoMensual() * 0.17;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCédula: " + cedula + "\nMateria: " + materia + "\nSalario Mensual: " + String.format("%.2f", calcularPagoMensual()) + "\nPrestaciones Sociales: " + String.format("%.2f", calcularPrestacionesSociales());
    }
}
