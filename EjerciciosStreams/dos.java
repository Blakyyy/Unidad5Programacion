package EjerciciosStreams;
import java.util.Scanner;

public class dos {

    public static void main(String[] args) {
        double area = getAreaTriangle();
        System.out.println("El area del triangulo es: " + area);
    }

    public static double getAreaTriangle(){
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        while(true){
            try {
                System.out.println("Introduzca la altura del triangulo: ");
                altura = Double.parseDouble(sc.nextLine());
                System.out.println("Introduzca la base del triangulo: ");
                base = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Porfavor introduzca un numero!");
            }
        }
        sc.close();
        area = base * altura / 2;
        return area;
    }
}