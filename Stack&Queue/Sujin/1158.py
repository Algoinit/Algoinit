#1번~ n번까지 n명의 사람 
#양의 정수 k
#k번재 사람 제거

n, k= map(int ,input().split())
stack = [False] * n
arr = [i for i in range(1,n+1)]
result = []
cnt = 1
stack_len = 0
idx = 0

while(stack_len < n):
    if idx >= n:
        idx = idx%n
    if stack[idx] == False:
        if cnt == k:
            stack[idx] = True
            stack_len +=1
            result.append(arr[idx])
            cnt = 1
        else:
            cnt += 1
    idx += 1


print("<"+str(result)[1:-1]+">")
    
    
