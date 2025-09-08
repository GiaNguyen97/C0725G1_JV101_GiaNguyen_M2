package ss2_loop_statement_java.bai_tap;

    import java.util.Scanner;

    public class PrintPrime {
        public static void main(String[] args) {
            System.out.println("Nhập số lượng số nguyên tố cần in ra");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            int count = 0;
            int prime = 2;
            while (count < number) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(prime); i++) {
                    if (prime % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(prime + " ");
                    count++;
                }
                prime++;
            }
        }
    }
