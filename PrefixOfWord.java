class PrefixOfWord {

	public int isPrefixOfWord(String sentence, String searchWord) {
		String[] sent = sentence.split(" "); //spilt the sentance into word and store every word in array
		for (int i = 0; i < sent.length; i++) {   //iterate over array  
			if (sent[i].startsWith(searchWord)) {    //use startwith method to find prefix
				return i + 1;                        //return index of word
			}
		}
		return -1;   //return if not found
	}

}
