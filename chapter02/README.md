# Spring IoC容器

标签： Spring

---

## IoC容器
Spring的IoC容器是Spring框架的核心。该容器将创建对象，并且将对象连接在一起，不仅仅配置它们，还将管理它们从创建到销毁整个生命周期。Spring容器使用依赖注入（DI）来管理组成一个应用程序的组件。这些对象被称为`Spring Beans`。Spring提供了两种不种类型的容器：

### Spring BeanFactory容器
Spring中最简单的容器，主要功能是为依赖注入提供支持。其中最常用的类就是`XmlBeanFactory`，这个类从一个XML文件中读取配置元数据，然后由这些元数据来生成一个被配置化的系统或者应用。主要的应用形式如下：
```
XmlBeanFactory factory = new XmlBeanFactory(
    new ClassPathResource("app-bean.xml"));
HelloSpring obj = (HelloSpring)factory.getBean("helloSpring");
obj.getMessage();
```
XML配置：
```
<bean id="helloSpring" class="com.xxx.HelloSpring">
    <property name="message" value="Spring!" />
</bean>
```
具体请参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter01/XmlSpringFactory)。

### Spring ApplicationContext容器
`ApplicationContext`容器包含`BeanFactory`的所有功能，最常被使用的`ApplicationContext`容器接口实现：

- FileSystemXmlApplicationContext
> 该容器从XML文件中加载已经被定义的`bean`，需要提供给构造器完整的XML文件路径。

- ClassPathXmlApplicationContext
> 该容器从XML文件中加载已经被定义的`bean`，这里不需要提供XML的文件完整路径，只需要配置`CLASSPATH`环境变量即可。

- WebXmlApplicationContext
> 该容器会在一个web应用程序的范围内加载在XML文件中已经被定义的`bean`。

具体的代码和上面的类似。

