import java.util.*;
public class friends {
    public static <Stirng> void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        ArrayList<String> bestFriends = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String nextLine;
        System.out.println("Welcome! Please enter your friends' first name. Enter 'd' when you are done");
        boolean check = false;
        while(!check){
            nextLine = input.nextLine();
            if(nextLine.equalsIgnoreCase("d")) {
                check = true;
            } else {
                friends.add(nextLine);
            }
        }
        System.out.println("You have entered " + friends.size() + " friends");
        System.out.println("Here is your list of friends:");
        printArray(friends);
        System.out.println("The two friends that have been randomly chosen to go to the movies with you are");
        System.out.println(randomFriend(friends) + " and " + randomFriend(friends));
        System.out.println("Which friends would you like to take off your friends less and add to your best friends list?");
        System.out.println("Indicate with the number next to each name. Enter 0 to end. Start with the last person.");
        int nextInt;
        while (check) {
            nextInt = input.nextInt();
            if(nextInt == 0){
                check = false;
            } else {
                bestFriends.add(friends.get(nextInt-1));
                friends.remove(nextInt-1);
            }
        }
        System.out.println("Here is your list of friends:");
        printArray(friends);
        System.out.println("Here is your list of best friends:");
        printArray(bestFriends);



    }
    public static String randomFriend (ArrayList<String> arr){
        Random rand = new Random();
        return arr.get(rand.nextInt(arr.size()));
    }
    public static void printArray (ArrayList<String> arr){
        for(int i = 1; i <= arr.size();i++){
            System.out.println(i + ". " + arr.get(i-1));
        }
    }
}
