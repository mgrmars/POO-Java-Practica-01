package javapractice01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Miguel Gonzales
 */
public class JavaPractice01 {

    public static void main(String[] args) {

        // Crear lista donde se almacenaran los alumnos
        ArrayList<Alumnos> alumnos = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        // Datos
        String nombre, apellidoPaterno, apellidoMaterno;
        int edad, ciclo;

        // Pide los datos 3 veces
        for (int i = 0; i < 3; i++) {

            // "Alumno n Ingresa el nombre"
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

            // alumnos.add() agrega un objeto/variable a la lista
            // new Alumnos() crea el objeto
            alumnos.add(new Alumnos(nombre, apellidoPaterno, apellidoMaterno, edad, ciclo));

            System.out.println();
        }

        // Muestra los datos de los alumnos
        // por cada alumno en alumnos, muestra los datos de cada alumno
        alumnos.forEach(alumno -> {
            System.out.println(alumno.toString());
        });

        // función para separar el código
        alumnoCicloMayor(alumnos);

    }

    // Determinar el alumno con mayor ciclo.
    // Dada una lista de alumnos, obtener el ciclo de cada alumno
    // luego almacenar los ciclos en un arreglo temporal
    // para despues ordenar el arreglo en orden creciente
    // y mostrar el último número.
    static void alumnoCicloMayor(ArrayList<Alumnos> a) {
        int[] ciclos = new int[3];

        // Pasando el atributo ciclo de alumnos a un array separado
        for (int i = 0; i < ciclos.length; i++) {
            ciclos[i] = a.get(i).getCiclo();
        }

        // Ordenar un arreglo en forma creciente.
        ordenamientoBurbuja(ciclos, ciclos.length);

        a.forEach(alumno -> {
            // El ultimo elemento del arreglo es el mas alto
            // recorremos el ArrayList de alumnos y comparamos el ciclo de cada
            // alumno, si el ciclo es igual al ciclo mayor del arreglo ciclos
            // entonces ese es el alumno con mayor ciclo.
            if (alumno.getCiclo() == ciclos[ciclos.length - 1]) {
                System.out.println("El alumno %s esta en el ciclo mas alto (%d)"
                        .formatted(alumno.getNombre(), alumno.getCiclo()));
            }
        });
    }

    // Ordena un array en forma creciente.
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
