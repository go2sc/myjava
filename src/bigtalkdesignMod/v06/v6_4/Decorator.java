package bigtalkdesignMod.v06.v6_4;

public abstract class Decorator extends Component {
    protected Component component;

    // 装饰一个对象
    public void SetComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }

}
