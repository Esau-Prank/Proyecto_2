public class Ticket {

    private Producto pro1;
    private Producto pro2;
    private float total;
    private float dineroRecibido;
    private float cambio;
    
  
    public Ticket(Producto pro1, Producto pro2, float dineroRecibido) {
        this.pro1 = pro1;
        this.pro2 = pro2;
        this.total = pro1.getprecio() + pro2.getprecio();
        this.dineroRecibido = dineroRecibido;
        this.cambio = dineroRecibido - this.total;
    }
    public Producto getpro1() {
        return pro1;
    }

    public Producto getpro2() {
        return pro2;
    }
    //Metodo
    @Override 
    public String toString() {
        String str = "==== Ticket de Compra ====\n" +
                "Producto 1: " + pro1.getnombre() + " - Precio: $" + pro1.getprecio()+"MXN" + "\n" +
                "Producto 2: " + pro2.getnombre() + " - Precio: $" + pro2.getprecio() + "MXN" + "\n" +
                "Total: $" + total + "MXN" + "\n" +
                "Dinero recibido: $" + dineroRecibido + "MXN" + "\n" +
                "Cambio: $" + cambio + "MXN";
        return str;
    }
}
