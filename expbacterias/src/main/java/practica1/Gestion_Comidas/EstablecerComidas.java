package practica1.Gestion_Comidas;
import practica1.Gestion_Experimento.Experimento;
import practica1.Gestion_Poblaciones.Poblaciones;

import java.time.LocalDate;
import java.util.Date;


public class EstablecerComidas extends Comida{

    public EstablecerComidas(int cantDiaIncremento, int cantMaxComida, int cantInicialComida, LocalDate diaDecrece){
        super(cantDiaIncremento, cantMaxComida,diaDecrece,cantInicialComida);
    }

    public void calcularDosisComida(Experimento fechaInicioExp, Experimento fechaFinExp, int cantMaxComida, LocalDate diaDecrece, int cantInicialComida) {
        LocalDate p;
        for(p=fechaInicioExp.getFechaInicioExp();p.isBefore(fechaFinExp.getFechaFinExp());p=p.plusDays(1)){
            cantInicialComida++;
            if (p.isAfter(diaDecrece)){
                cantInicialComida--;
            }else{
                continue;   
            }
            if(cantInicialComida==cantMaxComida){
                System.out.println("Error");
            }else{
                continue;
            }
        }
    }
}

