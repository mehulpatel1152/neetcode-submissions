import heapq

class Solution:
    def candy(self, ratings):

        minHeap = []
        res = [1] * len(ratings)

        total = len(ratings)

        for idx in range(len(ratings)):
            heapq.heappush(minHeap, (ratings[idx], idx))

        while minHeap:

            val, cur = heapq.heappop(minHeap)

            prev = cur - 1
            next = cur + 1

            left = 0 if prev < 0 else (
                res[prev] if ratings[prev] < ratings[cur] else 0
            )

            right = 0 if next >= len(ratings) else (
                res[next] if ratings[next] < ratings[cur] else 0
            )

            total += max(left, right)
            res[cur] += max(left, right)

        return total