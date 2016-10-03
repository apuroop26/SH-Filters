package se.example2.softhouse;
import java.applet.*;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.net.URL;

/**
 * Created by rohithvajhala on 30-09-2016.
 */
public class AppletAppln extends Applet implements ActionListener {
    Button play,stop;
    AudioClip audioClip;
    public void init(){
        play = new Button("  Play ");
        add(play);
        play.addActionListener(this);
        stop = new Button("  Stop  ");
        add(stop);
        stop.addActionListener(this);
        audioClip = getAudioClip(getCodeBase(), "Sound.wav");
    }
    public void actionPerformed(ActionEvent ae){
        Button source = (Button)ae.getSource();
        if (source.getLabel() == "  Play "){
            audioClip.play();
        }
        else if(source.getLabel() == "  Stop  "){
            audioClip.stop();
        }
    }
}