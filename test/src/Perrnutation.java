import java.util.Arrays;
import java.util.LinkedList;

public class Perrnutation {
	public static void main(String[] args) {

		Perrnutation p = new Perrnutation();

		/*숫자를 입력하는 곳*/
		int [] input={0,0,0};

		if(input.length>=2 && input.length<=18) {
			System.out.println("합은 " + p.solve(input) + " 입니다.");
		}else if(input.length < 2) {
			System.out.println("숫자의 개수가 2개 보다 많아야 합니다.");
		}else if(input.length > 18) {
			System.out.println("숫자의 개수가 18개보다 많습니다.");
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
			System.out.println("두 자연수가 만들어지지 않습니다.");
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
			System.out.println("두 자연수는 " + c + ", " + d + " 입니다.");
			sum = c+d;
		}
		return sum;		
	}

	/*작전.
	1. sort 한다.
	2. 0을 다른 배열에 담는다.
	3. 0을 제외한 수가 2개 이상 무조건 필요.(없으면 -1)
	4. 2개 쓰고 뒤에다가 0의 배열을 포함해서 다시 소트.(배열 추가해도 됨 linked list 또는 Array List 를 사용해도 될 듯.)
	5. 홀짝으로 나눠서 큰 수를 하나씩 나눠 갖는다.
	6. 배열을 숫자로 바꾼다.
	7. 두 숫자를 더한다.
	끝.*/

}
