import com.codegym.CollectionUtils;

import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{
    @Override
    public int findMax(Set<Integer> numbers) {
        CollectionUtils collectionUtils=new CollectionUtils();
        List<Integer> numberList= (List<Integer>) numbers;
        return collectionUtils.findMax(numberList);
    }
}
