
public class twoDimensionalArray {

	public static void main(String[] args) {
    int k[][]=new int[3][4];//3--indicates no of rows,4--indicates no of columns
    k[0][0]=63;
    k[0][1]=73;
    k[0][2]=84;
    k[0][3]=93;
    
    k[1][0]=33;
    k[1][1]=44;
	k[1][2]=55;
	k[1][3]=66;	

	k[2][0]=22;
	k[2][1]=23;
	k[2][2]=54;
	k[2][3]=66;
	
	for(int l=0;l<k.length;l++){
    for(int m=0;m<k[0].length;m++){
    	System.out.println(k[l][m]);
    }
}
	}
}