/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinal;

/**
 *
 * @author Martin
 */
public class Partidos {
    //atributos 
    private int id ;
    private String equipo1 ;
    private String equipo2;
    private int goles_equipo1;
    private int goles_equipo2;
   
    //construcctores

    public Partidos(int id, String equipo1, String equipo2, int goles_equipo1, int goles_equipo2, int resultadoeq1, int resultadoeq2) {
        this.id = id;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.goles_equipo1 = goles_equipo1;
        this.goles_equipo2 = goles_equipo2;
       
    }
    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGoles_equipo1() {
        return goles_equipo1;
    }

    public void setGoles_equipo1(int goles_equipo1) {
        this.goles_equipo1 = goles_equipo1;
    }

    public int getGoles_equipo2() {
        return goles_equipo2;
    }

    public void setGoles_equipo2(int goles_equipo2) {
        this.goles_equipo2 = goles_equipo2;
    }

  
    
    
    
    }

   // metodo 
    