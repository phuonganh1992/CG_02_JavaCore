public class Document {
    private String st;

    public Document() {
    }

    public Document(String st) {
        this.st = st;
    }
    public void standarlizeString(){
        this.st=st.trim();
        while (st.indexOf("  ")!=-1) st=st.replaceAll("  "," ");
    }
    public int countWord(){
        standarlizeString();
        String[] word=st.split(" ");
        return word.length;
    }
    public int counChar(){
        standarlizeString();
        String[] word=st.split(" ");
        int count=0;
        for (int i = 0; i < word.length; i++) {
            count+=word[i].length();
        }
        return count;
    }
}
