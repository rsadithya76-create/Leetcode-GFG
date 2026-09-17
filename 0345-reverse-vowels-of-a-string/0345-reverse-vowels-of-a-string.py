class Solution(object):
    def reverseVowels(self, s):
        i=0
        j=len(s)-1
        s=list(s)
        l=['a','e','i','o','u','A','E','I','O','U']
        while i<j:
            if s[i] not in l:
                i+=1
            elif s[j] not in l:
                j-=1
            else:
                temp=s[i]
                s[i]=s[j]
                s[j]=temp
                i+=1
                j-=1
        return "".join(s)
