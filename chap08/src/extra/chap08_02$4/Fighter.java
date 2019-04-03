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
	
	public static void main(String[] args) {
		Fighter fighter = new Fighter();
		
		if(fighter instanceof Object) {
			System.out.println("fighter 객체는 Object 클래스의 자손입니다.");
		}
		if(fighter instanceof Unit) {
			System.out.println("fighter 객체는 Unit 클래스의 자손입니다.");
		}
		if(fighter instanceof Moveable) {
			System.out.println("fighter 객체는 Moveable 인터페이스를 구현 했습니다.");
		}
		if(fighter instanceof Attackable) {
			System.out.println("fighter 객체는 Attackable 인터페이스를 구현 했습니다.");
		}
		if(fighter instanceof Fightable) {
			System.out.println("fighter 객체는 Fightable 인터페이스를 구현 했습니다.");
		}
	}

}
