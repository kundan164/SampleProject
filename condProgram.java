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