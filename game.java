import java.io.*;
import java.util.Scanner;

public class game
{
    
      void vcomp(char arr[],int n) throws IOException
      {
             Scanner in = new Scanner(System.in);
             int cs=0,ys=0;
             int nr=n;
              while(n>0)
             {
                 System.out.print("Enter choice : rock(r) , paper(p) or scissor(s) -> ");
                 char choice = in.nextLine().charAt(0) ;
			
                 
                 
                 int c = (int)(Math.random()*2);
                 char compch = arr[c] ;
                 System.out.println("Your Choice -> "+ choice + "\nComputer Choice -> " + compch); 
                 if(choice == compch)
                 {
                     System.out.println("TIE POINT");
            
                     n=n-1;
                 continue;
                 }
                 else{
                     if(choice=='r')
                     {
                          if(compch=='p'){
                          cs++;
                          System.out.println("COMPUTER WINS A POINT");
                          } 
                          else{
                          ys++;
                          System.out.println("YOU WIN A POINT");
                         }
                          
                     }
                     else if(choice == 'p')
                     {
                         if(compch=='r'){
                         ys++;
                         System.out.println("YOU WIN A POINT");
                         }
                         else{
                         System.out.println("COMPUTER WINS A POINT");
                         cs++;
                         }
                     }
                     else
                     {
                           if(compch=='r'){
                           System.out.println("COMPUTER WINS A POINT");
                           cs++;
                           } 
                           else{
                           System.out.println("YOU WIN A POINT");
                           ys++;
                           }
                     }
                 }
                 n=n-1;
              }
              
      
                         
              System.out.println("\n");            
              System.out.println("PLAYER SCORE -> "+ ys);
              System.out.println("COMPUTER SCORE -> "+cs);
              System.out.println("\n");
              if(cs==ys)
              {
                  System.out.println("TIE OCCURED.  DO YOU WANT TO PLAY AGAIN?(y/n) : ");
                  char ch =in.nextLine().charAt(0);
                 
                  if(ch=='y'){
                  game obj = new game();
                  obj.vcomp(arr,nr);
                  }
                  else
                  System.out.println("BYE!HAVE A NICE DAY");
              }
                      
                  
              
              else if(cs>ys)
              System.out.println("COMPUTER WINS");
              else 
              System.out.println("YOU WIN");
       
       
        }
      
       
        
      public static void main(String args[]) throws IOException
      {
             DataInputStream in = new DataInputStream(System.in);
             
             System.out.println("ROCK PAPER SCISSOR inc.    \n\nVERSION 0.0.1");
             
           
             char arr[]={'r','p','s'};
              
             System.out.print("\nEnter no. of points ->");
             int n = Integer.parseInt(in.readLine());
             game obj=new game();
             
             obj.vcomp(arr,n);
             
             
             
                     
      }
    }
             