package by.itakadimy.boyarenko.Override;

public class Dog extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Собака: Гав-Гав!");
    }
}
