class TravelAgencyTester {
	
	public static void main(String place[]){
	  TravelAgency.createPlace("Cubbon Park");
	  TravelAgency.createPlace("Lalbagh");
	  TravelAgency.createPlace("Bannerghatta National Park");
	  TravelAgency.createPlace("Lumbini Gardens");
	  TravelAgency.createPlace("Bugle Rock Park");
	  TravelAgency.createPlace("Bilikal Rangaswamy Betta");
	  TravelAgency.createPlace("Freedom Park");
	  TravelAgency.createPlace("JP Park");
	  TravelAgency.createPlace("Jog falls");
  
  TravelAgency.getAllTouristPlaces();
  
  boolean isUpdated = TravelAgency.updatePlace("Lalbagh" , "Innovative film city");
	 System.out.println("Is Place updated " + isUpdated);
	 TravelAgency.getAllTouristPlaces();
     
  
	}

}