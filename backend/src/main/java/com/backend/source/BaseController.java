package com.backend.source;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Base Controller
 */
@Controller
public class BaseController {

    /**
     * index action
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
