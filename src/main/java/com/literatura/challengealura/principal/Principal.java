package com.literatura.challengealura.principal;

import com.literatura.challengealura.model.DatosBooks;
import com.literatura.challengealura.service.ConsumoAPI;
import com.literatura.challengealura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL="https://gutendex.com/books";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu(){
        var opcion = -1;
        while (opcion !=0){
            var menu = """
                    ---------------------------
                    * * * ELIJA LA OPCIÓN * * *
                    1 buscar libros por titulo
                    2 listar libros registrados
                    3 listar autores registrados
                    4 listar autores vivo en un determinado año
                    5 listar libros por idioma
                    0 salir
                    """;
            System.out.println(menu);
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1: buscarLibro();
                break;
                case 2: listarLibros();
                break;
                case 3: listarAutores();
                break;
                case 4: listarAutoresVivos();
                break;
                case 5: listarLibroPorIdioma();
                break;
                case 0: System.out.println("cerrando aplicación...");
                break;
                default: System.out.println("opción inválida");
            }
        }
    }

private DatosBooks getDatosBook(){
    System.out.println("escribe el nombre del libro q quieres buscar");
    var nombreLibro = teclado.nextLine();
    var json = consumoApi.obtenerDatos(URL+"?search="+nombreLibro.replace(" ","%20"));
    System.out.println(json);
    DatosBooks datos= conversor.obtenerDatos(json,DatosBooks.class);
    return datos;
}

private void buscarLibro(){
    DatosBooks books = getDatosBook();
    System.out.println(datos);
}
}