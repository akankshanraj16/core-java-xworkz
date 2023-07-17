class SwitchBoardTester{

  public static void main(String switchBoard[]){
    //object creation logic
	//allocate a memory
	//invoke constructor of class
	//ref variable
	SwitchBoard board = new SwitchBoard();
	 System.out.println(board.brandName);
	 System.out.println(board.noOfSwitches);
	 System.out.println(board.type);
	 System.out.println(board.color);
	 System.out.println(board.price);
	board.brandName ="Oraimo";
	board.noOfSwitches = 4;
	board.type ="Rotary switch";
	board.color ="white";
	board.price = 999.0;
	board.provideElectricity();
	System.out.println(board.brandName);
	System.out.println(board.noOfSwitches);
	System.out.println(board.type);
	System.out.println(board.color);
	System.out.println(board.price);
	}

}