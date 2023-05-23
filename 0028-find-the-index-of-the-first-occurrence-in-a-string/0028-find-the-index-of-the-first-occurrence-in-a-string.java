class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length() < needle.length()) return -1;

        for(int i=0; i<haystack.length(); i++){
            String subHay = haystack.substring(i);
            System.out.println(subHay);
            
            for(int c=0; c<needle.length(); c++){
                if(subHay.length() < needle.length()) break;
                System.out.println(subHay.charAt(c)+ " " + needle.charAt(c));
                if(subHay.charAt(c) != needle.charAt(c)) break;
                if(c+1 == needle.length()) return i;
            }

        }
        return -1;

    }
}