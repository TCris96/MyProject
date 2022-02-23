import java.text.DecimalFormat;

public class FindtheOtherTwoSideLengths {
    public static void main(String[] args) {
        double[] array=calculateTheOthersSides(3);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
    public static double[] calculateTheOthersSides(int number){
        DecimalFormat df=new DecimalFormat("#.##");
        double theHypotenuse=2*number;
        double theOtherSide=number* Math.sqrt(3);
        theHypotenuse=Double.valueOf(df.format(theHypotenuse));
        theOtherSide=Double.valueOf(df.format(theOtherSide));
        double[] theOthersSides=new double[2];
        if(theHypotenuse>theOtherSide){
            theOthersSides[0]=theHypotenuse;
            theOthersSides[1]=theOtherSide;
        }else{
            theOthersSides[0]=theOtherSide;
            theOthersSides[1]=theHypotenuse;
        }
        return theOthersSides;
    }
}
