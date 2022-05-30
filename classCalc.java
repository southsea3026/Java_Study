import java.util.*;

class Add {
	int a, b;
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		int result = a+b;
		System.out.println(result);
		return result;
	}
}
class Sub {
	int a, b;
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		int result = a-b;
		System.out.println(result);
		return result;
	}
}
class Mul {
	int a, b;
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		int result = a*b;
		System.out.println(result);
		return result;
	}
}
class Div {
	int a, b;
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		int result = a/b;
		System.out.println(result);
		return result;
	}
}
public class Calc {
	public static void main(String[] args) {
		Add add = new Add(); 
		Sub sub = new Sub(); 
		Mul mul = new Mul(); 
		Div div = new Div(); 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하시오>>");
		int x = scan.nextInt();
		int y = scan.nextInt();
		char p = scan.next().charAt(0);
			
		if( p == '+' ) {
			add.setValue(x, y); 
			add.calculate(); 
		} else if( p == '-') {
			sub.setValue(x, y);
			sub.calculate();
		} else if( p == '*') {
			mul.setValue(x, y);
			mul.calculate();
		} else if( p == '/') {
			div.setValue(x, y);
			div.calculate();
		} else {
			System.out.println("last input only +, -, *, /");
		}
	}
}

/* homework assignment in Univ. Javaprogramming Class.
hardest part was input charset operator
seek numberous way to input as
1. input String and change into Char
2. input Int and chang into Char
3. scan.Line as Char
4. input String and use on if()
5. input Char, use Char on if()

**the way I solve was**
5. input Char with use scan.next().charAt()
seems not the best way as I solve. Caues I think I never learned "scan.next().charAt()" things.
as we know, prof wants to solve as they teach

ANYWAY, I solved problem and it's done as now
*/
