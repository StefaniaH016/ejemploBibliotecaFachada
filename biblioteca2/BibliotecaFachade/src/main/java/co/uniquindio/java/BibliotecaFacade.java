package co.uniquindio.java;

import java.util.List;


public class BibliotecaFacade extends BuscadorLibro{
    
    private BuscadorLibro buscador;
    
    public BibliotecaFacade(List<Libro> libro) {
       super(libro);
       buscador= new BuscadorLibro(libro);
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        
        return buscador.buscarPorTitulo(titulo);
    }

    

    public List<Libro> buscarPorAutor(String autor){
          
        return buscador.buscarPorAutor(autor);
    }

    public List<Libro> buscarPorCategoria(String categoria){
       
        return buscador.buscarPorCategoria(categoria);
        
    }

    public BuscadorLibro getBuscador() {
        return buscador;
    }
    
    
    

    
    
   





    

    
}
