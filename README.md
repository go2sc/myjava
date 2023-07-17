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




## 设计模式


### 工厂方法模式（Factory Method）
定义一个用于创建对象的接口，
让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。

![](imgs/2023-07-05-17-29-34.png)

1.简单工厂

![](imgs/2023-07-05-16-58-02.png)

2. 工厂方法模式

![](imgs/2023-07-05-16-58-45.png)

改进

![](imgs/2023-07-05-17-12-20.png)

### 抽象工厂模式（Abstract Factory）

提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。

![](imgs/2023-07-10-15-51-21.png)

### 策略模式（Strategy）

它定义了算法家族，分别封装起来，让它们
之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。

![](imgs/2023-07-05-17-39-53.png)

```txt
1.策略模式实现了算法的封装
2.减少类来代替工厂方法
```

### 装饰模式 (Decorator)
动态地给一个对象添加一些额外的职责，
就增加功能来说，装饰模式比生成子类更为灵活。

### 代理模式（Proxy）
为其他对象提供一种代理以控制对这个对象的访问。

![](imgs/2023-07-05-16-49-09.png)

### 原型模式（Prototype）
用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象。

![](imgs/2023-07-06-11-01-51.png)

### 模板方法（Template Method）模式
定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法
的结构即可重定义该算法的某些特定步骤。

![](imgs/2023-07-06-16-40-23.png)

### 外观模式（Facade）
为子系统中的一组接口提供一个一致的界面，
此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

![](imgs/2023-07-07-10-49-03.png)

### 建造者模式（Builder）
将一个复杂对象的构建与它的表示分离，
使得同样的构建过程可以创建不同的表示。

![](imgs/2023-07-07-14-24-12.png)

### 观察者模式

定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。

### 状态模式（State）
当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。

![](imgs/2023-07-11-14-33-07.png)

### 适配器模式（Adapter）
将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

![](imgs/2023-07-11-16-02-46.png)

### 备忘录（Memento）
在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
这样以后就可将该对象恢复到原先保存的状态。

![](imgs/2023-07-11-17-16-58.png)

### 组合模式（Composite）
将对象组合成树形结构以表示'部分-整体'的层次结构。
组合模式使得用户对单个对象和组合对象的使用具有一致性。

### 迭代器模式（Iterator）
提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示。

![](imgs/2023-07-12-17-01-23.png)

### 单例模式（Singleton）
保证一个类仅有一个实例，并提供一个访问它的全局访问点。

![](imgs/2023-07-13-11-04-54.png)

### 桥接模式（Bridge）
将抽象部分与它的实现部分分离，使它们都可以独立地变化。

![](imgs/2023-07-13-17-16-23.png)

### 命令模式（Command）
将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；
对请求排队或记录请求日志，以及支持可撤销的操作。

![](imgs/2023-07-14-10-18-28.png)

### 职责链模式（Chain of Responsibility）
使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。

![](imgs/2023-07-14-15-58-56.png)

### 中介者模式（Mediator）
用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，
从而使其耦合松散，而且可以独立地改变它们之间的交互。

![](imgs/2023-07-14-17-06-32.png)

### 享元模式（Flyweight）

运用共享技术有效地支持大量细粒度的对象。

[label](imgs-1)

### 解释器模式（interpreter）
给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

![Alt text](imgs/image-1.png)

### 访问者模式（Visitor）

表示一个作用于某对象结构中的各元素的操作。
它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

![Alt text](imgs/image-2.png)

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

### 迪米特法则（LoD）
如果两个类不必彼此直接通信，那么这两个类
就不应当发生直接的相互作用。如果其中一个类需要调用另一个类的某一
个方法的话，可以通过第三者转发这个调用。

### 合成／聚合复用原则（CARP）
尽量使用合成／聚合，尽量不要使用类继承。

## test

```plantuml
Interface Component{
    + operation()
}

note top of Component
Component 是定义一个对象接口，
可以给这些对象动态的添加职责
end note

' class ConcreteComponent implements Component{
'     + operation()
' }

class ConcreteComponent extends Component{
    + operation()
}

abstract Decorator extends Component{
    + operation()
}

Component <--o Decorator

note right of Decorator
Decorator,装饰抽象类,继承了Component，
从外类来扩展Component类的功能，但对于Component
来说，是无需直到Decorator的存在的
end note

class ConcreteDecoratorA extends Decorator{
    - addedState: String
    + operation()
}



class ConcreteDecoratorB extends Decorator{
    + operation()
    - addedBehavior()
}

' Component <|-- ConcreteComponent
```