import javakarol.Roboter;
import javakarol.Welt;
/**
 * Die Klasse Wettlauf
 */
public class Wettlauf
{
    // Attribute
    private Welt welt;
    private LaufRoboter robo1, robo2;

    // Konstruktor
    public Wettlauf()
    {
        welt = new Welt(10,10,6);
        robo1 = new LaufRoboter(1,1,welt);
        robo2 = new LaufRoboter(2,1,welt);
    }

    // Methoden

    public void los()
    {
       robo1.laufen();
       robo2.laufen();
    }

    
}
