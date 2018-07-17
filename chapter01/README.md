# Spring体系结构

标签： Spring

---

## Spring的体系结构
Spring是模块化的，提供选择自己适合的模块，不必要的模块没必要引入。具体的Spring的模块图如下：
![](https://7n.w3cschool.cn/attachments/image/wk/wkspring/arch1.png)

### 核心容器
核心容器由**spring-core,spring-beans,spring-context,spring-context-support,spring-expression**模块组成，具体功能说明：
- **spring-core**
> 该模块提供可了框架的基本组成部分，包括`IoC`和依赖注入功能。

- **spring-beans**
> 该模块提供`BeanFactory`，工厂模式实现，可以把配置和依赖从实际编码逻辑中解耦。

- **spring-context**
> 该模块继承自`spring-beans`模块，添加了国际化（使用资源束）、事件传播、资源加载和透明的创建上下文等功能。

- **spring-context-support**
> 该模块提供了对第三方库集成到Spring上下文的支持。

- **spring-expression**
> 该模块提供了强大的表达式语言，用于在运行时查询和操作对象图。

### 数据访问
- **JDBC**
> 该模块提供了`JDBC`抽象层，消除了冗长的`JDBC`编码和对特定的数据库供应商的错误代码解析。

- **ORM**
> 该模块提供了对流行的对象关系映射API的集成，包括`JPA`、`JDO`和`Hibernate`。

- **OXM**
> 该模块提供了对`OXM`实现的支持。

- **JMS**
> 该模块提供生产和消费消息的功能。

- **事务**
> 该模块实现特殊接口类以及所有的`POJO`支持编程式和声明式事务管理。

### Web
- **Web**
> 该模块提供面向Web的基本功能以及上下文。

- **Web-MVC**
> 该模块提供了模型视图控制（MVC）和REST Web服务实现。

- **Web-Socket**
> 该模块提供了WebSocket支持。

- **Web-Portlet**
> 该模块提供用于Portlet环境的MVC实现。

### 其他
- **AOP**
> 该模块提供了面向方面的编程，允许定义方法拦截器和切入点，对代码进行干净的解耦。

- ***Aspects**
> 该模块提供了与`AspectJ`的集成，是一个功能强大且全面的面向方面编程（AOP）的框架。

- **Instrumentation**
> 该模块在一定的应用服务器中提供了`instrumentation`的支持和类加载器的实现。

- **Mesaging**
> 该模块为STOMP提供了支持在应用程序中WebSocket子协议的使用。

- **测试**
> 该模块支持对`JUnit`或者`testNG`框架的Spring组件的测试。
