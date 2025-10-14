class Solution {
    public boolean isIsomorphic(String s, String t) {
            HashMap<Character,Character> smap = new HashMap<>();
            HashMap<Character,Character> tmap = new HashMap<>();


            if(s.length() != t.length()){
                return false;
            }a

            for(int i=0;i<s.length();i++){

                Character sc = s.charAt(i);
                Character tc = t.charAt(i);

                if(smap.containsKey(sc))
                {
                    if(smap.get(sc) != tc) return false;
                }else{
                    smap.put(sc,tc);
                }

                if(tmap.containsKey(tc))
                {
                    if(tmap.get(tc) != sc) return false;
                }else{
                    tmap.put(tc,sc);
                }

            }


        return true;
    }
}