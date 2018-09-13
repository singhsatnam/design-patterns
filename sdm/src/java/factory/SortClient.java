package src.java.factory;

public class SortClient
{
    public void createSort(AbstractSortFactory sortFactory)
    {
        ISort sortObj = sortFactory.getSort();
        sortObj.sort();
    }
    public static void main(String args[])
    {
        SortClient sortClient = new SortClient();
        AbstractSortFactory sortFactory = null;
        //String choice = "MS";
        String choice = "BS";
        if(choice.equals("MS"))
        {
            sortFactory = new MergeSortFactory();
        }
        else if(choice.equals("BS"))
        {
            sortFactory = new BubbleSortFactory();
        }
        sortClient.createSort(sortFactory);
    }
}
