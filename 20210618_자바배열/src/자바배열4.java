// ��ǻ�� ==> �����
import java.util.Scanner;
public class �ڹٹ迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭���̻��
		//1.��ǻ�Ͱ� �������� �� ����
		int com = (int)(Math.random()*3);
		//2.�����
		Scanner scan = new Scanner(System.in);
		System.out.print("����(0) ����(1) ��(2) :");
		int user= scan.nextInt();
		
//		if(user==0)
//			System.out.println("����ڴ� ����");
//		else if(user==1)
//			System.out.println("����ڴ� ����");
//		else if(user==2)
//			System.out.println("����ڴ� ��");
//		
//		if(com==0)
//			System.out.println("��ǻ�ʹ� ����");
//		else if(com==1)
//			System.out.println("��ǻ�ʹ� ����");
//		else if(com==2)
//			System.out.println("��ǻ�ʹ� ��");
		
		
		//�迭�̿�
		String[] s = {"����","����","��"};
		System.out.println("��ǻ�� :"+s[com]);
		System.out.println("����� :"+s[user]);
		
		
	}

}







