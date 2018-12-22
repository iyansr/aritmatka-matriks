
import java.util.Scanner;

public class PerkalianMatriks {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int b1, k1, b2, k2, sum = 0;

    System.out.print("Masukkan jumlah baris matriks A : ");
    b1 = input.nextInt();
    System.out.print("Masukkan jumlah kolom matriks A : ");
    k1 = input.nextInt();

    int[][] matriksA = new int[b1][k1];

    for(int i = 0; i < b1; i++){ //Baris
      for(int j = 0; j < k1; j++){ //Kolom
       System.out.print("Masukkan elemen matriks A index ke - ["+ i +"]["+ j +"] : ");
       matriksA[i][j] = input.nextInt();
      }
    }
	

    System.out.println("\n---------------------------\n");

    System.out.print("Masukkan jumlah baris matriks B : ");
    b2 = input.nextInt();
    System.out.print("Masukkan jumlah kolom matriks B : ");
    k2 = input.nextInt();

    
    if(k1 != b2){
      System.out.println("Operasi perkalian tidak bisa dilakukan. Syarat : Kolom matriks A = Baris Matriks B ");
    }else{
      
      int[][] matriksB = new int[b2][k2];
      int[][] matriksHasil = new int[b1][k2];

      for(int i = 0; i < b2; i++){ //Baris
        for(int j = 0; j < k2; j++){ //Kolom
         System.out.print("Masukkan elemen matriks B index ke - ["+ i +"]["+ j +"] : ");
         matriksB[i][j] = input.nextInt();
        }
      }
	  

      //Operasi Perkalian
      for(int i = 0; i < b1 ; i++){
        for(int j = 0; j < k2; j++){
          for(int k = 0; k < b2; k++){
            sum += matriksA[i][k] * matriksB[k][j]; 
          }
          matriksHasil[i][j] = sum;
          sum = 0;
        }
      }

      //Matriks Hasil Perkalian 
      System.out.println("\nHasil Perkalian Matriks A * Matriks B\n");
  
      for(int i = 0; i < b1; i++){ //Baris
        for(int j = 0; j < k2; j++){ //Kolom
         System.out.print(matriksHasil[i][j] + " ");
        }
        System.out.println();
      }

    } //Else
    
  }
}