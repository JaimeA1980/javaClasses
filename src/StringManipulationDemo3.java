
public class StringManipulationDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  .contains();
		 *  This method searches the sequence of characters in the string.
		 *  if the sequences of characters are found,
		 *  the it returns true otherwise returns false.
		 */

		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		
		System.out.println(sentence.contains("w"));
	}

}
