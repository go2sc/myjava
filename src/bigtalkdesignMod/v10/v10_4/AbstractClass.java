package bigtalkdesignMod.v10.v10_4;

public abstract class AbstractClass {

    public void templateMethod() {
        // ...共享代码

        this.primitiveOperation1();
        this.primitiveOperation2();

    }

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();
}
