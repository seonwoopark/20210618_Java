import java.util.Arrays;

/*
 *     
 *     40 50 10 20 30 ===> 50 40 30 20 10(DESC) , 10 20 30 40 50(ASC)
 *                         ��������                 �ø�����              ==> <, >
 *                         
 *     ��������
 *     ======
 *     40 50 10 20 30
 *     == ==
 *     50 40 
 *     ==    ==
 *     50    10
 *     ==       ==
 *     50       20
 *     ==          == 1round (for�� 1����)
 *     50          30
 *     ================================
 *     50 40 10 20 30
 *        == ==
 *        40 10
 *        ==    ==
 *        40    20
 *        ==       ==
 *        40       30
 *     =================================
 *     50 40 10 20 30
 *           == ==
 *           20 10
 *           ==    ==
 *           30    20
 *     =================================
 *     50 40 30 10 20
 *              == ==
 *              20 10
 *     =================================
 *     50 40 30 20 10
 * 
 */
public class �ڹٹ迭����_�������� {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int temp =0;
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; //1~100 ������ ������ ����
		}
		
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}







