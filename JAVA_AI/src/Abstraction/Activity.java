package Abstraction;

public class Activity extends Teacher implements Sarthak, Karan{

	@Override
	public void run() {
		System.out.println("Karan Running");
		
	}
	@Override
	public void play(){
		System.out.println("Sartahk Playing");
		
	}
	@Override
	public void sleep() {
		System.out.println("Sarthak Sleeping");
		
	}

}
