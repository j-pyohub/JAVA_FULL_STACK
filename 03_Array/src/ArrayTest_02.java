/* 표수정
 * 점수 입력(0~100점): 1등 1명, 2등 2명, 3등 5명 정의
 * 점수의 총점과 평균 확인*/
public class ArrayTest_02 {
	public static void main(String[] args) {
		//입력 - database
		int [][] scores = new int[3][];
		scores[0] = new int [1];
		scores[1] = new int [2];
		scores[2] = new int [5];
		
		scores[0][0] = 100;
		
		scores[1][0] = 90;
		scores[1][1] = 89;
		
		scores[2][0] = 70;
		scores[2][1] = 60;
		scores[2][2] = 50;
		scores[2][3] = 40;
		scores[2][4] = 30;
	
		//처리
		int totalSum = 0;
		int student = 0;

		for (int i = 0; i < scores.length; i++){
			for (int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
				student++;
			}
		}
		float totalAverage = (float) totalSum / student;
		String output = ("총점: " + totalSum + ", 평균: " + totalAverage);
		
		//출력
		System.out.println(output);		
	}
}
