public class Main {
    public static void main(String[] args) {
        ProjectController projectController = new ProjectController();
        System.out.println(projectController.string);

        System.out.println(printString());
    }

    public static String printString() {
        return "Print String";
    }
}