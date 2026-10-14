class Solution {

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (helper(board, word, i, j, 0, new HashSet<>()))
                        return true;
                }
            }
        }

        return false;
    }

    public boolean helper(char[][] board, String word,
                          int i, int j, int idx,
                          HashSet<String> set) {

        if (idx == word.length())
            return true;

        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[i].length)
            return false;

        if (set.contains(i + " " + j))
            return false;

        if (board[i][j] != word.charAt(idx))
            return false;

        set.add(i + " " + j);

        boolean chk =
                helper(board, word, i, j + 1, idx + 1, set) || // right
                helper(board, word, i + 1, j, idx + 1, set) || // down
                helper(board, word, i, j - 1, idx + 1, set) || // left
                helper(board, word, i - 1, j, idx + 1, set);   // up

        set.remove(i + " " + j);

        return chk;
    }
}