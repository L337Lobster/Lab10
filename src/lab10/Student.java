package lab10;

import java.awt.*;
import javax.swing.*;
/**
 * Java class for creating a custom JButton as a Student.
 * Creating a Student or other creature as a JButton is useful for the final project.
 * This is because you could use it to create a clickable entity on the screen.
 * If you want to create a door that you click to open, if it's simply a button already this makes things much simpler.
 * You could simply set an image of a door to the Door button so that it opens when you click it.
 * You do this simply using inheritance and extending the JButton on the Door class.
 * @author jph5321
 * @version 2.27
 */
public class Student extends JButton
{
    String firstName;
    String lastName;
    int age;
    /**
     * The constructor for the class. This sets the values for the class variables.
     * This also sets the default text for the button to the getInfo() function.
     * Finally sets the default background color to cyan.
     * @param firstName constructor variable for the Student's first name
     * @param lastName constructor variable for the Student's last name
     * @param age constructor variable for the Student's age
     */
    public Student(String firstName, String lastName, int age)
    {	
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        setText(getInfo());
        setBackground(Color.cyan);

    }
    /**
     * This method returns a String with the full name and age of the Student.
     * @return A String displaying the full name and age of the Student
     */
    String getInfo()
    {
        return ""+firstName+ "  "+lastName;
    }

}
