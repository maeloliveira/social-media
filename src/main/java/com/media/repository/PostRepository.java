    package com.media.repository;

    import com.media.model.Post;
    import io.quarkus.hibernate.orm.panache.PanacheRepository;
    import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {

}
