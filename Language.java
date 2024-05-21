class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionSpoken,
  String wordOrder){
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionSpoken = regionSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo(){
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionSpoken + ".");
    System.out.println("The language follows the word order: " + wordOrder + "."); 
  }
  public static void main(String[] args){
    Language aLang = new Language("Spanish", 555000000, "Spain, Latin America and Equatorial Guinea", "subject-verb-object");
    aLang.getInfo();

    Mayan aMayan = new Mayan("Ki'che'", 2330000);
    aMayan.getInfo();

    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
    mandarin.getInfo();
    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
    burmese.getInfo();
  }
}