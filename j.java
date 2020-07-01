import java.util.Scanner;
public class Johnson_NestedLoop{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int programNumber = 7; // need to change later
    if (programNumber==1){
      System.out.print("\t");
      for(int a=1;a<=8; a++){
        System.out.print("\t" + a);
      }
      System.out.println();
      for(int b=1; b<=8; b++){
        System.out.print("\t" + b);
        for(int c=1; c<=8; c++){
          System.out.print("\t" + b*c);
        }
        System.out.println();
      }
    }
    if(programNumber == 2){
      System.out.printf("Enter your initial:\t");
      String initial = keyboard.nextLine();//will have to change later
      for(int d=1; d<=5; d++){
        for(int e=1; e<=5; e++){
          System.out.print(initial);
        }
        System.out.println();
      }
    }
    if(programNumber == 3){
      System.out.printf("Enter your initial:\t");
      String initial = keyboard.nextLine();//will have to change later
      for(int d=1; d<=5; d++){
        for(int e=1; e<=(6-d); e++){
          System.out.print(initial);
        }
        System.out.println();
      }
    }
    if(programNumber == 4){
      System.out.printf("Enter a first initial:\t");
      String initial = keyboard.nextLine();//will have to change later
      System.out.printf("Enter a second initial:\t");
      String initial2 = keyboard.nextLine();//will have to change later
      for(int d=1; d<=5; d++){
        int e;
        for(e=1; e<=d; e++){
          System.out.print(initial);
        }
        for(int f=1; f<=(7-e); f++){
          System.out.print(initial2);
        }
        System.out.println();
      }
    }
    if(programNumber == 5){
      System.out.printf("Enter your initial:\t");
      String initial = keyboard.nextLine();//will have to change later
      for(int d=1; d<=5; d++){
        for(int e=1; e<=(6-d); e++){
          System.out.print(" ");
        }
        for(int f=1; f<=(2*d-1);f++){
          System.out.print(initial);
        }
        System.out.println();
      }
    }
    if(programNumber == 6){
      System.out.printf("Enter how many across: \t");
      int across = keyboard.nextInt();
      int hasRun=0;
      while (across%2==0){
        System.out.printf("<Error: size cannot be even>\nEnter how many across: \t");
        across = keyboard.nextInt();
      }
      while(!(across%2==0)&& !(hasRun==1)){
        int rows = (int)((double)(across/2+.5))+1;
        for(int d=1; d<=rows; d++){
          for(int e=1; e<=(rows*2-d); e++){
            System.out.print(" ");
          }
          for(int f=1; f<=(2*d-1);f++){
            System.out.print("*");
          }
          System.out.println();
        }
        int x = rows;
        for(int z=rows-1; z>=0; z--){
          x++;
          for(int y=1; y<=(x); y++){
            System.out.print(" ");
          }
          for(int w=1; w<=(2*z-1);w++){
            System.out.print("*");
          }
          System.out.println();
        }
        hasRun = 1;
      }
    }
    if(programNumber == 7){
      System.out.printf("Enter how many teeth on top: \t");
      int teeth = keyboard.nextInt();
      System.out.printf("Enter height of teeth: \t");
      int height = keyboard.nextInt();
      for(int z=height; z>=0; z--){
        for(int a=teeth; a>0; a--){
          for(int y=1; (y<=(2*(teeth-z)-1) && z!=height && a!=teeth)||(y<=(teeth-z) && (z==height||a==teeth)); y++){
            System.out.print(" ");
          }
          for(int w=1; w<=(2*z-1);w++){
            System.out.print("*");
          }
        }
        System.out.println();
      }
      for(int d=1; d<=height; d++){
        for(int a=teeth-1; a>0; a--){
          
          for(int z=1; (z==1 && a==teeth-1)||(z<=(height*2-d) && (d==1 || a==teeth-1))||(z<=(-2*d+(2*height+1)) && d!=1 && a!=teeth-1); z++){
            System.out.print(" ");
          }
          
          /*
          for(int z=1; (z==1 && a==teeth-1); z++){
            System.out.print(" ");
          }
          for(int z=1; z<=(height*2-d) && (d==1 || a==teeth-1); z++){
            System.out.print(" ");
          }
          for(int z=1; z<=(-2*d+(2*height+1)) && d!=1 && a!=teeth-1;z++){
            System.out.print(" ");
          }
          */
          for(int f=1; f<=(2*d-1);f++){
            System.out.print("*");
          }
        }
        System.out.println();
      }
    }
  }
}
