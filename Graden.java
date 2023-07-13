class Graden{
 
  static String flowerNames[]={null,null,null,null,null,null,null,null};

 static int index;
 public static boolean addFlowerNames(String flower){
   boolean isAdded = false;
  
  if (flower!= null){
  
      flowerNames[index] = flower;
	  index++;
	  isAdded=true;
   }else{
       System.out.println("Cannot add flower , as it is a null value");
   }
   return isAdded;
 }
 public static void getAllFlowerNames(){
   System.out.println("Invoking getFlowerNames");
  for(int flower=0; flower < flowerNames.length; flower++){
    String reference = flowerNames[flower];
	System.out.println("Accessing flower " + reference+" at " +flower );
	 }
 
 System.out.println("end of getAllflowerName");
  
 }
 public static boolean updatedFlowerName(String existingFlowerName ,String updatedFlowerName){
	 boolean isUpdated = false;
	 for(int flowerIndex =0; flowerIndex < flowerNames.length;flowerIndex++){
		 //"Rose" ="Red Rose"
		 if (flowerNames[flowerIndex].equals(existingFlowerName)){
			 flowerNames[flowerIndex] = updatedFlowerName ;
			 isUpdated = true;
		 }
	}
	return isUpdated ;
 }

}