import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList <PeliculaSerie> peliculasSeries = new ArrayList<>();
    public static ArrayList <Persona> personas = new ArrayList<>();
    public  static ArrayList <Visionado> visionados = new ArrayList<>();

    public static void menu (){
        Scanner teclado = new Scanner(System.in);
        String opcion;
        do {

            System.out.println();
            System.out.println("---- NETFLIX ----");
            System.out.println();
            System.out.println("Operaciones disponibles");
            System.out.println();
            System.out.println("1. Registrar cliente");
            System.out.println("2. Nuevo Visionado");
            System.out.println("3. Listar Visionados");
            System.out.println("4. Nueva Pelicula o Serie");
            System.out.println("5. Salir");
            System.out.println();

            opcion = teclado.nextLine();

            switch (opcion){
                case "1"-> agregarCliente();
                case "2"-> nuevoVisionado();
                case "3"-> listarVisionados();
                case "4"-> nuevaPeliculaSerie();
                case "5"-> System.out.println("Saliendo...");
                default -> System.out.println("ERROR EN LA SELECCION DE OPCION DEL MENU");
            }
        }while (!opcion.equals("5"));
    }
    public static void agregarCliente () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un DNI");
        String dni = teclado.nextLine();
        System.out.println("Introduzca un Nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca un email");
        String email = teclado.nextLine();
        Persona p1 = new Persona(dni , nombre , email);

        personas.add(p1);
    }
    public static void nuevoVisionado () {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Introduzca el DNI de la persona que realiza el visionado");
        String dni = teclado.nextLine();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)){
                System.out.println("Introduzca el ID de la pelicula o serie que va a visionar");
                int id = Integer.parseInt(teclado.nextLine());
                for (int j = 0; j < peliculasSeries.size(); j++) {
                    if (peliculasSeries.get(j).getId() == id){
                        Visionado v1 = new Visionado(personas.get(i) , peliculasSeries.get(j) , LocalDateTime.now());
                        visionados.add(v1);
                    }else {
                        System.out.println("El ID de la pelicula no esta en la base de datos");
                        j = peliculasSeries.size();
                    }
                }
            }else {
                System.out.println("El dni no esta en la base de datos");
                i = personas.size();
            }
        }
    }
    public static void listarVisionados () {
        for (Visionado visionado : visionados) {
            System.out.println(visionado);
        }
    }
    public static void nuevaPeliculaSerie () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un ID");
        int id = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduzca un Titulo");
        String titulo = teclado.nextLine();
        System.out.println("Introduzca el nombre del director");
        String nombreDelDirector = teclado.nextLine();
        System.out.println("Introduzca la categoria");
        Categoria categoria = Categoria.valueOf(teclado.nextLine());
        PeliculaSerie ps1 = new PeliculaSerie(id , titulo , nombreDelDirector , categoria);

        peliculasSeries.add(ps1);
    }
    public static void main(String[] args) {
        menu();
    }
}
