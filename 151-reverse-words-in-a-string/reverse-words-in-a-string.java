class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String s1="";
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i].equals("")||arr[i].equals(" ")) continue;
            else s1=s1+arr[i].trim()+" ";
        }
        return s1.trim();
    }
}