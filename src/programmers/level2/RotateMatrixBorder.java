package programmers.level2;

// https://programmers.co.kr/learn/courses/30/lessons/77485?language=java
public class RotateMatrixBorder {

	public int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];

		int[][] matrix = new int[rows][columns];
		int initCount = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = initCount++;
			}
		}

		for(int run=0; run<queries.length ;run++){ 
			int []rotate = queries[run];
			int top = rotate[0]-1;
			int left = rotate[1]-1;
			int bottom = rotate[2]-1;
			int right = rotate[3]-1;
			
			int last = matrix[top][right];
			int min = last;
			
			//top 회전
			for(int row=right ; row>left ;row--) {
				matrix[top][row] = matrix[top][row-1];
				if(matrix[top][row] < min) 
					min = matrix[top][row];
			}
			//left 회전
			for(int col=top ; col<bottom ; col++){
				matrix[col][left] = matrix[col+1][left];
				if(matrix[col][left] < min) 
					min = matrix[col][left];
			}
			//bottom 회전
			for(int row=left ; row<right ;row++ ) {
				matrix[bottom][row] = matrix[bottom][row+1];
				if(matrix[bottom][row] < min) 
					min = matrix[bottom][row];
			}
			//right 회전
			for(int col=bottom ; col>top ; col--) {
				matrix[col][right] = matrix[col-1][right];
				if(matrix[col][right] < min) 
					min = matrix[col][right];
			}
			
			matrix[top+1][right] = last;
			answer[run] = min;
			
		}
		return answer;

	}
	
}


