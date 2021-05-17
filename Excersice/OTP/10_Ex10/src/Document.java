public class Document {
    private String st;

    public Document() {
    }

    public Document(String st) {
        this.st = st;
    }
    public int countWord(){
        String[] word=st.split(" ");
        return word.length;
    }
    public int counChar(){
        String[] word=st.split(" ");
        int count=0;
        for (int i = 0; i < word.length; i++) {
            count+=word[i].length();
        }
        return count;
    }
}
