import java.util.Scanner;

public class Planilla {
    String nCliente;
    double consumo;
    double costokw;
    Scanner sc=new Scanner(System.in);
    public void ingresarDatos(){
        System.out.println("Ingrese su nombre: ");
        nCliente=sc.nextLine();
        System.out.println("Ingrese el consumo: ");
        consumo=sc.nextDouble();
        System.out.println("Ingrese el costo por kW: ");
        costokw=sc.nextDouble();
    }

    public double calcularSubtotal(){
        return consumo*costokw;
    }

    public double calcularIVA(){
        return (consumo*costokw)*0.15;
    }

    public double calcularTotal(){
        return calcularSubtotal()+calcularIVA();
    }

    public void mostrarDatos(){
        System.out.println("Cliente: "+nCliente);
        System.out.println("Subtotal: "+calcularSubtotal());
        System.out.println("IVA: "+calcularIVA());
        System.out.println("Total a pagar: "+calcularTotal());
    }
}
