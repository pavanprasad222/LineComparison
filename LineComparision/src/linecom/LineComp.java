package linecom;
import java.util.*;

public class LineComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Welcome To Line Comparison Computational Program");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter First Co-ordinates");
   int x1=sc.nextInt();
   int x2=sc.nextInt();
   System.out.println("Enter Second Co-ordinates");
   int y1=sc.nextInt();
   int y2=sc.nextInt();
   double length;
   length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
   System.out.println("Length of the line" + length);
   double length2;
   System.out.println("Enter your Third co-ordinate");
   int m1=sc.nextInt();
   int m2=sc.nextInt();
   System.out.println("Enter your Fourth co-ordinate");
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   length2=Math.sqrt((m2-m1)*(m2-m1) + (n2-n1)*(n2-n1));
   System.out.println("Length of the line" + length2);
   String str1=length+"";
   String str2=length2+"";
   if (str1.equals(str2)==true)
    System.out.println("The Two Lines Are Equal");
    else
    	System.out.println("The Two Line Are Not Equal");
   double check = str1.compareTo(str2);
   if(check == 0)
  System.out.println("The Two Lines Are Equal");
  else if(check < 0.0)
	  System.out.println("Line1 is Smaller Than Line2");
  else
	  System.out.println("Line1 is Greater Then Line2");
   
    
	}

}
