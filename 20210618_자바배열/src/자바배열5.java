import java.util.Scanner;

public class �ڹٹ迭5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5���� �̸� ����
//		String[] name = {"ȫ�浿","��û��","������","�ڹ���","�̼���"};
//		String[] sex = {"����","����","����","����","����"};
//		// ��� => for-each(�Ѱ��� �迭���� ������ ���)
//		// �Ϲ� for ȫ�浿(����)
//		for(int i=0;i<name.length;i++)
//		{
//			System.out.printf("%s(%s)\n",name[i],sex[i]);
//		}
		String[] book = {
				"�ڹٿ� ����Ŭ",
				"�ڹٿ� JSP",
				"HTML & Ajax",
				"�ڹ� & ��Ʋ��",
				"ȥ�� ���� ������",
				"ȥ�� ���� �ڹ�",
				"�ڹٿ� AI",
				"����� ��Ʋ��",
				"����ϰ� �ڹ�"
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� �Է� :");
		String data= scan.next();
		
		for(String s:book)
		{
			if(s.startsWith(data)|| s.endsWith(data))
			{
				try {
					Thread.sleep(500);
				}catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println(s);
			}
		}
		
		
	}

}






