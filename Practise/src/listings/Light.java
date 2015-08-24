package listings;

class Light {
	/** calculation of distance */
	public static void main(String s,Object...args) {

		int lightspeed;
		long days;
		long seconds;
		// approximate speed of light in miles per second
		lightspeed = 186000;

		days = 1000; // specify number of days here

		seconds = days * 24 * 60 * 60; // convert to seconds
		long distance;

		distance = lightspeed * seconds; // compute distance

		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
	}
}
