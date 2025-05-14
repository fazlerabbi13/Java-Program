public class HumanIn {
    protected String disease = "Dangue";
    public void title(){
        System.err.println("So sad for");
    }
}

class MailFemail extends HumanIn{
    public  String situation = "Faver";
    public static void main(String[] args) {
        MailFemail firstDisease = new MailFemail();
        firstDisease.title();
        System.err.println(firstDisease.disease + " " + firstDisease.situation);
    }
}
