public class SchoolFee {

    public static void main(String[] args) {
        int i = 2021;
        double taxa = 10000;
        double sum=0;
        while (i <= 2035) {
            System.out.println("Anul-" + i + " Taxa:" + taxa);
            i++;
            taxa = taxa + (taxa * 5 / 100);
            if(i>=2031&&i<=2035){
                sum+=taxa;
            }

        }
        System.out.println("Taxa 2031-2035: "+sum);
    }
}
