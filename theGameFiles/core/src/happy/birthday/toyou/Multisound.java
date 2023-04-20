package happy.birthday.toyou;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class Multisound {

    Music[] arr;

    public Multisound(String start, String end, int len)
    {
        arr = new Music[len];
        for(int i = 0; i<len;i++)
            arr[i] = Gdx.audio.newMusic(Gdx.files.internal(start+i+end));
    }


    boolean isPlaying()
    {
        for (Music music : arr)
            if (music.isPlaying())
                return true;
        return false;
    }

    void play()
    {
        arr[(int)(Math.random()*arr.length)].play();
    }

    void dispose()
    {
        for(Music m:arr)m.dispose();
    }

}
