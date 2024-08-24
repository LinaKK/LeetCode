class Solution {
    public String reverseWords(String s) {
        System.out.println(Arrays.asList(s.split(" ")));
        return Arrays.asList(s.split(" ")).reversed()
        .stream().filter(e -> !e.isEmpty()).collect(Collectors.joining(" "));
    }
    
}