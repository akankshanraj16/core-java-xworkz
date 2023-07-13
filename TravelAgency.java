class TravelAgency{
 static String touristPlaces[]= {null,null,null,null,null,null,null,null};
 static int index;
 
  public static boolean createPlace(String place){
  boolean isCreated = false;
  if(touristPlaces.length > index){                       
	  if(place != null && place.length() > 0){ 
	 touristPlaces[index] = place;
	index++;
	isCreated = true;
	System.out.println("Place created" + isCreated);
		   }else{
		  System.out.println("Tourist places cannot be null");
	  }
	  }else{
		  System.out.println("Size is full, cannot add place anymore");
	  }
  return isCreated;
 }
 
 
 public static void getAllTouristPlaces(){
 
  System.out.println("Invoking getAllTouristPlaces");
	  
  /*for(int place=0; place<touristPlaces.length; place++){
		  String reference = touristPlaces[place];
		  System.out.println("Accessing place " + reference + " at " + place);
	   }
	   System.out.println("end of getAllTouristPlaces");  */
	   
 System.out.println("List of touristPlaces Available are : ");
	  for(String place : touristPlaces){
		  System.out.println(place);
	  }   
	   
	 System.out.println("end of getAllTouristPlaces");
	   
 }

     public static boolean updatePlace(String existingPlace, String updatedPlace){
		boolean isUpdated = false;
		for(int placeIndex = 0; placeIndex < touristPlaces.length; placeIndex++){ 
 
          if(touristPlaces[placeIndex].equals(existingPlace)){
			     touristPlaces[placeIndex] = updatedPlace;
				 isUpdated = true;
			}
		}
	  	
		return isUpdated;
}

}

