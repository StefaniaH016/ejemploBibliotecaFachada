package co.uniquindio.java;


import java.util.ArrayList;
import java.util.List;

public class BuscadorLibro {

    List<String> Libro = new ArrayList<>();
    List<Libro> libro = new ArrayList<>();
    
    @SuppressWarnings("unlikely-arg-type")
    public List<Libro> buscarPorTitulo(String titulo) {

        for (String str : Libro ){
            if( libro.contains(titulo)){
                System.out.println(str);
            }
            
        }
        return libro;
            
    }

   
    @SuppressWarnings("unlikely-arg-type")
    public List<Libro> buscarPorCategoria(String categoria){
        
        for (String str : Libro ){
            if( libro.contains(categoria)){
                System.out.println(str);
            }
            
        }
        return libro;
        
    }

    @SuppressWarnings("unlikely-arg-type")
    public List<Libro> buscarPorAutor(String autor){
          
        for (String str : Libro ){
            if( libro.contains(autor)){
                System.out.println(str);
            }
            
        }
        return libro;

    }

    public List<Libro> getLibro() {
        return libro;
    }

    public BuscadorLibro(List<Libro> libro) {
        this.libro = libro;
    }

}

