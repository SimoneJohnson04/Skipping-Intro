public class Multiplication{
	public static void main(String[] args){
    System.out.println();
		for(int i=0; i<=9; i++){
			System.out.print("" + i + "\t");
		}
		for(int j=1; j<=9; j++){
			System.out.println();
			for(int k=1; k<=9;k++){
        if(k==1){int l = j*k;
				System.out.print("" + l + "\t");}
				int l = j*k;
				System.out.print("" + l + "\t");
			}
		}
	}
}
