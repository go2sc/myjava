## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## 总结

### 降低耦合

* 策略模式 
    策略模式封装了变化

* 装饰模式 (Decorator)
动态地给一个对象添加一些额外的职责，
就增加功能来说，装饰模式比生成子类更为灵活。


## 设计模式




## 设计原则

### 单一职责原则（SRP）
就一个类而言，应该仅有一个引起它变化的原因。

### 开放-封闭原则

是说软件实体（类、模块、函数等）应该可以扩
展，但是不可修改。

在软件设计模式中，这种不能修
改，但可以扩展的思想也是最重要的一种设计原则，它就是开放-封闭原则
（The Open-Closeed Principle，OCP）或叫开-闭原则。

无 论 模 块 是 多 么
的'封闭'，都会存在一些无法对之封闭
的变化。既然不可能完全封闭，设计人员必须对于他设计的模块应该对哪种
变化封闭做出选择。他必须先猜测出最有可能发生的变化种类，然后构造抽
象来隔离那些变化

### 依赖倒转原则

（1）高层模块不应该依赖低层模块。两个都应该依赖抽象。
（2）抽象不应该依赖细节。细节应该依赖抽象。

这话绕口，说白了，就是要针对接
口编程，不要对实现编程


### 里氏代换原则

是一个软件实体如果使用的是一个父类的话，那么一定适用于其子类，而且它察觉不出父类对象和
子类对象的区别。也就是说，在软件里面，把父类都替换成它的子类，程序
的行为没有变化，简单地说，子类型必须能够替换掉它们的父类型