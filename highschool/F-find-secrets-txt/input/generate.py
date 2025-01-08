import random

max_depth = 9
max_subdirs = 5

wordslist = [
    "example", "here", "there", "you", "any", "is", "some", "thing", "word", "to", "test", "with", "and", "or", "not",
    "but", "this", "people", "history", "way", "art", "world", "information", "map", "two", "family", "government",
    "health", "system", "computer", "meat", "year", "thanks", "music", "person", "reading", "method", "data", "food",
    "understanding", "theory", "law", "bird", "literature", "problem", "software", "control", "knowledge", "power",
    "ability", "economics", "love", "internet", "television", "science", "library", "nature", "fact", "product", "idea",
    "temperature", "investment", "area", "society", "activity", "story", "industry", "media", "thing", "oven",
    "community", "definition", "safety", "quality", "development", "language", "management", "player", "variety",
    "video", "week", "security", "country", "exam", "movie"
]
extensions = ["txt", "pdf", "png", "jpg", "mp4", 
                "mp3", "wav", "zip", "rar", "7z",
                "tar", "gz", "xz", "exe", "bin",
                "c", "cpp", "java", "py", "js",
                "html", "css", "scss", "json", "xml",
                "csv", "tsv", "sql", "db", "dbf",
                "xls", "xlsx", "ods", "doc", "docx",
                "odt", "ppt", "pptx", "odp", "md"]

def rand_between(min, max):
    return random.randint(min, max)

def choose_random(arr):
    return random.choice(arr)

secrets_path = None

def generate_dir(depth, cur_path, directory):
    global secrets_path
    if depth > max_depth - 1:
        return

    prefix = "-" * depth + (" " if depth != 0 else "")
    print(prefix + directory)

    cur_path = cur_path + directory

    max_dirs = rand_between(1, max_subdirs)
    names = random.sample(wordslist, max_dirs)
    for i in range(max_dirs):
        generate_dir(depth + 1, cur_path, names[i]+"/")

    max_files = rand_between(1, len(extensions))
    for i in range(max_files):
        print("-" * (depth + 1) + " " + choose_random(wordslist) + "." + extensions[i])

    if depth == max_depth - 1 and not secrets_path and random.random() < 0.0001:
        print("-" * (depth + 1) + " secrets.txt")
        secrets_path = "/" + cur_path + "secrets.txt"

generate_dir(0, "", choose_random(wordslist)+"/")

if secrets_path:
    print("\nANSWER: "+secrets_path)
else:
    print("\nFAILED: no secrets.txt generated. Try running the script again.")
