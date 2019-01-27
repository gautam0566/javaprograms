class Box extends Rectangle{
	private double height;
    public Box(){
    	super();
    	height= -1;

    }
    public Box(double l, double w, double h){
    	super(l,w);
    	height=h;

    }
public void setDimension(double l,double w, double h){
	super.setDimension(l,w);
	height=h;
}
public double getHeight(double l, double w, double h){
	return height;

}
public double area(){
	return 2*(getLength()*getWidth() + getLength()*height + height*getWidth());



}
public double volume(){
	return (getLength() * getWidth() * height);

}
public void println(){
	System.out.println("\nBox: Area" +area()+ "Volume" +volume());
}
}
