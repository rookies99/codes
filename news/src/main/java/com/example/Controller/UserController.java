package com.example.Controller;

import com.example.entity2.User;
import com.example.service.UserService;
import com.example.utils.VerifyCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin //运行跨域
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public Map<String, Object> register(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        try {
            userService.register(user);
            map.put("state", true);
            map.put("msg", "注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("msg", "提示：注册失败！");
        }
        return map;
    }


    @GetMapping("verifyCode")
    public boolean verifyCode(String code, HttpServletRequest request) {
        String key = (String) request.getServletContext().getAttribute("code");
        return key.equalsIgnoreCase(code);
    }

    /**
     * 生成验证码图片
     */
    @GetMapping("getImage")
    public String getImageCode(HttpServletRequest request) throws IOException {
        // 1.使用工具类生成验证码
        VerifyCode vc = new VerifyCode(120, 40, 4, 200);
        String code = vc.getCode();
        log.info("code："+code);

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

    /**
     * 检查用户名、邮箱 是否已存在
     */

    @GetMapping("checkUserName")
    public Integer checkUserName(String username) {
        return userService.checkUserName(username);
    }

    @GetMapping("checkEmail")
    public Integer checkEmail(String email) {
        return userService.checkEmail(email);
    }

    @GetMapping("checkMobile")
    public Integer checkMobile(String mobile) {
        return userService.checkMobile(mobile);
    }


    @GetMapping("login")
    public User login(String username, String password) {
        return userService.login(username, password);
    }
}
