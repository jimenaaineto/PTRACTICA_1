package practica1.Gestion_Poblaciones;

import sun.util.calendar.BaseCalendar;

import java.time.LocalDate;
import java.util.Date;

import practica1.Gestion_Comidas.Comida;
import practica1.Gestion_Experimento.Experimento;

public class Poblaciones{
    
    String nombrePoblacion;
    LocalDate fechaInicio;
    LocalDate fechaFin;
    int cantidadInicial;
    Luminosidad luminosidad;
    public Comida dosisComida;
    
    public Poblaciones(Experimento fechaFinExp, String nombrePoblacion, LocalDate fechaFin, LocalDate fechaInicio, int cantidadInicial,  Luminosidad luminosidad, Comida dosisComida ){
        this.nombrePoblacion=nombrePoblacion;
        this.fechaFin=fechaFinExp.getFechaFinExp();
        this.fechaInicio=fechaInicio;
        this.cantidadInicial=cantidadInicial;
        this.luminosidad=luminosidad;
        this.dosisComida=dosisComida;
        
    }
    
    public String getNombrePoblacion() {
        return nombrePoblacion;
    }

    public void setNombrePoblacion(String nombrePoblacion) {
        this.nombrePoblacion = nombrePoblacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }


    public  Luminosidad getLuminosidad() {
        return luminosidad;
    }

    public void setluminosidad(Luminosidad luminosidad) {
        this.luminosidad = luminosidad;
    }

    public Comida getDosisComida() {
        return dosisComida;
    }

    public void setDosisComida(Comida dosisComida) {
        this.dosisComida = dosisComida;
    }

}
