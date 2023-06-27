package b01_对象和类;

import org.junit.Test;

import b01_对象和类.dog.Dog;
import b01_对象和类.dog.Puppy;

public class ObjectTest {
    @Test
    public void test() {
        System.out.println("hello");
    }

    // dog简单类声明
    @Test
    public void testDog() {
        Dog dog = new Dog();

        System.out.println(dog);
    }

    // 构造方法和创造对象
    @Test 
    public void testCreateObject() {
         Puppy myPuppy = new Puppy( "tommy" );
    }
}
