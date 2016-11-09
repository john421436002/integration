package org.integration.controller.login;

import com.alibaba.fastjson.JSONObject;
import org.integration.entity.User;
import org.integration.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by hxk on 2016/11/8.
 */
@Controller
@RequestMapping(value = "/back")
public class LoginController {
    @Resource
    private UserService userService;

    /**
     * 用户登录
     * @param request
     * @param response
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping(value="/login/{username}/{password}",method = RequestMethod.POST)
    @ResponseBody
    public Object Login(HttpServletRequest request, HttpServletResponse response, @PathVariable(value = "username")String username, @PathVariable(value = "password")String password){
        System.out.println("进入方法");
        System.out.println("username==>"+username);
        JSONObject obj = new JSONObject();
        obj.put("result","ok");
        User exitUser = userService.findUserByUsername(username);
        if(null == exitUser ){
            obj.put("result","01");
        }
        if(!password.equals(exitUser.getPassword())){
            obj.put("result","02");
        }
        return obj;
    }

    @RequestMapping(value = "/register/{username}/{password}/{repassword}",method = RequestMethod.POST)
    @ResponseBody
    public Object register(HttpServletRequest request, HttpServletResponse response,
                           @PathVariable(value = "username") String username,
                           @PathVariable(value = "password") String password,
                           @PathVariable(value = "repassword") String repassword ){
        System.out.println("进入注册");
        String email = request.getParameter("email");
        System.out.println("email==>"+email);
        JSONObject obj = new JSONObject();
        User exitUser = userService.findUserByUsername(username);
        obj.put("result","ok");
        if(null != exitUser){
            //用户已存在
            obj.put("result","01");
        }else{
            //用户名可注册
            if(!password.equals(repassword)){
                //两次密码不一致
                obj.put("result","02");
            }else{
                //密码一致，可注册
                User reuser = new User();
                reuser.setUsername(username);
                reuser.setPassword(password);
                reuser.setAddDate(new Date());
                reuser.setEmail(email);
                if(userService.addUser(reuser) != 1){
                    //插入数据库出错
                    obj.put("result","03");
                }
            }
        }
        return obj;
    }
}
