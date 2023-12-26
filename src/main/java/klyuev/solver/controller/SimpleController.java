package klyuev.solver.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/simple")
public class SimpleController {

    public double speed;
    @GetMapping("/")
    public String index(Map<String, Object> model) {
        return "simple";
    }

    @PostMapping("/simpleRes")
    public String simpleRes(@RequestParam("airflowRate") float airflowRate,
                            @RequestParam("width") float width,
                            @RequestParam("height") float height,
                            Map<String, Object> model) {

        speed = Math.ceil(((airflowRate * 1000000) / (3600 * width * height)));
        model.put("speed", speed);
        model.put("airflowRate", airflowRate);
        model.put("width", width);
        model.put("height", height);

        return "simpleRes";
    }
}
