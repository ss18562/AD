import java.util.*;
public class q3 {
  public static int calculatefac(int n) {
	  if(n==1||n==0) {
		  return 1;
	  }
	 int fac1= calculatefac(n-1);
	  int fac2=n*fac1;
	  return fac2;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the no.");
    int n=sc.nextInt();
    int ans=calculatefac(n);
    System.out.println(ans);
	}

}