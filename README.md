# LieFallow

注册：http://localhost:8080/register
登录：http://localhost:8080/login

管理员账号在数据库user表中设置isAdmin为1

在\src\main\java\com\example\demo\service\ArticleServiceImpl.java 文件中，
第171行先修改文件上传路径，放到项目目录下的\\resources\\static\\uploadFile/下

发帖只能上传一张图片，用户修改头像只能在\\resources\\static\\uploadFile目录下的图片中选择。

![Image text](https://github.com/beiweixiaohuo/picture/blob/main/1.png)
