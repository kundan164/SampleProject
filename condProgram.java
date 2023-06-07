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
