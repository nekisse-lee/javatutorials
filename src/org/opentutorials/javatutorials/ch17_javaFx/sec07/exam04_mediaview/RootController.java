package org.opentutorials.javatutorials.ch17_javaFx.sec07.exam04_mediaview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Nekisse_lee on 2017. 7. 22..
 */
public class RootController implements Initializable {
    @FXML private MediaView mediaView;
    @FXML private ImageView imageView;
    @FXML private Button btnPlay;
    @FXML private Button btnPause;
    @FXML private Button btnStop;

    private boolean endOfMedia;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Media media = new Media(getClass().getResource("media/video.m4v").toString());
        Media media = new Media(getClass().getResource("media/audio.wav").toString());

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

        mediaPlayer.setOnReady(new Runnable() {
            @Override
            public void run() {
                btnPlay.setDisable(false);
                btnPause.setDisable(true);
                btnStop.setDisable(true);
            }
        });

        mediaPlayer.setOnPlaying(() -> {
            btnPlay.setDisable(true);
            btnPause.setDisable(false);
            btnStop.setDisable(false);
        });

        mediaPlayer.setOnPaused(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);
        });

        mediaPlayer.setOnStopped(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);
        });

        mediaPlayer.setOnEndOfMedia(() -> {
            endOfMedia = true;
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);
        });


        btnPlay.setOnAction(event -> {
            if (endOfMedia == true){
                mediaPlayer.stop();
                mediaPlayer.seek(mediaPlayer.getStartTime());
            }
            mediaPlayer.play();
            endOfMedia = false;
        });

        btnPause.setOnAction(event -> {
            mediaPlayer.pause();
        });
        btnStop.setOnAction(event -> {
            mediaPlayer.stop();
        });
    }



}

