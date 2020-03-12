package DuckPro;


import DuckPro.attack.SwordAttack;
import DuckPro.defense.ArmorDefense;
import DuckPro.fly.WingsFly;
import DuckPro.sound.NormalSound;
import DuckPro.attack.BehaviourAttack;
import DuckPro.defense.BehaviourDefense;
import DuckPro.fly.BehaviourFly;
import DuckPro.sound.BehaviourSound;

public class Duck {

  private BehaviourFly behaviourFly;
  private BehaviourSound behaviourSound;
  private BehaviourAttack behaviourAttack;
  private BehaviourDefense behaviourDefense;

  public Duck(BehaviourFly behaviourFly, BehaviourSound behaviourSound, BehaviourAttack behaviourAttack,
      BehaviourDefense behaviourDefense) {
    this.behaviourFly = behaviourFly;
    this.behaviourSound = behaviourSound;
    this.behaviourAttack = behaviourAttack;
    this.behaviourDefense = behaviourDefense;
  }

  public Duck(WingsFly wingsFly, NormalSound normalSound, SwordAttack swordAttack, ArmorDefense armorDefense) {
  }

  public void setBehaviourFly(BehaviourFly behaviourFly) {
    this.behaviourFly = behaviourFly;
  }

  public void setBehaviourSound(BehaviourSound behaviourSound) {
    this.behaviourSound = behaviourSound;
  }

  public void setBehaviourAttack(BehaviourAttack behaviourAttack) {
    this.behaviourAttack = behaviourAttack;
  }

  public void setBehaviourDefense(BehaviourDefense behaviourDefense) {
    this.behaviourDefense = behaviourDefense;
  }

  public void fly() {
    behaviourFly.fly();
  }

  public void sound() {
    behaviourSound.sound();
  }

  public void attack() {
    behaviourAttack.attack();
  }

  public void defense() {
    behaviourDefense.defense();
  }
}