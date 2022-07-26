public class Que1 {
    public static void main(String args[]) {
        // 1.Write a program(WAP) to print INEURON using pattern programming logic.
        int n = 14;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row==0 || row==n-1 || col==n/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int col = 0; col < n; col++) {
                if (col==0 || col==n-1 || row-col==0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int col = 0; col < n; col++) {
                if (col==0 || row==n-1 || row==0 || row==n/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int col = 0; col < n; col++) {
                if (col==0 || col==n-1 || row==n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int col = 0; col < n/2; col++) {
	                if (col==0 || row==0 || row==(n/2)-1  || row-col==(n/2) || (row<n/2&&col==(n/2)-1)){
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
			System.out.print("  ");
            for (int col = 0; col < n; col++) {
	                if (col==0 || row==0 || row==n-1  || col==n-1){
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
			System.out.print("  ");
            for (int col = 0; col < n; col++) {
                if (col==0 || col==n-1 || row-col==0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("  ");

        }
    }
}