package facade.media_library;

import java.io.File;

/**
 * Created by s.pogorelov on 19.01.2018.
 */
public class AudioMixer {
    public static File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
