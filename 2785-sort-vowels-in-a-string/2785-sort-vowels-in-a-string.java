class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        if (n==1) return s;

        int vowel=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel++;
            }
        }
        char[] arr=new char[vowel];
        int cnt=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                arr[cnt]=ch;
                cnt++;
            }
        }
        
        Arrays.sort(arr);
        char[] result=new char[n];
        cnt=0;
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    result[i]=arr[cnt];
                    cnt++;
            }else{
                result[i]=ch;
            }
        }
        return new String(result);
    }
}