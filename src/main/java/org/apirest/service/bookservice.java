package org.apirest.service;

import java.util.List;
import org.apirest.dao.BaseDeDatos;
import org.apirest.model.book;


public class bookservice {
    private List<book> listado = BaseDeDatos.getInstancia().getListado();
    
    public List<book> getbooks(){
        return listado;
     
    }
    
    public book getlibro(int id){
        for(book libro: listado){
            if(libro.getId() ==  id){
            return libro;
            }
        }
        return null;
    }
    
    public book addlibro(book libro){
        libro.setId(getMaximo());
        listado.add(libro);
        
        return libro;
    }
    
    public book updatelibro(book libro){
        int posicion = getposicion(libro.getId());
        try{
            listado.set(posicion, libro);        
        } catch(IndexOutOfBoundsException ioobe){
        return null;
        }
        return libro;
    }
    
    public void deletebook(int id){
        int posicion =  getposicion(id);
        listado.remove(posicion);
        
    }
    
    private int getposicion(int id){
            for(int i=0;i<listado.size();i++){
                    if(listado.get(i).getId() == id){
                        return i;
                    }
            }
            return -1;
    }
    
    private int getMaximo(){
        int size = listado.size();
        if(size > 0){
            return listado.get(size-1).getId() +1;         
        }
        else{
            return 1;
        }
    }
}
