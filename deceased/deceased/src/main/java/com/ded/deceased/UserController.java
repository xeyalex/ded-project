package com.ded.deceased;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

    @Controller
    public class UserController {

        @GetMapping("/user/{userId}")
        public String showUserPage(@PathVariable String userId, Model model) {
            // İstifadəçi ID ilə məlumatları əldə edin (məsələn, bazadan)
            model.addAttribute("userId", userId);
            return "userPage"; // `userPage.html` səhifəsini qaytarır
        }
    }

