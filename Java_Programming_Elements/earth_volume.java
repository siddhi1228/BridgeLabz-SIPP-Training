package immersion.Java_Programming_Elements;

public class earth_volume {
	public static void main(String args[])
	{	
		int r = 6378;
		double vkm = (4/3.0) * 3.14 * r * r * r;
		double vm = vkm * Math.pow(1.6, 3);
		System.out.println("the volume in km cube is " + vkm + " the volume in miles is " + vm);
	}
}
