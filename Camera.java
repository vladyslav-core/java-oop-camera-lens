package Camera;

public class Camera {

    private String brand;
    private double megaPixels;
    private double displaySize;
    private boolean colored;
    private Lens lens;

    private static int cameraCounter = 0;



    // --- Constructor ---
    public Camera(String brand, double megaPixels, double displaySize, boolean colored, Lens lens) {
        validatePositiveMegaPixels(megaPixels);
        validatePositiveDisplaySize(displaySize);

        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        cameraCounter++;
    }


    // ======================== Methoden ============================


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        validatePositiveMegaPixels(megaPixels);
        this.megaPixels = megaPixels;
    }


    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        validatePositiveDisplaySize(displaySize);
        this.displaySize = displaySize;
    }


    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }


    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }


    public static int getCamerasCount() {
        return cameraCounter;
    }


    // --- Validation methods ---
    private static void validatePositiveMegaPixels(double megaPixels) {
        if (megaPixels < 1) {
            throw new IllegalArgumentException("megapixels must be >= 1");
        }
    }

    private static void validatePositiveDisplaySize(double displaySize) {
        if (displaySize < 1) {
            throw new IllegalArgumentException("displaySize must be >= 1");
        }
    }


    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize=" + displaySize +
                ", colored=" + colored +
                ", lens=" + lens +
                '}';
    }
}



