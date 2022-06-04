import java.util.Scanner;

public class TicTacToe {
    Scanner Scan = new Scanner(System.in);
    String[] UI = {"1","2","3","4","5","6","7","8","9"};
    String Player = "X";
    int i = 0;


    public static void main (String[] args){
        TicTacToe app = new TicTacToe();
        app.statements();
        app.Game();
    }
    public void Game(){
        System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
        System.out.println(Player + " Your Turn: " );
        input();
        statements();
    }
    public void input(){
        String Pinput = Scan.nextLine();
        System.out.println("***************************");
        if (Pinput.equals(UI[0])) {
            UI[0] = Player;
            i++;
        }
        else if (Pinput.equals(UI[1])) {
            UI[1] = Player;
            i++;
        }
        else if (Pinput.equals(UI[2])) {
            UI[2] = Player;
            i++;
        }
        else if (Pinput.equals(UI[3])) {
            UI[3] = Player;
            i++;
        }
        else if (Pinput.equals(UI[4])) {
            UI[4] = Player;
            i++;
        }
        else if (Pinput.equals(UI[5])) {
            UI[5] = Player;
            i++;
        }
        else if (Pinput.equals(UI[6])) {
            UI[6] = Player;
            i++;
        }
        else if (Pinput.equals(UI[7])) {
            UI[7] = Player;
            i++;
        }
        else if (Pinput.equals(UI[8])) {
            UI[8] = Player;
            i++;
        }
        else {
            System.out.println("Error");
            System.out.println("***************************");
            Game();
        }
    }
    public void swap(){
        if(Player.equals("X"))
            Player = "O";
        else if(Player.equals("O"))
            Player = "X";
    }
    public void statements(){
        if(UI[0].equals(Player) && UI[1].equals(Player) && UI[2].equals(Player)) {
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println(Player + " Won The Game");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);
        }

        if(UI[3].equals(Player) && UI[4].equals(Player) && UI[5].equals(Player)) {
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println(Player + " Won The Game");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);

        }
        if(UI[6].equals(Player) && UI[7].equals(Player) && UI[8].equals(Player)) {
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println(Player + " Won The Game");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);
        }
        if(UI[0].equals(Player) && UI[3].equals(Player) && UI[6].equals(Player)) {
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println(Player + " Won The Game");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);
        }
        if(UI[1].equals(Player) && UI[4].equals(Player) && UI[7].equals(Player)) {
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println(Player + " Won The Game");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);
        }
        if(UI[2].equals(Player) && UI[5].equals(Player) && UI[8].equals(Player)) {
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println(Player + " Won The Game");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);
        }
        if(UI[0].equals(Player) && UI[4].equals(Player) && UI[8].equals(Player)) {
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println(Player + " Won The Game");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);
        }
        if(UI[2].equals(Player) && UI[4].equals(Player) && UI[6].equals(Player)) {
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println(Player + " Won The Game");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);
        }
        else if(i == 9){
            System.out.println(UI[0] + " " + UI[1] + " " + UI[2] + "\n" + UI[3] + " " + UI[4] + " " + UI[5] + "\n" + UI[6] + " " + UI[7] + " " + UI[8]);
            System.out.println("Tie");
            System.out.println("Press enter to exit");
            Scan.nextLine();
            System.exit(0);
        }
        else
        {
            swap();
            Game();
        }
    }
}
