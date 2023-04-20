package happy.birthday.toyou;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Animation {
    Texture[] frames;
    int fps;
    float time = 0;
    public Animation(String folderpath, int len, int fps){
        frames = new Texture[len];
        for(int i = 0; i<frames.length;i++)
        {
            if(folderpath.contains("\\"))
                frames[i]=new Texture(folderpath+"\\frame"+i+".png");
            else
                frames[i]=new Texture(folderpath+"/frame"+i+".png");
        }
        this.fps = fps;
    }

    public Animation(String folderpath, int len, String framename, String typename,int fps){
        frames = new Texture[len];
        for(int i = 0; i<frames.length;i++)
        {
            if(folderpath.contains("\\"))
                frames[i]=new Texture(folderpath+"\\"+framename+i+typename);
            else
                frames[i]=new Texture(folderpath+"/"+framename+i+typename);
        }
        this.fps = fps;
    }

    public void update()
    {
        time+= Gdx.graphics.getDeltaTime();
    }

    public Texture getFrame()
    {
        int framenum = (int)(time*fps);
        return frames[(framenum-(frames.length*(int)(framenum/ frames.length)))];
    }

}
