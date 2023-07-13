class WashingMachine1Tester{
  
  public static void main(String test[]){
    System.out.println("Main Started");
	//click on button
    boolean connected = WashingMachine1.onOrOff();
	System.out.println("Is WashingMachine1 connected " + connected);
	WashingMachine1.increaseSpeed();
	WashingMachine1.increaseSpeed();
	WashingMachine1.increaseSpeed();
	WashingMachine1.increaseSpeed();
	
	WashingMachine1.decreaseSpeed();
	WashingMachine1.decreaseSpeed();
	WashingMachine1.decreaseSpeed();
	WashingMachine1.decreaseSpeed();
	boolean connected1 = WashingMachine1.onOrOff();
	System.out.println("Is WashingMachine1 connected " + connected1);
	WashingMachine1.increaseSpeed();
	WashingMachine1.increaseSpeed();
	WashingMachine1.increaseSpeed();
	WashingMachine1.increaseSpeed();
	
	WashingMachine1.decreaseSpeed();
	WashingMachine1.decreaseSpeed();
	WashingMachine1.decreaseSpeed();
	WashingMachine1.decreaseSpeed();
	System.out.println("Main Ended");
	}


}