def solution(s):
    answer = True
    arr = list(s)
    stack = []
    
    for i in arr:
        if i == '(':
            stack.append('(')
        else:
            if len(stack) != 0 and stack[-1] == '(':
                stack.pop()
            else:
                return False
            
    if len(stack) != 0:
        return False
            
    return True