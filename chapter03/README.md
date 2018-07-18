# Spring Bean

标签： Spring

---

## Spring Bean 定义
Spring Bean是一个被实例化，组装，并且通过Spring IoC容器管理的对象。bean是由用容器提供的配置元数据创建的。bean定义包含的配置元数据包括：

- 如何创建一个bean
- bean的生命周期详细信息
- bean的依赖关系

上述所有的配置元数据构成了bean定义的下列属性：

- class
> 该属性指定用来创建bean类，是强制性属性。

- name
> 该属性指定唯一的bean标识符。在基于XML的配置元数据中，可以使用`id`或者`name`属性来指定bean的标识符。

- scope
> 该属性指定由bean创建的对象的使用作用域。

- constructor-arg
> 该属性用来基于构造函数的注入依赖关系。

- properties
> 该属性用来基于函数值的注入依赖关系。

- autowiring mode
> 该属性用来注入依赖关系。

- lazy-initialization mode
> 该属性告诉IoC容器该bean在第一次请求时进行初始化，而不是在启动时就创建bean实例。

- initialization
> 在bean的所有的属性被IoC容器设置后，调用的回调方法。

- destruction
> 当bean实例所在的IoC容器被销毁时的回调方法。

## Spring 配置元数据
Spring IoC容器由实际编写的配置元数据格式进行解耦，提供给Spring IoC容器配置元数据的方式：

- 基于XML的配置文件
- 基于注解的配置
- 基于Java的配置

## Spring Bean的作用域
当在Spring中声明一个bean时，必须声明该bean的作用域选项。不过bean的作用域有默认选项，因此在实际配置bean的过程中可以不写。具体的作用域选项：

- singleton
> 在Spring IoC容器中仅存在一个当前的实例，bean实例以单例的形式存在，也是bean配置作用域的默认选项。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter03/ScopeSingleton/)。

- prototype
> 每次从容器中调用bean时，都返回一个新的实例。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter03/ScopePrototype/)
> ```Class obj = (Class)context.getBean("class");```
> 等价于
> ```Class obj = new XXXBean("class");```

- request
> 每次`http`请求时创建一个新的bean，仅适用于`WebApplicationContext`环境。

- session
> 同一个`http session`共享一个bean，仅适用于`WebApplicationContext`环境。

- global-session
> 仅适用于`Portlet`应用环境。

## Spring Bean 生命周期
定义bean时，指定`init-method`属性的方法，在实例化bean时会调用该方法进行创建bean实例；同理，指定`destroy-method`属性的方法，从容器中移除bean实例时，调用该方法。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter03/LifeCycle)

也可以在bean的上一级也就是beans的声明中指定`default-init-method`以及`default-destroy-method`，这样就不需要在每一个bean上进行配置，只选择有需要配置的bean进行配置。

## Spring Bean 继承
在bean的定义属性中增加`parent`属性以及值，值指定父类的bean的标识符（可以是`id`或者`name`），然后对于同样名称的需要注入的值，子bean可以重写覆盖父bean。

