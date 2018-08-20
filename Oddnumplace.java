package janani;
import java.util.Scanner;
public class Oddnumplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b=0,count=0,n,n1;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
n1=ja.nextInt();
int []a=new int[n];
for(int i=0;i<n&& count<n1;i++){
	a[i]=ja.nextInt();
	if(a[i]%2!=0){
		count++;
		b=a[i];
	}
}
System.out.println(b);
	}

}
