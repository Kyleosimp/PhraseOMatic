public class PhraseOMatic {
    public static void main(String[] args) {
        //Three sets of words to choose from
        String[] wordListOne = {"Buy it", "Use it", "Break it", "Fix it", "Trash it", "Change it", "Mail", "Upgrade it", "Charge it", "Point it", "Zoom it","Press it", "Snap it", "Work it", "Quick erase it", "Write it"};
        String[] wordListTwo = {"Zamir", "SPF10", "Bruno Major", "SadBoyProlific",  "Keshi", "The Neighbourhood", "Demxntia", "Biosphere", "Joji", "Verzache", "Rainlord", "Slchld", "Lewis Capaldi", "Rich Brian",};
        String[] wordListThree = {"Kill you where you standing", "I don't think you understand it", "I can't stand you", "Not gonna take that sitting down", "Okay I'll slam 'em", "Body drop like drowning pool", "17 boy stay in school", "Ain't gonna make me lose my cool", "That fan gonna blow right out the blue", "I see you", "When I see you like a movie preview", "But he ain't coming back", "So don't be waiting for that sequel", "Your bones is getting broken", "Like that ex that made you single", "I reverse your hype entirely", "And see you in my rear view",};

        //find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //phrase-building
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " +wordListThree[rand3];

        //print out phrase
        System.out.println("Here's an idea... " + phrase);

    }
}
