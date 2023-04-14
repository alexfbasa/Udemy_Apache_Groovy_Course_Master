def map = [:]
println map
println map.getClass().getName()

def person = [first:"Dan",last:"Vega",email:"danvega@gmail.com"]
println person
println person.first
println person['first']  // The same as last one

person.twitter = "@therealdanvega"
println "Example with twitter $person"

def emailKey = "EmailAddress"
def twitter = [username:"@therealdanvega",(emailKey):"danvega@gmail.com"] // Closure make emailKey a key
println twitter

println person.size()
println person.sort()

// looping through person
for( entry in person ) {
    println entry
}

for( key in person.keySet() ) {
    println "$key:${person[key]}"
}

// each | eachWithIndex