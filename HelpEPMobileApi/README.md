# HelpEasePro-App

社交化求助平台。

HelpEasePro-App = Spring Boot后端 + Vue管理员前端 + 微信小程序用户前端 + Vue用户移动端


## 项目实例

### HelpEasePro-App实例

暂无实例，建议开发者本地测试。

### HelpEasePro-wx实例

请手机扫描以下二维码访问:


或者浏览器采用手机模式访问以下网址:

注意：
> 1. 由于第一次加载数据量较大，建议wifi网络访问，且耐心等待数秒。
> 2. 此实例是测试HelpEasePro-wx，不支持支付，而且处于开发中还不完善。

### 管理后台实例

1. 浏览器打开，输入以下网址: 
2. 管理员用户名`admin123`，管理员密码`admin123`
> 注意：此实例只是测试管理后台。

## 项目代码

* [码云](https://gitee.com/liyiaixuemei)
* [GitHub](https://github.com/liy159872)

## 技术栈

> 1. Spring Cloud
> 2.Spring Boot
> 3.Vue
> 4.微信小程序

## 功能

### HelpEasePro-App功能

* 首页
* 专题列表、专题详情
* 分类列表、分类详情
* 求助列表、求助详情
* 新求助首发、人气推荐
* 优惠券列表、优惠券选择
* 团互助
* 搜索
* 求助详情、互助评价、知识分享
* 互助
* 发贴求助
* 求助列表、求助详情、求助售后
* 地址、收藏、足迹、意见反馈
* 客服

### 管理平台功能

* 会员管理
* HelpEasePro-App管理
* HelpEasePro-wx管理
* 推广管理
* 系统管理
* 配置管理
* 统计报表

## 快速启动

1. 配置最小开发环境：
    * [MySQL](https://dev.mysql.com/downloads/mysql/)
    * [JDK1.8或以上](http://www.oracle.com/technetwork/java/javase/overview/index.html)
    * [Maven](https://maven.apache.org/download.cgi)
    * [Nodejs](https://nodejs.org/en/download/)
    * [微信开发者工具](https://developers.weixin.qq.com/miniprogram/dev/devtools/download.html)
    
2. 数据库依次导入HelpEasePro-Host/sql/HelpEasePro-App下的数据库文件
    * HelpEasePro-Mobile01.sql
    * HelpEasePro-Mobile02.sql
    * HelpEasePro-Mobile03.sql

3. 启动HelpEasePro-App和管理后台的后端服务
    
4. 启动管理后台前端

    打开命令行，输入以下命令
    ```bash
    npm install -g cnpm --registry=https://registry.npm.taobao.org
    cnpm install
    cnpm run dev
    ```
    此时，浏览器打开，输入网址`http://localhost:9527`, 此时进入管理后台登录页面。
    
5. 启动HelpEasePro-wx前端
   
   这里存在两套HelpEasePro-wx前端HelpEasePro-wx和HelpEase-wx，开发者可以分别导入和测试：

   1. 微信开发工具导入HelpEasePro-wx项目;
   2. 项目配置，启用“不校验合法域名、web-view（业务域名）、TLS 版本以及 HTTPS 证书”
   3. 点击“编译”，即可在微信开发工具预览效果；
   4. 也可以点击“预览”，然后手机扫描登录（但是手机需开启调试功能）。
      
   注意：
   > 这里只是最简启动方式，而HelpEasePro-wx的微信登录、微信支付等功能需开发者设置才能运行。

6. 启动HelpEasePro-App前端

    打开命令行，输入以下命令
    ```bash
    npm install -g cnpm --registry=https://registry.npm.taobao.org
    cnpm install
    cnpm run dev
    ```
    此时，浏览器（建议采用chrome 手机模式）打开，输入网址`http://localhost:6255`, 此时进入HelpEasePro-App。

    注意：
    > 现在功能很不稳定，处在开发阶段。
        
## 开发计划

当前版本[v04.1.0](https://github.com/liy159872/HelpEasePro-Host)

目前项目开发中，存在诸多不足，以下是目前规划的开发计划。

V04.2.0 完成以下目标：

1. 除了部分功能（如优惠券等），HelpEasePro-App的优化和改进基本结束；
2. 管理后台基本实现所有表的CRUD操作；
3. 后端服务能够对参数进行检验。

V05.0.0 完成以下目标：

1. HelpEasePro-App和管理后台完成所有基本业务；
2. 管理后台实现统计功能、日志功能、权限功能；
3. 业务代码和细节代码进行调整优化；
4. HelpEasePro-App的开发；

V06.0.0 完成以下目标：

1. 管理后台一些辅助功能
2. 后端服务加强安全功能、配置功能
3. 缓存功能以及优化一些性能

## 警告

> 1. 本项目仅用于KUST-毕业设计
> 2. 本项目还不完善，仍处在开发中，不承担任何使用后果


## 联系方式

负责人：李一

微信：LJHX5470

邮箱：2080863176@qq.com

对这个工程不明白的地方可以通过该联系方式与负责人联系

