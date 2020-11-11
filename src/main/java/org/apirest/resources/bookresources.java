

package org.apirest.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apirest.model.book;
import org.apirest.service.bookservice;

@Path("/libros")
public class bookresources {
    
    bookservice servicio =  new bookservice();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<book> getlibros(){        
        return servicio.getbooks();
    }
    
    @GET
    @Path("/{bookId}")
    @Produces(MediaType.APPLICATION_JSON)
    public book getlibro(@PathParam("bookId") int id){
        return servicio.getlibro(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public book addbook(book libro){
        return servicio.addlibro(libro);
    }
    
    @DELETE
    @Path("/{bookId}")
    public void deletelibro(@PathParam("bookId") int id){
     servicio.deletebook(id);
    }
    
    @PUT
    @Path("/{bookId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public book updatelibro(@PathParam("bookId") int id, book libro){
        libro.setId(id);
        return servicio.updatelibro(libro);
    }
    
    
    
    
}
