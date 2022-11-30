import java.util.function.Function;

public class FunctionMethod {

    public static void main(String args[]){
        Function<Integer,Integer> f = i->i*i;
        System.out.println("Square of 3 is:"+f.apply(3));
        System.out.println("Squae of 4 is:"+f.apply(4));
    }
}
