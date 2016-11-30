import java.util.ArrayList;
import java.util.List;

public class LambdasZoo {
    public static void main(String[] args) {
        Animal peix = new Animal(true, false, true, false);
        Animal aguila = new Animal(false, true, false, true);
        Animal gat = new Animal(true, true, true, true);

        List<Animal> animals = new ArrayList<>();
        animals.add(peix);
        animals.add(aguila);
        animals.add(gat);

        checkAtribut checkSalta = (a)->{
            return a.isPotSaltar();
        };
        animals.forEach(animal -> System.out.println(animal+ ", pot saltar: "+checkSalta.check(animal)));

        checkAtribut checkVola = (a)->{
            return a.isPotVolar();
        };
        animals.forEach(animal -> System.out.println(animal+ ", pot volar: "+checkVola.check(animal)));

        checkAtribut checkNadar = (a)->{
            return a.isPotNadar();
        };
        animals.forEach(animal -> System.out.println(animal+ ", pot nadar: "+checkNadar.check(animal)));

        checkAtribut checkCamina = (a)->{
            return a.isPotCaminar();
        };
        animals.forEach(animal -> System.out.println(animal+ ", pot caminar: "+checkCamina.check(animal)));
    }
}
