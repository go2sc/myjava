package bigtalkdesignMod.v19.v19_2;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add to a leaf.");

    }

    @Override
    public void display(int depth) {
        // TODO Auto-generated method stub
        for (var i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void remove(Component component) {
        // TODO Auto-generated method stub
        System.out.println("Cannot remove from a leaf.");
    }

}
