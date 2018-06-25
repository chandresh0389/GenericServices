package java.eight.start;

public class LamdaExpression {
	public static void main(String [] args){
	Printer print = (Object o) -> {
		System.out.println("this is functional intrerface  "+o);
	};
	
  add(print,1,2);
  print.defaultPrintMethod();
  Printer.staticmetod();
}
	
	public static void add(Printer print ,int q,int j){
		print.print("Laxmi & Chandresh");
		print.defaultPrintMethod2();
		Printer.staticmetod();
	}
}
