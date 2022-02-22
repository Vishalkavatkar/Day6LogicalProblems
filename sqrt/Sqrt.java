package sqrt;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter non-negative number: ");
    	int c = scanner.nextInt();
    	sqrt(c);
    }

    public static void sqrt(int c) {
        double epsilon = 1e-15;
        double t = c;
        double root;
        while (true) {     
            root = 0.5 * (t + (c / t));
     
            if (Math.abs(root - t) < epsilon)
                break;
     
            t = root;
        }
        System.out.println("Root: " + root);

	}

}
