package factory;

public class BubbleSortFactory implements AbstractSortFactory
{
// Should clean all the code to make it consistently formatted
    public ISort getSort() {
        BubbleSort sortObj = new BubbleSort();
        return sortObj;
    }
}
