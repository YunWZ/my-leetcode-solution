package cn.com.yunweizhan.middle;

import java.util.*;

public class Solution355 {
    class Node {
        int publiser;
        int id;

        public Node(int publiser, int id) {
            this.publiser = publiser;
            this.id = id;
        }
    }

    Map<Integer, Set<Integer>> followMap = new HashMap<>();
    List<Node> twitterList = new LinkedList<>();

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        twitterList.add(new Node(userId, tweetId));
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        Set<Integer> followee = followMap.get(userId);
        List<Integer> res = new LinkedList<>();
        int count = 0;
        ListIterator<Node> nodeListIterator = twitterList.listIterator(twitterList.size());
        if (followee != null) {
            while (nodeListIterator.hasPrevious()) {
                if (count == 10) {
                    break;
                }
                Node previous = nodeListIterator.previous();
                if (followee.contains(previous.publiser) || previous.publiser == userId) {
                    res.add(previous.id);
                    count++;
                }
            }
        } else {
            while (nodeListIterator.hasPrevious()) {
                if (count == 10) {
                    break;
                }
                Node previous = nodeListIterator.previous();
                if (previous.publiser == userId) {
                    res.add(previous.id);
                    count++;
                }
            }
        }
        return res;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        Set<Integer> followerSet = followMap.getOrDefault(followerId, new HashSet<Integer>());
        followerSet.add(followeeId);
        followMap.put(followerId, followerSet);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followerSet = followMap.get(followerId);
        if (followerSet == null) {
            return;
        }
        followerSet.remove(followeeId);
    }

    public static void main(String[] args) {
        Solution355 solution355 = new Solution355();
        // 用户1发送了一条新推文 (用户id = 1, 推文id = 5).
        solution355.postTweet(1, 5);

// 用户1的获取推文应当返回一个列表，其中包含一个id为5的推文.
        System.out.println(solution355.getNewsFeed(1));

// 用户1关注了用户2.
        solution355.follow(1, 2);

// 用户2发送了一个新推文 (推文id = 6).
        solution355.postTweet(2, 6);

// 用户1的获取推文应当返回一个列表，其中包含两个推文，id分别为 -> [6, 5].
// 推文id6应当在推文id5之前，因为它是在5之后发送的.
        System.out.println(solution355.getNewsFeed(1));

// 用户1取消关注了用户2.
        solution355.unfollow(1, 2);

// 用户1的获取推文应当返回一个列表，其中包含一个id为5的推文.
// 因为用户1已经不再关注用户2.
        System.out.println(solution355.getNewsFeed(1));
    }
}
