package forum.control;

import forum.service.MemStore;
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

    private final MemStore posts;

    public IndexControl(MemStore posts) {
        this.posts = posts;
    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("posts", posts.getAllPost());
        return "index";
    }
}
