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
	}

}
