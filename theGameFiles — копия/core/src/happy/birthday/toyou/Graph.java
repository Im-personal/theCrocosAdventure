package happy.birthday.toyou;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.Date;

public class Graph extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	Animation distraction;

	static int width = 0;
	static int height = 0;//1440 720
	static int randomDistraction=0;

	static float mnX = 1;
	static float mnY = 1;

	boolean right_got=true;
	boolean left_got = true;
	boolean up_got = true;
	boolean z_got = true;
	boolean x_got = true;
	boolean c_got = true;
	Button left;
	Button right;
	Button up;
	Button Z;
	Button X;
	Button C;

	BitmapFont mainfont;
	BitmapFont undertalefont;

	Dialog disclaimer;
	Dialog storytell;

	Animation maindialog;
	Animation jevil;

	Texture storypic;
	Texture img_X;
	Texture img_Z;
	Texture img_C;
	Texture img_right;
	Texture img_up;
	Texture img_left;
	Texture[] blocks;

	Music icandoanything;
	Music onceuponatime;
	Music demontower;

	Sound fall;

	float timepassed = 0;
	@Override
	public void create () {
		batch = new SpriteBatch();
		width=Gdx.graphics.getWidth();
		height=Gdx.graphics.getHeight();
		mnX = width/1440f;
		mnY = height/720f;
		Gdx.input.setInputProcessor(new Mistener());

		//IMAGES
		img = new Texture("badlogic.jpg");
		storypic = new Texture("different/logo1.png");
		img_X = new Texture("keys/xkey.png");
		img_C = new Texture("keys/ckey.png");
		img_Z = new Texture("keys/zkey.png");
		img_left = new Texture("keys/leftkey.png");
		img_right = new Texture("keys/rightkey.png");
		img_up = new Texture("keys/upkey.png");
		blocks = new Texture[]{
				new Texture("");
		};

		//BUTTONS
		left = new Button(img_left,115,508,172,158,10);
		right = new Button(img_right,280,508,172,158,10);
		up = new Button(img_up,1129,508,172,158,10);
		Z = new Button(img_Z,40,94,90,85,2);
		X = new Button(img_X,130,94,90,85,2);
		C = new Button(img_C,220,94,90,85,2);

		//ANIMATIONS
		maindialog = new Animation("dialog",5,"maindialog",".png",3);
		jevil = new Animation("gifs/jevil",13,"frame_","_delay-0.05s.png",20);

		//FONTS
		mainfont = generateFont("fonts/determination.ttf",2,2);
		undertalefont = generateFont("fonts/determination.ttf",2,2);

		//DIALS
		disclaimer = new Dialog(new String[]{"                            !!ВНИМАНИЕ!!\nСледующий контент может содержать \nсцены шоколада, майнкрафта, РОЛЛОВ\nи незначительное количество сельдерея.\nПросьба всех беременных пожилых \nдетей инвалидов отойти от экрана."},233,79,986,535,maindialog,mainfont,40);
		storytell = new Dialog(new String[]{"Давным-давно две расы\nправили землей:\nЛЮДИ и МОНСТРЫ."},449,429,undertalefont);

		//MUSICS
		icandoanything = Gdx.audio.newMusic(Gdx.files.internal("sounds/jevil-i-can-do-anything.wav"));
		onceuponatime = Gdx.audio.newMusic(Gdx.files.internal("sounds/onceuponatime.mp3"));
		demontower = Gdx.audio.newMusic(Gdx.files.internal("sounds/demontower.mp3")); demontower.setLooping(true);

		//SOUNDS
		fall = Gdx.audio.newSound(Gdx.files.internal("sounds/fall.mp3"));

		if(false)
		if(System.currentTimeMillis()<1659963600901L) {
			scene = 0;

			randomDistraction = (int)(Math.random()*3);
			switch (randomDistraction){
				case 0:
					distraction = new Animation("toolate/distraction",34,20);
					break;

			}

		}
		else scene=1; else scene = 1;
	}

	@Override
	public void render () {
		switch (scene){
			case 1:
				ScreenUtils.clear(12/256f, 12/256f, 12/256f, 1);
				break;
			case 3:
				ScreenUtils.clear(0.5f,0.5f,0.5f, 1);
				break;

			default:
				ScreenUtils.clear(0,0,0f, 1);
				break;

		}

		batch.begin();

		draw(batch);
		count();

		batch.end();


	}

	int scene = 0;

	// 0 - заставка до др
	// 1 - дисклеймер
	// 2 - давным давно
	// 3 - пещерка

	void draw(SpriteBatch b)
	{
		if(scene==0)
		{
			switch (randomDistraction){
				case 0:
					drawSprite(distraction,470,117,475,503);
					break;
			}
		}

		if(scene == 1)
		{
			if(timepassed<8.5) {
				drawSprite(jevil, 390, 48, 685, 536);
				disclaimer.draw(b, 78, 44, 47);
			}

			//logMistener();
		}


		if(scene==2)
		{

			drawSprite(storypic,438,48,555,346);
			storytell.draw(b,86,0,0);

			//logMistener();
		}

		if(scene==3)
		{
			drawKeys();
		}
	}

	void count()
	{
		if(scene==0)
		{
			if(System.currentTimeMillis()>1659963600901L){scene=1;sceneJustChanged=true;}
			distraction.update();
		}

		if (scene == 1)
		{

			if(sceneJustChanged)
			{
				disclaimer.open();
				icandoanything.setVolume(0.1f);
				icandoanything.play();
				timepassed=0;
				sceneJustChanged=false;
			}
			timepassed+=Gdx.graphics.getDeltaTime();
			if(Mistener.onScreen)System.out.println(timepassed);
			disclaimer.update();
			jevil.update();
			if(timepassed>=12)changeScene();
		}

		if(scene==2){
			if(sceneJustChanged)
			{
				sceneJustChanged = false;
				storytell.open();
				onceuponatime.play();
			}
			storytell.update();
			if(onceuponatime.getPosition()>=3.5f)
			{
				onceuponatime.stop();
				changeScene();
			}
		}

		if(scene==3)
		{
			if(sceneJustChanged) {
				sceneJustChanged = false;
				demontower.play();
				fall.play();
			}
		}
	}

	boolean sceneJustChanged = true;
	@Override
	public void dispose () {
		batch.dispose();
	}


	void drawKeys()
	{

		if(left_got)drawSprite(left);
		if(right_got)drawSprite(right);
		if(up_got)drawSprite(up);
		if(z_got)drawSprite(Z);
		if(x_got)drawSprite(X);
		if(c_got)drawSprite(C);
		logMistener();
	}

	void drawSprite(Texture img, int x, int y,int w, int h){
		batch.draw(img, x*mnX, (720-y-h)*mnY,w*mnX,h*mnY);
	}

	void drawSprite(Animation img, int x, int y,int w, int h){
		batch.draw(img.getFrame(), x*mnX, (720-y-h)*mnY,w*mnX,h*mnY);
	}

	void drawSprite(Button but){
		if(but.isPushed())
			batch.draw(but.getTexture(), (but.getX()+ but.getDepth())*mnX,(720-but.getH()-but.getY()-but.getDepth())*mnY,(but.getW()-but.getDepth()*2)*mnX,(but.getH()-but.getDepth()*2)*mnY);
		else
			batch.draw(but.getTexture(), but.getX()*mnX,(720-but.getH()-but.getY())*mnY,but.getW()*mnX,but.getH()*mnY);
	}



	void changeScene()
	{
		scene++;
		sceneJustChanged=true;
	}

	void changeScene(int n)
	{
		scene=n;
		sceneJustChanged=true;
	}

	private BitmapFont generateFont(String fontName, float sizeX, float sizeY, float w, float h) {

		String RUSSIAN_CHARACTERS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
				+ "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
				+ "1234567890.,:;_¡¿?\"'+-*/()[]={}<>!"+
				"abcdefghijklmnopqrstuvwxyz" +
				"ABCDEFGHIJGKLMNOPQURSTUVWXYZ";


		// Configure font parameters
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.characters =RUSSIAN_CHARACTERS;
		parameter.size = 24;

		// Generate font
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator( Gdx.files.internal(fontName) );
		BitmapFont font = generator.generateFont(parameter);
		font.getData().setScale(sizeX*mnX,sizeY*mnY);

		// Dispose resources
		generator.dispose();

		return font;
	}


	private BitmapFont generateFont(String fontName, float sizeX, float sizeY,float w, float h, Color color) {

		String RUSSIAN_CHARACTERS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
				+ "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
				+ "1234567890.,:;_¡¿?\"'+-*/()[]={}<>!"+
				"abcdefghijklmnopqrstuvwxyz" +
				"ABCDEFGHIJGKLMNOPQURSTUVWXYZ";


		// Configure font parameters
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.characters =RUSSIAN_CHARACTERS;
		parameter.size = 24;

		// Generate font
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator( Gdx.files.internal(fontName) );
		BitmapFont font = generator.generateFont(parameter);
		font.getData().setScale(sizeX*mnX,sizeY*mnY);
		font.setColor(color);

		// Dispose resources
		generator.dispose();

		return font;
	}


	private BitmapFont generateFont(String fontName, float sizeX, float sizeY) {

		String RUSSIAN_CHARACTERS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
				+ "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
				+ "1234567890.,:;_¡¿?\"'+-*/()[]={}<>!"+
				"abcdefghijklmnopqrstuvwxyz" +
				"ABCDEFGHIJGKLMNOPQURSTUVWXYZ";


		// Configure font parameters
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.characters =RUSSIAN_CHARACTERS;
		parameter.size = 24;

		// Generate font
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator( Gdx.files.internal(fontName) );
		BitmapFont font = generator.generateFont(parameter);
		font.getData().setScale(sizeX*mnX,sizeY*mnY);

		// Dispose resources
		generator.dispose();

		return font;
	}


	private BitmapFont generateFont(String fontName, float sizeX, float sizeY, Color color) {

		String RUSSIAN_CHARACTERS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
				+ "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
				+ "1234567890.,:;_¡¿?\"'+-*/()[]={}<>!"+
				"abcdefghijklmnopqrstuvwxyz" +
				"ABCDEFGHIJGKLMNOPQURSTUVWXYZ";


		// Configure font parameters
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.characters =RUSSIAN_CHARACTERS;
		parameter.size = 24;

		// Generate font
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator( Gdx.files.internal(fontName) );
		BitmapFont font = generator.generateFont(parameter);
		font.getData().setScale(sizeX*mnX,sizeY*mnY);
		font.setColor(color);
		// Dispose resources
		generator.dispose();

		return font;
	}


	void delay(long millis)
	{
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void logMistener()
	{
		System.out.println(Mistener.tx+","+Mistener.ty+","+Mistener.dx+","+Mistener.dy);
	}

	public void drawString(String str, float x, float y, BitmapFont font)
	{
		font.draw(batch,str,x*mnX,(720f-y)*mnY);
	}

	void log()
	{
		System.out.println("DEBUG!!");
	}

	void log(int i)
	{
		System.out.println(i);
	}

	void log(String str)
	{
		System.out.println(str);
	}

	void log(boolean bool)
	{
		System.out.println(bool);
	}

	void log(char c)
	{
		System.out.println(c);
	}

	void log(float f)
	{
		System.out.println(f);
	}

}
