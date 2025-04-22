package by.itakadimy.boyarenko.Override;

public class Bear extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Медведь : Р-р-р!");
    }
}
