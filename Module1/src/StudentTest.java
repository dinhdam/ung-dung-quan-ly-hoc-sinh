public class StudentTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        Student andy = new Student("LiLi", 23);
        studentManager.add(andy);
        System.out.println("added " + andy.getInfomation());
        studentManager.displayAll();

        Student booby = new Student("Jonh", 25);
        studentManager.add(booby);
        System.out.println("added " + booby.getInfomation());
        studentManager.displayAll();

        Student samy = new Student("Cherry", 22);
        studentManager.add(samy);
        System.out.println("added " + samy.getInfomation());
        studentManager.displayAll();

        studentManager.find("Tom");
        studentManager.find("LiLi");
        studentManager.find("Cherry");
    }
}
