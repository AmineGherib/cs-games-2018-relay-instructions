public class RankOfficers {
  public static void main(String[] args) {
    Officer hank = new Officer("Hank", new Rank("CREWMAN"));
    Officer tim = new Officer("Tim", new Rank("COMMANDER"));

    tim.sendMessage(hank,"I'm sending you am message", true);

    System.out.println(hank);
    System.out.println(hank.compareTo(tim));
  }
}
