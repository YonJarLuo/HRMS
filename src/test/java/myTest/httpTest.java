package myTest;

import cn.huaCloud.utils.MyHttpUtils;
import org.json.JSONObject;
import org.junit.Test;

/**
 * Created by LuoYJ on 2019/2/15.
 */
public class httpTest {

    @Test
    public void test01(){
        Object o = MyHttpUtils.get("http://localhost:8081/api/v1/HRMS/getRotaDetailsById?id=1");
        System.out.println(o.toString());
    }

    @Test
    public void test02(){
        Object o = MyHttpUtils.get("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=wwd2771292bb595ba6&corpsecret=55MjqchsEjHTsSz9Ixm8ESwI7XAilccRUY6XE4hLae0");
        System.out.println(o.toString());
        JSONObject jsonObject = new JSONObject(o.toString());
        Object access_token = jsonObject.get("access_token");

        System.out.println(access_token.toString());
    }
}
