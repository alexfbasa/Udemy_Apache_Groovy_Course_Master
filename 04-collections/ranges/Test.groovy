Range<String> letter = 'a'..'x'
letter.each {print it}
println ""
println(letter)
for (def l : letter) {
    println(l)
}

Date today = new Date()
println today

def oneWeekAway = today + 7
println oneWeekAway

def days = today..oneWeekAway
println days
days.each { println it }

def inclRange = 0..5
println inclRange
assert inclRange == [0, 1, 2, 3, 4, 5]