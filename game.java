import java.util.Scanner;
public class game
{   
    public static void begin()
      {int value=10;
       Scanner scan = new Scanner(System.in);
       System.out.println("press 1 to play || press 2 to exit");
       int i = scan.nextInt();
       
       if(i==1)
          {System.out.println("select 1.Stone 2.Paper 3.Scissor");
           
            value = scan.nextInt();
              if(value<4&&value>0)
               {switch(value)
                {case 1: {System.out.println("Here is your Stone");} break; 
                 case 2: {System.out.println("Here is your Paper");} break;
                 case 3: {System.out.println("Here is your Scissor");} break;
                }
            
                sps(value);
               }
              else 
              {System.out.println("please select an appropriate option");
              begin();
              }
            
            
           
             
           } 
        
       else if (i==2) {
          {System.out.println("exit succesfull");} 
                       }
        
       else
           {System.out.println("please enter a valid input");
            begin();}
       scan.close(); 
      }
   
     public static void sps(int value)
       {int comp = (int)(Math.random()*(3)+1);
        switch(comp)
          {case 1: {System.out.println("Here is my Stone");} break;
           case 2: {System.out.println("Here is my Paper");} break;
           case 3: {System.out.println("Here is my Scissor");} break;
          }

        if(value==1)
        {
          switch(comp)
            {case 1: {System.out.println("draw");}
             break;
             case 2: {System.out.println("You lose!");}
             break;
             case 3: {System.out.println("Hurrah ! You Won!");}}
        }

        if(value==2)
        {
          switch(comp)
            {case 1: {System.out.println("Hurrah! You Won!");}
             break;
             case 2: {System.out.println("draw");}
             break;
             case 3: {System.out.println("You lose!");}}
        }
        
        if(value==3)
        {
          switch(comp)
            {case 1: {System.out.println("You Lose !");}
             break;
             case 2: {System.out.println("Hurrah ! You Won!");}
             break;
             case 3: {System.out.println("Draw");}}
        } 
        begin();   

    }
public static void main(String [] args)
{
    begin();
}

}

