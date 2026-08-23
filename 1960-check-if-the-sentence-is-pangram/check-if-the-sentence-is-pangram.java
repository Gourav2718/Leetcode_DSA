class Solution {
    public boolean checkIfPangram(String sentence) {
        List<Character> seen = new ArrayList<>();

        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);

            if(!seen.contains(c)){
                seen.add(c);
            }
        }

        return seen.size() == 26;
    }
}