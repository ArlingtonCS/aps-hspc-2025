# returns the name of the mole
# datapoints is a list of strings matching the format "NAME,#"[]
def find_mole(datapoints):
    agent_missions = {}
    
    for data in datapoints:
        name, missions = data.split(',')
        missions = int(missions)
        
        if name not in agent_missions:
            agent_missions[name] = []
        
        agent_missions[name].append(missions)
    
    for agent, missions in agent_missions.items():
        average_missions = sum(missions) / len(missions)
        if average_missions < 4:
            return agent

# parsing code, DO NOT MODIFY
testcases = int(input())
for _ in range(testcases):
    num_datapoints = int(input())
    datapoints = []
    for _ in range(num_datapoints):
        datapoints.append(input())
    print(find_mole(datapoints))
