class MedicalStoreTester{

public static void main(String Medical[]){

MedicalStore.addMedicineNames("Aspirin");
MedicalStore.addMedicineNames("Diclofenac");
MedicalStore.addMedicineNames("Paracetamol");
MedicalStore.addMedicineNames("Cetirizine");
MedicalStore.addMedicineNames("Nicardipine");
MedicalStore.addMedicineNames("Dolo 650");
MedicalStore.addMedicineNames("Ranitidine");
MedicalStore.addMedicineNames("Morphine");


MedicalStore.getAllMedicineNames();

boolean isUpdated = MedicalStore.updateMedicineNames("Aspirin","Nimica");
System.out.println("Is Medicine Name updated"+ isUpdated);
MedicalStore.getAllMedicineNames();
}

}