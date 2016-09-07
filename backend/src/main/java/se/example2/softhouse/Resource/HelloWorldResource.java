package se.example2.softhouse.Resource;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import se.example2.softhouse.Resource.Core.Saying;
import se.example2.softhouse.Resource.Core.upload;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));
        return new Saying(counter.incrementAndGet(), value);
    }
    @POST
    @Path("/{text}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addNote(upload newNote) {
        String noteadded = null;
        newNote.setId(noteadded);
    }
}
