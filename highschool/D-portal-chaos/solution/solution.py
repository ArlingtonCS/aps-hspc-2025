class Graph:
    def __init__(self, edges):
        self.edges = edges
        self.graph_dict = {}
        
        for start, end in self.edges:
            if start in self.graph_dict:
                self.graph_dict[start].append(end)
            else:
                self.graph_dict[start] = [end]
                
            if end in self.graph_dict:
                self.graph_dict[end].append(start)
            else:
                self.graph_dict[end] = [start]
    
    def get_shortest_path(self, start, end, path=[]):
        path = path + [start]
        
        if start == end:
            return path
        
        if start not in self.graph_dict:
            return None
        
        shortest_path = None
        for node in self.graph_dict[start]:
            if node not in path:
                sp = self.get_shortest_path(node, end, path)
                if sp:  # if sp is not None
                    if shortest_path is None or len(sp) < len(shortest_path):
                        shortest_path = sp
                        
        return shortest_path

n = int(int(input()))
portals = []

for _ in range(n):
    line = list(map(int, input().split(",")))
    portals.append((line[0], line[1]))

graph = Graph(portals)

start = 1
end = 100

shortest_path = graph.get_shortest_path(start, end)
if shortest_path:
    print(len(shortest_path) - 1)
else:
    print(-1)


