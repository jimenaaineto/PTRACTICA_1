package practica1.Gestion_Poblaciones;

import practica1.Gestion_Comidas.Comida;
import practica1.Gestion_Experimento.Experimento;

import java.time.LocalDate;

public class EstablecerPoblaciones extends Poblaciones {
    Poblaciones[] poblacion;

    public EstablecerPoblaciones(Poblaciones[] poblacion, Experimento fechaFinExp, String nombrePoblacion, LocalDate fechaFin, LocalDate fechaInicio, int cantidadInicial, Luminosidad luminosidad, Comida dosisComida){
        super(fechaFinExp,nombrePoblacion,fechaFin,fechaInicio,cantidadInicial,luminosidad,dosisComida);
        this.poblacion=poblacion;
    }

    public Poblaciones[] getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Poblaciones[] poblacion) {
        this.poblacion = poblacion;
    }


    public void modificarPob (){

    }
    modificarpob()
    gestionarpob()
    guardararchivo()
    crearpoblacion()
    borrarpob()
}
