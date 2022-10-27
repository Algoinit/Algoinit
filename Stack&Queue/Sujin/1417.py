# 사람들이 누구를 찍을 지 미리 알 수 있음
# n = 국회의원 후보 
# m = 마을의 주민 마음을 읽은 수
# 다솜이 기호 1번 
# 자신을 찍지 않으려는 사람을 돈으로 매수함 
# 다솜이가 매수해야하는 사람의 최솟값 출력

n = int(input())
candidate = []
cnt = 0
for _ in range(n):
    candidate.append(int(input()))

if n==1:
    print(cnt)
else:
    target = candidate[0]
    candidate = candidate[1:]
    while True:
        candidate.sort(reverse=True)
        if(target > candidate[0]): break
        target +=1
        candidate[0] -= 1
        cnt += 1
    print(cnt)