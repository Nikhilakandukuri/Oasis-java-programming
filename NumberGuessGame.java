import java.util.*;
class NumberGuessGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you wish to start the game?");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("All the best for your game!");
             System.out.println("Let's begin the game...!!!");
             int number=(int)Math.floor(Math.random()*100);
             System.out.println("Number of trails can be utilized :");
             int trails=sc.nextInt();
             int score=10*trails;
             System.out.println("The score initially is "+score);
             System.out.println("10 marks will be reduced for wrong guess..");
             while(trails>0){
                System.out.println("Enter a number ");
                int value=sc.nextInt();
                if(number==value){
                    System.out.println("Hurreh..!! You won the game");
                    trails=0;                    
                    }
                else{   
                    score=score-10;
                    if(trails!=1){
                 if(number>value){
                    System.out.println("Enter the larger number");
                }
                else {
                    System.out.println("Enter the smaller number");
                }
                }
                }
                trails--;
             }
             System.out.println("The number is "+number);
             System.out.println("Your score is "+score);
        }
        else{
        System.out.println("Get ready to participate next time....!!!");
        }
        
    }
}