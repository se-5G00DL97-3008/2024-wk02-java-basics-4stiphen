import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num1 = scanner.nextInt();

        System.out.println("Give a number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int minus = num1 - num2;
        int divide = num1 / num2;

        System.out.print(num1);
        System.out.print(" + ");
        System.out.print(num2);
        System.out.print(" = ");
        System.out.println(sum);

        System.out.print(num1);
        System.out.print(" - ");
        System.out.print(num2);
        System.out.print(" = ");
        System.out.println(minus);

        System.out.print(num1);
        System.out.print(" x ");
        System.out.print(num2);
        System.out.print(" = ");
        System.out.println(product);

        
        System.out.print(num1);
        System.out.print(" / ");
        System.out.print(num2);
        System.out.print(" = ");
        System.out.println(divide);
        
        
        

    }
}
