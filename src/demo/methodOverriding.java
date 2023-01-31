package demo;

public class methodOverriding {
	
	public void applicationForm(int num) {
	System.out.println("AplicationNO :"+num);

	}
	
	public void applicationForm1(String FN) {
		System.out.println("Firstname :"+FN);

		}
	public void applicationForm2(String a) {
		System.out.println("FatherName :"+a);

		}
	public void applicationForm3(String b) {
		System.out.println("MothersName :"+b);

		}
	public void applicationForm4(int a, int b, int c) {
		System.out.println("DOB :"+a+"-"+b+"-"+c);

		}
	
	public void applicationForm5(String c) {
		System.out.println("Stream :"+c);

		}
	
	public static void main(String[] args) {
		methodOverriding c=new methodOverriding();
		c.applicationForm(3118);
		c.applicationForm1("ganesh");
		c.applicationForm2("xyz");
		c.applicationForm3("xyz");
		c.applicationForm4(8,9,97);
		c.applicationForm5("CSE");
	}

}
