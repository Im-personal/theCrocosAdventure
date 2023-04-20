package happy.birthday.toyou;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Arrays;

public class Dialog {
    String[] text;
    int x,y,w,h;
    int startW,startH;
    int endW,endH;
    int tps;
    float time;
    boolean skippable;
    boolean isOpened = false;
    Animation dialwin;
    BitmapFont font;
    int linenum = 0;
    boolean nowin = false;
    public Dialog(String[] text, int x, int y, int w, int h, Animation dialwin, BitmapFont font)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.text = text;
        startW=w;
        startH=h;
        time = 0;
        skippable = true;
        tps = 20;
        this.dialwin=dialwin;
        this.font = font;
    }


    public Dialog(String[] text, int x, int y, int w, int h, Animation dialwin, BitmapFont font,int tps)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.text = text;
        startW=w;
        startH=h;
        time = 0;
        skippable = true;
        this.tps = tps;
        this.dialwin=dialwin;
        this.font = font;
    }

    public Dialog(String[] text,int x, int y,BitmapFont font)
    {
        this.text = text;
        this.x = x;
        this.y = y;
        time = 0;
        skippable = true;
        tps = 20;
        this.font = font;
        nowin = true;
    }

    public Dialog(String[] text,int x, int y,BitmapFont font, int tps)
    {
        this.text = text;
        this.x = x;
        this.y = y;
        time = 0;
        skippable = true;
        this.tps = tps;
        this.font = font;
        nowin = true;
    }

    public void update()
    {
        time+= Gdx.graphics.getDeltaTime();
        if(!nowin)dialwin.update();
    }

    public int countChars(String str, char target)
    {
        int n = 0;
        char[] arr = str.toCharArray();
        for(int i = 0; i<str.length();i++)
            n+=(arr[i]==target?1:0);
        return n;
    }

    public String[] getText()
    {
        String[] res= new String[countChars(text[linenum],'\n')+1];
        char[] arr = text[linenum].toCharArray();
        Arrays.fill(res, "");
        int lnnum = 0;
        for(int i = 0; (i<(time*tps))&&i<arr.length;i++) {
            res[lnnum] += arr[i];
            if(arr[i]=='\n')lnnum++;
        }
        return res;
    }

    public void draw(SpriteBatch b, int dist, int shiftX, int shiftY)
    {
        if(isOpened) {
            if(!nowin)b.draw(dialwin.getFrame(), x*Graph.mnX, (720-y-h)*Graph.mnY, w*Graph.mnX, h*Graph.mnY);

            String[] arr = getText();

            for(int i = 0; i<arr.length;i++)
            {
                font.draw(b,arr[i],(x+shiftX)*Graph.mnX,(720-y-dist*i-shiftY)*Graph.mnY+Graph.shakescreen);
            }


        }
    }

    public void open()
    {
        isOpened = true;
        linenum=0;
        time = 0;

    }

    public  void close()
    {
        isOpened = false;
    }

}
