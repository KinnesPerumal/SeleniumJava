package learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _24_LearnExceptionHandeling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num:");
		try {
			int num = sc.nextInt();
			int a = num%0;
			System.out.println(a);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Divisible by 0 not possible");
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("Input must be Number");
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("Unknow error");
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}finally {
			sc.close();
		}
		
		
		System.out.println("Completed");
	}

}
