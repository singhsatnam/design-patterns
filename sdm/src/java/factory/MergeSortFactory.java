package src.java.factory;

public class MergeSortFactory implements AbstractSortFactory
{

    public ISort getSort() {
        MergeSort sortObj = new MergeSort();
        return sortObj;
    }
}
