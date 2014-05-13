public class Enemy {

    private int health = Game.RANDOMNUM.nextInt(20) + 15;
    private int damage = Game.RANDOMNUM.nextInt(10) + 1;
    private int armor = Game.RANDOMNUM.nextInt(5) + 1;
    private int speed = Game.RANDOMNUM.nextInt(10) + 1;
    private int level = (health / 10) + (damage / 3) + (armor / 2);

    public Enemy setHealth(int health){
        this.health = health;
        return this;
    }

    public int getHealth(){
        return health;
    }

    public Enemy setSpeed(int speed){
        this.speed = speed;
        return this;
    }

    public int getSpeed(){
        return speed;
    }

    public Enemy setDamage(int damage){
        this.damage = damage;
        return this;
    }

    public int getDamage(){
        return damage;
    }

    public Enemy setArmor(int armor){
        this.armor = armor;
        return this;
    }

    public int getArmor(){
        return armor;
    }

    public Enemy setLevel(int level){
        this.level = level;
        return this;
    }

    public int getLevel(){
        return level;
    }

}
