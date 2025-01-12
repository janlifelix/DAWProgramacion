package Club;


/**
 * Provide a demonstration of the Club and Membership
 * classes.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClubDemo
{
    // instance variables - replace the example below with your own
    private Club club;

    /**
     * Constructor for objects of class ClubDemo
     */
    public ClubDemo()
    {
        club = new Club();
    }

    /**
     * Add some members to the club, and then
     * show how many there are.
     * Further example calls could be added if more functionality
     * is added to the Club class.
     */
    public void demo()
    {
        try {
        club.join(new Membership("David", 2, 2004));
        club.join(new Membership("Michael", 1, 2004));
        club.join(new Membership("name", 13, 2004));                       
        }
        catch (Exception e) {
            System.out.println("Ha habido un error durante la invocación al constructor");
        }
        finally {
            System.out.println("The club has " +
            club.numberOfMembers() +
            " members.");
        }
    }

    public static void main(String[] args) {
        ClubDemo cd = new ClubDemo();
        cd.demo();
    }
}

