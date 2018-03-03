package geometria;

public class Rectangulo implements Figura {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.abs((x1-x2)) * Math.abs((y1-y2)) ;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		System.out.println(Math.abs((x1-x2) * 2)  + Math.abs((y1-y2) * 2));
		return Math.abs((x1-x2))*2 + Math.abs((y1-y2))*2 ;
	}

}
