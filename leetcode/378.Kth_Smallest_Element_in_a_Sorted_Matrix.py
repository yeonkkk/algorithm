class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        heap = []

        for mat in matrix:
            for ele in mat:
                heapq.heappush(heap, ele)

        return heapq.nsmallest(k, heap)[-1]
        
