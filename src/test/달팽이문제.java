package test;

public class 달팽이문제 {


	public static void main(String[] args) {
		
		int n = 7;
		int [][] snail = new int[n][n];
		int row = 0;
		int col = -1;
		
		// row 고정 col 증가 > row 증가 col 고정 > row 고정 col감소 > row 감소 col 고정
		int dir = 0;
		
		int distance = n;
		for( int count = 1; count <= n*n ;){
			if(dir==0) {
				for(int i=0; i<distance && snail[row][col+1] == 0  ; i++) {
					snail[row][++col]=count++;
				}
				distance -= 1;
			}
			
			else if(dir==1) {
				for(int i=0; i<distance && snail[row+1][col] == 0  ; i++) {
					snail[++row][col]=count++;
				}
			}
			
			else if(dir==2) {
				for(int i=0; i<distance && snail[row][col-1] == 0  ; i++) {
					snail[row][--col]=count++;
				}
				distance -= 1;
			}
			
			else{
				for(int i=0; i<distance && snail[row-1][col] == 0  ; i++) {
					snail[--row][col]=count++;
				}
			}
			
			dir = (dir+1)%4;
		}
		
		
		for(int[] r : snail) {
			for(int num : r) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}

	}

}
