class ChocolatesTester{

   public static void main(String s[]){
    System.out.println("Creating 1st copy of Chocolates");
	Chocolates Chocolate = new Chocolates();
	Chocolate.name ="kitkat";
	Chocolate.price = 170;
	Chocolate.flavour ="chocolate";
	Chocolate.color ="brown";
	Chocolate.quantity ="3";
	Chocolate.expDate = "7 july 26";
    Chocolate.mgfDate = "12 jan 23";
	Chocolate.toGetCalories();
	System.out.println(Chocolate.name +" "+Chocolate.price+" "+Chocolate.flavour+""+Chocolate.color+""+Chocolate.quantity+""+Chocolate.expDate+""+Chocolate.mgfDate);
	
	System.out.println("Creating 2nd copy of Chocolate");
    Chocolates Chocolate1 = new Chocolate();
	Chocolate1.name ="Ikigai";
	Chocolate1.price = 330;
	Chocolate1.flavour ="Francesc Miralles";
	Chocolate1.color ="love";
	Chocolate1.quantity ="Hutchinson";
	Chocolate1.expDate = "13 jan 26" ;
	Chocolate1.mgfDate ="7 july 23";
	Chocolate1.toGetCalories();
	System.out.println(Chocolate1.name +" "+Chocolate1.price+" "+Chocolate1.flavour+""+Chocolate1.color+""+Chocolate1.quantity+""+Chocolate1.expDate+""+Chocolate1.mgfDate);
	
	System.out.println("Creating 3rd copy of Chocolates");
    Chocolates Chocolate2 = new Chocolate();
	Chocolate2.name ="Harry Potter and the Chamber of Secrets ";
	Chocolate2.price =409;
	Chocolate2.author ="J.K. Rowling";
	Chocolate2.author ="J.K. Rowling";
	Chocolate2.type ="Literature & Fiction";
	Chocolate2.publicationName =" Bloomsbury Children's Books; Latest edition";
	Chocolate2.noOfPages ="7 july 26";
	Chocolate2.toGetCalories();
	System.out.println(Chocolate2.name +" "+Chocolate2.price+" "+Chocolate2.flavour+""+Chocolate2.color+""+Chocolate2.quantity+""+Chocolate2.expDate+""+Chocolate2.mgfDate);
	
	System.out.println("Creating 4th copy of Chocolates");
    Chocolates book3 = new Chocolate();
	Chocolate3.name ="If I Was Your Girl";
	Chocolate3.price =1402 ;
	Chocolate3.author ="Meredith Russo";
	Chocolate3.author ="Meredith Russo";
	Chocolate3.type ="Young adult fiction";
	Chocolate3.publicationName ="Flatiron Books; First Edition";
	Chocolate3.noOfPages= 288;
	Chocolate3.toGetCalories();
	System.out.println(Chocolate3.name +" "+Chocolate3.price+" "+Chocolate3.flavour+""+Chocolate3.color+""+Chocolate3.quantity+""+Chocolate3.expDate+""+Chocolate3.mgfDate);
	
	System.out.println("Creating 5th copy of Chocolates");
    Chocolates Chocolate4 = new Chocolate();
	Chocolate4.name ="closer to love";
	Chocolate4.price =408;
	Chocolate4.author ="king vex";
	Chocolate4.type ="love";
	Chocolate4.publicationName ="macmillan";
	Chocolate4.noOfPages = 304;
	Chocolate4.noOfPages =36;
	Chocolate4.toGetCalories();
	System.out.println(Chocolate4.name +" "+Chocolate4.price+" "+Chocolate4.flavour+""+Chocolate4.color+""+Chocolate4.quantity+""+Chocolate4.expDate+""+Chocolate4.mgfDate);
	
	System.out.println("Creating 6th copy of Chocolates");
	Chocolates Chocolate5 = new Chocolate();
	Chocolate5.name ="the mountain is you";
	Chocolate5.price = 173;
	Chocolate5.author ="brianna wiest";
	Chocolate5.type ="basic";
	Chocolate5.publicationName ="kunex edition";
	Chocolate5.noOfPages = 400;
	Chocolate5.noOfPages =36;
	Chocolate5.toGetCalories();
	System.out.println(Chocolate5.name +" "+Chocolate5.price+" "+Chocolate5.flavour+""+Chocolate5.color+""+Chocolate5.quantity+""+Chocolate5.expDate+""+Chocolate5.mgfDate);
	
	System.out.println("Creating 7th copy of Chocolates");
    Chocolates Chocolate6 = new Chocolate();
	Chocolate6.name ="think straight";
	Chocolate6.price =129;
	Chocolate6.author ="Darius foroux";
	Chocolate6.type ="career";
	Chocolate6.publicationName ="penguin";
	Chocolate6.noOfPages =132;
	Chocolate6.noOfPages =36;
	Chocolate6.toGetCalories();
	System.out.println(Chocolate6.name +" "+Chocolate6.price+" "+Chocolate6.flavour+""+Chocolate6.color+""+Chocolate6.quantity+""+Chocolate6.expDate+""+Chocolate6.mgfDate);
	
	System.out.println("Creating 8th copy of Chocolates");
    Chocolates Chocolate7 = new Chocolate();
	Chocolate7.name ="you can";
	Chocolate7.price =99;
	Chocolate7.author ="George matthew adams";
	Chocolate7.type ="romantic";
	Chocolate7.publicationName ="prakash books";
	Chocolate7.noOfPages =232;
	Chocolate7.noOfPages =232;
	Chocolate7.toGetCalories();
	System.out.println(Chocolate7.name +" "+Chocolate7.price+" "+Chocolate7.flavour+""+Chocolate7.color+""+Chocolate7.quantity+""+Chocolate7.expDate+""+Chocolate7.mgfDate);
	
	System.out.println("Creating 9th copy of Chocolates");
    Chocolates Chocolate8 = new Chocolate();
	Chocolate8.name ="the girl with no dreams";
	Chocolate8.price =100;
	Chocolate8.author ="deepak gupta";
	Chocolate8.type ="modern classics";
	Chocolate8.publicationName ="notion press";
	Chocolate8.noOfPages =36;
	Chocolate8.noOfPages =36;
	Chocolate8.toGetCalories();
	System.out.println(Chocolate8.name +" "+Chocolate8.price+" "+Chocolate8.flavour+""+Chocolate8.color+""+Chocolate8.quantity+""+Chocolate8.expDate+""+Chocolate8.mgfDate);
	
	System.out.println("Creating 10th copy of Chocolates");
    Chocolates chocolate9 = new Chocolate();
	chocolate9.name ="The summer i turned pretty";
	chocolate9.price =205;
	chocolate9.author ="jenny han";
	chocolate9.type ="Romance";
	chocolate9.publicationName ="penguin";
	chocolate9.noOfPages =236;
	chocolate9.toGetCalories();
	System.out.println(Chocolate9.name +" "+Chocolate9.price+" "+Chocolate9.flavour+""+Chocolate9.color+""+Chocolate9.quantity+""+Chocolate9.expDate+""+Chocolate9.mgfDate);
   }
}