public class DemoArray{
	public static void main(String[] xx){
		int nilai[] = new int[5];
		nilai[0] = 1;
		nilai[1] = 9;
		nilai[4] = 3;
		
		for(int i=0;i<nilai.length;i++){
			System.out.println("Index ke-"+i+" isinya "+nilai[i]);
		}
		
		//array 2 dimensi
		int[][] perkalian = new int[5][5];
		
		//mengisi data
		for(int a=0;a<5;a++){
			for(int b=0;b<5;b++){
				perkalian[a][b]=a*b;
			}
		}

		//menampilkan data
		System.out.println("=============================");		
		for(int a=0;a<5;a++){
			System.out.print(a+" | \t");
			for(int b=0;b<5;b++){
				System.out.print(perkalian[a][b]+" \t");
			}
			System.out.println("");
		}
	}
}
