public class RetirementStatus {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public RetirementStatus(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public boolean hasReachedRetirementAge() {
        if (gender.equalsIgnoreCase("M")) {
            if (age >= 65) {
                return true;
            }
        } else if (gender.equalsIgnoreCase("F")) {
            if (age >= 60) {
                return true;
            }
        }
        return false;
    }

    public int yearsLeftTillRetirement() {
        int x = 0;
        if (gender.equalsIgnoreCase("M")) {
            x = 65 - age;
        } else if (gender.equalsIgnoreCase("F")) {
            x = 60 - age;
        }
        return x;
    }

    public static void main(String[] args) {
        RetirementStatus firstMan = new RetirementStatus("Popa","Mirel",40,"M");
        System.out.println("Retirement Status: " + firstMan.hasReachedRetirementAge());
       System.out.println("Years until retirement: " + firstMan.yearsLeftTillRetirement());
       RetirementStatus firstGirl = new RetirementStatus("Tinca","Elena",50,"F");
        System.out.println("Retirement Status: " + firstGirl.hasReachedRetirementAge());
        System.out.println("Years until retirement: " + firstGirl.yearsLeftTillRetirement());


    }
}
