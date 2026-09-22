class Solution(object):
    def isPalindromic(self, s):
        f = ""

        for i in s:
            f = f + format(ord(i), '08b')

        return f == f[::-1]