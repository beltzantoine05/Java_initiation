package monsters;

public class Army {
    Monster[] monsters;
    int top;
    Node first;

    public static Army Create() {
        Monster[] Tab = new Monster[100];
        Army NewArmy = new Army();
        NewArmy.monsters = Tab;
        NewArmy.top = 0;
        NewArmy.first = null;
        return NewArmy;
    }

    public static void addMonster(Army armée, Monster monstre) {
        armée.monsters[armée.top]=monstre;
        armée.top ++;
        Node newnode = Node.create(monstre,armée.first);
        armée.first = newnode;
    }

    public static void Display(Army armée) {
        for (Monster monstre : armée.monsters) {
            Monster.Display(monstre);
        }
        System.out.println("Les monstres de la liste chainée : ");
        Node current = armée.first;
        while (current != null) {
            Monster.Display(current.monster);
            current = current.next;
        }
    }
}
