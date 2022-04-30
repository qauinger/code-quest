def main():
    times = int(input())
    for i in range(times):
        numAircrafts = int(input())
        for j in range(numAircrafts):
            name, coords = input(), []
            for k in range(3):
                coords.append(input().split(','))
            
            slopeBeggining = (float(coords[1][1]) - float(coords[0][1]))/float((coords[1][0]) - float(coords[0][0]))
            slopeEnd = (float(coords[2][1]) - float(coords[0][1]))/float((coords[2][0]) - float(coords[0][0]))
            if (slopeBeggining < -.8 & slopeBeggining >= -1.6) & (slopeEnd < -.8 & slopeEnd >= -1.6):
                print(name, "Clear to Land!")
            else:
                print(name, "Abort Landing!")
main()