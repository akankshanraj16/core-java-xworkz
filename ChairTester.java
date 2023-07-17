class ChairTester{

   public static void main(String s[]){
   //object creation in java
    
	//ClassName referenceVariable = newClassName();
	System.out.println("Creating 1st copy of chair");
	Chair chair = new Chair();
	chair.name ="Nirmala";
	chair.type ="plastic";
	chair.color ="Cream";
	chair.price =300.0;
	chair.toSit();
	System.out.println(chair.name +" "+chair.type+" "+chair.color+""+chair.price);
	
	System.out.println("Creating 2nd copy of chair");
    Chair chair1 = new Chair();
	chair1.name ="Nirmala";
	chair1.type ="steel";
	chair1.color ="black";
	chair1.price =650.0;
	chair1.toSit();
	System.out.println(chair1.name +" "+chair1.type+" "+chair1.color+""+chair1.price);
	
	System.out.println("Creating 3rd copy of chair");
    Chair chair2 = new Chair();
	chair2.name ="Nirmala";
	chair2.type ="wood";
	chair2.color ="brown";
	chair2.price =800.0;
	chair2.toSit();
	System.out.println(chair2.name +" "+chair2.type+" "+chair2.color+""+chair2.price);

   }
}