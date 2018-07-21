package opstr;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Mutex"; // immutable
		str = str.concat("tech");

		char[] ch = { 's', 'h', 'u', 'b', 'h', 'a', 'm' };
		String str2 = String.valueOf(ch);
		String str3 = String.valueOf(ch,5,2); //5:-start,2:-total letters to print

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

	}

}
