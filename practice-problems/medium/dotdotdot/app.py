def main():
    times = int(input())
    for i in range(times):
        word = input().lower()
        total = 0
        for j in range(len(word)):
            total += (ord(word[j]) - 96)
        print(total)

main()