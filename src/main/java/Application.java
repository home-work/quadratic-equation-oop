public class Application {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 2, 3);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: x1 = x2 " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
