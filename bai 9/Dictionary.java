import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
	/* Tao 2 ArrayList, luu tu va dinh nghia */
	private ArrayList<String> Word = new ArrayList();
	private ArrayList<String[]> Definition = new ArrayList();
	
	/* Khoi tao du lieu */
	Dictionary() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream("dictionary.txt"));
		
		while (scanner.hasNextLine()) {
			String w = scanner.nextLine();
			String d = scanner.nextLine();
			String[] defi = d.split(",");
			Word.add(w);
			Definition.add(defi);
		}
		
		scanner.close();
	}
	
	/* Luu du lieu khi thoat chuong trinh */
	public void save() throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("dictionary.txt", "UTF-8");
		
		for (int i = 0; i < Word.size(); i++) {
			writer.println((String)Word.get(i));
			for(int j=0; j<Definition.get(i).length; j++){
				writer.println((String)Definition.get(i)[j]+ ",");
			}
			
			
		}
		
		writer.close();
	}
	
	public void addWord() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("New Word:");
		String w = scanner.nextLine();
		if (Word.contains(w)) {
			System.out.println("Existed!");
		} else {
			System.out.print("value:");
			String d = scanner.nextLine();
			String [] defi = d.split(",");
			Word.add(w);
			Definition.add(defi);
			System.out.print("this Word updated:\n" + w + ": " );
			for(int i=0; i<defi.length;i++){
				System.out.print(defi[i]);
				System.out.print(",");
			}
		}
	}
	
	public void findWord() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Find Word!");
		System.out.print("Word:");
		String w = scanner.nextLine();
		if (!Word.contains(w)) {
			System.out.print("Not existed!");
		} else {
			String[] d = this.Definition.get(Word.indexOf(w));
			System.out.print(w + ": " );
			for(int i=0; i<d.length; i++){
				System.out.print(d[i]+ ", ");
			}
			System.out.println();
		}
	}
	
	public void edit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Edit!");
		System.out.print("Word:");
		String w = scanner.nextLine();
		if (!Word.contains(w)) {
			System.out.print("Not existed!");
		} else {
			int index = Word.indexOf(w);
			System.out.print("New Word:");
			w = scanner.nextLine();
			System.out.print("New value:");
			String d = scanner.nextLine();
			Word.set(index, w);
			String [] defi = d.split(",");
			
			Definition.set(index, defi);
			System.out.print("this Word existed:\n" + w + ": " + d);
		}
	}
	
	public boolean exit() {
		do {
			System.out.print("Dou want to exit y/n");
			int key = changeKey();
			if (key == 'y' || key == 'Y') return true;
			if (key == 'n' || key == 'N') return false;
		} while (true);
	}
	
	/* Nhan ky tu tu ban phim */
	public char changeKey() {
		Scanner scanner = new Scanner(System.in);
		char[] key = scanner.next().toCharArray();
		// scanner.close();
		return key[0];
	}
	
	public void printMenu() {
		System.out.println("| 1 | Add Word");
		System.out.println("| 2 | Find Word");
		System.out.println("| 3 | Edit ");
		System.out.println("| 4 | Exist");
	}
	
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
		Dictionary obj = new Dictionary();
		int key;
		boolean exit = false;
		
		do {
			obj.printMenu();
			
			key = obj.changeKey();
			switch (key) {
				case '1':
					obj.addWord();
					break;
				case '2':
					obj.findWord();
					break;
				case '3':
					obj.edit();
					break;
				case '4':
					exit = obj.exit();
			}
			
			if (exit) break;
		} while (true);
		
		obj.save();
		System.out.print("Da thoat!");
	}
}