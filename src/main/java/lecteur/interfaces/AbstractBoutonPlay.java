package lecteur.interfaces;

/**
 * Created by seb on 10/02/17.
 */
public abstract class AbstractBoutonPlay {

    IPauseVideo pauseVideo;

    protected void methodeRequise1() {
        this.pauseVideo.pauseVideo();
    }

    public void setPauseVideo(IPauseVideo pauseVideo) {
        this.pauseVideo = pauseVideo;
    }
}
