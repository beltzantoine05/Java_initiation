package monsters;

public class Pokedex {
    public static void main(String[] args) {
        Army Armée = Army.Create();

        for (int i = 0; i < Armée.monsters.length; i++) {
            Army.addMonster(Armée, Monster.Create("Pikachu" + (i+1), 0));
        }
        Army.Display(Armée);
    }
}
