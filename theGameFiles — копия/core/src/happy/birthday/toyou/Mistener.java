package happy.birthday.toyou;

import com.badlogic.gdx.InputProcessor;

public class Mistener implements InputProcessor {
    static int tx=0,ty=0,ux=0,uy=0,dx=0,dy=0,mx=0,my=0;
    static boolean onScreen = false;
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
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        tx = screenX;
        ty = screenY;
        onScreen = true;
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {



        onScreen = false;
        ux = screenX;
        uy = screenY;
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
