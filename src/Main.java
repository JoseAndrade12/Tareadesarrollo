public class Main {

    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Diseñar interfaz";
        tarea1.responsable = "José";
        tarea1.horasEstimadas = 5;
        tarea1.completada = false;

        tarea2.titulo = "Crear base de datos";
        tarea2.responsable = "Carlos";
        tarea2.horasEstimadas = 8;
        tarea2.completada = true;

        tarea3.titulo = "Realizar pruebas";
        tarea3.responsable = "Miguel";
        tarea3.horasEstimadas = 4;
        tarea3.completada = false;

        System.out.println("TAREA 1 ");
        tarea1.mostrarInformacion();

        System.out.println("\nTAREA 2 ");
        tarea2.mostrarInformacion();

        System.out.println("\nTAREA 3 ");
        tarea3.mostrarInformacion();

        System.out.println("\nTAREA COMPLETADA");

        tarea2.completada = true;

        System.out.println("\nEstados de las tareas:");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();

        System.out.println("\nResponsables:");
        tarea1.mostrarResponsable();
        tarea2.mostrarResponsable();
        tarea3.mostrarResponsable();
    }
}