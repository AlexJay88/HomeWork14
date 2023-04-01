public class  Puffendui extends Hogwarts{

    private int industriousness;
    private int loyalty;
    private int honor;

    public Puffendui(String fullName, int magic, int transgression, int industriousness, int loyalty, int honor) {
        super(fullName, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    @Override
    public String toString() {
        return "Puffendui{" +
                ", fullName='" + getFullName() + '\'' +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                '}';
    }
    public  void studentСomparison(Puffendui student) {

        int studentOneSum = this.getIndustriousness() + this.getLoyalty() + this.getHonor();
        int studentTwoSum = student.getIndustriousness() + student.getLoyalty() + student.getHonor();
        if (studentOneSum >= studentTwoSum) {
            System.out.println("Ученик " + this.getFullName() + " лучше,чем ученик " + student.getFullName());
        } else if (studentTwoSum > studentOneSum) {
            System.out.println("Ученик " + student.getFullName() + " лучше,чем ученик " + this.getFullName());
        } else {
            System.out.println("Ученик " + this.getFullName() + " Ученик " + student.getFullName() + " равны ");
        }
    }


}

