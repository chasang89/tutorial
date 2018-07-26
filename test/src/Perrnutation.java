import java.util.Arrays;
import java.util.LinkedList;

public class Perrnutation {
	public static void main(String[] args) {

		Perrnutation p = new Perrnutation();

		/*���ڸ� �Է��ϴ� ��*/
		int [] input={0,0,0};

		if(input.length>=2 && input.length<=18) {
			System.out.println("���� " + p.solve(input) + " �Դϴ�.");
		}else if(input.length < 2) {
			System.out.println("������ ������ 2�� ���� ���ƾ� �մϴ�.");
		}else if(input.length > 18) {
			System.out.println("������ ������ 18������ �����ϴ�.");
		}
	}

	public int solve(int[] input) {

		int sum = 0;

		Arrays.sort(input);	
		LinkedList<Integer> listNum = new LinkedList<Integer>();				

		for (int num : input) {
			if(num!=0){
				listNum.add(num);	
			}			
		}

		if(listNum.size()<2){
			sum = -1;		
			System.out.println("�� �ڿ����� ��������� �ʽ��ϴ�.");
		}else{
			for (int num : input) {
				if(num==0){
					listNum.add(2,num);	
				}
			}

			System.out.println(listNum);

			StringBuilder a = new StringBuilder();
			StringBuilder b = new StringBuilder();

			for (int i = 0; i < listNum.size(); i++) {
				if(i%2==0){
					a.append(listNum.get(i));
				}else {
					b.append(listNum.get(i));
				}
			}
			System.out.println(a);
			System.out.println(b);

			int c = Integer.parseInt(a.toString());
			int d = Integer.parseInt(b.toString());
			System.out.println("�� �ڿ����� " + c + ", " + d + " �Դϴ�.");
			sum = c+d;
		}
		return sum;		
	}

	/*����.
	1. sort �Ѵ�.
	2. 0�� �ٸ� �迭�� ��´�.
	3. 0�� ������ ���� 2�� �̻� ������ �ʿ�.(������ -1)
	4. 2�� ���� �ڿ��ٰ� 0�� �迭�� �����ؼ� �ٽ� ��Ʈ.(�迭 �߰��ص� �� linked list �Ǵ� Array List �� ����ص� �� ��.)
	5. Ȧ¦���� ������ ū ���� �ϳ��� ���� ���´�.
	6. �迭�� ���ڷ� �ٲ۴�.
	7. �� ���ڸ� ���Ѵ�.
	��.*/

}
