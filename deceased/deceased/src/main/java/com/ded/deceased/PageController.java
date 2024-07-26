package com.ded.deceased;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/page1")
    public String showPage1() {
        return "page1"; // `page1.html` səhifəsini qaytarır
    }

    @GetMapping("/page2")
    public String showPage2() {
        return "page2"; // `page2.html` səhifəsini qaytarır
    }
}

