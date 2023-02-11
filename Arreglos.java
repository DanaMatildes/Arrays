package arreglos;

public class Arreglos {
	
	int i, r;
	int arrayNumeros[] = new int[15];
	String nombres[] = new String[20];
	
	
	public void mostrarArreglo(int[]arregloDeNum) {
		for(i=0; i<arregloDeNum.length; i++) {
			System.out.println(i);
		}
	}
	public Arreglos(String[] nombres) {
		nombres[0]="Francisco";
	}
	
	
	
	public void mostrarArregloSt(String[]arreglo) {
		for(int i = 0; i <arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
	
	public void buscarValorInt(int[]arreglo, int n) {
		int sigue=0;
		for(i=0; i<arreglo.length; i++) {
			if(arreglo[i] == n) {
				System.out.println("El valor está en la posicion " + i);
				break;
			}
			else {
				sigue++;
				if(sigue == arreglo.length) {
					System.out.println("No se encontro el valor.");
				}
		}
	}
	}
	public void buscarValorString(String[]arreglo, String k) {
		int sigue = 0;
		for(int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] == k) {
				System.out.println("El valor está en la posicion " + i);
				break;
			}
			
			else {
				sigue++;
				if(sigue == arreglo.length) {
					System.out.println("No se encontro el valor.");
				}
			}
		}
	}
	
	
	public void buscarEliminarValorInt(int[]arreglo, int p) {
		for(i=0; i<arreglo.length; i++) {
			if(arreglo[i] == p) {
				for(r=i; r<arreglo.length; r++) {
					arreglo[i]=r;
				}
			}
		}
	}
	}

