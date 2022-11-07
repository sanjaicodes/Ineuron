package PattenProgramming;

public class IneuronPatten {

	public static void main(String[] args) {
		int n = 10;
		byte c = 6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<1;j++) {
				System.out.print("*");
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) {
				if(j==0 || j==i || j==n-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 || i==(n-1)/2 || i==n-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) {
				if(j==0 && i!= n-1|| j==n-1 && i!=n-1 ||(i==n-1 && j!=0 && j!=n-1)) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			
			for(int j=0;j<n;j++) {
				
			    if(j==0 || i==0 || j==n-1 && i<=(n-1)/2 || i==(n-1)/2) 
					System.out.print("*");			
			    else if(i>4 && i+j==c) {
					System.out.print("*");
					c += 3;
					for(int k=j+1;k<=n-1;k++)
						System.out.print(" ");
					break;
				}
				else
					System.out.print(" ");
			}
			System.out.print(" ");
	
			
			for(int j=0;j<n;j++) {
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==n-1 && i!=n-1 && i!=0 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) {
				if(j==0 || j==i || j==n-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
