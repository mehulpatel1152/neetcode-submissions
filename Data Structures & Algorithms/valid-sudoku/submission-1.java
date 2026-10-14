class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer,HashSet<Integer>> row = new HashMap<>();
        HashMap<Integer,HashSet<Integer>> col = new HashMap<>();

        for(int i=1;i<=9;i++){
            row.put(i,new HashSet<>());
            col.put(i,new HashSet<>());
        }

        for (int i = 0; i < 9; i += 3) {
            int[] arr = new int[10];

            for (int j = i; j < i + 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (board[j][k] == '.')
                        continue;

                    int num = board[j][k] - '0';

                    if(row.get(num).contains(j))return false;
                    else row.get(num).add(j);

                    if(col.get(num).contains(k))return false;
                    else col.get(num).add(k);

                    if (arr[num] == 1)
                        return false;
                    arr[num] = 1;
                }
            }

            arr = new int[10];

            for (int j = i; j < i + 3; j++) {
                for (int k = 3; k < 6; k++) {
                    if (board[j][k] == '.')
                        continue;

                    int num = board[j][k] - '0';


                    if(row.get(num).contains(j))return false;
                    else row.get(num).add(j);

                    if(col.get(num).contains(k))return false;
                    else col.get(num).add(k);

                    if (arr[num] == 1)
                        return false;
                    arr[num] = 1;
                }
            }

            arr = new int[10];

            for (int j = i; j < i + 3; j++) {
                for (int k = 6; k < 9; k++) {
                    if (board[j][k] == '.')
                        continue;

                    int num = board[j][k] - '0';


                    if(row.get(num).contains(j))return false;
                    else row.get(num).add(j);

                    if(col.get(num).contains(k))return false;
                    else col.get(num).add(k);

                    if (arr[num] == 1)
                        return false;
                    arr[num] = 1;
                }
            }
        }

        return true;
    }
}
