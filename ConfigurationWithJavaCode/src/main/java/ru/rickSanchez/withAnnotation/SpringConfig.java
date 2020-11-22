package ru.rickSanchez.withAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.rickSanchez")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    
}
