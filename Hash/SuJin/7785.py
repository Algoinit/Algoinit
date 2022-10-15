num = int(input())
office = {}
result = []

for _ in range(num):
    name, status = input().split()
    if status == "enter":
        office[name] = office.get(name,0) + 1
    else:
        office[name] -= 1    

for key,value in office.items():
    if value == 1:
        result.append(key)
result.sort(reverse=True)

for name in result:
    print(name)