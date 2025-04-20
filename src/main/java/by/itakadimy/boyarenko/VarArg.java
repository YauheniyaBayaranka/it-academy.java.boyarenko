package by.itakadimy.boyarenko;

public class VarArg {
    public int calcSum(int... values) {
        int rs = 0;
        for (int i : values) {
            rs += i;
        }
        return rs;
    }
}
