package sec3;

public class ScoreProc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"길정훈","김동협","김성민","김태균","신길호"};
		int[][] scores = {{90,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int[] tot = {0,0,0};	//과목별 총점
		float[] avg = {0.0f, 0.0f, 0.0f};	//과목별 평균
		int total = 0;	//전체 총점
		float average = 0.0f;	//전체 평균
		int[] hap = {0,0,0,0,0};
		float[] pyo = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
		int[] rank = {1,1,1,1,1};
		String[] hak = {"","","","",""};
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
			for(int j=0;j<scores[j].length;j++) {
				System.out.print(scores[i][j]+"\t");
				tot[j]+=scores[i][j];
				total+=scores[i][j];
				hap[i]+=scores[i][j];
			}
			System.out.println("");
		}
	}

}