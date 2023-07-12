class StationaryTester{

   public static void main(String tester[]){
	   //create, save , add
       Stationary.addStationaryItems("Books");
	   Stationary.addStationaryItems("Pen");
	   Stationary.addStationaryItems("Pencil");
	   Stationary.addStationaryItems("Scale");
	   Stationary.addStationaryItems("Eraser");
	   Stationary.addStationaryItems("SketchPens");
	   Stationary.addStationaryItems("Ink Pen");
	   Stationary.addStationaryItems("safety pin");
	   
	   //Read,get,fetch
	   Stationary.getAllStationaryItems();
	   
	   String sName = Stationary.getAllStationaryItemsByName("safety pin");
	   System.out.println("The searched item name is"+ sName);
	   
        // update ,edit
       Stationary.editStationaryItemName("CardBoard", "safety pin");
       Stationary.getAllStationaryItems();
int newLength= Stationary.deleteStationaryItemName("Eraser");
System.out.println("Calling getAllStationaryItemsPostDeletion");
Stationary.getAllStationaryItemsPostDeletion(newLength);	
   }
}