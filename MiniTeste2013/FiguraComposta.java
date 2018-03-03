package geometria;


public class FiguraComposta implements Figura, Countable {
	private Figura[] figuras;
	
	public FiguraComposta(Figura[] figuras) {
		// TODO Auto-generated constructor stub
		this.figuras = figuras;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = 0;
		for(Figura f : figuras) {
			area += f.getArea();
		}
		return area;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double perimetro = 0;
		for(Figura f : figuras) {
			perimetro += f.getPerimetro();
		}
		return 0;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return figuras.length;
	}

}
