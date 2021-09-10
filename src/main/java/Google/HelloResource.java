package Google;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
