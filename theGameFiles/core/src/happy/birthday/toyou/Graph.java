	package happy.birthday.toyou;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class Graph extends ApplicationAdapter {
	static SpriteBatch batch;
	static ShapeRenderer renderer;
	Texture img;

	Animation distraction;

	static int width = 0;
	static int height = 0;//1440 720
	static int randomDistraction=0;

	static float mnX = 1;
	static float mnY = 1;

	boolean right_got=true;
	boolean left_got = false;
	static boolean up_got = false;
	static boolean z_got = false;
	static boolean x_got = false;
	static boolean c_got = false;
	static boolean crocomoved=false;
	static boolean speedrun;
	static boolean blockcontrol;
	static boolean thereisdind=false;
	static boolean chatisopen=false;
	boolean newMessage=false;
	static boolean inventoryIsOpen=false;
	static int pullernum=0;
	float speedruntimer;

	static String typetext="";

	static Button left;
	static Button right;
	static Button up;
	static Button Z;
	static Button X;
	static Button C;
	static Button win;
	static Button respawn;
	static Button keeperbutton;
	static Button dindstats;
	static Button crocostats;
	static Button btn_vote;
	static Button btn_reject;
	static Button btn_textfield;
	static Button btn_chat;
	static Button btn_sendmessage;
	static Button btn_useramogus;
	static Button finalButton;

	static Button[] inventorybtn;

	BitmapFont mainfont;
	BitmapFont mainfontsmal;
	BitmapFont undertalefont;
	BitmapFont minefont;
	BitmapFont minefontbig;
	BitmapFont amogusfontbig;
	BitmapFont amogusfont;
	BitmapFont amogusfontsmallblack;
	BitmapFont amogusfontsmallwhite;
	GlyphLayout layout = new GlyphLayout();


	Dialog disclaimer;
	Dialog storytell;
	Dialog doortalk;
	Dialog goodjob;
	Dialog totheX;
	Dialog putthestick;
	Dialog waitingsomethingtohappen;
	Dialog noescape;
	Dialog itslongtofall;
	Dialog spikesdoesntworktemporary;

	Animation maindialog;
	Animation jevil;
	Animation crocowalk;
	Animation[] animblocks;
	Animation crocodie;
	Animation animExplosion;
	Animation fire;
	static Animation crocoattack;
	Animation dindattack;
	Animation dindwalk;
	Animation deltaruneExplosion;
	Animation spamton;
	Animation gif_rickroll;

	Texture storypic;
	Texture img_X;
	Texture img_Z;
	Texture img_C;
	Texture img_right;
	Texture img_up;
	Texture img_left;
	Texture img_win;
	Texture[] blocks;
	Texture crocostay;
	Texture falldust;
	Texture zbutton;
	Texture xbutton;
	Texture cbutton;
	Texture crocosit;
	Texture minecraftInventory;
	Texture minecraftHeart;
	Texture minecraftHalfHeart;
	Texture minecraftEmptyHeart;
	Texture minecraftWhiteEmptyHeart;
	Texture minecraftFood;
	Texture minecraftExperience;
	Texture cavebg;
	Texture minecraftbg;
	Texture generic;
	Texture redscreen;
	Texture blackscreen;
	Texture whitescreen;
	Texture img_respawn;
	Texture img_respawn_pressed;
	Texture creeper;
	Texture whitecreeper;
	Texture waterbucket;
	Texture emptybucket;
	Texture seeds;
	Texture flintandsteel;
	Texture stick;
	Texture iron;
	Texture firecharge;
	Texture loadingminecraftBG;
	Texture netherbg;
	Texture money;
	Texture[] asianballs;
	Texture dindstay;
	Texture dindanfas;
	Texture dindkeeperinactive;
	Texture dindkeeperactive;
	Texture dindrare;
	Texture desinger3000;
	Texture deltarunetp;
	Texture deltarunestatscroco;
	Texture deltarunestatsdind;
	Texture[] puller;
	Texture rocket;
	Texture vote;
	Texture novote;
	Texture textfield;
	Texture usertalk;
	Texture sendmessage;
	Texture ivoted;
	Texture emergencyMeeting;
	Texture discusstext;
	Texture discusspic;
	Texture chatbutton;
	Texture chatbuttonnew;
	Texture amoguschat;
	Texture amogusattention;
	Texture amogusvotething;
	Texture tablet;
	Texture amogusdarkness;
	Texture[] amoguses;
	Texture spr_star;
	Texture misteryPlanet;
	Texture crocomini;
	Texture[] memesside1;
	Texture memebg;
	Texture ckeeper;
	Texture invslotgray;
	Texture invslotgreen;
	Texture overworldbg;
	Texture winpane;
	Texture winwin;
	Texture rickrolltext;
	Texture roll;
	Texture rolltext;
	Texture happybirthdaytext;

	static ArrayList<Texture> inventory = new ArrayList<>();


	Music icandoanything;
	Music onceuponatime;
	Music demontower;
	Music blackkey;
	Music lofi;
	Music rickroll;
	static Music minecraftTheme;
	static Music speedrunTheme;
	Music mus_dindkeeper;
	Music mus_dindkeeperactive;
	Music spamtonlaugh;
	Music deltarunestartfight;
	Music spamtonneo;
	Music startflight;
	Music emergency;
	Music eject;
	Music memeland;
	Music distractionsong;




	Multisound grasstep;
	Multisound stonestep;
	Multisound burn;

	Sound fall;
	Sound minedamagefall;
	Sound explosion;
	Sound fuse;
	Sound ghastattack;
	Sound ghastmoan;
	Sound fireattack;
	Sound pop;
	Sound ignite;
	Sound lavaplace;
	Sound fizz;
	Sound portalsound;
	Sound teleportation;
	static Sound sound_deltaruneexplosion;
	static Sound sound_crocoattack;
	static Sound deltaclick;
	static Sound mineclick;
	static Sound amongus_pop;
	static Sound glassbreak;
	static Sound doorboom;
	static Sound pullerset;
	Sound votetimer;
	static Sound votelock;


	ArrayList<Effect> effects= new ArrayList<>();

	static Character croco;
	static Character dind;

	static int[][] worldMatrix;
	static int[][] worldMatrixBG;
	int[][] minecraftworldbg;
	int[][] minecraftworldbgexploded;
	int[][] minecraftworld;
	int[][] minecraftworldlavaonly;
	int[][] netherworld;
	int[][] netherbgworld;
	int[][] netherbgworld2;
	int[][] deltaworld;
	int[][] deltaworldBG;
	int[][] memeworld;
	int[][] memeworldBG;
	int[][] overworld;

	static float shakescreen=0;

	static class star{
		float x;
		float y;
		public star()
		{
			x=(float)Math.random()*1440f;
			y=(float)Math.random()*(-720f);
		}

		public star(boolean b)
		{
			x=(float)Math.random()*1440f;
			y=(float)Math.random()*720f;
		}

		boolean outOfBounds()
		{
			return !(x >= 0) || !(x <= 1440) || !(y <= 720);
		}
	}

	star[] stars;

	static class item{
		Texture img;
		float x;
		float y;
		public item(Texture img, float x, float y)
		{
			this.x = x;
			this.y = y;
			this.img = img;
		}
	}

	ArrayList<item> items = new ArrayList<>();


	class amogususer extends Button{
		Texture face;
		String name;
		boolean you;
		boolean selected=false;
		int voted=-1;
		ArrayList<amogususer> votes = new ArrayList<>();
		public amogususer(Texture face,String name)
		{
			super(amogusvotething,0,0,0,0);
			this.face = face;
			this.name = name;
			you=false;
			selected=false;
		}

		public amogususer(Texture face,String name,boolean you)
		{
			super(amogusvotething,0,0,0,0);
			this.face = face;
			this.name = name;
			this.you=you;
		}
	}


	static amogususer[] amogus;


	static class message{
		amogususer user;
		String text;
		public message(amogususer user, String text)
		{
			this.user = user;
			this.text = text;
		}

	}

	static ArrayList<message> messages = new ArrayList<>();

	static class car{
		Texture img;
		float x=0;
		float y=0;
		boolean destroyed=false;
		float time=0;
		public car(Texture img)
		{
			this.img=img;
		}
		void update()
		{
			time+=Gdx.graphics.getDeltaTime();
		}
	}

	static car[] cars;

	float timepassed = 0;
	@Override
	public void create () {
	//	delay(5000);
		batch = new SpriteBatch();
		renderer = new ShapeRenderer();

		stars=new star[100];
		for(int i = 0; i<100;i++)stars[i]=new star();


		{
			FileHandle[] files = Gdx.files.internal("overworld/cars").list();
			cars = new car[files.length];
			for (int i = 0; i < cars.length; i++)
				cars[i] = new car(new Texture(files[i]));
		}

		width=Gdx.graphics.getWidth();
		height=Gdx.graphics.getHeight();
		mnX = width/1440f;
		mnY = height/720f;
		Gdx.input.setInputProcessor(new Mistener());

		//MATRIXES
		worldMatrix = loadMatrix("matrix/world1.txt");
		worldMatrixBG = loadMatrix("matrix/world1bg.txt");
		minecraftworld = loadMatrix("matrix/minecraft.txt");
		minecraftworldbg = loadMatrix("matrix/minecraftbg.txt");
		minecraftworldbgexploded = loadMatrix("matrix/minecraftbgexploded.txt");
		minecraftworldlavaonly = loadMatrix("matrix/minecraftlava.txt");
		netherworld = loadMatrix("matrix/nether.txt");
		netherbgworld = loadMatrix("matrix/netherbg.txt");
		netherbgworld2 = loadMatrix("matrix/netherbg2.txt");
		deltaworld = loadMatrix("matrix/deltamatrix.txt");
		deltaworldBG = loadMatrix("matrix/deltamatrixbg.txt");
		memeworld = loadMatrix("matrix/memeworld.txt");
		memeworldBG = loadMatrix("matrix/memeworldbg.txt");
		overworld = loadMatrix("matrix/overworld.txt");

		//TEXTURES
		img = new Texture("badlogic.jpg");
		storypic = new Texture("different/logo1.png");
		img_X = new Texture("keys/xkey.png");
		img_C = new Texture("keys/ckey.png");
		img_Z = new Texture("keys/zkey.png");
		img_left = new Texture("keys/leftkey.png");
		img_right = new Texture("keys/rightkey.png");
		img_up = new Texture("keys/upkey.png");
		img_win = new Texture("keys/winkey.png");
		zbutton = new Texture("keys/zbutton.png");
		cbutton = new Texture("keys/cbutton.png");
		xbutton = new Texture("keys/xbutton.png");
		redscreen = new Texture("blocks/invred.png");
		whitescreen = new Texture("blocks/whitescreen.png");
		blackscreen = new Texture("blocks/invblack.png");
		blocks = new Texture[]{
				new Texture("blocks/blackblock.png"),//1
				new Texture("blocks/stone.png"),//2
				new Texture("blocks/bedrock.png"),//3
				new Texture("blocks/stonebg.png"),//4
				new Texture("blocks/oak_sapling.png"),//5
				new Texture("blocks/winkeeperpt1.png"),//6
				new Texture("blocks/winkeeperpt2.png"),//7
				new Texture("blocks/winkeeperpt3.png"),//8
				new Texture("blocks/dindkeeper.png"),//9
				new Texture("blocks/dindkeeper2.png"),//:
				new Texture("blocks/greyblock.png"),//;
				new Texture("blocks/darkgreyblock.png"),//<
				new Texture("blocks/grass_block_side.png"),//=
				new Texture("blocks/dirt.png"),//>
				new Texture("blocks/cobblestone.png"),//?
				new Texture("blocks/poppy.png"),//@
				new Texture("blocks/dandelion.png"),//A
				new Texture("blocks/oak_log.png"),//B
				new Texture("blocks/oak_planks.png"),//C
				new Texture("blocks/oak_door_bottom.png"),//D
				new Texture("blocks/oak_door_top.png"),//E
				new Texture("blocks/beetroots_stage1.png"),//F
				new Texture("blocks/diamond_ore.png"),//G
				new Texture("blocks/dark_oak_planks.png"),//H
				new Texture("blocks/obsidian.png"),//I
				new Texture("blocks/netherrack.png"),//J
				new Texture("blocks/nether_gold_ore.png"),//K
				new Texture("blocks/nether_bricks.png"),//L
				new Texture("blocks/nether_bricks.png"),//M
				new Texture("blocks/oak_sign.png"),//N
				new Texture("blocks/wheat.png"),//O
				new Texture("blocks/spikes.png"),//P
				new Texture("blocks/transparent.png"),//Q

		};
		asianballs= new Texture[13];
		for(int i = 0; i<13;i++)asianballs[i] = new Texture("different/maschinewin"+i+".png");

		generic = new Texture("effects/generic_7.png");
		crocostay = new Texture("croco/crocostay.png");
		crocosit = new Texture("croco/crocosit.png");
		falldust = new Texture("effects/big_smoke_4.png");
		minecraftInventory = new Texture("minecraftInterface/inventory.png");
		minecraftHeart= new Texture("minecraftInterface/heart.png");
		minecraftHalfHeart= new Texture("minecraftInterface/halfheart.png");
		minecraftEmptyHeart= new Texture("minecraftInterface/emptyheart.png");
		minecraftWhiteEmptyHeart= new Texture("minecraftInterface/whiteemptyheart.png");
		minecraftFood = new Texture("minecraftInterface/food.png");
		minecraftExperience = new Texture("minecraftInterface/experience.png");
		cavebg = new Texture("background/cave.png");
		loadingminecraftBG = new Texture("background/loadingminecraft.png");
		netherbg = new Texture("background/minecraftnether.png");
		minecraftbg = new Texture("background/minecraft.png");
		img_respawn = new Texture("minecraftInterface/minebutton.png");
		img_respawn_pressed = new Texture("minecraftInterface/minebuttonpressed.png");
		creeper = new Texture("minecraft_mobs/creeper.png");
		whitecreeper = new Texture("minecraft_mobs/whitecreeper.png");
		emptybucket = new Texture("items/bucket.png");
		waterbucket = new Texture("items/water_bucket.png");
		seeds = new Texture("items/wheat_seeds.png");
		iron = new Texture("items/iron_ingot.png");
		flintandsteel = new Texture("items/flint_and_steel.png");
		stick = new Texture("items/stick.png");
		firecharge = new Texture("items/fire_charge.png");
		money = new Texture("different/money.png");
		dindstay = new Texture("dind/dindstay.png");
		dindanfas = new Texture("dind/dindshow.png");
		dindkeeperactive = new Texture("different/automatactive.png");
		dindkeeperinactive = new Texture("different/automatinactive.png");
		dindrare = new Texture("dind/dindrare.png");
		desinger3000 = new Texture("different/desinger3000.png");
		deltarunetp = new Texture("deltarune/tps.png");
		deltarunestatscroco = new Texture("deltarune/crocostatisdeltarune.png");
		deltarunestatsdind = new Texture("deltarune/dindstatisdeltarune.png");
		puller = new Texture[]{
				new Texture("different/pullernostick.png"),
				new Texture("different/pullerinactive.png"),
				new Texture("different/pulleractive.png"),
		};
		rocket = new Texture("amongus/rocket.png");
		vote = new Texture("amongus/vote.png");
		novote = new Texture("amongus/nooo.png");
		textfield = new Texture("amongus/textfield.png");
		usertalk = new Texture("amongus/usertalk.png");
		sendmessage = new Texture("amongus/sendmessage.png");
		ivoted = new Texture("amongus/ivoted.png");
		emergencyMeeting = new Texture("amongus/emergencymeeting.png");
		discusstext = new Texture("amongus/discusstext.png");
		discusspic = new Texture("amongus/discusspic.png");
		chatbutton = new Texture("amongus/chatbutton.png");
		chatbuttonnew = new Texture("amongus/chatbuttonnew.png");
		amoguschat = new Texture("amongus/chat.png");
		amogusattention = new Texture("amongus/attention.png");
		amogusvotething = new Texture("amongus/amogusvotething.png");
		tablet = new Texture("amongus/amogustablet.png");
		amogusdarkness = new Texture("amongus/amogusdarkness.png");
		amoguses = new Texture[]{
				new Texture("amongus/amoguses/croco.png"),
				new Texture("amongus/amoguses/blue.png"),
				new Texture("amongus/amoguses/cyan.png"),
				new Texture("amongus/amoguses/green.png"),
				new Texture("amongus/amoguses/pink.png"),
				new Texture("amongus/amoguses/red.png"),
		};
		spr_star=new Texture("memes/stars.png");
		misteryPlanet=new Texture("memes/misteryplanet.png");
		crocomini=new Texture("memes/littleorangedot.png");
		memebg = new Texture("background/memebg.png");
		FileHandle[] files = Gdx.files.internal("memes/memes").list();
		memesside1 = new Texture[files.length];
		for(int i = 0 ;i<memesside1.length;i++)
			memesside1[i]=new Texture(files[i]);
		ckeeper=new Texture("memes/ckey.png");
		invslotgray = new Texture("different/inventoryslotinactive.png");
		invslotgreen = new Texture("different/inventoryslotactive.png");
		overworldbg = new Texture("background/overworld.png");
		winpane = new Texture("different/winpan.png");
		winwin = new Texture("different/winwin.png");
		happybirthdaytext = new Texture("different/happybirthdaytext.png");
		rickrolltext = new Texture("different/rickrolltext.png");
		rolltext = new Texture("different/rolltext.png");
		roll = new Texture("different/roll.png");

		//BUTTONS
		left = new Button(img_left,115,508,172,158,10);
		right = new Button(img_right,280,508,172,158,10);
		up = new Button(img_up,1129,508,172,158,10);
		Z = new Button(img_Z,40,94,90,85,2);
		X = new Button(img_X,130,94,90,85,2);
		C = new Button(img_C,220,94,90,85,2);
		win = new Button(img_win,509,155,421,415,(int)(2*2.830512572533849f));
		respawn = new Button(img_respawn,342,348,743,95);
		respawn.setPushedTexture(img_respawn_pressed);
		keeperbutton = new Button(515,406,329,285);
		crocostats = new Button(deltarunestatscroco,0,0,0,0);
		dindstats = new Button(deltarunestatsdind,0,0,0,0);
		btn_vote = new Button(vote,0,0,0,0);
		btn_reject= new Button(novote,0,0,0,0);
		btn_chat = new Button(chatbutton,1086,49,95,101);
		btn_textfield= new Button(textfield,190,564,865,89);
		btn_sendmessage = new Button(sendmessage,969,73,63,68);
		btn_useramogus= new Button(amogusvotething,0,0,0,0);
		inventorybtn=new Button[5];
		for(int i = 0; i<5;i++)
			inventorybtn[i] = new Button(invslotgray,0,0,0,0,5);
		finalButton= new Button(11,10,375,141);

		//ANIMATIONS
		maindialog = new Animation("dialog",5,"maindialog",".png",3);
		jevil = new Animation("gifs/jevil",13,"frame_","_delay-0.05s.png",20);
		crocowalk = new Animation("croco",7,"crocogo",".png",10);
		animblocks = new Animation[]{
				new Animation("blocks",20,"lava",".png",0.5f),
		};
		crocodie = new Animation("croco",10,"crocodie",".png",20,false);
		animExplosion = new Animation("effects",17,"explosion_",".png",40,false);
		fire = new Animation("blocks",33,"fire",".png",10);
		dindwalk=new Animation("dind",4,"dindgo",".png",4);
		dindattack=new Animation("dind",3,"dindattack",".png",10);
		crocoattack=new Animation("croco",4,"crocoattack",".png",5,false);
		deltaruneExplosion = new Animation("deltarune/explosion",18,"frame_","_delay-0.1s.png",10,false);
		spamton = new Animation("deltarune/spamton",24);
		gif_rickroll=new Animation("gifs/rickroll",10);
		//FONTS
		mainfont = generateFont("fonts/determination.ttf",2,2);
		mainfontsmal = generateFont("fonts/determination.ttf",1.5f,1.5f);
		undertalefont = generateFont("fonts/determination.ttf",2,2);
		minefont = generateFont("fonts/minecraft.ttf",1.5f,1.5f);
		minefontbig = generateFont("fonts/minecraft.ttf",3f,3f);
		amogusfont = generateFont("fonts/amogus.ttf",1.5f,1.5f,Color.WHITE,2,Color.BLACK);
		amogusfontsmallblack = generateFont("fonts/amogus.ttf",1,1,Color.BLACK);
		amogusfontsmallwhite = generateFont("fonts/amogus.ttf",1,1,Color.WHITE,2,Color.BLACK);
		amogusfontbig = generateFont("fonts/amogus.ttf",3,3,Color.WHITE,2,Color.BLACK);
		//DIALS
		disclaimer = new Dialog(new String[]{"                            !!ВНИМАНИЕ!!\nСледующий контент может содержать \nсцены шоколада, майнкрафта, РОЛЛОВ\nи незначительное количество сельдерея.\nПросьба всех беременных пожилых \nдетей инвалидов отойти от экрана."},233,79,986,535,maindialog,mainfont,40);
		storytell = new Dialog(new String[]{"Давным-давно две расы\nправили землей:\nЛЮДИ и МОНСТРЫ."},449,429,undertalefont);
		doortalk=new Dialog(new String[]{"Вам нужен личный азиат,\n     чтобы пройти!"},0,0,475,241,maindialog,mainfontsmal,20);
		goodjob=new Dialog(new String[]{"Молодец!\nТы добралась сюда"},0,0,475,241,maindialog,mainfontsmal,20);
		totheX=new Dialog(new String[]{"Ракета на планету Х"},0,0,475,241,maindialog,mainfontsmal,20);
		putthestick=new Dialog(new String[]{"НАПОМИНАНИЕ СЕБЕ:\nпоставить сюда палку"},0,0,475,241,maindialog,mainfontsmal,20);
		waitingsomethingtohappen=new Dialog(new String[]{"ждешь чавота?"},0,0,475,241,maindialog,mainfontsmal,20);
		noescape=new Dialog(new String[]{"от мемов не сбежать"},0,0,475,241,maindialog,mainfontsmal,20);
		itslongtofall=new Dialog(new String[]{"далеко падать да? :3"},0,0,475,241,maindialog,mainfontsmal,20);
		spikesdoesntworktemporary=new Dialog(new String[]{"шипы временно не работают\nприносим извинения за\nпредоставленные удобства"},0,0,575,241,maindialog,mainfontsmal,20);



		//MUSICS
		icandoanything = Gdx.audio.newMusic(Gdx.files.internal("sounds/jevil-i-can-do-anything.wav"));
		onceuponatime = Gdx.audio.newMusic(Gdx.files.internal("sounds/onceuponatime.mp3"));
		demontower = Gdx.audio.newMusic(Gdx.files.internal("sounds/demontower.mp3")); demontower.setLooping(true);
		blackkey = Gdx.audio.newMusic(Gdx.files.internal("sounds/blackkey.mp3"));
		minecraftTheme = Gdx.audio.newMusic(Gdx.files.internal("sounds/minecraft/calm1.ogg"));
		speedrunTheme = Gdx.audio.newMusic(Gdx.files.internal("sounds/minecraft/speedrun.mp3"));
		mus_dindkeeper = Gdx.audio.newMusic(Gdx.files.internal("sounds/dindkeepertheme.mp3"));
		mus_dindkeeperactive = Gdx.audio.newMusic(Gdx.files.internal("sounds/dindkeeper.mp3"));
		spamtonlaugh =  Gdx.audio.newMusic(Gdx.files.internal("sounds/deltarune/smaptonlaugh.mp3"));
		spamtonneo = Gdx.audio.newMusic(Gdx.files.internal("sounds/deltarune/spamton_neo_mix_ex_wip.ogg"));
		deltarunestartfight = Gdx.audio.newMusic(Gdx.files.internal("sounds/deltarune/startfight.mp3"));
		startflight = Gdx.audio.newMusic(Gdx.files.internal("sounds/amongus/startflight.mp3"));
		eject = Gdx.audio.newMusic(Gdx.files.internal("sounds/amongus/eject.mp3"));
		emergency = Gdx.audio.newMusic(Gdx.files.internal("sounds/amongus/emermeeting.mp3"));
		memeland = Gdx.audio.newMusic(Gdx.files.internal("sounds/meme.mp3"));
		lofi = Gdx.audio.newMusic(Gdx.files.internal("sounds/overworld.m4a"));
		rickroll = Gdx.audio.newMusic(Gdx.files.internal("sounds/rickroll.mp3"));
		//MULTISOUNDS
		grasstep = new Multisound("sounds\\minecraft\\grasstep\\grass",".ogg",6);
		stonestep = new Multisound("sounds\\minecraft\\stonestep\\stone",".ogg",6);
		burn = new Multisound("sounds\\minecraft\\hit\\fire_hurt",".ogg",3);

		//SOUNDS
		amongus_pop=Gdx.audio.newSound(Gdx.files.internal("sounds/amongus/messagepop.mp3"));
		votetimer=Gdx.audio.newSound(Gdx.files.internal("sounds/amongus/votetimer.mp3"));
		votelock=Gdx.audio.newSound(Gdx.files.internal("sounds/amongus/amongvotelock.mp3"));

		fall = Gdx.audio.newSound(Gdx.files.internal("sounds/fall.mp3"));
		minedamagefall = Gdx.audio.newSound(Gdx.files.internal("sounds\\minecraft\\hit\\fallbig.ogg"));
		explosion = Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/explode3.ogg"));
		mineclick = Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/click.ogg"));
		fuse = Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/fuse.ogg"));
		ghastattack = Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/charge.ogg"));
		ghastmoan = Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/moan1.ogg"));
		fireattack = Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/fireball4.ogg"));
		pop =  Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/pop.ogg"));
		fizz =  Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/fizz.ogg"));
		ignite =  Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/ignite.ogg"));
		lavaplace=  Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/empty1.ogg"));
		portalsound = Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/portal.ogg"));
		teleportation = Gdx.audio.newSound(Gdx.files.internal("sounds/minecraft/travel.ogg"));
		sound_deltaruneexplosion = Gdx.audio.newSound(Gdx.files.internal("sounds/deltarune/deltarune-explosion.mp3"));
		deltaclick = Gdx.audio.newSound(Gdx.files.internal("sounds/deltarune/select.wav"));
		sound_crocoattack = Gdx.audio.newSound(Gdx.files.internal("sounds/deltarune/crocoattacksound.mp3"));
		pullerset= Gdx.audio.newSound(Gdx.files.internal("sounds/pullersetted.mp3"));
		doorboom= Gdx.audio.newSound(Gdx.files.internal("sounds/doorboom.mp3"));
		glassbreak= Gdx.audio.newSound(Gdx.files.internal("sounds/glass.mp3"));


		//Characters
		Character.matrix = worldMatrix;
		croco = new Character(crocostay,crocowalk,2074+128*3,2140,94,163);
		dind = new Character(dindstay,dindwalk,2074+128*3,2140,100,214);

		//ITEMS

		items.add(new item(flintandsteel,1544,811));
		items.add(new item(stick,1465,811));
		items.add(new item(waterbucket,1459,811));
		items.add(new item(seeds,1452,811));
		items.add(new item(iron,1308,811));

		//AMOGUSERS
		amogus = new amogususer[]
		{
				new amogususer(amoguses[3], "pistolet"),
				new amogususer(amoguses[2], "kekcuk"),
			new amogususer(amoguses[5], "Mediator"),
			new amogususer(amoguses[0], "crococow", true),
			new amogususer(amoguses[1], "прятки"),
			new amogususer(amoguses[4], "goose"),
		};
		for(int i = 0; i<amogus.length;i++)
		{
			amogus[i].setXYWH(201+((i+1)%2==0?497:0),163+i/2*120,442,96);

		}


		if(System.currentTimeMillis()<1659963600901L) {
			scene = 0;
			sceneJustChanged=true;
			randomDistraction = (int)(Math.random()*3);
			switch (randomDistraction){
				case 0:
					distraction = new Animation("toolate/distraction",33,20);
					distractionsong = Gdx.audio.newMusic(Gdx.files.internal("sounds/distraction/distraction.mp3"));
					distractionsong.setLooping(true);
					break;
				case 1:
				case 2:
					distraction = new Animation("toolate/smugdance",20);
					distractionsong = Gdx.audio.newMusic(Gdx.files.internal("sounds/distraction/seal.mp3"));
					distractionsong.setLooping(true);
					break;

			}

		}
		else {
			scene = 1;
		}

	}

	@Override
	public void render () {
		switch (scene){
			case 1:
				ScreenUtils.clear(12/256f, 12/256f, 12/256f, 1);
				break;
			case 3:
				ScreenUtils.clear(0.2f,0.2f,0.2f, 1);
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
	float darkness=0;
	static int scene = 0;

	// 0 - заставка до др
	// 1 - дисклеймер
	// 2 - давным давно
	// 3 - пещерка

	void draw(SpriteBatch b)
	{

		if(scene==0)
		{

		drawSprite(distraction,470,117,475,503);
		distractionsong.play();

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
			drawSprite(cavebg,0,0,1440,720);

			drawMatrix(worldMatrixBG);
			drawMatrix(worldMatrix);

			if(thereisdind&&act==3)
			{
				drawSprite(deltaruneExplosion,4617-eyeX,1860-eyeY,617,567);

				deltaruneExplosion.update();
			}
			if(!c_got) {
				if (act != 5 && act != 6)
					drawSprite(rocket, 2138 - eyeX, 327 - eyeY - 209, 396, 650);
				else
					drawSprite(rocket, 2138 - eyeX + ((float) Math.random() * 20 - 10), 327 - eyeY - 209 + ((float) Math.random() * 20 - 10) - objectOffset, 396, 650);
			}
			drawSprite(puller[pullernum],5343-eyeX,1070-eyeY+shakescreen,209,209);
			if(act==0&&!c_got)
			if(characterInRange(croco,2162,300,2396,610))
			drawSprite(zbutton,2276-eyeX,440-eyeY,107,107);
			if(act==0)
			if(characterInRange(croco,5390-croco.w,800,5390+107,1116))
				if(pullernum==0)
			drawSprite(cbutton,5390-eyeX,1011-eyeY,107,107);
				else if(pullernum==1)
					drawSprite(zbutton,5390-eyeX,1011-eyeY,107,107);

			if(act!=5&&act!=6)
			if(crocomoved)
				if(x_got&&blockcontrol)
					drawSprite(crocoattack,croco.x-eyeX,croco.y-eyeY,croco.w,croco.h);
					else
				drawSprite(croco);
			else
				drawSprite(crocosit,croco.x-eyeX,croco.y-eyeY,croco.w,croco.h);

			if(thereisdind)
			{
				if(act!=1)
				drawSprite(dind);
				else {
					drawSprite(dindattack, dind.x - eyeX, dind.y - eyeY, dind.w, dind.h);
					dindattack.update();
				}
			}


			double mt = Math.sin(Math.PI/360*System.currentTimeMillis())*10;
			//drawKey

			if(!left_got)
			drawSprite(img_left,5199-eyeX+128*3,(int)(2136+mt)-eyeY,172/1.5f,158/1.5f);
			//log(croco.x+","+croco.y);
			//logMistener();
			if(characterInRange(croco,4144.0,2140.0-10,4828.0,2140.0))
			{
				if(!doortalk.isOpened)
					doortalk.open();
				doortalk.x = 4139-eyeX+128*3;
				doortalk.y = 1888-eyeY;


				if(act==0)
				doortalk.draw(batch,52,38,80);

			}else{
				doortalk.close();
			}



			if(characterInRange(croco,510,1932,673,2140.0))
			{
				if(!goodjob.isOpened)
				goodjob.open();
				goodjob.x=559-eyeX;
				goodjob.y= 1888-eyeY;
				goodjob.draw(batch,52,38,80);
				goodjob.update();
			}else {
				goodjob.close();
			}

			if(characterInRange(croco,5561,987,5793,1116))
			{
				if(!putthestick.isOpened)
					putthestick.open();
				putthestick.x=5716-eyeX;
				putthestick.y= (1888-(2140-1116))-eyeY;
				putthestick.draw(batch,52,38,80);
				putthestick.update();
			}else {
				putthestick.close();
			}

			if(characterInRange(croco,2489,300,2715,2724))
			{
				if(!totheX.isOpened)
					totheX.open();
				totheX.x=2582-eyeX;
				totheX.y= (1888-(2140-604))-eyeY;
				totheX.draw(batch,52,38,80);
				totheX.update();

			}else {
				totheX.close();
			}


			if(characterInRange(croco,703,300,892,2724))
			{
				if(!waitingsomethingtohappen.isOpened)
					waitingsomethingtohappen.open();
				waitingsomethingtohappen.x=700-eyeX;
				waitingsomethingtohappen.y= (1888-(2140-604))-eyeY;
				waitingsomethingtohappen.draw(batch,52,38,80);
				waitingsomethingtohappen.update();

			}else {
				waitingsomethingtohappen.close();
			}

			if(characterInRange(croco,9758,0,10145,348))
			{
				if(!itslongtofall.isOpened) {
					itslongtofall.open();
					if(worldMatrix[4][73]==0)
					{
						for(int i = 54; i<=76;i++)
							worldMatrix[4][i]=-1;

						shakescreen=500;
						doorboom.play();
					}
				}
				itslongtofall.x=9758-eyeX;
				itslongtofall.y= (151)-eyeY;
				itslongtofall.draw(batch,52,38,80);
				itslongtofall.update();



			}else {
				itslongtofall.close();
			}

			if(characterInRange(croco,8398,3375,8821,3676))
			{
				if(!spikesdoesntworktemporary.isOpened) {
					spikesdoesntworktemporary.open();
				}
				spikesdoesntworktemporary.x=8413-eyeX;
				spikesdoesntworktemporary.y= 3424-eyeY;
				spikesdoesntworktemporary.draw(batch,52,38,80);
				spikesdoesntworktemporary.update();
			}else {
				spikesdoesntworktemporary.close();
			}


//+Math.sin(1f/System.currentTimeMillis())
			drawEffects();

			if(!(thereisdind||up_got))
			if(characterInRange(croco,1346+128*3,2130,1516+128*3,2150))
				drawSprite(zbutton,1418-eyeX+128*3,1964-eyeY,107,107);

			if(thereisdind)
			{
				if(act==0)
				{
					if(characterInRange(croco,4144,2130,5086,2150))
						drawSprite(zbutton,4878-eyeX,2140-eyeY,107,107);
				}
				if(act==3)
				{

					if(characterInRange(croco,4705,2130,5086,2150))
						drawSprite(zbutton,4878-eyeX,2140-eyeY,107,107);
				}
			}


			if(characterInRange(croco,2893+128*3,2130,3055+128*3,2150))
				if(worldMatrixBG[16][26]!='8'-'0'-1)
				drawSprite(xbutton,2957-eyeX+128*3,1964-eyeY,107,107);
				else
					drawSprite(zbutton,2957-eyeX+128*3,1964-eyeY,107,107);

			if(act!=5&&act!=6) {
				drawMinecraftInterface();

				drawKeys();
			}

			if(inventoryIsOpen) {

				if(characterInRange(croco,5390-croco.w,800,5390+107,1116)&&pullernum==0)
					inventorybtn[1].setTexture(invslotgreen);
				else
					inventorybtn[1].setTexture(invslotgray);
				for (int i = 0; i < inventorybtn.length; i++) {
					inventorybtn[i].setXYWH(49 + 260 * i + 27, 139 + 70, 246, 246);
					drawSprite(inventorybtn[i]);
					if (inventory.size() > i)
						drawSprite(inventory.get(i), 49 + 260 * i + 27, 139 + 70, 246, 246);
				}
			}


			if(croco.y>2150)
			{
				batch.setColor(0,0,0,darkness);
				drawSprite(blocks[0],0,0,1440,720);
				batch.setColor(1,1,1,1f);
			}

			if(thereisdind)
			{
				if(act==4)
				{
					batch.setColor(0,0,0,darkness);
					drawSprite(blocks[0],0,0,1440,720);
					batch.setColor(1,1,1,1f);
				}
			}

			if(croco.y<=291&&croco.x<=4221) {
				batch.setColor(0, 0, 0, darkness);
				drawSprite(blocks[0], 0, 0, 1440, 720);
				batch.setColor(1, 1, 1, 1f);
			}

		}

		if(scene==4) {
			drawSprite(minecraftbg, 0, 0, 1440, 720);

			if (act < 2)
				drawMatrix(minecraftworldbg);
			else
				drawMatrix(minecraftworldbgexploded);
			if (minecrafthp > 0)
				drawSprite(croco);
			else {

				drawSprite(crocodie, croco.x - eyeX, croco.y - eyeY, croco.w * 2, croco.h);
				crocodie.update();
			}

			if (croco.y > 1372) drawSprite(fire, croco.x - eyeX, croco.y - eyeY, croco.w, croco.h);


			drawMatrix(minecraftworld);
			drawMatrix(minecraftworldlavaonly);

			drawMinecraftInterface();
			drawKeys();

			if (!bkproc && darkness > 0 && act == 0) {
				darkness -= 0.025;
				batch.setColor(0, 0, 0, darkness);
				drawSprite(blocks[0], 0, 0, 1440, 720);
				batch.setColor(1, 1, 1, 1);
			}


			drawEffects();


			if (act == 1) {
				float grow = acttime * 10;
				drawSprite(creeper, 1387 - grow - eyeX, 659 - grow - eyeY, 97 + grow * 2, 238 + grow * 2);
				batch.setColor(1, 1, 1, darkness);
				drawSprite(whitecreeper, 1387 - grow - eyeX, 659 - grow - eyeY, 97 + grow * 2, 238 + grow * 2);
				batch.setColor(1, 1, 1, 1);
				drawSprite(blackscreen, 29, 407, 1199, 71);
				drawString("ТыДомашкуСделала? призвал Creeper", 47, 422, minefont);
			}

			if (act == 2) {
				drawSprite(animExplosion, 1131 - eyeX, 499 - eyeY, 560, 460);
				batch.setColor(1, 1, 1, darkness);
				drawSprite(blackscreen, 29, 407, 1199, 71);
				if (darkness > 0)
					drawString("ТыДомашкуСделала? призвал Creeper", 47, 422, minefont);
				batch.setColor(1, 1, 1, 1);


				for (int i = 0; i < items.size(); i++) {
					double mt = Math.sin(Math.PI / (360 * 3) * (System.currentTimeMillis() + i * 1234) * 5);
					drawSprite(items.get(i).img, items.get(i).x - eyeX, (int) (items.get(i).y + (mt)) - eyeY, 68, 68);
				}

			}


			if (minecrafthp <= 0) {
				drawSprite(redscreen, 0, 0, 1440, 720);
				drawString("Вы умерли!", 484, 151, minefontbig);
				drawSprite(respawn);
				drawString("Возродиться", 484 + 81, 151 + 225, minefont);
			}


			if (speedrun) {
				char[] arr = (speedruntimer + "").toCharArray();
				String num = "";
				for (int i = 0; i < 5 && i < arr.length; i++)
					num += arr[i];
				drawString(hours + ":" + minutes + ":" + num, 623, 30, minefont);
			}



		}

		if(scene==5)
		{
			drawSprite(netherbg,0,0,1440,720);
			drawMatrix(netherbgworld);
			drawMatrix(netherworld);
			drawSprite(croco);
			drawMatrix(netherbgworld2);

			if(act==2)
			{
				drawSprite(firecharge,croco.x+fireballdist-eyeX-(241/2f),croco.y-fireballdist-eyeY-(241/2f),241,241);
			}
			if(act==3)
			{
				drawSprite(animExplosion,2431-eyeX,373-eyeY,1005,590);
			}

			drawMinecraftInterface();
			drawKeys();

			if (speedrun) {
				char[] arr = (speedruntimer + "").toCharArray();
				String num = "";
				for (int i = 0; i < 5 && i < arr.length; i++)
					num += arr[i];
				drawString(hours + ":" + minutes + ":" + num, 623, 30, minefont);
			}


			if(act==3)
				drawSprite(img_Z,croco.x-172/1.5f/2-eyeX,20*128-eyeY,(172/1.5f),158/1.5f);

		}

		if(scene==6)
		{
			if(act==0)
			drawSprite(dindkeeperinactive,0,0,1440,720);
			else {
				drawSprite(dindkeeperactive, 0, 0, 1440, 720);
				drawSprite(asianballs[randomint],385+randomintx,89+randominty,554/2f,486/2f);
				batch.setColor(1,1,1,darkness);
				drawSprite(whitescreen,0,0,1440,720);
				batch.setColor(1,1,1,1);

				if(act==3)
				{
					drawSprite(whitescreen,0,0,1440,720);
					batch.setColor(1,1,1,darkness2);
					drawSprite(dindrare,401,456,644,164);
					float mt = (float)(Math.sin(Math.PI/(360*5)*System.currentTimeMillis())*10);
					drawSprite(dindanfas,595,69f+mt,193,367);
					drawSprite(desinger3000,1207,499,236,227);

					//if(!mus_dindkeeperactive.isPlaying()) {
						batch.setColor(0, 0, 0, darkness);
						drawSprite(blocks[0], 0, 0, 1440, 720);


					batch.setColor(1,1,1,1);


				}

			}
		}

		if(scene==7)
		{

			drawMatrix(deltaworldBG);
			drawMatrix(deltaworld);

			if(act>=3&&act<12) {
				batch.setColor(0, 0, 0, darkness);
				drawSprite(blocks[0], 0, 0, 1440, 720);
				batch.setColor(1, 1, 1, 1);
			}

			if(crocomoved) {
				if(act!=8)
				drawSprite(croco);
				else drawSprite(crocoattack,croco.x-eyeX,croco.y-eyeY,croco.w,croco.h);
			}
			else
				drawSprite(crocosit,croco.x-eyeX,croco.y-eyeY,croco.w,croco.h);
			if(act!=9)
			drawSprite(dind);
			else
				drawSprite(dindattack,dind.x-eyeX, dind.y-eyeY,dind.w,dind.h);
			if(act>=3&&act<12)batch.setColor(1,1,1,1-darkness);
			drawKeys();
			if(act>=3&&act<12)batch.setColor(1,1,1,1);
			double mt = Math.sin(Math.PI/360*System.currentTimeMillis())*10;
			drawSprite(img_up,5025-eyeX,604-eyeY+(float)mt,172/1.5f,158/1.5f);

			if(act<10)
			drawSprite(spamton,4630-eyeX,304-eyeY-objectOffset,356,453);
			spamton.update();


			switch (act)
			{
				case 5:
				case 6:
					drawSprite(deltarunetp,23-interfaceoffset,118,111,430);
					crocostats.setXYWH(223,(int)(568+11+interfaceoffset+(62-randomint)),453,151);//61
					dindstats.setXYWH(223+628,(int)(568+11+interfaceoffset+randomint),453,151);
					drawSprite(crocostats);
					drawSprite(dindstats);
					break;

				case 10:
					drawSprite(deltaruneExplosion,4536-eyeX,399-eyeY,449,530);
				case 11:
				case 7:
				case 8:
				case 9:
					drawSprite(deltarunetp,23-interfaceoffset,118,111,430);
					crocostats.setXYWH(223,(int)(568+11+interfaceoffset+(62)),453,151);//61
					dindstats.setXYWH(223+628,(int)(568+11+interfaceoffset+randomint),453,151);
					drawSprite(crocostats);
					drawSprite(dindstats);
					break;
			}

			if(!bkproc&&act==0)
			{
				batch.setColor(0,0,0,darkness);
				drawSprite(blocks[0],0,0,1440,720);
				batch.setColor(1,1,1,1);
			}



		}

		if(scene==8)
		{
			for(star s:stars)drawSprite(spr_star,s.x,s.y,1,26);
			drawSprite(rocket,487+((float)Math.random()*5-10),17+((float)Math.random()*5-10),458,689);

			if(act>=6)
			{
				drawSprite(tablet,124,interfaceoffset,1179,720);
				btn_chat.setY((int)(49+interfaceoffset));
				if(newMessage)drawSprite(chatbuttonnew,btn_chat.getX(),btn_chat.getY(),btn_chat.getW(), btn_chat.getH());
				else
				drawSprite(btn_chat);
				//drawSprite(chatbutton,Mistener.tx,Mistener.ty,Mistener.dx,Mistener.dy);
				drawString("Кто самозванетс?",417-83,65+interfaceoffset,amogusfontbig);

				for(int i = 0; i<amogus.length;i++)
				{
					amogus[i].setXYWH(201+((i+1)%2==0?497:0),(int)(163+i/2*120+interfaceoffset),442,96);

				}
				for(amogususer a: amogus)
				{
					drawSprite(a);
					drawSprite(a.face,a.getX()+15,a.getY()+7+interfaceoffset,88,73);
					drawString(a.name,a.getX()+122,a.getY()+12+interfaceoffset,amogusfont);
					if(a.voted!=-1)
						drawSprite(ivoted,a.getX()-23,a.getY()-26+interfaceoffset,81,81);
					if(a.selected)
					{
						btn_vote.setXYWH(a.getX()+268,(int)(a.getY()+10+interfaceoffset),70,70);
						btn_reject.setXYWH(a.getX()+354,(int)(a.getY()+10+interfaceoffset),70,70);
					}
				}
				for(int i = 0; i<amogus.length;i++)
					if(amogus[i].selected) {
						drawSprite(btn_vote);
						drawSprite(btn_reject);
						break;
					}else if(i==amogus.length-1)
					{
						btn_vote.setXYWH(999,999,70,70);
						btn_reject.setXYWH(999,999,70,70);
					}

				if(act>41)
				{
					for(amogususer a: amogus)
					{
						for(int i = 0; ((i<a.votes.size())&&(i<acttime*2f));i++)
							drawSprite(a.votes.get(i).face,a.getX()+49*i+116,a.getY()+46,49,38);

					}
				}

				if(chatisopen)
				{
					drawSprite(amoguschat,177,64+interfaceoffset,964,602);

					for(int i = 0; i<messages.size()&&i<4;i++) {
						drawSprite(usertalk, 196 + (messages.get(i).user.you ? 129 : 0), 434 - i * 118, 726, 105);
						//drawString(messages.get(i).text,295+ (messages.get(i).user.you ? 129 : 0),485- i * 118,amogusfontsmallblack);
						if(messages.get(i).user.you)
						{layout.setText(amogusfontsmallblack,messages.get(i).text);
							drawSprite(messages.get(i).user.face,948+88,447- i * 118,-88,73);
							drawString(messages.get(i).user.name,744,444- i * 118,amogusfont);
							drawString(messages.get(i).text,911-layout.width,485- i * 118,amogusfontsmallblack);

						}else{
							drawSprite(messages.get(i).user.face,216,447- i * 118,88,73);
							drawString(messages.get(i).user.name,321,444- i * 118,amogusfont);
							drawString(messages.get(i).text,324,485- i * 118,amogusfontsmallblack);
							if(messages.get(i).user.voted!=-1)
							drawSprite(ivoted,196+19,434 - i * 118+interfaceoffset+50,40,40);
						}
					}
					btn_textfield.setY((int)(564+interfaceoffset));
					btn_sendmessage.setY((int)(73+interfaceoffset+503));
					drawSprite(btn_textfield);
					drawSprite(btn_sendmessage);
					drawString(typetext,210,587,amogusfontsmallblack);
				}

			}

			switch (act)
			{//Mistener.tx,Mistener.ty,Mistener.dx,Mistener.dy
				case 1:
					drawSprite(redscreen,0,0,1440,720);
				case 2:
					drawSprite(amogusattention,0,221-100,1440,298);
					break;
				case 3:
					drawSprite(amogusattention,0,221+100,1440,298);
				case 4:
					drawSprite(amogusattention,0,0,1440,720);
					drawSprite(emergencyMeeting,478,129,464,420);
					break;
				case 5:
					drawSprite(amogusattention,0,(720*objectOffset)/2f,1440,720-720*objectOffset);
					drawSprite(emergencyMeeting,478,129+(420*objectOffset)/2f,464,420-420*objectOffset);
					break;
				case 6:

					drawSprite(discusspic,342,51+interfaceoffset,662,626);
					//drawSprite(discusstext,382,88-objectOffset+interfaceoffset,549,158);
					break;
				case 7:
					drawSprite(discusspic,342,51,662,626);
					drawSprite(discusstext,382,88-objectOffset,549,158);

					break;

			}


			batch.setColor(0,0,0,darkness);
			drawSprite(blocks[0],0,0,1440,720);
			batch.setColor(1,1,1,1);

		}

		if(scene==9)
		{
			if(act<2) {
				if (act == 0)
					for (star s : stars) drawSprite(spr_star, s.x, s.y, 10, 10);
				else
					for (star s : stars) drawSprite(spr_star, s.x, s.y, 1, 1);

				if (act == 0)
					drawSprite(crocostay, objectOffset, 268, 105, 201);
				if (act == 1) {
					drawSprite(misteryPlanet, 787, 125, 459, 465);
					drawSprite(crocomini, objectOffset, 399, 10, 10);
				}


				batch.setColor(0, 0, 0, darkness);
				drawSprite(blocks[0], 0, 0, 1440, 720);
				batch.setColor(1, 1, 1, 1);
			}
		}

		if(scene==10)
		{
			drawSprite(memebg,0,0,1440,720);
			drawMatrix(memeworldBG);
			drawMatrix(memeworld);

			float mt = (float)(Math.sin(Math.PI/(360*5)*System.currentTimeMillis())*(croco.w));
			float mtc = (float)(Math.sin(Math.PI/(360*5)*(System.currentTimeMillis()-1))*(croco.w));

			drawSprite(ckeeper,3200-eyeX,178-eyeY,384,344);

			if(thereisdind)
			if(mt-mtc>=0)
			drawSprite(dindanfas,croco.x+croco.w/2f+mt-eyeX,croco.y-24-eyeY,37,82);

			drawSprite(croco);

			if(thereisdind)
			if(mt-mtc<0)
				drawSprite(dindanfas,croco.x+croco.w/2f+mt-eyeX,croco.y-24-eyeY,37,82);

			if(croco.x>=2588||croco.y<=20700)
			for(int i = 0; i<memesside1.length;i++)
			{
				drawSprite(memesside1[i],2192-eyeX,20496-eyeY-(128*4*i),400,400);
			}
			noescape.draw(batch,52,38,80);


			drawKeys();

			drawSprite(blocks[0],0,-objectOffset,1440,720/2f);
			drawSprite(blocks[0],0,720/2f+objectOffset,1440,720/2f);

		}

		if(scene==11)
		{

			drawSprite(overworldbg,0,0,1440,720);
			drawMatrix(overworld);

			for(int i = 0; i<cars.length;i++) {
				if(!cars[i].destroyed) {
					drawSprite(cars[i].img, 3231 - eyeX + i * 3000, 514 - eyeY, 801, 256);
					if(characterInRange(croco,3231+i*3000,514,3231+i*3000+801,605))
						drawSprite(xbutton,8592-5000+i*3000- eyeX,381- eyeY,90,90);
				}else
					drawSprite(deltaruneExplosion.getFrame(cars[i].time),3231 - eyeX + i * 3000+146,307-eyeY,536,525);


			}

			if(!blockcontrol||!x_got)
			drawSprite(croco);
			else
				drawSprite(crocoattack,croco.x-eyeX,croco.y-eyeY,croco.w,croco.h);

			drawSprite(blocks[0],0,croco.y+croco.h-eyeY,1440,500);

			double mt = Math.sin(Math.PI/(360*5)*System.currentTimeMillis())*10;

			if(!x_got)
			drawSprite(img_X,3231 - eyeX + cars.length * 3000,(int)(514+mt)-eyeY+87,172/1.5f,158/1.5f);


			drawKeys();


			if(inventoryIsOpen)
			{
				for (int i = 0; i < inventorybtn.length; i++) {
					inventorybtn[i].setXYWH(49 + 260 * i + 27, 139 + 70, 246, 246);
					drawSprite(inventorybtn[i]);
					if (inventory.size() > i)
						drawSprite(inventory.get(i), 49 + 260 * i + 27, 139 + 70, 246, 246);
				}
			}

			batch.setColor(0, 0, 0, darkness);
			drawSprite(blocks[0], 0, 0, 1440, 720);
			batch.setColor(1, 1, 1, 1f);
		}

		if(scene==12)
		{
			batch.setColor(1,1,1,darkness);
			drawSprite(win);
			batch.setColor(1,1,1,1);

			drawSprite(winwin,0,(720*interfaceoffset),1440,720);
			drawSprite(winpane,0,74*interfaceoffset,1440,720);


		}

		if(scene==13)
		{
			if(act==1)
			{
				drawSprite(roll,0,0,1440,720);
				drawSprite(rolltext,0,0,1440,720);
			}
			if(act>1)
			{
				drawSprite(gif_rickroll,151,0,1195,720);
				drawSprite(rickrolltext,0,0,1440,720);
				if(act==3)drawSprite(happybirthdaytext,0,0,1440,720);
			}

		}

		if(bkproc)
			blackKeyProcess();
		else
		{
			if(blackkey.isPlaying())
			{
				blackkey.pause();
				blackkey.setPosition(0);
			}
		}
		//debugText();




	}
	int hours=0,minutes=0;
	int escapecounter;
	void count()
	{


		if(scene==0)
		{
			if(sceneJustChanged)
			{
				sceneJustChanged=false;
				distraction.setPosition(-Gdx.graphics.getDeltaTime());
				distractionsong.play();
			}
			if(System.currentTimeMillis()>1659963600901L){scene=1;sceneJustChanged=true;distractionsong.pause();}
			distraction.update();
		}

		if (scene == 1)
		{

			if(sceneJustChanged)
			{
				disclaimer.open();
				icandoanything.setVolume(0.1f);
				icandoanything.play();
				timepassed-=Gdx.graphics.getDeltaTime();
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
				thereisdind=false;
				objectOffset=0;
				crocomoved=false;
				croco.yspeed=0;
				sceneJustChanged = false;
				demontower.setPosition(0);
				demontower.setVolume(1f);
				demontower.play();
				eyeX=2074-618+128*3;
				eyeY=2012-300+128*3;

				fall.play();
				croco.setPosition(2074+128*3,2140);
				effects.add(new Effect(falldust,croco.x,croco.y+81,100,100,1,0.2f,0.5f));//
				effects.add(new Effect(falldust,croco.x,croco.y+81,100,100,-1,0.2f,0.5f));//
				effects.add(new Effect(falldust,croco.x,croco.y+81,80,80,0.5f,0,0.5f));//
				effects.add(new Effect(falldust,croco.x,croco.y+81,80,80,-0.5f,0,0.5f));//
				croco.setMatrix(worldMatrix);
				act=0;
				acttime=0;
				interfaceoffset=105;
				blockcontrol=false;
				//loadMatrix("matrix/world1.txt");
			}

			if(blockcontrol&&x_got)
			{
				crocoattack.update();
				if(crocoattack.finished())blockcontrol=false;

			}

			if(thereisdind)
			{
				if(act==0||act==3) {
					dind.update();
					if (dind.x - croco.x < -200) {
						dind.xspeed = 10;
						dind.walkingright = true;
					} else dind.walkingright = false;

					if (dind.x - croco.x > 200) {
						dind.xspeed = -10;
						dind.walkingleft = true;
					} else dind.walkingleft = false;
				}
				switch (act)
				{
					case 1:
						if(demontower.isPlaying())
						{
							demontower.setVolume(demontower.getVolume()-0.01f);
							if(demontower.getVolume()<=0)demontower.stop();
						}else act++;
						break;
					case 2:
						sound_deltaruneexplosion.play();
						deltaruneExplosion.setPosition(0);
						for(int i = 0; i<3;i++)
						for(int j = 0; j<3;j++)
							worldMatrixBG[15+i][37+j]=0;
						act++;
						break;
					case 4:
						if(darkness<1f)
						{
							darkness+=0.1f;
						}else
						{
							changeScene(7);
						}
						break;
				}
			}

			if(!blockcontrol) {
				croco.walkingright = right.isPushed() && right_got;
				croco.walkingleft = left.isPushed() && left_got;
				if (right.isPushed() && right_got) {
					Graph.croco.xspeed = 10;
					crocomoved = true;
				}
				if (left.isPushed() && left_got) {
					Graph.croco.xspeed = -10;
					crocomoved = true;
				}
			}

			if(characterInRange(croco,4144.0,2140.0-10,4828.0,2140.0))
			{
				doortalk.update();
			}

			if(act!=5&&act!=6)
			moveToEye();

			if(croco.x+croco.w>5199+128*3&&!left_got){
				bkproc=true;
				nowkey = img_left;
				if(!blackkey.isPlaying())blackkey.play();
			}

			if(croco.y>2150&&croco.x<2458 )
			{
				if(darkness<1f)darkness+=0.025f;else changeScene(4);
				if(demontower.isPlaying())
				{
					if(demontower.getVolume()>0)demontower.setVolume(demontower.getVolume()-0.1f);else demontower.pause();
				}

			}

			if(act!=5&&act!=6)
			croco.update();

			switch (act)
			{
				case 5:
					startflight.play();
					demontower.pause();
					act++;
					acttime=0;
					break;
				case 6:
					objectOffset+=1f;
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>9){changeScene(8);}
					break;
			}

			shakescreen-=shakescreen*1.95f;

			if(croco.y<=291&&croco.x<=4221)
			{
				blockcontrol=true;
				darkness+=0.1f;

				if(demontower.isPlaying())
				{
					if(demontower.getVolume()<1f)demontower.setVolume(demontower.getVolume()-0.1f);
					else
						demontower.pause();
				}else
				if(darkness>=1)changeScene(11);
			}
		}

		if(scene==4)
		{
			if(sceneJustChanged)
			{
				croco.setPosition(2381,-500);
				sceneJustChanged=false;
				minecraftTheme.play();
				minecraftTheme.setLooping(true);
				eyeX=(int)croco.x-618;
				eyeY=(int)croco.y-300;
				croco.setMatrix(minecraftworld);
			}

			if(!blockcontrol)
			{
				croco.walkingright = right.isPushed() && right_got;
				croco.walkingleft = left.isPushed() && left_got;
				if (right.isPushed() && right_got && minecrafthp > 0) {
					if (croco.y <= 1372)
						Graph.croco.xspeed = 10;
					else
						Graph.croco.xspeed = 10 / 2f;
					crocomoved = true;

					if (act == 1) croco.xspeed = 3.5f;

					if (getBlock(croco.x, croco.y + croco.h + 10) == '=') {
						if (!grasstep.isPlaying()) grasstep.play();
					}
					if (getBlock(croco.x, croco.y + croco.h + 10) == '2') {
						if (!stonestep.isPlaying()) stonestep.play();
					}
				}


				if (left.isPushed() && left_got && minecrafthp > 0) {
					if (croco.y <= 1372)
						Graph.croco.xspeed = -10;
					else
						Graph.croco.xspeed = -10 / 2f;
					crocomoved = true;

					if (act == 1) croco.xspeed = -3.5f;
					if (getBlock(croco.x, croco.y + croco.h + 10) == '=') {
						if (!grasstep.isPlaying()) grasstep.play();
					}
					if (getBlock(croco.x, croco.y + croco.h + 10) == '2') {
						if (!stonestep.isPlaying()) stonestep.play();
					}
				}
			}else{
				croco.walkingright=false;
				croco.walkingleft=false;
			}

			if(croco.y>1372&&minecrafthp>0)
			{
				if(!burn.isPlaying()) {
					burn.play();
					minecrafthp-=100000f;
				}
				fire.update();

			}

			if(getBlock(croco.x,croco.y+croco.h+10)!='0')
				if(mine_firstland){
					mine_firstland=false;
					minecrafthp=0;
					minedamagefall.play();
					effects.add(new Effect(generic,croco.x+croco.w,croco.y+croco.h,100,100,0,-3,0.5f));
					effects.add(new Effect(generic,croco.x+croco.w+10,croco.y+croco.h,100,100,0,-2.5f,0.75f));
				}

			if(speedrun)
			{
				speedruntimer+=Gdx.graphics.getDeltaTime();
				if(speedruntimer>=60)
				{
					speedruntimer-=60;
					minutes++;
				}
				if(minutes>=60)
				{
					minutes-=60;
					hours++;
				}
			}

			if(act==0&&croco.x<=1436)
			{
				fuse.play();
				act++;
			}
			if(act==1)
			{
				if(darkness<1f)darkness+=0.025;
				acttime+=Gdx.graphics.getDeltaTime();
				if(acttime>=2)
				{
					act++;
					explosion.play();
					animExplosion.setPosition(0);
					croco.setPosition(croco.x,croco.y-100);
					minecrafthp=0;
					acttime=0;

				}
			}

			if(act==2)
			{
				if(darkness>0)darkness-=0.25f;
				animExplosion.update();

				if(minecrafthp>0)
				for(int i = 0; i<items.size();i++)
				{
					if(items.get(i).x+68>=croco.x)
					{
						inventory.add(items.get(i).img);
						items.remove(i);
						pop.play();
					}
				}

				if(croco.x>5318)
				{
					if(inventory.size()>=3) {
						blockcontrol = true;
						act++;
						acttime = 0;
					}
				}


			}

			switch (act)
			{
				case 3:

					fizz.play();
					lavaplace.play();
					minecraftworldlavaonly[12][43]=('I'-'0'-1);
					minecraftworld[12][43]=('I'-'0'-1);
					act++;
					break;
				case 10:
				case 8:
				case 6:
				case 4:
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>=0.5f){
					act++;
					acttime=0;
					}
					break;
				case 5:
					fizz.play();
					lavaplace.play();
					minecraftworldlavaonly[11][43]=('I'-'0'-1);
					act++;
					break;
				case 7:
					fizz.play();
					lavaplace.play();
					minecraftworldlavaonly[10][43]=('I'-'0'-1);
					act++;
					break;
				case 9:
					fizz.play();
					lavaplace.play();
					minecraftworldlavaonly[9][43]=('I'-'0'-1);
					inventory.set(2,emptybucket);
					act++;
					break;
				case 11:
					blockcontrol=false;
					ignite.play();
					portalsound.play();
					act++;
					acttime=0;
					break;
				case 12:
				if(croco.x>5540) {
					blockcontrol = true;
					act++;
					teleportation.play();
				}
					break;
				case 13:
					acttime+=Gdx.graphics.getDeltaTime();
					drawSprite(loadingminecraftBG,0,0,1440,720);
					drawString("Генерация мира...",515,329,minefont);
					if(acttime>=5)
					{
						act=0;
						changeScene();
						blockcontrol=false;
					}
					break;
			}


			croco.update();

			moveToEye();
		}

		if(scene==5)
		{
			if(sceneJustChanged)
			{
				croco.setPosition(640,476);
				croco.setMatrix(netherworld);
				sceneJustChanged=false;

				for(int i = 3;i<=11;i++)
				worldMatrix[18][i]='='-'0'-1;

				for(int i = 3;i<=10;i++)
					worldMatrix[19][i]='>'-'0'-1;
				for(int i = 3;i<=10;i++)
					worldMatrix[20][i]='>'-'0'-1;
				for(int i = 6;i<=8;i++)
					worldMatrix[17][i]='A'-'0'-1;

			}

			if(speedrun)
			{
				speedruntimer+=Gdx.graphics.getDeltaTime();
				if(speedruntimer>=60)
				{
					speedruntimer-=60;
					minutes++;
				}
				if(minutes>=60)
				{
					minutes-=60;
					hours++;
				}
			}

			croco.walkingright=right.isPushed()&&right_got;
			croco.walkingleft=left.isPushed()&&left_got;
			if(right.isPushed()&&right_got) {
				Graph.croco.xspeed = 10; crocomoved=true;
			}
			if(left.isPushed()&&left_got) {
				Graph.croco.xspeed = -10; crocomoved=true;
			}

			moveToEye();

			switch (act)
			{
				case 0:
					if(croco.x>=1441)
					{
						ghastmoan.play();
						act++;
					}
					break;
				case 1:
					if(croco.x>2772) {
						act++;
						fireattack.play();
						ghastattack.play();
					}
					break;
				case 2:
					fireballdist-=25;
					if(fireballdist<=0)
					{
						animExplosion.setPosition(0);
						explosion.play();
						croco.xspeed-=20;
						croco.yspeed-=30;
						croco.setMatrix(new int[][]{{}});
						act++;
						for(int i =0;i<7;i++)netherworld[6][26-i]=-1;
						for(int i = 0; i<5;i++)netherbgworld[5][25-i]=-1;
						minecrafthp-=8.5f;
					}
					break;

				case 3:
					animExplosion.update();
					if(croco.y/128>=21)
					{
						croco.yspeed=0;
						bkproc=true;
						nowkey = img_Z;
						if(!blackkey.isPlaying())blackkey.play();
					}

					break;
			}


			croco.update();
		}

		if(scene==6)
		{
			if(sceneJustChanged)
			{
				sceneJustChanged=false;
				demontower.pause();
				mus_dindkeeper.play();
				mus_dindkeeper.setLooping(true);
				act = 0;
				acttime=0;

			}

			switch (act)
			{
				case 1:
					mus_dindkeeper.stop();
					mus_dindkeeperactive.play();
					act++;
					break;
				case 2:
					if(acttime>=7)
					{
						if(darkness<1f)darkness+=0.015f;
					}
					acttime+=Gdx.graphics.getDeltaTime();
					acttime2+=Gdx.graphics.getDeltaTime();

					if(acttime2>=(7-acttime)/3)
					{
						acttime2=0;
						drawer/=1.65f;
						randomint=(int)(Math.random()*asianballs.length);
						randomintx = (int)(Math.random()*300);
						randominty = (int)(Math.random()*300);
					}
					if(acttime>=13.574532) {
						act++;
						darkness2=0;
						darkness=0;
						thereisdind=true;
						doortalk.text=new String[]{"Ты серьезно привела\nсюда азиата??!?!?!?!\nГДЕ ты его нашла???????"};
						dind.setMatrix(worldMatrix);
						dind.setPosition(croco.x,croco.y-(dind.h-croco.h));
					}
					//if(Mistener.onScreen)log(acttime);//
					break;
				case 3:

					if(darkness2<1f)
						darkness2+=0.01f;

					if(!mus_dindkeeperactive.isPlaying()) {
						darkness += 0.01f;
						if(darkness>=1)
						{
						acttime=0;
						act=0;
						scene=3;
						darkness2=0;
						darkness=0;
						demontower.setPosition(0);
						demontower.play();
						}
					}



					break;
			}

		}

		if(scene==7)
		{
			if(sceneJustChanged)
			{
				sceneJustChanged=false;
				croco.setMatrix(deltaworld);
				dind.setMatrix(deltaworld);
				croco.setPosition(955,604);
				dind.setPosition(8*128,4*128);
				act=0;
				objectOffset=500;
				acttime=0;
			}
			if(!bkproc&&act==0)
			{
				if(darkness>0)darkness-=0.1f;
			}
			if(act<3||act>=12) {
				croco.update();
				dind.update();
			}
			if(!blockcontrol&&(act<3||act>=12))
			{
				croco.walkingright = right.isPushed() && right_got;
				croco.walkingleft = left.isPushed() && left_got;
				if (right.isPushed() && right_got) {
					Graph.croco.xspeed = 10;
					crocomoved = true;
				}
				if (left.isPushed() && left_got) {
					Graph.croco.xspeed = -10;
					crocomoved = true;
				}
			}

			if (dind.x - croco.x < -200) {
				dind.xspeed = 10;
				dind.walkingright = true;
			} else dind.walkingright = false;

			if (dind.x - croco.x > 200) {
				dind.xspeed = -10;
				dind.walkingleft = true;
			} else dind.walkingleft = false;

			if(croco.x+croco.w>=5025&&!bkproc)
			{
				bkproc=true;
				nowkey = img_up;
				if(!blackkey.isPlaying())blackkey.play();
			}

			switch (act){
				case 0:
				if(croco.x>=4654) {
					act++;
					spamtonlaugh.play();
					darkness=0;
					acttime=0;
				}
					break;
				case 1:
					if(objectOffset>0)
					{
						objectOffset-=50;
					}else {

						act++;
						blockcontrol=true;
						croco.xspeed=-30;
						crocomoved=false;
						acttime=0;
					}
					break;

				case 2:
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>=4.5f)
					{
						deltarunestartfight.play();
						act++;
						crocomoved=true;
						croco.walkingright=false;
						croco.walkingleft=false;
						acttime=0;

					}
					break;
				case 3:
					acttime+=Gdx.graphics.getDeltaTime();
					if(darkness<1)darkness+=0.05f;

					if(croco.x>4318-387)croco.x-=Math.abs(croco.x-(4318-387))/10;
					if(croco.y>604-192)croco.y-=Math.abs(croco.y-(604-192))/10;

					if(dind.x>3928-52)dind.x-=Math.abs(dind.x-(3928-52))/10;
					if(dind.y<409+302)dind.y+=Math.abs(dind.y-(409+302))/10;
					if(acttime>=1) {
						acttime=0;
						act++;
					}
					break;
				case 4:
					spamtonneo.play();
					spamtonneo.setLooping(true);
					act++;
					interfaceoffset=300;
					randomint=62;
					break;
				case 5:
					if(interfaceoffset>0)interfaceoffset-=50;
					break;
				case 6:
					if(randomint>0)randomint-=10;
					break;
				case 7:
					if(randomint<62)randomint+=10;else {act++;sound_crocoattack.play();}
					break;
				case 8:
					crocoattack.update();
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>2){act++;acttime=0;crocoattack.setPosition(0);}
					break;
				case 9:
					dindattack.update();
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>=2){
						spamtonneo.stop();
						sound_deltaruneexplosion.play();
						deltaruneExplosion.setPosition(0);
						act++;
						acttime=0;
					}
					break;
				case 10:
					deltaruneExplosion.update();
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>=5)
					{
						deltaruneExplosion.setPosition(0);
						act++;
						acttime=0;
						doortalk.text=new String[]{"хахаха\nтеперь твой азиат у меня!!"};
						for(int i = 0; i<3;i++)
							for(int j = 0; j<3;j++)
								worldMatrixBG[15+i][37+j]=2;

					}
					break;
				case 11:
					int count = 0;
					if(interfaceoffset<300)interfaceoffset+=50;else count++;
					if(darkness>0)darkness-=0.1f;else count++;
					if(croco.y<600)croco.y+=10;else count++;
					if(dind.y>604-(dind.h-croco.h))dind.y-=10;else count++;
					if(count>=4) {
						act++;blockcontrol=false;
					}
					break;


			}

			if(act<3||act>=12)
			moveToEye();
		}

		if(scene==8)
		{
			if(sceneJustChanged)
			{
				sceneJustChanged=false;
				act=0;
				acttime=0;
				objectOffset=0;
				interfaceoffset=720;
				darkness=0;
			}

			for(int i = 0; i<stars.length;i++){stars[i].y+=20;if(stars[i].outOfBounds())stars[i]=new star();}

			if(chatisopen)newMessage=false;
			switch (act)
			{
				case 0:
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>=8.3f)
					{
						act++;
						emergency.play();
						acttime=0;
					}
					break;
				case 1:
				case 2:
				case 3:
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>=0.1f)
					{
						act++;
						acttime=0;
					}
					break;
				case 4:
					acttime+=Gdx.graphics.getDeltaTime();
					if(acttime>=0.5f)
					{
						act++;
						acttime=0;
					}
					break;
				case 5:
					if(objectOffset<1)objectOffset+=0.1f; else {
						act++;
						acttime=0;
					}
					break;
				case 6:
					if(interfaceoffset>0)interfaceoffset-=24;//else act++;
					objectOffset=252;
					updacttime();
					if(acttime>=0.8){
						acttime=0;
						act++;
						interfaceoffset=0;
					}
					break;
				case 7:
					if(objectOffset>0)objectOffset-=28;
					updacttime();
					if(waitAct(3))
						nextAct();
					break;
				case 8:
					sendMessage("green","ВЫ ЖЕ ТОЖЕ ЭТО ВИДЕЛИ ДА");
					nextAct();
					break;

				case 9:
				case 22:
				case 13:
				case 17:
					updacttime();
					if(waitAct(2f))nextAct();
					break;
				case 10:
					sendMessage("cyan","где");
					nextAct();
					break;
				case 11:
				case 39:
				case 37:
				case 33:
				case 30:
				case 19:
				case 28:
					updacttime();
					if(waitAct(1f))nextAct();
					break;
				case 12:
					sendMessage("pink","кто");
					nextAct();
					break;
				case 14:
					sendMessage("blue","а давате в прятки");
					nextAct();
					break;
				case 15:
					updacttime();
					if(waitAct(4f))nextAct();
					break;
				case 16:
					sendMessage("red","крококов сус");
					nextAct();
					break;
				case 18:
					sendMessage("cyan","рял");
					nextAct();
					break;
				case 20:
					vote(amogus[1],amogus[3]);nextAct();
					break;
				case 21:
					nextAct();
					break;
				case 23:
					sendMessage("red","СТОЙ НЕТ Я ПОШУТИЛ");
					nextAct();
					break;
				case 24:
				case 35:
					updacttime();
					if(waitAct(3f))nextAct();
					break;
				case 25:
					sendMessage("green","ГОУБОЙ БУкВАЛЬНО ПРЫГУЛ У ВСЕХ НА ВиДУ В ВЕНТ");
					nextAct();
					break;
				case 26:
					updacttime();
					if(waitAct(5f))nextAct();
					break;
				case 27:
					sendMessage("pink","кроко рял сус");
					nextAct();
					break;
				case 29:
					vote(amogus[5],amogus[3]);nextAct();
					break;
				case 31:
					vote(amogus[4],amogus[0]);nextAct();
					break;
				case 32:
					sendMessage("green","короче вы сами все видели голосуем за кеккука!!");
					nextAct();
					break;
				case 34:
					vote(amogus[0],amogus[1]);nextAct();
					break;
				case 36:
					sendMessage("red","лол кроко так кроко");
					nextAct();
					break;
				case 38:
					vote(amogus[2],amogus[3]);nextAct();
					break;
				case 40:
					sendMessage("cyan","сам ты кеккук я кексик заколебали");
					nextAct();
					break;
				case 41:
					if(amogus[3].voted!=-1)nextAct();
					break;
				case 42:
					updacttime();
					if(waitAct(5))nextAct();
					break;
				case 43:
					if(darkness<1)darkness+=0.1f;else changeScene();
					break;

			}

		}

		if(scene==9)
		{
			if(sceneJustChanged)
			{
				sceneJustChanged=false;
				eject.play();
				for(int i = 0; i<100;i++)stars[i]=new star(true);
				darkness=1;
				act=0;
				objectOffset=-505;
			}
			if(darkness>0)darkness-=0.1f;
			switch (act)
			{
				case 0:
					if(objectOffset<786)objectOffset+=5;else {
						act++;
						for(int i = 0; i<100;i++)stars[i]=new star(true);
						objectOffset=66;
					}
					break;
				case 1:
					if(objectOffset<849)
						objectOffset+=2;
					else {
						darkness=1;
						nextAct();
					}
					break;
				case  2:
					updacttime();
					if(waitAct(3))changeScene();
					break;
			}
		}

		if(scene==10)
		{
			if(sceneJustChanged)
			{
				sceneJustChanged=false;
				act=0;
				acttime=0;
				croco.setPosition(1851,21212);
				croco.setMatrix(memeworld);
				eyeX=(int)(croco.x-618);
				eyeY=(int)(croco.y-300);
				memeland.play();
				memeland.setLooping(true);
				objectOffset=0;
			}
			if(objectOffset<720f/2f)objectOffset+=20;
			croco.walkingright=right.isPushed()&&right_got;
			croco.walkingleft=left.isPushed()&&left_got;
			if(right.isPushed()&&right_got) {
				Graph.croco.xspeed = 10; crocomoved=true;
			}
			if(left.isPushed()&&left_got) {
				Graph.croco.xspeed = -10; crocomoved=true;
			}

			croco.update();
			moveToEye();
			if(croco.x<=1830-128&&croco.y>=21212){
				croco.x+=128;
				eyeX+=128;
				escapecounter++;
			}

			if(escapecounter>=20) {
				if (characterInRange(croco, 1830 - 128, 21210, 1831, 21220)) {
					if (noescape.isOpened) {
						noescape.update();
					} else {
						noescape.open();
					}
					noescape.x = (int) (croco.x - noescape.w-eyeX);
					noescape.y = (int) (croco.y - noescape.h-eyeY);
				}else noescape.close();
			}else{
				noescape.close();
			}

			if(escapecounter==40)
			{
				noescape.text=new String[]{"серьезно, прекращай"};
				noescape.open();
			}

			if(escapecounter==60)
			{
				noescape.text=new String[]{"если я дам тебе динда,\nты успокоишься?"};
				noescape.open();
			}

			if(escapecounter==80)
			{
				noescape.text=new String[]{"на"};
				thereisdind=true;
				noescape.open();
			}

			if(escapecounter==100)
			{
				noescape.text=new String[]{"лезь наверх,\nя тебе мемы нашел"};
				noescape.open();

			}

			if(escapecounter==120)
			{
				noescape.text=new String[]{"-артем-"};
				noescape.open();

			}


			if(croco.x>=3192){
				bkproc=true;
				nowkey = img_C;
				if(!blackkey.isPlaying())blackkey.play();
			}
		}

		if(scene==11)
		{
			if(sceneJustChanged)
			{
				darkness=1;
				lofi.setPosition(0);
				lofi.setVolume(1f);
				lofi.play();
				lofi.setLooping(true);
				sceneJustChanged=false;
				croco.setPosition(200,604);
				croco.setMatrix(new int[][]{{}});
				eyeX=(int)croco.x-618;
				eyeY=(int)croco.y-300;

			}
			if(!blockcontrol) {
				croco.walkingright = right.isPushed() && right_got;
				croco.walkingleft = left.isPushed() && left_got;
				if (right.isPushed() && right_got) {
					Graph.croco.xspeed = 10;
					crocomoved = true;
				}
				if (left.isPushed() && left_got) {
					Graph.croco.xspeed = -10;
					crocomoved = true;
				}
			}
			croco.update();
			moveToEye();


			if(blockcontrol)
			{
				crocoattack.update();
				if(crocoattack.finished())blockcontrol=false;

			}

			for(car c: cars)if(c.destroyed)c.update();

			if(croco.x+croco.w>0&&croco.y>604) {
				croco.y = 604;
				croco.yspeed=0;

			}

			if(croco.x+croco.w>=3231 + cars.length * 3000)
			{
				if(!x_got) {
					bkproc = true;
					nowkey = img_X;
					if (!blackkey.isPlaying()) blackkey.play();
				}else{
					blockcontrol=true;
					darkness+=0.1f;
					if(darkness>=1&&!bkproc){
						scene=3;
						croco.setMatrix(worldMatrix);
						croco.setPosition(4224,-333);
						darkness=0;
						demontower.setVolume(1f);
						demontower.setPosition(0);
						demontower.play();
						eyeX=(int)croco.x-618;
						eyeY=(int)croco.y-300;
						blockcontrol=false;
						lofi.pause();
					}
				}
			}

			if(croco.y>604)
			{

				darkness+=0.05f;
				if(lofi.isPlaying())
				{
					lofi.setVolume(lofi.getVolume()-0.01f);
					if(lofi.getVolume()<=0)lofi.pause();
				}else if(darkness>=1&&!bkproc)
				{
					scene=3;
					croco.setMatrix(worldMatrix);
					croco.setPosition(4224,-333);
					darkness=0;
					demontower.setVolume(1f);
					demontower.setPosition(0);
					demontower.play();
					eyeX=(int)croco.x-618;
					eyeY=(int)croco.y-300;
					blockcontrol=false;
				}
			}else {
				if(darkness>=0f&&!bkproc)darkness-=0.05f;
			}

			eyeY=256;
		}

		if(scene==12)
		{
			if(sceneJustChanged)
			{
				darkness=0;
				interfaceoffset=1;
				act=0;
				acttime=0;
				sceneJustChanged=false;
			}

			switch (act)
			{
				case 0:
					if(demontower.isPlaying())
					{
						demontower.setVolume(demontower.getVolume()-0.01f);
						if(demontower.getVolume()<=0)demontower.stop();
					}else act++;

					break;
				case 1:
					darkness+=0.01f;
					if(darkness>=1)act++;
					break;
				case 3:
					if(interfaceoffset>0)
					interfaceoffset/=1.5f;
					break;
			}

		}

		if(scene==13)
		{
			if(sceneJustChanged)
			{
				sceneJustChanged=false;
				act=0;
				acttime=0;
			}

			switch (act)
			{
				case 0:
					updacttime();
					if(waitAct(3))nextAct();
					break;
				case 1:
					updacttime();
					if(waitAct(3))
					{
						rickroll.play();
						nextAct();
					}
					break;
				case 2:
					updacttime();
					if(waitAct(5))nextAct();
					break;
			}
			if(act>1)
			gif_rickroll.update();
		}
	}

	int bkact=0;

	void blackKeyProcess()
	{
		if(bkact<=1) {
			if (blackkey.isPlaying()) {
				if (demontower.isPlaying()) {
					if (demontower.getVolume() > 0)
						demontower.setVolume(demontower.getVolume() - 0.1f);
					else demontower.pause();
				}

				if (speedrunTheme.isPlaying()) {
					if (speedrunTheme.getVolume() > 0)
						speedrunTheme.setVolume(speedrunTheme.getVolume() - 0.1f);
					else {
						speedrunTheme.stop();
						speedrunTheme.dispose();
						explosion.dispose();
						ghastattack.dispose();
						fireattack.dispose();
						grasstep.dispose();
						stonestep.dispose();
						pop.dispose();
						lavaplace.dispose();
						fizz.dispose();
					}
				}
				if(memeland.isPlaying())
				{
					if (memeland.getVolume() > 0)
						memeland.setVolume(memeland.getVolume() - 0.1f);
					else memeland.dispose();
				}
				if (lofi.isPlaying()) {
					if (lofi.getVolume() > 0)
						lofi.setVolume(lofi.getVolume() - 0.1f);
					else lofi.pause();
				}
			}

		}

		switch (bkact)
		{
			case 0:
				//затемнить экран, затушить музыку
				if(darkness<1f)darkness+=0.1f;
				darkness2=0;
				batch.setColor(1,1,1,darkness);
				drawSprite(blocks[0],0,0,1440,720);
				if(blackkey.getPosition()>=1.5f)
					bkact++;
				break;
			case 1:
				//плавно появить кнопку
				if (darkness2 < 1) darkness2 += 0.1f;
				batch.setColor(1,1,1,darkness);
				drawSprite(blocks[0],0,0,1440,720);
				batch.setColor(1,1,1,darkness2);
				drawSprite(nowkey,629,270,191,182);
				if(!blackkey.isPlaying()) {
					if(scene==3)left_got=true;
					if(scene==5)z_got=true;
					if(scene==7) {
						up_got = true;thereisdind=false;
					}
					if(scene==10) {
						c_got = true;
						totheX.text=new String[]{"Ракета на планету Х\n...\nаче всмысле"};
					}
					if(scene==11)
					{
						x_got=true;
					}
					bkact++;
				}
				break;
			case 2:
				if(darkness2>0)darkness2-=0.1f;else {
					bkact++;changeScene(3);
				}
				batch.setColor(1,1,1,darkness);
				drawSprite(blocks[0],0,0,1440,720);
				batch.setColor(1,1,1,darkness2);
				drawSprite(nowkey,629,270,191,182);
				interfaceoffset=105;
				break;
			case 3:
				batch.setColor(1,1,1,darkness);
				drawSprite(blocks[0],0,0,1440,720);
				if(darkness>0)darkness-=0.1f; else {
					bkproc = false;bkact=0;
				}
				break;

		}



		batch.setColor(1,1,1,1f);
	}

	boolean mine_firstland=true;

	float objectOffset=0;
	int randomint = 0;
	int randomintx = 0;
	int randominty = 0;
	static int act = 0;
	float acttime=0;
	float acttime2=0;
	float drawer=2;
	float fireballdist=1000;
	Texture nowkey;
	float darkness2=0f;
	boolean bkproc= false;
	static boolean sceneJustChanged = true;
	@Override
	public void dispose () {
		batch.dispose();
		mainfont.dispose();
		mainfontsmal.dispose();
		undertalefont.dispose();
		minefont.dispose();
		minefontbig.dispose();
		amogusfontbig.dispose();
		amogusfont.dispose();
		amogusfontsmallblack.dispose();
		amogusfontsmallwhite.dispose();



		maindialog.dispose();
		jevil.dispose();
		crocowalk.dispose();
		for(int i = 0; i<animblocks.length;i++)animblocks[i].dispose();
		crocodie.dispose();
		animExplosion.dispose();
		fire.dispose();
		crocoattack.dispose();
		dindattack.dispose();
		dindwalk.dispose();
		deltaruneExplosion.dispose();
		spamton.dispose();
		gif_rickroll.dispose();

		storypic.dispose();
		img_X.dispose();
		img_Z.dispose();
		img_C.dispose();
		img_right.dispose();
		img_up.dispose();
		img_left.dispose();
		img_win.dispose();
		for(int i = 0; i<blocks.length;i++)blocks[i].dispose();
		crocostay.dispose();
		falldust.dispose();
		zbutton.dispose();
		xbutton.dispose();
		cbutton.dispose();
		crocosit.dispose();
		minecraftInventory.dispose();
		minecraftHeart.dispose();
		minecraftHalfHeart.dispose();
		minecraftEmptyHeart.dispose();
		minecraftWhiteEmptyHeart.dispose();
		minecraftFood.dispose();
		minecraftExperience.dispose();
		cavebg.dispose();
		minecraftbg.dispose();
		generic.dispose();
		redscreen.dispose();
		blackscreen.dispose();
		whitescreen.dispose();
		img_respawn.dispose();
		img_respawn_pressed.dispose();
		creeper.dispose();
		whitecreeper.dispose();
		waterbucket.dispose();
		emptybucket.dispose();
		seeds.dispose();
		flintandsteel.dispose();
		stick.dispose();
		iron.dispose();
		firecharge.dispose();
		loadingminecraftBG.dispose();
		netherbg.dispose();
		money.dispose();
		for(int i = 0; i<asianballs.length;i++)asianballs[i].dispose();
		dindstay.dispose();
		dindanfas.dispose();
		dindkeeperinactive.dispose();
		dindkeeperactive.dispose();
		dindrare.dispose();
		desinger3000.dispose();
		deltarunetp.dispose();
		deltarunestatscroco.dispose();
		deltarunestatsdind.dispose();
		for(int i = 0; i<puller.length;i++)puller[0].dispose();
		rocket.dispose();
		vote.dispose();
		novote.dispose();
		textfield.dispose();
		usertalk.dispose();
		sendmessage.dispose();
		ivoted.dispose();
		emergencyMeeting.dispose();
		discusstext.dispose();
		discusspic.dispose();
		chatbutton.dispose();
		chatbuttonnew.dispose();
		amoguschat.dispose();
		amogusattention.dispose();
		amogusvotething.dispose();
		tablet.dispose();
		amogusdarkness.dispose();
		for(int i = 0; i<amoguses.length;i++)amoguses[i].dispose();
		spr_star.dispose();
		misteryPlanet.dispose();
		crocomini.dispose();
		for(int i = 0; i<memesside1.length;i++)memesside1[i].dispose();
		memebg.dispose();
		ckeeper.dispose();
		invslotgray.dispose();
		invslotgreen.dispose();
		overworldbg.dispose();
		winpane.dispose();
		winwin.dispose();
		rickrolltext.dispose();
		roll.dispose();
		rolltext.dispose();
		happybirthdaytext.dispose();




		icandoanything.dispose();
		onceuponatime.dispose();
		demontower.dispose();
		blackkey.dispose();
		lofi.dispose();
		rickroll.dispose();
		minecraftTheme.dispose();
		speedrunTheme.dispose();
		mus_dindkeeper.dispose();
		mus_dindkeeperactive.dispose();
		spamtonlaugh.dispose();
		deltarunestartfight.dispose();
		spamtonneo.dispose();
		startflight.dispose();
		emergency.dispose();
		eject.dispose();
		memeland.dispose();




		grasstep.dispose();
		stonestep.dispose();
		burn.dispose();

		fall.dispose();
		minedamagefall.dispose();
		explosion.dispose();
		fuse.dispose();
		ghastattack.dispose();
		ghastmoan.dispose();
		fireattack.dispose();
		pop.dispose();
		ignite.dispose();
		lavaplace.dispose();
		fizz.dispose();
		portalsound.dispose();
		teleportation.dispose();
		sound_deltaruneexplosion.dispose();
		sound_crocoattack.dispose();
		deltaclick.dispose();
		mineclick.dispose();
		amongus_pop.dispose();
		glassbreak.dispose();
		doorboom.dispose();
		pullerset.dispose();
		votetimer.dispose();
		votelock.dispose();


	}

	static boolean characterInRange(Character c, double x1, double y1, double x2, double y2)
	{
		return (c.x>=x1&&c.x<=x2&&c.y>=y1&&c.y<=y2);
	}

	static int eyeX=2074-618;
	static int eyeY=2012-300;
	void moveToEye()
	{
		eyeX-=(eyeX-croco.x+618)/2;
		if(eyeX<0)eyeX=0;
		eyeY-=(eyeY-croco.y+300)/2;
		if(eyeY<0)eyeY=0;
	}

	void drawMatrix(int [][] matrix)
	{
		for(int i = 0; i<matrix.length;i++)
		for(int j = 0; j<matrix[i].length;j++)
			if(matrix[i][j]>=0)
				if(128*j-eyeX+128>=0&&128*j-eyeX<=1440)
					if(128*i-eyeY+128>=0&&128*i-eyeY<=720)
						if(matrix[i][j]+'0'<('a'-1))
							drawSprite(blocks[matrix[i][j]],128*j-eyeX,128*i-eyeY+shakescreen,128,128);
						else {
							drawSprite(animblocks[matrix[i][j] - 48], 128 * j - eyeX, 128 * i - eyeY, 128, 128);
							animblocks[matrix[i][j] - 48].update();
						}

	}

	int getBlock(float x, float y)
	{
		if(inBound(x/128,y/128))
		return Character.matrix[(int)((y)/128)][(int)((x)/128)]+'0'+1;
		else
			return '0';
	}
	boolean inBound(float x, float y)
	{
		return (y>=0&&y<Character.matrix.length)&&(x>=0&&x<Character.matrix[(int)y].length);
	}

	void drawKeys()
	{
			//log(croco.x+","+croco.y);
		if(left_got)drawSprite(left);
		if(right_got)drawSprite(right);
		if(up_got)drawSprite(up);
		if(z_got)drawSprite(Z);
		if(x_got)drawSprite(X);
		if(c_got)drawSprite(C);
//log(darkness);
		//drawSprite(money,1031,20+interfaceoffset-105,373,75);

	//	logMistener();
	}
	float interfaceoffset=105;
	static float minecrafthp=10f;
	float damagedelay=0;
	void drawMinecraftInterface()
	{

		if((croco.x<=1486&&croco.y>604)&&scene==3) {
			if (interfaceoffset > 0) interfaceoffset /=1.2;

		}else if(interfaceoffset<105)interfaceoffset+=5f;
		if(scene==4||scene==5)interfaceoffset=0;
		drawSprite(minecraftInventory,507,646+interfaceoffset,541,71);

		for(int i = 0; i<inventory.size();i++)
			drawSprite(inventory.get(i),507+9+(i*60),646+interfaceoffset+11,47,47);


		drawSprite(minecraftExperience,507,646+interfaceoffset-31,541,71/4.4f);
		//Mistener.tx,Mistener.ty,Mistener.dx,Mistener.dy
		for(int i = 0; i<10;i++) {
			drawSprite(minecraftEmptyHeart, 35 + 42 * i-(interfaceoffset*5), 17, 42, 42);
			if(i<minecrafthp)
			drawSprite(minecraftHeart, 35 + 42 * i-(interfaceoffset*5), 17, 42, 42);
			else
				if(Math.round(minecrafthp)==(i+1))
					drawSprite(minecraftHalfHeart, 35 + 42 * i-(interfaceoffset*5), 17, 42, 42);

			drawSprite(minecraftFood, 996 + 42 * i+(interfaceoffset*5), 17, 42, 42);
		}

	}

	void drawEffects()
	{
		for(int i = 0; i<effects.size();i++)
		{
			effects.get(i).draw();
			//drawSprite(effects.get(i).anim,effects.get(i).x-eyeX,effects.get(i).y-eyeY,100,100);
			effects.get(i).update();
			if(effects.get(i).destroy)
				effects.remove(i);
		}
	}

	void drawSprite(Texture img, float x, float y,float w, float h){
		if(x+w>=0&&x<=1440&&y+h>=0&&y<=720)
		batch.draw(img, x*mnX, (720-y-h)*mnY,w*mnX,h*mnY);
	}

	void drawSprite(Animation img, float x, float y,float w, float h){
		batch.draw(img.getFrame(), x*mnX, (720-y-h)*mnY,w*mnX,h*mnY);
	}

	void drawSprite(Character img){
		if(img.walkingright)
		drawSprite(img.walk,img.x-eyeX,img.y-eyeY+shakescreen,img.w,img.h);
		else
		if(img.walkingleft)
			drawSprite(img.walk,img.w+img.x-eyeX,img.y-eyeY+shakescreen,-img.w,img.h);
		else
			drawSprite(img.stay,img.x-eyeX,img.y-eyeY+shakescreen,img.w,img.h);
	}

	void drawSprite(Button but){
		if(but.isPushed())
			batch.draw(but.getTexture(), (but.getX()+ but.getDepth())*mnX,(720-but.getH()-but.getY()-but.getDepth())*mnY,(but.getW()-but.getDepth()*2)*mnX,(but.getH()-but.getDepth()*2)*mnY);
		else
			batch.draw(but.getTexture(), but.getX()*mnX,(720-but.getH()-but.getY())*mnY,but.getW()*mnX,but.getH()*mnY);
	}

	static void changeScene()
	{
		scene++;
		sceneJustChanged=true;
	}

	static void changeScene(int n)
	{
		scene=n;
		sceneJustChanged=true;
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

	private BitmapFont generateFont(String fontName, float sizeX, float sizeY, Color color,float borderWidth, Color bordercolor) {

		String RUSSIAN_CHARACTERS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
				+ "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
				+ "1234567890.,:;_¡¿?\"'+-*/()[]={}<>!"+
				"abcdefghijklmnopqrstuvwxyz" +
				"ABCDEFGHIJGKLMNOPQURSTUVWXYZ";


		// Configure font parameters
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.characters =RUSSIAN_CHARACTERS;
		parameter.size = 24;
		parameter.borderColor = bordercolor;
		parameter.borderWidth = borderWidth;
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

	void logMistenerEye()
	{
		System.out.println((Mistener.tx+eyeX)+","+(Mistener.ty+eyeY)+","+Mistener.dx+","+Mistener.dy);
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

	int[][] loadMatrix(String path)
	{
		char[] world = Gdx.files.internal(path).readString().toCharArray();

		//узнать размер по x
		int x = 0;
		for(; world[x]!='\n';x++);
		//узнать размер по y
		int y = 1;
		for(int i = 0; i<world.length;i++)if(world[i]=='\n')y++;
		//создать матрицу
		int[][] matrix = new int[y][x];

		int i=0,j=0;
		for(int k = 0;k<world.length;k++)
		{
			if(world[k]=='\n'){
				i++;
				j=0;
			}else{
			matrix[i][j]=world[k]-'0'-1;
			j++;}
		}


		return matrix;
	}


	void debugText()
	{
		drawString(croco.x+";"+croco.y+": "+minecrafthp,30,30,mainfontsmal);
		drawString(Mistener.tx+";"+Mistener.ty+";"+Mistener.dx+";"+Mistener.dy,30,60,mainfontsmal);
		drawString("("+(Mistener.tx+eyeX)+";"+(Mistener.ty+eyeY)+"):("+((int)((Mistener.tx+eyeX)/128f))+";"+((int)((Mistener.ty+eyeY)/128f))+")",30,90,mainfontsmal);
		drawString("("+(darkness)+";"+(darkness2)+"):"+acttime+"("+act+"):"+scene,30,120,mainfontsmal);
		drawString("("+interfaceoffset+")",30,150,mainfontsmal);
	}

	void play(Music mus)
	{
		do{
			mus.play();
		}while(!mus.isPlaying());
	}


	void sendMessage(String color, String text)
	{
		int n=0;
		switch (color)
		{
			case "green":
				n=0;
				break;
			case "cyan":
				n=1;
				break;
			case "red":
				n=2;
				break;
			case "yellow":
				n=3;
				break;
			case "blue":
				n=4;
				break;
			case "pink":
				n=5;
				break;
		}
		messages.add(0,new message(amogus[n], text));
		amongus_pop.play();
		newMessage=true;
	}

	void vote(amogususer who, amogususer whom)
	{
		whom.votes.add(who);
		who.voted=1;
		votelock.play();
	}

	void updacttime()
	{
		acttime+=Gdx.graphics.getDeltaTime();
	}

	void nextAct()
	{
		act++;
		acttime=0;
	}

	boolean waitAct(float time)
	{
		return acttime>=time;
	}

}
