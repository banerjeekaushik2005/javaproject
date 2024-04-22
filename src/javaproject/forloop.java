package javaproject;

public class forloop {

	public static void main(String[] args) {
		double  sroot, rerr;
		for(int num = 1; num < 10.0; num++)
		{ sroot = Math.sqrt(num);
		System.out.println("Square root of " + num + " is " + sroot);
		// compute rounding error 
		rerr = num - (sroot * sroot);
		System.out.println("Rounding error is " + rerr);
		System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
