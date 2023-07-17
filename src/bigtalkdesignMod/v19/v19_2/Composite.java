package bigtalkdesignMod.v19.v19_2;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        // TODO Auto-generated method stub
        children.add(component);
    }

    @Override
    public void display(int depth) {
        // TODO Auto-generated method stub
        for (var i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component item : children) {
            item.display(depth + 2);
        }
    }

    @Override
    public void remove(Component component) {
        // TODO Auto-generated method stub
        children.remove(component);
    }

}
