import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy strategy;
    private List<String> items=new ArrayList<>();

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public SortStrategy getStrategy() {
        return strategy;
    }

    public List<String> getItems() {
        return items;
    }

    public void add(String name){
        items.add(name);
    }

    public void sort(){
        strategy.sort(items);
    }
}
