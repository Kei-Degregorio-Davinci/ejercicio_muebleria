public class Main {
    public static void main (String[] args){

        ObjetoVendible silla = new ObjetoVendible(2000.0, "Mi silla cómoda");
        Cliente mario = new  Cliente ("Mario Mario");
        Vendedor luigi = new Vendedor("Luigi Mario");
        //Mario va a querer reservar la silla
        Reserva reservaDeHoy = new Reserva (mario, luigi, silla);
        //reservaDeHoy.agregarReserva();
        Compra compraDeHoy = new Compra(mario, luigi);
        compraDeHoy.agregarAlCarrito(silla);
        compraDeHoy.generarTicket("Efectivo", 1, 0);


    }
}
