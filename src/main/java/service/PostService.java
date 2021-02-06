package service;

import model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey
 * @version 1
 * @since 06/02/21
 */

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();

    public PostService() {
        posts.add(Post.of("Продаю машину ладу 01."));
    }

    public List<Post> getAll() {
        return posts;
    }
}
