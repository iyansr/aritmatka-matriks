public class ArrayMultiDimensi{
	public static void main(String[] args){
		
		int[][] matriks = {
			{1, 0 ,4},
			{0, 2 ,1},
			{1, 2, 0}
		};
		
		
		String[][] nama = new String[3][3];
		
		
		nama[0][0] = "Leo";
		nama[0][1] = "Andres";
		nama[0][2] = "Thiago";
		
		nama[1][0] = "Rakitic";
		nama[1][1] = "Xavi";
		nama[1][2] = "Ronaldinho";
		
		nama[2][0] = "Suarez";
		nama[2][1] = "Coutinho";
		nama[2][2] = "Dembele";
		
		
		
		for(int i = 0; i < nama.length; i++){ //Baris
			for(int j = 0; j < nama[i].length; j++){ //Kolom
				System.out.print(nama[i][j] + "\t");
			}
			System.out.println();
		}
		
		

	}
}








