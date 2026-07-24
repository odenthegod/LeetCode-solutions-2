class Solution {
public:
    string removeOccurrences(string s, string part) {
        while(s.length()>0 &&s.find(part)<s.length()){
            int pos=s.find(part);
            int len=part.length();
            s.erase(pos,len);
        }
        return s;
    }
};