package io.tutorial;

public class Greeter { 
	
	public void greet(Greeting greeting) {
	greeting.perform();
	}
	
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		
		Greeting greetingImpl = new HelloWorldGreeting();
		Greeting lambdaImpl = () -> System.out.print("Hello World! from lambda");
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.print("Hello world!");
			}
		};
		//greeter.greet(greetingImpl);
		//innerClassGreeting.perform();
		
		greeter.greet(lambdaImpl);
		greeter.greet(innerClassGreeting);
	
	}

}
