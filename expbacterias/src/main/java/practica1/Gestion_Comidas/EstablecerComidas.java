package practica1.Gestion_Comidas;
import practica1.Gestion_Poblaciones.Poblaciones;

import java.time.LocalDate;
import java.util.Date;


public class EstablecerComidas extends Comida{

    public EstablecerComidas(int cantDiaIncremento, int cantMaxComida, int cantInicialComida, LocalDate diaDecrece){
        super(cantDiaIncremento, cantMaxComida,diaDecrece,cantInicialComida);
    }

    public void calcularDosisComida(Poblaciones fechaInicio, Poblaciones fechaFin, int cantMaxComida, LocalDate diaDecrece, int cantInicialComida) {
        LocalDate p;
        for(p=fechaInicio.getFechaInicio();p<diaDecrece;p++){
            cantInicialComida=++;

        }


    }
}

