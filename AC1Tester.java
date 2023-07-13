class AC1Tester{
  
  public static void main(String test[]){
    System.out.println("Main Started");
	//click on button
    boolean connected = AC1.onOrOff();
	System.out.println("Is AC connected " + connected);
	AC1.increaseTemp();
	AC1.increaseTemp();
	AC1.increaseTemp();
	AC1.increaseTemp();
	
	AC1.decreaseTemp();
	AC1.decreaseTemp();
	AC1.decreaseTemp();
	AC1.decreaseTemp();
	boolean connected1 = AC1.onOrOff();
	System.out.println("Is AC connected " + connected1);
	AC1.increaseTemp();
	AC1.increaseTemp();
	AC1.increaseTemp();
	AC1.increaseTemp();
	
	AC1.decreaseTemp();
	AC1.decreaseTemp();
	AC1.decreaseTemp();
	AC1.decreaseTemp();
	System.out.println("Main Ended");
	}


}