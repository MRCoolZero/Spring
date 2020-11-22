package ru.rickSanchez.homeWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.rickSanchez.homeWork.config.SpringConfig;
import ru.rickSanchez.homeWork.genres.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());


        context.close();
    }
}
