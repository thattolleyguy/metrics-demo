package com.tjtolley.metrics.demo;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

public class SessionResource
{
    @Path("login")
    public Response login(String username, String client)
    {
        return Response.ok().build();
    }
    
}
