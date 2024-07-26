package com.ded.deceased;

import com.ded.deceased.SearchService; // Axtarış xidmətini daxil edin
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class SearchController {

        @Autowired
        private SearchService searchService; // Axtarış xidmətini inject edin

        @GetMapping("/search")
        public String search(@RequestParam String query, Model model) {
            // Axtarış nəticələrini əldə edin
            model.addAttribute("results", searchService.search(query));
            return "searchResults"; // `searchResults.html` səhifəsini qaytarır
        }
    }


