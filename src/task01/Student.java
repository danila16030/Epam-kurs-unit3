package task01;

public class Student {
    private String secondName;
    private String initials;
    private int groupNumber;
    private int[] performance;


    public Student(String secondName, String initials, int groupNumber, int[] perfomance) {
        this.groupNumber = groupNumber;
        this.secondName = secondName;
        this.performance = perfomance;
        this.initials = initials;
    }

    public String getName() {
        return secondName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getPerformance() {
        return performance;
    }
    public boolean isExcellentStudent(int[] assessments) {
        for (int assessment : assessments) {
            if (assessment < 9) {
                return false;
            }
        }
        return true;
    }
}
