import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Complex {
	private double imag;
	private double real;
	private static Complex cp2;
	private static Complex cp1;
	private static Complex cp3;
	private static Complex cp4;
	private static Complex cp5;
	
	/* constructor function*/
	public Complex(double imag, double real){
		this.imag = imag;
		this.real = real;
	}
	/* get imag of complex*/
	public double getImag(){
		return this.imag;
	}
	/* get real of complex*/
	public double getReal(){
		return this.real;
	}
	/* get modun of complex*/
	public double getModun(){
		double modunSquare = this.imag*this.imag + this.real*this.real;
		double modun = (double)Math.sqrt(modunSquare);
		return modun;
	}
	/* addition of complex cp1 and complex cp2 
	 * thuc= thuc +thuc & ao=ao+ao
	 */
	public Complex addition(Complex cp1, Complex cp2) {
		double Imag = cp1.getImag() + cp2.getImag();
		double Real = cp1.getReal() + cp2.getReal();
		return new Complex(Imag, Real);
	}
	/* subtraction of complex cp1 and complex cp2
	 *  thuc = thuc-thuc & ao = ao-ao
	 */
	public Complex subtraction(Complex cp1, Complex cp2) {
		double Imag = cp1.getImag() - cp2.getImag();
		double Real = cp1.getReal() - cp2.getReal();
		return new Complex(Imag, Real);
	}
	/* multiplication of complex cp1 and complex 
	 * cp2 thuc = thucao-aothuc & ao= aothuc -thuc ao
	 */
	public Complex multiplication(Complex cp1, Complex cp2) {
		double Imag = cp1.getReal()*cp2.getImag() - cp1.getImag()*cp2.getReal();
		double Real = cp1.getImag()*cp2.getReal() - cp1.getReal()*cp2.getImag();
		return new Complex(Imag, Real);
	}
	/* division of complex cp1 and complex cp2 
	 * thuc= (thucthuc-aoao)/modun mau bih 
	 * ao= thuc thuc +aoao/modun mau binh
	 */
	public Complex division(Complex cp1, Complex cp2) {
		double divi = cp2.getReal()*cp2.getReal() + cp2.getImag()*cp2.getImag();
		double Imag = (cp1.getReal()*cp2.getReal() + cp1.getImag()*cp2.getImag())/divi;
		double Real = (cp1.getImag()*cp2.getReal() - cp1.getReal()*cp2.getImag())/divi;
		return new Complex(Imag, Real);
	}
	public static void main(String[] args) {
		cp1 = new Complex(1,1);
		cp2 = new Complex(1,2);
		cp3 = cp1.addition(cp1, cp2);
		System.out.println("Total cp1 & cp2: "+ cp3.real + "+ " +cp3.imag +"i" );
		cp4 = cp1.subtraction(cp1, cp2);
		System.out.println("Subtract cp1 & cp2: "+cp4.real + "+ "+ cp4.imag+"i" );
		cp5= cp1.division(cp1, cp2);
		System.out.println("Division cp1 & cp2: "+cp5.real + "+ "+ cp5.imag+"i");
		
	}

}
