package happy.birthday.toyou;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Sound;

public class Mistener implements InputProcessor {
    static int tx=0,ty=0,ux=0,uy=0,dx=0,dy=0,mx=0,my=0;
    static int[] txa=new int[10];
    static int[] tya=new int[10];
    static int[] uxa=new int[10];
    static int[] uya=new int[10];
    static boolean onScreen = false;
    static boolean[] onScreena = new boolean[10];

    @Override
    public boolean keyDown(int keycode) {

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        if(character=='\n'){
            if(Graph.typetext.length()!=0) {
                Graph.messages.add(0,new Graph.message(Graph.amogus[3], Graph.typetext));
                Graph.amongus_pop.play();
            }
            Graph.typetext="";
        }else if(character==8) {
            String str="";
            for(int i = 0; i<Graph.typetext.length()-1;i++)str+=Graph.typetext.toCharArray()[i];
            Graph.typetext=str;
        }else
            if(Graph.typetext.length()<100)
            Graph.typetext+=character;



        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        tx = screenX;
        ty = screenY;
        //System.out.println(pointer);
       txa[pointer] = screenX;
       tya[pointer] = screenY;
       onScreena[pointer] = true;

        onScreen = true;




        if(Graph.up.isPushed()&&Graph.croco.onFloor&&Graph.up_got) {
            Graph.croco.yspeed -= 25;
            Graph.croco.onFloor=false;
        }

        if(Graph.respawn.isPushed()&&Graph.minecrafthp<=0)Graph.mineclick.play();

        if(Graph.scene==6)
        {
            if(Graph.act==0)
            {
                if(Graph.keeperbutton.isPushed())
                    Graph.act++;

            }
        }

        if(Graph.scene==7)
        {
            if(Graph.act==5)
            {
                if(Graph.crocostats.isPushed())
                {
                    Graph.deltaclick.play();
                    Graph.act++;
                }
            }
            if(Graph.act==6)
            {
                if(Graph.dindstats.isPushed())
                {
                    Graph.deltaclick.play();
                    Graph.act++;
                }
            }
        }


        if(Graph.scene==8)
        {
            if(Graph.chatisopen) {
                if (Graph.btn_textfield.isPushed()) {
                    if (Graph.btn_sendmessage.isPushed()) {
                        if (Graph.typetext.length() != 0) {
                            Graph.messages.add(new Graph.message(Graph.amogus[3], Graph.typetext));
                            Graph.typetext="";
                            Graph.amongus_pop.play();
                        }
                    } else {
                        Gdx.input.setOnscreenKeyboardVisible(true);
                    }
                } else {
                    Gdx.input.setOnscreenKeyboardVisible(false);
                }


            }else{
                if(Graph.amogus[3].voted==-1)
                for(Graph.amogususer a: Graph.amogus)
                {
                    if(a.isPushed()){
                        for(Graph.amogususer b: Graph.amogus)
                            b.selected=false;
                        a.selected=true;
                    }
                }

                if(Graph.btn_vote.isPushed())
                {
                    for(int i = 0; i<Graph.amogus.length; i++) {
                        if (Graph.amogus[i].selected) {
                            Graph.amogus[3].voted = i;
                            Graph.amogus[i].votes.add(Graph.amogus[3]);
                            break;
                        }
                    }
                    for(Graph.amogususer b: Graph.amogus)
                        b.selected=false;

                        Graph.votelock.play();
                }
                if(Graph.btn_reject.isPushed())
                    for(Graph.amogususer a: Graph.amogus)a.selected=false;
            }

            if (Graph.btn_chat.isPushed()) {
                Graph.chatisopen = !Graph.chatisopen;
            }
        }


        if(Graph.scene==3)
        {
            if(Graph.Z.isPushed())
            if(Graph.characterInRange(Graph.croco,5390-Graph.croco.w,800,5390+107,1116)&&Graph.pullernum==1)
            {

                Graph.pullernum++;
                Graph.shakescreen=500;
                for(int i = 0; i<=17;i++)
                    Graph.worldMatrixBG[i][30]='B'-'0'-1;
                for(int i = 0; i<=17;i++)
                    Graph.worldMatrixBG[i][31]='B'-'0'-1;
                Graph.worldMatrix[6][35]=0;
                Graph.worldMatrix[4][37]=0;
                Graph.worldMatrix[2][34]=0;
                Graph.worldMatrix[2][35]=0;
                Graph.worldMatrix[1][33]=0;
                Graph.doorboom.play();
            }

            if(Graph.Z.isPushed())
            {
                if(  Graph.characterInRange(  Graph.croco,2893+128*3,2130,3055+128*3,2150))
                    if(Graph.worldMatrixBG[16][26]=='8'-'0'-1)
                    Graph.changeScene(12);
            }

        }

        if(Graph.x_got&&Graph.X.isPushed()&&Graph.act<12)
        {
            Graph.blockcontrol=true;
            Graph.sound_crocoattack.play();
            Graph.crocoattack.setPosition(0);

            if(Graph.scene==11)
            {
                for(int i = 0; i<Graph.cars.length;i++)
                if(Graph.characterInRange(Graph.croco,3231+i*3000,514,3231+i*3000+801,605))

                    if(!Graph.cars[i].destroyed)
                    {
                        Graph.cars[i].destroyed=true;
                        Graph.sound_deltaruneexplosion.play();
                    }

            }

            if(Graph.scene==3)
            {
                if(  Graph.characterInRange(  Graph.croco,2893+128*3,2130,3055+128*3,2150))
                {
                    Graph.worldMatrixBG[16][26]='8'-'0'-1;
                    Graph.glassbreak.play();
                }
            }
        }


        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {

        if(Graph.scene==12)
        {
            if(Graph.act==2)
                if(Graph.win.isPushed()) {
                    Graph.act=3;
                    Graph.win.setDepth(0);
                }

            if(Graph.act==3)
            {
                if(Graph.finalButton.isPushed()) {
                    Graph.changeScene();
                    Graph.act = 0;
                }
            }
        }


        if(Graph.scene==3)
        {
            if(!(Graph.thereisdind||Graph.up_got))
            if(Graph.characterInRange(Graph.croco,1346+128*3,2130,1516+128*3,2150))
                if(Graph.Z.isPushed()&&Graph.z_got)
                    Graph.changeScene(6);

                if(Graph.thereisdind) {
                    if (Graph.characterInRange(Graph.croco, 4144, 2130, 5086, 2150))
                        if (Graph.Z.isPushed()&&Graph.z_got) {
                            if (Graph.act == 0) Graph.act++;
                        }
                    if(Graph.characterInRange(Graph.croco,4705,2130,5086,2150))
                        if (Graph.Z.isPushed()&&Graph.z_got) {
                            if (Graph.act == 3) Graph.act++;
                        }
                }

                if(Graph.act==0) {
                    if(!Graph.c_got)
                    if (Graph.characterInRange(Graph.croco, 2162, 300, 2396, 610)&&(Graph.Z.isPushed()&&Graph.z_got)) {
                        Graph.act = 5;
                    }
                }

        }



        if(Graph.minecrafthp<=0&&Graph.scene==4)
        if(Graph.respawn.isPushed())
        {
            Graph.minecrafthp=10;
            Graph.speedrun = true;
            Graph.croco.setPosition(2381,732);
            Graph.minecraftTheme.pause();
            Graph.speedrunTheme.play();
            Graph.speedrunTheme.setLooping(true);

        }

        if(Graph.scene==3) {
            if (Graph.characterInRange(Graph.croco, 5390 - Graph.croco.w, 800, 5390 + 107, 1116) && Graph.pullernum == 0)
                if (Graph.pullernum == 0)
                    if (Graph.inventoryIsOpen)
                        if (Graph.inventorybtn[1].isPushed()) {
                            if (Graph.inventory.size() > 0)
                                Graph.inventory.remove(1);
                            Graph.pullernum++;
                            Graph.pullerset.play();
                        }

            Graph.inventoryIsOpen = false;
            if (Graph.c_got && Graph.C.isPushed())
                Graph.inventoryIsOpen = !Graph.inventoryIsOpen;

        }

        if(Graph.scene==11)
        {
            Graph.inventoryIsOpen = false;
            if (Graph.c_got && Graph.C.isPushed())
                Graph.inventoryIsOpen = !Graph.inventoryIsOpen;
        }

        onScreen = false;
        ux = screenX;
        uy = screenY;

        uxa[pointer] = screenX;
        uya[pointer] = screenY;
        onScreena[pointer] = false;

        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        dx = screenX-tx;
        dy = screenY-ty;
        mx = screenX;
        my = screenY;
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
