public class Producto {

    private String nombre;
    private String departamento;
    private float precio;
    private int opcion;
    

    public String productoDesconocido(int opcion){
        switch (opcion) {
            case 1: 
                return "Ropa";
            case 2:
                return "Electronica y tecnologia";
            case 3:
                return "Higiene y cuidado personal";
            case 4:
                return "Alimentos";
            default:
                return "Desconocido";
        }

    }

    private void setNombre(String nombre){
        if (nombre==null || nombre==""||nombre==" "){
            this.nombre="Producto Desconocido";
            }else{
                this.nombre=nombre;
            }
        }
    

    private void setPrecio(float precio){
        if (precio < 0){
            this.precio=100.0f;
        }else{
            this.precio=precio;
        }

    }

    // el constructor de la clase Producto que recibe los parametros nombre, departamento y precio para inicializar los atributos de la clase
    public Producto(String nombre,int opcion, float precio) {
        setNombre(nombre);
        this.departamento = productoDesconocido(opcion);
        setPrecio(precio);
    }
   //Los metodos para obtener los valores y que no se puedan modificar los valores de los atributos de la clase Producto
    public String getnombre() {
        return nombre;
    }

    public String getdepartamento() {
        return departamento;
    }

    public float getprecio() {
        return precio;
    }




    //El metodo toString() que devuelve una cadena de texto con la informacion del producto
    @Override
    public String toString() {
        String str = "Producto: " + nombre + ", Departamento: " + departamento + ", Precio: $" + precio;
        return str;
    }
}