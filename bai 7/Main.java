package bai7;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	/* Nhap lua chon theo menu*/
	
	public static char Key(){
		char[] key = scanner.next().toCharArray();
		//scanner.close();
		return key[0];
	}
	public static void startUpSystem() throws FileNotFoundException,
	UnsupportedEncodingException {
		do{
			int key = Key();
			Menu intoSystem = new Menu();
			intoSystem.menu1();
			switch(key){
			case'1':
				intoSystem.menuNhapKho();
				break;
			case'2':
				intoSystem.menuXuatKho();
				break;
			case'3':
				intoSystem.menuQuanLyGia();
				break;
			case'4':
				intoSystem.menuInHoaDon();
			}
			
		}while (true);
	}
	public static void outWarehousing(){
		 int key = Key();
		 Menu selectedMenu = new Menu();
		 selectedMenu.menuNhapKho();
		 switch(key){
		 case'1': break;
		 case'2': break;
		 case'3': break;
		 case'4': break;
		 case'5':
			 selectedMenu.menu1();
			 break;
		 }
	}
	public static void IntoWarehousing(){
		 int key = Key();
		 Menu selectedMenu = new Menu();
		 selectedMenu.menuNhapKho();
		 switch(key){
		 case'1': break;
		 case'2': break;
		 case'3': break;
		 case'4': break;
		 case'5': break;
		 case'6':
			 selectedMenu.menu1();
			 break;
		 }
	}
	public static void printBill(){
		 int key = Key();
		 Menu selectedMenu = new Menu();
		 selectedMenu.menuNhapKho();
		 switch(key){
		 case'1': break;
		 case'2': break;
		 case'3': break;
		 case'4': 
			 selectedMenu.menu1();
			 break;
		 }
	}
	public static void managePrice(){
		 int key = Key();
		 Menu selectedMenu = new Menu();
		 selectedMenu.menuNhapKho();
		 switch(key){
		 case'1': break;
		 case'2': break;
		 case'3': break;
		 case'4': break;
		 case'5': 
			 selectedMenu.menu1();
			 break;
		 }
	}
	public static boolean exit() {
		do{
			System.out.println("Ban muon thoat ? Y/N");
			int key = Key();
			if(key=='y' || key=='Y') return true;
			if(key=='n' || key=='N') return false;
		}while(true);
	}
	
	public static void main(String[] args) throws  FileNotFoundException,
	InterruptedException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		boolean exit = false;
		Main test = new Main();
		
		do{
			Account customer = new Account();
			customer.Signin();
		
			
			do{
				test.startUpSystem();
				int key1 = 1;
				//int key1 = test.Key();
				switch(key1){
				case'1':
					test.IntoWarehousing();
					break;
				case'2':
					test.outWarehousing();
					break;
				case'3':
					test.managePrice();
					break;
				case'4':
					test.printBill();
					break;
				case'5':
					test.exit();
					break;
				
				}
				
				}while(true);
			
		} while(true);
		
	
	}
}