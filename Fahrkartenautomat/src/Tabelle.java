
public class Tabelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f1 = -20;
		int f2 = -10;
		int f3 = 0;
		int f4 = 20;
		int f5 = 30;
		double c1 = -28.8889;
		double c2 = -23.3333;
		double c3 = -17.7778;
		double c4 = -6.6667;
		double c5 = 1.1111;
		
		System.out.printf("%-12s|%10s\n", "Fahrenheit", "Celsius");
		System.out.printf("%.23s\n","-------------------------");
		System.out.printf("%-12d|%10.2f\n", f1, c1);
		System.out.printf("%-12d|%10.2f\n", f2, c2);
		System.out.printf("%+-12d|%10.2f\n", f3, c3);
		System.out.printf("%+-12d|%10.2f\n", f4, c4);
		System.out.printf("%+-12d|%10.2f\n", f5, c5);
	}

}
