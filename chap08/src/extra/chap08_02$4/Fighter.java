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
			System.out.println("fighter ��ü�� Object Ŭ������ �ڼ��Դϴ�.");
		}
		if(fighter instanceof Unit) {
			System.out.println("fighter ��ü�� Unit Ŭ������ �ڼ��Դϴ�.");
		}
		if(fighter instanceof Moveable) {
			System.out.println("fighter ��ü�� Moveable �������̽��� ���� �߽��ϴ�.");
		}
		if(fighter instanceof Attackable) {
			System.out.println("fighter ��ü�� Attackable �������̽��� ���� �߽��ϴ�.");
		}
		if(fighter instanceof Fightable) {
			System.out.println("fighter ��ü�� Fightable �������̽��� ���� �߽��ϴ�.");
		}
	}

}
