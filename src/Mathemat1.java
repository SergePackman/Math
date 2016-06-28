import java.math.*;

public class Mathemat1 {
    private static double dd;
    private double xx, yy;

    public Mathemat1(Double xxx, Double yyy){
        xx = xxx;
        yy = yyy;
        dd = (Math.pow(xx,4))-Math.sqrt((6*xx)-(Math.pow(yy,3)));
    }

    public static double getRes(){
        return dd;
    }
}
