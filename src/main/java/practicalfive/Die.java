package practicalfive;

import java.util.Random;

/** Creates a Die object.
 *
 * @author Solutions Repository
 */
public class Die {

  private final int sides;
  private Random die;

  /** Constructor.
   *
   * @param sides Number of sides
   */
  public Die(int sides) {
    this.die = new Random();
    this.sides = sides;
  }
  
  /** Rolls the die and returns the result.
   *
   */
  public int roll() {
    return this.die.nextInt(sides) + 1;
  }
}