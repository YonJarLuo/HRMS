对接企业微信第三方应用开发的一个demo。
项目使用步骤：
1.修改application.properties数据库的连接
2.执行sql文件夹的脚本，创建表
3.运行Application，即可（浏览器访问localhost:1889）
4.打包成jar包在linux环境运行命令：
  nohup java -jar HRMS-1.0-SNAPSHOT.jar >/qywx/HRMS.log &
  
修改建议：
1.mybatis的generator可以根据数据表进行自动生成dao,mapper.xml,domain
  新增表时，在generatorConfig.xml中填写对应的表名即可（删除已生成的配置）
2.其它注意事项 在对应的类里也注明有
  

