package forum.service;

import forum.model.Post;
import java.util.*;

/**
 * @author Andrey
 * @version 1
 * @since 06/02/21
 */


public class MemStore implements Store {

    private final Map<Integer, Post> posts = new HashMap<>();

    public MemStore() {
        posts.put(1, new Post("Study Java", 1));
        posts.put(2, new Post("Study Python", 2));
        posts.put(3, new Post("Fly to space", 3));
    }

    @Override
    public Collection<Post> getAllPost() {
        return posts.values();
    }

    @Override
    public Post findPostById(Integer id) {
        return posts.get(id);
    }

    @Override
    public void createPost(Post post) {
        Integer newId = Collections.max(getKeys()) + 1;
        post.setId(newId);
        posts.put(newId, post);
    }

    @Override
    public void updatePost(Post post) {
        Integer id = post.getId();
        if (this.posts.containsKey(post.getId())) {
            this.posts.replace(id, post);
        }
    }

    public Set<Integer> getKeys() {
        return posts.keySet();
    }
}
