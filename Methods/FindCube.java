package Methods;

public class FindCube {

    void Cube(){
        int number = 5;

         int result = (int) Math.pow(number,3);
         System.out.println(result);
    }

    public static void main(String[] args) {
         FindCube obj = new FindCube();

         obj.Cube();


    }
}
