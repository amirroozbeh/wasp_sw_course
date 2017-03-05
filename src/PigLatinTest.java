import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PigLatinTest {

	//Tests the basic rules
	
	@Test
	public void simpleWord1() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("pig");
		assertEquals("igpay", translatedWord);
	}
	@Test
	public void simpleWord2() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("banana");
		assertEquals("ananabay", translatedWord);
	}

	// Tests when words begin with consonant clusters
	
	@Test
	public void consonantWord1() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("cheers");
		assertEquals("eerschay", translatedWord);
	}
	@Test
	public void consonantWord2() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("shesh");
		assertEquals("eshay", translatedWord);
	}
	@Test
	public void consonantWord3() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("smile");
		assertEquals("ilesmay", translatedWord);
	}

	// Tests when the word begins with a vowel

	@Test
	public void vowelWord1() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("eat");
		assertEquals("eatway", translatedWord);
	}
	@Test
	public void vowelWord2() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("omelet");
		assertEquals("omeletway", translatedWord);
	}
	@Test
	public void vowelWord3() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("egg");
		assertEquals("eggway", translatedWord);
	}
	@Test
	public void vowelWord4() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("are");
		assertEquals("areway", translatedWord);
	}

	// Test if a word starts with a capital letter

	@Test
	public void evaluatesCapitalLetterPig() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.translator("Pig");
		assertEquals("Igpay", translatedWord);
	}

    @Test
	public void evaluatesCapitalLetterCheers() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.translator("Cheers");
		assertEquals("Eerschay", translatedWord);
	}

	@Test
	public void evaluatesCapitalLetterOmelet() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.translator("Omelet");
		assertEquals("Omeletway", translatedWord);
	}

}
