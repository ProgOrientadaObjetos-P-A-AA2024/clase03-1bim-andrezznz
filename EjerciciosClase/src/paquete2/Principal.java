/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        
        String nombre = "La Salle";
        String tipoInstitucion = "Privada";
        int numeroAlumnos = 4500;
        int numeroDocentes = 3000;
        int numeroSedes = 20;
        
        i1.establecerNombre(nombre);
        i1.establecerTipoInstitucion(tipoInstitucion);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroSedes(numeroSedes);
        
        System.out.printf("Institucion Educativa\n\nNombre de la Institucion "
                + "Educativa: %s\nTipo de la Institucion Educativa: %s\nAlumnos "
                + "Inscritos: %s\nDocentes Calificados: %s\nSedes Nacionales: "
                + "%s", i1.obtenerNombre(), i1.obtenerTipoInstitucion(), 
                i1.obtenerNumeroAlumnos(), i1.obtenerNumeroDocentes(),
                i1.obtenerNumeroSedes());
    }
}
