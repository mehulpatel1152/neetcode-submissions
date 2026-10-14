class Solution {
    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for (String x : strs) {
            str.append(x.length()).append('#').append(x);
        }

        return str.toString();
    }
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()) {
            int len = 0;

            while (str.charAt(i) != '#') {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;

            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < len; j++) {
                temp.append(str.charAt(i++));
            }

            res.add(temp.toString());
        }
        return res;
    }
}
