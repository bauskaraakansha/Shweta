
public class Calculator {

	public Calculator() {
		
		System.out.println("Calling Constructor");
	} 
	public void add()
	 {
		 System.out.println("Adding some numbers");
	 }
	 public void mul()
	 {
		 System.out.println("Multiply some numbers");
	 }
	 public void sub()
	 {
		 System.out.println("Substract some numbers");
	 }
	 public void div()
	 {
		 System.out.println("Divide some numbers");
	 }
	
	
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.div();
		
	}

}
