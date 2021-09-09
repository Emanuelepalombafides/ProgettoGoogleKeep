package Google;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bonjour")
public class HelloResource {

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String direBuongiorno (){
		return "Bonjour, a tu le monde!";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
		return "<html><title>HELLO REST</title><body>"
				+"<h1>Bonjour, a tu le monde!</h1></body></html>";
	}
}
