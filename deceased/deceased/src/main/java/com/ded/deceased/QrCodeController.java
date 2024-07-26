package com.ded.deceased;

import com.ded.deceased.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class QrCodeController {

    @Autowired
    private QrCodeService qrCodeService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/scan")
    public String scanQRCode(@RequestParam("file") MultipartFile file, Model model) {
        try {
            String qrCodeText = qrCodeService.decodeQRCode(file);
            if (qrCodeText == null) {
                model.addAttribute("message", "QR kod oxunmadı. Yenidən cəhd edin.");
            } else {
                model.addAttribute("message", "QR kod oxundu: " + qrCodeText);
                model.addAttribute("url", qrCodeText);
            }
        } catch (IOException e) {
            model.addAttribute("message", "Xəta baş verdi: " + e.getMessage());
        }
        return "result";
    }
}
