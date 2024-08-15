class Solution {
    public String reorganizeString(String s) {
        int chcount[]=new int[26];
        for(char c:s.toCharArray()){
            chcount[c - 'a']++;
        }
        int maxc=0;
        int maxi=0;
        for(int i=0;i<26;i++){
            if(chcount[i]>maxc){
                maxc=chcount[i];
                maxi=i;
            }
        }
        if(maxc>(s.length()+1)/2){
            return "";
        }
        char r[]=new char[s.length()];
        int index=0;
        while(chcount[maxi]>0){
            r[index]=(char)(maxi+'a');
            index+=2;
            chcount[maxi]--;
        }
for(int i=0;i<26;i++){
    while(chcount[i]>0){
        if(index>=s.length()){
            index=1;
        }
        r[index]=(char)(i+'a');
        index+=2;
        chcount[i]--;
    }
}
  return new String(r);
    }
}