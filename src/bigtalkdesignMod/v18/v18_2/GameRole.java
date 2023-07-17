package bigtalkdesignMod.v18.v18_2;

public class GameRole {
    private int vitality;

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    private int attack;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    private int defense;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void displayState() {
        System.out.println("角色当前状态: ");
        System.out.println("体力: " + this.vitality);
        System.out.println("攻击力: " + this.attack);
        System.out.println("防御力: " + this.defense);
        System.out.println();
    }

    public void getInitState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }
}
