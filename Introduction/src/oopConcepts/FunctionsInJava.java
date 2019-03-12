package oopConcepts;

public class FunctionsInJava {

	public static void main(String[] args) {
       FunctionsInJava obj=new FunctionsInJava();
      int j =obj.test();
      System.out.println(j);
      String s1=obj.pqr();
      System.out.println(s1);
     String m =obj.date(1, 3, 2019);
     System.out.println(m);
     int b=obj.multiplication(5, 4, 3, 2, 1);
     System.out.println(b);
	}
	
	
  public int test(){
	  System.out.println("automation");
	 int a=10;
	 int b=20;
	 int c=a+b;
	 return c;
  }
  public String pqr(){
	  System.out.println("manual");
	  String s="manual testing";
	  return s;
  }
  public String date(int x, int y, int z ){
	  System.out.println("writing a date");
	  String w=x+"/"+y+"/"+z;
	  return w;
  }
  public int multiplication(int x,int y, int z,int k, int l){
	  System.out.println("multiplication");
	  int h=x*y*z*k*l;
	  return h;
	  
  }
}
