package demo;

public class Class_1 extends methodOverriding{
	
	@Override
	public void applicationForm(int num) {
		// TODO Auto-generated method stub
		super.applicationForm(num);
	}
	
	@Override
	public void applicationForm1(String FN) {
		// TODO Auto-generated method stub
		super.applicationForm1(FN);
	}
	
	@Override
	public void applicationForm2(String a) {
		// TODO Auto-generated method stub
		super.applicationForm2(a);
	}
	
	@Override
	public void applicationForm3(String b) {
		// TODO Auto-generated method stub
		super.applicationForm3(b);
	}
	
	@Override
	public void applicationForm4(int a, int b, int c) {
		// TODO Auto-generated method stub
		super.applicationForm4(a, b, c);
	}
	
	@Override
	public void applicationForm5(String c) {
		// TODO Auto-generated method stub
		super.applicationForm5(c);
	}
	

	public static void main(String[] args) {
		Class_1 s=new Class_1();
		s.applicationForm(3119);
		s.applicationForm1("Manoj");
		s.applicationForm1("XYZ");
		s.applicationForm3("XYZ");
		s.applicationForm4(26, 6, 98);
		s.applicationForm5("cse");
		
	}

}
