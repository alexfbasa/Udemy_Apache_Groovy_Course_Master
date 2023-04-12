// Java Sample Pattern

import java.util.regex.*;

Pattern pattern = Pattern.compile("a\\\\b")
println pattern
println pattern.class

// What patterns will look like in Groovy

String slashy = /a\b/
String url = $/http://threaldanvega.com/blog/$

println slashy.class

def pattern1 = ~/a\b/
println pattern1.class

// Find | Match

def text = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern2 = ~/Cleveland Sports Fan/
def finder = text =~ pattern2
def matcher = text ==~ pattern2

println finder
println finder.size()
println matcher

// ----------------------------------------------------------------------------------

def s = "Cleveland Sports Fan"
def pattern3 = ~/Cleveland Sports Fan/
def b = s ==~ pattern3

println b

if (b) {
    println b
}// do something


// ----------------------------------------------------------------------------------

def text01 = "Being a Cleveland Sports Fan is no way to go through life" // true
def pattern06 = ~/Cleveland/