# Spring 依赖注入

标签： Spring

---

## 依赖注入
每个基于应用程序的Java都有对象的组合，当编写一个复杂的Java应用程序时，应用程序类应该尽可能独立于其他Java类来增加这些类重用的可能性，并且在做测试时，测试类也应该独立于其他类。**依赖注入**可以将这些类黏合在一起，同时也可以让这些类保持独立。

注入之前的编写代码：
```
public class A {
    private B b;
    
    public A() {
        b = new B(); // 这地方依赖B的构造函数
    }
}
```

按照上面的这样，`A`类就会依赖`B`类的实例`b`，在Spring的控制反转中，可以实现如下：
```
public class A {
    private B b;
    
    public A(B b) {
        this.b = b;
    }
}
```

上述的代码A类根本不用担心B类的实现，整个过程由Spring来控制。

## Spring 基于构造函数的依赖注入
当Spring IoC容器调用带有一组参数的构造函数时，基于构造函数的依赖注入就开始工作，其中每个参数代表一个对其他类的依赖。有多个类型的不同的参数的构造函数时，最好使用索引`index`来。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter04/ConstrctorDI/)。

## Spring 基于设值函数的依赖注入
当Spring IoC容器调用一个午餐的构造函数初始化bean，然后通过容器在bean上调用设值函数，就完成了基于设值函数的依赖注入。
设值函数也就是在bean的XML配置中，添加`property`属性设置函数参数名称和对应的参数值。比如：
```
<bean id="hello" class="com.xxx.Hello">
    <property name="message" ref="message" />
</bean>
<bean id="message" class="com.xxx.Message">
    <property name="count" value="1" />
    <property name="content" value="spring!" />
</bean>
```
基于XML的bean的设置函数配置也可以通过`p-namespace`进行设置，上面的`message`的bean进行`p-namespace`设置如下：
```
<bean id="message" class="com.xxx.Message" 
    p:count="1" p:content="spring!" />
```

**备注**：`p-namespace`的`p:参数名=参数值`的形式只能进行设值函数的参数名称和参数值，如果要使用引用就需要`p:参数名-ref=参数值`的形式。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter04/SetterFunctionDI)。

## Spring 注入内部beans
如同Java内部类的定义，在bean的范围内也可以定义内部bean。
```
<bean id="outer" class="xxx">
    <property name="target">
        <bean id="inner" class="xxx" />
    </property>
</bean>
```

## Spring 注入集合
如果想给Spring IoC容器中的类传递多个值，比如`List/Set/Map`等。Spring提供了`4`种类型的集合的配置元素。参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter04/SetDI)。

- list
> 用`<list>`注入一列值，允许重复。

- set
> 用`<set>`注入一列值，不允许重复。

- map
> 用`<map>`注入`名称-值`对的集合，名称和值可以是任何类型。

- properties
> 用`<props>`注入`名称-值`对的集合，名称和值都是字符串类型。

