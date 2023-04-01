abstract public class Hogwarts  {


      private String fullName;
      private int magic;
      private int transgression;


    public Hogwarts(String fullName, int magic, int transgression) {
        this.fullName = fullName;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }
    public static void studentСompare(Hogwarts studentOne,Hogwarts studentTwo){
            int studentOneSum = studentOne.getMagic() + studentOne.getTransgression();
            int studentTwoSum = studentTwo.getMagic() + studentTwo.getTransgression();
            if (studentOneSum >= studentTwoSum) {
                System.out.println("Ученик " + studentOne.getFullName() + " лучше,чем ученик " + studentTwo.getFullName());
            } else if (studentTwoSum > studentOneSum) {
                System.out.println("Ученик " + studentTwo.getFullName() + " лучше,чем ученик " + studentOne.getFullName());
            } else {
                System.out.println("Ученик " + studentOne.getFullName() + " Ученик " + studentTwo.getFullName() + " равны ");
            }
        }

    }























