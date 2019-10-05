package task01;

public class Main {
    static public void main(String[] args) {
        Student[] studentArray = new Student[10];
        studentArray[0] = new Student("Ививонв ", "В.И",
                750503, new int[]{1, 5, 9, 7, 8});

        studentArray[1] = new Student("Ививонв ", "Д.И",
                750503, new int[]{7, 8, 9, 8, 8});

        studentArray[2] = new Student("Ививанов ", "Г.И",
                750503, new int[]{6, 5, 5, 7, 8});

        studentArray[3] = new Student("Ививонв ", "В.Л",
                750503, new int[]{1, 5, 9, 7, 8});

        studentArray[4] = new Student("Отличников ", "В.И",
                750503, new int[]{9, 9, 9, 10, 9});

        studentArray[5] = new Student("Луциков ", "В.И",
                750503, new int[]{10, 10, 10, 10, 10});

        studentArray[6] = new Student("Новиков ", "В.И",
                750503, new int[]{1, 5, 9, 7, 8});

        studentArray[7] = new Student("Ививонва ", "В.И",
                750503, new int[]{1, 5, 9, 7, 8});

        studentArray[8] = new Student("Ививонв ", "Л.В",
                750503, new int[]{1, 5, 9, 7, 8});

        studentArray[9] = new Student("Отличников ", "Д.И",
                750503, new int[]{9, 9, 9, 10, 10});

        printCurrent(studentArray);

    }

    public static void printCurrent(Student[] studentArray) {
        for (Student student : studentArray) {
            if (student.isExcellentStudent(student.getPerformance())) {
                System.out.println(student.getGroupNumber() + " " + student.getName());
            }
        }
    }
}
