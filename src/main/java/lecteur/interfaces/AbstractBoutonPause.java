package lecteur.interfaces;

import lecteur.interfaces.IPlayVideo;

/**
 * Created by seb on 10/02/17.
 */
public class AbstractBoutonPause {

    IPlayVideo playVideo;

    protected void methodeRequise1() {
        this.playVideo.playVideo();
    }
}
