import java.util.*;
public class q5 {
public static int gcd(int m ,int n) {
	if(n==0) 
		return m;
	return gcd(n,m%n);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter both value of m and n");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int ans=gcd(m,n);
		System.out.println("gcd is ="+ans);

	}

}