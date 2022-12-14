public class Compra extends Transaccion{
    private double precioFinal;

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Compra(Cliente cliente, Vendedor vendedor) {
        super(cliente, vendedor);


    }

    public void agregarAlCarrito(ObjetoVendible vendible){
        if (vendible.getReserva() != null) {
          if (vendible.getReserva().getCliente() != getCliente()) {
              System.out.println(String.format(
                      "El producto ya fue reservado a %s",
                      vendible.getReserva().getCliente().getNombre()

              ));
              return;
          }

        }
        super.agregarVendible(vendible);
        System.out.println(String.format(
                "El producto %s ya fue agregado al carrito con éxito",
                vendible.getNombre()
        ));
    }

    public void generarTicket(String medioPago, int cantidadCuotas, int descuento){
        int descuentoFinal = descuento;
        if (medioPago =="Efectivo"){
            descuentoFinal = 10;
        }
        int finalDescuento = descuentoFinal;
        System.out.println("Lista de compra");
        getVendibles().forEach(vendible -> {
            vendible.setCompra(this);

            double precioProducto = vendible.getPrecioLista()*(100 - finalDescuento)/100;
            precioFinal += precioProducto;
            System.out.println(String.format(
                    "%s %f (con descuento%f)",
                    vendible.getNombre(),
                    vendible.getPrecioLista(),
                    precioProducto
                    ));
        });
        System.out.println(getPrecioFinal());
    }


}
