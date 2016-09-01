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
			@FormDataParam("file") final FormDataContentDisposition fileDet) {
		//String uploadedFileLocation = "C:/uploadedFiles/" + fileDet.getFileName();
		String uploadedFileLocation ="~/Desktop/Vinnova/" + fileDet.getFileName();
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
