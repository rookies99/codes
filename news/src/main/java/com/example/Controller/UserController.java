package com.example.Controller;

import com.example.utils.VerifyCode;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@CrossOrigin //运行跨域
@RequestMapping("user")
public class UserController {

    /**
     * 生成验证码图片
     */
    @GetMapping("getImage")
    public String getImageCode(HttpServletRequest request) throws IOException {
        // 1.使用工具类生成验证码
        VerifyCode vc = new VerifyCode(120, 40, 4, 100);
        String code = vc.getCode();

        // 2. 获取验证码的BufferedImage对象
        BufferedImage captchaImage = vc.getBuffImg();
        // 3.将验证码放进servletContext作用域
        request.getServletContext().setAttribute("code", code);
        //4.将图片转为base64
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(captchaImage, "png", outputStream);
        byte[] imageBytes = outputStream.toByteArray();
        return "data:image/png;base64,"+Base64Utils.encodeToString(imageBytes);
    }
}
