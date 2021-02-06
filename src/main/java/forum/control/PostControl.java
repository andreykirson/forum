package forum.control;

import forum.model.Post;
import forum.service.MemStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Andrey
 * @version 1
 * @since 06/02/21
 */

@Controller
public class PostControl {

    private final MemStore memStore;

    public PostControl(MemStore memStore) {
        this.memStore = memStore;
    }

    @GetMapping("/create")
    public String create() {
        return "/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Post post, HttpServletRequest req) {
        if (post.getId() != null) {
            memStore.updatePost(post);
        } else {
            memStore.createPost(post);
        }
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String update(@RequestParam("id") String id, Model model) {
        Post post = memStore.findPostById(Integer.valueOf(id));
        model.addAttribute("post", post);
        return "/edit";
    }

}
