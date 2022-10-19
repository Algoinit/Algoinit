#첫째줄 피연산자의 개수
#둘째 줄 후위표기식
from collections import defaultdict

num = int(input())
cal = list(input())
stack = []
dic = defaultdict(int)


for i in cal:
    if(ord(i)>=65 and ord(i)<=90):
        if dic[i] == 0:
            number = int(input())
            dic[i] = number
        stack.append(dic[i])

    else:
        sum = 0
        if(i=="/" or i=="-"):
            b = stack.pop()
            a = stack.pop()
        else:
            a = stack.pop()
            b = stack.pop() 
        sum += eval(str(a)+i+str(b))                 
        stack.append(sum)
print(f"{sum:.2f}")

        
        
       
        