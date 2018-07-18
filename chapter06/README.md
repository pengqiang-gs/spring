# Spring基于注解的配置

标签： Spring

---

## 基于注解的配置
Spring 2.5+版本开始不但支持bean连线的依赖注入，而且支持基于注解的配置依赖注入，可以使用相关类，方法，字段声明的注解，将bean配置移动到组件类本身。如果不仅有注解注入，而且XML也配置了注入，则XML配置会被注解注入重写。注解注入默认在Spring中没有打开，如果需要注解注入，在Spring的XML配置文件中添加：
```
<context:annotaytion-config />
```
就可以启用注解注入。

## Spring @Required注解注入
`@Required`注解应用于`bean`属性的`setter`方法，它表明当前的属性bean配置必须在XML文件中，否则抛出`BeanInitializationException`异常。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter06/AnnoRequired/)。

## Spring @Autowired注解注入
`@Autowired`注解运用在不同的地方，对于完成自动连接提供更为详细的控制。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter06/AnnoAutowired/)。

默认情况下`@Autowired`注解意味着当前依赖是必须的，类似于`@Required`注解，可以使用`@Autowired(required=false)s`关闭这种默认行为。

- setter方法上的@AutoWired注解
> 和之前的`byType`自动装配类似，可以不用在bean中显式声明属性参数。

- 属性上的@Autowired注解
> 可以不需要该属性的`setter`方法。

- 构造函数上的@Autowired注解
> 和之前的`constructor`自动装配类似。

## Spring @Qualifier注解注入
bean中配置了相同类型的好几个属性，只需要限定其中的某些属性可以装配当前实例时，使用`@Autowired`和`@Qualifier({bean_id})`来限定。

## Spring JSR注解注入
之前为了定义一个bean的安装和卸载，使用了`inti-method/destroy-method`属性，表明一个bean实例在构造完成后/销毁时回调处理方法。同时也可以使用`@PostConstruct/@PreDestroy`进行注释。
如果需要给`setter`方法注入的bean中的`参数名`定义一个别名，可以在`setter`方法上增加`@Resource(name="xxx")`的注解，让其遵循`byName`的语义进行自动连线。

## Spring 使用Java配置
基于Java的配置，可以在不使用Spring bean配置XML的情况下，编写大部分的Spring应用程序。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter06/AnnoJava/)。

## Spring中的事件
前面已经知道，Spring的核心就是`ApplicationContext`，它负责管理bean的整个生命周期。在加载bean的同时，`ApplicationContext`会发布相应的事件。具体的事件有：

- ContextRefreshEvent
> `ApplicationContext`被初始化或者刷新时，该事件被触发。

- ContextStartedEvent
> `ApplicationContext`接口中的`start()`方法启动时，该事件被触发。

- ContextStoppedEvent
> `ConfigurableApplicationContext`接口中的`stop()`方法启动时，该事件被触发。

- RequestHandledEvent
> 这是一个`web-specific`事件，告诉所有bean，`http`请求已经被服务。

参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter06/AnnoEvent/)。

