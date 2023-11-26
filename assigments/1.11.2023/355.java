class Tweet {
    int tweetID;
    int userID;
    int time;
    Tweet(int tI, int uI, int T) {
        tweetID=tI;
        userID=uI;
        time=T;
    }
}
class User {
    int userID;
    Set<Integer> follows = new HashSet<>();
    LinkedList<Tweet> tweets = new LinkedList<>();
    User (int uI) {
        userID=uI;
    }
    void publishTweet(int twI, int T) {
        tweets.addLast(new Tweet(twI, userID, T));
        if (tweets.size() > 10) {
            tweets.removeFirst();
        }
    }
}
class Twitter {   
    private Map<Integer, User> users=new HashMap<>();
    private int time = 0;
    public Twitter() {
    }
    public void postTweet(int userID, int tweetID) {
        users.putIfAbsent(userID, new User(userID));
        users.get(userID).publishTweet(tweetID, ++time);
    }
    public List<Integer> getNewsFeed(int userID) {
        users.putIfAbsent(userID, new User(userID));   
        User user=users.get(userID);
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a,b) -> {
            return b.time - a.time; 
                    });
        for (Tweet tweet : user.tweets) {
            pq.offer(tweet);
        }
        for (Integer fId : user.follows) {
            User followa = users.get(fId);
            for (Tweet tweet : followa.tweets) {
                pq.offer(tweet);
            }
        }
        List<Integer> tweets=new ArrayList<>();
        for (int i=0; i < 10 && !pq.isEmpty(); i++) {
            tweets.add(pq.poll().tweetID);
        }
        return tweets;
    }
    public void follow(int followerID, int followeeID) {
        users.putIfAbsent(followerID, new User(followerID));
        users.putIfAbsent(followeeID, new User(followeeID));
        users.get(followerID).follows.add(followeeID);
    }
    public void unfollow(int followerID, int followeeID) {
        users.putIfAbsent(followerID, new User(followerID));
        users.putIfAbsent(followeeID, new User(followeeID));
        
        users.get(followerID).follows.remove(followeeID);
    }
}