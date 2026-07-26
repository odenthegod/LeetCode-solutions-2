class Solution {
public:
    int compress(vector<char>& chars) {
        int ptr = 0;
        int n = chars.size(); 
        
        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int cnt = 0;

            while (i < n && chars[i] == ch) {
                cnt++;
                i++;
            }
            i--; 
            chars[ptr++] = ch;

            if (cnt > 1) {
                string str = to_string(cnt);
                for (char digit : str) {
                    chars[ptr++] = digit;
                }
            }
        }

        chars.resize(ptr);
        return ptr; 
    }
};
