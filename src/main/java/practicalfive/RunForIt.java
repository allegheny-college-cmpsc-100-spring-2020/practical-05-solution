package practicalfive;

/** Creates dice to play "Run For It".
 *
 * @author Solutions Repository
 */
public class RunForIt {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Initialize die object
    Die d6 = new Die(6);
    // Roll dice
    System.out.print(d6.roll() + " " + d6.roll() + " " + d6.roll() + " "
                     + d6.roll() + " " + d6.roll() + " " + d6.roll());
  }
}