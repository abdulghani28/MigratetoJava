package DuckPro;

import DuckPro.attack.ArrowAttact;
import DuckPro.attack.SwordAttack;
import DuckPro.defense.ArmorDefense;
import DuckPro.defense.ShiledDefense;
import DuckPro.fly.PlaneFly;
import DuckPro.fly.RocketFly;
import DuckPro.fly.WingsFly;
import DuckPro.sound.NormalSound;
import DuckPro.sound.ToaSound;


public class Main {
  public static void main(String[] args) {
    Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new ArrowAttact(), new ShiledDefense());
    System.out.println("Super Duck Behaviour : ");
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();

    System.out.println();
    System.out.println("Noob Duck Behaviour : ");
    Duck noobDuck = new Duck(new WingsFly(), new NormalSound(), new SwordAttack(), new ArmorDefense());
    noobDuck.fly();
    noobDuck.sound();
    noobDuck.attack();
    noobDuck.defense();

    System.out.println();
    System.out.println("Super Duck change Fly Behaviour : ");
    superDuck.setBehaviourFly(new PlaneFly());
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();
  }
}