package se.bth.softhouse.resources;
import se.bth.softhouse.entities.Filter;
import se.bth.softhouse.process.FilterProcess;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("filter")
public class FilterResource {

	final private FilterProcess process;

	public FilterResource(FilterProcess process) {
		this.process = process;
	}

	@GET
	public List<org.junit.runner.manipulation.Filter> getAll() {
		return process.getAll();
	}

	@GET
	@Path("/{id}")
	public org.junit.runner.manipulation.Filter getBy(@PathParam("id") int id) {
		return getBy(id);
	}

	@POST
	public void createFilter(Filter filter) {
		process.create(filter);
	}
}
