import java.util.Scanner;

public class Main {

    private int a;
    private int b;

    private void swapByValues(int aTemp, int bTemp) {
        int temp;
        temp = aTemp;
        aTemp = bTemp;
        bTemp = temp;
    }

    private void swapByReference(Main objTemp) {

        objTemp.a = objTemp.a + objTemp.b;
        objTemp.b = objTemp.a - objTemp.b;
        objTemp.a = objTemp.a - objTemp.b;

    }

    public static void main(String[] args) {
	// write your code here
        Scanner cin = new Scanner(System.in);

        Main obj = new Main();

        int aUser = cin.nextInt();
        int bUser = cin.nextInt();

        obj.a = aUser;
        obj.b = bUser;

        obj.swapByValues(aUser, bUser);

        System.out.println("A: " + obj.a + " B: " + obj.b);

        obj.swapByReference(obj);

        System.out.println("A: " + obj.a + " B: " + obj.b);

    }
}
