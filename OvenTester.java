class OvenTester{
  
  public static void main(String test[]){
    System.out.println("Main Started");
	//click on button
    boolean connected = Oven.onOrOff();
	System.out.println("Is Ovenconnected " + connected);
	Oven.increaseTemp();
	Oven.increaseTemp();
	Oven.increaseTemp();
	Oven.increaseTemp();
	
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	boolean connected1 = Oven.onOrOff();
	System.out.println("Is Oven connected " + connected1);
	Oven.increaseTemp();
	Oven.increaseTemp();
	Oven.increaseTemp();
	Oven.increaseTemp();
	
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	Oven.decreaseTemp();
	System.out.println("Main Ended");
	}


}