class  WalletTester{
	
public static void main(String s[]){
	Wallet wallets = new Wallet();
	 System.out.println(wallets.walletMaterialType);
	 System.out.println(wallets.countryOfOrigin);
	 System.out.println(wallets.price);
	 System.out.println(wallets.noOfCompotments);
System.out.println("1st copy of wallet");
Wallet  wallet=new Wallet();
wallet.walletMaterialType="leather";
wallet.countryOfOrigin="japan";
wallet. price= 500;
wallet.noOfCompotments=2;
wallet.forSafety();
System.out.println(wallet.walletMaterialType+ "  " +wallet.countryOfOrigin+ "  "+ wallet. price+ " " + wallet.noOfCompotments);

System.out.println("2nd copy of wallet");
Wallet  wallet1=new Wallet();
wallet1.walletMaterialType="Fabric";
wallet1.countryOfOrigin="India";
wallet1. price= 600;
wallet1.noOfCompotments=1;
wallet1.forSafety();
System.out.println(wallet1.walletMaterialType+ "  " +wallet1.countryOfOrigin+ ""+wallet1. price+ " " + wallet1.noOfCompotments);

System.out.println("3rd copy of wallet");
Wallet  wallet2=new Wallet();
wallet2.walletMaterialType="leather";
wallet2.countryOfOrigin="USA";
wallet2. price= 700;
wallet2.noOfCompotments=3;
wallet2.forSafety();
System.out.println(wallet2.walletMaterialType+ "  " +wallet2.countryOfOrigin+ " "+ wallet2. price+ " " + wallet2.noOfCompotments );

System.out.println("4th copy of wallet");
Wallet  wallet3=new Wallet();
wallet3.walletMaterialType="fabric";
wallet3.countryOfOrigin="africa";
wallet3. price= 500;
wallet3.noOfCompotments=4;
wallet3.forSafety();
System.out.println(wallet3.walletMaterialType+ "  " +wallet3.countryOfOrigin+ "  "+ wallet3. price+ " " + wallet3.noOfCompotments );

System.out.println("5th copy of wallet");
Wallet  wallet4=new Wallet();
wallet4.walletMaterialType="leather";
wallet4.countryOfOrigin="America";
wallet4. price= 800;
wallet4.noOfCompotments=5;
wallet4.forSafety();
System.out.println(wallet4.walletMaterialType+ "  " +wallet4.countryOfOrigin+ "  "+ wallet4. price+ " " + wallet4.noOfCompotments);

System.out.println("6th copy of wallet");
Wallet  wallet5=new Wallet();
wallet5.walletMaterialType="fabric";
wallet5.countryOfOrigin="Japan";
wallet5. price= 500;
wallet5.noOfCompotments=6;
wallet5.forSafety();
System.out.println(wallet5.walletMaterialType+ "  " +wallet5.countryOfOrigin+ "  "+ wallet5. price+ " " + wallet5.noOfCompotments);

System.out.println("7th copy of wallet");
Wallet  wallet6=new Wallet();
wallet6.walletMaterialType="leather";
wallet6.countryOfOrigin="odissa";
wallet6. price= 900;
wallet6.noOfCompotments=2;
wallet6.forSafety();
System.out.println(wallet6.walletMaterialType+ "  " +wallet6.countryOfOrigin+ "  "+ wallet6. price+ " " + wallet6.noOfCompotments);

System.out.println("8th copy of wallet");
Wallet  wallet7=new Wallet();
wallet7.walletMaterialType="fabric";
wallet7.countryOfOrigin="India";
wallet7. price= 1500;
wallet7.noOfCompotments=1;
wallet7.forSafety();
System.out.println(wallet7.walletMaterialType+ "  " +wallet7.countryOfOrigin+ "  "+ wallet7. price+ " " + wallet7.noOfCompotments);

System.out.println("9th copy of wallet");
Wallet  wallet8=new Wallet();
wallet8.walletMaterialType="leather";
wallet8.countryOfOrigin="India";
wallet8. price= 2500;
wallet8.noOfCompotments=2;
wallet8.forSafety();
System.out.println(wallet8.walletMaterialType+ " " +wallet8.countryOfOrigin+ " "+ wallet8. price+ " " + wallet8.noOfCompotments);

System.out.println("10th copy of wallet");
Wallet  wallet9=new Wallet();
wallet9.walletMaterialType="fabric";
wallet9.countryOfOrigin="America";
wallet9. price= 1300;
wallet9.noOfCompotments=2;
wallet9.forSafety();
System.out.println(wallet9.walletMaterialType+ "  " +wallet9.countryOfOrigin+ "  "+ wallet9. price+ "" + wallet9.noOfCompotments);

     System.out.println(wallets.walletMaterialType);
	 System.out.println(wallets.countryOfOrigin);
	 System.out.println(wallets.price);
	 System.out.println(wallets.noOfCompotments);


}

}