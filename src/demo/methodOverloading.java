package demo;

public class methodOverloading {
	
	public void accountCreation(String FN) {
		System.out.println("Firstname :"+FN);

	}
	public void accountCreation(long num) {
		System.out.println("MobileNo :"+num);

	}
	public void accountCreation(String a, int num) {
		System.out.println("Emailid :"+a+num+"@gmail.com");

	}
	public void accountCreation(int numerical) {
		System.out.println("Password :"+numerical);

	
}
	
	public static void main(String[] args) {
		methodOverloading n=new methodOverloading();
		n.accountCreation("Ganeshmoorthy");
		n.accountCreation("1234567899l");
		n.accountCreation("ganeshmoorthy", 98);
		n.accountCreation("12345678");
	}
}