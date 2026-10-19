class Solution {
    public String toHex(int num) {
        if (num==0) return "0";
        char[] map="0123456789abcdef".toCharArray();
        StringBuilder s=new StringBuilder();
        while(num!=0){
            int idx=num & 0xF;
            s.append(map[idx]);
            num>>>=4;
        }
        return s.reverse().toString();
    }
}