package behavior.templatemethod;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("유리벽을 만듭니다.");
		
	}

	@Override
	public void buildPillars() {
		System.out.println("유리기둥을 만듭니다.");
		
	}

	
	
	
}
