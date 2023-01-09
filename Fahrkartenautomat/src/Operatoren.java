
public class Operatoren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;
		char name = 'Q';
		
		int x = 10, y = 5;
		char buchstabe = 'f';
		boolean z = true;
		
		System.out.print(a < b);
		System.out.print(2 * a <= b);
		System.out.print(name != 'Q');
		System.out.print(2 * a == a + b - 1);
		System.out.print(name == 82);
		System.out.print(b - a > 1);
		System.out.print(a != b - 1);
		
		System.out.print(x < 9 || y >= 11);
		System.out.print(x > 9 || (y > 7 && buchstabe == 'f'));
		System.out.print((x < 5 || y < 11) && (buchstabe != 'a' || x == 4));
		System.out.print(!(x == 10) && y <= 11);
		System.out.print(!(x == 10));
		System.out.print(z);
		System.out.print(!(x != 10) && ((!(buchstabe != 'f') && x < 11) && !z) );
	}

}
