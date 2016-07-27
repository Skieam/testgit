import java.util.Scanner;

class Yanghui{
	public void triggle(int h){	
	int L = 0;
	int[][] a = new int[L][L];
	int j = 0;
	int k = 0;
	
	for(j = 0; j < a.length;j++){
		a[0][j] = 1;
		a[j][j] = 1;
		}
	
	for(j = 2; j <= a.length-1; j++){
		for(k = 1; k <= j; k++){
		a[j][k] = a[j-1][k-1] + a[j-1][k];
			}
		}
	
	for(j = 0; j <= a.length-1; j++){
		for(k = 0; k <= j; k++){
			System.out.print(a[j][k]+"\t");
			}
		System.out.println();
		}
	}
}

class  yanghuitest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个行数：");
		int h = sc.nextInt();
		
		Yanghui yh = new Yanghui();
		yh.triggle(h);
	}
}