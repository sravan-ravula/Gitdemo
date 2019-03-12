
public class ifStatements {

	public static void main(String[] args) {
    int a=10;
    int b=2;
    int c=3;
    int d=4;
    
    if(d>c&d>b&d>a){
    	System.out.println("d is a bigger number than c");
    }
    else if(c>b & c>a){
    		System.out.println("c is bigger number");
    	}
    else if(b>a){
    	System.out.println("b is the bigger number");
    }
    else {
    	System.out.println("a is the bigger number");
    }
    }
	}


