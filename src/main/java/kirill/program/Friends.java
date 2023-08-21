package kirill.program;

public class Friends {
    public static void main(String[] args) {
        int count = 0;
        int firstFriendSpeed = 1;
        int secondFriendSpeed = 2;
        int dogSpeed = 5;
        int distance = 10000;
        String goalFriend = "fr 2";

        while(distance>=10){
            if(!"fr 1".equals(goalFriend)){
                int time = distance/(secondFriendSpeed+dogSpeed);
                goalFriend = "fr 1";
                distance -= (firstFriendSpeed+secondFriendSpeed) * time;
                count += 1;
            }else{
                int time = distance/(firstFriendSpeed+dogSpeed);
                goalFriend = "fr 2";
                distance -= (firstFriendSpeed+secondFriendSpeed) * time;
                count += 1;
            }
        }
        System.out.println(count);

    }
}
