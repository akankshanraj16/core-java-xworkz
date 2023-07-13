class ChatAngadi{
   
  
  public static void main(String ChatAngadi[]){
  String chatNames[] = {"Pain puri","Samosa Masala","Bhel puri","dhai puri"};
 
   System.out.println("Main Started");
	System.out.println("------------------------");
	System.out.println("List of chatNames are");
	//invoke logic(methods)
	//Argument
     getChatNames(chatNames);
  }
   public static void getChatNames(String chatNames[]){                 //declaratio n of method
	  System.out.println("Inside getChatNames");                        
	  for(String chatName:chatNames){
		  System.out.println(chatName);
	  }
   }


}