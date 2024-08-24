class Solution {
    public String reverseWords(String s) {
        return Arrays.asList(s.split(" ")).reversed()
        .stream().filter(e -> !e.isEmpty()).collect(Collectors.joining(" "));
    }
    
}