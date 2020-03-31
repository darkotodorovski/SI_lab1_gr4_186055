class Point {
	String id
	double x,y;
	//TODO add new variable
	String boja;
	//TODO constructor
	Point(String id,double x,double y,String boja){
		this.id=id;
		this.x=x;
		this.y=y;
		this.boja=boja;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		//TODO
		if (yDirection=='U'){
			y=y+1;
		}
		if (yDirection=='D'){
			y=y-1;
		}
		if (xDirection=='L'){
			x=x-1;
		}
		if (xDirection=='R'){
			x=x+1;
		}
		return x,y;
	}

	public void draw () {
		//TODO
		System.out.println(x,y);
	}



}
class Canvas{
	List<Point>;

}