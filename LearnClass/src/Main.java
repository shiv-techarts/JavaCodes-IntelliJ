import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0;

        Scanner cin = new Scanner(System.in);

        Gunda gundaArr[] = new Gunda[5];

        Gunda obj;
        obj = new Gunda();

        for (i = 0; i < 5; i++) {
            gundaArr[i] = new Gunda();
        }

        i = 0;

        while(i < 5) {
            System.out.println("Enter the name of Gunda Movie");
            gundaArr[i].setNameOfMovie(cin.next());
            System.out.println("Enter the name of Gunda");
            gundaArr[i].setNameOfGunda(cin.next());
            i++;
        }

        for (i = 0; i < 5; i++) {
            System.out.println("Movie Name: " + gundaArr[i].getNameOfMovie() + " Name of Gundaaaaahhhhh: " + gundaArr[i].getNameOfGunda());
        }
    }
}
