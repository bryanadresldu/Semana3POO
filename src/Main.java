import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese nombre del cocinero 1:");
        String nombre1=leer.nextLine();
        System.out.println("Ingrese anios de experiencia del cocinero 1:");
        int aniExperiencia1=leer.nextInt();
        leer.nextLine();//limpiar buffer
        System.out.println("Ingrese especialidad del cocinero 1:");
        String especialidad1=leer.nextLine();

        System.out.println("Ingrese nombre del cocinero 2:");
        String nombre2=leer.nextLine();
        System.out.println("Ingrese anios de experiencia del cocinero 2:");
        int aniExperiencia2=leer.nextInt();
        leer.nextLine();//limpiar buffer
        System.out.println("Ingrese especialidad del cocinero 2:");
        String especialidad2=leer.nextLine();

        System.out.println("Ingrese nombre del cocinero 3:");
        String nombre3=leer.nextLine();
        System.out.println("Ingrese anios de experiencia del cocinero 3:");
        int aniExperiencia3=leer.nextInt();
        leer.nextLine();//limpiar buffer
        System.out.println("Ingrese especialidad del cocinero 3:");
        String especialidad3=leer.nextLine();



        cocinero cocinero1=new cocinero(nombre1,aniExperiencia1,especialidad1);
        cocinero cocinero2=new cocinero(nombre2,aniExperiencia2,especialidad2);
        cocinero cocinero3=new cocinero(nombre3,aniExperiencia3,especialidad3);


        cocinero1.mostraRInformacion();
        cocinero2.mostraRInformacion();
        cocinero3.mostraRInformacion();



    }
}