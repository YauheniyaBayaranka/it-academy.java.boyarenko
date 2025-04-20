package by.itakadimy.boyarenko;

public class MainVarArg {
    public static void main(String[] arg) {
        VarArg tstvarg = new VarArg();
        System.out.println(tstvarg.calcSum());
        System.out.println(tstvarg.calcSum(3));
        System.out.println(tstvarg.calcSum(55, 66));
        System.out.println(tstvarg.calcSum(77, 55, 33, 11, 99));
    }
}
