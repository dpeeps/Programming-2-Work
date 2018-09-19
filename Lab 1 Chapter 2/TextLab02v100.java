// David Pieper 08/29/2018 Period 3B Lab 2 100 Pt Version
// Finished & Submitted on 8/31/2018
// TextLab02st.java
// Student starting version of the TextLab02 assignment.
// Resave this program as TextLab02v80 for the 80 point version.
// Resave this program as TextLab02v100 for the 100 point version.

public class TextLab02v100
{
	public static void main(String args[])
	{
		System.out.println("TextLab02, 100 Point Version\n");
      int Milliseconds = 10000123;
      System.out.println("Starting milli-seconds:    " + Milliseconds);
      int Hours = 0;
      Hours = Milliseconds/3600000;
      System.out.println("Hours:                     " + Hours);
      Milliseconds = Milliseconds % 3600000;
      int Minutes = 0;
      Minutes = Milliseconds/60000;
      System.out.println("Minutes:                   " + Minutes);
      Milliseconds = Milliseconds % 60000;
      int Seconds = 0;
      Seconds = Milliseconds/1000;
      System.out.println("Seconds:                   " + Seconds);
      Milliseconds = Milliseconds % 1000;
      System.out.println("Milli Seconds:             " + Milliseconds);
	}
}