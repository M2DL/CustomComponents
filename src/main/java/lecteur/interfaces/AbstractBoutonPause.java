package lecteur.interfaces;

/**
 * Created by seb on 10/02/17.
 */
public abstract class AbstractBoutonPause {

    IPlayVideo playVideo;

    protected void methodeRequise1() {
        this.playVideo.playVideo();
    }

    public void setPauseVideo(IPlayVideo playVideo) {
        this.playVideo = playVideo;
    }
}
