public class ExcelTest1 {

	public static void main(String args[]){

		//���� �Է¹޴� ��.
		int input = 167;
		
		ExcelTest1 rs = new ExcelTest1();

		System.out.println(input + "�� ���� : " + rs.result(input) + "�Դϴ�.");

	}

	public StringBuilder result(int input){

		StringBuilder resultAlpha = new StringBuilder();

		boolean flag = true;
		
		while(flag){
			if(input>=26){
//				System.out.println(input%26 + " : "+ getAlpabetFromInt(input%26));
				resultAlpha.insert(0, getAlpabetFromInt(input%26));				
			} else if(input<26) {
//				System.out.println(input%26 + " : "+ getAlpabetFromInt(input%26));
				resultAlpha.insert(0, getAlpabetFromInt(input%26));
				flag=false;
			}
			input = input/26;
		}
		return resultAlpha;
	}

	public static String getAlpabetFromInt(int i) { 
		int ascii = (int)'A' + i-1; 
		char[] retAlpha = { (char) ascii }; 
		return new String(retAlpha); 
	} 

}
