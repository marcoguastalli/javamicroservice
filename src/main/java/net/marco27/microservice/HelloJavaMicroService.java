package net.marco27.microservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloJavaMicroService {

    @GET
    public Response greet() {
        return Response.ok("Hello World").build();
    }

}
