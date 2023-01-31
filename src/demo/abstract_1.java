package demo;

public class abstract_1 extends abstrct{

	@Override
	public void bikename() {
		System.out.println("Royalenfield");
		
	}

	@Override
	public void carName() {
		System.out.println("RR");
		
	}
	
	@Override
	public void firstName() {
		// TODO Auto-generated method stub
		super.firstName();
	}
	
	public static void main(String[] args) {
		
		abstract_1 s=new abstract_1();
		s.bikename();
		s.carName();
		s.firstName();
		
	}

}
