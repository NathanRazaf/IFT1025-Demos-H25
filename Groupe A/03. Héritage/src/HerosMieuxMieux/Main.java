package HerosMieuxMieux;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[5];
        heroes[0] = new Warrior();
        heroes[1] = new Archer();
        heroes[2] = new Archer();
        heroes[3] = new Warrior();
        heroes[4] = new Warrior();

        for (Hero hero : heroes) {
            hero.heroAttack();
        }
    }
}
