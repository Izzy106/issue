package assignment2;

public class NumberGuessingGame<Scanner> {

} 
///("java importjava.util.Scanner);
{public static void main(String[]args) {int randomNumber= generaterandomnumber(1,100);
int maxAttemps=5;//Maximum number of attempts int attempts=0;

private static int generaterandomnumber(int i, int j) 
	// TODO Auto-generated method stub
	return 0;

System.out.println("Welcome to the Number Guessing Game!");
String maxAttempts;
System.out.println("You have"+maxAttempts+"attempts to guess the number");
System.out.println("Guess a number betweeen 1 and 100:");}
 java.util.Scanner scanner= new java.util.Scanner(System.in);}{
while(attempts<maxAttempts) {int guess=scanner.nextInt(); attempts++;
if (guess==randomNumber) { System.out.printin("Congratulations! You have guessed the number in"+attempts+"attempts.");
break;
else if(guess<randomNumber) { System.out.println("Too low!Try again:");} else {
System.out.println("Too high! Try again:");
}
}
If(Attempts==maxAttemps){System.out.printin("Sorry,you have reached the maximum number of attempts.");
System.out.printin("the random number was"+randomNumber);
}
scanner.close();
}
public static int generateRandomNumner(int min,int max) {return(int)(Math.random()*(max-min+1))+min;
}
}
```







