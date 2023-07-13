class Karnataka1Tester {
  public static void main(String karnataka[]){
	  
	  Karnataka1.addCityName("Udupi");
	  Karnataka1.addCityName("Sakleshpura");
	  Karnataka1.addCityName("Mysuru");
	  Karnataka1.addCityName("Hubballi");
	  Karnataka1.addCityName("Bagalkote");
	  Karnataka1.addCityName("Mandya");
	  Karnataka1.addCityName("Tumkur");
	  Karnataka1.addCityName("Hassan");
	  Karnataka1.addCityName("Chikmaglur");
	  Karnataka1.addCityName("Bangalore");
	  Karnataka1.addCityName("KOlar");
	  
	  Karnataka1.getAllCityNames();
	  //CRUD - Update
	 boolean isUpdated = Karnataka1.updateCityName("Bangalore" , "Bengaluru");
	 System.out.println("Is City Name updated " + isUpdated);
	 
	 Karnataka1.getAllCityNames();
  }

}