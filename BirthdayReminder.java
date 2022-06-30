
	import java.util.Scanner;

	public class BirthdayReminder

	{

	   public static void main(String[] args)

	   {

	       String sentinelValue = "ZZZ";

	       final int size = 10;

	       int count = 0;

	       String name = null;

	       String dateOfBirth = null;

	       String[] namesArray = new String[size];

	       String[] dateOfBirthsArray = new String[size];

	     Scanner scanner = new Scanner(System.in);

	       System.out.println("Enter name or enter ZZZ " +  "to quit");

	       name = scanner.nextLine();

	       while(!name.equals(sentinelValue) && count < 10)

	       {

	           System.out.println("Enter date of birth " +  "(dd-mm-yyyy)");

	           dateOfBirth=scanner.nextLine();

	           namesArray[count] = name;

	           dateOfBirthsArray[count] = dateOfBirth;

	           System.out.println("Enter name or enter " +

	           "ZZZ to quit");

	           name=scanner.nextLine();

	           count++;

	       }

	       System.out.println("Count of namesArray = "+count);

	       System.out.println("The entered namesArray are:");

	       for(int i = 0; i < count; i++)  

	       {

	           System.out.println(namesArray[i]);

	       }

	       boolean criteria = true;

	       boolean flag = false;

	       while(criteria)

	       {

	           System.out.println("Enter name to " +

	           "display date of birth or enter " +

	           "ZZZ to quit");

	           name = scanner.nextLine();

	           if(name.equals(sentinelValue))

	               criteria = false;

	           else

	           {

	               for(int i = 0; i < count && !flag;

	               i++)

	               {

	                   if(namesArray[i].equals(name))

	                   {

	                       flag = true;

	                       dateOfBirth = dateOfBirthsArray[i];

	                   }

	               }

	               if(flag)

	               {

	                   System.out.println("Date of Birth "

	                   + "of " + name + " is "

	                   + dateOfBirth);

	               }

	               else

	               {

	                   System.out.println("Date Of Birth "

	                   + "of " + name + " is not flag");

	               }

	           }

	           flag = false;

	       }

	   }

	}
