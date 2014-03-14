public class Engine {
	final static double g = 9.8;
	final static double t = 0.01;
	
	public static void main(String[] args) {
		boolean status = true;
		double time = 0;
		
		Ball ballx = new Ball( 100,400, 115.0 ); // x (m), y (m), v (m/s)
		while( status ) {
			time += t;
			status = ballx.getPos( t, g );
			System.out.println( "time:" + time + " " + ballx );
			if( !status ) {
				break;
			}
		}
	}
}