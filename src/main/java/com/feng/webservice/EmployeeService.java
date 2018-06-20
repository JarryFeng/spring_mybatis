package com.feng.webservice;

import com.feng.pojo.Employee;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jarry on 2017/12/15.
 */

@WebService
@Path("/employee")
public interface EmployeeService {
    @GET
    @Path("/query/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Employee queryEmployee(@PathParam("id") long id);

}
