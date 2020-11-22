package ru.rickSanchez.lesson_c;

import ru.rickSanchez.lesson_b.RapMusic;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
