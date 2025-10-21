/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Angello
 */
public class Estudiante {
    
    private int codigo;
    private String grado;

    public Estudiante(int codigo, String grado) {
        this.codigo = codigo;
        this.grado = grado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Código: " + codigo + ", Grado: " + grado;
    }
    
}
