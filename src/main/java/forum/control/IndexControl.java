package forum.control;

import forum.repo.PostRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Andrey
 * @version 1
 * @since 06/02/21
 */

@Controller
public class IndexControl {

    private final PostRepository postRepository;

    public IndexControl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("user", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }
}
