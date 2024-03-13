package practica1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args )
    {
        
    }

    public static int menuSeleccion(){
        Scanner leer=new Scanner(System.in);
        System.out.println( "1.Abrir un archivo que contenga un experimento\n"+
                "2.Crear un nuevo experimento\n" + 
                "3.Crear una población de bacterias y añadirla al experimento actual\n" +
                "4.Visualizar los nombres de todas las poblaciones de bacterias del experimento actual\n" +
                "5.Borrar una población de bacterias del experimento actual\n" +
                "6.Ver información detallada de una población de bacterias del experimento actual\n" +
                "7.Guardar (se supone que para usar esta opción previamente hemos abierto un archivo)\n" +
                "8.Guardar como" );
        int opcion=leer.nextInt();
        return opcion;
    }
}
