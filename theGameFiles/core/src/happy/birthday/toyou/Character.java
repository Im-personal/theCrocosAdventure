package happy.birthday.toyou;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Character {
    float x;
    float y;
    float w;
    float h;
    Animation walk;
    Texture stay;
    float xspeed;
    float yspeed;
    boolean walkingleft=false;
    boolean walkingright = false;
    static int[][] matrix;
    float gravitation = 1;
    boolean onFloor=false;
    public Character(Texture stay, Animation walk,int x, int y,int w,int h)
    {
        this.stay = stay;
        this.walk = walk;
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }

    public void setMatrix(int[][] matrix)
    {
        Character.matrix = matrix;
    }

    void update()
    {

        yspeed+=gravitation;
        if(xspeed>0)
        xspeed-=gravitation;
        if(xspeed<0)
            xspeed+=gravitation;
        if(notIntersectMatrix(x+xspeed,y)&&notIntersectMatrix(x+xspeed,y+h)&&notIntersectMatrix(x+xspeed+w,y)&&notIntersectMatrix(x+xspeed+w,y+h)&&notIntersectMatrix(x+xspeed,y+h/2f)&&notIntersectMatrix(x+xspeed+w,y+h/2f))
        x+=xspeed;
        if(notIntersectMatrix(x,y+yspeed+h)&&notIntersectMatrix(x+w,y+yspeed+h)&&notIntersectMatrix(x,y+yspeed)&&notIntersectMatrix(x+w,y+yspeed))
        {y+=yspeed; onFloor=false;}
        else
        {
            onFloor=true;
            yspeed=0;
        }
      //  System.out.println("!!");
        walk.update();
    }

    boolean notIntersectMatrix(float x, float y)
    {

        return !inBound((int)((x)/128),(int)((y)/128))||(matrix[(int)((y)/128)][(int)((x)/128)]==-1);
    }

    boolean inBound(int x, int y)
    {
        return (y>=0&&y<matrix.length)&&(x>=0&&x<matrix[y].length);
    }

    void setPosition(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

}
