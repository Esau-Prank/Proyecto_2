public class Cajero {
 //Al momento de ejecutar el progrmam llamames a la clase de ejecucion en este caso que esta en Cajero
    public static void main(String[] args) {
    //Probar todos los caso de nombre del producto
    System.out.println("=====Prueba de Nombres=====\n");
    Producto nombProducto = new Producto("", 2, 100.0f);
    Producto nombProducto2 = new Producto(" ", 2,  100.0f);
    Producto nombProducto3 = new Producto("Galaxy",2,100.0f);

    System.out.println("Nombre recibido fue (\"\"); "+nombProducto.getnombre());
    System.out.println("Nombre recibido fue (\"\"\"); "+nombProducto2.getnombre());
    System.out.println("Nombre recibido fue (\"\"); "+nombProducto3.getnombre());

    //Probar los caso de precio
    System.out.println("\n=====Prueba de Precios=====\n");

    Producto preciProducto = new Producto("Galaxy ", 2, 100.0f);
    Producto preciProducto2 = new Producto("PS5 ", 2, -20000.0f);

    System.out.println("El precio de tu "+preciProducto.getnombre()+"seria de : "+preciProducto.getprecio()+"USD");
    System.out.println("El precio de tu "+preciProducto2.getnombre()+"seria de : "+preciProducto2.getprecio()+"USD\n");
    //Probar los caso de departamaentos
    System.out.println("\n=====Prueba de todos los departamentos=====\n");

    Producto depaProducto = new Producto("Tenis de Rayo Mcqueen ", 1, 5.0f);
    Producto depaProducto2 = new Producto("Nintendo Switch ", 2, 10.0f);
    Producto depaProducto3 = new Producto("Ceplillo de dientes ", 3, 50.0f);
    Producto depaProducto4 = new Producto("Bacardi ", 4, 80.0f);
    Producto depaProducto5  = new Producto("Mascara ", 0, 12.0f);

    System.out.println(depaProducto.toString());
    System.out.println(depaProducto2.toString());
    System.out.println(depaProducto3.toString());
    System.out.println(depaProducto4.toString());
    System.out.println(depaProducto5.toString());




    }
}