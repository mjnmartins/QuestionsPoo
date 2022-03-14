package exerciciopratico;

import java.util.HashSet;
import java.util.Set;

public class ExercicioPratico {

    public static void main(String[] args) {

        Veiculos v1 = new Veiculos();
        //CarroPasseio cp1 = new CarroPasseio();
        //Caminhao c1 = new Caminhao();
        //Motor m1 = new Motor();

        v1.setPeso(500);
        v1.setPreco(3000);
        v1.setVelocMax(150);
        v1.getMotor().setNumCilindro(10);
        v1.getMotor().setPotencia(15);

        System.out.println(v1);
        //System.out.println(m1);
        //System.out.println(cp1);
        //System.out.println(c1);

    }

}
