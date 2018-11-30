//********************************************************************
//  TheBeatles.java       
//
//  Demonstrates the use of a ArrayList object.
//********************************************************************

import java.util.ArrayList;

public class TheBeatles
{
   //-----------------------------------------------------------------
   //  Stores and modifies a list of band members.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      ArrayList band = new ArrayList();

      band.add ("John");
      band.add ("Paul");
      band.add ("George");
      band.add ("Ringo");

      System.out.println (band);

      //int location = band.indexOf ("George");
      band.remove ("Ringo");

      System.out.println (band);
      System.out.println ("At index 1: " + band.get(1));

      System.out.println (band);
      System.out.println ("Size of the band: " + band.size());
   }
}

