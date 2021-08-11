package cs.qzf.community.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by qzf on 2021/8/10.
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
