package com.ded.deceased;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {

    @GetMapping("/show-image")
    public String showImagePage() {
        return "imagePage"; // `imagePage.html` faylını qaytarır
    }
}
