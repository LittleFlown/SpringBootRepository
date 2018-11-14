springboot集成jsp模板
1. 在根目录建webapp/WEB-INF/jsp目录
2. pom.xml中添加
    <!--jsp页面使用jstl标签-->
    <!--用于编译jsp--> 此依赖scope定义为provided，即运行时无效；因为tomcat中已经存在，所以运行时使其无效
3. 打包到外部tomcat运行时，需要将pom.xml文件中springboot自带的tomcat依赖移除，然后修改启动类。
    （修改启动类目的在于是其类似于web.xml的方式启动）

知识点：maven中scope依赖范围的概念
依赖范围就是用来控制依赖和三种classpath(编译classpath，测试classpath、运行classpath)的关系，Maven有如下几种依赖范围：
compile:编译依赖范围。如果没有指定，就会默认使用该依赖范围。使用此依赖范围的Maven依赖，对于编译、测试、运行三种classpath都有效。
    典型的例子是spring-code,在编译、测试和运行的时候都需要使用该依赖。
test: 测试依赖范围。使用次依赖范围的Maven依赖，只对于测试classpath有效，在编译主代码或者运行项目的使用时将无法使用此依赖。
    典型的例子是Jnuit,它只有在编译测试代码及运行测试的时候才需要。
provided:已提供依赖范围。使用此依赖范围的Maven依赖，对于编译和测试classpath有效，但在运行时候无效。
    典型的例子是servlet-api,编译和测试项目的时候需要该依赖，但在运行项目的时候，由于容器以及提供，就不需要Maven重复地引入一遍。