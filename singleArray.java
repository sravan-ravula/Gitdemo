
public class singleArray {

	public static void main(String[] args) {
      int []i=new int[3];
      i[0]=5;
      i[1]=6;
      i[2]=7;
      for(int j=0;j<i.length;j++){
    	  System.out.println(i[j]);
      }
     char c[]=new char[3];
     c[0]='a';
     c[1]='b';
     c[2]='&';
     for(int d=0;d<c.length;d++){
    	 System.out.println(c[d]);
     }
     double e[]=new double[3];
     e[0]=11.11;
     e[1]=22.22;
     e[2]=33.33;
     for(int f=0;f<e.length;f++){
    	 System.out.println(e[f]);
     }
     boolean n[]=new boolean[2];
     n[0]= true;
     n[1]=false;
     for(int o=0;o<n.length;o++){
    	 System.out.println(n[o]);
     }
     
     String s[]=new String[3];
     s[0]="hello";
     s[1]="my";
     s[2]="world";
     for(int r=0;r<s.length;r++){
    	 System.out.println(s[r]);
     }
     Object obj[]=new Object[3];
     obj[0]=12.33;
     obj[1]="sravan";
     obj[2]='%';
     for(int k=0;k<obj.length;k++){
    	 System.out.println(obj[k]);
     }
	}
	

}
