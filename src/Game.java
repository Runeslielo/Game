import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game{

    public static final Random RANDOMNUM = new Random();
    public static final Scanner getInput = new Scanner(System.in);
    public static Player player = new Player();

    public static void main(String[] args) {

        Fight.startFight(player);
        System.out.println("End of Fight");
        //Walking System

    }
}

