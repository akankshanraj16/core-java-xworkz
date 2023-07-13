class ShadabHotel{
 //50 items
 
 
   public static void main(String hotel[]){
 String foodMenus[] = {"Chole bhature","Dabeli","Aloo gobi","Channa Masala","Corn manchuri"," Chicken tikka","Paneer Bhurji","Panner Butter masala",
 "Dal fry","Veg Biryani","Pulav","Dal Katchdi","Jeera rice","Upma","Dhokla","Idli","kofta","Roti","Dosa","Parata","Gajjer Halwa","Chilly chicken",
 "Guntoor chicken","Kaima Balls","Ragi ball","Chicken Biryani","Hydrabadi dum biryani","Chickren 65","Egg Omlet","Boiled eggs","White rice",
 "Chicken sambar","Khadai Chicken","Chicken Kabab","Chicken ghee roast","Fish tawa fry","Neer Dose","Curd Rice","Tomato Soup","Chicken lollipop",
 "naan","Egg curry","Panner ghee roast","naan","Rumali roti","Fish fingers","Egg rolls","Chicken momos","Panner momos","Samose"};
 
 // foreach
 //for(String foodMenu:foodMenus){
	// System.out.println(foodMenu);
    System.out.println("Main Started");
    System.out.println("------------------------");
	System.out.println("List of foodMenu are");
	getfoodMenus(foodMenus);
//System.out.println(foodMenu[0] + " " + foodMenu[1] + "  " + foodMenu[2] + "  " + foodMenu[3] + "  " + foodMenu[4] + "  " + foodMenu[5] + " " + foodMenu[6] + " " + foodMenu[7] + " " + foodMenu[8] + " "+ foodMenu[9] + " " + foodMenu[10] + " " + 
    // foodMenu[11] + " " + foodMenu[12] + " " + foodMenu[13] + " " + foodMenu[14] + " " + foodMenu[15] + " " + foodMenu[16] + "  " + foodMenu[17] + "  " + foodMenu[18] + "  "+ foodMenu[19] + " " + foodMenu[20] + " " +   
    // foodMenu[21] + " " + foodMenu[22] + " " + foodMenu[23] + " " + foodMenu[24] + " " + foodMenu[25] + " " + foodMenu[26] + "  " + foodMenu[27] + "  " + foodMenu[28] + " "+ foodMenu[29] + " " + foodMenu[30] + " " +   
    // foodMenu[31] + " " + foodMenu[32] + " " + foodMenu[33] + " " + foodMenu[34] + " " + foodMenu[35] + " " + foodMenu[36] + "  " + foodMenu[37] + "  " + foodMenu[38] + " "+ foodMenu[39] + " " + foodMenu[40] + " " +   
    // foodMenu[41] + " " + foodMenu[42] + " " + foodMenu[43] + " " + foodMenu[44] + " " + foodMenu[45] + " " + foodMenu[46] + "  " + foodMenu[47] + "  " + foodMenu[48] + " "+ foodMenu[49]);
 
 
 }
public static void getfoodMenus(String foodMenus[]){
	  System.out.println("Inside getfoodMenu");
	  for(String foodMenu:foodMenus){
		  System.out.println(foodMenu);
	  }
  }


}