package extra.chap08_02$4;

public class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void printl() {
		System.out.println("객체는 Unit 클래스의 자손입니다.");
	}

	@Override
	public void printl1() {
		System.out.println("객체는 Moveable 인터페이스를 구현했습니다.");
		
	}

	@Override
	public void printl2() {
		System.out.println("객체는 Attackable 인터페이스를 구현했습니다.");
		
	}

}
