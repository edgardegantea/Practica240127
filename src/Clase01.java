public class Clase01 {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        // Objeto o instancia de la clase Persona
        Persona persona1 = new Persona();

        // Asignar datos a las variables del objeto persona1
        persona1.nombre = "Edgar";
        persona1.apellidos = "Degante Aguilar";
        persona1.fecha_nacimiento = "1988-06-18";
        persona1.edad = 35;

        // Impresión de información del objeto persona1
        System.out.println(persona1.nombre);
        System.out.println(persona1.apellidos);
        System.out.println(persona1.fecha_nacimiento);
        System.out.println(persona1.edad);

        // Impresión de información con concatenación
        System.out.println(
                "Nombre: " + persona1.nombre.toUpperCase() +
                " " + persona1.apellidos.toUpperCase() +
                "\nEdad: " + persona1.edad + " años" +
                "\nFecha de nacimiento: " + persona1.fecha_nacimiento
        );
    }
}


class Persona {
    String nombre, apellidos, fecha_nacimiento;
    byte edad;
}
