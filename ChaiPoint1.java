class ChaiPoint1{

 static String chaiAvailable[]= {null,null,null,null,null,null,null,null,null,null};
 static int index;
 public static boolean addChai(String chai){
   boolean isAdded = false;
   //"masala tea"! = null
  if (chai!= null){
  //chaiAvailable[0] ="masala tea";
  //chaiAvailable[1] ="Ginger tea";
  //chaiAvailable[2] ="Lemon Chai";
  //int index;
      chaiAvailable[index] = chai;
	  index++;
	  isAdded=true;
   }else{
       System.out.println("Cannot add chai , as it is a null value");
   }
   return isAdded;
 }
 public static void getAllChaiAvailable(){
   System.out.println("Invoking getChaiAvailable");
  for(int chai=0; chai < chaiAvailable.length; chai++){
    String reference = chaiAvailable[chai];
	System.out.println("Accessing chai " + reference+" at " +chai );
	 }
 
 System.out.println("end of getAllChaiAvailable");
  
 }

}