class BookTester{

   public static void main(String s[]){
    System.out.println("Creating 1st copy of book");
	Book book = new Book();
	book.name ="Think Like a Monk";
	book.price = 379;
	book.author ="Jay Shetty";
	book.type ="Relationship";
	book.publicationName ="Thorsons";
	book.noOfPages = 320;
	book.gainKnowledge();
	System.out.println(book.name +" "+book.price+" "+book.author+""+book.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 2nd copy of book");
    Book book1 = new Book();
	book1.name ="Ikigai";
	book1.price = 330;
	book1.author ="Francesc Miralles";
	book1.type ="love";
	book1.publicationName ="Hutchinson";
	book1.noOfPages = 208 ;
	book1.gainKnowledge();
	System.out.println(book1.name +" "+book1.price+" "+book1.author+""+book1.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 3rd copy of book");
    Book book2 = new Book();
	book2.name ="Harry Potter and the Chamber of Secrets ";
	book2.price =409;
	book2.author ="J.K. Rowling";
	book2.type ="Literature & Fiction";
	book2.publicationName =" Bloomsbury Children's Books; Latest edition";
	book2.noOfPages =384;
	book2.gainKnowledge();
	System.out.println(book2.name +" "+book2.price+" "+book2.author+""+book2.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 4th copy of book");
    Book book3 = new Book();
	book3.name ="If I Was Your Girl";
	book3.price =1402 ;
	book3.author ="Meredith Russo";
	book3.type ="Young adult fiction";
	book3.publicationName ="Flatiron Books; First Edition";
	book3.noOfPages= 288;
	book3.gainKnowledge();
	System.out.println(book3.name +" "+book3.price+" "+book3.author+""+book3.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 5th copy of book");
    Book book4 = new Book();
	book4.name ="closer to love";
	book4.price =408;
	book4.author ="king vex";
	book4.type ="love";
	book4.publicationName ="macmillan";
	book4.noOfPages = 304;
	book4.gainKnowledge();
	System.out.println(book4.name +" "+book4.price+" "+book4.author+""+book4.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 6th copy of book");
	Book book5 = new Book();
	book5.name ="the mountain is you";
	book5.price = 173;
	book5.author ="brianna wiest";
	book5.type ="basic";
	book5.publicationName ="kunex edition";
	book5.noOfPages = 400;
	book5.gainKnowledge();
	System.out.println(book5.name +" "+book5.price+" "+book5.author+""+book5.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 7th copy of book");
    Book book6 = new Book();
	book6.name ="think straight";
	book6.price =129;
	book6.author ="Darius foroux";
	book6.type ="career";
	book6.publicationName ="penguin";
	book6.noOfPages =132;
	book6.gainKnowledge();
	System.out.println(book6.name +" "+book6.price+" "+book6.author+""+book6.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 8th copy of book");
    Book book7 = new Book();
	book7.name ="you can";
	book7.price =99;
	book7.author ="George matthew adams";
	book7.type ="romantic";
	book7.publicationName ="prakash books";
	book7.noOfPages =232;
	book7.gainKnowledge();
	System.out.println(book7.name +" "+book7.price+" "+book7.author+""+book7.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 9th copy of book");
    Book book8 = new Book();
	book8.name ="the girl with no dreams";
	book8.price =100;
	book8.author ="deepak gupta";
	book8.type ="modern classics";
	book8.publicationName ="notion press";
	book8.noOfPages =36;
	book8.gainKnowledge();
	System.out.println(book8.name +" "+book8.price+" "+book8.author+""+book8.type+""+book.publicationName+""+book.noOfPages);
	
	System.out.println("Creating 10th copy of book");
    Book book9 = new Book();
	book9.name ="The summer i turned pretty";
	book9.price =205;
	book9.author ="jenny han";
	book9.type ="Romance";
	book9.publicationName ="penguin";
	book9.noOfPages =236;
	book9.gainKnowledge();
	System.out.println(book9.name +" "+book9.price+" "+book9.author+""+book9.type+""+book.publicationName+""+book.noOfPages);
   }
}