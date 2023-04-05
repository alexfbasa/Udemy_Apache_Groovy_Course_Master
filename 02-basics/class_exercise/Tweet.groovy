@groovy.transform.ToString
class Tweet {

    String username // @therealdanvega
    String text
    Integer retweets
    Integer favorites
    Date createdOn
    
    public Tweet(String user, String tweet) {
       username = user
       text = tweet
       retweets = 0
       favorites = 0
       createdOn = new Date()
    }
    
    void addToRetweets(){
        retweets += 1
    }
    void addToFavorites(){
        favorites += 1
    }

}
// It won't work
// def tweet = new Tweet("Alexa", "New text")
// println tweet
/*
When you have a class definition, you can have the same name of a class as you can the file itself.
If it's a script, you cannot have a class with the same name in that file.
The reason is Groovy will actually create a containing class with the same name on the file.
So we have both this tweet class and we have a script in here because anything outside of a class is
now considered a script.
So it wraps that and a containing class called tweet.
Therefore, we have two definitions of a tweet class in this same file.
 */