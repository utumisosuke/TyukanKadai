public abstract class Chraracter implements Creature {
    String name;
    int hp;
    public Chraracter(String input_name){
        this.name = input_name;
        this.hp = 100;
    }
    public abstract void attack();
    public abstract void skill(Hero hero);
    public void protect(){
        System.out.println(this.name +"は、まもりのたいせいにはいった!");
    }
}
