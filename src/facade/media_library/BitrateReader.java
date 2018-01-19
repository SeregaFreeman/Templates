package facade.media_library;

/**
 * Created by s.pogorelov on 19.01.2018.
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, ICodec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, ICodec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
