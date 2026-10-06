1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.equals(goal)) return true;
4        if(s.length()!=goal.length()) return false;
5        int rot = s.length()-1;
6        StringBuilder str = new StringBuilder(s);
7        while(rot!=0){
8            char ch=str.charAt(0);
9            str.deleteCharAt(0);
10            str.append(ch);
11            if(str.toString().equals(goal)) return true;
12            rot--;
13        }
14        return false;
15    }
16}