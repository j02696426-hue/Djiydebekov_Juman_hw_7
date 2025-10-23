public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(250, 40, "FIREBALL"),
                new Medic(220, 10, "HEAL", 50),
                new Warrior(300, 60, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
