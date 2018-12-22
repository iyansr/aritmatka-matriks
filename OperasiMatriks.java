
import java.util.Scanner;

public class OperasiMatriks{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah elemen matriks n x n : ");
		int n = input.nextInt();
		
		int[][] matriksA = new int[n][n];
		int[][] matriksB = new int[n][n];
		int[][] matriksHasil = new int[n][n];
		
		//Input nilai Matriks A
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n ; j++){
				System.out.print("Masukan nilai matriks A ["+ i +"]["+ j +"] : ");
				matriksA[i][j] = input.nextInt();
			}
		}
		
		System.out.println("\n-------------------- \n");
		
		//Input nilai Matriks B
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n ; j++){
				System.out.print("Masukan nilai matriks B ["+ i +"]["+ j +"] : ");
				matriksB[i][j] = input.nextInt();
			}
		}
		
		System.out.println("\nHasil Penjumlahan matriks A dan B : \n");
		
		//Operasi Penjumlahan 
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n ; j++){
				matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j];
				System.out.print(matriksHasil[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("\nHasil Pengurangan matriks A dan B : \n");
		//Operasi Pengurangan 
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < n ; j++){
				matriksHasil[i][j] = matriksA[i][j] - matriksB[i][j];
				System.out.print(matriksHasil[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}


