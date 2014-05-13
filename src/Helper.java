public class Helper {

    public static boolean alive(Player player){
        return(player.getHealth() > 0);
    }

    public static boolean alive(Enemy enemy){
        return(enemy.getHealth() > 0);
    }

    public static boolean speed(Player player, Enemy enemy){
        return(player.getSpeed() >= enemy.getSpeed());
    }

    public static int pAttack(Player player, Enemy enemy){
        int eHpLoss = (player.getDamage() + (Game.RANDOMNUM.nextInt(player.getLevel() + 5) - (Game.RANDOMNUM.nextInt(player.getLevel() + 4)) - enemy.getArmor()));
        System.out.println("Enemy lost " + eHpLoss + " Health.");
        enemy.setHealth(enemy.getHealth() - eHpLoss);
        return 0;
    }

    public static int eAttack(Player player, Enemy enemy){
        int pHpLoss = (enemy.getDamage() + (Game.RANDOMNUM.nextInt(enemy.getLevel() + 5) - (Game.RANDOMNUM.nextInt(enemy.getLevel() + 4)) - player.getArmor()));
        System.out.println("You lost " + pHpLoss + " Health.");
        player.setHealth(player.getHealth() - pHpLoss);
        return 0;
    }

    public static Boolean confirm(){
        do {
            switch (Game.getInput.next().toLowerCase()) {
                case ("y"):
                    return true;
                case ("n"):
                    return false;
                default:
                    break;
            }
        }
        while(true);
    }

    public static boolean invalidChoice(String option){
        switch(option.toLowerCase()){
            case "fight":
            case "consume":
            case "run":
                return false;
            default:
                System.out.println("Invalid Option");
                return true;
        }
    }

    public static void pDead(Player player){
        player.setDeaths(player.getDeaths() + 1);
        System.out.println("You Died, You Suck, Fuck off Noob");
        System.out.println("Losing ~30% of Experience");
        player.setExp((player.getExp()*2)/3);
        System.out.println("Respawning out of combat with full Health");
    }

    public static int getPercent(){
        return Game.RANDOMNUM.nextInt(100);
    }
}
