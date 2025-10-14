package monsters;

public class Army {
    Monster[] monsters;
    int top;

    public static Army Create() {
        Monster[] Tab = new Monster[100];
        Army NewArmy = new Army();
        NewArmy.monsters = Tab;
        NewArmy.top = 0;
        return NewArmy;
    }

    public static void addMonster(Army armée, Monster monstre) {
        armée.monsters[armée.top]=monstre;
        armée.top ++;
    }

    public static void Display(Army armée) {
        for (Monster monstre : armée.monsters) {
            Monster.Display(monstre);
        }
    }
}
