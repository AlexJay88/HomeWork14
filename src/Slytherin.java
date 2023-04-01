public class  Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                ", fullName='" + getFullName() + '\'' +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                '}';
    }

    public void studentСomparison(Slytherin student) {

        int studentOneSum = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int studentTwoSum = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
        if (studentOneSum >= studentTwoSum) {
            System.out.println("Ученик " + this.getFullName() + " лучше,чем ученик " + student.getFullName());
        } else if (studentTwoSum > studentOneSum) {
            System.out.println("Ученик " + student.getFullName() + " лучше,чем ученик " + this.getFullName());
        } else {
            System.out.println("Ученик " + this.getFullName() + " Ученик " + student.getFullName() + " равны ");
        }
    }
}