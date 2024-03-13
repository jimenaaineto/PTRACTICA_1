package practica1.Gestion_Comidas;
import practica1.Gestion_Poblaciones.Poblaciones;


public class EstablecerComidas extends Comida{

    public EstablecerComidas(int cantDiaIncremento, int cantMaxComida, int cantInicialComida, int diaDecrece){
        super(cantDiaIncremento, cantMaxComida, cantInicialComida, diaDecrece);
    }

    public void calcularDosisComida(Poblaciones fechaInicio, int cantMaxComida, int diaDecrece, int cantInicialComida){
        int p=fechaInicio.getFechaInicio();

        
        for(int j=p;j<=diaDecrece;j++){
            do{
                cantInicialComida++;
                
            }while(cantInicialComida<cantMaxComida);    
        }
    }
}

