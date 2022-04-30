def main():
    times = int(input())
    for i in range(times):
        nums = input().split()
        if nums[1] == '+':
            print(float(nums[0]) + float(nums[2]), " ", float(nums[0]) + float(nums[2]))
        elif nums[1] == '-':
            print(float(nums[0]) - float(nums[2]), " ", float(nums[2]) - float(nums[0]))
        elif nums[1] == '/':
            print(float(nums[0]) / float(nums[2]), " ", float(nums[2]) / float(nums[0]))
        elif nums[1] == '*':
            print(round(float(nums[0]) * float(nums[2]), 1), " ", round((float(nums[0]) * float(nums[2])), 0))

main()