public class Ball {

	Ball( int x, int y, double v ) {
		this.x = x;
		this.y = y;
		this.vx = v;
		this.vy = 0;
	}

	public int getX() { return x; }
	public int getY() { return y; }
		
	public boolean getPos( double time, double g ) {
		
		x += vx;
		vy += ( g * time );
		y -= vy;
		
		if( y <= 0 ) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String toString() {
		return " x:" + x + " y:" + y; // + " vx:" + vx + " vy:" + vy;
	}
	
	// private variables
	
	private int x; // x position
	private int y; // y position
	private double vx; // velocity x
	private double vy; // velocity y
}