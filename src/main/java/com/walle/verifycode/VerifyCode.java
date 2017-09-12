package com.walle.verifycode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Administrator on 2017/8/1.
 */
public class VerifyCode extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedImage bufferedImage = new BufferedImage(68,22,BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        Color c = new Color(200,150,255);
        g.setColor(c);
        g.fillRect(0,0,68,22);
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefgijklmnopqrstuvwxyz0123456789".toCharArray();
        Random random =new Random();
        int len = chars.length,index;
        for (int i = 0; i < 4; i++) {
            index=random.nextInt(len);
            g.setColor(new Color(random.nextInt(88),random.nextInt(188),random.nextInt(255)));
            g.drawString(chars[index]+"",(i*15)+3,18);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
