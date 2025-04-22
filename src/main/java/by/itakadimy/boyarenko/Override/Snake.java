package by.itakadimy.boyarenko.Override;

public class Snake extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Змея: ШШшшшшшш!!!");
    }
}
