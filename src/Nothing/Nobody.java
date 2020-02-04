package Nothing;
import Matthew.Coolguy;
public class Nobody {

    public static void main(String[] args) {
        String eye;
        eye = "Black";
        String nose = "Yellow";
        String cloth = "Superme";
        Coolguy matthew = new Coolguy(eye,nose,cloth, 150);
        Coolguy mike = new Coolguy("HEllo", "Red", "Nike", 300);

        int matthewWeight = matthew.weight; // matthewWeight = 150;
        mike.eat(3000);
        matthewWeight = matthew.weight; //



//
//        int weight;
//        weight = matthew.weight; // weight = 150
//        System.out.println(weight);
//        matthew.eat(3000); // weight = 150
//        weight = matthew.weight; // weight = 3000
//        System.out.println(weight);


//        int weight = matthew.weight;
//        System.out.println(weight);
//        matthew.eat(50);
//        System.out.println(weight);

        // int weight = mattew.weight;        Result : weight = 150;
        //
    }
}
