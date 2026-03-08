package Camera;

public class Main {
    public static void main(String[] args) {


        // Create lens objects
        Lens lens1 = new Lens(18, 55);
        Lens lens2 = new Lens(70, 200);

        // Create camera objects
        Camera cam1 = new Camera("Canon", 24.2, 3.0, true, lens1);
        Camera cam2 = new Camera("Nikon", 20.8, 3.2, true, lens2);
        Camera cam3 = new Camera("Leica", 40.6, 2.8, false, lens1);


        // Print camera information
        System.out.println(cam1);
        System.out.println(cam2);
        System.out.println(cam3);

        // Change the lens of the first camera
        cam1.setLens(lens2);
        System.out.println(cam1);

        // Print object counters
        System.out.println("Lenses created: " + Lens.getLensCount());
        System.out.println("Cameras created: " + Camera.getCamerasCount());






    }
}
