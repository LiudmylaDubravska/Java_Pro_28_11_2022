public class WordOccurance {
    public String name;
    public int occurance;

    public WordOccurance(String name, int occurance) {
        this.name = name;
        this.occurance = occurance;
    }

    @Override
    public String toString() {
        return '\n' +
                "name='" + name + '\'' +
                ", occurance=" + occurance ;
    }
}
