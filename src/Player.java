public class Player {

    private int health = 50;
    private int damage = 3;
    private int armor = 1;
    private int speed = 7;
    private int exp = 3;
    private int level = exp / 3;
    private int kills = 0;
    private int deaths = 0;

    private String name = null;

    public Player setHealth(int health){
        this.health = health;
        return this;
    }

    public int getHealth(){
        return health;
    }

    public Player setDamage(int damage){
        this.damage = damage;
        return this;
    }

    public int getDamage(){
        return damage;
    }

    public Player setArmor(int armor){
        this.armor = armor;
        return this;
    }

    public int getArmor(){
        return armor;
    }

    public Player setSpeed(int speed){
        this.speed = speed;
        return this;
    }

    public int getSpeed(){
        return speed;
    }

    public Player setExp(int exp){
        this.exp = exp;
        return this;
    }

    public int getExp(){
        return exp;
    }

    public Player setLevel(int level){
        this.level = level;
        return this;
    }

    public int getLevel(){
        return level;
    }

    public Player setKills(int kills){
        this.kills = kills;
        return this;
    }

    public int getKills(){
        return kills;
    }

    public Player setDeaths(int deaths){
        this.deaths = deaths;
        return this;
    }

    public int getDeaths(){
        return deaths;
    }

    public Player setName(String name){
        this.name = name;
        return this;
    }

    public String getName(){
        return name;
    }
}
