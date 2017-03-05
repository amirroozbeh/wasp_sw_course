import java.lang.Math;
import java.lang.*;
// Class declaration
public class PigLatin{

	// Method for translating single worlds to piglatin
	public static String Translator(String word){

		// Index holder for the first vowel
		int firstVowelIndex = 0;

        boolean hasUpperCase = false;

		// Loop through to find the first vowel
		for (int i = 0; i < word.length(); i++){
			// Extract letter
			char letter = word.charAt(i);

            if (Character.isUpperCase(word.charAt(0))){
                hasUpperCase = true;
                word = word.toLowerCase();
            }

			// Vowel check
			if ("AEIOUaeiou".indexOf(letter) != -1) {
				firstVowelIndex = i;
				break;
			}
		}

		// Re-arrange the word and apply 'ay' at the end
		String firstWord = word.substring(firstVowelIndex, word.length());
		String secondWord = word.substring(0, firstVowelIndex);

		// If index = 0 then the first word is a vowel
		String lastWord;
		if (firstVowelIndex == 0) {
			lastWord = "way";
		} else {
			lastWord = "ay";
		}

		// Check consonant cluster in the case of e.g shesh -> eshay and not eshshay
		int firstWordLength = firstWord.length();
		int secondWordLength = secondWord.length();
		String firstWordEnd = firstWord.substring(Math.max(firstWordLength-2,0),firstWordLength);
		String secondWordStart = secondWord.substring(0,secondWordLength);

		if (firstWordEnd.equals(secondWordStart)) {
			firstWord = word.substring(firstVowelIndex, word.length()-2);
		}

        if (hasUpperCase == true) {
            //firstWord.charAt(0).toUpperCase();
            firstWord = firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1);
        }

		// Append the strings
		String piglatinWord = firstWord + secondWord + lastWord;
	
		// Return the translated word
		return piglatinWord;
	}

	public static void main(String args[]){
	
		// If an input is given
		if (args.length > 0) {

			// Store word
			String word	= args[0];
			// Translate word

			String piglatinWord = Translator(word);
			// Print word
			System.out.println(piglatinWord);
		}
	
	}
}
