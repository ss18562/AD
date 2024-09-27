import java.util.*;
public class q6 {
 public static int power(int x,int n) {
	 if(n==0)
		 return 1;
	if(x==0)
		return 0;
	if(x==1)
		return 1;
	else
		return x*power(x,n-1);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x and n");
    int x=sc.nextInt();
    int n=sc.nextInt();
    System.out.println(power(x,n));
    
	}

}