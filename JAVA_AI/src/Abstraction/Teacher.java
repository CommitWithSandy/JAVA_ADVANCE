package Abstraction;

public class Teacher extends Student{
	@Override
	public void eat() {
		System.out.println("Eating");
	}
	public void walk() {
		System.out.print("Walking");
	}
}