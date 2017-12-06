# hisen-dubbo-demo
spring + springMVC + mybatis + dubbo + zookeeper
## 拆分方式
目前是按照原来的ssm框架进行的
## 陷阱
### 关于启动方式
1. 通过一个java类启动
2. 在spring中添加一个listener

得注意区分二者的区别,我搞混了,然后浪费了半天的时间去搜寻各种资料
### 关于404
一开始我启动成功之后，访问controller出现404，以为是sprinMVC配置出问题

结果忘记看错误提示，其实是页面不存在而已。谨记
## 参考
1. http://blog.csdn.net/u010887744/article/details/64160769
2. https://github.com/zxiaofan/OpenSource_Study/tree/master/dubbo
3. http://blog.csdn.net/u010887744/article/details/64160769
