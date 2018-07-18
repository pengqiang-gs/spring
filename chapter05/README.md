# Spring 自动装配

标签： Spring

---

## 自动装配模式
前面已经讨论并且实践过Spring IoC的`基于构造函数/设值函数的依赖注入`，通过配置`bean`中的`construnctor-arg/property`来进行注入值的设定，以及`p-namespace`的使用。Spring也可以在不使用上述属性的情况下进行自动装配注入。对于需要大量配置`注入XML`的情况下，这无疑是好消息。

具体Spring的自动装配是在`bean`元素下面的`autowire`属性中指定为自动装配模式，默认情况下自动装配是不启用的。

## 使用ByName自动装配
这种模式由类的属性名称指定自动装配。Spring中的`bean`的`autowire`属性设置成`byName`，如果有同样名称的属性，则进行自动装配。
```
<bean id="hello" class="xxx" autowire="byName">
</bean>
<bean id="{name}" class="yyy">
</bean>
```
参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter05/AutowireByName)。

## 使用ByType自动装配
这种模式由类的属性类型指定自动装配。Spring中的`bean`的`autowire`属性设置成`byType`，如果有同样类型的属性，则进行自动装配。
```
<bean id="hello" class="xxx" autowire="byType">
</bean>
<bean id="{type}" class="yyy">
</bean>
```
参考[代码](https://github.com/pengqiang-gs/spring/tree/master/chapter05/AutowireByType)。

## 使用构造函数自动装配
这种模式和`byType`很类似，但是只适用于构造函数。Spring中的`bean`的`autowire`属性设置成`constructor`，则尝试将构造函数和`bean`中的参数进行匹配，匹配到就进行自动装配。
```
<bean id="hello" class="xxx" autowire="constructor">
</bean>
<bean id="{type}" class="yyy">
</bean>
```

