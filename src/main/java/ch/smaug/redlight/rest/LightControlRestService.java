package ch.smaug.redlight.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import ch.smaug.redlight.control.LightControl;

@Path("control")
@RequestScoped
public class LightControlRestService {

	@Inject
	private LightControl lightControl;

	@GET
	@Consumes("text/plain")
	@Path("on")
	public Response on() {
		lightControl.on();
		return Response.ok().build();
	}

	@GET
	@Consumes("text/plain")
	@Path("off")
	public Response off() {
		lightControl.off();
		return Response.ok().build();
	}
}