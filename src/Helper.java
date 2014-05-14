public class Helper {

    public static boolean isAlive(Player player){
        return(player.getHealth() > 0);
    }

    public static boolean isAlive(Enemy enemy){
        return(enemy.getHealth() > 0);
    }

    public static boolean speed(Player player, Enemy enemy){
        return(player.getSpeed() >= enemy.getSpeed());
    }

    public static void pAttack(Player player, Enemy enemy){
        int eHpLoss = (player.getDamage() + (Game.RANDOMNUM.nextInt(5) - 2)  - enemy.getArmor());
        System.out.println("Enemy lost " + eHpLoss + " Health.");
        enemy.setHealth(enemy.getHealth() - eHpLoss);
    }

    public static void eAttack(Player player, Enemy enemy){
        int pHpLoss = (enemy.getDamage() + (Game.RANDOMNUM.nextInt(5) - 2) - player.getArmor());
        System.out.println("You lost " + pHpLoss + " Health.");
        player.setHealth(player.getHealth() - pHpLoss);
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
        player.setHealth((player.getLevel()*3) + 47);
    }

    public static void heal(Player player, int potion){
        switch(potion){
            case 3:
                System.out.println("Using Small Potion");
                player.setHealth((player.getHealth()*12)/10);
                if(player.getHealth() > (player.getLevel()*3) + 47)
                    player.setHealth((player.getLevel()*3) + 47);
                System.out.println("You are now at " + player.getHealth() + " Health.");
                break;
            case 4:
                System.out.println("Using Medium Potion");
                player.setHealth((player.getHealth()*15)/10);
                if(player.getHealth() > (player.getLevel()*3) + 47)
                    player.setHealth((player.getLevel()*3) + 47);
                System.out.println("You are now at " + player.getHealth() + " Health.");
                break;
            case 5:
                System.out.println("Using Large Potion");
                player.setHealth((player.getHealth()*18)/10);
                if(player.getHealth() > (player.getLevel()*3) + 47)
                    player.setHealth((player.getLevel()*3) + 47);
                System.out.println("You are now at " + player.getHealth() + " Health.");
                break;
        }
    }

    public static int getPercent(){
        return Game.RANDOMNUM.nextInt(100);
    }
}
