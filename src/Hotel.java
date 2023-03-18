import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Integer> listaHabitaciones;
    List<Reserva> listaReservas;

    public Hotel(){
        this.listaHabitaciones = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
    }

    public List<Reserva> mostrarListaDeReservas(){
        return this.listaReservas;
    }

    public void agregarHabitacion(Habitacion habitacion){
        this.listaHabitaciones.add(habitacion.numeroDeHabitacion);
    }


}
