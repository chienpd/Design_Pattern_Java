package Abstract_Factory_Pattern;

/**
 * Created by pdc on 18/05/2017.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
