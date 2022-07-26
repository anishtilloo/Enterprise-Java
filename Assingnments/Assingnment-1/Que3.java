public class Que3 {
    public static void main(String args[]) {
        // System.out.println("Hello World");
        int n=14;
		for(int row=0; row<n; row++) {
			for(int col=0; col<n; col++) {
				if(row==0  || col==0 || row==n-1 || col==n-1 || row+col<=(n/2)-1 || col-row>=(n/2)-1) {
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
