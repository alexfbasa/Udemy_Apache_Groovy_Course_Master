import groovy.transform.ToString

@ToString
class Tweet {

    String userName
    String text
    Double tweets
    Double favorites
    Date d

    Tweet(String user, String text) {
        this.userName = user
        this.text = text
        d = new Date()
        tweets = 0
        favorites = 0

    }

    void addTweet() {
        tweets += 1
    }

    void addFav() {
        favorites += 1
    }
}