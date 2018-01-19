package proxy.media_library;

/**
 * Created by s.pogorelov on 19.01.2018.
 */
public class Video {
    public String id;
    public String title;
    public String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
