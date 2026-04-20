import java.util.Scanner;
public class Producto {
    String nProducto;
    double precio;
    int cantidad;

    Scanner sc=new Scanner(System.in);

    public void ingresarDatos(){
        System.out.println("Ingrese el nombre del producto: ");
        nProducto=sc.nextLine();
        System.out.println("Ingrese el precio: ");
        precio=sc.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        cantidad=sc.nextInt();
    }

    public void mostrarFactura(){
        double total= precio*cantidad;
        System.out.println("------FACTURA------");
        System.out.println("Nombre del producto: "+nProducto);
        System.out.println("Precio unitario: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Total a pagar: "+total);
        if (total>1000){
            System.out.println("Se le aplicara un descuento del 10%.");
            double descuento=total*0.10;
            double total2=total-descuento;
            System.out.println("Descuento: "+descuento);
            System.out.println("Total a pagar: "+total2);
        }
    }
}
