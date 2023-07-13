class Metro {

static String stationNames[]={null,null,null,null,null,null,null,null};

 static int index;
 public static boolean addStationNames(String station){
   boolean isAdded = false;
  
  if (station!= null){
  
      stationNames[index] = station;
	  index++;
	  isAdded=true;
   }else{
       System.out.println("Cannot add stationNames , as it is a null value");
   }
   return isAdded;
 }
 public static void getAllStationNames(){
   System.out.println("Invoking getMetroNames");
  for(int station=0; station < stationNames.length; station++){
    String reference = stationNames[station];
	System.out.println("Accessing metro " + reference+" at " +station );
	 }
 
 System.out.println("end of getAllMetroName");
  
 }
  public static boolean updatedStationName(String existingStationName ,String updateStationName){
	 boolean isUpdated = false;
	 for(int stationIndex =0; stationIndex < stationNames.length;stationIndex++){
		 //"Baiyappanahalli" ="SV Road"
		 if (stationNames[stationIndex].equals(existingStationName)){
			 stationNames[stationIndex] = updateStationName ;
			 isUpdated = true;
		 }
	}
	return isUpdated ;
 }
}