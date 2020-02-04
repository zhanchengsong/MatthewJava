package Matthew;

public class Coolguy {

    public String eye;
    String nose;
    String cloth;
    public int weight;

    private String getGirls(String name){
        return "cool guy with" + name;
    }

    public void eat(int food) {
        this.weight = food;
    }

    public Coolguy(String eye, String nose, String cloth, int weight) {
        this.eye = eye;
        this.nose = nose;
        this.cloth = cloth;
        this.weight = weight;
    }


}
