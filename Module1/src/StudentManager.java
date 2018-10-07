public class StudentManager {
    private Student[] students = new Student[20];
    private int size;
    public StudentManager() {
    }
    public void add(Student student) {
        students[size] = student;
        size++;
    }
    public void displayAll() {
        if (size == 0) {
            System.out.println("khong co sinh vien nao");
        } else if (size == 1) {
            System.out.println("co 1 sinh vien ");
            System.out.print(students[0].getInfomation() + "");
            System.out.println();
        } else {
            System.out.println("co so " + size + " sinh vien trong danh sach: ");
            for (int i = 0; i < size; i++) {
                System.out.print(students[i].getInfomation() + ", ");
            }
            System.out.println();
        }
    }
    public void find(String name) {
        int found = 0;
        for (int i = 0; i < size; i++) {
            boolean match = students[i].getName().equals(name);
            if (match) {
                System.out.println("so thu tu cua sinh vien \""
                        + name
                        + "\" trong danh sach la 1 "
                        + (i + 1));
                found++;
                break;
            }
        }
        boolean notFound = found == 0;
        if (notFound) {
            System.out.println("khong sinh vien nao co ten " + name + " trong danh sach");
        }
    }
}
