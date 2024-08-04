class Solution {
    public boolean wordPattern(String pattern, String s) {

        String arr[]=s.split(" ");
         if(arr.length!=pattern.length()){
        return false;
      }

        HashMap<Character,String> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            char ch=pattern.charAt(i);
            String s1=arr[i];

           if(hm.containsKey(ch))
           {
            if(!hm.get(ch).equals(s1))
            {
                return false;
            }
        
        }
        else
        {
            if(hm.containsValue(s1))
            {
                return false;
            }
        
        hm.put(ch,s1);
        }
    }
        return true;
    }
}