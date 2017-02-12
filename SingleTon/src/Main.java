public class Main {

    public static void main(String[] args) {

        //Singleton obj = new Singleton();

        //System.out.println();

        Singleton obj1 = Singleton.getInstance("B");
        Singleton obj2 = Singleton.getInstance("A");

        if(obj2 == null) {
            System.out.println("Object is Null");
        }

//        Singleton obj3 = Singleton.getInstance();
//        Singleton obj4 = Singleton.getInstance();



    }
}
