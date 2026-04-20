import java.util.Scanner;

public class Calificacion {
    String nombre;
    double n1, n2, n3;

    Scanner sc=new Scanner(System.in);
    public void ingresarDatos(){
        System.out.println("Ingrese su nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese su nota 1: ");
        n1=sc.nextDouble();
        System.out.println("Ingrese su nota 2:");
        n2=sc.nextDouble();
        System.out.println("Ingrese su nota 3:");
        n3=sc.nextDouble();
    }
    public double calcularPromedio(){
        double promedio=(n1+n2+n3)/3;
        return promedio;
    }
    public String estadoPromedio(){

        if (calcularPromedio()>=7){
            return "Aprobado.";
        }else {
            return "Reprobado.";
        }
    }


    public void mostrarInformacion(){
        System.out.println("----REPORTE ACADEMICO----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Promedio final: "+calcularPromedio());
        System.out.println("Estado: "+estadoPromedio());

    }

}

