import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 1248;
		char gender = 'F';
	
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products : ");
		System.out.printf("%s, Wich Price Is $ %.2f %n", product1, price1);
		System.out.printf("%s, Wich Price Is $ %.2f %n %n", product2, price2);
		
		System.out.printf("Record: %d Years Old, code %d and gender: %c %n  %n", age, code, gender);
		
		System.out.printf("Measue With Eight Decimal Places: %.8f %n", measure);
		System.out.printf("Rouded (Three Decimal Places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal Point: %.3f %n", measure);
		

	}

}
