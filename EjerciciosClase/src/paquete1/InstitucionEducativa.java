/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    
    public void establecerNombre(String a) {
        nombre = a;
    }
    
    public void establecerTipoInstitucion(String c) {
        tipoInstitucion = c;
    }
    
    public void establecerNumeroAlumnos(int a) {
        numeroAlumnos = a;
    }
    
    public void establecerNumeroDocentes(int c) {
        numeroDocentes = c;
    }
    
    public void establecerNumeroSedes(int b) {
        numeroSedes = b;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }
    
    public int obtenerNumeroSedes() {
        return numeroSedes;
    }
}
