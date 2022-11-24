public class Main {
    public static void main (String[] args){

        ObjetoVendible silla = new ObjetoVendible(2000.0, "Mi silla cómoda");
        ObjetoVendible mesa = new ObjetoVendible(3000.0, "Mi mesa ratona");
        Cliente mario = new  Cliente ("Mario Mario");
        Cliente sergio = new Cliente("Sergio");
        Vendedor luigi = new Vendedor("Luigi Mario");
        //Mario va a querer reservar la silla
        Reserva reservaDeHoy = new Reserva (mario, luigi, silla);
        Reserva reservaDeManiana = new Reserva (sergio, luigi, mesa);
        //reservaDeHoy.agregarReserva();
        Compra compraDeHoy = new Compra(mario, luigi);
        compraDeHoy.agregarAlCarrito(silla);
        compraDeHoy.agregarAlCarrito(mesa);
        compraDeHoy.generarTicket("Efectivo", 1, 0);


    }
}
