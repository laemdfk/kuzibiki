import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("くじ引きを行います。1~1000までの、好きな数字を入力してください");

        int i = scan.nextInt();
        int n = rand.nextInt(1000) + 1;

            System.out.println("あなたの選んだ数字は、" + i + " で、選ばれた数字は" + n + "でした");

            if(n < i) {
                System.out.println("あたりです");
            }

            else {
               System.out.println("残念、はずれです");

           }

        }
    }