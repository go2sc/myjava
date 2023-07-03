package bigtalkdesignMod.trainee;

import java.util.ArrayList;

import org.junit.Test;

import bigtalkdesignMod.trainee.v0_11.IChange;
import bigtalkdesignMod.trainee.v0_11.MachinecCat;
import bigtalkdesignMod.trainee.v0_11.StoneMonkey;
import bigtalkdesignMod.trainee.v0_7.Animal;

// 0 培训实习生
public class demo {

    // 0.2 类与实例
    // 这个非常简单
    @Test
    public void Test0_2() {
        System.out.println("喵");
    }

    // 多喵几次呢
    String shout() {
        return "喵";
    }

    @Test
    public void Test0_2_a() {
        System.out.println(shout());
    }

    // 实例化
    @Test
    public void Test0_2_b() {
        Cat cat = new Cat();

        System.out.println(cat.shoutV1());
    }

    // 0.3 构造方法
    @Test
    public void Test0_3() {
        Cat cat = new Cat("咪咪");
        System.out.println(cat.shout());
    }

    // 0.4 方法重载
    @Test
    public void Test0_4() {
        Cat cat = new Cat();

    }

    // 0.5 属性与修饰符
    // set get
    @Test
    public void Test0_5() {
        // 基本
        Catv0 cat = new Catv0();
        // 只读属性
        Catv1 catv1 = new Catv1();
        // 控制次数
        Catv2 catv2 = new Catv2();
        // shout改进
        Catv3 catv3 = new Catv3("咪咪");
        catv3.setShoutNum(5);
        System.out.println(catv3.shout());
    }

    // 0.6 封装
    @Test
    public void Test0_6() {
        Dog dog = new Dog("旺财");

        dog.setShoutNum(8);

        System.out.println(dog.shout());
    }

    // 0.7 继承
    @Test
    public void Test0_7() {
        bigtalkdesignMod.trainee.v0_7.Cat cat = new bigtalkdesignMod.trainee.v0_7.Cat("咪咪");
        System.out.println(cat.shout());

        bigtalkdesignMod.trainee.v0_7.Dog dog = new bigtalkdesignMod.trainee.v0_7.Dog("旺财");
        System.out.println(dog.shout());
    }

    // 0.8 多态
    @Test
    public void Test0_8() {
        Animal[] arrayAnimal = new Animal[5];

        // 报名代码

        // 开始叫声比赛
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayAnimal[i].shout());
        }
    }

    // 添加动物
    @Test
    public void Test0_8_a() {
        Animal[] arrayAnimal = new Animal[5];

        // 报名代码
        arrayAnimal[0] = new bigtalkdesignMod.trainee.v0_7.Cat("小花");
        arrayAnimal[1] = new bigtalkdesignMod.trainee.v0_7.Dog("阿毛");
        arrayAnimal[2] = new bigtalkdesignMod.trainee.v0_7.Dog("小黑");
        arrayAnimal[3] = new bigtalkdesignMod.trainee.v0_7.Cat("娇娇");
        arrayAnimal[4] = new bigtalkdesignMod.trainee.v0_7.Cat("咪咪");

        // 开始叫声比赛
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayAnimal[i].shout());
        }
    }

    // 0.9重构
    @Test
    public void Test0_9() {
        bigtalkdesignMod.trainee.v0_9.Animal[] arrayAnimal = new bigtalkdesignMod.trainee.v0_9.Animal[5];

        // 报名代码
        arrayAnimal[0] = new bigtalkdesignMod.trainee.v0_9.Cat("小花");
        arrayAnimal[1] = new bigtalkdesignMod.trainee.v0_9.Dog("阿毛");
        arrayAnimal[2] = new bigtalkdesignMod.trainee.v0_9.Cattle("小黑");
        arrayAnimal[3] = new bigtalkdesignMod.trainee.v0_9.Sheep("娇娇");
        arrayAnimal[4] = new bigtalkdesignMod.trainee.v0_9.Cat("咪咪");

        // 开始叫声比赛
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayAnimal[i].shout());
        }
    }

    // 0.10 抽象类
    // 抽象类不能被初始化
    @Test
    public void Test0_10() {
        bigtalkdesignMod.trainee.v0_10.Animal a;
    }

    // 0.11 接口
    @Test
    public void Test0_11() {
        MachinecCat mcat = new MachinecCat("叮当");
        StoneMonkey wukong = new StoneMonkey("孙悟空");

        IChange[] array = new IChange[2];
        array[0] = mcat;
        array[1] = wukong;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].changeThing("各种各样的东西!"));
        }
    }

    // 0.12 集合
    @Test
    public void Test0_12() {
        ArrayList arrayAnimal = new ArrayList<>();

        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Cat("小花"));
        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Dog("阿毛"));
        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Dog("小黑"));
        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Cat("娇娇"));
        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Cat("咪咪"));

        for (Object item : arrayAnimal) {
            Animal animal = (Animal) item;
            System.out.println(animal.shout());
        }

        System.out.println("动物个数:" + arrayAnimal.size());
    }

    // 装箱和拆箱
    @Test
    public void Test0_12_a() {
        // 装箱
        int i = 123;
        Object o = (Object) i;

        // 拆箱
        int j = (int) o;
    }

    // 0.13 泛型
    @Test
    public void Test0_13() {
        ArrayList<Animal> arrayAnimal = new ArrayList<Animal>();

        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Cat("小花"));
        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Dog("阿毛"));
        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Dog("小黑"));
        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Cat("娇娇"));
        arrayAnimal.add(new bigtalkdesignMod.trainee.v0_7.Cat("咪咪"));

        for (Animal animal : arrayAnimal) {
            System.out.println(animal.shout());
        }

        System.out.println("动物个数:" + arrayAnimal.size());
    }
}
