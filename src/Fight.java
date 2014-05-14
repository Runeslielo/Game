public class Fight {

    public static void startFight(Player player){
        System.out.println("Enemy Found!");
        Enemy enemy = new Enemy();
        Fight.fightOptions(player, enemy);
    }

    public static void fightOptions(Player player, Enemy enemy) {

        System.out.println("\nEnemy has " + enemy.getHealth() + " Health");
        System.out.println("\nYou have " + player.getHealth() + " Health");



        String option = "";
        do {
            System.out.println("\nFight");
            System.out.println("Consume");
            System.out.println("Run");
            System.out.println("\nChoose an Option");
            option = Game.getInput.next();
        }
        while(Helper.invalidChoice(option));

        fighting(player, enemy, option);
    }

    public static Player fighting(Player player, Enemy enemy, String option){
        
            switch (option.toLowerCase()) {
                case "fight":
                    if(Helper.speed(player, enemy)) {
                        Helper.pAttack(player, enemy);
                        if(Helper.isAlive(enemy))
                            Helper.eAttack(player, enemy);
                        else
                            option = "";
                    }
                    else{
                        Helper.eAttack(player, enemy);
                        if(Helper.isAlive(player))
                            Helper.pAttack(player, enemy);
                        else
                            option = "";
                    }
                    break;
                case "consume":
                    //Item System in progress
                    break;
                case "run":
                    if(Helper.getPercent() < 69)
                        break;
                    else
                        System.out.println("Failed to Run!");
                    Helper.eAttack(player, enemy);
                    option = "";
                    break;
                default:
                    break;
            }
            if(option.equals("run"))
                System.out.println("Successfully Ran Away");
            else if(Helper.isAlive(enemy) && Helper.isAlive(player))
                fightOptions(player,enemy);
            else if(!Helper.isAlive(enemy) && Helper.isAlive(player)){
                System.out.println("Enemy was defeated!");
                //EXP GAIN
                System.out.println("Loot the Body? ( Y / N )");
                if(Helper.confirm())
                    return player; //Looting System in progress
                else
                    return player;
            }
            else
                Helper.pDead(player);
        return player;
    }
}