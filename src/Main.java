public class Main {
    public static void main(String[] args) {

        Hotel HotelJE =  new Hotel();
        Habitacion Habitacion1 = new Habitacion(1);
        Habitacion Habitacion2 = new Habitacion(2);
        Habitacion Habitacion3 = new Habitacion(3);
        HotelJE.agregarHabitacion(Habitacion1);
        HotelJE.agregarHabitacion(Habitacion2);
        HotelJE.agregarHabitacion(Habitacion3);
        System.out.println(HotelJE.listaHabitaciones);
    }
}