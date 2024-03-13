package practica1.Gestion_Comidas;
import practica1.Gestion_Poblaciones.Poblaciones;

public class EstablecerComidas extends Comida{

    public EstablecerComidas(int cantDiaIncremento, int cantMaxComida, int cantInicialComida, int diaDecrece){
        super(cantDiaIncremento, cantMaxComida, cantInicialComida, diaDecrece);
    }

    public void calcularDosisComida(int fechaInicio, int cantMaxComida, int diaDecrece, int cantInicialComida){
        int p=0;
        fechaInicio=p;

        for(int j=fechaInicio;j<=diaDecrece;j++){
            do{
                cantInicialComida++;

            }while(cantInicialComida<cantMaxComida);    
        }
    }
}

