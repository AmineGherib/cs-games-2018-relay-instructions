public class Officer implements Comparable<Officer> {
  private String name;
  private Rank rank;
  private String message_received;
  
  public Officer() {
    this.rank = new Rank();  
  }

  public Officer(Rank rank) {
    this.name = "Penguin";
    this.rank = rank;  
  } 

  public Officer(String name, Rank rank) {
    this.name = name;
    this.rank = rank;  
  }

  public String getName() {
    return name;
  }
  
  public Rank getRank() {
    return rank;
  }

  public void sendMessage(Officer otherOfficer, String message, boolean replyAuthorization) {
    if(this.compareTo(otherOfficer) == 1) {
      otherOfficer.getMessage(message,replyAuthorization, this);
    }
  }

  public void getMessage(String message_received, boolean replyAuthorization, Officer sender) {
    this.message_received = message_received;
    if(replyAuthorization) {
      this.sendMessage(sender,"Message received.", false);
    }
  }

  public String getMessageReceived() {
    return message_received;
  }

  public int compareTo(Officer otherOfficer) {
    return this.getRank().compareTo(otherOfficer.getRank());
  }

  public String toString() {
    return "My name is " + name + " and my rank is " + rank;  
  }
}
