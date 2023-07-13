class Television{

  static String name = "LG";
  static int minVolume ;
  static int currentVolume ;
  static int maxVolume = 10;
  static boolean isConnected ;
  //method
  public static boolean onOrOff(){

    System.out.println("Invoking onOrOff()");
	System.out.println("Parameter" + 0);
    if(isConnected == false){
	    isConnected = true;
		System.out.println("Television is Turned on.. Enjoyy");
	} else if(isConnected == true){
	     isConnected = false;
		 System.out.println("Television is Turned off..");
	}
	return isConnected;
  
  }
//increaseVolume
public static void increaseVolume(){
	System.out.println("Invoking increaseVolume()");
	System.out.println("list of parameters "+ 2);
	if(isConnected == true){
	if(currentVolume < maxVolume){
		currentVolume= currentVolume+1;
		System.out.println("The Current Volume is" + currentVolume);
	}else{
		System.out.println("Max Volume reached");
		
	}
}else{
	System.out.println("Gubee.. Television Connect Maadu firstu");

}
System.out.println("End of increaseVolume()");
}
//decreaseVolume
public static void decreaseVolume(){
	//logic
	System.out.println("Invoking decreaseVolume()");
	System.out.println("list of parameters "+ 0);
	if(isConnected == true){
	   if(currentVolume >= minVolume){
		currentVolume= currentVolume-1;
		System.out.println("The Current Volume is" + currentVolume);
	}else{
		System.out.println("Min Volume reached");
	}
    }else{
		System.out.println("Television is turned off.. can't decrease Volume");
	

}
System.out.println("End of decreaseVolume()");
}
	
}


