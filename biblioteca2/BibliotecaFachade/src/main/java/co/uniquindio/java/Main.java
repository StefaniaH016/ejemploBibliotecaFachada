package co.uniquindio.java;

import java.util.Arrays;
import java.util.List;

public class Main 
{
    public static void main( String[] args ){
        
        BibliotecaFacade facade= new BibliotecaFacade(null);

        List<String> libro= Arrays.asList("Enola holmes","infantil","Roberto Ospina");
        List<String> libro2= Arrays.asList("las aventuras de floppa","acción","Sofia Rodriguez");
        List<String> libro3= Arrays.asList("la divina comedia","comedia","Raul ochoa");
        
        libro.addAll(libro);
        libro.addAll(libro2);
        libro.addAll(libro3);

        String titulo="Enola";
        String categoria="acción";
        String autor="Raul";

        
        List<Libro> buscarPorTituLo= facade.buscarPorTitulo(titulo);
        List<Libro> buscarPorCategoria= facade.buscarPorCategoria(categoria);
        List<Libro> buscarPorAutor= facade.buscarPorAutor(autor);

        System.out.println("resultados por titulo:"+ buscarPorTituLo);
        System.out.println("resultados por categoria:"+ buscarPorCategoria);
        System.out.println("resultados por autor:"+ buscarPorAutor);


       
    }
}
