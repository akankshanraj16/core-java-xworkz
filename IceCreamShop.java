class IceCreamShop{
 
 static String iceCreamAvailable[]={null,null,null,null,null,null,null,null};

 static int index;
 public static boolean addIceCream(String iceCream){
   boolean isAdded = false;
  
  if (iceCream!= null){
  
      iceCreamAvailable[index] = iceCream;
	  index++;
	  isAdded=true;
   }else{
       System.out.println("Cannot add iceCream , as it is a null value");
   }
   return isAdded;
 }
 public static void getAllIceCreamAvailable(){
   System.out.println("Invoking getIceCreamAvailable");
  for(int iceCream=0; iceCream < iceCreamAvailable.length; iceCream++){
    String reference = iceCreamAvailable[iceCream];
	System.out.println("Accessing iceCream " + reference+" at " +iceCream );
	 }
 
 System.out.println("end of getAllIceCreamAvailable");
  
 }
 public static boolean updateIceCreamAvailable(String existingIceCreamAvailable ,String updatedIceCreamAvailable){
	 boolean isUpdated = false;
	 for(int IceCreamIndex =0; IceCreamIndex < iceCreamAvailable.length;IceCreamIndex++){
		 //"Vanila" ="bubble gum"
		 if (IceCreamAvailable[IceCreamIndex].equals(existingIceCreamAvailable)){
			 IceCreamAvailable[IceCreamIndex] = updatedIceCreamAvailable ;
			 isUpdated = true;
		 }
	}
	return isUpdated ;
 }
 

}