import com.media.rest.dto.CreateUserRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    public Response createUser(CreateUserRequest userRequest){
        return  Response.ok().build();
    }

    @GET
    public Response listUser (){
        return Response.ok().build();
    }

}
