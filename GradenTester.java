class GradenTester{

public static void main(String flower[]){

Graden.addFlowerNames("Rose");
Graden.addFlowerNames("lily");
Graden.addFlowerNames("Dahlia");
Graden.addFlowerNames("Jasmine");
Graden.addFlowerNames("Daisy");
Graden.addFlowerNames("Tulip");
Graden.addFlowerNames("Lotus");
Graden.addFlowerNames("Sunflower");


Graden.getAllFlowerNames();

boolean isUpdated = Graden.updatedFlowerName("Rose","Red Rose");
System.out.println("Is Metro Name updated"+ isUpdated);
Graden.getAllFlowerNames();
}

}