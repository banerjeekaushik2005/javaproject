package javaproject;

public class test {

	public static void main(String[] args) 
		throws java.io.IOException {
			int i;

			System.out.println("Press S to stop.");

			for(i = 0; (char) System.in.read() != 'S'; i++) 
				System.out.println("Pass #" + i);
			}
		// TODO Auto-generated method stub

	}


