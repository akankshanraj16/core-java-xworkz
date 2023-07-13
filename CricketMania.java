class CricketMania {
//top10 BatsMan
//top10 IccTeamRankings {"India",""}
//ipl TeamNames = {"Chennai Super Kings"}-10

  
 public static void main(String Cricketmania[]) {
  String batsMens[] = { "Sachin Tendulkar", "Virat Kohli", "Sourav Ganguli", "Rahul Dravid", "David Warner", "Rohith Sharma" , "Chris Gayle" , "Mohammed Shami" , "Rashid khan" , "M S dhoni"};
  String iccTeamRankings[] = {"Australia", "Pakistan", "India", "Newzealand", "England", "South Africa", "Bangladesh", "Afghanistan", "Sri Lanka", "West Indies"};
  String iplTeamNames[] = {"Royal Challengers Bengaluru", "Chennai Super Kings","Kolkata Kinght Riders", "Mumbai Indians", "Gujarat Titans", "Rajastan Royals", "Sunrisers Hyderabad", "Delhi Capitals", "Lucknow Super Giants", "Punjab kings" };
 
	  System.out.println("Main started");
	  System.out.println("------------------------------");
	  System.out.println("List of batsMens are");
	  getbatsMens(batsMens);
// foreach
//for(String batsMan:batsMens){
// System.out.println(batsMan);
	 
 
      System.out.println("------------------------------");
      System.out.println("List of iccTeamRankings are");
	  geticcTeamRankings(iccTeamRankings);
 //for(String iccTeamRanking:iccTeamRankings){
 //System.out.println(iccTeamRanking);
	 
 
      System.out.println("------------------------------");
      System.out.println("List of iplTeamNames are");
      getiplTeamNames(iplTeamNames);
 //for(String iplTeamName:iplTeamNames){
 //System.out.println(iplTeamName);
	

	  System.out.println("------------------------------");
	  //System.out.println("List of top 10 batsMan are:");
	  //System.out.println(batsMan[0] + " " + batsMan[1] + " " + batsMan[2] + " " + batsMan[3] + " " + batsMan[4] + " " + batsMan[5] + " " + batsMan[6] + " " + batsMan[7] + " " + batsMan[8] + " " + batsMan[9] );
	  //System.out.println("------------------------------");
	  
	  //System.out.println("List of top 10 iccTeamRankings are:");
	  //System.out.println(iccTeamRankings[0] + " " + iccTeamRankings[1] + " " + iccTeamRankings[2] + " " + iccTeamRankings[3] + " " + iccTeamRankings[4] + " " + iccTeamRankings[5] + " " + iccTeamRankings[6] + " " + iccTeamRankings[7] + " " + iccTeamRankings[8] + " " + iccTeamRankings[9] );
	  //System.out.println("------------------------------");
	 
	  //System.out.println("List of top 10 iplTeamNames are:");
	  //System.out.println(iplTeamNames[0] + " " + iplTeamNames[1] + " " + iplTeamNames[2] + " " + iplTeamNames[3] + " " + iplTeamNames[4] + " " + iplTeamNames[5] + " " + iplTeamNames[6] + " " + iplTeamNames[7] + " " +iplTeamNames[8] + " " + iplTeamNames[9] );
	  //System.out.println("------------------------------");
	  //System.out.println("Main Ended");
 }
 public static void getbatsMens(String batsMens[]){
	  System.out.println("Inside getbatsMens");
	  for(String batsMan:batsMens){
		  System.out.println(batsMan);
	  }
  }
  public static void geticcTeamRankings(String iccTeamRankings[]){
	  System.out.println("Inside geticcTeamRankings");
	  for(String iccTeamRanking:iccTeamRankings){
		  System.out.println(iccTeamRanking);
	  }
  }
  public static void getiplTeamNames(String iplTeamNames[]){
	  System.out.println("Inside getiplTeamNames");
	  for(String iplTeamName:iplTeamNames){
		  System.out.println(iplTeamName);
	  }
  }
}
	  