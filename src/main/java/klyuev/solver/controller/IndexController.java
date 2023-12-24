package klyuev.solver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        model.put("key1", 15);
        model.put("key2", 18);
        model.put("key3", 22);
        return "index";
    }

    @GetMapping(value = "/check")
    public String check(String ans1,String ans2, Map<String, Object> model) {
        log.info("получили запрос: {}, {}", ans1, ans2);

        if(ans1.equals("4") && ans2.equals("10")) {
            return "success";
        } else {
            model.put("right1", 4);
            model.put("right2", 10);
            model.put("user1", ans1);
            model.put("user2", ans2);
            return "error";
        }
    }
}
