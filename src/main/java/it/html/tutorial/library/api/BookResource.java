package it.html.tutorial.library.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/books")  // Questo definisce l'endpoint /api/books
public class BookResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getBooks() {
        return Arrays.asList("Libro 1", "Libro 2", "Libro 3");
    }
}
