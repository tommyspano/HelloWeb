package it.html.tutorial.library.api;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("books")
public class BookServices {
    @GET
    public List<Book> list() {
        List<Book> books = new ArrayList<>();
        Author author = new Author();
        author.setId(1);
        author.setName("Joanne");
        author.setSurname("Rowling");

        Book book1 = new Book();
        book1.setId(1);
        book1.setTitle("Harry Potter and the Philosopher's Stone");
        book1.setLanguage("english");
        book1.setAuthors(List.of(author));

        books.add(book1);
        return books;
    }

    @GET
    @Path("{id}")
    public Book get(@PathParam("id") long id) {
        Author author = new Author();
        author.setId(1);
        author.setName("Joanne");
        author.setSurname("Rowling");

        Book book = new Book();
        book.setId(id);
        book.setTitle("Harry Potter and the Philosopher's Stone");
        book.setLanguage("english");
        book.setAuthors(List.of(author));

        return book;
    }

    @POST
    public Response add(Book book) throws URISyntaxException {
        long newId = 3;
        return Response.created(new URI("api/books/" + newId)).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") long id, Book book) {
        return Response.noContent().build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") long id) {
        return Response.noContent().build();
    }
}