package Chapter9c;

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter(){
        return sides*length;
    }
    public void print(String thing){
        System.out.println("I am a " + thing);
    }
}
