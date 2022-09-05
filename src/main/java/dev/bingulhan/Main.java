package dev.bingulhan;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File image = new File("C:\\Users\\BingulHan\\Desktop\\ReaderPNG\\src\\main\\resources\\avatar.png");
        if (image.exists()) {
            try {
                BufferedImage bufferedImage = ImageIO.read(image);
                for (int xx=0; xx<bufferedImage.getWidth(); xx++) {
                    for (int yy=0; yy<bufferedImage.getHeight(); yy++) {
                        Color originalColor = new Color(bufferedImage.getRGB(xx,yy));
                        int red = originalColor.getRed();
                        int green = originalColor.getGreen();
                        int blue = originalColor.getBlue();

                        System.out.println("  ");
                        System.out.println("Color Veriables: ");
                        System.out.println(""+red);
                        System.out.println(""+green);
                        System.out.println(""+blue);
                        System.out.println("  ");
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Not found");
        }
    }
}
