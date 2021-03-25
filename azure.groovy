this is a sample file 

def defaults = [
acrHost : azureacr.io
  
]


def call (params)
 dev a = defaults + params
