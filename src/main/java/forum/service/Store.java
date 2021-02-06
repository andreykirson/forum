package forum.service;

import forum.model.Post;

import java.util.Collection;

public interface Store {
    Collection<Post> getAllPost();
    Post findPostById(Integer id);
    void createPost(Post post);
    void updatePost(Post post);
}
