public class Main
{
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a<b) {
		    if(a<c) {
		    System.out.println("a is the least"+a);
		    } else {
		        System.out.println("c is the least"+c);
		    }
		} else if(b<c) {
		    System.out.println("b is the least"+b);
		} else {
		    System.out.println("c is the least"+c);
		}
		
	}
}

																				OR
public class Main
{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a<b && a<c) {
		    System.out.println("A is least");
		} else if(b<c) {
		    System.out.println("B is least");
		} else {
		    System.out.println("C is least");
		}
	}
}


=>
public class Main
{
	public static void main(String[] args) {
// 		int a = 10;
// 		int b = 20;
		
// 		int c = (a<b)? a:b;
// 		System.out.println(c);

        int a = 100;
        int b = 20;
        int c = 60;
        
        int res = (a<b)? (a<c? a:c):(b<c?b:c);
        System.out.println(res);
        
        int num1 = 100;
        int num2 = 20;
        int num3 = 60;
        
        if(num1<num2) {
            if(num1<num3) {
            System.out.println(num1);
            }
        } else if(num2<num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
	}
}



Pattern Programming:-
------------------------

public class Main
{
	public static void main(String[] args) {
	    int n = 4;
	    
	    for(int i=0; i<4; i++) {                                    ****
	        for(int j=0; j<n; j++) {                                *  *
	            if(i==0 || i==(n-1) || j==0 || j==(n-1)) {     ==>  *  *
	                System.out.print("*");                          ****
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}

Pattern Programming 
--------------------
G-Pattern

public class Main
{
	public static void main(String[] args) {
	   int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if((i==0 && j>0 && j<(3*n)/4) || 
				   (j==0 && i>0 && i<n-1) ||
				    (i==(n-1)/2 && j>=(n-1)/2 && j<=(3*n)/4) ||
				    (j==(3*n)/4 && i>=(n-1)/2) ||
				    (i==n-1 && j<(n-1)/2) ||
				    (j==(n-1)/2 && i>=(n-1)/2))
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}

N-Pattern :-
----------

public class Main
{
	public static void main(String[] args) {
	   int n = 10;
		
		for(int i=0; i<n; i++) {
		    for(int j=0; j<n; j++) {
		        if(i==j || j==0 || j==(n-1)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}


public class Main
{
	public static void main(String[] args) {
	   int n = 28;
		
		for(int i=0; i<n; i++) {
		    for(int j=0; j<n; j++) {
		        if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2
		          || j-i==(n-1)/2 || i+j==n-1+((n-1)/2)
		          || i==j || i+j==n-1
		          || i==0 || j==0 || i==n-1 || j==n-1) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}



