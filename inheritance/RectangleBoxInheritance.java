class RectangleBoxInheritance{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.println();
			r.setDimension(3,4);
			r.println();

			Box b=new Box();
			b.println();
			b.setDimension(3,4,5);
			b.println();
	}
}