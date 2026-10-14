class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();    
        for(int i=0;i<words.length;i++){
            String temp=null;
            for(int j=0;j<words.length;j++){
                if( i==j || words[i].length()>words[j].length())continue;
                if(words[i].equals(words[j]) && i>j)continue;
                if(words[j].contains(words[i])){
                    temp = words[i];break;}

            }
            if(temp!=null)res.add(temp);
        }

        return res;

    }
}