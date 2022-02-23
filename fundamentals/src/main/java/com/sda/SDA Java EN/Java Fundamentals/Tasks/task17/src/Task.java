import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text=scanner.nextLine();
        char[] array=text.toCharArray();
        int pharantesesOpened=0;
        for(char element:array){

            switch(element){
                case'(':
                    pharantesesOpened++;
                    break;
                case')':
                    pharantesesOpened--;
                    break;

            }
            if(pharantesesOpened<0){
                break;
            }
        }
        if(pharantesesOpened==0 ){
            System.out.println("OK");
        }
        else{
            System.out.println("Incorrect pairing of brackets");
        }

    }
}