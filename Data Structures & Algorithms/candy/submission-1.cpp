class Solution {
public:
    int candy(vector<int>& ratings) {

        priority_queue<pair<int, int>,
                       vector<pair<int, int>>,
                       greater<pair<int, int>>> minHeap;

        vector<int> res(ratings.size(), 1);

        int total = ratings.size();

        for (int idx = 0; idx < ratings.size(); idx++) {
            minHeap.push({ratings[idx], idx});
        }

        while (!minHeap.empty()) {

            auto temp = minHeap.top();
            minHeap.pop();

            int prev = temp.second - 1;
            int cur = temp.second;
            int next = temp.second + 1;

            int left = prev < 0 ? 0 :
                       (ratings[prev] < ratings[cur] ? res[prev] : 0);

            int right = next >= ratings.size() ? 0 :
                        (ratings[next] < ratings[cur] ? res[next] : 0);

            total += max(left, right);
            res[cur] += max(left, right);
        }

        return total;
    }
};