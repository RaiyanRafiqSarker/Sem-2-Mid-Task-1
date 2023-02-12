public class Triangle{
	private int x;
	private int y;
	private int z;
	
public Triangle(){
	
}
	
public Triangle(int c,int b,int a){
	
	x=c;
	y=b;
	z=a;
	
}	
	public void setX(int a){
		x=a;
		
	}
	public void setY(int b){
		y=b;
	}
	public void setZ(int c){
		z=c;
		
	}
	
public int getX(){
	return x;
}
public int getY(){
	return y;
}
public int getZ(){
	return z;
}
public void showInfo(){
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
}
public void testTriangle(){
	if(x==y&&y==z){
		System.out.println("Triangle is Equilateral");
	}
else if(x==y||y==z||x==z){
	System.out.println("Triangle is Isosceles");
}
else{
	System.out.println("Triangle is scalene");
}
	
}

}