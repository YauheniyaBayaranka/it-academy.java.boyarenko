package by.itakadimy.boyarenko;

public class VarArg {
    public int calcSum(int... values) {
        int res = 0;
        for (int x : values) {
            res += x;
        }
        return res;
    }
}
