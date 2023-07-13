class SuperMarketA{
	
	//array
// vegatables
static String vegatables[] = {"Potato","Carrot","Beans","Brinjal","Onion"};
// Biscuits
static String biscuits[] = {"marie gold","oreo","gooday","parle G","sunfeast","monaco","hide&seek","krackjack","happy happy","Tiger"};
//perfumes
static String perfumes[] = {"Chanel","Calvin Klein","Burberry",  "Hugo Boss","Engage","Noww","Denver","Villain","park avenue","Yardleey"};
//Groceries 
static String groceries[] = {"Milk","Bread","Curd","Rice","Hourse Grams","Ragi","Rice Flour","Maggie","Dal","Noodels"};
//cosmetics
static String cosmetics[] = {"Moisturizer","Primer","Foundation","Concealer","Powder","Blush","cheek Coloring","Lipstick","lip blam","lip gloss","Mascara","cc cream","highlighter","setting spray","eye shadow","kajal","nail polish","brush","sun screen","puff","scrub","toner","mirror","eye liner","tanning lotion"};

  
  public static void main(String market[]){
  
    System.out.println("Main Started");
	System.out.println("------------------------");
	System.out.println("List of vegatables are");
	//System.out.println(vegatable[0] + " "+vegatable[1] +" "+vegatable[2] + " "+vegatable[3] +" " +vegatable[4] );
	// foreach
 //for(String vegatable:vegatables){
	 //System.out.println(vegatable);
	 //getVegatables();
	 //invoking a method
	 fetchVegatables();
 
	
	System.out.println("------------------------");
	System.out.println("List of Biscuits are");
	//System.out.println(biscuit[0] +" " + biscuit[1] + " " + biscuit[2] + " " + biscuit[3] + " " + biscuit[4] + " " + biscuit[5] + " " + biscuit[6] + " " + biscuit[7] + " " + biscuit[8] + " " +biscuit[9] );
	// foreach
 //for(String biscuit:biscuits){
	 //System.out.println(biscuit);
	 //getBiscuits();
	 fetchBiscuits();
 
	
	
	System.out.println("------------------------");
	System.out.println("List of perfumes are");
	//System.out.println(perfume[0] +" " + perfume[1] + " " + perfume[2] + " " + perfume[3] + " " + perfume[4] + " " + perfume[5] + " " + perfume[6] + " " + perfume[7] + " " + perfume[8] + " " +perfume[9] );
// foreach
 //for(String perfume:perfumes){
	 //System.out.println(perfume);
	//getPerfumes();
    fetchPerfumes();	
 
	
	System.out.println("------------------------");
	System.out.println("List of Groceries are");
	//System.out.println(grocery[0] +" " + grocery[1] + " " + grocery[2] + " " + grocery[3] + " " + grocery[4] + " " + grocery[5] + " " + grocery[6] + " " + grocery[7] + " " + grocery[8] + " " +grocery[9] );
	// foreach
 //for(String grocery:groceries){
	 //System.out.println(grocery);
	 //getGroceries();
	 fetchGroceries();

	System.out.println("------------------------");
	System.out.println("List of cosmetics are");
	//System.out.println(cosmetic[0] +" " + cosmetic[1] + " " + cosmetic[2] + " " + cosmetic[3] + " " + cosmetic[4] + " " + cosmetic[5] + " " + cosmetic[6] + " " + cosmetic[7] + " " + cosmetic[8] + " " +cosmetic[9] + " " + cosmetic[10] +" " +
	//cosmetic[11] + " " + cosmetic[12] + " " + cosmetic[13] + " " + cosmetic[14] + " " + cosmetic[15] + " " + cosmetic[16] + " " + cosmetic[17] + " " + cosmetic[18] + " " +cosmetic[19] + "  " + cosmetic[20] +" " + cosmetic[21] + " " + cosmetic[22] + " " + cosmetic[23] + " " + cosmetic[24] );
	// foreach
 //for(String cosmetic:cosmetics){
	 //System.out.println(cosmetic);
	 //getCosmetics();
	 fetchCosmetics();

	
	System.out.println("Main Ended");
  
  }
  
  
  //read- get,fetch,read
  public static void fetchVegatables(){
	  System.out.println("Inside fetchVegatables");
	  for(String vegatable:vegatables){
		  System.out.println(vegatable);
	  }
  }
  
  public static void fetchBiscuits(){
	  System.out.println("Inside fetchBiscuits");
	  for(String biscuit:biscuits){
		  System.out.println(biscuit);
	  }
  }
  
  public static void fetchPerfumes(){
	  System.out.println("Inside fetchPerfumes");
	  for(String perfume:perfumes){
		  System.out.println(perfume);
	  }
  }
  public static void fetchGroceries(){
	  System.out.println("Inside fetchGroceries");
	  for(String grocery:groceries){
		  System.out.println(grocery);
	  }
  }
  public static void fetchCosmetics(){
	  System.out.println("Inside fetchCosmetics");
	  for(String cosmetic:cosmetics){
		  System.out.println(cosmetic);
	  }
  }
  
  
 
}