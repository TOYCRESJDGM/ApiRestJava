package org.apirest.dao;

import java.util.ArrayList;
import java.util.List;
import org.apirest.model.book;


public final class BaseDeDatos {
    private final static  BaseDeDatos baseDeDatos = new BaseDeDatos();
    private final List<book> listado =  new ArrayList<>();

    public BaseDeDatos() {
        book libro1 =  new book(1,"La hojarasca","Good one", "Gabo");
        book libro2 =  new book(2,"El coronel no tiene quien le escriba","Interesting ","Gabo");
        
        listado.add(libro1);
        listado.add(libro2);
    }
    
    public static BaseDeDatos getInstancia(){
        return baseDeDatos;
    }
    
    public List<book> getListado(){
        return listado;
    }
    
    
}
