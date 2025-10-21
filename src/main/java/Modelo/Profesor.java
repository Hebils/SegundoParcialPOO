/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Angello
 */
public class Profesor {
    
    private int cedula;
    private String materia;
    private int horas;
    private double salario;
    private double prestaciones;

    public Profesor(int cedula, String materia, int horas, double salario, double prestaciones) {
        this.cedula = cedula;
        this.materia = materia;
        this.horas = horas;
        this.salario = salario;
        this.prestaciones = prestaciones;
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

    public double getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(double prestaciones) {
        this.prestaciones = prestaciones;
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
        return super.toString() + ", Cédula: " + cedula + ", Materia: " + materia + ", Salario Mensual: " + String.format("%.2f", calcularPagoMensual()) + ", Prestaciones Sociales: " + String.format("%.2f", calcularPrestacionesSociales());
    }
}
