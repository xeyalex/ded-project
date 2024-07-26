package com.ded.deceased;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class RedirectController {

        @GetMapping("/redirect")
        public String redirectToPage() {
            return "redirect:/page1"; // `/page1` URL-ə yönləndirir
        }
    }

