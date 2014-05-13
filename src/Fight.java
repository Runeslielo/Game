public class Fight {

    public void startFight(Player player){
        System.out.println("Enemy Found!");
        Enemy enemy = new Enemy();
        Fight.fightOptions(player, enemy);
    }

    public static void fightOptions(Player player, Enemy enemy) {

        System.out.println("\nEnemy has " + enemy.getHealth() + " Health");
        System.out.println("\nYou have " + player.getHealth() + " Health");

        String option = "";

        System.out.println("\nFight");
        System.out.println("Consume");
        System.out.println("Run");

        do {
            System.out.println("\nChoose an Option");
            option = Game.getInput.next();
        }
        while(Helper.invalidChoice(option));

        fighting(player, enemy, option);
    }

    public static Player fighting(Player player, Enemy enemy, String option){

        do{
            switch (option.toLowerCase()) {

                case "fight":
                    if (Helper.speed(player, enemy))
                        Helper.pAttack(player, enemy);
                    if (Helper.alive(enemy))
                        Helper.eAttack(player, enemy);
                    break;
                case "consume":
                    //Item System in progress
                    break;
                case "run":
                    if(Helper.getPercent() < 69)
                        break;
                    else
                        Helper.eAttack(player, enemy);
                    option = "";
                    break;
            }
            if(option.equals("run"))
                break;
            else if(Helper.alive(enemy) && Helper.alive(player))
                fightOptions(player,enemy);
            else if(!Helper.alive(enemy) && Helper.alive(player)) {
                System.out.println("Enemy was defeated!");
                //EXP GAIN
                System.out.println("Loot the Body? ( Y / N )");
                /*if(Helper.confirm() == true)
                    return player; //Looting System in progress
                else
                    return null;*/
            }
            else
                Helper.pDead(player);
        }
        while(!option.equals("run") || Helper.alive(player));
        return player;
    }
}