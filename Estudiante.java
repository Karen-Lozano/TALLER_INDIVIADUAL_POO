import java.util.Scanner;
public class Estudiante {
    String nombre;
    String carrera;
    int edad;

    Scanner sc=new Scanner(System.in);
    public void registrarDatos(){
        System.out.println("Ingrese su nombre: ");
        nombre= sc.nextLine();
        System.out.println("Ingrese su carrera: ");
        carrera=sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad=sc.nextInt();
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Carrera: "+carrera);
        System.out.println("Edad: "+edad);
        System.out.println("---------------");
    }
}
