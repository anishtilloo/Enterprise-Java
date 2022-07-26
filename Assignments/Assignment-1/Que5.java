public class Que5 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int n=14;
		for(int row=0; row<n; row++) {
			for(int col=0; col<n; col++) {
				if(row==n-1 || row==0 || col==0 || row+col<=(n/2)-1 || row-col>=(n/2)-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
    }
}

