package service;

import model.Post;

import java.util.List;

public interface Store {
    List<Post> getAllPost();
    Post findPostById(int id);
    void createPost(Post post);
    void updatePost(Post post);
}
