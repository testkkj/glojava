package extra.chap07_07;


public abstract class Unit {
	int x, y;
	public abstract void move (int x, int y);
	public abstract void stop();
	

}

class Marine extends Unit{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	void strimPack() {}
}

class Tank extends Unit{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
	void changeMode() {}
	
}

class Dropship extends Unit {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	 void load() {}
	 
	 void unload() {}
}