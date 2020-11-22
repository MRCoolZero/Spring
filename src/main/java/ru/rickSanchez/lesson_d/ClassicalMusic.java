package ru.rickSanchez.lesson_d;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my distraction");
    }

    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
