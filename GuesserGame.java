import java.util.Scanner;
 class Guesser {
     int GuessNum;
//Getting number from the guesser
// Within the range 1-50.
     public int GuesserNum() {
         System.out.println("Guesser please guess the number from 1-50");
         Scanner scan = new Scanner(System.in);
         GuessNum = scan.nextInt();
         if(GuessNum>1&&GuessNum<=50)
         {
             System.out.println(GuessNum);
         }
         else
         {
             System.out.println("Enter the number between 1-50");
             GuesserNum();
         }
         return GuessNum;
     }
 }
 //Getting number from the player
// Within the range 1-50.
    class Player{
        int PlayerGuessNum;
        public int PlayerGuess()
            {
                System.out.println("Player guess the number between 1-50");
            Scanner scan=new Scanner(System.in);
            PlayerGuessNum=scan.nextInt();
                if(PlayerGuessNum>1&&PlayerGuessNum<=50)
                {
                    System.out.println(PlayerGuessNum);
                }
                else
                {
                    System.out.println("Enter the number between 1 to 50");
                    PlayerGuess();
                }
            return PlayerGuessNum;
        }
        }
        //Umpire getting the number from players and Guesser
 class Umpire {
        int NumFromGuesser;
        int NumFromPlayer1;
        int NumFromPlayer2;
        int NumFromPlayer3;

        public void CollectNumFromGuesser() {
            Guesser g = new Guesser();
            NumFromGuesser = g.GuesserNum();

        }

        public void CollectNumFromPlayer() {
            Player P1 = new Player();
            Player P2 = new Player();
            Player P3 = new Player();
            NumFromPlayer1 = P1.PlayerGuess();
            NumFromPlayer2 = P2.PlayerGuess();
            NumFromPlayer3 = P3.PlayerGuess();
        }

        public void Compare() {
            if (NumFromGuesser == NumFromPlayer1) {
                if (NumFromGuesser == NumFromPlayer2 && NumFromGuesser == NumFromPlayer3)
                {
                    System.out.println("All player guessed correctly");
                    //If all the players have guessed the number correctly then once again the game will start.
                    Guesser g = new Guesser();
                    NumFromGuesser = g.GuesserNum();
                    CollectNumFromPlayer();
                    Compare();
                } else if (NumFromGuesser == NumFromPlayer2)
                {
                    System.out.println("Player1 and Player 2 Qualified for finals");
                    //Once again collecting the number from guesser for Finals.
                    Guesser g = new Guesser();
                    NumFromGuesser = g.GuesserNum();
                    Finalcompare1();
                }
                else if (NumFromGuesser == NumFromPlayer3)
                {
                    System.out.println("Player1 and Player 3 Qualified for finals");
                    //Once again collecting the number from guesser for Finals.
                    Guesser g = new Guesser();
                    NumFromGuesser = g.GuesserNum();
                    Finalcompare2();
                }
                else
                    System.out.println("Player 1 won the game");
            }
            else if (NumFromGuesser == NumFromPlayer2)
            {
                if (NumFromGuesser == NumFromPlayer3)
                {

                    System.out.println("Player 2 and player 3 Qualified for finals");
                    //Once again collecting the number from guesser for Finals.
                    Guesser g = new Guesser();
                    NumFromGuesser = g.GuesserNum();
                    Finalcompare3();
                } else

                    System.out.println("Player 2 won the game");
            }
            else if (NumFromGuesser == NumFromPlayer3)
                System.out.println("Player 3 won the game");
        }

        public void Finalcompare1()
        {
            //Once again collecting the number from players for comparing.
            Player P1 = new Player();
            Player P2 = new Player();
            NumFromPlayer1 = P1.PlayerGuess();
            NumFromPlayer2 = P2.PlayerGuess();
            Compare();
        }

        public void Finalcompare2()
        {
            //Once again collecting the number from players for comparing.
            Player P1 = new Player();
            Player P3 = new Player();
            NumFromPlayer1 = P1.PlayerGuess();
            NumFromPlayer3 = P3.PlayerGuess();
            Compare();
        }

        public void Finalcompare3()
        {
            //Once again collecting the number from players for comparing.
            Player P2 = new Player();
            Player P3 = new Player();
            NumFromPlayer2 = P2.PlayerGuess();
            NumFromPlayer3 = P3.PlayerGuess();
            Compare();
        }
    }
        public class GuesserGame {
            public static void main(String[] args) {
                Umpire u = new Umpire();
                u.CollectNumFromGuesser();
                u.CollectNumFromPlayer();
                u.Compare();
            }
        }

