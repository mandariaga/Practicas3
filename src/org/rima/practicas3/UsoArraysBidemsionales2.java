package org.rima.practicas3;

public class UsoArraysBidemsionales2 {

	public static void main(String[] args) {
		// USO DEL FOR EACH
		
		int [][] matrix={
				{15,25,35,45,55},
				{16,26,36,46,56},
				{17,27,37,47,57},
				{18,28,38,48,58}
		};
		
		for(int[] fila:matrix){
			System.out.println();
			
			for(int z:fila){
				System.out.print(z+" ");
			}
		}

	}

}
