package Matthew;

public class Main {


    public static void main(String[] args) {
        String eye;
        eye = "Black";
        String nose = "Yellow";
        String cloth = "Superme";
        Coolguy matthew = new Coolguy(eye,nose,cloth, 150);
        // Access class variable
        String testNose = matthew.nose;
    }


    public String HelloMatthew(String name) {
        return "Hello" + name;
    }


}
