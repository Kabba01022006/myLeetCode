1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.equals(goal)) return true;
4        if(s.length()!=goal.length()) return false;
5        int rot = s.length()-1;
6        StringBuilder str = new StringBuilder(s);
7        while(rot!=0){
8            char last = str.charAt(str.length() - 1);
9            str.deleteCharAt(str.length() - 1);
10            str.insert(0, last);
11            if(goal.equals(str.toString())) return true;
12            rot--;
13        }
14        return false;
15    }
16}