package cn.huaCloud.controller;

import cn.huaCloud.domain.Rota;
import cn.huaCloud.service.RotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by LuoYJ on 2019/2/14.
 * 如果使用了@RestController里面包括了@ResponseBody，则会返回一个字符串
 * 只能使用@Controller,pom.xml要引入thymeleaf模板（html页面需遵循thymeleaf语法规则），以及配置文件里配置spring.thymeleaf.prefix=classpath:/templates/
 */
@Controller
public class HRMSController {
    @Autowired
    private RotaService rotaService;

    @GetMapping(value = "/api/v1/HRMS/getRotaDetails",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getRotaDetails(@RequestParam(value = "remarks",defaultValue = "值班") String remarks, Model model){
        List<Rota> rotas = rotaService.selectByRemarks(remarks);
        System.out.println(rotas);

        model.addAttribute("empList",rotas);
        return "details";
    }

    /*@GetMapping(value = "/api/v1/HRMS/getRotaDetailsById",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Rota getRotaDetailsById(@RequestParam(value = "id",defaultValue = "1") String id){
        Rota rota = rotaService.selectByPrimaryKey(id);
        System.out.println(rota.toString());
        return rota;
    }*/


}
