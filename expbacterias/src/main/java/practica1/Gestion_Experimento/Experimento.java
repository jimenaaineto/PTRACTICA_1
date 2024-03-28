package practica1.Gestion_Experimento;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;


import practica1.Gestion_Poblaciones.Luminosidad;
import practica1.Gestion_Poblaciones.Poblaciones;
import practica1.Gestion_Comidas.Comida;

public class Experimento implements Serializable {
        String nombreExp;
        LocalDate fechaInicioExp;
        LocalDate fechaFinExp;
        double temp;
        Luminosidad luminosidad;
        Comida dosisComida;
        ArrayList<Poblaciones> todasPoblaciones = new ArrayList<>();

        
    public Experimento(String nombreExp, LocalDate fechaInicioExp, LocalDate fechaFinExp, double temp, Luminosidad luminosidad, Comida dosisComida ){
        this.nombreExp=nombreExp;
        this.fechaInicioExp=fechaInicioExp;
        this.fechaFinExp=fechaInicioExp.plusDays(30);
        this.temp=temp;
        this.luminosidad=luminosidad;
        this.dosisComida=dosisComida;

    }

    public Experimento() {
        this.nombreExp = " ";
        this.fechaInicioExp = LocalDate.ofEpochDay(0);
        this.fechaFinExp = fechaInicioExp.plusDays(30);
        this.temp = 0;
        this.luminosidad = null;
        this.dosisComida = null;
    }

        // Getter y Setter para nombreExp
    public String getNombreExp() {return nombreExp;}
    public void setNombreExp(String nombreExp) {this.nombreExp = nombreExp;}
    // Getter y Setter para fechaInicioExp
    public LocalDate getFechaInicioExp() {return fechaInicioExp;}
    public void setFechaInicioExp(LocalDate fechaInicioExp) {this.fechaInicioExp = fechaInicioExp;}
    // Getter y Setter para fechaFinExp
    public LocalDate getFechaFinExp() {return fechaFinExp;}
    public void setFechaFinExp(LocalDate fechaFinExp) {this.fechaFinExp = fechaFinExp;}
    // Getter y Setter para temp
    public double getTemp() {return temp;}
    public void setTemp(double temp) {this.temp = temp;}
    // Getter y Setter para todasPoblaciones
    public ArrayList<Poblaciones> getTodasPoblaciones() {return todasPoblaciones;}
    public void setTodasPoblaciones(ArrayList<Poblaciones> todasPoblaciones) {this.todasPoblaciones = todasPoblaciones;}


    @Override
    public String toString() {
        return "Su experimento:" +
                "\n Nombre: " + nombreExp +
                "\n Comienzo experimento: " + fechaInicioExp +
                "\n Fin experimento: " + fechaFinExp +
                "\n Temperatura: " + temp + "º" +
                "\n Luminosidad: " + luminosidad +
                "\n Dosis comida: " + dosisComida ;
    }



}

