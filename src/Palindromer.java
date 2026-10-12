import java.util.Scanner;
public class Palindromer
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static String word = "";
		static String[] letters;

		public static void main(String[] args)
			{
				System.out.println("Give a word:");
				getWord();
				splitWord();
				reverseWord();
			}
		
		public static void getWord()
		{
			word = userStringInput.nextLine();
		}
		
		public static void splitWord()
		{
			letters = word.split("");
		}
		
		public static void reverseWord()
		{
			int length = letters.length - 1;
			
			for (int i = length; i > -1; i--)
				{
					System.out.print(letters[i]);
				}
		}

	}
