import animals.Puppy;
import utils.ArrayUtils;
import utils.Math;

public class Driver {

    public static void main(String [] s){
        Puppy p1 = new Puppy("Joey");
        Puppy p2 = new Puppy("Chandler");
        Puppy p3 = new Puppy("Ross");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());

        int []array = {9, 20, 3, 44, 88, 300};
        ArrayUtils.reverse(array);

        System.out.println(ArrayUtils.stringifyArray(array));

        double n = 15.4;
        System.out.println(Math.factorial((int) n));
        System.out.println(Math.factorialLoop((int) n));
    }
}
