public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("サトシ");
        Hero hero2 = new Hero("タケシ");

        hero1.greeting();
        hero2.attack();
        hero1.skill(hero1);
        hero2.protect();
        hero1.escape();
    }
}
