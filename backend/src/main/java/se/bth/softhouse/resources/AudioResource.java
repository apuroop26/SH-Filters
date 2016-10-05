package se.bth.softhouse.resources;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import se.bth.softhouse.db.PathDao;
import se.bth.softhouse.entities.paths;
import se.example2.softhouse.AppletAppln;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;
import java.util.List;
import java.applet.*;
@Produces(MediaType.APPLICATION_JSON)
@Path("fileupload")
public class AudioResource {
 public String Pathname;
	public int k=0;
	private PathDao pathDao;
	public AudioResource(PathDao pathDao) {
		this.pathDao = pathDao;
	}
	@GET
	@Path("/all/")
	public List<String> getBy() {
		return pathDao.getBy();

	}

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadAudioFile(@FormDataParam("file") final InputStream uploadedInputStream,
			@FormDataParam("file") final FormDataContentDisposition fileDet) {
		 String uploadedFileLocation = "../frontend/uploadedfiles/" + fileDet.getFileName();
		//String uploadedFileLocation ="/C:/Users/apuroop/Desktop/uploads/" + fileDet.getFileName();
		// save it
		this.Pathname = uploadedFileLocation;
		System.out.println(Pathname);
		pathDao.insertpaths(Pathname);
		 this.k=1;
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

	public String sendpath(){
		this.Pathname="C:/Users/rohith/Desktop/softhouse/22-09-16/SH-Filters/backend/uploadedFiles";
		//System.out.println("2nd");
		//System.out.println(Pathname+"2nd");
		return Pathname;
	}

}
