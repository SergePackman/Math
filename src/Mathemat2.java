import java.math.*;
// задание e

public class Mathemat2 {
    private static double dd;
    private double xx, yy;

    public Mathemat2(Double xxx, Double yyy){
        xx = xxx;
        yy = yyy;
        dd = 1/(yyy-(1/(Math.pow((xxx - 2),yyy))));
    }

    public static double getRes(){
        return dd;
    }
}
