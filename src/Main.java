import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        RandomNumber obj = new RandomNumber();
        System.out.println("System has Generated a Number ");
        System.out.println("It is between 1 to 50");
        System.out.println("You have only 5 attempts to Guess it ???");
        int ct = 0;
        int flag = 0;
        while (true) // true
        {
            if(flag==0)
            {
                System.out.println("Are You Ready to Play the Game !!!! If yes then type yes otherwise type no");
                flag = 1;
            }
            else
            {
                System.out.println("Want to play the game !!! If yes then type yes otherwise type no");
            }

            String isReady = sc.next();

            if (isReady.equals("yes"))
            {
                int number = obj.getRandomNumber();
                for (int i = 0; i < 5; i++)
                {
                    System.out.print("Enter the number that you have Guess ");
                    int inputNumber = sc.nextInt();
                    System.out.println();
                    if (inputNumber == number)
                    {
                        System.out.println("You guess the correct Number");
                        ct++;
                        break;
                    } else if (inputNumber >= 41 && inputNumber <= 50) {
                        if(i==4)
                        {
                            System.out.println("Your Guess is Wrong please !!!");
                            System.out.println("Number is " + number);
                        }
                        else
                        {
                            System.out.println("Your Guess is Wrong please !!! It is Somewhat between 41 to 50");
                        }

                    } else if (inputNumber >= 31 && inputNumber <= 40) {
                        if(i==4)
                        {
                            System.out.println("Your Guess is Wrong please !!!");
                            System.out.println("Number is " + number);
                        }
                        else
                        {
                            System.out.println("Your Guess is Wrong please !!! It is Somewhat between 31 to 40");
                        }
                    }
                    else if (inputNumber >= 21 && inputNumber <= 30)
                    {
                        if(i==4)
                        {
                            System.out.println("Your Guess is Wrong please !!!");
                            System.out.println("Number is " + number);
                        }
                        else
                        {
                            System.out.println("Your Guess is Wrong please !!! It is Somewhat between 21 to 30");
                        }
                    }
                    else if (inputNumber >= 11 && inputNumber <= 20)
                    {
                        if(i==4)
                        {
                            System.out.println("Your Guess is Wrong please !!!");
                            System.out.println("Number is " + number);
                        }
                        else
                        {
                            System.out.println("Your Guess is Wrong please !!! It is Somewhat between 11 to 20");
                        }

                    } else if (inputNumber >= 1 && inputNumber <= 10)
                    {
                        if(i==4)
                        {
                            System.out.println("Your Guess is Wrong please !!!");
                            System.out.println("Number is " + number);
                        }
                        else
                        {
                            System.out.println("Your Guess is Wrong please !!! It is Somewhat between 1 to 10");
                        }
                    }

                }
            }
            else
            {
                break;
            }
        }
        System.out.println("Your Score is " + ct);
    }
}