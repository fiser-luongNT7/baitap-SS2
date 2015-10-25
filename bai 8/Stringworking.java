import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stringworking {

	private final String  input;
	
	public String getInput() {
		return input;
	}
	/*read input from file */
	public Stringworking() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("Stringword.txt");
		Scanner scanner = new Scanner(file);
		String read = scanner.nextLine();
		this.input = read.trim();
		scanner.close();
	}
	/*In ra chuoi nguoc tu chuoi dau vao*/
	public void printReserve(Stringworking st1){
		String str1 = st1.input;
		for(int i=input.length();i>0;i--){
			char x= str1.charAt(i-1);
			System.out.print(x);
		}
		System.out.print("\n");
	}
	/*In ra chuoi viet hoa chu cai dau tien*/
	public void upperFirstCharacter(Stringworking st1){
		String firstChar = st1.input.substring(0,0);
		firstChar = firstChar.toUpperCase();
		String rest = st1.input.substring(1);
		String result = firstChar.concat(rest);
		System.out.println(result);
	}
	/*viet hoa tat cac chu cai dau tien cua cac tu trong chuoi*/
	public void upper1stEachWord(Stringworking st1){
		String str1 = st1.input;
		String first = str1.substring(0,0);
		str1 = first.concat(str1);
		for(int i=0;i<str1.length(); i++){	
			if(str1.charAt(i) != ' '){
				System.out.print(str1.charAt(i));
			} else {
				String Upper = str1.substring(i+1,i+2);
				Upper = Upper.toUpperCase();
				System.out.print(str1.charAt(i) + Upper);
				i++;
			}
		}
		System.out.print("\n");
	}
	public void moveOneCharacter(Stringworking st1){
		String str1 = st1.input.substring(1);
		String last = str1.substring(str1.length()-1);
		String x =String.valueOf(last.codePointAt(0)+1);
		String result = str1.concat(x);
		System.out.print(result);
		;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	Stringworking st1 = new Stringworking();
	System.out.println("string input :" +  st1.getInput());
	System.out.print("Reserve string input: \t" );
	st1.printReserve(st1);
	System.out.print("Upper first Character of string input: \t" );
	st1.upperFirstCharacter(st1);
	st1.upper1stEachWord(st1);
	st1.moveOneCharacter(st1);
	}

}
