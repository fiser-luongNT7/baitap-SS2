package bai7;


import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;


public class  Account {
	public void Signin() throws FileNotFoundException,
	InterruptedException {
	int count=0;
	Scanner scanner1 = new Scanner(System.in);
	
	do{
		System.out.println("Tai Khoan:");
		String acc = scanner1.next();
		System.out.println("Mat Khau:");
		String pass = scanner1.next();
		FileInputStream accs = new FileInputStream("Account.txt");
		Scanner scanner2 = new Scanner(accs);
		while(scanner2.hasNext()){
			String accExist = scanner2.next();
			String passExist = scanner2.next();
			if(accExist.equals(acc) && passExist.equals(pass)){
				System.out.println("--- Dang nhap thanh cong ---");
				scanner1.close();
				return ;
			}
		}
		System.out.println("Ten hoac mat khau khong chinh xac");
		count++;
		if(count==3){
			System.out.println("Ban da dang nhap khong chinh xac 3 lan");
			System.out.println("Vui long doi 1 phut");
			Thread.sleep(60*1000);
			count=0;
		}
	}while(true);
	
	
	}
	
}

