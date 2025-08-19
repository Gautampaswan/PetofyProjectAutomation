package org.Petofy.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class ScreenshotUtils {

    public static void saveImage(BufferedImage image, String status, String testName) throws IOException {
        // Timestamp for uniqueness
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Folder path: target/screenshots/status/
        String dirPath = "target/screenshots/" + status.toLowerCase();
        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // Final file name
        String filePath = dirPath + "/" + testName + "_" + timestamp + ".png";
        ImageIO.write(image, "PNG", new File(filePath));

        System.out.println("✅ Screenshot saved at: " + filePath);
    }

}
