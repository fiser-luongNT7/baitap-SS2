package bai7;

public class Menu {
	public void menu1(){
		System.out.println("=== MENU1===");
		System.out.println("\t |1.| Nhap kho");
		System.out.println("\t |2.| Xuat kho");
		System.out.println("\t |3.| Quan ly");
		System.out.println("\t |4.| In hoa don");
		System.out.println("\t |5.| Thoat");
	}
	public void menuNhapKho(){
		System.out.println("=== Nhap kho menu ===");
		System.out.println("|1.| Nhap kho so luong mot don vi");
		System.out.println("|2.| Nhap theo thung 20 don vi");
		System.out.println("|3.| Nhap theo ta 10 don vi");
		System.out.println("|4.| Chinh sua so luong");
		System.out.println("|5.| Quay lai menu1");
	}
	public void menuXuatKho (){
		System.out.println("=== Xuat kho menu ===");
		System.out.println("\t |1.| Xuat theo mot don vi");
		System.out.println("\t |2.| Xuat theo thung");
		System.out.println("\t |3.| Xuat theo ta");
		System.out.println("\t |4.| Chinh sua so luong");
		System.out.println("\t |5.| Kiem tra so luong");
		System.out.println("\t |6.| Quay lai menu1");
	}
	public void menuQuanLyGia(){
		System.out.println("=== Quan ly gia menu");
		System.out.println("\t |1.| Hien thi gia");
		System.out.println("\t |2.| Sua gia");
		System.out.println("\t |3.| Tong tien hang");
		System.out.println("\t |4.| Quay lai menu1");
	}
	public void menuInHoaDon(){
		System.out.println("\t |1.| In theo luong hang");
		System.out.println("\t |2.| In theo gia");
		System.out.println("\t |3.| In theo ca hang va gia");
		System.out.println("\t |4.| Quay lai menu1");
	}
}
