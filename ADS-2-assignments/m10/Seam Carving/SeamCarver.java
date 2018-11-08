
public class SeamCarver {
	// create a seam carver object based on the given picture
	private Picture picture;
	public SeamCarver(Picture picture) {
		this.picture = picture;
		if (picture == null) {
            throw new IllegalArgumentException("picture is null");
		}
	}
	// current picture
	public Picture picture() {
		return this.picture;
	}
	// width of current picture
	public int width() {
		return this.picture.width();
	}

	// height of current picture
	public int height() {
		return this.picture.height();
	}

	// energy of pixel at column x and row y
	public double energy(int x, int y) {
		 if (x == 0 || y == 0 || x == picture.width() - 1 || y == picture.height() - 1) {
	    	return 1000;
	    }
	    double dx, dy = 0;
	    double xtred = picture.get(x - 1, y).getRed();
	    double xtblue = picture.get(x - 1, y).getBlue();
	    double xtgreen = picture.get(x - 1, y).getGreen();
	    double xbred = picture.get(x + 1, y).getRed();
	    double xbblue = picture.get(x + 1, y).getBlue();
	    double xbgreen = picture.get(x + 1, y).getGreen();
	    double yrred = picture.get(x, y - 1).getRed();
	    double yrblue = picture.get(x, y - 1).getBlue();
	    double yrgreen = picture.get(x, y - 1).getGreen();
	    double ylred = picture.get(x, y + 1).getRed();
	    double ylblue = picture.get(x, y + 1).getBlue();
	    double ylgreen = picture.get(x, y + 1).getGreen();
	    dx = Math.pow(xtred - xbred, 2) + Math.pow(xtblue - xbblue, 2) + Math.pow(xtgreen - xbgreen, 2);
	    dy = Math.pow(yrred - ylred, 2) + Math.pow(yrblue - ylblue, 2) + Math.pow(yrgreen - ylgreen, 2);
	    double energysum = Math.sqrt(dx + dy);
	    return energysum;
	}

	// sequence of indices for horizontal seam
	public int[] findHorizontalSeam() {
		return new int[0];
	}

	// sequence of indices for vertical seam
	public int[] findVerticalSeam() {
		return new int[0];
	}

	// remove horizontal seam from current picture
	public void removeHorizontalSeam(int[] seam) {

	}

	// remove vertical seam from current picture
	public void removeVerticalSeam(int[] seam) {

	}
}