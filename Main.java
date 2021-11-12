public class Main {
    public static void main(String[] args) {
        ProjectController projectController = new ProjectController();
        System.out.println(projectController.string);

        ProjectController2 projectController2 = new ProjectController2();

        System.out.println(printString());
        System.out.println(printInt(1010));
    }

    public static String printInt(int n) {
        return Integer.toString(n);
    }

    public static String printString() {
        return "Print String";
    }
}
