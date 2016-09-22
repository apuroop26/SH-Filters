package se.bth.softhouse.resources;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;

@Produces(MediaType.APPLICATION_JSON)
@Path("fileupload")
public class AudioResource {

	public AudioResource() {
	}

	@GET
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadAudioFile(@FormDataParam("file") final InputStream uploadedInputStream,
			@FormDataParam("file") final FormDataContentDisposition fileDet) {
		String uploadedFileLocation = "/Users/Suveen/Desktop/Vinnova/SH-Filters_Master/backend/uploadedFiles/" + fileDet.getFileName();
		//String uploadedFileLocation ="/C:/Users/apuroop/Desktop/uploads/" + fileDet.getFileName();
		// save it
		saveToFile(uploadedInputStream, uploadedFileLocation);

		String output = "File uploaded to: " + uploadedFileLocation;
		return Response.status(200).entity(output).build();
	}

	private void saveToFile(InputStream uploadedInputStream, String uploadedFileLocation) {

		try {
			OutputStream out = null;
			int read = 0;
			byte[] bytes = new byte[1024];

			out = new FileOutputStream(new File(uploadedFileLocation));
			while ((read = uploadedInputStream.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}
			out.flush();
			out.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
