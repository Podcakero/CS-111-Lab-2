import java.awt.*;

public class MyScene
{
	public static void main(String... args)
	{
		final Color BROWN = new Color(72, 39, 5);
		final Color DARK_GREEN = new Color(24, 68, 62);
		final Color LIGHT_BROWN = new Color(205, 133, 63);
		final Color DARKER_THAN_LIGHT_BROWN = new Color(160,82,45);

		//Build Sky
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledRectangle(0, 1, 1, .4);

		//Build Grass
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledRectangle(0, 0, 1, .6);

		//Build lake
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.filledEllipse(.3, .3, 0.25, 0.1);

		//Build tree
			//Trunk
			StdDraw.setPenColor(BROWN);
			StdDraw.filledRectangle(.8, .3,  .03, .1);

			//Leaves
			StdDraw.setPenColor(DARK_GREEN);
			StdDraw.setPenRadius(0.05);
			StdDraw.point(.77, .4);
			StdDraw.point(.76, .41);
			StdDraw.point(.755, .42);
			StdDraw.point(.755, .43);
			StdDraw.point(.76, .445);
			StdDraw.point(.77, .455);
			StdDraw.point(.78, .465);
			StdDraw.point(.79, .4675);
			StdDraw.point(.8, .465);
			StdDraw.point(.81, .455);
			StdDraw.point(.82, .445);
			StdDraw.point(.825, .43);
			StdDraw.point(.825, .42);
			StdDraw.point(.82, .41);
			StdDraw.point(.81, .4);
			StdDraw.point(.8, .42);

		//Sun
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.setPenRadius(0.3);
		StdDraw.point(0.5, 0.9);

		//Build house
			//House
			StdDraw.setPenColor(LIGHT_BROWN);
			StdDraw.filledRectangle(0.1, 0.6, .08, .08);

			//Windows
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledRectangle(.08, .6, .02, .02);

			//Door
			StdDraw.setPenColor(BROWN);
			StdDraw.filledRectangle(.14, .56, .02, .04);

			//Roof
			StdDraw.setPenColor(DARKER_THAN_LIGHT_BROWN);
			StdDraw.filledPolygon(new double[]{.0, .2, .1}, new double[]{.68, .68, .8});

		//Import image of Andy
		StdDraw.picture(0.5, 0.5, "Andy.png", 0.2, 0.13);

		//Text
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0.5, 1, "OH NO ANDY DON'T DRIVE INTO THE LAKE!");
		StdDraw.text(0.5, 0.9, "OH GOD HE CAN'T HEAR HE HAS AIRPODS IN");
	}
}
