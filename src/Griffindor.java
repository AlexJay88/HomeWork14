public class  Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String fullName, int magic, int transgression, int nobility, int honor, int bravery) {
        super(fullName, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "  fullName=" + getFullName() + '\'' +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                '}';
    }


    public  void studentСomparison(Griffindor student) {

        int studentOneSum = this.getNobility() + this.getHonor() + this.getBravery();
        int studentTwoSum = student.getNobility() + student.getHonor() + student.getBravery();
        if (studentOneSum >= studentTwoSum) {
            System.out.println("Ученик " + this.getFullName() + " лучше,чем ученик " + student.getFullName());
        } else if (studentTwoSum > studentOneSum) {
            System.out.println("Ученик " + student.getFullName() + " лучше,чем ученик " + this.getFullName());
        } else {
            System.out.println("Ученик " + this.getFullName() + " Ученик " + student.getFullName() + " равны ");
        }
    }


}
