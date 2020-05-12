public class Pyramid {
	public static void main(String[] args) {
		int numberOfLayers = 3;
		System.out.println(numberOfBlocks(numberOfLayers));
	}
	public static int numberOfBlocks(int numberOfLayers) {
		int numberOfBlocks = 0;
		for (int i = 1; i <= numberOfLayers; i++) {
			numberOfBlocks += i*i;
		}
		return numberOfBlocks;
	}
}