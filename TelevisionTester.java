class TelevisionTester{
  
  public static void main(String test[]){
    System.out.println("Main Started");
	//click on button
    boolean connected = Television.onOrOff();
	System.out.println("Is Television connected " + connected);
	Television.increaseVolume();
	Television.increaseVolume();
	Television.increaseVolume();
	Television.increaseVolume();
	
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	boolean connected1 = Television.onOrOff();
	System.out.println("Is Television connected " + connected1);
	Television.increaseVolume();
	Television.increaseVolume();
	Television.increaseVolume();
	Television.increaseVolume();
	
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	Television.decreaseVolume();
	System.out.println("Main Ended");
	}


}