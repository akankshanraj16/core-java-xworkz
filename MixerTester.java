class MixerTester{
  
  public static void main(String test[]){
    System.out.println("Main Started");
	//click on button
    boolean connected = Mixer.onOrOff();
	System.out.println("Is Mixer connected " + connected);
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	boolean connected1 = Mixer.onOrOff();
	System.out.println("Is Mixer connected " + connected1);
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	System.out.println("Main Ended");
	}


}