class ChaiPoint{
 String location = "Kormangala";
 static String tea ="Masala Tea";
 static String tea1 ="Ginger Tea";
 static String tea2 ="Lemon Tea";
 static String tea3 ="Kesar Elaichi Chai";
 static String tea4 ="Irani Chai";
 static String tea5 ="Elaichi Chai";
 static String tea6 ="Ayurvedic Chai";
 static String tea7 ="Hot Green Chai";
 static String tea8 ="Sulemani Chai";
 static String tea9 ="Lemon Grass Tea";
 static String chaiAvailable[]={tea,tea1,tea2,tea3,tea4,tea5,tea6,tea7,tea8,"Lemon Grass Tea"};
 
 //method
 
 public static void getAllChaiAvailable(){
 System.out.println("Invoking getAllChaiAvailable");
 /*for(String individualChai : chaiAvailable){
  System.out.println(individualChai);
 
 }*/
 for(int chai=0; chai < chaiAvailable.length; chai++){
	String reference = chaiAvailable[chai];
	System.out.println(reference);
	 }
 
 System.out.println("end of getAllChaiAvailable");
 }



}