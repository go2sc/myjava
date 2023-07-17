package bigtalkdesignMod.v18.v18_5;

public class Test {
    public static void main(String[] args) {
        GameRole role = new GameRole();

        role.getInitState();
        role.displayState();

        // 保存记录
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(role.saveState());

        // 大战boss
        role.fight();
        role.displayState();

        // 载入进度
        role.recoveryState(stateAdmin.getMemento());

        role.displayState();
    }

}
