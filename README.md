<p align="center"><a href="https://github.com/liy159872" target="_blank" rel="noopener noreferrer"><img width="180" src="https://www.hualigs.cn/image/641fdd4dac243.jpg" alt="logo"></a></p>

<p align="center">
  <a href="https://blog.csdn.net/LetterLJHX?type=blog">CSDN</a>
	<a href="https://gitee.com/liyiaixuemei">Gitee</a>
</p>

<p align="center"> 这个基于Spring+Vue前后端分离的社交化求助平台是一个针对大众的服务，它能够让用户在平台上发布求助信息，同时其他用户也可以看到并提供帮助。该平台提供了用户管理、求助信息发布、搜索、评论、点赞、通知等功能，可以让用户在社交化的环境下得到及时的帮助。它结合了现代社交化的特点，通过前后端分离的方式实现了良好的用户体验和易于维护的后端架构。 </p>

<h2 align="center">HelpEasePro V04.1.0（毕业设计）</h2>

 [项目文档](https://)  | [笔记仓库](https:/)  |  [我的博客](https://blog.csdn.net/LetterLJHX?type=blog)  



## 项目介绍

此项目使用 **SpringBoot+SpringCloud** 进行编写：<https://github.com/liy159872/HelpEasePro-Host>

HelpEasePro是基于Spring+Vue的社交求助平台。通过简单易用的界面和聚集各领域专业人士，提供高质量的解决方案。具备详细标签分类、学校社区分开、信用积分、Redis缓存等功能，提高系统性能和可扩展性。致力于提供快捷、高效、可信赖的求助渠道，让用户能够及时获得所需的帮助和支持。

**SpringBoot** 是一个基于Spring框架的快速开发、简化配置的微服务框架。
**SpringCloud** 是一个基于SpringBoot的开发工具箱，提供了一系列组件和开发工具，帮助开发者快速构建、配置和管理分布式系统应用。

HelpEasePro是基于前后端分离，采用SpringCloud+Vue框架开发的基于PCd端、移动端、小程序端的社交化求助平台；
使用了Spring Security安全框架进行密码的加密存储和登录登出等逻辑的处理；
以WebSocket+Socket.js+Stomp.js实现消息的发送与接收，监听；
搭建FastDFS文件服务器用于保存图片； 使用EasyExcel导出数据；
使用Vue.js结合Element UI、Vant、Echarts进行显示弹窗和数据表格分页等功能，以及整个系统的界面进行UI设计；
并且使用MyBatis结合数据库MySQL进行开发；
最后使用了Nginx进行部署前后端分离项目。


##功能实现

1.用户管理：用户可以注册、登录、修改个人资料等操作。
2.求助信息发布：用户可以发布求助信息，包括标题、描述、图片等信息。
3.搜索：用户可以根据关键词、分类、时间等条件搜索求助信息。
4.评论和点赞：用户可以在求助信息下面评论、点赞，以表达自己的看法和态度。
5.通知：平台会通过消息通知的方式通知用户有关于他们发布的求助信息的新的评论或点赞。
6.后台管理：管理员可以对用户、求助信息进行管理和审核，保证平台内容的质量和安全性。
7.三方链接分享：用户可以在平台上分享第三方链接，让其他用户也能够浏览和分享。
8.社交化功能：平台可以提供社交化功能，比如关注、私信等，让用户之间更加方便地交流和互动。
9.数据可视化：平台可以将用户发布的求助信息进行可视化，比如通过图表、地图等方式展示信息，让用户更加直观地了解信息的分布和趋势。
10.活动和奖励：平台可以推出一些活动和奖励，比如邀请好友、发布优质求助信息等，以激励用户积极参与和分享。
11.信用积分：平台可以根据用户在平台上的行为，比如发布求助信息、评论、点赞等，给予用户相应的信用积分。信用积分可以作为用户的信用评估指标，对于某些敏感信息或高风险操作，平台可以设置相应的信用门槛。
12.信用等级：平台可以根据用户的信用积分，将用户划分为不同的信用等级。不同的等级可以享有不同的特权，比如发布的求助信息可以有不同的优先级，评论和点赞的效力也会有所不同。
13.积分兑换：平台可以设置积分兑换规则，让用户可以将自己的积分兑换成一些实际的奖品或服务，比如折扣券、代金券、虚拟礼品等。
14.投诉和申诉：平台可以提供投诉和申诉功能，让用户在发现不良信息或遭受不公正对待时，可以通过平台进行申诉和投诉。平台可以通过审核投诉和申诉，保证平台的公正性和公平性。
15.详细标签分类：平台可以提供更加细化的标签分类，让用户可以根据不同的需求和兴趣，更精准地找到相关的求助信息。
16.学校和社区分开：平台可以将学校和社区分开，让用户可以根据不同的身份和需求，选择进入不同的平台。这样可以避免信息混杂和信息干扰，提高用户体验和效率。
17.广告和推广：平台可以设置广告和推广功能，让用户可以通过投放广告或付费推广，让自己的求助信息获得更多的曝光和关注。
18.智能推荐：平台可以通过机器学习和大数据技术，对用户的行为和兴趣进行分析，提供智能推荐功能，让用户更快地找到自己感兴趣的求助信息。


## HelpEasePro 部署流程

### 项目特别说明（由于此项目上线，本地运行需要相关修改）
如果此项目要使用内网穿透，或上线；需要进行以下操作：
1、请修改HelpEPAppApi Spring Boot后段对应yml配置文件中地址server.address为对应IP
2、请修改HelpEasePro-Mobile vue项目utils中request.js中的数据请求路径为对应IP
3、请修改HelpEasePro-Mobile vue项目layout/Header.vue中的数据请求路径为对应IP
4、请修改HelpEasePro-Mobile vue项目Me.vue中的数据请求路径为对应IP
5、请修改HelpEasePro-App vue项目中user/tabbar-user-order.vue的数据请求路径为对应IP
6、请修改HelpEasePro-App vue项目中user/user-information-set/index.vue的数据请求路径为对应IP
7、请修改HelpEasePro-AdminApp vue项目中goods/create.vue的数据请求路径为对应IP

同样的；如若只在本地运行；需要进行以下操作：
1、请修改HelpEPAppApi Spring Boot后段对应yml配置文件中地址server.address为local host
2、请修改HelpEasePro-Mobile vue项目utils中request.js中的数据请求路径为local host
3、请修改HelpEasePro-Mobile vue项目layout/Header.vue中的数据请求路径为local host
4、请修改HelpEasePro-Mobile vue项目Me.vue中的数据请求路径为local host
5、请修改HelpEasePro-App vue项目中user/tabbar-user-order.vue的数据请求路径为local host
6、请修改HelpEasePro-App vue项目中user/user-information-set/index.vue的数据请求路径为local host
7、请修改HelpEasePro-AdminApp vue项目中goods/create.vue的数据请求路径为local host

1. clone 项目到本地
   ###数据导入
2. 在本地 MySQL 中创建一个空的数据库 HelpEasePro，在该数据库中运行提供的数据库脚本HelpEasePro.sql,完成表的创建和数据的导入。
3. 提前准备好Redis，在项目中的mail模块的 application.yml 文件中，将 Redis 配置改为自己的。
4. 提前准备好RabbitMQ，在项目中的mail模块的 application.yml 文件中和web模块中的 application-dev.properties，将 RabbitMQ 的配置改为自己的。
5. 注册邮箱的授权码，在项目中的mail模块的 application.yml 文件中填入

![在这里插入图片描述](https://img-blog.csdnimg.cn/20201108165225396.png)

6. 搭建fastdfs服务器，fastdfs-client.properties文件改成自己的。

###后端运行

1.启动nacos
2.启动Redis
3.启动seata
4.启动rabbitmq
5.启动项目

准备环境：首先需要准备好服务器和数据库等环境，建议使用云服务器，选择性能稳定、安全可靠的云服务提供商，例如阿里云、腾讯云、华为云等。

安装依赖：在服务器上安装必要的依赖，例如JDK、MySQL等。

拉取代码：使用Git等工具，从代码仓库中拉取代码，并切换到需要部署的分支。

编译打包：使用Maven编译打包代码，生成可执行的Jar包。

部署数据库：使用MySQL等工具，创建数据库和表，并导入初始数据。

修改配置文件：根据需要修改配置文件，例如数据库连接信息等。

启动服务：使用命令行或脚本启动服务，例如使用java -jar命令启动Jar包。

测试：访问服务地址，测试服务是否正常。

### 客户端前端运行

8. 启动vue项目。

### 管理员PC端前端运行




## 开发环境

- 必备`mysql 8.0.29`或其他能够兼容此版本的`mysql`数据库
- 必备`Redis 3.2.100`或其他能够兼容此版本的`Redis`数据库-->并且 `PATH` 环境变量必须包含所需要的构建工具，如`Tomcat`、`Maven`
- 必备`Node.js`并能正常使用`npm`包管理器下载项目所需依赖
- 必备RabbitMQ-3.11.10相关环境配置，正常使用 
- 必备Elasticsearch-7.6.2或其他能够兼容此版本的ES
- 必备seata-1.4.2或其他能够兼容此版本的seata
- 必备nacos-1.4.3或其他能够兼容此版本的nacos
- 用户前端项目需要运行在8080端口，必须确保该端口未被占用
- 管理员前端项目需要运行在8081端口，必须确保该端口未被占用
- 后端服务需要运行在8147端口，必须确保该端口未被占用

## 线上演示地址及用户：

用户端：http://

测试用户：

用户名1： LJHX5470
手机号：14736856351
邮箱号：2080863176@qq.com
密码：a15987255470

用户名2： zxm15987753801
手机号：15987753801
邮箱号：3499007841@qq.com
密码：a15987255470

用户名3： Duanjiaming2001
手机号：18988411276
邮箱号：469220494@qq.com
密码：a15987255470

管理员： http://

管理员

用户名1：admin

密码：zxm010620

用户名2：LJHX5470

密码：zxm010620


## 更新链接

后端工程源码地址：https://github.com/liy159872/HelpEasePro-Host

后台管理系统工程源码地址：https://github.com/liy159872/HelpEasePro-Admin

PC端网页工程源码地址：https://github.com/liy159872/HelpEasePro-PC

移动端前台工程源码地址：https://github.com/liy159872/HelpEasePro-App

小程序端工程源码地址：https://github.com/liy159872/HelpEasePro-WX

## HelpEasePro技术栈

### 后端技术栈-host

1.Spring Cloud
2.Spring Boot
3.Spring Security
4.MyBatis
5.MySQL
6.WebSocket
7.RabbitMQ
8.Redis

### 前端技术栈-web

1. Vue
2. ElementUI
3. axios
4. vue-router
5. Vuex
6. WebSocket
7. vue-cli4
8. Vant
9. Echas
   ...

## 项目预览图

客户端界面-群聊主界面
![在这里插入图片描述](https://)

客户端界面-私聊界面
![在这里插入图片描述](https://)

管理端界面-用户管理
![在这里插入图片描述](https://)

管理端界面-群聊消息管理
![在这里插入图片描述](https://)


## 项目结构

后续会介绍项目模块结构目录树，对用户可以修改的文件做重点说明。

## 文档

请点击这个查看wiki的文档.
[项目文档](https://)

## 联系方式

负责人：李一

微信：LJHX5470

邮箱：2080863176@qq.com

对这个工程不明白的地方可以通过该联系方式与负责人联系
