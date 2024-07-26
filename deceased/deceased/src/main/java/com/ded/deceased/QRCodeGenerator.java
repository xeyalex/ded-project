package com.ded.deceased;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import java.io.File;
import java.io.IOException;

public class QRCodeGenerator {
    public static void main(String[] args) {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        // Dinamik istifadəçi ID
        String userId = "12345";
        // Dinamik URL
        String data = "http://yourwebsite.com/user/" + userId;
        int size = 250; // QR kodunun ölçüsü

        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, size, size);
            File file = new File("QRCode.png");
            MatrixToImageWriter.writeToFile(bitMatrix, "PNG", file);
            System.out.println("QR kodu yaradıldı.");
        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }
    }
}
