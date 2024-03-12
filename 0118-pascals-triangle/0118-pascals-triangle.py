class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        if numRows == 1:
            return [[1]]
        if numRows == 2:
            return [[1], [1,1]]

        answer = [[1], [1, 1]]
        previous = [1, 1]

        for i in range(2, numRows):
            new = [1]
            for j in range(i - 1):
                new.append(previous[j] + previous[j + 1])

            new.append(1)
            answer.append(new)
            previous = new.copy()

        return answer
