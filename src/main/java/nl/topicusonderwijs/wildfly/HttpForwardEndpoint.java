package nl.topicusonderwijs.wildfly;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;

import java.io.IOException;

@Path("/forward")
public class HttpForwardEndpoint
{
    @GET
    public Response forward(@Context HttpServletRequest request, @Context HttpServletResponse response)
	    throws ServletException, IOException
    {
	request.getRequestDispatcher("/forward").forward(request, response);

	return Response.ok().build();
    }
}
