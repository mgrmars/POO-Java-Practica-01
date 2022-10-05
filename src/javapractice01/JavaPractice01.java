package javapractice01;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaPractice01 {

    public static void main(String[] args) {

        /*        
        Alumnos juanito = new Alumnos("juanito", "perez", "perez", 18, 2);
        Alumnos pedrito = new Alumnos("pedrito", "perez", "perez", 17, 1);
        Alumnos miguelito = new Alumnos("miguelito", "perez", "perez", 19, 3);

        System.out.println(juanito.toString());
        System.out.println(pedrito.toString());
        System.out.println(miguelito.toString());
         */
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String nombre, apellidoPaterno, apellidoMaterno;
        int edad, ciclo;

        // Pide los datos 3 veces
        for (int i = 0; i < 3; i++) {
            System.out.println("Alumno " + (i + 1) + " Ingresa el nombre ");
            nombre = scan.nextLine();

            System.out.println("Alumno " + (i + 1) + " Ingresa el apellido paterno");
            apellidoPaterno = scan.nextLine();

            System.out.println("Alumno " + (i + 1) + " Ingresa el apellido materno ");
            apellidoMaterno = scan.nextLine();

            System.out.println("Alumno " + (i + 1) + " Ingresa la edad");
            edad = scan.nextInt();
            scan.nextLine();

            System.out.println("Alumno " + (i + 1) + " Ingresa el ciclo");
            ciclo = scan.nextInt();
            scan.nextLine();

            // Crear objetos
            alumnos.add(new Alumnos(nombre, apellidoPaterno, apellidoMaterno, edad, ciclo));

            System.out.println();
        }

        // Muestra los datos de los alumnos
        alumnos.forEach(alumno -> {
            System.out.println(alumno.toString());
        });
        
        alumnoCicloMayor(alumnos);

    }

    static void alumnoCicloMayor(ArrayList<Alumnos> a) {
        int[] ciclos = new int[3];

        // Pasando el atributo ciclo de alumnos a un array separado
        for (int i = 0; i < ciclos.length; i++) {
            ciclos[i] = a.get(i).getCiclo();
        }

        // ordenar un arreglo en forma creciente
        ordenamientoBurbuja(ciclos, ciclos.length);

        a.forEach(alumno -> {
            // el ultimo elemento del arreglo es el mas alto
            // recorremos el ArrayList de alumnos y comparamos el ciclo de cada
            // alumno, si el ciclo es igual al ciclo mayor del arreglo ciclos
            // entonces ese es el alumno con mayor ciclo
            if (alumno.getCiclo() == ciclos[ciclos.length - 1]) {
                System.out.println("El alumno %s esta en el ciclo mas alto (%d)".formatted(alumno.getNombre(), alumno.getCiclo()));
            }
        });
    }

    static void ordenamientoBurbuja(int[] a, int n) {
        int i, j, aux;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }
}
