package pscglobalsolutions.api.services;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import pscglobalsolutions.api.model.ContactInfoResponse;
import pscglobalsolutions.api.model.UserInfoRequest;

@WebService(serviceName = "pscRestAPI", targetNamespace = "http://www.27programs.com/pscServices/services")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface PSCAPIService {
	
	@POST
	@Path("/userInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public ContactInfoResponse getContacts(final UserInfoRequest userInfo);
	
	/*@GET
	@Path("/userInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public ContactInfoResponse getContacts2(@PathParam);*/
	
	/*public UserInfo loginViaApp(UserInfoRequest userInfo2);*/
}
