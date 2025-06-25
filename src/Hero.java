public class Hero extends Chraracter {
    public Hero(String input_name){
        super(input_name);

    }
    public void greeting(){
        System.out.println(this.name +"は、「こんにちは」とあいさつをした!");

    }
    public void attack(){
        System.out.println(this.name+"はつるぎでこうげきした!");

    }
    public void skill(Hero hero){
        System.out.println(hero.name +"は、ホイミをとなえた!");
        this.hp += 10;
        System.out.println(hero.name +"のHPが10かいふくした!");

    }
    public void escape(){
        System.out.println(this.name +"はにげだした!");
    }
}
