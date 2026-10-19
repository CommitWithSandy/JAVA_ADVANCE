package Encapsulation;

public class Employee {
	private String name;
	
	public String getname() {
		return name;	
	}
	
	public void setname(String name) {
		this.name = name;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
//		System.out.println(e1.getname());
		e1.setname("Sandesh");
		System.out.println(e1.getname());
	}

}
