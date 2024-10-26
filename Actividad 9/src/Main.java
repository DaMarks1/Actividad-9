import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        int edad = 0;

        System.out.println("Cuantos estudiantes va ingresar?");
        int cantidad = scanner.nextInt();

        Estudiante[] estudiante = new Estudiante[cantidad];

        for(int i=0; i < cantidad; i++){
            scanner.nextLine();
         System.out.println("Escribe nombre: " );
         nombre = scanner.nextLine();
         System.out.println("Cual es la edad?: " );
         edad = scanner.nextInt();
         estudiante[i] = new Estudiante (nombre,edad);
        }

        System.out.println("Estudiantes: ");
        for (int i =0; i<cantidad; i++){
            System.out.println("Estudiante(s) " + (i+1) + "");
            System.out.println("Nombre(s): " + estudiante[i].getNombre());
            System.out.println("Edad: " + estudiante[i].getEdad());
        }

        scanner.close();


    }
}