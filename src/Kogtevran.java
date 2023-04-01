public class Kogtevran extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String fullName, int magic, int transgression, int smart, int wisdom, int wit, int creativity) {
        super(fullName, magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                ", fullName='" + getFullName() + '\'' +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                '}';
    }
    public  void studentСomparison(Kogtevran student) {

        int studentOneSum = this.getSmart() + this.getWisdom() + this.getWit() + this.getCreativity();
        int studentTwoSum = student.getSmart() + student.getWisdom() + student.getWisdom();
        if (studentOneSum >= studentTwoSum) {
            System.out.println("Ученик " + this.getFullName() + " лучше,чем ученик " + student.getFullName());
        } else if (studentTwoSum > studentOneSum) {
            System.out.println("Ученик " + student.getFullName() + " лучше,чем ученик " + this.getFullName());
        } else {
            System.out.println("Ученик " + this.getFullName() + " Ученик " + student.getFullName() + " равны ");
        }
    }}
