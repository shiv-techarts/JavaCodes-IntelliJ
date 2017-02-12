/**
 * Created by shiv on 8/12/16.
 */
public class Singleton {

    private static int _count;

    private Singleton(String name) {
        //System.out.println("ctor called!...." + this.toString() + " " + name);
        this._count++;
   }

    public static Singleton getInstance(String name) {
        if(_count == 0)
            return (new Singleton(name));
        else
            return null;
    }


    //Methods.....

}
