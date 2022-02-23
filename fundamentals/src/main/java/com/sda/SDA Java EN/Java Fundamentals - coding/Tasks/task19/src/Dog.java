public class Dog {
    String name;

    public Dog(){

    }
    public Dog(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void wagTail(){
        System.out.println(this.name+ " wags tail.");
    }
}
