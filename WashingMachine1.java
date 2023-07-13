class WashingMachine1{

  static String name = "bosch";
  static int minSpeed;
  static int currentSpeed ;
  static int maxSpeed = 10;
  static boolean isConnected ;
  //method
  public static boolean onOrOff(){

    System.out.println("Invoking onOrOff()");
	System.out.println("Parameter" + 0);
    if(isConnected == false){
	    isConnected = true;
		System.out.println("WashingMachine1 is Turned on..");
	} else if(isConnected == true){
	     isConnected = false;
		 System.out.println("WashingMachine1 is Turned off..");
	}
	return isConnected;
  
  }
  //increaseSpeed
public static void increaseSpeed(){
	System.out.println("Invoking increaseSpeed()");
	System.out.println("list of parameters "+ 2);
	if(isConnected == true){
	if(currentSpeed < maxSpeed){
		currentSpeed= currentSpeed+1;
		System.out.println("The Current Speed is" + currentSpeed);
	}else{
		System.out.println("Max Speed reached");
		
	}
}else{
	System.out.println("Gubee.. WashingMachine1 Connect Maadu firstu");

}
System.out.println("End of increaseSpeed()");
}
//decreaseSpeed
public static void decreaseSpeed(){
	//logic
	System.out.println("Invoking decreaseSpeed()");
	System.out.println("list of parameters "+ 0);
	if(isConnected == true){
	   if(currentSpeed > minSpeed){
		currentSpeed= currentSpeed-1;
		System.out.println("The Current Speed is" + currentSpeed);
	}else{
		System.out.println("Min Speed reached");
	}
    }else{
		System.out.println("WashingMachine1 is turned off.. can't decrease Speed");
	

}
System.out.println("End of decreaseSpeed()");
}
	
}




