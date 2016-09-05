package se.bth.softhouse.resources;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;

@Produces(MediaType.APPLICATION_JSON)
@Path("fileupload")
public class AudioResource {

    public AudioResource() {
    }

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadAudioFile(@FormDataParam("file") final InputStream uploadedInputStream,
                                    @FormDataParam("file") final FormDataContentDisposition fileDetail) throws IOException {
        String uploadedFileLocation = "C:/uploadedFiles/" + fileDetail.getFileName();

        // save it
        writeToFile(uploadedInputStream, uploadedFileLocation);
        String output = "File uploaded to: " + uploadedFileLocation;
        return Response.ok(output).build();
    }

    private void writeToFile(InputStream uploadedInputStream, String uploadedFileLocation) throws IOException {

        //try {
        //	OutputStream out = null;
        int read;
        final int BUFFER_LENGTH = 1024;
        final byte[] buffer = new byte[BUFFER_LENGTH];
        OutputStream out = new FileOutputStream(new File(uploadedFileLocation));
        while ((read = uploadedInputStream.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
        out.flush();
        out.close();
    }
}