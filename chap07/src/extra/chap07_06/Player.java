package extra.chap07_06;

public abstract class Player {
	abstract void play(int pos);
	abstract void stop();

}

class AudioPlayer extends Player{

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}

}

abstract class CdPlayer extends Player{
	void stop() {}
}
