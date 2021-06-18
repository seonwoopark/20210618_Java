import java.util.Arrays;

/*
 *    버블정렬
 *    
 *    30 20 40 50 10
 *    
 * 
 */
public class 자바배열_버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("=====================      ");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				int temp=0;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
					System.out.println(Arrays.toString(arr));
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
