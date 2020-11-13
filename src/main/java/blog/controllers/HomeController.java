package blog.controllers;

import blog.models.Post;
import blog.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PostServices postServices;

    @RequestMapping("/")
    public String index(Model model){
        //finding all the post in the postservices
        List<Post> posts = postServices.findAll();

        // transfer data to index.html file
        model.addAttribute("posts", posts);

        return "index";
    }
}
