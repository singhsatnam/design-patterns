package src.java.factory;

public class BubbleSortFactory implements AbstractSortFactory
{

    public ISort getSort() {
        BubbleSort sortObj = new BubbleSort();
        return sortObj;
    }
}
