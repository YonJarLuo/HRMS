package cn.huaCloud.controller;

import cn.huaCloud.utils.MyHttpUtils;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by LuoYJ on 2019/2/15.
 * 第三方应用对接企业微信
 * corpid：wwd2771292bb595ba6
 * Secret：55MjqchsEjHTsSz9Ixm8ESwI7XAilccRUY6XE4hLae0
 * 获取token地址：https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRET
 * 验证身份地址：https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE
 *

 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(@RequestParam(value = "code",defaultValue = "123") String CODE){
        System.out.println("index");

        //访问前 先身份验证  corpid与secret写死
        //获取token
        Object o = MyHttpUtils.get("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=wwd2771292bb595ba6&corpsecret=55MjqchsEjHTsSz9Ixm8ESwI7XAilccRUY6XE4hLae0");
        JSONObject jsonObject = new JSONObject(o.toString());
        Object access_token = jsonObject.get("access_token");
        String ACCESS_TOKEN = access_token.toString();
        //验证身份
        Object result = MyHttpUtils.get("https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=" + ACCESS_TOKEN + "&code=" + CODE);
        System.out.println(result.toString());

        //添加判断条件

        return "index";
    }
}
