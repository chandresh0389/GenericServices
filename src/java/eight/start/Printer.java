package java.eight.start;

@FunctionalInterface
public interface Printer {
	
	void print(Object obj);
	
	default void defaultPrintMethod(){
		System.out.println("I am default method and my implementatin is in interfce only");
	}
	
	default void defaultPrintMethod2(){
		System.out.println("I am default method number2 and my implementatin is in interfce only");
	}
	static void staticmetod() {
		
		System.out.println("i am static method of interface and java 8 blowing my mind");
	}
}
