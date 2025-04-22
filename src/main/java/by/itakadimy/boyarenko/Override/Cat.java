package by.itakadimy.boyarenko.Override;

public class Cat extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Кошка: Мяу!");
    }
}

