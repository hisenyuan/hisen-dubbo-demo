# hisen-dubbo-demo
spring + springMVC + mybatis + dubbo + zookeeper

## 陷阱
目前发现两种方式启动dubbo提供者
1. 通过一个java类启动
2. 在spring中添加一个listener

得注意区分二者的区别,我搞混了,然后浪费了半天的时间去搜寻各种资料
