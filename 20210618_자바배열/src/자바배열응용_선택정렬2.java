import java.util.Arrays;

// ���ĺ��� ����
public class �ڹٹ迭����_��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] alpha=new char[7];
//		//ASC => �ø�����
//		for(int i=0;i<alpha.length;i++)
//		{
//			alpha[i]=(char)((Math.random()*26)+65);
//		}
//		
//		System.out.println(Arrays.toString(alpha));
//		System.out.println("=========================");
//		for(int i=0; i<alpha.length-1;i++)
//		{
//			for(int j=i+1;j<alpha.length;j++)
//			{
//				char temp =' ';
//				if(alpha[i]>alpha[j])
//				{
//					temp=alpha[i];
//					alpha[i]=alpha[j];
//					alpha[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(alpha));
		
		// String s="ADBHCEOPEK"
		String s="ADBHCEOPEK";
		char[] al = new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			al[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(al));
		for(int i=0; i<al.length-1;i++)
		{
			for(int j=i+1;j<al.length;j++)
			{
				char temp =' ';
				if(al[i]>al[j])
				{
					temp=al[i];
					al[i]=al[j];
					al[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(al));
	}

}
