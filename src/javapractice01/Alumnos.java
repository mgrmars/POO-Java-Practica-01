package javapractice01;

/**
 *
 * @author Miguel Gonzales
 */
public class Alumnos {

    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private int edad;
    private int ciclo;

    public Alumnos(String nombre, String apellidoMaterno, String apellidoPaterno, int edad, int ciclo) {
        setNombre(nombre);
        setApellidoMaterno(apellidoMaterno);
        setApellidoPaterno(apellidoPaterno);
        setEdad(edad);
        setCiclo(ciclo);
    }

    @Override
    public String toString() {
        return "Nombre: %s \nApellido Paterno: %s \nApellido Materno: %s \nEdad: %d \nCiclo: %d \n"
                .formatted(nombre, apellidoPaterno, apellidoMaterno, edad, ciclo);
    }

    public String getNombre() {
        return nombre;
    }

    // "debe tener al menos 3 letras".
    public void setNombre(String nombre) {
        if (nombre.length() >= 3) {
            this.nombre = nombre;
        } else {
            // Muestra un error en la consola.
            throw new Error("\"nombre\" tiene que tener 3 o mas caracteres");
        }
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        if (apellidoMaterno.length() >= 3) {
            this.apellidoMaterno = apellidoMaterno;
        } else {
            throw new Error("\"apellidoMaterno\" tiene que tener 3 o mas caracteres");
        }
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        if (apellidoPaterno.length() >= 3) {
            this.apellidoPaterno = apellidoPaterno;
        } else {
            throw new Error("\"apellidoPaterno\" tiene que tener 3 o mas caracteres");
        }
    }

    public int getEdad() {
        return edad;
    }

    // "no puede ser un número negativo ni menor a 15"
    public void setEdad(int edad) {
        if (edad >= 15) {
            this.edad = edad;
        } else {
            throw new Error("\"edad\" tiene que ser mayor o igual a 15");
        }
    }

    public int getCiclo() {
        return ciclo;
    }

    // "del  1 al 10"
    public void setCiclo(int ciclo) {
        if (ciclo >= 1 && ciclo <= 10) {
            this.ciclo = ciclo;
        } else {
            throw new Error("\"ciclo\" tiene que ser mayor o igual a 1 y menor o igual a 10");
        }
    }

}
