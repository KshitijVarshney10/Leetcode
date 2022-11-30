class Solution {
    class Trie {
        Map<Character, Trie> neighbors;
        String word;
        
        Trie() {
            neighbors = new HashMap<>();
        }
    }
    
    Trie root;
    char[][] board;
    boolean[][] visit;
    int n, m;
    Set<String> set = new HashSet<>();
    
    public List<String> findWords(char[][] board, String[] words) {
        root = new Trie();
        this.board = board;
        n = board.length; m = board[0].length;
            
        for(String word : words) {
            insert(word, root);
        }
        
        List<String> res = new ArrayList<>();
    
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                if(root.neighbors.containsKey(board[r][c])) {
                    visit = new boolean[n][m];
                    search(root.neighbors.get(board[r][c]), res, r, c);
                }
            }
        }
        return res;
    }
    
    int[] d = {-1, 0, 1, 0, -1};
    
    void search(Trie node, List<String> res, int r, int c) {
        if(node.word != null && !set.contains(node.word)) {
            res.add(node.word);
            set.add(node.word);
        }
        
        visit[r][c] = true;
            
        for(int i = 1; i < 5; i++) {
            int cr = r + d[i - 1];
            int cc = c + d[i];
            
            if(cr < 0 || cc < 0 || cr >= n || cc >= m || visit[cr][cc]) continue;
            if(node.neighbors.containsKey(board[cr][cc])) {
                search(node.neighbors.get(board[cr][cc]), res, cr, cc);
                visit[cr][cc] = false;
            }
        }
    }
    
    void insert(String word, Trie node) {
        for(char c : word.toCharArray()) {
            if(!node.neighbors.containsKey(c))
                node.neighbors.put(c, new Trie());
            node = node.neighbors.get(c);
        }
        node.word = word;
    }
}
