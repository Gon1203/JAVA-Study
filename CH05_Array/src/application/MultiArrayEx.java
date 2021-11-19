package application;

public class MultiArrayEx {

	public static void main(String[] args) {
		// 이중 배열 예제
		int[][] value = {
				{1,5,7},
				{9,6,3,10},
				{2,4,6}
		};
		int total =0;
		for(int i = 0; i < value.length;i++) {
			for(int j = 0; j < value[i].length; j++) {
				total += value[i][j];
			}
		}
		
		System.out.println("총합은 : "+ total);
	}

}
