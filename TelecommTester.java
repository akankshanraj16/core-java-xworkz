class TelecommTester{
	
	public static void main(String simcard[]){
	  Telecomm.createSim("Vodafone");
	  Telecomm.createSim("Idea");
	  Telecomm.createSim("Airtel");
	  Telecomm.createSim("Jio");
	  Telecomm.createSim("Reliance");
	  Telecomm.createSim("Moto G");
  
  Telecomm.getAllSim();
  
  boolean isUpdated = Telecomm.updateSimCard("Vodafone" , "BSNL");
	 System.out.println("Is Sim card updated " + isUpdated);
	 Telecomm.getAllSim();
	 
}	
	
}