# returns the name of the mole
# datapoints is a list of strings matching the format "NAME,#"[]
def find_mole(datapoints):
    #### WRITE CODE HERE ####
    pass




















# parsing code, DO NOT MODIFY
testcases = int(input())
for _ in range(testcases):
    num_datapoints = int(input())
    datapoints = []
    for _ in range(num_datapoints):
        datapoints.append(input())
    print(find_mole(datapoints))
