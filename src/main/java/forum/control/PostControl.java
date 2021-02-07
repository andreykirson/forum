package forum.control;

import forum.model.Post;
import forum.service.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

/**
 * @author Andrey
 * @version 1
 * @since 06/02/21
 */

@Controller
public class PostControl {

    private final PostRepository postRepository;

    public PostControl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/create")
    public String create() {
        return "/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Post post, HttpServletRequest req) {
        if (post.getCreated() == null) {
            post.setCreated(Calendar.getInstance());
        }
        postRepository.save(post);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String update(@RequestParam("id") String id, Model model) {
        Post post = postRepository.findAccidentById(Integer.valueOf(id));
        model.addAttribute("post", post);
        return "/edit";
    }

}
