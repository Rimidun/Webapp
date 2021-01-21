package webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music;

    @Autowired
    @Qualifier("rockMusic")
    public void setMusic(Music music) {
        this.music = music;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;


//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    public void playMusic() {

        System.out.println("Playing: " + music.getSong());
        //System.out.println("Playing: " + rockMusic.getSong());
    }
}