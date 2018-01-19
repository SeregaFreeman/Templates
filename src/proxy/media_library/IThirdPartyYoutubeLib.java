package proxy.media_library;

import java.util.HashMap;

public interface IThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
