package bigtalkdesignMod.v18.v18_2;

public class Test {
    public static void main(String[] args) {
        GameRole role = new GameRole();

        role.getInitState();
        role.displayState();

        // 保存记录
        GameRole backup = new GameRole();
        backup.setVitality(role.getVitality());
        backup.setAttack(role.getAttack());
        backup.setDefense(role.getDefense());

        // 大战boss
        role.fight();
        role.displayState();

        // 载入进度
        role.setVitality(backup.getVitality());
        role.setAttack(backup.getAttack());
        role.setDefense(backup.getDefense());

        role.displayState();
    }

}
