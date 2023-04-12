Range r = 1..10
for ( def number_r : r){
    println "this is number ${number_r}"
}
println r
println r.class.name
println r.from
println r.to

assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7 // thank the GDK for that simple statement

println today
println oneWeekAway

Range days = today..oneWeekAway
println days

Range letters = 'a'..'z'
letters.each {print it}