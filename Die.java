
/**
 * Has a method which returns the randomly generated die value
 *
 * @author Robert Gluck
 * @version 1-14-2020
 */
public class Die
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
    }

    /**
     * roll returns the sum of two randomly generated numbers from 1 to 6
     *
     * @return    the sum of two randomly generated numbers from 1 to 6
     */
    public int roll()
    {
        // put your code here
        return ((int)(Math.random()*6+1)) + ((int)(Math.random()*6+1));

    }
}
