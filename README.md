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
## 目录清单 以及注解
```
.
|-- README.md
|   |
|-- hisen-dubbo-api
|   |-- pom.xml
|   |-- src
|   |   |-- main
|   |   |   |-- java
|   |   |   |   `-- com
|   |   |   |       `-- hisen
|   |   |   |           `-- entity
|   |   |   |               `-- Book.java #提供公共的实体类
|   |   |   `-- resources
|   |   `-- test
|   |       `-- java
|   |
|-- hisen-dubbo-consumer
|   |-- pom.xml
|   |-- src
|   |   `-- main
|   |       |-- java
|   |       |   `-- com
|   |       |       `-- hisen
|   |       |           `-- web
|   |       |               `-- BookController.java
|   |       |-- resources
|   |       |   |-- jdbc.properties
|   |       |   |-- logback.xml
|   |       |   |-- mapper
|   |       |   |   `-- BookMapper.xml
|   |       |   |-- mybatis-config.xml
|   |       |   `-- spring
|   |       |       |-- applicationContext.xml
|   |       |       |-- spring-dao.xml
|   |       |       |-- spring-dubbo-config.xml #dubbo配置文件
|   |       |       |-- spring-dubbo-consumer.xml #dubbo消费者配置文件
|   |       |       |-- spring-service.xml
|   |       |       `-- spring-web.xml
|   |       `-- webapp
|   |           |-- WEB-INF
|   |           |   |-- jsp
|   |           |   |   |-- detail.jsp
|   |           |   |   `-- list.jsp
|   |           |   `-- web.xml #这里需要配置listener
|   |           `-- index.jsp
|   |
|-- hisen-dubbo-provider
|   |-- pom.xml
|   |-- src
|   |   `-- main
|   |       |-- java
|   |       |   `-- com
|   |       |       `-- hisen
|   |       |           |-- dao
|   |       |           |   `-- BookDao.java
|   |       |           `-- service
|   |       |               `-- impl
|   |       |                   |-- App.java # 非必须，目前可以直接跟随tomcat启动。如果要用此方式，注意引入dubbo配置文件
|   |       |                   `-- BookServiceImpl.java
|   |       |-- resources
|   |       |   |-- jdbc.properties
|   |       |   |-- logback.xml
|   |       |   |-- mapper
|   |       |   |   `-- BookMapper.xml
|   |       |   |-- mybatis-config.xml
|   |       |   `-- spring
|   |       |       |-- applicationContext.xml
|   |       |       |-- spring-dao.xml
|   |       |       |-- spring-dubbo-config.xml #dubbo配置文件
|   |       |       |-- spring-dubbo-provider.xml #dubbo提供者配置文件，service多的话可以分开配置
|   |       |       |-- spring-service.xml
|   |       |       `-- spring-web.xml
|   |       `-- webapp
|   |           |-- WEB-INF
|   |           |   `-- web.xml #需要配置listener
|   |           `-- index.jsp
|   |
|-- hisen-dubbo-service
|   |-- pom.xml
|   |-- src
|   |   |-- main
|   |   |   |-- java
|   |   |   |   `-- com
|   |   |   |       `-- hisen
|   |   |   |           `-- service
|   |   |   |               `-- BookService.java # 提供公共的接口
|   |   |   `-- resources
|   |   `-- test
|   |       `-- java
`-- pom.xml
```
## 参考
1. http://blog.csdn.net/u010887744/article/details/64160769
2. https://github.com/zxiaofan/OpenSource_Study/tree/master/dubbo
3. http://blog.csdn.net/u010887744/article/details/64160769
