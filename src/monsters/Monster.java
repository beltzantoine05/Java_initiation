package monsters;

public class Monster {
    String name;
    int health;

    public static Monster Create(String name, int health) {
        Monster NewMonster = new Monster();
        NewMonster.name = name;
        NewMonster.health = health;
        return NewMonster;
    }

    public static void Display(Monster monstre) {
        System.out.println("Le nom du monstre est : " + monstre.name);
    }
}
