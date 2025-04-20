package by.itakadimy.boyarenko;

public class MainVarArg {
    public static void main(String[] arg) {
        VarArg testvarg = new VarArg();
        System.out.println(testvarg.calcSum());
        System.out.println(testvarg.calcSum(5));
        System.out.println(testvarg.calcSum(355, 666));
        System.out.println(testvarg.calcSum(777, 555, 333, 101, 909));
    }
}
