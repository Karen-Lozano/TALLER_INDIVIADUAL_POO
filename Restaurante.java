import java.util.Scanner;

public class Restaurante {
    String cliente;
    String plato;
    double precio;
    int cantidad;
    Scanner sc=new Scanner(System.in);
    public void ingresarDatos(){
        System.out.println("Ingrese su nombre: ");
        cliente=sc.nextLine();
        System.out.println("Ingrese el nombre del plato: ");
        plato=sc.nextLine();
        System.out.println("Ingrese la cantidad: ");
        cantidad=sc.nextInt();
        System.out.println("Ingrese el precio: ");
        precio=sc.nextDouble();
    }

    public double calcularSubtotal(){
        return cantidad*precio;
    }
    public double calcularDescuento(){
        if (calcularSubtotal()>25){
            return calcularSubtotal()*0.10;
        }else{
            return 0;
        }
    }

    public double calcularTotal(){
        return calcularSubtotal()-calcularDescuento();

    }

    public void mostrarInformacion(){
        double subtotal = calcularSubtotal();
        double descuento = calcularDescuento();
        double total = calcularTotal();
        System.out.println("-----CUENTA DEL PEDIDO------");
        System.out.println("Cliente: "+cliente);
        System.out.println("Plato: "+plato);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Subtotal: "+calcularSubtotal());
        System.out.println("Descuento: "+calcularDescuento());

        if (descuento > 0) {
            System.out.println("Usted obtuvo un descuento del 10%");
        }
        System.out.println("Total final: " + total);
    }
}


