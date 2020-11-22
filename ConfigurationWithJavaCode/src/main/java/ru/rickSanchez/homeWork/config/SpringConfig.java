package ru.rickSanchez.homeWork.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

import ru.rickSanchez.homeWork.Music;
import ru.rickSanchez.homeWork.genres.ClassicalMusic;
import ru.rickSanchez.homeWork.Computer;
import ru.rickSanchez.homeWork.MusicPlayer;
import ru.rickSanchez.homeWork.genres.RapMusic;
import ru.rickSanchez.homeWork.genres.RockMusic;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(),rockMusic(),rapMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    Computer computer(){
        return new Computer(musicPlayer());
    }
}
