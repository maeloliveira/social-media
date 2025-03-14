package com.media.client;


import com.media.model.Follower;
import com.media.repository.FollowerRepository;
import com.media.repository.UserRepository;
import com.media.rest.dto.FollowerRequest;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class FollowerResources {


    @Path("/users/{userId}/followers")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public class FollowerResource {

        private FollowerRepository repository;
        private UserRepository userRepository;

        @Inject
        public FollowerResource(
                FollowerRepository repository, UserRepository userRepository) {
            this.repository = repository;
            this.userRepository = userRepository;
        }

        @PUT
        public Response followUser(
                @PathParam("userId") Long userId, FollowerRequest request){
            var user = userRepository.findById(userId);
            if(user == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }

            var follower = userRepository.findById(request.getFollowerId());

            var entity = new Follower();
            entity.setUser(user);
            entity.setFollower(follower);

            repository.persist(entity);

            return Response.status(Response.Status.NO_CONTENT).build();

        }

    }

}
