# 项目理念

HelpEasePro-App的设计受众是社区和学生，而不是互联网企业，因此HelpEasePro-App的开发理念是一个小而美：

* 小，指的是技术简单、架构简单、性能指标低、业务仅覆盖基本功能
* 美，指的是技术新、架构清晰易扩展、安全系数不低、业务可直接部署使用

正是因为以上考虑，目前HelpEasePro-App的架构是简单的，三种技术栈都是最基本的。

虽然这么说，但是实际上开发的入门门槛不低：
* 项目采用了三种技术栈，相互之间是相对独立的；
* 采用的spring boot框架和vue-element-admin框架已经依赖相当多的库；
* 除了开发技术，开发过程中也会涉及其他技术，包括环境配置、版本控制、
  测试技术、日志、部署等等。

因此后期扩展新的代码或讨论业务前，建议考虑以下问题：

* 是否引入过多的复杂性，而没有带来相应的收益？

  因为本项目希望能够为更多的人所学习使用，项目的复杂性是需要考虑的问题。
  如果是复杂性和收益是相同的，那么接收扩展的可能性其实值得讨论。

* 是否依赖过多的库？是否必须依赖该库？如果仅仅是该库的微小部分，是否可以自己实现一个简单的util类？

  例如，一些技术框架采用了fastjson，而实际上spring boot已经默认采用jackson，因此如果没有特殊原因，
  扩展者应该尽可能采用jackson。
  
* 是否盲目地采用过多过先进的技术？是否可以暂缓采用？

  这里是谨慎的。例如，如果要引入缓存技术，则需要去学习缓存相关的类库，以及可能会遇到一些使用中存在的问题。
  而v2.0.0之前其实没有必要提前考虑性能问题。同样地，单点登录技术是分布式架构中必须存在的基本功能，但是
  目前两个后端服务分别采用各自登录方案即可。

  注意：
  > 这里并不是拒绝新技术，而是希望采取一个渐进式的谨慎的态度。
  > 此外，对于新技术运用，其实规划是基于本项目稳定版本再开发一个独立的分布式版本。
  
* 已经有了一个技术，是否有必要扩展相同目的的另外一种技术？

  这里是欢迎的。例如，已经有了vue框架的管理后台，但是采用其他前端框架的管理后台也是欢迎的。
  这样可以给不同技术背景的用户所选择。当然，应该尽量保持不同版本之间的同步。又或者，小程序
  已经有了一些开发框架，而目前小商场的小程序端仍然是原始的小程序技术，因此基于这些新的开发框架
  来重构小程序端是欢迎的。
  
  也就是说本项目希望避免技术深度，而倾向于技术宽度，帮助自己以及更多的人学习了解不同的技术。
  
* 扩展代码量不大，或者改善文档。

  这里是欢迎的。很多开源项目都建议扩展代码时应该少量并且逻辑分明。这样审阅代码时才能明确。
  当然，如果是单词拼写不对之类，那么应该尽可能在一次commit中修复同样的问题。
  
虽然这里可能表现出对新技术的谨慎态度，但是如果用户发现有更好的技术或者有必要，欢迎讨论。
当然，如果开发者不认同这里的一些理念，也可以基于自己的技术选型来开发自己的版本。
如果认为自己开发的好，可以在本项目提交链接地址，让其他开发者了解。

## 项目业务

本项目所设想的基本业务功能已经在文档中列举完成。

如果希望引入高级功能，例如分销功能等，建议用户在本项目基础上自行开发。

如果认为有基本业务没有实现，可以Issue或者QQ群讨论，加入后续开发计划。

当然更希望开发者直接提供代码，丰富完善目前的基础业务功能。

## 代码扩展

* 代码规范目前没有严格要求，后续会补充。

## Issue规范

* 在提交issue之前，请搜索是否存在相关问题。
* 提交的Issue请尽可能给出详细信息
* 建议Issue基于最新的代码
