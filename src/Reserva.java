import java.util.Date;

public class Reserva {
    int numeroReserva;
    String nombreCliente;
    Date fecha;
    int numeroDePersonas;
    Habitacion habitacion;
    int precio;


    public Reserva(int numeroReserva, String nombreCliente, Date fecha, Habitacion habitacion, int numeroDePersonas, int precio){
        this.nombreCliente = nombreCliente;
        this.numeroReserva = numeroReserva;
        this.fecha = fecha;
        this.numeroDePersonas = numeroDePersonas;
        this.precio = precio;
        this.habitacion = habitacion;
    }

    public void mostrarReserva(int id){

    }
}

