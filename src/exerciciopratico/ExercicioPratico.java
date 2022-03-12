package exerciciopratico;

import java.util.HashSet;
import java.util.Set;

public class ExercicioPratico {

    public static void main(String[] args) {

        Motor m1 = new Motor();
        Veiculos v1 = new Veiculos();
        CarroPasseio cp1 = new CarroPasseio();
        Caminhao c1 = new Caminhao();
        // v1.setVelocMax(150);
        // m1.setPotencia(15);
        // cp1.setCor("vermelho");
        // c1.setToneladas(3f);
        System.out.println(v1.getVelocMax() + " KM/H ");
        System.out.println(m1.getPotencia() + " CV ");
        System.out.println(cp1.getCor());
        System.out.println(c1.getToneladas() + " Toneladas ");
        

    }

}
