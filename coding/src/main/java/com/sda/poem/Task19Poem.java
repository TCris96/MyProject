public class Task19Poem {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Mihai Eminescu", "Roman");
        Author secondAuthor = new Author("Jane Austen", "Englez");
        Author thirdAuthor = new Author("Lucian Blaga", "Roman");
        Poem firstPoem = new Poem(firstAuthor, 5);
        Poem secondPoem = new Poem(secondAuthor, 6);
        Poem thirdPoem = new Poem(thirdAuthor, 8);
        Poem[] array = new Poem[3];
        array[0] = firstPoem;
        array[1] = secondPoem;
        array[2] = thirdPoem;
        String thePoem = "";
        int length=0;
        for(int i=0;i< array.length;i++){
            if(length<array[i].stropheNumbers){
                length=array[i].stropheNumbers;
                thePoem=array[i].creator.surname;
            }
        }
        System.out.println(thePoem);
    }
}
