class MedicalStore{

static String medicineNames[]={null,null,null,null,null,null,null,null};

 static int index;
 public static boolean addMedicineNames(String medicine){
   boolean isAdded = false;
  
  if (medicine!= null){
  
      medicineNames[index] = medicine;
	  index++;
	  isAdded=true;
   }else{
       System.out.println("Cannot add medicine , as it is a null value");
   }
   return isAdded;
 }
 public static void getAllMedicineNames(){
   System.out.println("Invoking getMedicineNames");
  for(int medicine=0; medicine < medicineNames.length; medicine++){
    String reference = medicineNames[medicine];
	System.out.println("Accessing medicineNames " + reference+" at " +medicine );
	 }
 
 System.out.println("end of getAllMedicalStore");
  
 }
 public static boolean updateMedicineNames(String existingMedicineNames ,String updatedMedicineNames){
	 boolean isUpdated = false;
	 for(int medicineIndex =0; medicineIndex < medicineNames.length; medicineIndex++){
		 //"Aspirin" ="Nimica"
		 if (medicineNames[medicineIndex].equals(existingMedicineNames)){
			 medicineNames[medicineIndex] = updatedMedicineNames ;
			 isUpdated = true;
		 }
		 
	}
	return isUpdated ;
 }
}

