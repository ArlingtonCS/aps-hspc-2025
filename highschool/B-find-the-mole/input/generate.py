# Run this multiple times: py generate.py >>input.txt

import random

names = ["alice", "bob", "charlie", "david", "eve", "frank", "grace", "heidi", "ivan", "judy", "kevin", "linda", "mallory", "nancy", "oscar", "peggy", "quentin", "randy", "steve", "trent", "ursula", "victor", "wendy", "xavier", "yvonne", "zelda"]
def generate_case():
    found = False
    num_datapoints = random.randint(1, 1000)
    while found == False:
        people = []
        for i in range(0, num_datapoints):
            name = random.choice(names)
            missionsCompleted = random.randint(0, 20)
            people.append((name, missionsCompleted))

        agentsCounts = {}
        agentsTotals = {}
        for person in people:
            agentsCounts[person[0]] = agentsCounts.setdefault(person[0], 0)+1
            agentsTotals[person[0]] = agentsTotals.setdefault(person[0], 0)+person[1]

        num_below_4 = 0
        for name in agentsCounts:
            average = agentsTotals[name] / agentsCounts[name]
            if average < 4:
                num_below_4 += 1

        if num_below_4 == 1:
            found = True

    print(num_datapoints)
    for person in people:
        print(f"{person[0]},{person[1]}")

generate_case()