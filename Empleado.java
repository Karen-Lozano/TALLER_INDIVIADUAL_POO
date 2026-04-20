import java.util.Scanner;

public class Empleado {
    String nombre;
    int horas;
    double pago;
    Scanner sc=new Scanner(System.in);
    public void ingresarDatos(){
        System.out.println("Ingrese su nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese las horas trabajadas: ");
        horas=sc.nextInt();
        System.out.println("Ingrese su pago por hora: ");
        pago=sc.nextDouble();
    }

    public double calcularSueldo(){
        return horas*pago;
    }
    public double bono(){
        return 20;
    }
    public double sueldoFinal(){
        return calcularSueldo()+bono();
    }

    public void mostrarDatos(){
        System.out.println("-------REPORTE EMPLEADO------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo Base: "+ calcularSueldo());
        System.out.println("Bono: "+bono());
        System.out.println("Sueldo Final: "+sueldoFinal());
    }
}
