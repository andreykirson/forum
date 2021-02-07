package forum.service;

import forum.model.Post;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * @author Andrey
 * @version 1
 * @since 07/02/21
 */

public interface PostRepository extends CrudRepository<Post, Integer> {
    List<Post> findAll();
    Post findAccidentById(Integer id);
    Post save(Post post);
}
