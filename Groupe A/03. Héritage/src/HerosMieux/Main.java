package HerosMieux;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[5];
        heroes[0] = new Warrior();
        heroes[1] = new Hero();
        heroes[2] = new Archer();
        heroes[3] = new Hero();
        heroes[4] = new Warrior();

        for (Hero hero : heroes) {
            hero.heroAttack();
        }
    }
}
