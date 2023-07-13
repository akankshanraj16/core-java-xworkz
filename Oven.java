class Oven{

  static String name = "LG";
  static int minTemp ;
  static int currentTemp ;
  static int maxTemp = 10;
  static boolean isConnected ;
  //method
  public static boolean onOrOff(){

    System.out.println("Invoking onOrOff()");
	System.out.println("Parameter" + 0);
    if(isConnected == false){
	    isConnected = true;
		System.out.println("Oven is Turned on.. ");
	} else if(isConnected == true){
	     isConnected = false;
		 System.out.println("Oven is Turned off..");
	}
	return isConnected;
  
  }
  //increaseTemperature
public static void increaseTemp(){
	System.out.println("Invoking increaseTemperature()");
	System.out.println("list of parameters "+ 2);
	if(isConnected == true){
	if(currentTemp < maxTemp){
		currentTemp= currentTemp+1;
		System.out.println("The Current Temp is" + currentTemp);
	}else{
		System.out.println("Max Temp reached");
		
	}
}else{
	System.out.println("Gubee.. Oven Connect Maadu firstu");

}
System.out.println("End of increaseTemperature()");
}
//decreaseTemperature
public static void decreaseTemp(){
	//logic
	System.out.println("Invoking decreaseTemp()");
	System.out.println("list of parameters "+ 0);
	if(isConnected == true){
	   if(currentTemp > minTemp){
		currentTemp= currentTemp-1;
		System.out.println("The Current Temp is" + currentTemp);
	}else{
		System.out.println("Min Temp reached");
	}
    }else{
		System.out.println("Oven is turned off.. can't decrease Temp");
	

}
System.out.println("End of decreaseTemp()");
}
	
}




