package cn.huaCloud.utils;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Created by LuoYJ on 2019/2/15.
 * http请求工具类
 */
public class MyHttpUtils {
    public static Object get(String url){

        //创建一個httpGet方法\
        String result = "";
        BufferedReader in = null;
        try {
            //获取http请求返回结果
            URL surl = new URL(url);
            HttpURLConnection httpUrlConn = (HttpURLConnection) surl.openConnection();

            httpUrlConn.setDoOutput(true);
            httpUrlConn.setDoInput(true);
            httpUrlConn.setUseCaches(false);

            httpUrlConn.setRequestMethod("GET");
            httpUrlConn.connect();      //建立连接

            Map<String, List<String>> map = httpUrlConn.getHeaderFields();
            //遍历所有的响应头字段
            for (String key:map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }

            /*OutputStream outputStream = httpUrlConn.getOutputStream();
            System.out.println(outputStream.toString());*/

            String responseMessage = httpUrlConn.getResponseMessage();
            System.out.println("responseMessage"+ responseMessage);

            //定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(httpUrlConn.getInputStream()));

            String line;
            while ((line = in.readLine()) != null){
                result += line;
            }

            System.out.println(result);

        }catch (Exception e){
                e.printStackTrace();
        }finally {
            try{
                if (in != null){
                    in.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return result;
    }
}
