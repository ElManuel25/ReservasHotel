public class Habitacion {
    int numeroDeHabitacion;
    boolean disponibilidad;

    public Habitacion(int numeroDeHabitacion){
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public int mostrarNumeroDeHabitacion(){
        return this.numeroDeHabitacion;
    }

    public boolean estaDisponible(){
        return this.disponibilidad;
    }


}
