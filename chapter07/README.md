# Spring AOP

标签： Spring

---

## Spring中的AOP
Spring框架中的一个关键组件是**AOP（面向方面编程）**。面向方面的编程需要把程序的逻辑分为不同的部分（关注点），跨一个应用程序的多个点的功能称为**横切关注点**，这些横切关注点在业务逻辑上独立于应用程序的业务逻辑，比如统计，日志等功能。

## AOP的术语
- aspect
> 方面，一个模块具有一组提供横切需求的API。

- join point
> 应用程序中AOP切入的切入点。

- advice
> 实际行动之前或者之后的方法，应用程序执行期间通过AOP框架实际执行的代码。

- pointcut
> 通知应该被执行的一组一个或者多个的连接点，可以使用表达式或者模式指定切入点。

- introduction
> 引用允许添加新方法或者新属性到现有的类中。

- target object
> 被一个方面或者多个方面通知的目标对象，这些对象永远都是一个被代理的对象，也称为被通知的对象。

- weaving
> 把方面连接到其他应用类型或者对象上，并创建一个被通知的对象。weaving可以在编译时、类加载时或者运行时完成。

## Spring AOP通知的类型
- 前置通知
> 在一个方法执行之前进行通知。

- 后置通知
> 在一个方法执行之后，不考虑后果如何，直接进行通知。

- 返回后通知
> 在一个方法执行并且成功返回后进行通知。

- 异常后通知
> 在一个方法执行并且抛出异常后进行通知。

- 环绕通知
> 在建议方法之前和之后，进行通知

## 包依赖
**Spring AOP**除了依赖Spring的包之外，还依赖`aspect`的其他包，下载[aspectj](https://www.eclipse.org/aspectj/)，然后安装，具体有：

> - aspectjrt.jar
> - aspectjweaver.jar
> - aspectj.jar
> - aopalliance.jar

## Spring AOP XML配置实现
Spring AOP XML配置实现时，需要在Spring的XML配置中增加`aop`的命名空间支持：
```
xmlns:aop="http://www.springframework.org/schema/aop"
```

一个**aspect（方面）**是使用XML元素声明的，需要支持的bean是使用`ref`属性进行引用：
```
<aop:config>
    <aop:aspect id="sampleAspect" ref="sample">
        <!-- 声明一个切入点 -->
        <aop:pointcut id="demoService"
            expression="execution(* com.xxx.DemoService.x())">
        </aop:pointcut>
        
        <!-- 声明前置建议 -->
        <aop:before pointcut-ref="demoService"
            method="doTest1">
        </aop:before>
        
        <!-- 声明后置建议 -->
        <aop:after pointcut-ref="demoService"
            method="doTest2">
        </aop:after>
        
        <!-- 声明返回后建议 -->
        <aop:after-returning pointcut-ref="demoService"
            returning="result"
            method="doTest3">
        </aop:after-returning>
        
        <!-- 声明异常后建议 -->
        <aop:after-throwing pointcut-ref="demoService"
            throwing="ex"
            method="doTest4">
        </aop:after-throwing>
        
        <!-- 声明环绕建议 -->
        <aop:around pointcut-ref="demoService"
            method="doTest5">
        </aop:around>
    </aop:aspect>
</aop:config>
<bean id="sample" class="com.xxx.Sample">
    ...
</bean>
```
参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter07/AOPXML)。

## Spring AOP @AspectJ注解实现
Java 5+版本开始支持通过`@AspectJ`来注解Java的普通类，通过Spring XML配置以下元素来支持`@AspectJ`：
```
<aop:aspectj-autoproxy />
```

在具体需要方面注入的Java类声明`@AspectJ`，然后类中先声明一个切入点，在具体的方面函数上声明需要切入的代码：
```
@AspectJ
public class Logging {
    
    @Pointcut("execution(* com.xxx.*.*(..))")
    private void pointCutFunc() {
    
    }
    
    @Before("pointCurFunc()")
    ...
    
    @After("pointCutFunc()")
    ...
    
    @AfterReturning(pointcut="pointCutFunc()", returning="x")
    ...
    
    @AfterThrowing(pointcut="pointCurFunc()", throwing="x")
    ...
}
```
参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter07/AOPAspectJ)。

