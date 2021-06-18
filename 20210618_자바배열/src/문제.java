import java.util.Arrays;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int count =0; int sum=0;
		 * 
		 * for(int i=100;i<1000;i++) { if(i%7==0) { count++; sum+=i; } }
		 * 
		 * System.out.println("7의 배수 갯수 : "+count);
		 * System.out.println("7의 배수 합 : "+sum);
		 */
		
		
		
		/*
		 * int count =0; int sum=0;
		 * 
		 * for(int i=100;i<1000;i++) { if(i%4!=0) { count++; sum+=i; } }
		 * 
		 * System.out.println("갯수 : "+count); System.out.println("합 : "+sum);
		 */
		
		
		
		
		/*
		 * int even =0; int odd =0;
		 * 
		 * for(int i=1;i<=30;i++) { if(i%2==0) { even+=i; } else { odd+=i; } }
		 * System.out.println("짝수 합: "+even); System.out.println("짝수 합: "+odd);
		 */
		
		
		/*
		 * int even =0; int odd =0; for(int i=1; i<=100;i++) { if(i%3==0 && i%5==0) {
		 * System.out.print(i+"\t"); } }
		 */
		
		
		
		/*
		 * int sum7=0; int sum9=0; int sum=0;
		 * 
		 * for(int i=1;i<=1000;i++) { if(i%7==0) { sum7+=i; sum+=i; } if(i%9==0) {
		 * sum9+=i; sum+=i; } } System.out.println("7의 배수:"+sum7);
		 * System.out.println("9의 배수:"+sum9); System.out.println("7의 배수+9의 배수:"+sum);
		 */
		
		
		
		/*
		 * for(int i=10;i<=99;i++) { int a= i/10; int b=i%10; if(a==b)
		 * System.out.print(i+" "); }
		 */
		
		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("점수입력:"); int num =
		 * scan.nextInt();
		 * 
		 * if(num>=60) System.out.println("합격"); else System.out.println("불합격");
		 */
		
		
		/*
		 * int[] num = {94,85,95,88,90}; int max=num[0]; int min=num[0]; for(int
		 * i=0;i<num.length;i++) { if(max<num[i]) max=num[i]; if(min>num[i]) min=num[i];
		 * } System.out.println("최댓값 :"+max); System.out.println("최솟값 :"+min);
		 */
		
		
		/*
		 * int[] num = new int[10]; double avg=0;
		 * 
		 * for(int i=0;i<num.length;i++) { num[i] = (int)(Math.random()*10)+1; avg+=
		 * num[i]; }
		 * 
		 * System.out.print("랜덤한 정수들 :");
		 * 
		 * for(int i=0;i<num.length;i++) { System.out.print(num[i]+" "); }
		 * System.out.println("\n평균은 "+(avg/10.0));
		 */
		 
		
		
		
		int[] num = new int[5];
		 System.out.println("==== 정렬전 ====");
		 for(int i=0;i<num.length;i++) 
		 { 
			 num[i] = (int)(Math.random()*100)+1;
			 System.out.print(num[i]+" ");
			 }
		 
		 for(int i=0; i<num.length-1;i++)
		 {
			 for(int j=1+i; j<num.length;j++)
			 {
				 if(num[i]>num[j])
				 {
					 int temp=num[i];
					 num[i]=num[j];
					 num[j]=temp;
				 }
				 
			 }
		 }
		 System.out.println("\n==== 정렬후 ====");
		 for(int i=0;i<num.length;i++) 
		 { 
			 System.out.print(num[i]+" ");
			 }
		 
		
		
		
	}

}
