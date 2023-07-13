class Division 
{
 
 public static void main(String division[]){
 
 div(56,3);
 div(98,10);
 div(90,89);
 div(68,78);
 div(150,1);
 div(869,90);
 div(78,85);
 div(1890,89);
 div(65,9);
 div(800,8);
 
 div(586,3,8);
 div(980,100,7);
 div(900,350,9);
 div(678,188,8);
 div(690,156,7);
 div(186,97,7);
 div(798,86,7);
 div(180,89,5);
 div(965,93,9);
 div(870,70,8);
 
 }
 public static void div(int a , int b) {
 System.out.println(a/b);
 }
 public static void div(int a , int b , int c) {
 System.out.println((a/b)/c);
 }
 
}