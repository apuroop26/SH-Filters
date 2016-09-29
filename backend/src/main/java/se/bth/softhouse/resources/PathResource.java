package se.bth.softhouse.resources;

/**
 * Created by rohithvajhala on 21-09-2016.
 */

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Preconditions;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import se.bth.softhouse.db.PathDao;
import se.bth.softhouse.entities.paths;
import se.bth.softhouse.resources.AudioResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("path")
public class PathResource {
    private PathDao pathDao;

    public PathResource(PathDao pathDao) {
        Preconditions.checkNotNull(pathDao);
        this.pathDao = pathDao;
    }
    public PathResource(){}

    @GET
    @Path("/all/")
    public List<String> getBy() {
        return pathDao.getBy();
    }

    @POST
    @Timed
    public void savePaths(paths paths) {
        if (paths != null) {
            //pathDao.insertpaths();
            throw new WebApplicationException(Response.Status.OK);

        } else {
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }

    }

    AudioResource getpath = new AudioResource(null);

    String y = getpath.sendpath();

}
