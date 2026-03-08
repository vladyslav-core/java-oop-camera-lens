package Camera;

public class Lens {

    private int minFocalLength;
    private int maxFocalLength;

    private static int lensCounter = 0;


    // --- Constructor ---
    public Lens(int minFocalLength, int maxFocalLength) {
        validatePositiveFocalLength(minFocalLength);
        validatePositiveFocalLength(maxFocalLength);

        validateFocalRange(minFocalLength, maxFocalLength);

        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        lensCounter++;
    }


    // ======================== Methoden ============================


    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {

        validatePositiveFocalLength(minFocalLength);
        validateFocalRange(minFocalLength, this.maxFocalLength);

        this.minFocalLength = minFocalLength;
    }



    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {

        validatePositiveFocalLength(maxFocalLength);
        validateFocalRange(this.minFocalLength, maxFocalLength);

        this.maxFocalLength = maxFocalLength;
    }


    public static int getLensCount() {
        return lensCounter;
    }


    private static void validatePositiveFocalLength(int focalLength) {
        if (focalLength < 1) {
            throw new IllegalArgumentException("Focal length must be >= 1.");
        }
    }

    private static void validateFocalRange(int minFocalLength, int maxFocalLength) {
        if (maxFocalLength < minFocalLength) {
            throw new IllegalArgumentException("maxFocalLength must not be smaller than minFocalLength.");
        }
    }


    @Override
    public String toString() {
        return "Lens{" +
                "minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                '}';
    }
}

