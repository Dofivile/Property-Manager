/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 11/09/2022
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Robel Endashaw
*/
public class Plot {
	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot) {
		this.x = otherPlot.x;
		this.y = otherPlot.x;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	
	public boolean overlaps(Plot plot) {
		boolean truth=false;
		if((this.x<plot.x+ plot.width) && (this.y< plot.depth + plot.y) && (plot.x< this.x +this.width) &&(plot.y< this.y+ this.depth)) {
			truth= true;
		}
		return truth;
	}
	
	public boolean encompasses(Plot plot) {
		
			boolean truth=false;
		
		if((plot.x>=this.x) && (plot.y>=this.y) && (plot.x + plot.width<= this.x + this.width) && (plot.y+plot.depth<+ this.y+ this.depth)) {
			truth= true;
		}
		return truth;
	
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String toString() {
		
		return (""+this.x + "," +this.y + "," + this.width + "," + this.depth);
		
	}
	
}
