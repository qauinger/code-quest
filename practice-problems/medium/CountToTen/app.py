def main():
    times = int(input())
    for i in range(times):
        numBits = int(input())
        for i in range(2 ** numBits):
            print(format(i, 'b').rjust(numBits, "0"))
        


main()