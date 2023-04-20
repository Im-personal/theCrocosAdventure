package happy.birthday.toyou;

import com.badlogic.gdx.graphics.Texture;

public class Button {
    private int x,y,w,h,depth=0;
    private Texture img;
    public Button(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }

    public Button(Texture img, int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.img = img;
    }

    public Button(int x, int y, int w, int h,int depth)
    {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.depth = depth;
    }

    public Button(Texture img, int x, int y, int w, int h,int depth)
    {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.img = img;
        this.depth = depth;
    }


    public boolean isPushed()
    {
        if(Mistener.onScreen)
        {
            if(Mistener.tx>=x*Graph.mnX&&Mistener.tx<=(x+w)*Graph.mnX)
            if(Mistener.ty>=y*Graph.mnY&&Mistener.ty<=(y+h)*Graph.mnY)
                return true;
        }
        return false;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getW()
    {
        return w;
    }

    public int getH()
    {
        return h;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setW(int w)
    {
        this.w = w;
    }

    public void setH(int h)
    {
        this.h = h;
    }

    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setWH(int w, int h)
    {
        this.w = w;
        this.h = h;
    }

    public void setTexture(Texture txtr)
    {
        img = txtr;
    }

    public void setDepth(int depth)
    {
        this.depth = depth;
    }

    public int getDepth()
    {
        return depth;
    }

    public Texture getTexture()
    {
        return img;
    }
}
