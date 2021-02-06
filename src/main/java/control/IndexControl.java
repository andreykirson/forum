package control;

import model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.PostService;
import java.util.List;

/**
 * @author Andrey
 * @version 1
 * @since 06/02/21
 */

@Controller
public class IndexControl {

    private final PostService posts;

    public IndexControl(PostService posts) {
        this.posts = posts;
    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<Post> list = posts.getAll();
        System.out.println(list.get(0).getName());
        model.addAttribute("posts", list);
        return "index";
    }
}
