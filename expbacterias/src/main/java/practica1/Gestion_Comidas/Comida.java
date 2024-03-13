package practica1.Gestion_Comidas;

import java.time.LocalDate;
import java.util.Date;

public class Comida {
        
        int cantMaxComida=300;
        int cantInicialComida=1;
        LocalDate diaDecrece;
        int cantDiaIncremento=0;//para que me sirve????????????

        public Comida(int cantMaxComida, int cantInicialComida, LocalDate diaDecrece, int cantDiaIncremento) {
            this.cantInicialComida = cantInicialComida;
            this.cantMaxComida = cantMaxComida;
            this.cantDiaIncremento=cantDiaIncremento;
            this.diaDecrece=diaDecrece;
        }

        public int getCantDiaIncremento(){
            return cantDiaIncremento;
        }

        public void setCantDiaIncremento(int cantDiaIncremento){
            this.cantDiaIncremento=cantDiaIncremento;
        }

        public int getCantMaxComida() {
            return cantMaxComida;
        }

        public void setCantMaxComida(int cantMaxComida) {
            this.cantMaxComida = cantMaxComida;
        }
        public void setCantInicialComida(int cantInicialComida) {
        this.cantInicialComida = cantInicialComida;
    }
        public int getCantInicialComida() {
            return cantInicialComida;
        }

        public void setDiaDecrece(LocalDate diaDecrece){this.diaDecrece = diaDecrece;}
        public LocalDate getDiaDecrece() {return diaDecrece;}
    }
