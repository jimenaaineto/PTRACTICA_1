package practica1.Gestion_Comidas;

    public class Comida {
        
        int cantMaxComida=300;
        int cantInicialComida=1;
        int diaDecrece=15;
        int cantDiaIncremento=0;

        public Comida(int cantMaxComida, int cantInicialComida, int diaDecrece, int cantDiaIncremento) {
            this.cantInicialComida = cantInicialComida;
            this.cantMaxComida = cantMaxComida;
            this.cantDiaIncremento=cantDiaIncremento;
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

        public int getCantInicialComida() {
            return cantInicialComida;
        }

        public void setCantInicialComida(int cantInicialComida) {
            this.cantInicialComida = cantInicialComida;
        }
    }