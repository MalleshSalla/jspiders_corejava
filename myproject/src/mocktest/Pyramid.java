package mocktest;


public class Pyramid {
	public static void main(String[] args) {

		int space = 4,star=-1;
		
		for(int i = 1;i<=4;i++) {
			space--;
			star+=2;
			
			for(int j=1; j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=star;j++) {
				if((i==2&&j==2)) {
					System.out.print("1");
				} else if((i==3&&j==2)||(i==3&&j==3)||(i==3&&j==4)){
					System.out.print("2");
				} else if((i==4&&j==2)||(i==4&&j==3)||(i==4&&j==4)||(i==4&&j==5)||(i==4&&j==6)) {
					System.out.print("3");
				}
				else {
					System.out.print("*");
				}	
			}
			System.out.println();
		}
	}	
}
/*
 * name       : salla mallesh 
 * ph no      : 9502278234 
 * email id   : sallamallesh95@gmail.com
 * batch code : gcca21
 */


