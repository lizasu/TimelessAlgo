public class P01MergeStringsAlternately {

  public String mergeAlternately(String word1, String word2) {
    // loop until bigger word length, append characters from both words until they run out
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder(len1 + len2);
        int len = Math.max(len1, len2);
        for(int i = 0; i < len; i++) {
            if(i < len1) {
                sb.append(word1.charAt(i));
            }
            if(i < len2) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
  }
}
