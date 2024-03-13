package practica1.Gestion_Poblaciones;

public class Poblaciones {
    
    private String nombrePoblacion;
    private int fechaInicio;
    private int fechaFin;
    private int cantidadInicial;
    private float temperatura;
    private Luminosidad luminosidad;
    private float/*AQUI VA A TENER QUE IR COMIDA */ dosisComida;
    
    public Poblaciones(String nombrePoblacion, int fechaFin, int fechaInicio, int cantidadInicial, float temperatura, Luminosidad luminosidad, float dosisComida ){
        this.nombrePoblacion=nombrePoblacion;
        this.fechaFin=fechaFin;
        this.fechaInicio=fechaInicio;
        this.cantidadInicial=cantidadInicial;
        this.temperatura=temperatura;
        this.luminosidad=luminosidad;
        this.dosisComida=dosisComida;
        
    }
    
    public String getNombrePoblacion() {
        return nombrePoblacion;
    }

    public void setNombrePoblacion(String nombrePoblacion) {
        this.nombrePoblacion = nombrePoblacion;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public  Luminosidad getLuminosidad() {
        return luminosidad;
    }

    public void setluminosidad(Luminosidad luminosidad) {
        this.luminosidad = luminosidad;
    }

    public float getDosisComida() {
        return dosisComida;
    }

    public void setDosisComida(float dosisComida) {
        this.dosisComida = dosisComida;
    }
}
