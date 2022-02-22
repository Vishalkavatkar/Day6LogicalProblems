package perfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check perfect number: ");//checking input from user
        int n = scanner.nextInt();
        scanner.close();
        int perfect = 0;
        for(int i = 1; i <= n/2; i++){ //checking 
            if(n%i == 0)
            {
                perfect = perfect + i;
            }
        }
        if(perfect == n)
        {
            System.out.println(n + " is a perfect number.");
        } else 
        {
            System.out.println(n + " is not a perfect number.");
        }

	}

}
