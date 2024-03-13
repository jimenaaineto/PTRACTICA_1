package practica1.Gestion_Experimento;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

import practica1.Gestion_Poblaciones.Luminosidad;
import practica1.Gestion_Poblaciones.Poblaciones;
import practica1.Gestion_Comidas.Comida;

public class Experimento {
    private String nombreExp;
    Date fechaInicioExp;
    Date fechaFinExp;
    /* public Experimento() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicioExp);
        calendar.add(Calendar.DATE, 30);
        fechaFinExp = calendar.getTime();
    } */
    //private float temperatura;==media temp de cada poblacion
    Luminosidad luminosidad;
    private float/*AQUI VA A TENER QUE IR COMIDA */ dosisComida;
    ArrayList<Poblaciones> todasPoblaciones = new ArrayList<>();
    public Experimento(String nombreExp, Date fechaInicioExp, Date fechaFinExp, /*float temperatura*/ Luminosidad luminosidad, float dosisComida, ArrayList<Poblaciones> todasPoblaciones){
        this.nombreExp=nombreExp;
        this.fechaInicioExp=fechaInicioExp;
        this.fechaFinExp=fechaFinExp;
        //this.temperatura=temperatura;
        this.luminosidad=luminosidad;
        this.dosisComida=dosisComida;
        this.todasPoblaciones=todasPoblaciones;

    }
}
