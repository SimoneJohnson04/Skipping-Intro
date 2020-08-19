public class Triangle{
	public static void main(String[] args){
		System.out.println();
		for(int i=1; i<=5; i++){
      for(int j=1;j<=6-i; j++){
        //6-i for descending, i for ascending, i for spaces
	      System.out.print("x");
      }
    /*for(int k=1; k<=(1+2*(5-i)); k++){
        System.out.print("x");
      }
      This is for a triangle in the center with the spaces from above
    */
    System.out.println();
    }
	}
}
