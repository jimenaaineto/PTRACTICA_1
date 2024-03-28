package practica1.Gestion_Experimento;

import practica1.Gestion_Comidas.Comida;
import practica1.Gestion_Poblaciones.Luminosidad;
import practica1.Gestion_Poblaciones.Poblaciones;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class EstablecerExperimento extends Experimento{

    public EstablecerExperimento(String nombreExp, LocalDate fechaInicioExp, LocalDate fechaFinExp, double temp, Luminosidad luminosidad, Comida dosisComida ){
        super(nombreExp,fechaInicioExp,fechaFinExp,temp,luminosidad,dosisComida );
    }

    public void anadirNuevaDosis(Comida anadirDosis){
        dosisComida=anadirDosis;
    }

    public void anadirNuevaPoblacion(Poblaciones anadirPoblaciones){
        todasPoblaciones.add(anadirPoblaciones);
    }

    public void visualizarPoblaciones(){
        for (Poblaciones todasPoblacione : todasPoblaciones) {
            System.out.println(todasPoblacione.getNombrePoblacion());
        }
    }
    public static Experimento abrirFile() {

        return null;
    }

    public static void guardarExp(){

    }

    public static void guardarComo(){

    }
}
