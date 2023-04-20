package happy.birthday.toyou;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Effect {
    boolean getSmaller;
    boolean moving;
    boolean destroy=false;
    float x,y,w,h;
    float dirx;
    float diry;
    float smalspeed;
    boolean texture=false;
    Texture img;
    Animation anim;
    float livetime = 5;
    float lifetime = 0;

    public Effect(Texture img, float x, float y, float w, float h){
        this.img = img;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        this.getSmaller = false;
        moving = false;
        texture=true;
    }

    public Effect(Animation anim, float x, float y, float w, float h){
        this.anim = anim;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        this.getSmaller = false;
        moving = false;
        texture=false;
    }

    public Effect(Texture img, float x, float y, float w, float h,float smalspeed){
        this.img = img;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.smalspeed = smalspeed;
        this.getSmaller = true;
        moving = false;
        texture=true;
    }

    public Effect(Texture img, float x, float y, float w, float h,float dirx,float diry){
        this.img = img;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirx=dirx;
        this.diry=diry;
        getSmaller = false;
        moving = true;
        texture=true;
    }

    public Effect(Texture img, float x, float y, float w, float h,float dirx,float diry,float smalspeed){
        this.img = img;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirx=dirx;
        this.diry=diry;
        this.smalspeed = smalspeed;
        getSmaller = true;
        moving = true;
        texture=true;
    }

    public Effect(Animation anim, float x, float y, float w, float h,float smalspeed){
        this.anim = anim;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.smalspeed = smalspeed;
        this.getSmaller = true;
        moving = false;
        texture=false;
    }

    public Effect(Animation anim, float x, float y, float w, float h,float dirx,float diry){
        this.anim = anim;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirx=dirx;
        this.diry=diry;
        getSmaller = false;
        moving = true;
        texture=false;
    }

    public Effect(Animation anim, float x, float y, float w, float h,float dirx,float diry,float smalspeed){
        this.anim = anim;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirx=dirx;
        this.diry=diry;
        this.smalspeed = smalspeed;
        getSmaller = true;
        moving = true;
        texture=true;
    }

    public void update()
    {
        if(!texture)
            anim.update();
       if(moving) {
           x += dirx;
           y += diry;
       }

       if(getSmaller)
       {
           x+=smalspeed;
           y+=smalspeed;
           w-=smalspeed*2;
           h-=smalspeed*2;
       }
       lifetime+= Gdx.graphics.getDeltaTime();
       if(lifetime>=livetime)destroy=true;
       if(h<=0||w<=0)destroy=true;

    }

    public void draw()
    {
        if(texture)
            drawSprite(img,x- Graph.eyeX,y- Graph.eyeY,w,h);
        else
            drawSprite(anim,x- Graph.eyeX,y- Graph.eyeY,w,h);

    }

    void drawSprite(Texture img, float x, float y,float w, float h){
        Graph.batch.draw(img, x* Graph.mnX, (720-y-h)* Graph.mnY,w* Graph.mnX,h* Graph.mnY);
    }

    void drawSprite(Animation img, float x, float y,float w, float h){
        Graph.batch.draw(img.getFrame(), x* Graph.mnX, (720-y-h)* Graph.mnY,w* Graph.mnX,h* Graph.mnY);
    }

}
