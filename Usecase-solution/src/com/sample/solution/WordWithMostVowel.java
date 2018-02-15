package com.sample.solution;

public class WordWithMostVowel {
	public static void main(String args[]) {

		WordWithMostVowel.getWordWithMostVowel(
				"Arrived compass prepare an on as. Reasonably particular on my it in sympathize. Independence now easy eat hand how.");
	}

	public static void getWordWithMostVowel(String sentence) {
		String[] words = sentence.split(" ");

		String wordWithVowel = "";
		int vowelCount = 0;

		for (String str : words) {

			int currentWordVowelCount = countVowels(str);

			if (currentWordVowelCount > vowelCount) {
				wordWithVowel = str;
				vowelCount = currentWordVowelCount;
			}
		}

		System.out.println("Word with most vowel ::" + wordWithVowel + "\ncount of vowel::" + vowelCount);

	}

	public static int countVowels(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			char vowel = word.charAt(index);
			if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == 'A'
					|| vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {

				count++;
			}
		}
		return count;
	}
}
