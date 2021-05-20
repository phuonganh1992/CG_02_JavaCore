import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardBookManager {
    private List<CardBook> cardBooks;

    public CardBookManager() {
        cardBooks=new ArrayList<>();
    }

    public List<CardBook> getCardBooks() {
        return cardBooks;
    }

    public void setCardBooks(List<CardBook> cardBooks) {
        this.cardBooks = cardBooks;
    }
    public void add(CardBook cardBook){
        this.cardBooks.add(cardBook);
    }
    public void display(){
        for (int i = 0; i < cardBooks.size(); i++) {
            System.out.println(cardBooks.get(i));
        }
        System.out.println("-----------------------------------------------------------------------");
    }
    public int findByCodeCard(String codeCard){
        for (int i = 0; i < cardBooks.size(); i++) {
            if(cardBooks.get(i).getCodeCard().equals(codeCard)) return i;
        }
        return -1;
    }
    public CardBook research(String codeCard){
        int index=findByCodeCard(codeCard);
        if(index==-1) return null;
        else return cardBooks.get(index);
    }

    public void edit(String codeCard, CardBook cardBook){
        int index=findByCodeCard(codeCard);
        if(index==-1) System.out.println("Find no book with codeCard as above, pls re-input");
        else cardBooks.set(index,cardBook);
    }
    public void delete(String codeCard){
        int index=findByCodeCard(codeCard);
        if(index==-1) System.out.println("Find no book with codeCard as above, pls re-input");
        else cardBooks.remove(index);
    }
    public void sortByCodeCard(){
        Collections.sort(cardBooks, new Comparator<CardBook>() {
            @Override
            public int compare(CardBook o1, CardBook o2) {
                return o1.getCodeCard().compareTo(o2.getCodeCard());
            }
        });
    }


}
